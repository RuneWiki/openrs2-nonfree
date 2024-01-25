import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_156 = new Class200(8, 2);

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!de;")
	public static final Class69 aClass69_43 = new Class69(4);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6177(@OriginalArg(0) Class13 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = 0;
		if (Static148.aBoolean241) {
			local7 = Static100.method1939();
			local13 = Static260.method4303();
		}
		arg0.KA(local7, local13, local7 + Class16_Sub1_Sub5_Sub1.lb, local13 + 350);
		arg0.aa(local7, local13, Class16_Sub1_Sub5_Sub1.lb, 350, Static243.anInt7075 << 24 | 0x332277, 1);
		Static103.method1953(local13, local7 + Class16_Sub1_Sub5_Sub1.lb, local7, local13 + 350);
		@Pc(57) int local57 = 350 / Static81.anInt2142;
		@Pc(66) int local66;
		if (Static91.anInt2239 > 0) {
			local66 = 346 - Static81.anInt2142 - 4;
			@Pc(77) int local77 = local57 * local66 / (local57 + Static91.anInt2239 - 1);
			@Pc(79) int local79 = 4;
			if (Static91.anInt2239 > 1) {
				local79 = (local66 - local77) * (Static91.anInt2239 + -1 + -Static523.anInt8450) / (Static91.anInt2239 - 1) + 4;
			}
			arg0.aa(local7 + Class16_Sub1_Sub5_Sub1.lb - 16, local13 - -local79, 12, local77, Static243.anInt7075 << 24 | 0x332277, 2);
			for (@Pc(123) int local123 = Static523.anInt8450; local57 + Static523.anInt8450 > local123 && local123 < Static91.anInt2239; local123++) {
				@Pc(134) String[] local134 = Static386.method5691('\b', Static97.aStringArray10[local123]);
				@Pc(143) int local143 = (Class16_Sub1_Sub5_Sub1.lb - 16 - 8) / local134.length;
				for (@Pc(145) int local145 = 0; local145 < local134.length; local145++) {
					@Pc(153) int local153 = local145 * local143 + 8;
					arg0.KA(local153 + local7, local13, local153 + local7 + local143 - 8, local13 + 350);
					Static39.aClass37_1.method6067(-1, Static45.method1177(local134[local145]), -16777216, local7 + local153, local13 + 350 - Static444.anInt7301 - (2 - (-Static266.aClass183_7.anInt5064 + -((-Static523.anInt8450 + local123) * Static81.anInt2142))));
				}
			}
		}
		Static591.aClass37_12.method6071(-1, "Build: 638", Class16_Sub1_Sub5_Sub1.lb + local7 - 25, -16777216, local13 + 350 - 20);
		arg0.KA(local7, local13, Class16_Sub1_Sub5_Sub1.lb + local7, local13 - -350);
		arg0.method8091(local13 + 350 - Static444.anInt7301, local7, Class16_Sub1_Sub5_Sub1.lb, -1);
		Static544.aClass37_8.method6067(-1, "--> " + Static45.method1177(Static143.aString27), -16777216, local7 + 10, -Static551.aClass183_13.anInt5064 + (local13 + 350 - 1));
		if (!Static453.aBoolean526) {
			return;
		}
		local66 = -1;
		if (Static389.anInt6694 % 30 > 15) {
			local66 = 16777215;
		}
		arg0.method8092(12, local7 + Static551.aClass183_13.method4453("--> " + Static45.method1177(Static143.aString27).substring(0, Static545.anInt8786)) + 10, local66, local13 + 350 - Static551.aClass183_13.anInt5064 - 11);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!nd;ZII)V")
	public static void method6179(@OriginalArg(1) int arg0, @OriginalArg(3) Class238 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg2 <= 0) {
			Static555.method7833(arg1, arg0, arg3);
			return;
		}
		Static309.anInt7821 = arg3;
		Static510.aClass238_229 = arg1;
		Static275.anInt5095 = 1;
		Static79.aClass2_Sub11_Sub1_1 = null;
		Static246.aBoolean357 = false;
		Static64.anInt1727 = arg0;
		Static543.anInt8776 = 0;
		Static40.anInt841 = Static191.aClass2_Sub11_Sub1_2.method1503() / arg2;
		if (Static40.anInt841 < 1) {
			Static40.anInt841 = 1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!lk;I)[I")
	public static int[] method6180(@OriginalArg(0) Class2_Sub31 arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.method2837(10);
		local8.method2827(local11[0]);
		local8.method2827(local11[1]);
		local8.method2827(local11[2]);
		local8.method2827(local11[3]);
		for (@Pc(57) int local57 = 0; local57 < 10; local57++) {
			local8.method2827((int) (Math.random() * 9.9999999E7D));
		}
		local8.method2879((int) (Math.random() * 9.9999999E7D));
		local8.method2858(Static43.aBigInteger1, Static154.aBigInteger4);
		arg0.aClass2_Sub17_Sub1_2.method2873(0, local8.aByteArray26, local8.anInt3378);
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BLclient!sb;FFFFIIZIFI)V")
	public static void method6181(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class310 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(10) int arg6, @OriginalArg(11) float arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static282.method6633(local5, arg4, arg1, arg3, arg5, arg7, arg2, arg6, arg0);
			arg6 += 16384;
		}
	}
}
