import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
	private int anInt9413 = 1;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "J")
	private long aLong262 = 0L;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	private int anInt9412 = 0;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "J")
	private long aLong264 = 0L;

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "J")
	private long aLong263 = 0L;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)J")
	@Override
	protected long method7245() {
		this.aLong262 += this.method7250();
		return this.aLong262 < this.aLong263 ? (this.aLong263 - this.aLong262) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)J")
	private long method7250() {
		@Pc(4) long local4 = Static112.method2047() * 1000000L;
		@Pc(15) long local15 = local4 - this.aLong264;
		this.aLong264 = local4;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray16[this.anInt9412] = local15;
			if (this.anInt9413 < 10) {
				this.anInt9413++;
			}
			this.anInt9412 = (this.anInt9412 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt9413; local56++) {
			local54 += this.aLongArray16[(this.anInt9412 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt9413;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)J")
	@Override
	public long method7249() {
		return this.aLong262;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7248() {
		if (this.aLong263 > this.aLong262) {
			this.aLong262 += this.aLong263 - this.aLong262;
		}
		this.aLong264 = 0L;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(JI)I")
	@Override
	protected int method7247(@OriginalArg(0) long arg0) {
		if (this.aLong262 < this.aLong263) {
			this.aLong264 += this.aLong263 - this.aLong262;
			this.aLong262 += this.aLong263 - this.aLong262;
			this.aLong263 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong263 += arg0;
		} while (local17 < 10 && this.aLong262 > this.aLong263);
		if (this.aLong263 < this.aLong262) {
			this.aLong263 = this.aLong262;
		}
		return local17;
	}
}
