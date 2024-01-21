import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!jc;")
	private Class34 aClass34_6;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	private int anInt2956 = 0;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	private int anInt2959 = 0;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!w;")
	private final Class79 aClass79_3;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!w;)V")
	public Class74(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class79 arg1) throws IOException {
		this.aClass79_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method2047() {
		if (this.aBoolean233) {
			return;
		}
		synchronized (this) {
			this.aBoolean233 = true;
			this.notifyAll();
		}
		if (this.aClass34_6 != null) {
			while (this.aClass34_6.anInt1567 == 0) {
				Static96.method1616(1L);
			}
			if (this.aClass34_6.anInt1567 == 1) {
				try {
					((Thread) this.aClass34_6.anObject2).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass34_6 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
	public int method2048() throws IOException {
		return this.aBoolean233 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BZI)V")
	public void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean233) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg2 -= local19;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	public int method2051() throws IOException {
		return this.aBoolean233 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BI)V")
	public void method2055(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean233) {
			return;
		}
		if (this.aBoolean235) {
			this.aBoolean235 = false;
			throw new IOException();
		}
		if (this.aByteArray93 == null) {
			this.aByteArray93 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				this.aByteArray93[this.anInt2959] = arg0[local40];
				this.anInt2959 = (this.anInt2959 + 1) % 5000;
				if (this.anInt2959 == (this.anInt2956 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass34_6 == null) {
				this.aClass34_6 = this.aClass79_3.method2087(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(37) int local37;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt2959 == this.anInt2956) {
							if (this.aBoolean233) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2959 >= this.anInt2956) {
							local37 = this.anInt2959 - this.anInt2956;
						} else {
							local37 = 5000 - this.anInt2956;
						}
						local47 = this.anInt2956;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray93, local47, local37);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean235 = true;
					}
					this.anInt2956 = (this.anInt2956 + local37) % 5000;
					try {
						if (this.anInt2956 == this.anInt2959) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean235 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray93 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static95.method2004(null, local121);
		}
	}

	@OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2047();
	}
}
