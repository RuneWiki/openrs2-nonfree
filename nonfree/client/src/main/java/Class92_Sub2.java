import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "J")
	private long aLong188 = 0L;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "J")
	private long aLong187 = 0L;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "J")
	private long aLong189 = 0L;

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
	private int anInt4428 = 0;

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	private int anInt4429 = 1;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
	public Class92_Sub2() {
		this.aLong188 = this.aLong187 = jagmisc.nanoTime();
		if (this.aLong187 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)J")
	private long method3811() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong189;
		this.aLong189 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt4428] = local7;
			if (this.anInt4429 < 1) {
				this.anInt4429++;
			}
			this.anInt4428 = (this.anInt4428 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt4429; local50++) {
			local48 += this.aLongArray12[(this.anInt4428 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt4429;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4206(@OriginalArg(1) long arg0) {
		if (this.aLong188 > this.aLong187) {
			this.aLong189 += this.aLong188 - this.aLong187;
			this.aLong187 += this.aLong188 - this.aLong187;
			this.aLong188 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			local47++;
			this.aLong188 += arg0;
		} while (local47 < 10 && this.aLong187 > this.aLong188);
		if (this.aLong187 > this.aLong188) {
			this.aLong188 = this.aLong187;
		}
		return local47;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)J")
	@Override
	protected long method4210() {
		this.aLong187 += this.method3811();
		return this.aLong188 > this.aLong187 ? (this.aLong188 - this.aLong187) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
	@Override
	public void method4208() {
		this.aLong189 = 0L;
		if (this.aLong188 > this.aLong187) {
			this.aLong187 += this.aLong188 - this.aLong187;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)J")
	@Override
	public long method4209() {
		return this.aLong187;
	}
}
