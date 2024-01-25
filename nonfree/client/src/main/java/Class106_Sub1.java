import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!er", name = "i", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	private int anInt2610 = 0;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "J")
	private long aLong90 = 0L;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	private int anInt2611 = 1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class106_Sub1() {
		this.aLong89 = this.aLong88 = jagmisc.nanoTime();
		if (this.aLong88 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6185(@OriginalArg(0) long arg0) {
		if (this.aLong89 > this.aLong88) {
			this.aLong90 += this.aLong89 - this.aLong88;
			this.aLong88 += this.aLong89 - this.aLong88;
			this.aLong89 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong89 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong89 < this.aLong88);
		if (this.aLong88 > this.aLong89) {
			this.aLong89 = this.aLong88;
		}
		return local46;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)J")
	private long method2259() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(15) long local15 = local1 - this.aLong90;
		this.aLong90 = local1;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray1[this.anInt2610] = local15;
			this.anInt2610 = (this.anInt2610 + 1) % 10;
			if (this.anInt2611 < 1) {
				this.anInt2611++;
			}
		}
		@Pc(60) long local60 = 0L;
		for (@Pc(62) int local62 = 1; local62 <= this.anInt2611; local62++) {
			local60 += this.aLongArray1[(this.anInt2610 + 10 - local62) % 10];
		}
		return local60 / (long) this.anInt2611;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)J")
	@Override
	protected long method6180() {
		this.aLong88 += this.method2259();
		return this.aLong88 < this.aLong89 ? (this.aLong89 - this.aLong88) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	@Override
	public void method6184() {
		this.aLong90 = 0L;
		if (this.aLong89 > this.aLong88) {
			this.aLong88 += this.aLong89 - this.aLong88;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)J")
	@Override
	public long method6186() {
		return this.aLong88;
	}
}
