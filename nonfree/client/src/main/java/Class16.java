import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class16 implements Runnable {

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!vc;")
	private Class207 aClass207_2;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	private int anInt520 = 0;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	private int anInt518 = 0;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "Lclient!de;")
	private final Class42 aClass42_2;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!de;)V")
	public Class16(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class42 arg1) throws IOException {
		this.aClass42_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method392();
	}

	@OriginalMember(owner = "client!as", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt520 == this.anInt518) {
							if (this.aBoolean26) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt518;
						if (this.anInt520 >= this.anInt518) {
							local44 = this.anInt520 - this.anInt518;
						} else {
							local44 = 5000 - this.anInt518;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray5, local28, local44);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean27 = true;
					}
					this.anInt518 = (this.anInt518 + local44) % 5000;
					try {
						if (this.anInt518 == this.anInt520) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean27 = true;
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
				this.aByteArray5 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static69.method1091(null, local123);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)I")
	public int method391() throws IOException {
		return this.aBoolean26 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
	public void method392() {
		if (this.aBoolean26) {
			return;
		}
		synchronized (this) {
			this.aBoolean26 = true;
			this.notifyAll();
		}
		if (this.aClass207_2 != null) {
			while (this.aClass207_2.anInt6346 == 0) {
				Static134.method2241(1L);
			}
			if (this.aClass207_2.anInt6346 == 1) {
				try {
					((Thread) this.aClass207_2.anObject7).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass207_2 = null;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
	public int method394() throws IOException {
		return this.aBoolean26 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public void method395() {
		if (!this.aBoolean26) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([BIII)V")
	public void method397(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean26) {
			return;
		}
		if (this.aBoolean27) {
			this.aBoolean27 = false;
			throw new IOException();
		}
		if (this.aByteArray5 == null) {
			this.aByteArray5 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray5[this.anInt520] = arg0[local37];
				this.anInt520 = (this.anInt520 + 1) % 5000;
				if ((this.anInt518 + 4900) % 5000 == this.anInt520) {
					throw new IOException();
				}
			}
			if (this.aClass207_2 == null) {
				this.aClass207_2 = this.aClass42_2.method972(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "([BIII)V")
	public void method398(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean26) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg1 += local23;
			arg2 -= local23;
		}
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
	public void method399() throws IOException {
		if (!this.aBoolean26 && this.aBoolean27) {
			this.aBoolean27 = false;
			throw new IOException();
		}
	}
}
