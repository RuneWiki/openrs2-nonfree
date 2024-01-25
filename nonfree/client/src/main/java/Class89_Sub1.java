import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "J")
	private long aLong86 = 0L;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	private int anInt2828 = 0;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	private int anInt2829 = 1;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class89_Sub1() {
		this.aLong86 = this.aLong87 = jagmisc.nanoTime();
		if (this.aLong87 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
	@Override
	public int method3423(@OriginalArg(1) int arg0) {
		this.aLong87 += this.method2547();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong86 > this.aLong87) {
			Static77.method1653((this.aLong86 - this.aLong87) / 1000000L);
			this.aLong88 += this.aLong86 - this.aLong87;
			this.aLong87 += this.aLong86 - this.aLong87;
			this.aLong86 += local18;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong86 += local18;
		} while (local69 < 10 && this.aLong86 < this.aLong87);
		if (this.aLong87 > this.aLong86) {
			this.aLong86 = this.aLong87;
		}
		return local69;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)J")
	@Override
	public long method3425() {
		return this.aLong87;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)J")
	private long method2547() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong88;
		this.aLong88 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt2828] = local7;
			if (this.anInt2829 < 1) {
				this.anInt2829++;
			}
			this.anInt2828 = (this.anInt2828 + 1) % 10;
		}
		@Pc(44) long local44 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt2829; local54++) {
			local44 += this.aLongArray2[(this.anInt2828 + 10 - local54) % 10];
		}
		return local44 / (long) this.anInt2829;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	@Override
	public void method3424() {
		if (this.aLong86 > this.aLong87) {
			this.aLong87 += this.aLong86 - this.aLong87;
		}
		this.aLong88 = 0L;
	}
}
