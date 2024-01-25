import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "J")
	private long aLong265 = 0L;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	private int anInt9550 = 1;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "J")
	private long aLong266 = 0L;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	private int anInt9551 = 0;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "J")
	private long aLong267 = 0L;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(JI)I")
	@Override
	protected int method7649(@OriginalArg(0) long arg0) {
		if (this.aLong267 < this.aLong265) {
			this.aLong266 += this.aLong265 - this.aLong267;
			this.aLong267 += this.aLong265 - this.aLong267;
			this.aLong265 += arg0;
			return 1;
		}
		@Pc(18) int local18 = 0;
		do {
			this.aLong265 += arg0;
			local18++;
		} while (local18 < 10 && this.aLong265 < this.aLong267);
		if (this.aLong267 > this.aLong265) {
			this.aLong265 = this.aLong267;
		}
		return local18;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)J")
	@Override
	protected long method7651() {
		this.aLong267 += this.method7654();
		return this.aLong267 < this.aLong265 ? (this.aLong265 - this.aLong267) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	@Override
	public void method7653() {
		if (this.aLong267 < this.aLong265) {
			this.aLong267 += this.aLong265 - this.aLong267;
		}
		this.aLong266 = 0L;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)J")
	private long method7654() {
		@Pc(4) long local4 = Static362.method5133() * 1000000L;
		@Pc(16) long local16 = local4 - this.aLong266;
		this.aLong266 = local4;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray17[this.anInt9551] = local16;
			this.anInt9551 = (this.anInt9551 + 1) % 10;
			if (this.anInt9550 < 10) {
				this.anInt9550++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt9550; local57++) {
			local55 += this.aLongArray17[(this.anInt9551 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt9550;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)J")
	@Override
	public long method7650() {
		return this.aLong267;
	}
}
