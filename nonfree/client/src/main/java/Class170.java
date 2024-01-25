import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class170 implements Runnable {

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "[Lclient!eba;")
	public static final Class98[] aClass98Array1 = new Class98[5];

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "Lclient!vd;")
	private Class366 aClass366_3;

	@OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
	private int anInt4267 = 0;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	private int anInt4270 = 0;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!iea", name = "v", descriptor = "Z")
	private boolean aBoolean336 = false;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "Lclient!mca;")
	private final Class230 aClass230_2;

	@OriginalMember(owner = "client!iea", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
	private final int anInt4278;

	static {
		for (@Pc(91) int local91 = 0; local91 < aClass98Array1.length; local91++) {
			aClass98Array1[local91] = new Class98();
		}
	}

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!mca;I)V")
	public Class170(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass230_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
		this.anInt4278 = arg2;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public void method3637() {
		if (this.aBoolean336) {
			return;
		}
		synchronized (this) {
			this.aBoolean336 = true;
			this.notifyAll();
		}
		if (this.aClass366_3 != null) {
			while (this.aClass366_3.anInt10206 == 0) {
				Static351.method5279(1L);
			}
			if (this.aClass366_3.anInt10206 == 1) {
				try {
					((Thread) this.aClass366_3.anObject18).join();
				} catch (@Pc(69) InterruptedException local69) {
				}
			}
		}
		this.aClass366_3 = null;
	}

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)I")
	public int method3638() throws IOException {
		return this.aBoolean336 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)V")
	public void method3639() throws IOException {
		if (!this.aBoolean336 && this.aBoolean335) {
			this.aBoolean335 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)I")
	public int method3640() throws IOException {
		return this.aBoolean336 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[BIB)V")
	public void method3641(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean336) {
			return;
		}
		if (this.aBoolean335) {
			this.aBoolean335 = false;
			throw new IOException();
		}
		if (this.aByteArray25 == null) {
			this.aByteArray25 = new byte[this.anInt4278];
		}
		synchronized (this) {
			for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
				this.aByteArray25[this.anInt4270] = arg0[local42];
				this.anInt4270 = (this.anInt4270 + 1) % this.anInt4278;
				if (this.anInt4270 == (this.anInt4278 + this.anInt4267 - 100) % this.anInt4278) {
					throw new IOException();
				}
			}
			if (this.aClass366_3 == null) {
				this.aClass366_3 = this.aClass230_2.method5358(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "([BIZI)V")
	public void method3642(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean336) {
			return;
		}
		while (arg1 > 0) {
			@Pc(17) int local17 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local17 <= 0) {
				throw new EOFException();
			}
			arg1 -= local17;
			arg2 += local17;
		}
		if (false) {
			Static248.method3643(-105, (byte) 67, 54);
		}
	}

	@OriginalMember(owner = "client!iea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3637();
	}

	@OriginalMember(owner = "client!iea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(39) int local39;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt4270 == this.anInt4267) {
							if (this.aBoolean336) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt4267;
						if (this.anInt4270 >= this.anInt4267) {
							local39 = this.anInt4270 - this.anInt4267;
						} else {
							local39 = this.anInt4278 - this.anInt4267;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray25, local28, local39);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean335 = true;
					}
					this.anInt4267 = (local39 + this.anInt4267) % this.anInt4278;
					try {
						if (this.anInt4270 == this.anInt4267) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean335 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray25 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static405.method5934((String) null, local126);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
	public void method3644() {
		if (!this.aBoolean336) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}
}
