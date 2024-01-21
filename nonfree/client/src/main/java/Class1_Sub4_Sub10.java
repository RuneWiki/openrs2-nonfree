import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub4_Sub10 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2286 = arg0.method546() << 4;
		} else if (arg1 == 1) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(arg0, 1);
			@Pc(32) int[] local32 = this.method3215(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1888; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt2286 * local32[local34] >> 12;
				@Pc(61) int local61 = local53 * Static25.anIntArray50[local44] >> 12;
				@Pc(69) int local69 = local53 * Static29.anIntArray62[local44] >> 12;
				@Pc(78) int local78 = Static35.anInt672 & local34 + (local69 >> 12);
				@Pc(87) int local87 = Static125.anInt3628 & arg0 + (local61 >> 12);
				@Pc(93) int[] local93 = this.method3215(local87, 0);
				local16[local34] = local93[local78];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(26) int[] local26 = this.method3215(arg0, 1);
			@Pc(32) int[] local32 = this.method3215(arg0, 2);
			@Pc(36) int[] local36 = local11[2];
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			for (@Pc(46) int local46 = 0; local46 < Static73.anInt1888; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt2286 * local32[local46] >> 12;
				@Pc(75) int local75 = Static29.anIntArray62[local58] * local67 >> 12;
				@Pc(83) int local83 = local67 * Static25.anIntArray50[local58] >> 12;
				@Pc(92) int local92 = local46 + (local75 >> 12) & Static35.anInt672;
				@Pc(100) int local100 = Static125.anInt3628 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method3217(0, local100);
				local40[local46] = local106[0][local92];
				local44[local46] = local106[1][local92];
				local36[local46] = local106[2][local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		Static145.method2764();
	}
}
