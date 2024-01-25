import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class95_Sub2 extends Class95 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	private int anInt6648 = 0;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	private int anInt6649 = 1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class95_Sub2() {
		this.aLong199 = this.aLong198 = jagmisc.nanoTime();
		if (this.aLong198 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)J")
	private long method5559() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong200;
		this.aLong200 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray17[this.anInt6648] = local7;
			this.anInt6648 = (this.anInt6648 + 1) % 10;
			if (this.anInt6649 < 1) {
				this.anInt6649++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt6649; local50++) {
			local48 += this.aLongArray17[(this.anInt6648 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt6649;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6521(@OriginalArg(0) long arg0) {
		if (this.aLong198 < this.aLong199) {
			this.aLong200 += this.aLong199 - this.aLong198;
			this.aLong198 += this.aLong199 - this.aLong198;
			this.aLong199 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong199 += arg0;
		} while (local17 < 10 && this.aLong199 < this.aLong198);
		if (this.aLong199 < this.aLong198) {
			this.aLong199 = this.aLong198;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)J")
	@Override
	protected long method6524() {
		this.aLong198 += this.method5559();
		return this.aLong198 < this.aLong199 ? (this.aLong199 - this.aLong198) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method6523() {
		this.aLong200 = 0L;
		if (this.aLong198 < this.aLong199) {
			this.aLong198 += this.aLong199 - this.aLong198;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)J")
	@Override
	public long method6526() {
		return this.aLong198;
	}
}
