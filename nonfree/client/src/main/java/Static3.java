import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	public static int anInt59;

	@OriginalMember(owner = "client!ab", name = "S", descriptor = "Z")
	public static boolean aBoolean1;

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
	public static int anInt70;

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
	public static int anInt66 = 50;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
	public static int[] anIntArray3 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
	public static int[] anIntArray4 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1 = new String[anInt66];

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString1 = " ";

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "[I")
	public static int[] anIntArray5 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "[I")
	public static int[] anIntArray6 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "[I")
	public static int[] anIntArray7 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	public static int anInt60 = 0;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "[I")
	public static int[] anIntArray8 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "[I")
	public static int[] anIntArray9 = new int[anInt66];

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString2 = "yellow:";

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString3 = "level: ";

	@OriginalMember(owner = "client!ab", name = "U", descriptor = "Lclient!l;")
	public static Class98 aClass98_1 = new Class98(20);

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "[F")
	public static float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!vo;ILclient!el;IIZLclient!ec;)V")
	public static void method43(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub23 arg1, @OriginalArg(3) Class3_Sub9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class40 arg6) {
		@Pc(13) Class78 local13 = null;
		if (arg6.anInt1148 == 0) {
			if ((double) Static228.aFloat19 == 3.0D) {
				local13 = Static194.aClass78_7;
			}
			if ((double) Static228.aFloat19 == 4.0D) {
				local13 = Static45.aClass78_2;
			}
			if ((double) Static228.aFloat19 == 6.0D) {
				local13 = Static301.aClass78_8;
			}
			if ((double) Static228.aFloat19 >= 8.0D) {
				local13 = Static161.aClass78_6;
			}
		} else if (arg6.anInt1148 == 1) {
			if ((double) Static228.aFloat19 == 3.0D) {
				local13 = Static301.aClass78_8;
			}
			if ((double) Static228.aFloat19 == 4.0D) {
				local13 = Static161.aClass78_6;
			}
			if ((double) Static228.aFloat19 == 6.0D) {
				local13 = Static141.aClass78_4;
			}
			if ((double) Static228.aFloat19 >= 8.0D) {
				local13 = Static42.aClass78_1;
			}
		} else if (arg6.anInt1148 == 2) {
			if ((double) Static228.aFloat19 == 3.0D) {
				local13 = Static141.aClass78_4;
			}
			if ((double) Static228.aFloat19 == 4.0D) {
				local13 = Static42.aClass78_1;
			}
			if ((double) Static228.aFloat19 == 6.0D) {
				local13 = Static99.aClass78_3;
			}
			if ((double) Static228.aFloat19 >= 8.0D) {
				local13 = Static152.aClass78_5;
			}
		}
		if (local13 == null) {
			return;
		}
		@Pc(124) int local124 = arg6.anInt1173;
		if (arg1.aBoolean422 && arg6.anInt1147 != -1) {
			local124 = arg6.anInt1147;
		}
		@Pc(141) int local141 = Static25.aClass3_Sub4_Sub2_4.method3687(arg6.aString48, null, Static75.aStringArray14);
		@Pc(143) int local143 = 0;
		@Pc(146) int local146 = arg1.anInt5969;
		if (arg5) {
			local146 -= local141 * local13.method1889() / 2;
		} else {
			local146 -= arg3 + local13.method1882() * (local141 - 1) + local13.method1889() / 2;
		}
		@Pc(183) int local183 = local146 - local13.method1889();
		local146 += local13.method1889() / 2;
		@Pc(192) int local192;
		@Pc(221) int local221;
		for (local192 = 0; local192 < local141; local192++) {
			@Pc(199) String local199 = Static75.aStringArray14[local192];
			if (local192 < local141 - 1) {
				local199 = local199.substring(0, local199.length() - 4);
			}
			local221 = local13.method1880(local199);
			if (local221 > local143) {
				local143 = local221;
			}
		}
		arg2.anInt1270 = local183 + arg0;
		arg2.anInt1269 = arg1.anInt5967 + local143 / 2 + arg4;
		arg2.anInt1271 = arg4 + arg1.anInt5967 - local143 / 2;
		@Pc(261) int local261 = local183 + 2;
		arg2.anInt1267 = arg0 + local13.method1882() * local141 + local183;
		local192 = arg1.anInt5967 - local143 / 2 - 5;
		if (arg6.anInt1146 != 0) {
			Static143.method2452(local192, local261, local143 + 10, local141 * local13.method1882() + local183 + -local261 + 1, arg6.anInt1146, arg6.anInt1146 >>> 24);
		}
		if (arg6.anInt1158 != 0) {
			Static143.method2445(local192, local261, local143 + 10, local183 + 1 + local13.method1882() * local141 + -local261, arg6.anInt1158, arg6.anInt1158 >>> 24);
		}
		for (local221 = 0; local221 < local141; local221++) {
			@Pc(348) String local348 = Static75.aStringArray14[local221];
			if (local221 < local141 - 1) {
				local348 = local348.substring(0, local348.length() - 4);
			}
			@Pc(370) int local370 = local13.method1880(local348);
			local13.method1883(local348, arg1.anInt5967, local146, local124);
			if (local143 < local370) {
				local143 = local370;
			}
			local146 += local13.method1882();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V")
	public static void method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = local13 << 1;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = arg0 << 1;
		@Pc(29) int local29 = local21 << 1;
		@Pc(38) int local38 = local29 + local13 * (1 - local25);
		@Pc(52) int local52 = local21 - (local25 - 1) * local17;
		@Pc(56) int local56 = local13 << 2;
		@Pc(64) int local64 = local17 * ((arg0 << 1) - 3);
		@Pc(68) int local68 = local21 << 2;
		@Pc(76) int local76 = local29 * 3;
		@Pc(82) int local82 = local68;
		@Pc(88) int local88 = (arg0 - 1) * local56;
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (arg2 >= Static245.anInt6027 && arg2 <= Static111.anInt2039) {
			local103 = Static167.method2786(arg4 + arg1, Static204.anInt4020, Static175.anInt3267);
			local112 = Static167.method2786(arg1 - arg4, Static204.anInt4020, Static175.anInt3267);
			Static235.method3988(arg3, Static129.anIntArrayArray40[arg2], local103, local112);
		}
		while (local5 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local76;
					local76 += local68;
					local52 += local82;
					local82 += local68;
					local3++;
				}
			}
			if (local52 < 0) {
				local3++;
				local38 += local76;
				local52 += local82;
				local76 += local68;
				local82 += local68;
			}
			local38 += -local88;
			local88 -= local56;
			local52 += -local64;
			local64 -= local56;
			local5--;
			local103 = arg2 - local5;
			local112 = local5 + arg2;
			if (local112 >= Static245.anInt6027 && Static111.anInt2039 >= local103) {
				@Pc(212) int local212 = Static167.method2786(arg1 + local3, Static204.anInt4020, Static175.anInt3267);
				@Pc(221) int local221 = Static167.method2786(arg1 - local3, Static204.anInt4020, Static175.anInt3267);
				if (local103 >= Static245.anInt6027) {
					Static235.method3988(arg3, Static129.anIntArrayArray40[local103], local212, local221);
				}
				if (local112 <= Static111.anInt2039) {
					Static235.method3988(arg3, Static129.anIntArrayArray40[local112], local212, local221);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public static void method46(@OriginalArg(1) boolean arg0) {
		if (Static196.aBoolean272 != arg0) {
			Static196.aBoolean272 = arg0;
			Static15.method3535();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!ua;)[Lclient!t;")
	public static Class165[] method47(@OriginalArg(1) Class176 arg0) {
		if (!arg0.method4504()) {
			return new Class165[0];
		}
		@Pc(17) Class178 local17 = arg0.method4507();
		while (local17.anInt5649 == 0) {
			Static150.method2552(10L);
		}
		if (local17.anInt5649 == 2) {
			return new Class165[0];
		}
		@Pc(48) int[] local48 = (int[]) local17.anObject6;
		@Pc(54) Class165[] local54 = new Class165[local48.length >> 2];
		for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
			@Pc(68) Class165 local68 = new Class165();
			local54[local56] = local68;
			local68.anInt5349 = local48[local56 << 2];
			local68.anInt5350 = local48[(local56 << 2) + 1];
			local68.anInt5352 = local48[(local56 << 2) + 2];
			local68.anInt5351 = local48[(local56 << 2) + 3];
		}
		return local54;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method48() {
		if (Static228.aClass3_Sub4_Sub14_2 == null) {
			return;
		}
		if (Static155.anInt2919 < 10) {
			if (!Static228.aClass155_36.method4145(Static228.aClass3_Sub4_Sub14_2.aString100)) {
				Static155.anInt2919 = Static81.aClass155_38.method4143(Static228.aClass3_Sub4_Sub14_2.aString100) / 10;
				return;
			}
			Static102.method1630();
			Static155.anInt2919 = 10;
		}
		if (Static155.anInt2919 == 10) {
			Static228.anInt1431 = Static228.aClass3_Sub4_Sub14_2.anInt2674 >> 6 << 6;
			Static228.anInt1434 = (Static228.aClass3_Sub4_Sub14_2.anInt2668 >> 6 << 6) + 64 - Static228.anInt1431;
			@Pc(60) int local60 = -1;
			@Pc(63) int[] local63 = new int[3];
			Static228.anInt1435 = Static228.aClass3_Sub4_Sub14_2.anInt2660 >> 6 << 6;
			Static228.anInt1432 = (Static228.aClass3_Sub4_Sub14_2.anInt2662 >> 6 << 6) - (Static228.anInt1435 - 64);
			@Pc(83) int local83 = -1;
			if (Static228.aClass3_Sub4_Sub14_2.method2353(Static43.anInt798 + (Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7), Static101.anInt1844 + (Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7), Static99.anInt1826, local63)) {
				local83 = Static228.anInt1432 + Static228.anInt1435 - local63[2] - 1;
				local60 = local63[1] - Static228.anInt1431;
			}
			if (!Static4.aBoolean287 && local60 >= 0 && local60 < Static228.anInt1434 && local83 >= 0 && Static228.anInt1432 > local83) {
				local60 += (int) (Math.random() * 10.0D) - 5;
				Static158.anInt2949 = local60;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static168.anInt3167 = local83;
			} else if (Static146.anInt5851 == -1 || Static33.anInt607 == -1) {
				Static228.aClass3_Sub4_Sub14_2.method2358(Static228.aClass3_Sub4_Sub14_2.anInt2661 >> 14 & 0x3FFF, local63, Static228.aClass3_Sub4_Sub14_2.anInt2661 & 0x3FFF);
				Static158.anInt2949 = local63[1] - Static228.anInt1431;
				Static168.anInt3167 = Static228.anInt1432 + Static228.anInt1435 - local63[2] - 1;
			} else {
				Static228.aClass3_Sub4_Sub14_2.method2358(Static146.anInt5851, local63, Static33.anInt607);
				if (local63 != null) {
					Static168.anInt3167 = Static228.anInt1435 + Static228.anInt1432 - local63[2] - 1;
					Static158.anInt2949 = local63[1] - Static228.anInt1431;
				}
				Static4.aBoolean287 = false;
				Static33.anInt607 = -1;
				Static146.anInt5851 = -1;
			}
			if (Static228.aClass3_Sub4_Sub14_2.anInt2665 == 37) {
				Static228.aFloat19 = 3.0F;
				Static228.aFloat18 = 3.0F;
			} else if (Static228.aClass3_Sub4_Sub14_2.anInt2665 == 50) {
				Static228.aFloat19 = 4.0F;
				Static228.aFloat18 = 4.0F;
			} else if (Static228.aClass3_Sub4_Sub14_2.anInt2665 == 75) {
				Static228.aFloat19 = 6.0F;
				Static228.aFloat18 = 6.0F;
			} else if (Static228.aClass3_Sub4_Sub14_2.anInt2665 == 100) {
				Static228.aFloat19 = 8.0F;
				Static228.aFloat18 = 8.0F;
			} else if (Static228.aClass3_Sub4_Sub14_2.anInt2665 == 200) {
				Static228.aFloat19 = 16.0F;
				Static228.aFloat18 = 16.0F;
			} else {
				Static228.aFloat19 = 8.0F;
				Static228.aFloat18 = 8.0F;
			}
			Static202.method3347();
			Static228.anIntArray140 = new int[Static163.anInt3083 + 1];
			@Pc(308) int local308 = Static228.anInt1434 >> 6;
			@Pc(312) int local312 = Static228.anInt1432 >> 6;
			Static228.aByteArrayArrayArray12 = new byte[local308][local312][];
			Static228.aByteArrayArrayArray11 = new byte[local308][local312][];
			Static228.aByteArrayArrayArray9 = new byte[local308][local312][];
			Static228.anIntArrayArrayArray5 = new int[local308][local312][];
			Static228.aByteArrayArrayArray13 = new byte[local308][local312][];
			Static228.anIntArrayArrayArray4 = new int[local308][local312][];
			Static228.aByteArrayArrayArray10 = new byte[local308][local312][];
			Static204.aClass56_18 = new Class56();
			Static37.aClass17_1 = new Class17();
			@Pc(354) int local354 = Static270.anInt5514 >> 2 << 10;
			@Pc(358) int local358 = Static165.anInt3087 >> 1;
			Static228.method1199(local354, local358);
			Static70.method1062(1024, 256);
			Static90.method1360(256, 256);
			Static133.method2307(256);
			Static155.anInt2919 = 20;
		} else if (Static155.anInt2919 == 20) {
			Static241.method4074(new Class3_Sub26(Static228.aClass155_36.method4149("underlay", Static228.aClass3_Sub4_Sub14_2.aString100)));
			Static155.anInt2919 = 30;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 30) {
			Static228.method1186(new Class3_Sub26(Static228.aClass155_36.method4149("overlay", Static228.aClass3_Sub4_Sub14_2.aString100)));
			Static155.anInt2919 = 40;
			Static21.method347();
		} else if (Static155.anInt2919 == 40) {
			Static228.method1198(new Class3_Sub26(Static228.aClass155_36.method4149("overlay2", Static228.aClass3_Sub4_Sub14_2.aString100)));
			Static155.anInt2919 = 50;
			Static21.method347();
		} else if (Static155.anInt2919 == 50) {
			Static228.method1191(new Class3_Sub26(Static228.aClass155_36.method4149("loc", Static228.aClass3_Sub4_Sub14_2.aString100)), Static94.aBoolean140);
			Static155.anInt2919 = 60;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 60) {
			if (Static228.aClass155_36.method4127(Static228.aClass3_Sub4_Sub14_2.aString100 + "_labels")) {
				if (!Static228.aClass155_36.method4145(Static228.aClass3_Sub4_Sub14_2.aString100 + "_labels")) {
					return;
				}
				Static228.aClass43_2 = Static198.method3271(Static228.aClass3_Sub4_Sub14_2.aString100 + "_labels", Static228.aClass155_36, Static94.aBoolean140);
			} else {
				Static228.aClass43_2 = new Class43(0);
			}
			Static228.method1194();
			Static155.anInt2919 = 70;
			Static21.method347();
		} else if (Static155.anInt2919 == 70) {
			Static194.aClass78_7 = new Class78(11, true, Static224.aCanvas12);
			Static155.anInt2919 = 73;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 73) {
			Static45.aClass78_2 = new Class78(12, true, Static224.aCanvas12);
			Static155.anInt2919 = 76;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 76) {
			Static301.aClass78_8 = new Class78(14, true, Static224.aCanvas12);
			Static155.anInt2919 = 79;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 79) {
			Static161.aClass78_6 = new Class78(17, true, Static224.aCanvas12);
			Static155.anInt2919 = 82;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 82) {
			Static141.aClass78_4 = new Class78(19, true, Static224.aCanvas12);
			Static155.anInt2919 = 85;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 85) {
			Static42.aClass78_1 = new Class78(22, true, Static224.aCanvas12);
			Static155.anInt2919 = 88;
			Static227.method2500(true);
			Static21.method347();
		} else if (Static155.anInt2919 == 88) {
			Static99.aClass78_3 = new Class78(26, true, Static224.aCanvas12);
			Static155.anInt2919 = 91;
			Static227.method2500(true);
			Static21.method347();
		} else {
			Static152.aClass78_5 = new Class78(30, true, Static224.aCanvas12);
			Static155.anInt2919 = 100;
			Static227.method2500(true);
			Static21.method347();
			System.gc();
		}
	}
}
