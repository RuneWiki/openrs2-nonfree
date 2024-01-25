import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class348 implements Runnable {

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "Lclient!sfa;")
	private Class338 aClass338_8;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
	private int anInt9136 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	private int anInt9143 = 0;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "Z")
	private boolean aBoolean610 = false;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!br;")
	private final Class47 aClass47_7;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	private final int anInt9138;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!br;I)V")
	public Class348(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket1 = arg0;
		this.aClass47_7 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
		this.anInt9138 = arg2;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public void method7736() {
		if (!this.aBoolean609) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	public int method7737() throws IOException {
		return this.aBoolean609 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[BII)V")
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean609) {
			return;
		}
		if (this.aBoolean610) {
			this.aBoolean610 = false;
			throw new IOException();
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[this.anInt9138];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray89[this.anInt9136] = arg1[local37];
				this.anInt9136 = (this.anInt9136 + 1) % this.anInt9138;
				if (this.anInt9136 == (this.anInt9138 + this.anInt9143 - 100) % this.anInt9138) {
					throw new IOException();
				}
			}
			if (this.aClass338_8 == null) {
				this.aClass338_8 = this.aClass47_7.method1394(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public void method7739() throws IOException {
		if (!this.aBoolean609 && this.aBoolean610) {
			this.aBoolean610 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ss", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7741();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([BIII)V")
	public void method7740(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean609) {
			return;
		}
		while (arg1 > 0) {
			@Pc(17) int local17 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local17 <= 0) {
				throw new EOFException();
			}
			arg1 -= local17;
			arg2 += local17;
		}
		if (-2632 != -2632) {
			this.aByteArray89 = null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
	public void method7741() {
		if (this.aBoolean609) {
			return;
		}
		synchronized (this) {
			this.aBoolean609 = true;
			this.notifyAll();
		}
		if (this.aClass338_8 != null) {
			while (this.aClass338_8.anInt8934 == 0) {
				Static550.method7219(1L);
			}
			if (this.aClass338_8.anInt8934 == 1) {
				try {
					((Thread) this.aClass338_8.anObject16).join();
				} catch (@Pc(69) InterruptedException local69) {
				}
			}
		}
		this.aClass338_8 = null;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)I")
	public int method7742() throws IOException {
		return this.aBoolean609 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ss", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt9143 == this.anInt9136) {
							if (this.aBoolean609) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt9143;
						if (this.anInt9136 >= this.anInt9143) {
							local43 = this.anInt9136 - this.anInt9143;
						} else {
							local43 = this.anInt9138 - this.anInt9143;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray89, local28, local43);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean610 = true;
					}
					this.anInt9143 = (this.anInt9143 + local43) % this.anInt9138;
					try {
						if (this.anInt9136 == this.anInt9143) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean610 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(125) IOException local125) {
				}
				this.aByteArray89 = null;
				break;
			}
		} catch (@Pc(130) Exception local130) {
			Static275.method4893((String) null, local130);
		}
	}
}
