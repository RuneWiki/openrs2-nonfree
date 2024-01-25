import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "J")
	private long aLong140 = 0L;

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
	private int anInt5088 = 1;

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
	private int anInt5089 = 0;

	@OriginalMember(owner = "client!jea", name = "n", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
	public Class15_Sub2() {
		this.aLong140 = System.nanoTime();
		this.aLong141 = System.nanoTime();
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)J")
	@Override
	public long method8365() {
		return this.aLong140;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
	@Override
	public void method8366() {
		if (this.aLong140 < this.aLong141) {
			this.aLong140 += this.aLong141 - this.aLong140;
		}
		this.aLong142 = 0L;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)J")
	@Override
	protected long method8364() {
		this.aLong140 += this.method4247();
		return this.aLong141 <= this.aLong140 ? 0L : (this.aLong141 - this.aLong140) / 1000000L;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8362(@OriginalArg(1) long arg0) {
		if (this.aLong141 > this.aLong140) {
			this.aLong142 += this.aLong141 - this.aLong140;
			this.aLong140 += this.aLong141 - this.aLong140;
			this.aLong141 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			local19++;
			this.aLong141 += arg0;
		} while (local19 < 10 && this.aLong140 > this.aLong141);
		if (this.aLong140 > this.aLong141) {
			this.aLong141 = this.aLong140;
		}
		return local19;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)J")
	private long method4247() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong142;
		this.aLong142 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt5089] = local7;
			if (this.anInt5088 < 1) {
				this.anInt5088++;
			}
			this.anInt5089 = (this.anInt5089 + 1) % 10;
		}
		@Pc(44) long local44 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt5088; local52++) {
			local44 += this.aLongArray12[(this.anInt5089 + 10 - local52) % 10];
		}
		return local44 / (long) this.anInt5088;
	}
}
