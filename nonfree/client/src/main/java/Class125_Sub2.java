import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "J")
	private long aLong128 = 0L;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	private int anInt4948 = 0;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	private int anInt4949 = 1;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class125_Sub2() {
		this.aLong128 = this.aLong129 = jagmisc.nanoTime();
		if (this.aLong129 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)J")
	@Override
	public long method5264() {
		return this.aLong129;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)J")
	@Override
	protected long method5261() {
		this.aLong129 += this.method4301();
		return this.aLong129 < this.aLong128 ? (this.aLong128 - this.aLong129) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method5262(@OriginalArg(1) long arg0) {
		if (this.aLong129 < this.aLong128) {
			this.aLong130 += this.aLong128 - this.aLong129;
			this.aLong129 += this.aLong128 - this.aLong129;
			this.aLong128 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			this.aLong128 += arg0;
			local17++;
		} while (local17 < 10 && this.aLong128 < this.aLong129);
		if (this.aLong129 > this.aLong128) {
			this.aLong128 = this.aLong129;
		}
		return local17;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(B)J")
	private long method4301() {
		@Pc(9) long local9 = jagmisc.nanoTime();
		@Pc(15) long local15 = local9 - this.aLong130;
		this.aLong130 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray5[this.anInt4948] = local15;
			this.anInt4948 = (this.anInt4948 + 1) % 10;
			if (this.anInt4949 < 1) {
				this.anInt4949++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt4949; local58++) {
			local56 += this.aLongArray5[(this.anInt4948 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt4949;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	@Override
	public void method5266() {
		if (this.aLong129 < this.aLong128) {
			this.aLong129 += this.aLong128 - this.aLong129;
		}
		this.aLong130 = 0L;
	}
}
