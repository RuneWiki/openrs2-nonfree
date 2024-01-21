import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Lclient!fd;")
	private Class25 aClass25_35;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	private int anInt3680 = 0;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
	private int anInt3683 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!t;")
	private final Class81 aClass81_4;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!t;)V")
	public Class66(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class81 arg1) throws IOException {
		this.aClass81_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	public void method2834() {
		if (this.aBoolean141) {
			return;
		}
		synchronized (this) {
			this.aBoolean141 = true;
			this.notifyAll();
		}
		if (this.aClass25_35 != null) {
			while (this.aClass25_35.anInt1695 == 0) {
				Static85.method1993(1L);
			}
			if (this.aClass25_35.anInt1695 == 1) {
				try {
					((Thread) this.aClass25_35.anObject2).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass25_35 = null;
	}

	@OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2834();
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
	public int method2835() throws IOException {
		return this.aBoolean141 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BII)V")
	public void method2838(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean141) {
			return;
		}
		if (this.aBoolean140) {
			this.aBoolean140 = false;
			throw new IOException();
		}
		if (this.aByteArray41 == null) {
			this.aByteArray41 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray41[this.anInt3683] = arg0[local32];
				this.anInt3683 = (this.anInt3683 + 1) % 5000;
				if ((this.anInt3680 + 4900) % 5000 == this.anInt3683) {
					throw new IOException();
				}
			}
			if (this.aClass25_35 == null) {
				this.aClass25_35 = this.aClass81_4.method3153(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB[BI)V")
	public void method2839(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean141) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg0 -= local22;
			arg2 += local22;
		}
	}

	@OriginalMember(owner = "client!ph", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(41) int local41;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt3683 == this.anInt3680) {
							if (this.aBoolean141) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt3680 <= this.anInt3683) {
							local41 = this.anInt3683 - this.anInt3680;
						} else {
							local41 = 5000 - this.anInt3680;
						}
						local51 = this.anInt3680;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray41, local51, local41);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean140 = true;
					}
					this.anInt3680 = (this.anInt3680 + local41) % 5000;
					try {
						if (this.anInt3680 == this.anInt3683) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean140 = true;
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
				this.aByteArray41 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static153.method2973(null, local118);
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
	public int method2841() throws IOException {
		return this.aBoolean141 ? 0 : this.anInputStream1.available();
	}
}
