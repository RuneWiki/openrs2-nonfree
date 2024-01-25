import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class76 implements Runnable {

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "Lclient!sw;")
	private Class309 aClass309_2;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
	private int anInt2613 = 0;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
	private int anInt2610 = 0;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "Lclient!k;")
	private final Class168 aClass168_3;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!k;)V")
	public Class76(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class168 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass168_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)I")
	public int method2185() throws IOException {
		return this.aBoolean185 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public void method2186() {
		if (!this.aBoolean185) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	public void method2187() throws IOException {
		if (!this.aBoolean185 && this.aBoolean186) {
			this.aBoolean186 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!dv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(42) int local42;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2613 == this.anInt2610) {
							if (this.aBoolean185) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2613;
						if (this.anInt2613 > this.anInt2610) {
							local42 = 5000 - this.anInt2613;
						} else {
							local42 = this.anInt2610 - this.anInt2613;
						}
					}
					if (local42 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray42, local32, local42);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean186 = true;
					}
					this.anInt2613 = (this.anInt2613 + local42) % 5000;
					try {
						if (this.anInt2613 == this.anInt2610) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean186 = true;
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
				this.aByteArray42 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static332.method1390(local122, null);
		}
	}

	@OriginalMember(owner = "client!dv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2193();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIIZ)V")
	public void method2191(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean185) {
			return;
		}
		if (this.aBoolean186) {
			this.aBoolean186 = false;
			throw new IOException();
		}
		if (this.aByteArray42 == null) {
			this.aByteArray42 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray42[this.anInt2610] = arg0[local38];
				this.anInt2610 = (this.anInt2610 + 1) % 5000;
				if (this.anInt2610 == (this.anInt2613 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass309_2 == null) {
				this.aClass309_2 = this.aClass168_3.method4091(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)I")
	public int method2192() throws IOException {
		return this.aBoolean185 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
	public void method2193() {
		if (this.aBoolean185) {
			return;
		}
		synchronized (this) {
			this.aBoolean185 = true;
			this.notifyAll();
		}
		if (this.aClass309_2 != null) {
			while (this.aClass309_2.anInt8650 == 0) {
				Static373.method5240(1L);
			}
			if (this.aClass309_2.anInt8650 == 1) {
				try {
					((Thread) this.aClass309_2.anObject15).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass309_2 = null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIII)V")
	public void method2194(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean185) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}
}
