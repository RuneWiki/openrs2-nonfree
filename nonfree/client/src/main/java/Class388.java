import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class388 implements Runnable {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	private int anInt10597 = 0;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	private int anInt10603 = 0;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	private final int anInt10601;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[B")
	private final byte[] aByteArray107;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class388(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt10601 = arg1 + 1;
		this.aByteArray107 = new byte[this.anInt10601];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z")
	public boolean method9004(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt10601) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt10597 <= this.anInt10603) {
				local41 = this.anInt10603 - this.anInt10597;
			} else {
				local41 = this.anInt10601 + this.anInt10603 - this.anInt10597;
			}
			if (arg0 <= local41) {
				return true;
			} else if (this.anIOException2 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method9006() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(39) int local39;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10597 == 0) {
						local39 = this.anInt10601 - this.anInt10603 - 1;
					} else if (this.anInt10597 <= this.anInt10603) {
						local39 = this.anInt10601 - this.anInt10603;
					} else {
						local39 = this.anInt10597 - this.anInt10603 - 1;
					}
					if (local39 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(71) InterruptedException local71) {
					}
				}
			}
			@Pc(88) int local88;
			try {
				local88 = this.anInputStream2.read(this.aByteArray107, this.anInt10603, local39);
				if (local88 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException2 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt10603 = (this.anInt10603 + local88) % this.anInt10601;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public void method9008() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BII)I")
	public int method9010(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt10603 >= this.anInt10597) {
				local44 = this.anInt10603 - this.anInt10597;
			} else {
				local44 = this.anInt10601 + this.anInt10603 - this.anInt10597;
			}
			if (local44 < arg2) {
				arg2 = local44;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt10601 >= this.anInt10597 + arg2) {
				Static732.method6320(this.aByteArray107, this.anInt10597, arg1, arg0, arg2);
			} else {
				@Pc(113) int local113 = this.anInt10601 - this.anInt10597;
				Static732.method6320(this.aByteArray107, this.anInt10597, arg1, arg0, local113);
				Static732.method6320(this.aByteArray107, 0, arg1, local113 + arg0, -local113 + arg2);
			}
			this.anInt10597 = (this.anInt10597 + arg2) % this.anInt10601;
			this.notifyAll();
			return arg2;
		}
	}
}
