import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "J")
	private long aLong271 = 0L;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "J")
	private long aLong270 = 0L;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "J")
	private long aLong272 = 0L;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
	private int anInt9995 = 0;

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
	private int anInt9996 = 1;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class15_Sub3() {
		this.aLong270 = this.aLong271 = jagmisc.nanoTime();
		if (this.aLong271 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)J")
	private long method8368() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong272;
		this.aLong272 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray17[this.anInt9995] = local7;
			this.anInt9995 = (this.anInt9995 + 1) % 10;
			if (this.anInt9996 < 1) {
				this.anInt9996++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt9996; local53++) {
			local51 += this.aLongArray17[(this.anInt9995 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt9996;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)J")
	@Override
	public long method8365() {
		return this.aLong271;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8362(@OriginalArg(1) long arg0) {
		if (this.aLong270 > this.aLong271) {
			this.aLong272 += this.aLong270 - this.aLong271;
			this.aLong271 += this.aLong270 - this.aLong271;
			this.aLong270 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			this.aLong270 += arg0;
			local14++;
		} while (local14 < 10 && this.aLong271 > this.aLong270);
		if (this.aLong271 > this.aLong270) {
			this.aLong270 = this.aLong271;
		}
		return local14;
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
	@Override
	public void method8366() {
		this.aLong272 = 0L;
		if (this.aLong271 < this.aLong270) {
			this.aLong271 += this.aLong270 - this.aLong271;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)J")
	@Override
	protected long method8364() {
		this.aLong271 += this.method8368();
		return this.aLong271 < this.aLong270 ? (this.aLong270 - this.aLong271) / 1000000L : 0L;
	}
}
