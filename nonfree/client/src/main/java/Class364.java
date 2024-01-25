import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class364 implements Runnable {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "Lclient!kl;")
	private Class191 aClass191_15;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Z")
	private boolean aBoolean713 = false;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	private int anInt9660 = 0;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Z")
	private boolean aBoolean714 = false;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
	private int anInt9664 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!laa;")
	private final Class198 aClass198_6;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
	private final int anInt9663;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!laa;I)V")
	public Class364(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass198_6 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt9663 = arg2;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I")
	public int method7845() throws IOException {
		return this.aBoolean714 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public void method7846() {
		if (!this.aBoolean714) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public void method7847() throws IOException {
		if (!this.aBoolean714 && this.aBoolean713) {
			this.aBoolean713 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt9664 == this.anInt9660) {
							if (this.aBoolean714) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt9664 < this.anInt9660) {
							local44 = this.anInt9663 - this.anInt9660;
						} else {
							local44 = this.anInt9664 - this.anInt9660;
						}
						local56 = this.anInt9660;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray103, local56, local44);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean713 = true;
					}
					this.anInt9660 = (this.anInt9660 + local44) % this.anInt9663;
					try {
						if (this.anInt9660 == this.anInt9664) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(99) IOException local99) {
						this.aBoolean713 = true;
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
				} catch (@Pc(123) IOException local123) {
				}
				this.aByteArray103 = null;
				return;
			}
		} catch (@Pc(128) Exception local128) {
			Static419.method5957(null, local128);
		}
	}

	@OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7851();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "([BIII)V")
	public void method7849(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean714) {
			return;
		}
		if (this.aBoolean713) {
			this.aBoolean713 = false;
			throw new IOException();
		}
		if (this.aByteArray103 == null) {
			this.aByteArray103 = new byte[this.anInt9663];
		}
		synchronized (this) {
			for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
				this.aByteArray103[this.anInt9664] = arg0[local31];
				this.anInt9664 = (this.anInt9664 + 1) % this.anInt9663;
				if (this.anInt9664 == (this.anInt9663 + this.anInt9660 - 100) % this.anInt9663) {
					throw new IOException();
				}
			}
			if (this.aClass191_15 == null) {
				this.aClass191_15 = this.aClass198_6.method4285(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "([BIII)V")
	public void method7850(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean714) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public void method7851() {
		if (this.aBoolean714) {
			return;
		}
		synchronized (this) {
			this.aBoolean714 = true;
			this.notifyAll();
		}
		if (this.aClass191_15 != null) {
			while (this.aClass191_15.anInt5014 == 0) {
				Static408.method5841(1L);
			}
			if (this.aClass191_15.anInt5014 == 1) {
				try {
					((Thread) this.aClass191_15.anObject11).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass191_15 = null;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
	public int method7852() throws IOException {
		return this.aBoolean714 ? 0 : this.anInputStream2.available();
	}
}
