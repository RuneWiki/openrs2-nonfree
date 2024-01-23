import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "Lclient!lg;")
	public static Class102 aClass102_9;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt4477;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public static int anInt4481;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZBILjava/lang/String;ZIIZJLjava/lang/String;)V")
	public static void method3404(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) long arg8, @OriginalArg(10) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(36) Class8_Sub2 local36 = new Class8_Sub2(128);
		local36.method2340(10);
		local36.method2333((arg7 ? 2 : 0) | (arg1 ? 1 : 0) | (arg4 ? 4 : 0));
		local36.method2378(arg8);
		local36.method2330(local8[0]);
		local36.method2331(arg9);
		local36.method2330(local8[1]);
		local36.method2333(Static270.anInt5329);
		local36.method2340(arg0);
		local36.method2340(arg6);
		local36.method2330(local8[2]);
		local36.method2333(arg2);
		local36.method2333(arg5);
		local36.method2330(local8[3]);
		local36.method2343(Static102.aBigInteger1, Static297.aBigInteger2);
		@Pc(126) Class8_Sub2 local126 = new Class8_Sub2(350);
		local126.method2331(arg3);
		@Pc(138) int local138 = 8 - Static114.method1850(arg3) % 8;
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			local126.method2340((int) (Math.random() * 255.0D));
		}
		local126.method2365(local8);
		Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
		Static66.aClass8_Sub2_Sub1_4.method2340(22);
		Static66.aClass8_Sub2_Sub1_4.method2333(local126.anInt2955 + local36.anInt2955 + 2);
		Static66.aClass8_Sub2_Sub1_4.method2333(544);
		Static66.aClass8_Sub2_Sub1_4.method2380(local36.anInt2955, local36.aByteArray24);
		Static66.aClass8_Sub2_Sub1_4.method2380(local126.anInt2955, local126.aByteArray24);
		Static214.anInt4413 = 0;
		Static230.anInt4668 = 1;
		Static242.anInt4854 = -3;
		Static90.anInt1918 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = 2048 - arg3 & 0x7FF;
		@Pc(14) int local14 = arg2 - 334;
		if (local14 < 0) {
			local14 = 0;
		} else if (local14 > 100) {
			local14 = 100;
		}
		@Pc(47) int local47 = local14 * (Static31.aShort3 - Static147.aShort17) / 100 + Static147.aShort17;
		@Pc(53) int local53 = arg5 * local47 >> 8;
		@Pc(60) int local60 = 2048 - arg0 & 0x7FF;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = local53;
		@Pc(76) int local76;
		@Pc(87) int local87;
		if (local10 != 0) {
			local76 = Class68.anIntArray137[local10];
			local64 = local76 * -local53 >> 16;
			local87 = Class68.anIntArray139[local10];
			local66 = local53 * local87 >> 16;
		}
		if (local60 != 0) {
			local76 = Class68.anIntArray137[local60];
			local62 = local76 * local66 >> 16;
			local87 = Class68.anIntArray139[local60];
			local66 = local87 * local66 >> 16;
		}
		Static293.anInt5684 = arg0;
		Static46.anInt1044 = arg1 - local62;
		Static185.anInt3689 = arg6 - local66;
		Static170.anInt3411 = arg4 - local64;
		Static56.anInt1246 = arg3;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method3406() {
		Static128.method2075(Static201.aClass159_15);
		Static136.anInt2738++;
		if (Static15.aBoolean28 && Static20.aBoolean36) {
			@Pc(42) int local42 = Static106.anInt2198;
			@Pc(44) int local44 = Static182.anInt3572;
			local42 -= Static204.anInt4224;
			local44 -= Static16.anInt3521;
			if (local44 < Static199.anInt4028) {
				local44 = Static199.anInt4028;
			}
			if (Static13.anInt360 > local42) {
				local42 = Static13.anInt360;
			}
			if (Static201.aClass159_15.anInt5121 + local42 > Static13.anInt360 - -Static153.aClass159_12.anInt5121) {
				local42 = Static13.anInt360 + Static153.aClass159_12.anInt5121 - Static201.aClass159_15.anInt5121;
			}
			if (Static201.aClass159_15.anInt5123 + local44 > Static199.anInt4028 - -Static153.aClass159_12.anInt5123) {
				local44 = Static199.anInt4028 + Static153.aClass159_12.anInt5123 - Static201.aClass159_15.anInt5123;
			}
			@Pc(128) int local128 = local42 + Static153.aClass159_12.anInt5176 - Static13.anInt360;
			@Pc(136) int local136 = Static153.aClass159_12.anInt5128 + local44 - Static199.anInt4028;
			@Pc(141) int local141 = local42 - Static175.anInt3468;
			@Pc(145) int local145 = local44 - Static282.anInt952;
			@Pc(148) int local148 = Static201.aClass159_15.anInt5186;
			if (Static201.aClass159_15.anInt5142 < Static136.anInt2738 && (local145 > local148 || -local148 > local145 || local141 > local148 || local141 < -local148)) {
				Static246.aBoolean393 = true;
			}
			@Pc(189) Class8_Sub14 local189;
			if (Static201.aClass159_15.anObjectArray17 != null && Static246.aBoolean393) {
				local189 = new Class8_Sub14();
				local189.anInt2439 = local128;
				local189.anObjectArray1 = Static201.aClass159_15.anObjectArray17;
				local189.anInt2432 = local136;
				local189.aClass159_10 = Static201.aClass159_15;
				Static173.method2688(local189);
			}
			if (Static47.anInt1046 == 0) {
				if (Static246.aBoolean393) {
					if (Static201.aClass159_15.anObjectArray28 != null) {
						local189 = new Class8_Sub14();
						local189.anObjectArray1 = Static201.aClass159_15.anObjectArray28;
						local189.aClass159_10 = Static201.aClass159_15;
						local189.aClass159_9 = Static68.aClass159_7;
						local189.anInt2432 = local136;
						local189.anInt2439 = local128;
						Static173.method2688(local189);
					}
					if (Static68.aClass159_7 != null && Static42.method666(Static201.aClass159_15) != null) {
						Static66.aClass8_Sub2_Sub1_4.method2398(90);
						Static66.aClass8_Sub2_Sub1_4.method2366(Static68.aClass159_7.anInt5133);
						Static66.aClass8_Sub2_Sub1_4.method2345(Static201.aClass159_15.anInt5133);
						Static66.aClass8_Sub2_Sub1_4.method2371(Static68.aClass159_7.anInt5199);
						Static66.aClass8_Sub2_Sub1_4.method2371(Static201.aClass159_15.anInt5199);
					}
				} else if ((Static236.anInt4770 == 1 || Static181.method2773(Static185.anInt3679 - 1)) && Static185.anInt3679 > 2) {
					Static246.method3670();
				} else if (Static185.anInt3679 > 0) {
					Static21.method393();
				}
				Static201.aClass159_15 = null;
			}
		} else if (Static136.anInt2738 > 1) {
			Static201.aClass159_15 = null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)Lclient!q;")
	public static Class134 method3408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class134 local14 = local7.aClass134_1;
			local7.aClass134_1 = null;
			return local14;
		}
	}
}
