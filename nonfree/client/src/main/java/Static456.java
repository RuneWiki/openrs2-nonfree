import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
	public static int anInt7802;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "Z")
	public static boolean aBoolean571;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "J")
	public static long aLong225 = -1L;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "[I")
	public static final int[] anIntArray620 = new int[8];

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "[I")
	public static final int[] anIntArray621 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)Z")
	public static boolean method6196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!qa;IILclient!n;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method6197(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static367.aClass30_20 = arg0;
		Static185.anInt3762 = arg1;
		Static253.aClass72_4 = arg3;
		Static111.aBoolean166 = Static367.aClass30_20.method2104() > 0;
		Static243.anInt4735 = arg4 >> Static391.anInt6797;
		Static140.anInt2891 = arg6 >> Static391.anInt6797;
		Static203.anInt4178 = arg4;
		Static332.anInt5918 = arg6;
		Static395.anInt6978 = arg5;
		Static440.anInt7506 = Static243.anInt4735 - Static120.anInt2511;
		if (Static440.anInt7506 < 0) {
			Static16.anInt319 = -Static440.anInt7506;
			Static440.anInt7506 = 0;
		} else {
			Static16.anInt319 = 0;
		}
		Static412.anInt7172 = Static140.anInt2891 - Static120.anInt2511;
		if (Static412.anInt7172 < 0) {
			Static214.anInt4396 = -Static412.anInt7172;
			Static412.anInt7172 = 0;
		} else {
			Static214.anInt4396 = 0;
		}
		Static54.anInt1311 = Static243.anInt4735 + Static120.anInt2511;
		if (Static54.anInt1311 > Static230.anInt4581) {
			Static54.anInt1311 = Static230.anInt4581;
		}
		Static206.anInt4217 = Static140.anInt2891 + Static120.anInt2511;
		if (Static206.anInt4217 > Static268.anInt5106) {
			Static206.anInt4217 = Static268.anInt5106;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static120.anInt2511 + Static120.anInt2511 + 2; local74++) {
			for (local77 = 0; local77 < Static120.anInt2511 + Static120.anInt2511 + 2; local77++) {
				local84 = Static243.anInt4735 + local74 - Static120.anInt2511;
				local90 = Static140.anInt2891 + local77 - Static120.anInt2511;
				if (local84 >= 0 && local90 >= 0 && local84 < Static230.anInt4581 && local90 < Static268.anInt5106) {
					@Pc(104) int local104 = local84 << Static391.anInt6797;
					@Pc(108) int local108 = local90 << Static391.anInt6797;
					@Pc(124) int local124 = Static267.aClass14Array2[Static267.aClass14Array2.length - 1].oa(local84, local90) - (0x3E8 << Static391.anInt6797 - 7);
					@Pc(144) int local144 = Static77.aClass14Array1 == null ? Static267.aClass14Array2[0].oa(local84, local90) + Static223.anInt4452 : Static77.aClass14Array1[0].oa(local84, local90) + Static223.anInt4452;
					Static262.aBooleanArrayArray9[local74][local77] = Static367.aClass30_20.TA(local104, local124, local108, local104, local144, local108);
				} else {
					Static262.aBooleanArrayArray9[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static120.anInt2511 + Static120.anInt2511 + 1; local77++) {
			for (local84 = 0; local84 < Static120.anInt2511 + Static120.anInt2511 + 1; local84++) {
				Static327.aBooleanArrayArray10[local77][local84] = Static262.aBooleanArrayArray9[local77][local84] || Static262.aBooleanArrayArray9[local77 + 1][local84] || Static262.aBooleanArrayArray9[local77][local84 + 1] || Static262.aBooleanArrayArray9[local77 + 1][local84 + 1];
			}
		}
		Static100.anIntArray189 = arg8;
		Static88.anIntArray529 = arg9;
		Static47.anIntArray74 = arg10;
		Static443.anIntArray605 = arg11;
		Static363.anIntArray512 = arg12;
		Static240.method4015();
		Static145.method2644(Static367.aClass30_20);
		for (@Pc(261) Class71_Sub3 local261 = (Class71_Sub3) Static224.aClass273_1.method6246(); local261 != null; local261 = (Class71_Sub3) Static224.aClass273_1.method6249()) {
			local261.method6187();
			Static292.method4484(local261);
		}
		if (Static111.aBoolean166) {
			for (local90 = 0; local90 < Static398.anInt7036; local90++) {
				client.lb[local90].method3993(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static367.aClass30_20.method2044(0);
			if (Static180.aClass32_1 == null || Static180.aClass32_1 instanceof Class32_Sub2) {
				Static180.aClass32_1 = new Class32_Sub1();
			}
		} else if (Static180.aClass32_1 == null || Static180.aClass32_1 instanceof Class32_Sub1) {
			Static180.aClass32_1 = new Class32_Sub2();
		}
		Static180.aClass32_1.method5959(arg2);
		Static180.aClass32_1.method5962();
		if (Static146.aClass162ArrayArrayArray1 != null) {
			Static427.method5891(true);
			Static180.aClass32_1.method5963(22);
			Static127.method2401(arg2, null, 0, (byte) 0, arg15, arg16);
			Static180.aClass32_1.method5962();
			Static180.aClass32_1.method5963(23);
			Static427.method5891(false);
		}
		Static127.method2401(arg2, arg7, arg13, arg14, arg15, arg16);
		Static180.aClass32_1.method5962();
		Static180.aClass32_1.method5957();
		Static180.aClass32_1.method5962();
		if (arg2 > 1) {
			Static367.aClass30_20.method2049(0);
		}
		Static367.aClass30_20.method2081(0, null);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZIIII)V")
	public static void method6198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4;
		@Pc(14) int local14 = arg6 - arg4;
		for (@Pc(16) int local16 = arg1; local16 < local9; local16++) {
			Static236.method3990(arg3, arg2, Static400.anIntArrayArray54[local16], arg5);
		}
		for (@Pc(32) int local32 = arg6; local32 > local14; local32--) {
			Static236.method3990(arg3, arg2, Static400.anIntArrayArray54[local32], arg5);
		}
		@Pc(57) int local57 = arg2 + arg4;
		@Pc(62) int local62 = arg3 - arg4;
		for (@Pc(64) int local64 = local9; local64 <= local14; local64++) {
			@Pc(70) int[] local70 = Static400.anIntArrayArray54[local64];
			Static236.method3990(local57, arg2, local70, arg5);
			Static236.method3990(local62, local57, local70, arg0);
			Static236.method3990(arg3, local62, local70, arg5);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ka;III)Lclient!em;")
	public static Class64 method6200(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg1 == null ? null : new Class64(arg3, arg0, arg2, arg1.H(), arg1.da(), arg1.J(), arg1.ja(), arg1.F(), arg1.K(), arg1.ia());
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILclient!sg;IILclient!ku;Lclient!ki;)V")
	public static void method6201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub5_Sub2_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class139 arg5, @OriginalArg(7) Class11_Sub5_Sub2_Sub1 arg6) {
		@Pc(11) Class4_Sub6 local11 = new Class4_Sub6();
		local11.anInt989 = arg1;
		local11.anInt986 = arg0 << 7;
		local11.anInt987 = arg4 << 7;
		if (arg5 != null) {
			local11.aClass139_1 = arg5;
			@Pc(136) int local136 = arg5.anInt4353;
			@Pc(139) int local139 = arg5.anInt4350;
			if (arg3 == 1 || arg3 == 3) {
				local136 = arg5.anInt4350;
				local139 = arg5.anInt4353;
			}
			local11.anInt994 = arg5.anInt4376;
			local11.anInt996 = arg5.lb;
			local11.anInt998 = arg5.anInt4370;
			local11.anIntArray59 = arg5.anIntArray342;
			local11.anInt988 = arg5.anInt4361;
			local11.anInt995 = local139 + arg4 << 7;
			local11.anInt999 = arg5.anInt4359 << 7;
			local11.anInt993 = arg0 + local136 << 7;
			if (arg5.anIntArray344 != null) {
				local11.aBoolean69 = true;
				local11.method924();
			}
			if (local11.anIntArray59 != null) {
				local11.anInt992 = local11.anInt998 + (int) ((double) (local11.anInt996 - local11.anInt998) * Math.random());
			}
			Static324.aClass91_35.method2587(local11);
		} else if (arg2 != null) {
			local11.aClass11_Sub5_Sub2_Sub2_1 = arg2;
			@Pc(80) Class241 local80 = arg2.aClass241_1;
			if (local80.anIntArray565 != null) {
				local11.aBoolean69 = true;
				local80 = local80.method5593(Static67.aClass224_1);
			}
			if (local80 != null) {
				local11.anInt995 = arg4 + local80.anInt7007 << 7;
				local11.anInt993 = arg0 + local80.anInt7007 << 7;
				local11.anInt994 = Static371.method5251(arg2);
				local11.anInt988 = local80.anInt6990;
				local11.anInt999 = local80.anInt7006 << 7;
			}
			Static429.aClass91_52.method2587(local11);
		} else if (arg6 != null) {
			local11.aClass11_Sub5_Sub2_Sub1_1 = arg6;
			local11.anInt993 = arg0 + arg6.method5302() << 7;
			local11.anInt995 = arg6.method5302() + arg4 << 7;
			local11.anInt994 = Static188.method3408(arg6);
			local11.anInt988 = arg6.anInt4156;
			local11.anInt999 = arg6.anInt4195 << 7;
			Static48.aClass96_3.method2805((long) arg6.anInt6518, local11);
			return;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!th;[[BI)V")
	public static void method6202(@OriginalArg(0) Class191_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(34) int[] local34 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(36) int local36 = 0; local36 < arg0.anInt6970; local36++) {
			Static256.method4185();
			for (@Pc(42) int local42 = 0; local42 < Static193.anInt3853 >> 3; local42++) {
				for (@Pc(46) int local46 = 0; local46 < Static301.anInt5585 >> 3; local46++) {
					@Pc(56) int local56 = Static47.anIntArrayArrayArray1[local36][local42][local46];
					if (local56 != -1) {
						@Pc(66) int local66 = local56 >> 24 & 0x3;
						if (!arg0.aBoolean513 || local66 == 0) {
							@Pc(80) int local80 = local56 >> 1 & 0x3;
							@Pc(86) int local86 = local56 >> 14 & 0x3FF;
							@Pc(92) int local92 = local56 >> 3 & 0x7FF;
							@Pc(102) int local102 = local92 / 8 + (local86 / 8 << 8);
							for (@Pc(104) int local104 = 0; local104 < Static109.anIntArray203.length; local104++) {
								if (local102 == Static109.anIntArray203[local104] && arg1[local104] != null) {
									@Pc(122) Class4_Sub20 local122 = new Class4_Sub20(arg1[local104]);
									arg0.method5572(local80, local86, local92, local46 * 8, local42 * 8, local36, local122, Static335.aClass253Array1, local66);
									arg0.method5583(local34[0] == -1 ? local34 : null, local46 * 8, local122, local80, Static30.aClass30_3, local66, local92, local36, local86, local42 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local34[0] != -1) {
			Static91.aClass265_1 = Static104.aClass180_1.method4409(Static348.aClass237_1, local34[3], local34[1], local34[2], local34[0]);
			Static90.anInt6146 = local34[4];
		}
	}
}
