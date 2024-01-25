import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class114 implements Runnable {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "Lclient!mg;")
	private Class159 aClass159_4;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	private int anInt2822 = 0;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
	private int anInt2827 = 0;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Lclient!ci;")
	private final Class42 aClass42_3;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class96("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ci;)V")
	public Class114(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class42 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass42_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!hu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2827 == this.anInt2822) {
							if (this.aBoolean224) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2827;
						if (this.anInt2827 > this.anInt2822) {
							local43 = 5000 - this.anInt2827;
						} else {
							local43 = this.anInt2822 - this.anInt2827;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray29, local32, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean225 = true;
					}
					this.anInt2827 = (this.anInt2827 + local43) % 5000;
					try {
						if (this.anInt2822 == this.anInt2827) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean225 = true;
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
				this.aByteArray29 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static101.method1630(null, local123);
		}
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
	public void method2492() {
		if (!this.aBoolean224) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[BII)V")
	public void method2493(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean224) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg0 += local14;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I")
	public int method2495() throws IOException {
		return this.aBoolean224 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	public void method2496() {
		if (this.aBoolean224) {
			return;
		}
		synchronized (this) {
			this.aBoolean224 = true;
			this.notifyAll();
		}
		if (this.aClass159_4 != null) {
			while (this.aClass159_4.anInt4271 == 0) {
				Static366.method5214(1L);
			}
			if (this.aClass159_4.anInt4271 == 1) {
				try {
					((Thread) this.aClass159_4.anObject8).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass159_4 = null;
	}

	@OriginalMember(owner = "client!hu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2496();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[BB)V")
	public void method2497(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean224) {
			return;
		}
		if (this.aBoolean225) {
			this.aBoolean225 = false;
			throw new IOException();
		}
		if (this.aByteArray29 == null) {
			this.aByteArray29 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray29[this.anInt2822] = arg1[local32];
				this.anInt2822 = (this.anInt2822 + 1) % 5000;
				if (this.anInt2822 == (this.anInt2827 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass159_4 == null) {
				this.aClass159_4 = this.aClass42_3.method653(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V")
	public void method2498() throws IOException {
		if (!this.aBoolean224 && this.aBoolean225) {
			this.aBoolean225 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)I")
	public int method2499() throws IOException {
		return this.aBoolean224 ? 0 : this.anInputStream1.read();
	}
}
