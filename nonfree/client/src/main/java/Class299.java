import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class299 implements Runnable {

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	private int anInt7939 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	private int anInt7937 = 0;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	private final int anInt7938;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[B")
	private final byte[] aByteArray68;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class299(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt7938 = arg1 + 1;
		this.aByteArray68 = new byte[this.anInt7938];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!qs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt7937 > this.anInt7939) {
						local31 = this.anInt7938 + this.anInt7939 - this.anInt7937;
					} else {
						local31 = this.anInt7939 - this.anInt7937;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(45) InterruptedException local45) {
					}
				}
			}
			try {
				if (this.anInt7938 < this.anInt7937 + local31) {
					@Pc(71) int local71 = this.anInt7938 - this.anInt7937;
					this.anOutputStream2.write(this.aByteArray68, this.anInt7937, local71);
					this.anOutputStream2.write(this.aByteArray68, 0, local31 - local71);
				} else {
					this.anOutputStream2.write(this.aByteArray68, this.anInt7937, local31);
				}
			} catch (@Pc(100) IOException local100) {
				@Pc(100) IOException local100x = local100;
				synchronized (this) {
					this.anIOException2 = local100x;
					return;
				}
			}
			synchronized (this) {
				this.anInt7937 = (this.anInt7937 + local31) % this.anInt7938;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method6577() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method6578() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([BIII)V")
	public void method6580(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(57) int local57;
			if (this.anInt7937 <= this.anInt7939) {
				local57 = this.anInt7937 + this.anInt7938 - this.anInt7939 - 1;
			} else {
				local57 = this.anInt7937 - this.anInt7939 - 1;
			}
			if (local57 < arg1) {
				throw new IOException("");
			}
			if (arg1 + this.anInt7939 > this.anInt7938) {
				@Pc(94) int local94 = this.anInt7938 - this.anInt7939;
				Static681.method4034(arg0, 0, this.aByteArray68, this.anInt7939, local94);
				Static681.method4034(arg0, local94, this.aByteArray68, 0, arg1 - local94);
			} else {
				Static681.method4034(arg0, 0, this.aByteArray68, this.anInt7939, arg1);
			}
			this.anInt7939 = (this.anInt7939 + arg1) % this.anInt7938;
			this.notifyAll();
		}
	}
}
