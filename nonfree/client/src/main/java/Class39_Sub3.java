import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "[J")
	private final long[] aLongArray15 = new long[10];

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
	private int anInt5792 = 1;

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "J")
	private long aLong240 = 0L;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
	private int anInt5793 = 0;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "()V")
	public Class39_Sub3() {
		this.aLong239 = System.nanoTime();
		this.aLong238 = System.nanoTime();
	}

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "(I)J")
	@Override
	protected long method4917() {
		this.aLong239 += this.method4920();
		return this.aLong238 <= this.aLong239 ? 0L : (this.aLong238 - this.aLong239) / 1000000L;
	}

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "(I)J")
	private long method4920() {
		@Pc(9) long local9 = System.nanoTime();
		@Pc(15) long local15 = local9 - this.aLong240;
		this.aLong240 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray15[this.anInt5793] = local15;
			this.anInt5793 = (this.anInt5793 + 1) % 10;
			if (this.anInt5792 < 1) {
				this.anInt5792++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt5792; local56++) {
			local54 += this.aLongArray15[(this.anInt5793 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt5792;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4919(@OriginalArg(1) long arg0) {
		if (this.aLong238 > this.aLong239) {
			this.aLong240 += this.aLong238 - this.aLong239;
			this.aLong239 += this.aLong238 - this.aLong239;
			this.aLong238 += arg0;
			return 1;
		}
		@Pc(41) int local41 = 0;
		do {
			this.aLong238 += arg0;
			local41++;
		} while (local41 < 10 && this.aLong238 < this.aLong239);
		if (this.aLong238 < this.aLong239) {
			this.aLong238 = this.aLong239;
		}
		return local41;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)J")
	@Override
	public long method4913() {
		return this.aLong239;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	@Override
	public void method4915() {
		if (this.aLong239 < this.aLong238) {
			this.aLong239 += this.aLong238 - this.aLong239;
		}
		this.aLong240 = 0L;
	}
}
