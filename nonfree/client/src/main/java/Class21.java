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
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "Lclient!gg;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	private int anInt1541 = 0;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	private int anInt1550 = 0;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!od;")
	private final Class53 aClass53_1;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!od;)V")
	public Class21(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class53 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass53_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1550 == this.anInt1541) {
							if (this.aBoolean59) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1541;
						if (this.anInt1541 <= this.anInt1550) {
							local40 = this.anInt1550 - this.anInt1541;
						} else {
							local40 = 5000 - this.anInt1541;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray13, local28, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean60 = true;
					}
					this.anInt1541 = (local40 + this.anInt1541) % 5000;
					try {
						if (this.anInt1550 == this.anInt1541) {
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
				this.aByteArray13 = null;
				return;
			}
		} catch (@Pc(118) Exception local118) {
			Static15.method266(null, local118);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB[BI)V")
	public void method1024(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean59) {
			return;
		}
		if (this.aBoolean60) {
			this.aBoolean60 = false;
			throw new IOException();
		}
		if (this.aByteArray13 == null) {
			this.aByteArray13 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray13[this.anInt1550] = arg0[local37];
				this.anInt1550 = (this.anInt1550 + 1) % 5000;
				if (this.anInt1550 == (this.anInt1541 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass26_1 == null) {
				this.aClass26_1 = this.aClass53_1.method2271(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)I")
	public int method1025() throws IOException {
		return this.aBoolean59 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1029();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	public int method1026() throws IOException {
		return this.aBoolean59 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
	public void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean59) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 -= local19;
			arg1 += local19;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public void method1029() {
		if (this.aBoolean59) {
			return;
		}
		synchronized (this) {
			this.aBoolean59 = true;
			this.notifyAll();
		}
		if (this.aClass26_1 != null) {
			while (this.aClass26_1.anInt1788 == 0) {
				Static114.method2304(1L);
			}
			if (this.aClass26_1.anInt1788 == 1) {
				try {
					((Thread) this.aClass26_1.anObject2).join();
				} catch (@Pc(52) InterruptedException local52) {
				}
			}
		}
		this.aClass26_1 = null;
	}
}
