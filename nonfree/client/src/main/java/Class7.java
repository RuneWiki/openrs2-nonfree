import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!mc;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	private int anInt115 = 0;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	private int anInt123 = 0;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!we;")
	private final Class77 aClass77_1;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!we;)V")
	public Class7(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class77 arg1) throws IOException {
		this.aClass77_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	public int method72() throws IOException {
		return this.aBoolean4 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public void method73() {
		if (this.aBoolean4) {
			return;
		}
		synchronized (this) {
			this.aBoolean4 = true;
			this.notifyAll();
		}
		if (this.aClass46_1 != null) {
			while (this.aClass46_1.anInt1964 == 0) {
				Static17.method318(1L);
			}
			if (this.aClass46_1.anInt1964 == 1) {
				try {
					((Thread) this.aClass46_1.anObject4).join();
				} catch (@Pc(49) InterruptedException local49) {
				}
			}
		}
		this.aClass46_1 = null;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)I")
	public int method74() throws IOException {
		return this.aBoolean4 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)V")
	public void method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean4) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB[B)V")
	public void method80(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean4) {
			return;
		}
		if (this.aBoolean5) {
			this.aBoolean5 = false;
			throw new IOException();
		}
		if (this.aByteArray3 == null) {
			this.aByteArray3 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray3[this.anInt115] = arg1[local37];
				this.anInt115 = (this.anInt115 + 1) % 5000;
				if ((this.anInt123 + 4900) % 5000 == this.anInt115) {
					throw new IOException();
				}
			}
			if (this.aClass46_1 == null) {
				this.aClass46_1 = this.aClass77_1.method2166(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!b", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt123 == this.anInt115) {
							if (this.aBoolean4) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt123;
						if (this.anInt115 < this.anInt123) {
							local43 = 5000 - this.anInt123;
						} else {
							local43 = this.anInt115 - this.anInt123;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray3, local28, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean5 = true;
					}
					this.anInt123 = (local43 + this.anInt123) % 5000;
					try {
						if (this.anInt115 == this.anInt123) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean5 = true;
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
				this.aByteArray3 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static53.method1609(null, local123);
		}
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method73();
	}
}
