import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class212_Sub1 extends Class212 {

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "J")
	private long aLong143 = 0L;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	private int anInt5928 = 1;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	private int anInt5927 = 0;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class212_Sub1() {
		this.aLong142 = System.nanoTime();
		this.aLong143 = System.nanoTime();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)J")
	private long method4990() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong144;
		this.aLong144 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt5927] = local7;
			if (this.anInt5928 < 1) {
				this.anInt5928++;
			}
			this.anInt5927 = (this.anInt5927 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt5928; local54++) {
			local52 += this.aLongArray9[(this.anInt5927 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt5928;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	@Override
	public void method7746() {
		this.aLong144 = 0L;
		if (this.aLong142 < this.aLong143) {
			this.aLong142 += this.aLong143 - this.aLong142;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7751(@OriginalArg(1) long arg0) {
		if (this.aLong142 < this.aLong143) {
			this.aLong144 += this.aLong143 - this.aLong142;
			this.aLong142 += this.aLong143 - this.aLong142;
			this.aLong143 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			local47++;
			this.aLong143 += arg0;
		} while (local47 < 10 && this.aLong143 < this.aLong142);
		if (this.aLong142 > this.aLong143) {
			this.aLong143 = this.aLong142;
		}
		return local47;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)J")
	@Override
	public long method7749() {
		return this.aLong142;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)J")
	@Override
	protected long method7750() {
		this.aLong142 += this.method4990();
		return this.aLong142 >= this.aLong143 ? 0L : (this.aLong143 - this.aLong142) / 1000000L;
	}
}
