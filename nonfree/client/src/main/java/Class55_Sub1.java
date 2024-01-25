import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "J")
	private long aLong51 = 0L;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	private int anInt1517 = 0;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "J")
	private long aLong52 = 0L;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	private int anInt1518 = 1;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class55_Sub1() {
		this.aLong51 = this.aLong50 = jagmisc.nanoTime();
		if (this.aLong50 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)J")
	@Override
	public long method4707() {
		return this.aLong50;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)J")
	private long method1422() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(12) long local12 = local7 - this.aLong52;
		this.aLong52 = local7;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray2[this.anInt1517] = local12;
			this.anInt1517 = (this.anInt1517 + 1) % 10;
			if (this.anInt1518 < 1) {
				this.anInt1518++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt1518; local55++) {
			local53 += this.aLongArray2[(this.anInt1517 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt1518;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	@Override
	public void method4704() {
		this.aLong52 = 0L;
		if (this.aLong51 > this.aLong50) {
			this.aLong50 += this.aLong51 - this.aLong50;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)I")
	@Override
	public int method4703(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong50 += this.method1422();
		if (this.aLong50 < this.aLong51) {
			Static170.method1617((this.aLong51 - this.aLong50) / 1000000L);
			this.aLong52 += this.aLong51 - this.aLong50;
			this.aLong50 += this.aLong51 - this.aLong50;
			this.aLong51 += local4;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong51 += local4;
		} while (local30 < 10 && this.aLong50 > this.aLong51);
		if (this.aLong50 > this.aLong51) {
			this.aLong51 = this.aLong50;
		}
		return local30;
	}
}
