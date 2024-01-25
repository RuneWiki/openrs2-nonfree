import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	private int anInt5824 = 1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	private int anInt5825 = 0;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class6_Sub3() {
		this.aLong183 = this.aLong182 = jagmisc.nanoTime();
		if (this.aLong182 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)J")
	private long method4873() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(14) long local14 = local1 - this.aLong184;
		this.aLong184 = local1;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray8[this.anInt5825] = local14;
			this.anInt5825 = (this.anInt5825 + 1) % 10;
			if (this.anInt5824 < 1) {
				this.anInt5824++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt5824; local57++) {
			local55 += this.aLongArray8[(this.anInt5825 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt5824;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)J")
	@Override
	public long method4867() {
		return this.aLong182;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	@Override
	public int method4870(@OriginalArg(1) int arg0) {
		this.aLong182 += this.method4873();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong182 < this.aLong183) {
			Static248.method4401((this.aLong183 - this.aLong182) / 1000000L);
			this.aLong184 += this.aLong183 - this.aLong182;
			this.aLong182 += this.aLong183 - this.aLong182;
			this.aLong183 += local12;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			local32++;
			this.aLong183 += local12;
		} while (local32 < 10 && this.aLong183 < this.aLong182);
		if (this.aLong182 > this.aLong183) {
			this.aLong183 = this.aLong182;
		}
		return local32;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	@Override
	public void method4871() {
		if (this.aLong182 < this.aLong183) {
			this.aLong182 += this.aLong183 - this.aLong182;
		}
		this.aLong184 = 0L;
	}
}
