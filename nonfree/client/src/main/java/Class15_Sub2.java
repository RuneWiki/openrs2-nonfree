import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "J")
	private long aLong69 = 0L;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "J")
	private long aLong68 = 0L;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	private int anInt2282 = 0;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	private int anInt2283 = 1;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class15_Sub2() {
		this.aLong68 = this.aLong69 = jagmisc.nanoTime();
		if (this.aLong69 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)J")
	@Override
	protected long method5281() {
		this.aLong69 += this.method1687();
		return this.aLong69 < this.aLong68 ? (this.aLong68 - this.aLong69) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(JB)I")
	@Override
	protected int method5280(@OriginalArg(0) long arg0) {
		if (this.aLong68 > this.aLong69) {
			this.aLong70 += this.aLong68 - this.aLong69;
			this.aLong69 += this.aLong68 - this.aLong69;
			this.aLong68 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			local15++;
			this.aLong68 += arg0;
		} while (local15 < 10 && this.aLong69 > this.aLong68);
		if (this.aLong69 > this.aLong68) {
			this.aLong68 = this.aLong69;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	@Override
	public void method5283() {
		this.aLong70 = 0;
		if (this.aLong68 > this.aLong69) {
			this.aLong69 += this.aLong68 - this.aLong69;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)J")
	private long method1687() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(13) long local13 = local7 - this.aLong70;
		this.aLong70 = local7;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray2[this.anInt2282] = local13;
			if (this.anInt2283 < 1) {
				this.anInt2283++;
			}
			this.anInt2282 = (this.anInt2282 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt2283; local54++) {
			local52 += this.aLongArray2[(this.anInt2282 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt2283;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)J")
	@Override
	public long method5279() {
		return this.aLong69;
	}
}
