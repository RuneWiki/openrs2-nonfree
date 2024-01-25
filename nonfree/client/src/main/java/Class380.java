import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class380 implements Runnable {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	private int anInt10475 = 0;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	private int anInt10473 = 0;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	private final int anInt10478;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[B")
	private final byte[] aByteArray117;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class380(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt10478 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray117 = new byte[this.anInt10478];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(40) int local40;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10475 == 0) {
						local40 = this.anInt10478 - this.anInt10473 - 1;
					} else if (this.anInt10473 >= this.anInt10475) {
						local40 = this.anInt10478 - this.anInt10473;
					} else {
						local40 = this.anInt10475 - this.anInt10473 - 1;
					}
					if (local40 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(69) InterruptedException local69) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray117, this.anInt10473, local40);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95) {
				@Pc(95) IOException local95x = local95;
				synchronized (this) {
					this.anIOException2 = local95x;
					return;
				}
			}
			synchronized (this) {
				this.anInt10473 = (this.anInt10473 + local86) % this.anInt10478;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Z")
	public boolean method9171(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt10478 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(39) int local39;
			if (this.anInt10475 <= this.anInt10473) {
				local39 = this.anInt10473 - this.anInt10475;
			} else {
				local39 = this.anInt10473 + this.anInt10478 - this.anInt10475;
			}
			if (arg0 <= local39) {
				return true;
			} else if (this.anIOException2 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[BIB)I")
	public int method9172(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg2 + arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt10475 <= this.anInt10473) {
				local40 = this.anInt10473 - this.anInt10475;
			} else {
				local40 = this.anInt10478 + this.anInt10473 - this.anInt10475;
			}
			if (arg0 > local40) {
				arg0 = local40;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt10475 + arg0 <= this.anInt10478) {
				Static728.method274(this.aByteArray117, this.anInt10475, arg1, arg2, arg0);
			} else {
				@Pc(108) int local108 = this.anInt10478 - this.anInt10475;
				Static728.method274(this.aByteArray117, this.anInt10475, arg1, arg2, local108);
				Static728.method274(this.aByteArray117, 0, arg1, local108 + arg2, -local108 + arg0);
			}
			this.anInt10475 = (this.anInt10475 + arg0) % this.anInt10478;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	public void method9174() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public void method9175() {
		this.anInputStream2 = new InputStream_Sub2();
	}
}
