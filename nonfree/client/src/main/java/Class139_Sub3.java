import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class139_Sub3 extends Class139 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "J")
	private long aLong143 = 0L;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	private int anInt4787 = 1;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	private int anInt4788 = 0;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)J")
	private long method4297() {
		@Pc(4) long local4 = Static101.method1805() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong143;
		this.aLong143 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray6[this.anInt4788] = local9;
			this.anInt4788 = (this.anInt4788 + 1) % 10;
			if (this.anInt4787 < 10) {
				this.anInt4787++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt4787; local52++) {
			local50 += this.aLongArray6[(this.anInt4788 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt4787;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
	@Override
	public int method4296(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong142 += this.method4297();
		if (this.aLong144 > this.aLong142) {
			Static215.method3855((this.aLong144 - this.aLong142) / 1000000L);
			this.aLong143 += this.aLong144 - this.aLong142;
			this.aLong142 += this.aLong144 - this.aLong142;
			this.aLong144 += local11;
			return 1;
		}
		@Pc(27) int local27 = 0;
		do {
			this.aLong144 += local11;
			local27++;
		} while (local27 < 10 && this.aLong142 > this.aLong144);
		if (this.aLong144 < this.aLong142) {
			this.aLong144 = this.aLong142;
		}
		return local27;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	@Override
	public void method4293() {
		if (this.aLong144 > this.aLong142) {
			this.aLong142 += this.aLong144 - this.aLong142;
		}
		this.aLong143 = 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)J")
	@Override
	public long method4289() {
		return this.aLong142;
	}
}
