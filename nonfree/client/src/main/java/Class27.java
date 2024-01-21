import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!td;")
	private Class84 aClass84_4;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	private int anInt1266 = 0;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	private int anInt1270 = 0;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!rh;")
	private final Class76 aClass76_2;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!rh;)V")
	public Class27(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class76 arg1) throws IOException {
		this.aClass76_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI[B)V")
	public void method951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean59) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method952();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public void method952() {
		if (this.aBoolean59) {
			return;
		}
		synchronized (this) {
			this.aBoolean59 = true;
			this.notifyAll();
		}
		if (this.aClass84_4 != null) {
			while (this.aClass84_4.anInt3578 == 0) {
				Static52.method1025(1L);
			}
			if (this.aClass84_4.anInt3578 == 1) {
				try {
					((Thread) this.aClass84_4.anObject4).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass84_4 = null;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I")
	public int method954() throws IOException {
		return this.aBoolean59 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BII)V")
	public void method957(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean59) {
			return;
		}
		if (this.aBoolean60) {
			this.aBoolean60 = false;
			throw new IOException();
		}
		if (this.aByteArray6 == null) {
			this.aByteArray6 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray6[this.anInt1266] = arg0[local32];
				this.anInt1266 = (this.anInt1266 + 1) % 5000;
				if (this.anInt1266 == (this.anInt1270 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass84_4 == null) {
				this.aClass84_4 = this.aClass76_2.method2566(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt1266 == this.anInt1270) {
							if (this.aBoolean59) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1266 >= this.anInt1270) {
							local40 = this.anInt1266 - this.anInt1270;
						} else {
							local40 = 5000 - this.anInt1270;
						}
						local51 = this.anInt1270;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray6, local51, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean60 = true;
					}
					this.anInt1270 = (local40 + this.anInt1270) % 5000;
					try {
						if (this.anInt1270 == this.anInt1266) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean60 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray6 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static146.method2485(null, local118);
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)I")
	public int method959() throws IOException {
		return this.aBoolean59 ? 0 : this.anInputStream1.available();
	}
}
