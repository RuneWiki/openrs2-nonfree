import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "J")
	private long aLong98 = 0L;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "J")
	private long aLong99 = 0L;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
	private int anInt2487 = 1;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	private int anInt2486 = 0;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public Class37_Sub2() {
		this.aLong99 = this.aLong98 = jagmisc.nanoTime();
		if (this.aLong98 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)J")
	@Override
	public long method3585() {
		return this.aLong98;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	@Override
	public void method3580() {
		this.aLong100 = 0L;
		if (this.aLong99 > this.aLong98) {
			this.aLong98 += this.aLong99 - this.aLong98;
		}
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)J")
	private long method2419() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong100;
		this.aLong100 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt2486] = local7;
			this.anInt2486 = (this.anInt2486 + 1) % 10;
			if (this.anInt2487 < 1) {
				this.anInt2487++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt2487; local55++) {
			local48 += this.aLongArray8[(this.anInt2486 + 10 - local55) % 10];
		}
		return local48 / (long) this.anInt2487;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)I")
	@Override
	public int method3581(@OriginalArg(1) int arg0) {
		this.aLong98 += this.method2419();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong98 < this.aLong99) {
			Static134.method2598((this.aLong99 - this.aLong98) / 1000000L);
			this.aLong100 += this.aLong99 - this.aLong98;
			this.aLong98 += this.aLong99 - this.aLong98;
			this.aLong99 += local17;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			this.aLong99 += local17;
			local25++;
		} while (local25 < 10 && this.aLong98 > this.aLong99);
		if (this.aLong98 > this.aLong99) {
			this.aLong99 = this.aLong98;
		}
		return local25;
	}
}
