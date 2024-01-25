import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class365 implements Runnable {

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Lclient!jt;")
	private Class159 aClass159_10;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
	private int anInt10406 = 0;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Z")
	private boolean aBoolean824 = false;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "Z")
	private boolean aBoolean825 = false;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
	private int anInt10409 = 0;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!fl;")
	private final Class104 aClass104_5;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	private final int anInt10399;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!fl;I)V")
	public Class365(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass104_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt10399 = arg2;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
	public int method8457() throws IOException {
		return this.aBoolean825 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	public void method8458() throws IOException {
		if (!this.aBoolean825 && this.aBoolean824) {
			this.aBoolean824 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)I")
	public int method8460() throws IOException {
		return this.aBoolean825 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII[B)V")
	public void method8462(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean825) {
			return;
		}
		if (this.aBoolean824) {
			this.aBoolean824 = false;
			throw new IOException();
		}
		if (this.aByteArray105 == null) {
			this.aByteArray105 = new byte[this.anInt10399];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				this.aByteArray105[this.anInt10406] = arg1[local33];
				this.anInt10406 = (this.anInt10406 + 1) % this.anInt10399;
				if (this.anInt10406 == (this.anInt10409 + this.anInt10399 - 100) % this.anInt10399) {
					throw new IOException();
				}
			}
			if (this.aClass159_10 == null) {
				this.aClass159_10 = this.aClass104_5.method3127(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZI[B)V")
	public void method8463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean825) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream2.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V")
	public void method8464() {
		if (!this.aBoolean825) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!vt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8465();
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)V")
	public void method8465() {
		if (this.aBoolean825) {
			return;
		}
		synchronized (this) {
			this.aBoolean825 = true;
			this.notifyAll();
		}
		if (this.aClass159_10 != null) {
			while (this.aClass159_10.anInt5910 == 0) {
				Static344.method5698(1L);
			}
			if (this.aClass159_10.anInt5910 == 1) {
				try {
					((Thread) this.aClass159_10.anObject13).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass159_10 = null;
	}

	@OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(48) int local48;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt10406 == this.anInt10409) {
							if (this.aBoolean825) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt10409;
						if (this.anInt10406 < this.anInt10409) {
							local48 = this.anInt10399 - this.anInt10409;
						} else {
							local48 = this.anInt10406 - this.anInt10409;
						}
					}
					if (local48 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray105, local32, local48);
					} catch (@Pc(76) IOException local76) {
						this.aBoolean824 = true;
					}
					this.anInt10409 = (local48 + this.anInt10409) % this.anInt10399;
					try {
						if (this.anInt10406 == this.anInt10409) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(102) IOException local102) {
						this.aBoolean824 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(126) IOException local126) {
				}
				this.aByteArray105 = null;
				return;
			}
		} catch (@Pc(131) Exception local131) {
			Static358.method5809(local131, (String) null);
		}
	}
}
