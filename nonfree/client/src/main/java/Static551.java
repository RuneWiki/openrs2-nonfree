import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!cr;")
	public static Class64 aClass64_2;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_149 = new Class349(42, -2);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!lr;B)V")
	public static void method7227(@OriginalArg(0) Class2_Sub7_Sub2 arg0) {
		arg0.method4530();
		@Pc(10) int local10 = Static18.anInt4109;
		@Pc(20) Class12_Sub2_Sub1_Sub4_Sub1 local20 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local10] = new Class12_Sub2_Sub1_Sub4_Sub1();
		local20.anInt8406 = local10;
		@Pc(38) int local38 = arg0.method4535(30);
		@Pc(43) byte local43 = (byte) (local38 >> 28);
		@Pc(49) int local49 = local38 >> 14 & 0x3FFF;
		@Pc(53) int local53 = local38 & 0x3FFF;
		local20.anIntArray566[0] = local49 - Static485.anInt7725;
		local20.anInt9374 = (local20.anIntArray566[0] << 9) + (local20.method6777() << 8);
		local20.anIntArray565[0] = local53 - Static310.anInt5129;
		local20.anInt9375 = (local20.anIntArray565[0] << 9) + (local20.method6777() << 8);
		Static402.anInt6620 = local20.aByte128 = local20.aByte127 = local43;
		if (Static562.method7350(local20.anIntArray566[0], local20.anIntArray565[0])) {
			local20.aByte127++;
		}
		if (Static316.aClass2_Sub7Array1[local10] != null) {
			local20.method4908(Static316.aClass2_Sub7Array1[local10]);
		}
		Static84.anInt9548 = 0;
		Static520.anIntArray555[Static84.anInt9548++] = local10;
		Static440.aByteArray67[local10] = 0;
		Static235.anInt3892 = 0;
		for (@Pc(151) int local151 = 1; local151 < 2048; local151++) {
			if (local151 != local10) {
				@Pc(161) int local161 = arg0.method4535(18);
				@Pc(165) int local165 = local161 >> 16;
				@Pc(171) int local171 = local161 >> 8 & 0xFF;
				@Pc(175) int local175 = local161 & 0xFF;
				@Pc(183) Class20 local183 = Static261.aClass20Array1[local151] = new Class20();
				local183.anInt387 = 0;
				local183.anInt386 = -1;
				local183.aBoolean27 = false;
				local183.anInt388 = local175 + (local171 << 14) + (local165 << 28);
				Static295.anIntArray338[Static235.anInt3892++] = local151;
				Static440.aByteArray67[local151] = 0;
			}
		}
		arg0.method4524();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIZ)Lclient!mv;")
	public static Class229 method7228(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(10) Class245 local10 = null;
		if (Static263.aClass121_1 != null) {
			local10 = new Class245(arg0, Static263.aClass121_1, Static538.aClass121Array1[arg0], 1000000);
		}
		Static55.aClass102_Sub1Array1[arg0] = Static517.aClass189_1.method3740(local10, Static349.aClass245_4, arg0);
		Static55.aClass102_Sub1Array1[arg0].method6642();
		return new Class229(Static55.aClass102_Sub1Array1[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[BIZI)V")
	public static void method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(20) int local20 = arg1 - arg3 >> 2;
		arg0 += arg3;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg3 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(34) int local34 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg2[local39] = 1;
			arg0 = local44 + 1;
			arg2[local44] = 1;
		}
	}
}
