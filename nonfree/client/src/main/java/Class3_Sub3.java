import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "[J")
	private final long[] aLongArray19 = new long[10];

	@OriginalMember(owner = "client!po", name = "g", descriptor = "J")
	private long aLong228 = 0L;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	private int anInt7642 = 1;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "J")
	private long aLong229 = 0L;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "I")
	private int anInt7643 = 0;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "J")
	private long aLong230 = 0L;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method6617(@OriginalArg(1) long arg0) {
		if (this.aLong230 < this.aLong228) {
			this.aLong229 += this.aLong228 - this.aLong230;
			this.aLong230 += this.aLong228 - this.aLong230;
			this.aLong228 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			this.aLong228 += arg0;
			local17++;
		} while (local17 < 10 && this.aLong228 < this.aLong230);
		if (this.aLong230 > this.aLong228) {
			this.aLong228 = this.aLong230;
		}
		return local17;
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(B)V")
	@Override
	public void method6623() {
		if (this.aLong228 > this.aLong230) {
			this.aLong230 += this.aLong228 - this.aLong230;
		}
		this.aLong229 = 0L;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)J")
	private long method6625() {
		@Pc(4) long local4 = Static566.method7936() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong229;
		this.aLong229 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray19[this.anInt7643] = local10;
			this.anInt7643 = (this.anInt7643 + 1) % 10;
			if (this.anInt7642 < 10) {
				this.anInt7642++;
			}
		}
		@Pc(52) long local52 = (long) 0;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt7642; local54++) {
			local52 += this.aLongArray19[(this.anInt7643 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt7642;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(B)J")
	@Override
	protected long method6622() {
		this.aLong230 += this.method6625();
		return this.aLong228 > this.aLong230 ? (this.aLong228 - this.aLong230) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)J")
	@Override
	public long method6619() {
		return this.aLong230;
	}
}
