import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class306 implements Runnable {

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	private int anInt9338 = 0;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	private int anInt9342 = 0;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	private final int anInt9335;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "[B")
	private final byte[] aByteArray114;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class306(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt9335 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray114 = new byte[this.anInt9335];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II[BI)V")
	public void method7728(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt9338 >= this.anInt9342) {
				local58 = this.anInt9335 + this.anInt9342 - this.anInt9338 - 1;
			} else {
				local58 = this.anInt9342 - this.anInt9338 - 1;
			}
			if (arg0 > local58) {
				throw new IOException("");
			}
			if (arg0 + this.anInt9338 <= this.anInt9335) {
				Static554.method3498(arg1, 0, this.aByteArray114, this.anInt9338, arg0);
			} else {
				@Pc(109) int local109 = this.anInt9335 - this.anInt9338;
				Static554.method3498(arg1, 0, this.aByteArray114, this.anInt9338, local109);
				Static554.method3498(arg1, local109, this.aByteArray114, 0, arg0 - local109);
			}
			this.anInt9338 = (arg0 + this.anInt9338) % this.anInt9335;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	public void method7729() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	public void method7730() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!vp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9342 <= this.anInt9338) {
						local26 = this.anInt9338 - this.anInt9342;
					} else {
						local26 = this.anInt9335 + this.anInt9338 - this.anInt9342;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt9335 >= local26 + this.anInt9342) {
					this.anOutputStream2.write(this.aByteArray114, this.anInt9342, local26);
				} else {
					@Pc(84) int local84 = this.anInt9335 - this.anInt9342;
					this.anOutputStream2.write(this.aByteArray114, this.anInt9342, local84);
					this.anOutputStream2.write(this.aByteArray114, 0, local26 - local84);
				}
			} catch (@Pc(104) IOException local104) {
				@Pc(104) IOException local104x = local104;
				synchronized (this) {
					this.anIOException2 = local104x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9342 = (this.anInt9342 + local26) % this.anInt9335;
			}
		}
	}
}
