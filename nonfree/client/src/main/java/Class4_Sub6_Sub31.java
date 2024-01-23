import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class4_Sub6_Sub31 extends Class4_Sub6 {

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	private int anInt4793 = 0;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "I")
	private int anInt4792 = 2048;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	private int anInt4784 = 12288;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	private int anInt4795 = 4096;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "I")
	private int anInt4786 = 2048;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	private int anInt4791 = 0;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	private int anInt4790 = 8192;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		Static197.method3082();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(25) int local25 = Static273.anIntArray127[arg0] - 2048;
			for (@Pc(27) int local27 = 0; local27 < Static2.anInt19; local27++) {
				@Pc(40) int local40 = Static192.anIntArray318[local27] - 2048;
				@Pc(46) int local46 = local40 + this.anInt4792;
				@Pc(55) int local55 = local46 >= -2048 ? local46 : local46 + 4096;
				@Pc(64) int local64 = local55 > 2048 ? local55 - 4096 : local55;
				@Pc(69) int local69 = local25 + this.anInt4786;
				@Pc(75) int local75 = local25 + this.anInt4793;
				@Pc(80) int local80 = this.anInt4791 + local40;
				@Pc(89) int local89 = local69 >= -2048 ? local69 : local69 + 4096;
				@Pc(98) int local98 = local80 >= -2048 ? local80 : local80 + 4096;
				@Pc(107) int local107 = local98 <= 2048 ? local98 : local98 - 4096;
				@Pc(116) int local116 = local89 <= 2048 ? local89 : local89 - 4096;
				@Pc(127) int local127 = local75 < -2048 ? local75 + 4096 : local75;
				@Pc(136) int local136 = local127 > 2048 ? local127 - 4096 : local127;
				local15[local27] = this.method3835(local136, local64) || this.method3837(local107, local116) ? 4096 : 0;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)Z")
	private boolean method3835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt4784 >> 12;
		@Pc(28) int local28 = Static79.anIntArray165[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4784;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4790;
		@Pc(49) int local49 = local42 * this.anInt4795 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4792 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt4793 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt4791 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt4786 = arg0.method1837();
		} else if (arg1 == 4) {
			this.anInt4784 = arg0.method1837();
		} else if (arg1 == 5) {
			this.anInt4795 = arg0.method1837();
		} else if (arg1 == 6) {
			this.anInt4790 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(III)Z")
	private boolean method3837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(29) int local29 = this.anInt4784 * (arg0 + arg1) >> 12;
		@Pc(39) int local39 = Static79.anIntArray165[local29 * 255 >> 12 & 0xFF];
		@Pc(46) int local46 = (local39 << 12) / this.anInt4784;
		@Pc(53) int local53 = (local46 << 12) / this.anInt4790;
		@Pc(60) int local60 = local53 * this.anInt4795 >> 12;
		return arg1 - arg0 < local60 && arg1 - arg0 > -local60;
	}
}
