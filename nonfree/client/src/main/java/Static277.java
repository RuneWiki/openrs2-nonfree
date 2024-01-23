import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!ph;")
	public static Class138 aClass138_78;

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
	public static int anInt5275 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method4110() {
		Static289.method4287(false);
		@Pc(10) boolean local10 = true;
		Static121.anInt2452 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static156.aByteArrayArray10.length; local14++) {
			if (Static274.anIntArray473[local14] != -1 && Static156.aByteArrayArray10[local14] == null) {
				Static156.aByteArrayArray10[local14] = Static124.aClass138_40.method3346(Static274.anIntArray473[local14], 0);
				if (Static156.aByteArrayArray10[local14] == null) {
					Static121.anInt2452++;
					local10 = false;
				}
			}
			if (Static53.anIntArray89[local14] != -1 && Static90.aByteArrayArray13[local14] == null) {
				Static90.aByteArrayArray13[local14] = Static124.aClass138_40.method3351(0, Static53.anIntArray89[local14], Static272.anIntArrayArray41[local14]);
				if (Static90.aByteArrayArray13[local14] == null) {
					local10 = false;
					Static121.anInt2452++;
				}
			}
			if (Static291.aBoolean404) {
				if (Static302.anIntArray522[local14] != -1 && Static254.aByteArrayArray14[local14] == null) {
					Static254.aByteArrayArray14[local14] = Static124.aClass138_40.method3346(Static302.anIntArray522[local14], 0);
					if (Static254.aByteArrayArray14[local14] == null) {
						Static121.anInt2452++;
						local10 = false;
					}
				}
				if (Static272.anIntArray469[local14] != -1 && Static70.aByteArrayArray3[local14] == null) {
					Static70.aByteArrayArray3[local14] = Static124.aClass138_40.method3346(Static272.anIntArray469[local14], 0);
					if (Static70.aByteArrayArray3[local14] == null) {
						Static121.anInt2452++;
						local10 = false;
					}
				}
			}
			if (Static274.anIntArray472 != null && Static206.aByteArrayArray12[local14] == null && Static274.anIntArray472[local14] != -1) {
				Static206.aByteArrayArray12[local14] = Static124.aClass138_40.method3351(0, Static274.anIntArray472[local14], Static272.anIntArrayArray41[local14]);
				if (Static206.aByteArrayArray12[local14] == null) {
					Static121.anInt2452++;
					local10 = false;
				}
			}
		}
		if (Static27.aClass172_1 == null) {
			if (Static213.aClass1_Sub1_Sub8_3 == null || !Static300.aClass138_85.method3342(Static213.aClass1_Sub1_Sub8_3.aString30 + "_labels")) {
				Static27.aClass172_1 = new Class172(0);
			} else if (Static300.aClass138_85.method3367(Static213.aClass1_Sub1_Sub8_3.aString30 + "_labels")) {
				Static27.aClass172_1 = Static105.method1695(Static213.aClass1_Sub1_Sub8_3.aString30 + "_labels", Static235.aBoolean341, Static300.aClass138_85);
			} else {
				Static121.anInt2452++;
				local10 = false;
			}
		}
		if (!local10) {
			Static233.anInt4697 = 1;
			return;
		}
		Static300.anInt5677 = 0;
		local10 = true;
		@Pc(303) int local303;
		@Pc(292) int local292;
		for (local14 = 0; local14 < Static156.aByteArrayArray10.length; local14++) {
			@Pc(278) byte[] local278 = Static90.aByteArrayArray13[local14];
			if (local278 != null) {
				local292 = (Static278.anIntArray487[local14] & 0xFF) * 64 - Static118.anInt2409;
				local303 = (Static278.anIntArray487[local14] >> 8) * 64 - Static290.anInt5497;
				if (Static288.aBoolean393) {
					local303 = 10;
					local292 = 10;
				}
				local10 &= Static239.method3757(local292, local303, local278);
			}
			if (Static291.aBoolean404) {
				local278 = Static70.aByteArrayArray3[local14];
				if (local278 != null) {
					local303 = (Static278.anIntArray487[local14] >> 8) * 64 - Static290.anInt5497;
					local292 = (Static278.anIntArray487[local14] & 0xFF) * 64 - Static118.anInt2409;
					if (Static288.aBoolean393) {
						local292 = 10;
						local303 = 10;
					}
					local10 &= Static239.method3757(local292, local303, local278);
				}
			}
		}
		if (!local10) {
			Static233.anInt4697 = 2;
			return;
		}
		if (Static233.anInt4697 != 0) {
			Static312.method4593(Static165.aString106 + "<br>(100%)", true);
		}
		Static82.method1238();
		Static38.method686();
		@Pc(396) boolean local396 = false;
		@Pc(402) int local402;
		if (Static291.aBoolean404 && Static311.aBoolean427) {
			for (local402 = 0; local402 < Static156.aByteArrayArray10.length; local402++) {
				if (Static70.aByteArrayArray3[local402] != null || Static254.aByteArrayArray14[local402] != null) {
					local396 = true;
					break;
				}
			}
		}
		Static129.method2028(Static291.aBoolean404 ? 28 : 25, local396);
		for (local402 = 0; local402 < 4; local402++) {
			Static56.aClass122Array1[local402].method3120();
		}
		for (local402 = 0; local402 < 4; local402++) {
			for (local303 = 0; local303 < 104; local303++) {
				for (local292 = 0; local292 < 104; local292++) {
					Static94.aByteArrayArrayArray9[local402][local303][local292] = 0;
				}
			}
		}
		Static57.method982(false);
		if (Static291.aBoolean404) {
			Static174.aClass103_Sub2_4.method4609();
			for (local402 = 0; local402 < 13; local402++) {
				for (local303 = 0; local303 < 13; local303++) {
					Static174.aClass21ArrayArray1[local402][local303].aBoolean28 = true;
				}
			}
		}
		if (Static291.aBoolean404) {
			Static294.method4356();
		}
		if (Static291.aBoolean404) {
			Static268.method4659();
		}
		Static82.method1238();
		System.gc();
		Static289.method4287(true);
		Static248.method3817(false);
		if (!Static288.aBoolean393) {
			Static144.method2297(false);
			Static289.method4287(true);
			if (Static291.aBoolean404) {
				local303 = Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] >> 3;
				local402 = Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] >> 3;
				Static280.method4152(local303, local402);
			}
			Static217.method3425(false);
			if (Static206.aByteArrayArray12 != null) {
				Static75.method1197();
			}
		}
		if (Static288.aBoolean393) {
			Static93.method1376(false);
			Static289.method4287(true);
			if (Static291.aBoolean404) {
				local402 = Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] >> 3;
				local303 = Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] >> 3;
				Static280.method4152(local303, local402);
			}
			Static280.method4157(false);
		}
		Static38.method686();
		Static289.method4287(true);
		Static192.method3143(Static288.aBoolean393 ? Static268.anIntArrayArrayArray19 : (int[][][]) null, Static56.aClass122Array1, false);
		if (Static291.aBoolean404) {
			Static294.method4362();
		}
		Static289.method4287(true);
		local402 = Static7.anInt134;
		if (Static295.anInt5586 < local402) {
			local402 = Static295.anInt5586;
		}
		if (Static295.anInt5586 - 1 <= local402) {
		}
		if (Static62.method1046()) {
			Static89.method1324(0);
		} else {
			Static89.method1324(Static7.anInt134);
		}
		Static171.method2888();
		if (Static291.aBoolean404 && local396) {
			Static313.method4647(true);
			Static248.method3817(true);
			if (!Static288.aBoolean393) {
				Static144.method2297(true);
				Static289.method4287(true);
				Static217.method3425(true);
			}
			if (Static288.aBoolean393) {
				Static93.method1376(true);
				Static289.method4287(true);
				Static280.method4157(true);
			}
			Static38.method686();
			Static289.method4287(true);
			Static192.method3143(Static288.aBoolean393 ? Static268.anIntArrayArrayArray19 : (int[][][]) null, Static56.aClass122Array1, true);
			Static289.method4287(true);
			Static171.method2888();
			Static313.method4647(false);
		}
		if (Static291.aBoolean404) {
			for (local303 = 0; local303 < 13; local303++) {
				for (local292 = 0; local292 < 13; local292++) {
					Static174.aClass21ArrayArray1[local303][local292].method427(Static208.anIntArrayArrayArray11[0], local303 * 8, local292 * 8);
				}
			}
		}
		for (local303 = 0; local303 < 104; local303++) {
			for (local292 = 0; local292 < 104; local292++) {
				Static24.method458(local292, local303);
			}
		}
		Static296.method4401();
		Static82.method1238();
		Static270.method3987();
		Static38.method686();
		Static169.aBoolean251 = false;
		if (Static291.aBoolean404) {
			Static40.method718(true);
		}
		if (Static78.aFrame2 != null && Static81.aClass7_2 != null && Static258.anInt5016 == 25) {
			Static137.aClass1_Sub14_Sub1_6.method2661(104);
			Static137.aClass1_Sub14_Sub1_6.method2630(1057001181);
		}
		if (!Static288.aBoolean393) {
			local303 = (Static305.anInt5793 - 6) / 8;
			local292 = (Static305.anInt5793 + 6) / 8;
			@Pc(836) int local836 = (Static244.anInt4868 - 6) / 8;
			@Pc(842) int local842 = (Static244.anInt4868 + 6) / 8;
			for (@Pc(846) int local846 = local303 - 1; local846 <= local292 + 1; local846++) {
				for (@Pc(859) int local859 = local836 - 1; local859 <= local842 + 1; local859++) {
					if (local303 > local846 || local846 > local292 || local859 < local836 || local859 > local842) {
						Static124.aClass138_40.method3359("m" + local846 + "_" + local859);
						Static124.aClass138_40.method3359("l" + local846 + "_" + local859);
					}
				}
			}
		}
		if (Static258.anInt5016 == 28) {
			Static176.method4598(10);
		} else {
			Static176.method4598(30);
			if (Static81.aClass7_2 != null) {
				Static137.aClass1_Sub14_Sub1_6.method2661(48);
			}
		}
		Static62.method1047();
		Static82.method1238();
		Static91.method1363();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIBI)Lclient!wd;")
	public static Class190 method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = (long) arg0 & 0xFFFFL | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg1 & 0xFFFFL) << 48 | ((long) arg3 & 0xFFFFL) << 16;
		@Pc(37) Class190 local37 = (Class190) Static33.aClass169_21.method4017(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(44) Class110[] local44 = null;
		@Pc(54) Class139 local54 = Static46.method823(arg0);
		if (local54.anIntArray337 != null) {
			local44 = new Class110[local54.anIntArray337.length];
			for (@Pc(65) int local65 = 0; local65 < local44.length; local65++) {
				@Pc(76) Class136 local76 = Static171.method2883(local54.anIntArray337[local65]);
				local44[local65] = new Class110(local76.anInt4118, local76.anInt4117, local76.anInt4127, local76.anInt4123, local76.anInt4122, local76.anInt4119, local76.anInt4116, local76.aBoolean284);
			}
		}
		local37 = new Class190(local54.anInt4218, local44, local54.anInt4217, arg1, arg2, arg3);
		Static33.aClass169_21.method4016(local37, local31);
		return local37;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public static void method4112() {
		Static24.aClass169_17.method4018();
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	public static void method4114() {
		Static222.aClass169_122.method4014();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z")
	public static boolean method4117(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(15) int local15 = Static241.aShortArray76[arg0];
		if (local15 >= 2000) {
			local15 -= 2000;
		}
		return local15 == 1004;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!no;IBIILclient!ei;ILclient!qm;)V")
	public static void method4118(@OriginalArg(0) int arg0, @OriginalArg(1) Class22_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class43 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class22_Sub3_Sub2 arg7) {
		@Pc(7) Class1_Sub10 local7 = new Class1_Sub10();
		local7.anInt974 = arg3 * 128;
		local7.anInt963 = arg2;
		local7.anInt962 = arg0 * 128;
		if (arg5 != null) {
			local7.aClass43_1 = arg5;
			local7.anInt968 = arg5.anInt1144;
			local7.anInt965 = arg5.anInt1173;
			local7.anInt967 = arg5.anInt1147 * 128;
			local7.anInt971 = arg5.anInt1188;
			local7.anInt975 = arg5.anInt1159;
			@Pc(167) int local167 = arg5.anInt1185;
			@Pc(170) int local170 = arg5.anInt1153;
			local7.anIntArray82 = arg5.anIntArray99;
			if (arg6 == 1 || arg6 == 3) {
				local167 = arg5.anInt1153;
				local170 = arg5.anInt1185;
			}
			local7.anInt964 = (local170 + arg3) * 128;
			local7.anInt969 = (local167 + arg0) * 128;
			if (arg5.anIntArray97 != null) {
				local7.aBoolean76 = true;
				local7.method873();
			}
			if (local7.anIntArray82 != null) {
				local7.anInt966 = local7.anInt968 + (int) ((double) (local7.anInt965 - local7.anInt968) * Math.random());
			}
			Static232.aClass24_20.method473(local7);
		} else if (arg1 != null) {
			@Pc(37) Class112 local37 = arg1.aClass112_1;
			local7.aClass22_Sub3_Sub1_1 = arg1;
			if (local37.anIntArray283 != null) {
				local7.aBoolean76 = true;
				local37 = local37.method2817();
			}
			if (local37 != null) {
				local7.anInt969 = (arg0 + local37.anInt3495) * 128;
				local7.anInt964 = (arg3 + local37.anInt3495) * 128;
				local7.anInt971 = Static274.method4068(arg1);
				local7.anInt975 = local37.anInt3526;
				local7.anInt967 = local37.anInt3507 * 128;
			}
			Static213.aClass24_22.method473(local7);
		} else if (arg7 != null) {
			local7.aClass22_Sub3_Sub2_1 = arg7;
			local7.anInt969 = (arg7.method3660() + arg0) * 128;
			local7.anInt964 = (arg3 + arg7.method3660()) * 128;
			local7.anInt971 = Static84.method1250(arg7);
			local7.anInt967 = arg7.anInt4653 * 128;
			local7.anInt975 = arg7.anInt4667;
			Static263.aClass156_24.method3816((long) arg4, local7);
		}
	}
}
