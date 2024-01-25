import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "J")
	private long aLong105 = 0L;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "J")
	private long aLong106 = 0L;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	private int anInt4911 = 0;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	private int anInt4912 = 1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class78_Sub2() {
		this.aLong105 = this.aLong104 = jagmisc.nanoTime();
		if (this.aLong104 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)J")
	private long method4235() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(11) long local11 = local1 - this.aLong106;
		this.aLong106 = local1;
		if (local11 > -5000000000L && local11 < 5000000000L) {
			this.aLongArray6[this.anInt4911] = local11;
			this.anInt4911 = (this.anInt4911 + 1) % 10;
			if (this.anInt4912 < 1) {
				this.anInt4912++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt4912; local54++) {
			local52 += this.aLongArray6[(this.anInt4911 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt4912;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	@Override
	public void method6582() {
		if (this.aLong105 > this.aLong104) {
			this.aLong104 += this.aLong105 - this.aLong104;
		}
		this.aLong106 = 0L;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method6576(@OriginalArg(1) long arg0) {
		if (this.aLong105 > this.aLong104) {
			this.aLong106 += this.aLong105 - this.aLong104;
			this.aLong104 += this.aLong105 - this.aLong104;
			this.aLong105 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			local15++;
			this.aLong105 += arg0;
		} while (local15 < 10 && this.aLong105 < this.aLong104);
		if (this.aLong105 < this.aLong104) {
			this.aLong105 = this.aLong104;
		}
		return local15;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6573() {
		this.aLong104 += this.method4235();
		return this.aLong105 > this.aLong104 ? (this.aLong105 - this.aLong104) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)J")
	@Override
	public long method6575() {
		return this.aLong104;
	}
}
