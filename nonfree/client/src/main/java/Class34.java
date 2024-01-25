import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "Lclient!jv;")
	private Class138 aClass138_1;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
	private int anInt707 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
	private int anInt720 = 0;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "Lclient!dr;")
	private final Class59 aClass59_1;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!bw", name = "B", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!dr;)V")
	public Class34(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class59 arg1) throws IOException {
		this.aClass59_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public void method602() throws IOException {
		if (!this.aBoolean40 && this.aBoolean41) {
			this.aBoolean41 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!bw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method610();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[BIB)V")
	public void method604(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean40) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 -= local18;
			arg0 += local18;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI[BI)V")
	public void method606(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean40) {
			return;
		}
		if (this.aBoolean41) {
			this.aBoolean41 = false;
			throw new IOException();
		}
		if (this.aByteArray18 == null) {
			this.aByteArray18 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray18[this.anInt707] = arg1[local38];
				this.anInt707 = (this.anInt707 + 1) % 5000;
				if ((this.anInt720 + 4900) % 5000 == this.anInt707) {
					throw new IOException();
				}
			}
			if (this.aClass138_1 == null) {
				this.aClass138_1 = this.aClass59_1.method1372(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	public void method610() {
		if (this.aBoolean40) {
			return;
		}
		synchronized (this) {
			this.aBoolean40 = true;
			this.notifyAll();
		}
		if (this.aClass138_1 != null) {
			while (this.aClass138_1.anInt3723 == 0) {
				Static81.method1477(1L);
			}
			if (this.aClass138_1.anInt3723 == 1) {
				try {
					((Thread) this.aClass138_1.anObject7).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass138_1 = null;
	}

	@OriginalMember(owner = "client!bw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(35) int local35;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt707 == this.anInt720) {
							if (this.aBoolean40) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt707 < this.anInt720) {
							local35 = 5000 - this.anInt720;
						} else {
							local35 = this.anInt707 - this.anInt720;
						}
						local47 = this.anInt720;
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray18, local47, local35);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean41 = true;
					}
					this.anInt720 = (local35 + this.anInt720) % 5000;
					try {
						if (this.anInt707 == this.anInt720) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean41 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray18 = null;
				return;
			}
		} catch (@Pc(114) Exception local114) {
			Static361.method4904(local114, null);
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
	public void method612() {
		if (!this.aBoolean40) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
	public int method613() throws IOException {
		return this.aBoolean40 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)I")
	public int method615() throws IOException {
		return this.aBoolean40 ? 0 : this.anInputStream1.read();
	}
}
