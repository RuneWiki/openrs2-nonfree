import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class173 implements Runnable {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!ts;")
	private Class193 aClass193_6;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	private int anInt5633 = 0;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
	private int anInt5627 = 0;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Z")
	private boolean aBoolean509 = false;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "Lclient!rd;")
	private final Class168 aClass168_4;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!rd;)V")
	public Class173(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class168 arg1) throws IOException {
		this.aClass168_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!rr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt5633 == this.anInt5627) {
							if (this.aBoolean508) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt5633;
						if (this.anInt5627 < this.anInt5633) {
							local43 = 5000 - this.anInt5633;
						} else {
							local43 = this.anInt5627 - this.anInt5633;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray63, local32, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean509 = true;
					}
					this.anInt5633 = (this.anInt5633 + local43) % 5000;
					try {
						if (this.anInt5627 == this.anInt5633) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean509 = true;
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
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray63 = null;
				return;
			}
		} catch (@Pc(120) Exception local120) {
			Static69.method1566(null, local120);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[BII)V")
	public void method5020(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean508) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg2 -= local19;
			arg1 += local19;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBI[B)V")
	public void method5021(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean508) {
			return;
		}
		if (this.aBoolean509) {
			this.aBoolean509 = false;
			throw new IOException();
		}
		if (this.aByteArray63 == null) {
			this.aByteArray63 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray63[this.anInt5627] = arg1[local40];
				this.anInt5627 = (this.anInt5627 + 1) % 5000;
				if ((this.anInt5633 + 4900) % 5000 == this.anInt5627) {
					throw new IOException();
				}
			}
			if (this.aClass193_6 == null) {
				this.aClass193_6 = this.aClass168_4.method4856(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public void method5022() throws IOException {
		if (!this.aBoolean508 && this.aBoolean509) {
			this.aBoolean509 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
	public int method5024() throws IOException {
		return this.aBoolean508 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public void method5025() {
		if (!this.aBoolean508) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	public void method5027() {
		if (this.aBoolean508) {
			return;
		}
		synchronized (this) {
			this.aBoolean508 = true;
			this.notifyAll();
		}
		if (this.aClass193_6 != null) {
			while (this.aClass193_6.anInt6293 == 0) {
				Static102.method2276(1L);
			}
			if (this.aClass193_6.anInt6293 == 1) {
				try {
					((Thread) this.aClass193_6.anObject7).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass193_6 = null;
	}

	@OriginalMember(owner = "client!rr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5027();
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)I")
	public int method5028() throws IOException {
		return this.aBoolean508 ? 0 : this.anInputStream1.read();
	}
}
