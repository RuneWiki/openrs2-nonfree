import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "J")
	private long aLong35 = 0L;

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "J")
	private long aLong36 = 0L;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "J")
	private long aLong37 = 0L;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
	private int anInt952 = 0;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
	private int anInt953 = 1;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
	public Class45_Sub1() {
		this.aLong35 = this.aLong36 = jagmisc.nanoTime();
		if (this.aLong36 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)J")
	@Override
	public long method7472() {
		return this.aLong36;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)J")
	private long method853() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong37;
		this.aLong37 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt952] = local7;
			this.anInt952 = (this.anInt952 + 1) % 10;
			if (this.anInt953 < 1) {
				this.anInt953++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt953; local56++) {
			local54 += this.aLongArray3[(this.anInt952 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt953;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method7469(@OriginalArg(1) long arg0) {
		if (this.aLong36 < this.aLong35) {
			this.aLong37 += this.aLong35 - this.aLong36;
			this.aLong36 += this.aLong35 - this.aLong36;
			this.aLong35 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			this.aLong35 += arg0;
			local16++;
		} while (local16 < 10 && this.aLong35 < this.aLong36);
		if (this.aLong35 < this.aLong36) {
			this.aLong35 = this.aLong36;
		}
		return local16;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)J")
	@Override
	protected long method7465() {
		this.aLong36 += this.method853();
		return this.aLong35 > this.aLong36 ? (this.aLong35 - this.aLong36) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	@Override
	public void method7468() {
		this.aLong37 = 0L;
		if (this.aLong36 < this.aLong35) {
			this.aLong36 += this.aLong35 - this.aLong36;
		}
	}
}
