import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	private int anInt188 = 1;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "J")
	private long aLong6 = 0L;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	private int anInt189 = 0;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "J")
	private long aLong5 = 0L;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "J")
	private long aLong7 = 0L;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
	@Override
	public int method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static230.method4022((long) arg0);
		this.aLong5 += this.method157();
		@Pc(16) long local16 = (long) arg1 * 1000000L;
		if (this.aLong5 < this.aLong7) {
			Static230.method4022((this.aLong7 - this.aLong5) / 1000000L);
			this.aLong6 += this.aLong7 - this.aLong5;
			this.aLong5 += this.aLong7 - this.aLong5;
			this.aLong7 += local16;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			this.aLong7 += local16;
			local72++;
		} while (local72 < 10 && this.aLong5 > this.aLong7);
		if (this.aLong7 < this.aLong5) {
			this.aLong7 = this.aLong5;
		}
		return local72;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	@Override
	public void method325() {
		this.aLong6 = 0L;
		if (this.aLong7 > this.aLong5) {
			this.aLong5 += this.aLong7 - this.aLong5;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)J")
	@Override
	public long method330() {
		return this.aLong5;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)J")
	private long method157() {
		@Pc(4) long local4 = Static294.method4792() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong6;
		this.aLong6 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray2[this.anInt189] = local9;
			if (this.anInt188 < 10) {
				this.anInt188++;
			}
			this.anInt189 = (this.anInt189 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt188; local54++) {
			local52 += this.aLongArray2[(this.anInt189 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt188;
	}
}
