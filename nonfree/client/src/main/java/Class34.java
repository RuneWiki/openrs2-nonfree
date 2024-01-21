import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!ie;")
	private Class32 aClass32_7;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	private int anInt1599 = 0;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	private int anInt1597 = 0;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!bb;")
	private final Class7 aClass7_3;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!bb;)V")
	public Class34(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class7 arg1) throws IOException {
		this.aClass7_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z[BII)V")
	public void method1098(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean67) {
			return;
		}
		if (this.aBoolean66) {
			this.aBoolean66 = false;
			throw new IOException();
		}
		if (this.aByteArray10 == null) {
			this.aByteArray10 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray10[this.anInt1597] = arg0[local38];
				this.anInt1597 = (this.anInt1597 + 1) % 5000;
				if ((this.anInt1599 + 4900) % 5000 == this.anInt1597) {
					throw new IOException();
				}
			}
			if (this.aClass32_7 == null) {
				this.aClass32_7 = this.aClass7_3.method285(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt1597 == this.anInt1599) {
							if (this.aBoolean67) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1599 > this.anInt1597) {
							local36 = 5000 - this.anInt1599;
						} else {
							local36 = this.anInt1597 - this.anInt1599;
						}
						local48 = this.anInt1599;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray10, local48, local36);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean66 = true;
					}
					this.anInt1599 = (this.anInt1599 + local36) % 5000;
					try {
						if (this.anInt1597 == this.anInt1599) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean66 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray10 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static93.method1709(local122, null);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
	public int method1100() throws IOException {
		return this.aBoolean67 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1104();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BZ)V")
	public void method1102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean67) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)I")
	public int method1103() throws IOException {
		return this.aBoolean67 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	public void method1104() {
		if (this.aBoolean67) {
			return;
		}
		synchronized (this) {
			this.aBoolean67 = true;
			this.notifyAll();
		}
		if (this.aClass32_7 != null) {
			while (this.aClass32_7.anInt1494 == 0) {
				Static13.method399(1L);
			}
			if (this.aClass32_7.anInt1494 == 1) {
				try {
					((Thread) this.aClass32_7.anObject4).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass32_7 = null;
	}
}
