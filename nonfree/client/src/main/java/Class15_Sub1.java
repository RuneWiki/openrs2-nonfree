import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
	private int anInt278 = 1;

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "J")
	private long aLong14 = 0L;

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "J")
	private long aLong13 = 0L;

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "J")
	private long aLong12 = 0L;

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
	private int anInt279 = 0;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8362(@OriginalArg(1) long arg0) {
		if (this.aLong12 > this.aLong13) {
			this.aLong14 += this.aLong12 - this.aLong13;
			this.aLong13 += this.aLong12 - this.aLong13;
			this.aLong12 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong12 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong12 < this.aLong13);
		if (this.aLong13 > this.aLong12) {
			this.aLong12 = this.aLong13;
		}
		return local43;
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V")
	@Override
	public void method8366() {
		if (this.aLong12 > this.aLong13) {
			this.aLong13 += this.aLong12 - this.aLong13;
		}
		this.aLong14 = 0L;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)J")
	@Override
	protected long method8364() {
		this.aLong13 += this.method314();
		return this.aLong13 < this.aLong12 ? (this.aLong12 - this.aLong13) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)J")
	@Override
	public long method8365() {
		return this.aLong13;
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)J")
	private long method314() {
		@Pc(6) long local6 = Static438.method6517() * 1000000L;
		@Pc(11) long local11 = local6 - this.aLong14;
		this.aLong14 = local6;
		if (local11 > -5000000000L && local11 < 5000000000L) {
			this.aLongArray7[this.anInt279] = local11;
			if (this.anInt278 < 10) {
				this.anInt278++;
			}
			this.anInt279 = (this.anInt279 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(63) int local63 = 1; local63 <= this.anInt278; local63++) {
			local54 += this.aLongArray7[(this.anInt279 + 10 - local63) % 10];
		}
		return local54 / (long) this.anInt278;
	}
}
