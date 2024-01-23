import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
	public static int[] anIntArray302 = new int[32];

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!l;")
	public static Class101 aClass101_8 = new Class101(8);

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public static int anInt3030 = 0;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	public static int[] anIntArray303 = new int[2048];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public static int anInt3032 = 1;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString107 = null;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!g;IIIII)V")
	public static void method2434(@OriginalArg(1) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Class10 local5 = Static48.method890(arg4);
		if (local5 == null || !local5.aBoolean17 || !local5.method157()) {
			return;
		}
		@Pc(38) int local38;
		if (local5.anIntArray25 != null) {
			@Pc(36) int[] local36 = new int[local5.anIntArray25.length];
			for (local38 = 0; local38 < local36.length / 2; local38++) {
				@Pc(56) int local56;
				if (Static16.anInt342 == 4) {
					local56 = (int) Static239.aFloat51 & 0x7FF;
				} else {
					local56 = Static301.anInt5810 + (int) Static239.aFloat51 & 0x7FF;
				}
				@Pc(69) int local69 = Class1.anIntArray4[local56];
				@Pc(73) int local73 = Class1.anIntArray3[local56];
				if (Static16.anInt342 != 4) {
					local73 = local73 * 256 / (Static141.anInt3097 + 256);
					local69 = local69 * 256 / (Static141.anInt3097 + 256);
				}
				local36[local38 * 2] = arg0.anInt2057 / 2 + arg5 + ((local5.anIntArray25[local38 * 2] * 4 + arg3) * local73 + local69 * (arg1 - -(local5.anIntArray25[local38 * 2 + 1] * 4)) >> 16);
				local36[local38 * 2 + 1] = arg0.anInt2031 / 2 + arg2 - (-((arg3 - -(local5.anIntArray25[local38 * 2] * 4)) * local69) + local73 * (arg1 + local5.anIntArray25[local38 * 2 + 1] * 4) >> 16);
			}
			if (Static116.aBoolean184) {
				Static309.method4670(local36, local5.anInt164, local5.anInt164 >>> 24, arg0.anIntArray181, arg0.anIntArray176);
			} else {
				Static147.method2610(local36, local5.anInt164, local5.anInt164 >>> 24, arg0.anIntArray181, arg0.anIntArray176);
			}
			for (local38 = 0; local38 < local36.length / 2 - 1; local38++) {
				if (Static116.aBoolean184) {
					Static111.method1892(local36[local38 * 2], local36[local38 * 2 + 1], local36[local38 * 2 + 2], local36[local38 * 2 + 3], local5.anInt159, local5.anInt159 >>> 24, (Class2_Sub8_Sub1_Sub2) arg0.method1555(false));
				} else {
					Static77.method1451(local36[local38 * 2], local36[local38 * 2 + 1], local36[local38 * 2 + 2], local36[(local38 + 1) * 2 + 1], local5.anInt159, local5.anInt159 >>> 24, arg0.anIntArray181, arg0.anIntArray176);
				}
			}
			if (Static116.aBoolean184) {
				Static111.method1892(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local5.anInt159, local5.anInt159 >>> 24, (Class2_Sub8_Sub1_Sub2) arg0.method1555(false));
			} else {
				Static77.method1451(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local5.anInt159, local5.anInt159 >>> 24, arg0.anIntArray181, arg0.anIntArray176);
			}
		}
		@Pc(371) Class93 local371 = null;
		if (local5.anInt157 != -1) {
			local371 = local5.method155(false, false);
			if (local371 != null) {
				Static174.method3155(arg0, arg2, arg5, arg3, local371, arg1);
			}
		}
		if (local5.aString9 == null) {
			return;
		}
		@Pc(400) Class2_Sub8_Sub5 local400 = Static92.aClass2_Sub8_Sub5_2;
		local38 = 0;
		if (local371 != null) {
			local38 = local371.anInt4359;
		}
		if (local5.anInt169 == 1) {
			local400 = Static69.aClass2_Sub8_Sub5_4;
		}
		if (local5.anInt169 == 2) {
			local400 = Static237.aClass2_Sub8_Sub5_5;
		}
		Static153.method2807(local5.anInt147, arg5, arg1, local5.aString9, local400, arg2, arg0, arg3, local38);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2435(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static5.method3854(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < Static41.anInt999; local26++) {
			@Pc(35) String local35 = Static5.method3854(Static222.aStringArray34[local26]);
			if (local35 != null && local35.equals(local13)) {
				Static41.anInt999--;
				for (@Pc(48) int local48 = local26; local48 < Static41.anInt999; local48++) {
					Static222.aStringArray34[local48] = Static222.aStringArray34[local48 + 1];
					Static151.aStringArray25[local48] = Static151.aStringArray25[local48 + 1];
					Static102.anIntArray207[local48] = Static102.anIntArray207[local48 + 1];
					Static38.aStringArray4[local48] = Static38.aStringArray4[local48 + 1];
					Static48.anIntArray97[local48] = Static48.anIntArray97[local48 + 1];
					Static284.aBooleanArray22[local48] = Static284.aBooleanArray22[local48 + 1];
				}
				Static233.anInt6039 = Static291.anInt5632;
				Static211.aClass2_Sub16_Sub1_2.method2198(184);
				Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg0));
				Static211.aClass2_Sub16_Sub1_2.method2153(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZIIIII)V")
	public static void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(14) int local14;
		for (local7 = 0; local7 < 104; local7++) {
			for (local14 = 0; local14 < 104; local14++) {
				Static302.anIntArrayArray42[local7][local14] = 0;
				Static305.anIntArrayArray45[local7][local14] = 99999999;
			}
		}
		local7 = arg4;
		Static302.anIntArrayArray42[arg4][arg3] = 99;
		Static305.anIntArrayArray45[arg4][arg3] = 0;
		local14 = arg3;
		@Pc(55) int local55 = 0;
		@Pc(57) byte local57 = 0;
		Static260.anIntArray493[0] = arg4;
		@Pc(63) boolean local63 = false;
		@Pc(66) int local66 = local57 + 1;
		Static130.anIntArray293[0] = arg3;
		@Pc(73) int[][] local73 = Static89.aClass154Array1[Static32.anInt876].anIntArrayArray32;
		@Pc(201) int local201;
		while (local66 != local55) {
			local7 = Static260.anIntArray493[local55];
			local14 = Static130.anIntArray293[local55];
			local55 = local55 + 1 & 0xFFF;
			if (arg0 == local7 && arg2 == local14) {
				local63 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static89.aClass154Array1[Static32.anInt876].method3907(arg2, arg1, arg0, local14, local7, arg6 - 1, 1)) {
					local63 = true;
					break;
				}
				if (arg6 < 10 && Static89.aClass154Array1[Static32.anInt876].method3925(arg0, arg1, local14, arg6 - 1, arg2, local7, 1)) {
					local63 = true;
					break;
				}
			}
			if (arg5 != 0 && arg7 != 0 && Static89.aClass154Array1[Static32.anInt876].method3911(local7, arg5, local14, arg8, arg2, 1, arg7, arg0)) {
				local63 = true;
				break;
			}
			local201 = Static305.anIntArrayArray45[local7][local14] + 1;
			if (local7 > 0 && Static302.anIntArrayArray42[local7 - 1][local14] == 0 && (local73[local7 - 1][local14] & 0x2C0108) == 0) {
				Static260.anIntArray493[local66] = local7 - 1;
				Static130.anIntArray293[local66] = local14;
				Static302.anIntArrayArray42[local7 - 1][local14] = 2;
				Static305.anIntArrayArray45[local7 - 1][local14] = local201;
				local66 = local66 + 1 & 0xFFF;
			}
			if (local7 < 103 && Static302.anIntArrayArray42[local7 + 1][local14] == 0 && (local73[local7 + 1][local14] & 0x2C0180) == 0) {
				Static260.anIntArray493[local66] = local7 + 1;
				Static130.anIntArray293[local66] = local14;
				Static302.anIntArrayArray42[local7 + 1][local14] = 8;
				local66 = local66 + 1 & 0xFFF;
				Static305.anIntArrayArray45[local7 + 1][local14] = local201;
			}
			if (local14 > 0 && Static302.anIntArrayArray42[local7][local14 - 1] == 0 && (local73[local7][local14 - 1] & 0x2C0102) == 0) {
				Static260.anIntArray493[local66] = local7;
				Static130.anIntArray293[local66] = local14 - 1;
				local66 = local66 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local7][local14 - 1] = 1;
				Static305.anIntArrayArray45[local7][local14 - 1] = local201;
			}
			if (local14 < 103 && Static302.anIntArrayArray42[local7][local14 + 1] == 0 && (local73[local7][local14 + 1] & 0x2C0120) == 0) {
				Static260.anIntArray493[local66] = local7;
				Static130.anIntArray293[local66] = local14 + 1;
				Static302.anIntArrayArray42[local7][local14 + 1] = 4;
				local66 = local66 + 1 & 0xFFF;
				Static305.anIntArrayArray45[local7][local14 + 1] = local201;
			}
			if (local7 > 0 && local14 > 0 && Static302.anIntArrayArray42[local7 - 1][local14 - 1] == 0 && (local73[local7 - 1][local14 - 1] & 0x2C010E) == 0 && (local73[local7 - 1][local14] & 0x2C0108) == 0 && (local73[local7][local14 - 1] & 0x2C0102) == 0) {
				Static260.anIntArray493[local66] = local7 - 1;
				Static130.anIntArray293[local66] = local14 - 1;
				local66 = local66 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local7 - 1][local14 - 1] = 3;
				Static305.anIntArrayArray45[local7 - 1][local14 - 1] = local201;
			}
			if (local7 < 103 && local14 > 0 && Static302.anIntArrayArray42[local7 + 1][local14 - 1] == 0 && (local73[local7 + 1][local14 - 1] & 0x2C0183) == 0 && (local73[local7 + 1][local14] & 0x2C0180) == 0 && (local73[local7][local14 - 1] & 0x2C0102) == 0) {
				Static260.anIntArray493[local66] = local7 + 1;
				Static130.anIntArray293[local66] = local14 - 1;
				Static302.anIntArrayArray42[local7 + 1][local14 - 1] = 9;
				local66 = local66 + 1 & 0xFFF;
				Static305.anIntArrayArray45[local7 + 1][local14 - 1] = local201;
			}
			if (local7 > 0 && local14 < 103 && Static302.anIntArrayArray42[local7 - 1][local14 + 1] == 0 && (local73[local7 - 1][local14 + 1] & 0x2C0138) == 0 && (local73[local7 - 1][local14] & 0x2C0108) == 0 && (local73[local7][local14 + 1] & 0x2C0120) == 0) {
				Static260.anIntArray493[local66] = local7 - 1;
				Static130.anIntArray293[local66] = local14 + 1;
				local66 = local66 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local7 - 1][local14 + 1] = 6;
				Static305.anIntArrayArray45[local7 - 1][local14 + 1] = local201;
			}
			if (local7 < 103 && local14 < 103 && Static302.anIntArrayArray42[local7 + 1][local14 + 1] == 0 && (local73[local7 + 1][local14 + 1] & 0x2C01E0) == 0 && (local73[local7 + 1][local14] & 0x2C0180) == 0 && (local73[local7][local14 + 1] & 0x2C0120) == 0) {
				Static260.anIntArray493[local66] = local7 + 1;
				Static130.anIntArray293[local66] = local14 + 1;
				local66 = local66 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local7 + 1][local14 + 1] = 12;
				Static305.anIntArrayArray45[local7 + 1][local14 + 1] = local201;
			}
		}
		if (!local63) {
			local201 = 1000;
			@Pc(821) int local821 = 100;
			for (@Pc(828) int local828 = arg0 - 10; local828 <= arg0 + 10; local828++) {
				for (@Pc(837) int local837 = arg2 - 10; local837 <= arg2 + 10; local837++) {
					if (local828 >= 0 && local837 >= 0 && local828 < 104 && local837 < 104 && Static305.anIntArrayArray45[local828][local837] < 100) {
						@Pc(870) int local870 = 0;
						@Pc(872) int local872 = 0;
						if (local837 < arg2) {
							local870 = arg2 - local837;
						} else if (local837 > arg7 + arg2 - 1) {
							local870 = local837 + 1 - arg7 - arg2;
						}
						if (local828 < arg0) {
							local872 = arg0 - local828;
						} else if (local828 > arg5 + arg0 - 1) {
							local872 = local828 + 1 - arg5 - arg0;
						}
						@Pc(941) int local941 = local872 * local872 + local870 * local870;
						if (local941 < local201 || local941 == local201 && Static305.anIntArrayArray45[local828][local837] < local821) {
							local14 = local837;
							local7 = local828;
							local821 = Static305.anIntArrayArray45[local828][local837];
							local201 = local941;
						}
					}
				}
			}
			if (local201 == 1000) {
				return;
			}
			if (local7 == arg4 && arg3 == local14) {
				return;
			}
		}
		Static269.anInt5272 = local14;
		Static34.aBoolean52 = false;
		Static302.anInt5847 = local7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public static void method2438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static30.method572(Static53.anInt1319, arg0 + arg3, Static81.anInt1915);
		@Pc(35) int local35 = Static30.method572(Static53.anInt1319, arg0 - arg3, Static81.anInt1915);
		Static25.method486(Static275.anIntArrayArray37[arg2], local35, local23, arg1);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(67) int local67;
			@Pc(77) int local77;
			@Pc(93) int local93;
			@Pc(101) int local101;
			if (local12 > 0) {
				local9--;
				local67 = arg2 - local9;
				local12 -= local9 << 1;
				local77 = local9 + arg2;
				if (local77 >= Static148.anInt3245 && Static166.anInt3675 >= local67) {
					local93 = Static30.method572(Static53.anInt1319, arg0 + local7, Static81.anInt1915);
					local101 = Static30.method572(Static53.anInt1319, arg0 - local7, Static81.anInt1915);
					if (local77 <= Static166.anInt3675) {
						Static25.method486(Static275.anIntArrayArray37[local77], local101, local93, arg1);
					}
					if (local67 >= Static148.anInt3245) {
						Static25.method486(Static275.anIntArrayArray37[local67], local101, local93, arg1);
					}
				}
			}
			local7++;
			local67 = arg2 - local7;
			local77 = local7 + arg2;
			if (local77 >= Static148.anInt3245 && local67 <= Static166.anInt3675) {
				local93 = Static30.method572(Static53.anInt1319, local9 + arg0, Static81.anInt1915);
				local101 = Static30.method572(Static53.anInt1319, arg0 - local9, Static81.anInt1915);
				if (local77 <= Static166.anInt3675) {
					Static25.method486(Static275.anIntArrayArray37[local77], local101, local93, arg1);
				}
				if (local67 >= Static148.anInt3245) {
					Static25.method486(Static275.anIntArrayArray37[local67], local101, local93, arg1);
				}
			}
		}
	}
}
