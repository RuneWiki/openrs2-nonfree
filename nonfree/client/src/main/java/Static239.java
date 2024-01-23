import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	public static int anInt4856;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "Z")
	public static boolean aBoolean340 = true;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
	public static void method4063() {
		Static227.method2500(false);
		Static221.anInt4335 = 0;
		@Pc(17) boolean local17 = true;
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static44.aByteArrayArray18.length; local19++) {
			if (Static124.anIntArray283[local19] != -1 && Static44.aByteArrayArray18[local19] == null) {
				Static44.aByteArrayArray18[local19] = Static62.aClass155_30.method4121(Static124.anIntArray283[local19], 0);
				if (Static44.aByteArrayArray18[local19] == null) {
					local17 = false;
					Static221.anInt4335++;
				}
			}
			if (Static205.anIntArray449[local19] != -1 && Static302.aByteArrayArray126[local19] == null) {
				Static302.aByteArrayArray126[local19] = Static62.aClass155_30.method4126(0, Static205.anIntArray449[local19], Static114.anIntArrayArray81[local19]);
				if (Static302.aByteArrayArray126[local19] == null) {
					Static221.anInt4335++;
					local17 = false;
				}
			}
			if (Static283.aBoolean393) {
				if (Static199.anIntArray442[local19] != -1 && Static249.aByteArrayArray111[local19] == null) {
					Static249.aByteArrayArray111[local19] = Static62.aClass155_30.method4121(Static199.anIntArray442[local19], 0);
					if (Static249.aByteArrayArray111[local19] == null) {
						Static221.anInt4335++;
						local17 = false;
					}
				}
				if (Static168.anIntArray368[local19] != -1 && Static50.aByteArrayArray22[local19] == null) {
					Static50.aByteArrayArray22[local19] = Static62.aClass155_30.method4121(Static168.anIntArray368[local19], 0);
					if (Static50.aByteArrayArray22[local19] == null) {
						Static221.anInt4335++;
						local17 = false;
					}
				}
			}
			if (Static48.anIntArray84 != null && Static272.aByteArrayArray75[local19] == null && Static48.anIntArray84[local19] != -1) {
				Static272.aByteArrayArray75[local19] = Static62.aClass155_30.method4126(0, Static48.anIntArray84[local19], Static114.anIntArrayArray81[local19]);
				if (Static272.aByteArrayArray75[local19] == null) {
					Static221.anInt4335++;
					local17 = false;
				}
			}
		}
		if (Static201.aClass43_3 == null) {
			if (Static278.aClass3_Sub4_Sub14_5 == null || !Static81.aClass155_38.method4127(Static278.aClass3_Sub4_Sub14_5.aString100 + "_labels")) {
				Static201.aClass43_3 = new Class43(0);
			} else if (Static81.aClass155_38.method4145(Static278.aClass3_Sub4_Sub14_5.aString100 + "_labels")) {
				Static201.aClass43_3 = Static198.method3271(Static278.aClass3_Sub4_Sub14_5.aString100 + "_labels", Static81.aClass155_38, Static94.aBoolean140);
			} else {
				Static221.anInt4335++;
				local17 = false;
			}
		}
		if (!local17) {
			Static66.anInt1235 = 1;
			return;
		}
		Static206.anInt4082 = 0;
		local17 = true;
		@Pc(314) int local314;
		@Pc(303) int local303;
		for (local19 = 0; local19 < Static44.aByteArrayArray18.length; local19++) {
			@Pc(289) byte[] local289 = Static302.aByteArrayArray126[local19];
			if (local289 != null) {
				local303 = (Static297.anIntArray220[local19] & 0xFF) * 64 - Static43.anInt798;
				local314 = (Static297.anIntArray220[local19] >> 8) * 64 - Static101.anInt1844;
				if (Static45.aBoolean71) {
					local303 = 10;
					local314 = 10;
				}
				local17 &= Static93.method1379(local303, local314, local289);
			}
			if (Static283.aBoolean393) {
				local289 = Static50.aByteArrayArray22[local19];
				if (local289 != null) {
					local314 = (Static297.anIntArray220[local19] >> 8) * 64 - Static101.anInt1844;
					local303 = (Static297.anIntArray220[local19] & 0xFF) * 64 - Static43.anInt798;
					if (Static45.aBoolean71) {
						local303 = 10;
						local314 = 10;
					}
					local17 &= Static93.method1379(local303, local314, local289);
				}
			}
		}
		if (!local17) {
			Static66.anInt1235 = 2;
			return;
		}
		if (Static66.anInt1235 != 0) {
			Static212.method3485(Static167.aString113 + "<br>(100%)", true);
		}
		Static174.method2872();
		Static104.method1669();
		@Pc(402) boolean local402 = false;
		@Pc(408) int local408;
		if (Static283.aBoolean393 && Static66.aBoolean94) {
			for (local408 = 0; local408 < Static44.aByteArrayArray18.length; local408++) {
				if (Static50.aByteArrayArray22[local408] != null || Static249.aByteArrayArray111[local408] != null) {
					local402 = true;
					break;
				}
			}
		}
		Static29.method441(Static283.aBoolean393 ? 28 : 25, local402);
		for (local408 = 0; local408 < 4; local408++) {
			Static138.aClass153Array1[local408].method4081();
		}
		for (local408 = 0; local408 < 4; local408++) {
			for (local314 = 0; local314 < 104; local314++) {
				for (local303 = 0; local303 < 104; local303++) {
					Static41.aByteArrayArrayArray2[local408][local314][local303] = 0;
				}
			}
		}
		Static202.method3344(false);
		if (Static283.aBoolean393) {
			Static193.aClass81_Sub2_2.method2515();
			for (local408 = 0; local408 < 13; local408++) {
				for (local314 = 0; local314 < 13; local314++) {
					Static193.aClass100ArrayArray1[local408][local314].aBoolean206 = true;
				}
			}
		}
		if (Static283.aBoolean393) {
			Static142.method2401();
		}
		if (Static283.aBoolean393) {
			Static223.method3635();
		}
		Static174.method2872();
		System.gc();
		Static227.method2500(true);
		Static32.method501(false);
		if (!Static45.aBoolean71) {
			Static281.method3893(false);
			Static227.method2500(true);
			if (Static283.aBoolean393) {
				local408 = Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] >> 3;
				local314 = Static136.aClass10_Sub5_Sub1_1.anIntArray535[0] >> 3;
				Static118.method1921(local314, local408);
			}
			Static170.method2813(false);
			if (Static272.aByteArrayArray75 != null) {
				Static5.method104();
			}
		}
		if (Static45.aBoolean71) {
			Static267.method4413(false);
			Static227.method2500(true);
			if (Static283.aBoolean393) {
				local408 = Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] >> 3;
				local314 = Static136.aClass10_Sub5_Sub1_1.anIntArray535[0] >> 3;
				Static118.method1921(local314, local408);
			}
			Static246.method4161(false);
		}
		Static104.method1669();
		Static227.method2500(true);
		Static40.method4966(Static138.aClass153Array1, Static45.aBoolean71 ? Static120.anIntArrayArrayArray9 : (int[][][]) null, false);
		if (Static283.aBoolean393) {
			Static142.method2404();
		}
		Static227.method2500(true);
		local408 = Static170.anInt3194;
		if (local408 > Static99.anInt1826) {
			local408 = Static99.anInt1826;
		}
		if (Static99.anInt1826 - 1 <= local408) {
		}
		if (Static208.method3462()) {
			Static120.method2010(0);
		} else {
			Static120.method2010(Static170.anInt3194);
		}
		Static79.method1657();
		if (Static283.aBoolean393 && local402) {
			Static62.method976(true);
			Static32.method501(true);
			if (!Static45.aBoolean71) {
				Static281.method3893(true);
				Static227.method2500(true);
				Static170.method2813(true);
			}
			if (Static45.aBoolean71) {
				Static267.method4413(true);
				Static227.method2500(true);
				Static246.method4161(true);
			}
			Static104.method1669();
			Static227.method2500(true);
			Static40.method4966(Static138.aClass153Array1, Static45.aBoolean71 ? Static120.anIntArrayArrayArray9 : (int[][][]) null, true);
			Static227.method2500(true);
			Static79.method1657();
			Static62.method976(false);
		}
		if (Static283.aBoolean393) {
			for (local314 = 0; local314 < 13; local314++) {
				for (local303 = 0; local303 < 13; local303++) {
					Static193.aClass100ArrayArray1[local314][local303].method2583(Static256.anIntArrayArrayArray14[0], local314 * 8, local303 * 8);
				}
			}
		}
		for (local314 = 0; local314 < 104; local314++) {
			for (local303 = 0; local303 < 104; local303++) {
				Static244.method4141(local303, local314);
			}
		}
		Static103.method1664();
		Static174.method2872();
		Static205.method3417();
		Static104.method1669();
		Static58.aBoolean85 = false;
		if (Static283.aBoolean393) {
			Static156.method2598(true);
		}
		if (Static276.aFrame2 != null && Static150.aClass139_3 != null && Static10.anInt190 == 25) {
			Static215.aClass3_Sub26_Sub1_2.method3958(193);
			Static215.aClass3_Sub26_Sub1_2.method3944(1057001181);
		}
		if (!Static45.aBoolean71) {
			local303 = (Static3.anInt70 + 6) / 8;
			@Pc(828) int local828 = (Static131.anInt2471 + 6) / 8;
			@Pc(834) int local834 = (Static131.anInt2471 - 6) / 8;
			local314 = (Static3.anInt70 - 6) / 8;
			for (@Pc(844) int local844 = local314 - 1; local844 <= local303 + 1; local844++) {
				for (@Pc(853) int local853 = local834 - 1; local853 <= local828 + 1; local853++) {
					if (local314 > local844 || local844 > local303 || local834 > local853 || local828 < local853) {
						Static62.aClass155_30.method4136("m" + local844 + "_" + local853);
						Static62.aClass155_30.method4136("l" + local844 + "_" + local853);
					}
				}
			}
		}
		if (Static10.anInt190 == 28) {
			Static264.method4398(10);
		} else {
			Static264.method4398(30);
			if (Static150.aClass139_3 != null) {
				Static215.aClass3_Sub26_Sub1_2.method3958(130);
			}
		}
		Static65.method1019();
		Static174.method2872();
		Static21.method347();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method4065(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(17) int local17 = arg0.method3904();
		Static218.aClass99Array1 = new Class99[local17];
		@Pc(22) int local22;
		for (local22 = 0; local22 < local17; local22++) {
			Static218.aClass99Array1[local22] = new Class99();
			Static218.aClass99Array1[local22].anInt2889 = arg0.method3904();
			Static218.aClass99Array1[local22].aString105 = arg0.method3903();
		}
		Static232.anInt4519 = arg0.method3904();
		Static13.anInt240 = arg0.method3904();
		Static315.anInt6131 = arg0.method3904();
		Static186.aClass87_Sub1Array2 = new Class87_Sub1[Static13.anInt240 + 1 - Static232.anInt4519];
		for (local22 = 0; local22 < Static315.anInt6131; local22++) {
			@Pc(80) int local80 = arg0.method3904();
			@Pc(88) Class87_Sub1 local88 = Static186.aClass87_Sub1Array2[local80] = new Class87_Sub1();
			local88.anInt4359 = arg0.method3915();
			local88.anInt4355 = arg0.method3896();
			local88.anInt4366 = local80 + Static232.anInt4519;
			local88.aString156 = arg0.method3903();
			local88.aString157 = arg0.method3903();
		}
		Static256.anInt5288 = arg0.method3896();
		Static134.aBoolean312 = true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!pm;I)V")
	public static void method4066(@OriginalArg(1) Class3_Sub24 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(23) Class3_Sub4_Sub22 local23 = Static105.method1684(local14);
		if (local23 == null) {
			return;
		}
		Static309.aStringArray43 = new String[local23.anInt5812];
		Static309.anIntArray628 = new int[local23.anInt5807];
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = 1; local40 < local8.length; local40++) {
			if (local8[local40] instanceof Integer) {
				@Pc(80) int local80 = (Integer) local8[local40];
				if (local80 == -2147483647) {
					local80 = arg0.anInt4256;
				}
				if (local80 == -2147483646) {
					local80 = arg0.anInt4255;
				}
				if (local80 == -2147483645) {
					local80 = arg0.aClass151_13 == null ? -1 : arg0.aClass151_13.anInt4800;
				}
				if (local80 == -2147483644) {
					local80 = arg0.anInt4254;
				}
				if (local80 == -2147483643) {
					local80 = arg0.aClass151_13 == null ? -1 : arg0.aClass151_13.anInt4776;
				}
				if (local80 == -2147483642) {
					local80 = arg0.aClass151_14 == null ? -1 : arg0.aClass151_14.anInt4800;
				}
				if (local80 == -2147483641) {
					local80 = arg0.aClass151_14 == null ? -1 : arg0.aClass151_14.anInt4776;
				}
				if (local80 == -2147483640) {
					local80 = arg0.anInt4253;
				}
				if (local80 == -2147483639) {
					local80 = arg0.anInt4260;
				}
				Static309.anIntArray628[local36++] = local80;
			} else if (local8[local40] instanceof String) {
				@Pc(59) String local59 = (String) local8[local40];
				if (local59.equals("event_opbase")) {
					local59 = arg0.aString150;
				}
				Static309.aStringArray43[local38++] = local59;
			}
		}
		Static101.method1610(arg1, local23);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
	public static void method4068(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 8);
		local8.method970();
	}
}
