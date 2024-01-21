import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub1_Sub4_Sub2_Sub2 extends Class1_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!ha", name = "wc", descriptor = "Lclient!nh;")
	public Class1_Sub1_Sub13 aClass1_Sub1_Sub13_1;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method1517() {
		return this.aClass1_Sub1_Sub13_1 != null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub1_Sub13_1 == null) {
			return;
		}
		@Pc(25) Class1_Sub1_Sub17 local25 = super.anInt2041 != -1 && super.anInt2029 == 0 ? Static90.method1962(super.anInt2041) : null;
		@Pc(48) Class1_Sub1_Sub17 local48 = super.anInt2020 == -1 || super.anInt2034 == super.anInt2020 && local25 != null ? null : Static90.method1962(super.anInt2020);
		@Pc(59) Class1_Sub1_Sub4_Sub1 local59 = this.aClass1_Sub1_Sub13_1.method2425(super.anInt2009, local25, super.anInt1999, local48);
		if (local59 == null) {
			return;
		}
		local59.method723();
		super.aShort36 = local59.aShort36;
		if (this.aClass1_Sub1_Sub13_1.aShort34 != 0 && this.aClass1_Sub1_Sub13_1.aShort33 != 0) {
			@Pc(83) int local83 = Class1_Sub1_Sub1_Sub1.anIntArray11[arg0];
			@Pc(87) int local87 = Class1_Sub1_Sub1_Sub1.anIntArray8[arg0];
			@Pc(91) short local91 = this.aClass1_Sub1_Sub13_1.aShort33;
			@Pc(96) int local96 = -local91 / 2;
			@Pc(100) short local100 = this.aClass1_Sub1_Sub13_1.aShort34;
			@Pc(105) int local105 = -local100 / 2;
			@Pc(116) int local116 = local83 * local96 + local105 * local87 >> 16;
			@Pc(127) int local127 = local87 * local96 - local105 * local83 >> 16;
			@Pc(139) int local139 = Static156.method3142(local116 + super.anInt2030, Static56.anInt1784, local127 + super.anInt2001);
			@Pc(143) int local143 = local100 / 2;
			@Pc(148) int local148 = -local91 / 2;
			@Pc(158) int local158 = local87 * local143 + local148 * local83 >> 16;
			@Pc(169) int local169 = local148 * local87 - local143 * local83 >> 16;
			@Pc(174) int local174 = -local100 / 2;
			@Pc(186) int local186 = Static156.method3142(local158 + super.anInt2030, Static56.anInt1784, local169 + super.anInt2001);
			@Pc(190) int local190 = local91 / 2;
			@Pc(201) int local201 = local190 * local83 + local87 * local174 >> 16;
			@Pc(212) int local212 = local87 * local190 - local174 * local83 >> 16;
			@Pc(225) int local225 = Static156.method3142(super.anInt2030 + local201, Static56.anInt1784, super.anInt2001 + local212);
			@Pc(229) int local229 = local100 / 2;
			@Pc(233) int local233 = local91 / 2;
			@Pc(244) int local244 = local87 * local233 - local83 * local229 >> 16;
			@Pc(254) int local254 = local87 * local229 + local83 * local233 >> 16;
			@Pc(267) int local267 = Static156.method3142(super.anInt2030 + local254, Static56.anInt1784, local244 + super.anInt2001);
			@Pc(278) int local278 = local225 < local267 ? local225 : local267;
			@Pc(285) int local285 = local186 >= local267 ? local267 : local186;
			@Pc(296) int local296 = local186 <= local139 ? local186 : local139;
			@Pc(303) int local303 = local139 >= local225 ? local225 : local139;
			@Pc(316) int local316 = (int) (Math.atan2((double) (local296 - local278), (double) local91) * 320.0D) & 0x7FF;
			@Pc(326) int local326 = (local303 + local285 + local278 + local296) / 4;
			local59.method720(local316);
			@Pc(342) int local342 = (int) (Math.atan2((double) (local303 - local285), (double) local100) * 320.0D) & 0x7FF;
			local59.method729(local342);
			local59.method728(0, local326 - super.anInt2049, 0);
		}
		@Pc(356) Class1_Sub1_Sub4_Sub1 local356 = null;
		if (super.anInt2051 != -1 && super.anInt2018 != -1) {
			local356 = Static86.method1911(super.anInt2051).method3510(super.anInt2018);
			if (local356 != null) {
				local356.method728(0, -super.anInt2035, 0);
			}
		}
		if (local356 != null) {
			local59 = ((Class1_Sub1_Sub4_Sub1_Sub1) local59).method741(local356);
		}
		if (this.aClass1_Sub1_Sub13_1.anInt3234 == 1) {
			local59.aBoolean35 = true;
		}
		local59.method3063(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
