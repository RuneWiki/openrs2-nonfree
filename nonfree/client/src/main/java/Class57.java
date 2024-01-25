import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!qo;")
	private Class243 aClass243_2;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	private int anInt2178 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	private int anInt2183 = 0;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!lp;")
	private final Class182 aClass182_4;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!lp;)V")
	public Class57(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class182 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass182_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public void method2051() {
		if (this.aBoolean160) {
			return;
		}
		synchronized (this) {
			this.aBoolean160 = true;
			this.notifyAll();
		}
		if (this.aClass243_2 != null) {
			while (this.aClass243_2.anInt6905 == 0) {
				Static505.method7295(1L);
			}
			if (this.aClass243_2.anInt6905 == 1) {
				try {
					((Thread) this.aClass243_2.anObject12).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass243_2 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
	public int method2052() throws IOException {
		return this.aBoolean160 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2178 == this.anInt2183) {
							if (this.aBoolean160) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2178;
						if (this.anInt2178 <= this.anInt2183) {
							local44 = this.anInt2183 - this.anInt2178;
						} else {
							local44 = 5000 - this.anInt2178;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray23, local32, local44);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean159 = true;
					}
					this.anInt2178 = (local44 + this.anInt2178) % 5000;
					try {
						if (this.anInt2183 == this.anInt2178) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean159 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray23 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static41.method1359(local123, null);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I")
	public int method2053() throws IOException {
		return this.aBoolean160 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public void method2054() throws IOException {
		if (!this.aBoolean160 && this.aBoolean159) {
			this.aBoolean159 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)V")
	public void method2055(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean160) {
			return;
		}
		if (this.aBoolean159) {
			this.aBoolean159 = false;
			throw new IOException();
		}
		if (this.aByteArray23 == null) {
			this.aByteArray23 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray23[this.anInt2183] = arg1[local38];
				this.anInt2183 = (this.anInt2183 + 1) % 5000;
				if ((this.anInt2178 + 4900) % 5000 == this.anInt2183) {
					throw new IOException();
				}
			}
			if (this.aClass243_2 == null) {
				this.aClass243_2 = this.aClass182_4.method4799(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public void method2057() {
		if (!this.aBoolean160) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BII)V")
	public void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean160) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 += local18;
			arg2 -= local18;
		}
	}

	@OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2051();
	}
}
