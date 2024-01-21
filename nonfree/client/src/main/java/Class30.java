import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!bd;")
	private Class10 aClass10_4;

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	private int anInt1130 = 0;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
	private int anInt1138 = 0;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "Lclient!vf;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vf;)V")
	public Class30(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class80 arg1) throws IOException {
		this.aClass80_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public int method771() throws IOException {
		return this.aBoolean36 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1138 == this.anInt1130) {
							if (this.aBoolean36) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1130;
						if (this.anInt1138 < this.anInt1130) {
							local43 = 5000 - this.anInt1130;
						} else {
							local43 = this.anInt1138 - this.anInt1130;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray20, local28, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean35 = true;
					}
					this.anInt1130 = (this.anInt1130 + local43) % 5000;
					try {
						if (this.anInt1130 == this.anInt1138) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean35 = true;
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
				this.aByteArray20 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static21.method462(null, local123);
		}
	}

	@OriginalMember(owner = "client!gf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method779();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIBI)V")
	public void method773(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean36) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg1 += local18;
			arg2 -= local18;
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
	public int method777() throws IOException {
		return this.aBoolean36 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public void method779() {
		if (this.aBoolean36) {
			return;
		}
		synchronized (this) {
			this.aBoolean36 = true;
			this.notifyAll();
		}
		if (this.aClass10_4 != null) {
			while (this.aClass10_4.anInt242 == 0) {
				Static118.method1893(1L);
			}
			if (this.aClass10_4.anInt242 == 1) {
				try {
					((Thread) this.aClass10_4.anObject1).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass10_4 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[BII)V")
	public void method780(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean36) {
			return;
		}
		if (this.aBoolean35) {
			this.aBoolean35 = false;
			throw new IOException();
		}
		if (this.aByteArray20 == null) {
			this.aByteArray20 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray20[this.anInt1138] = arg0[local38];
				this.anInt1138 = (this.anInt1138 + 1) % 5000;
				if (this.anInt1138 == (this.anInt1130 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass10_4 == null) {
				this.aClass10_4 = this.aClass80_1.method2040(this, 3);
			}
			this.notifyAll();
		}
	}
}
