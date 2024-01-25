import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "J")
	private long aLong133 = 0L;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "J")
	private long aLong134 = 0L;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	private int anInt4571 = 0;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	private int anInt4572 = 1;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class130_Sub1() {
		this.aLong132 = this.aLong133 = jagmisc.nanoTime();
		if (this.aLong133 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7417() {
		this.aLong134 = 0L;
		if (this.aLong132 > this.aLong133) {
			this.aLong133 += this.aLong132 - this.aLong133;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)J")
	@Override
	public long method7418() {
		return this.aLong133;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)J")
	private long method3793() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong134;
		this.aLong134 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray6[this.anInt4571] = local6;
			if (this.anInt4572 < 1) {
				this.anInt4572++;
			}
			this.anInt4571 = (this.anInt4571 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt4572; local52++) {
			local50 += this.aLongArray6[(this.anInt4571 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt4572;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J")
	@Override
	protected long method7416() {
		this.aLong133 += this.method3793();
		return this.aLong132 > this.aLong133 ? (this.aLong132 - this.aLong133) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7420(@OriginalArg(1) long arg0) {
		if (this.aLong132 > this.aLong133) {
			this.aLong134 += this.aLong132 - this.aLong133;
			this.aLong133 += this.aLong132 - this.aLong133;
			this.aLong132 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			this.aLong132 += arg0;
			local17++;
		} while (local17 < 10 && this.aLong132 < this.aLong133);
		if (this.aLong132 < this.aLong133) {
			this.aLong132 = this.aLong133;
		}
		return local17;
	}
}
