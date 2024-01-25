import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class5_Sub3_Sub27 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt4854 = 2048;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
	private int anInt4860 = 8192;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	private int anInt4859 = 0;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	private int anInt4857 = 2048;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	private int anInt4862 = 4096;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
	private int anInt4864 = 12288;

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
	private int anInt4867 = 0;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(26) int local26 = Static345.anIntArray627[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static7.anInt129; local28++) {
				@Pc(36) int local36 = Static164.anIntArray337[local28] - 2048;
				@Pc(41) int local41 = this.anInt4857 + local36;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(61) int local61 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(66) int local66 = this.anInt4867 + local26;
				@Pc(77) int local77 = local66 < -2048 ? local66 + 4096 : local66;
				@Pc(88) int local88 = local77 <= 2048 ? local77 : local77 - 4096;
				@Pc(93) int local93 = this.anInt4859 + local36;
				@Pc(104) int local104 = local93 < -2048 ? local93 + 4096 : local93;
				@Pc(115) int local115 = local104 <= 2048 ? local104 : local104 - 4096;
				@Pc(121) int local121 = local26 + this.anInt4854;
				@Pc(132) int local132 = local121 < -2048 ? local121 + 4096 : local121;
				@Pc(143) int local143 = local132 > 2048 ? local132 - 4096 : local132;
				local11[local28] = this.method4297(local61, local88) || this.method4301(local143, local115) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		Static124.method2201();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)Z")
	private boolean method4297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4864 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static186.anIntArray370[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4864;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4860;
		@Pc(49) int local49 = this.anInt4862 * local42 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4857 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt4867 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt4859 = arg0.method5106();
		} else if (arg1 == 3) {
			this.anInt4854 = arg0.method5106();
		} else if (arg1 == 4) {
			this.anInt4864 = arg0.method5106();
		} else if (arg1 == 5) {
			this.anInt4862 = arg0.method5106();
		} else if (arg1 == 6) {
			this.anInt4860 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)Z")
	private boolean method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = (arg0 + arg1) * this.anInt4864 >> 12;
		@Pc(31) int local31 = Static186.anIntArray370[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt4864;
		@Pc(45) int local45 = (local38 << 12) / this.anInt4860;
		@Pc(52) int local52 = this.anInt4862 * local45 >> 12;
		return arg0 - arg1 < local52 && arg0 - arg1 > -local52;
	}
}
