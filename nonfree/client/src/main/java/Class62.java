import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class62 implements Runnable {

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!jb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	private int anInt1920 = 0;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	private int anInt1928 = 0;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!de;")
	private final Class15 aClass15_43;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!de;)V")
	public Class62(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class15 arg1) throws IOException {
		this.aClass15_43 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)V")
	public void method1343(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean77) {
			return;
		}
		if (this.aBoolean78) {
			this.aBoolean78 = false;
			throw new IOException();
		}
		if (this.aByteArray22 == null) {
			this.aByteArray22 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray22[this.anInt1920] = arg1[local32];
				this.anInt1920 = (this.anInt1920 + 1) % 5000;
				if (this.anInt1920 == (this.anInt1928 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass37_7 == null) {
				this.aClass37_7 = this.aClass15_43.method463(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BII)V")
	public void method1345(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean77) {
			return;
		}
		while (arg1 > 0) {
			@Pc(26) int local26 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local26 <= 0) {
				throw new EOFException();
			}
			arg1 -= local26;
			arg2 += local26;
		}
	}

	@OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt1920 == this.anInt1928) {
							if (this.aBoolean77) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt1928;
						if (this.anInt1920 >= this.anInt1928) {
							local40 = this.anInt1920 - this.anInt1928;
						} else {
							local40 = 5000 - this.anInt1928;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray22, local24, local40);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean78 = true;
					}
					this.anInt1928 = (this.anInt1928 + local40) % 5000;
					try {
						if (this.anInt1920 == this.anInt1928) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean78 = true;
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
				this.aByteArray22 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static29.method518(null, local118);
		}
	}

	@OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1347();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public void method1347() {
		if (this.aBoolean77) {
			return;
		}
		synchronized (this) {
			this.aBoolean77 = true;
			this.notifyAll();
		}
		if (this.aClass37_7 != null) {
			while (this.aClass37_7.anInt1337 == 0) {
				Static80.method1260(1L);
			}
			if (this.aClass37_7.anInt1337 == 1) {
				try {
					((Thread) this.aClass37_7.anObject3).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass37_7 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I")
	public int method1348() throws IOException {
		return this.aBoolean77 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)I")
	public int method1350() throws IOException {
		return this.aBoolean77 ? 0 : this.anInputStream1.available();
	}
}
