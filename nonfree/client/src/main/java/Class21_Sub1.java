import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	private int anInt693 = 0;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	private int anInt695 = 1;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	private int anInt699 = 256;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "J")
	private long aLong16 = Static182.method2903();

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class21_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray2[local22] = this.aLong16;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
	@Override
	public int method2630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt699;
		this.anInt699 = 300;
		@Pc(22) int local22 = this.anInt695;
		this.anInt695 = 1;
		this.aLong16 = Static182.method2903();
		if (this.aLongArray2[this.anInt694] == 0L) {
			this.anInt695 = local22;
			this.anInt699 = local8;
		} else if (this.aLongArray2[this.anInt694] < this.aLong16) {
			this.anInt699 = (int) ((long) (arg1 * 2560) / (this.aLong16 - this.aLongArray2[this.anInt694]));
		}
		if (this.anInt699 < 25) {
			this.anInt699 = 25;
		}
		if (this.anInt699 > 256) {
			this.anInt699 = 256;
			this.anInt695 = (int) ((long) arg1 - (this.aLong16 - this.aLongArray2[this.anInt694]) / 10L);
		}
		if (this.anInt695 > arg1) {
			this.anInt695 = arg1;
		}
		this.aLongArray2[this.anInt694] = this.aLong16;
		this.anInt694 = (this.anInt694 + 1) % 10;
		@Pc(142) int local142;
		if (this.anInt695 > 1) {
			for (local142 = 0; local142 < 10; local142++) {
				if (this.aLongArray2[local142] != 0L) {
					this.aLongArray2[local142] += this.anInt695;
				}
			}
		}
		if (this.anInt695 < arg0) {
			this.anInt695 = arg0;
		}
		local142 = 0;
		Static19.method344((long) this.anInt695);
		while (this.anInt693 < 256) {
			local142++;
			this.anInt693 += this.anInt699;
		}
		this.anInt693 &= 0xFF;
		return local142;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	@Override
	public void method2629() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray2[local7] = 0L;
		}
	}
}
