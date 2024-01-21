import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!eb;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	private int anInt2029 = 0;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "I")
	private int anInt2037 = 0;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!ba;")
	private final Class8 aClass8_2;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ba;)V")
	public Class47(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class8 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass8_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	public int method1375() throws IOException {
		return this.aBoolean107 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt2029 == this.anInt2037) {
							if (this.aBoolean107) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt2037 < this.anInt2029) {
							local40 = 5000 - this.anInt2029;
						} else {
							local40 = this.anInt2037 - this.anInt2029;
						}
						local52 = this.anInt2029;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray28, local52, local40);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean108 = true;
					}
					this.anInt2029 = (this.anInt2029 + local40) % 5000;
					try {
						if (this.anInt2037 == this.anInt2029) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean108 = true;
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
				this.aByteArray28 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static92.method1674(local123, null);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI[B)V")
	public void method1377(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean107) {
			return;
		}
		if (this.aBoolean108) {
			this.aBoolean108 = false;
			throw new IOException();
		}
		if (this.aByteArray28 == null) {
			this.aByteArray28 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray28[this.anInt2037] = arg1[local38];
				this.anInt2037 = (this.anInt2037 + 1) % 5000;
				if (this.anInt2037 == (this.anInt2029 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass20_6 == null) {
				this.aClass20_6 = this.aClass8_2.method145(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public void method1378() {
		if (this.aBoolean107) {
			return;
		}
		synchronized (this) {
			this.aBoolean107 = true;
			this.notifyAll();
		}
		if (this.aClass20_6 != null) {
			while (this.aClass20_6.anInt931 == 0) {
				Static53.method2063(1L);
			}
			if (this.aClass20_6.anInt931 == 1) {
				try {
					((Thread) this.aClass20_6.anObject2).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass20_6 = null;
	}

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1378();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BI)V")
	public void method1379(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean107) {
			return;
		}
		while (arg0 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 -= local18;
			arg2 += local18;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
	public int method1380() throws IOException {
		return this.aBoolean107 ? 0 : this.anInputStream1.available();
	}
}
