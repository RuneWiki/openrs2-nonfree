import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	private int anInt2104 = 0;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private int anInt2107 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	private final int anInt2109;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[B")
	private final byte[] aByteArray27;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class81(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt2109 = arg1 + 1;
		this.aByteArray27 = new byte[this.anInt2109];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([BIII)V")
	public void method2047(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(60) int local60;
			if (this.anInt2104 <= this.anInt2107) {
				local60 = this.anInt2104 + this.anInt2109 - this.anInt2107 - 1;
			} else {
				local60 = this.anInt2104 - this.anInt2107 - 1;
			}
			if (local60 < arg1) {
				throw new IOException("");
			}
			if (this.anInt2107 + arg1 <= this.anInt2109) {
				Static679.method4129(arg0, 0, this.aByteArray27, this.anInt2107, arg1);
			} else {
				@Pc(108) int local108 = this.anInt2109 - this.anInt2107;
				Static679.method4129(arg0, 0, this.aByteArray27, this.anInt2107, local108);
				Static679.method4129(arg0, local108, this.aByteArray27, 0, arg1 - local108);
			}
			this.anInt2107 = (arg1 + this.anInt2107) % this.anInt2109;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!du", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt2104 > this.anInt2107) {
						local34 = this.anInt2107 + this.anInt2109 - this.anInt2104;
					} else {
						local34 = this.anInt2107 - this.anInt2104;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (local34 + this.anInt2104 > this.anInt2109) {
					@Pc(74) int local74 = this.anInt2109 - this.anInt2104;
					this.anOutputStream1.write(this.aByteArray27, this.anInt2104, local74);
					this.anOutputStream1.write(this.aByteArray27, 0, local34 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray27, this.anInt2104, local34);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException1 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2104 = (local34 + this.anInt2104) % this.anInt2109;
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public void method2048() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public void method2051() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
