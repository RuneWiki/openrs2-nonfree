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
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!b", name = "h", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!cc;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int anInt164 = 0;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	private int anInt167 = 0;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!dc;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!dc;)V")
	public Class6(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class17 arg1) throws IOException {
		this.aClass17_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
	public int method130() throws IOException {
		return this.aBoolean23 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BIIB)V")
	public void method133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean23) {
			return;
		}
		if (this.aBoolean22) {
			this.aBoolean22 = false;
			throw new IOException();
		}
		if (this.aByteArray2 == null) {
			this.aByteArray2 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray2[this.anInt164] = arg0[local38];
				this.anInt164 = (this.anInt164 + 1) % 5000;
				if (this.anInt164 == (this.anInt167 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass12_1 == null) {
				this.aClass12_1 = this.aClass17_1.method383(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BI)V")
	public void method134(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean23) {
			return;
		}
		while (arg2 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg2 -= local20;
			arg0 += local20;
		}
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method136();
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)I")
	public int method135() throws IOException {
		return this.aBoolean23 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!b", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt164 == this.anInt167) {
							if (this.aBoolean23) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt164 < this.anInt167) {
							local36 = 5000 - this.anInt167;
						} else {
							local36 = this.anInt164 - this.anInt167;
						}
						local48 = this.anInt167;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray2, local48, local36);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean22 = true;
					}
					this.anInt167 = (local36 + this.anInt167) % 5000;
					try {
						if (this.anInt167 == this.anInt164) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean22 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray2 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static91.method1588(local119, null);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public void method136() {
		if (this.aBoolean23) {
			return;
		}
		synchronized (this) {
			this.aBoolean23 = true;
			this.notifyAll();
		}
		if (this.aClass12_1 != null) {
			while (this.aClass12_1.anInt373 == 0) {
				Static46.method889(1L);
			}
			if (this.aClass12_1.anInt373 == 1) {
				try {
					((Thread) this.aClass12_1.anObject1).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass12_1 = null;
	}
}
