import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "J")
	private long aLong77 = 0L;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
	private int anInt2668 = 0;

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
	private int anInt2667 = 1;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V")
	public Class77_Sub1() {
		this.aLong76 = System.nanoTime();
		this.aLong75 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)J")
	@Override
	public long method7581() {
		return this.aLong76;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7578(@OriginalArg(1) long arg0) {
		if (this.aLong75 > this.aLong76) {
			this.aLong77 += this.aLong75 - this.aLong76;
			this.aLong76 += this.aLong75 - this.aLong76;
			this.aLong75 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			local13++;
			this.aLong75 += arg0;
		} while (local13 < 10 && this.aLong76 > this.aLong75);
		if (this.aLong75 < this.aLong76) {
			this.aLong75 = this.aLong76;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	@Override
	public void method7575() {
		if (this.aLong75 > this.aLong76) {
			this.aLong76 += this.aLong75 - this.aLong76;
		}
		this.aLong77 = 0L;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)J")
	@Override
	protected long method7573() {
		this.aLong76 += this.method2409();
		return this.aLong75 <= this.aLong76 ? 0L : (this.aLong75 - this.aLong76) / 1000000L;
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)J")
	private long method2409() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong77;
		this.aLong77 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt2668] = local7;
			this.anInt2668 = (this.anInt2668 + 1) % 10;
			if (this.anInt2667 < 1) {
				this.anInt2667++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt2667; local59++) {
			local57 += this.aLongArray8[(this.anInt2668 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt2667;
	}
}
