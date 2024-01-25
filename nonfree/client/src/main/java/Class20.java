import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Lclient!mba;")
	private Class230 aClass230_1;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	private int anInt256 = 0;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	private int anInt260 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!iha;")
	private final Class173 aClass173_1;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	private final int anInt248;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!iha;I)V")
	public Class20(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass173_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
		this.anInt248 = arg2;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
	public int method288() throws IOException {
		return this.aBoolean21 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[BZ)V")
	public void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean21) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 -= local20;
			arg1 += local20;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I")
	public int method290() throws IOException {
		return this.aBoolean21 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!am", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(45) int local45;
					@Pc(57) int local57;
					synchronized (this) {
						if (this.anInt256 == this.anInt260) {
							if (this.aBoolean21) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt256 >= this.anInt260) {
							local45 = this.anInt256 - this.anInt260;
						} else {
							local45 = this.anInt248 - this.anInt260;
						}
						local57 = this.anInt260;
					}
					if (local45 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray3, local57, local45);
					} catch (@Pc(79) IOException local79) {
						this.aBoolean20 = true;
					}
					this.anInt260 = (this.anInt260 + local45) % this.anInt248;
					try {
						if (this.anInt260 == this.anInt256) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(102) IOException local102) {
						this.aBoolean20 = true;
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
				} catch (@Pc(130) IOException local130) {
				}
				this.aByteArray3 = null;
				return;
			}
		} catch (@Pc(135) Exception local135) {
			Static629.method8829((String) null, local135);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public void method291() {
		if (this.aBoolean21) {
			return;
		}
		synchronized (this) {
			this.aBoolean21 = true;
			this.notifyAll();
		}
		if (this.aClass230_1 != null) {
			while (this.aClass230_1.anInt6256 == 0) {
				Static548.method7968(1L);
			}
			if (this.aClass230_1.anInt6256 == 1) {
				try {
					((Thread) this.aClass230_1.anObject12).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass230_1 = null;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public void method293() {
		if (!this.aBoolean21) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[BI)V")
	public void method295(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean21) {
			return;
		}
		if (this.aBoolean20) {
			this.aBoolean20 = false;
			throw new IOException();
		}
		if (this.aByteArray3 == null) {
			this.aByteArray3 = new byte[this.anInt248];
		}
		synchronized (this) {
			for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
				this.aByteArray3[this.anInt256] = arg1[local35];
				this.anInt256 = (this.anInt256 + 1) % this.anInt248;
				if (this.anInt256 == (this.anInt248 + this.anInt260 - 100) % this.anInt248) {
					throw new IOException();
				}
			}
			if (this.aClass230_1 == null) {
				this.aClass230_1 = this.aClass173_1.method4250(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method291();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public void method297() throws IOException {
		if (!this.aBoolean21 && this.aBoolean20) {
			this.aBoolean20 = false;
			throw new IOException();
		}
	}
}
