import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIII)V")
	public static void method7519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static70.method967(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg1;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg5;
		@Pc(23) int local23 = -arg5;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(48) int local48;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(72) int local72;
		if (arg0 >= Static257.anInt4068 && arg0 <= Static67.anInt1214) {
			@Pc(40) int[] local40 = Static543.anIntArrayArray57[arg0];
			local48 = Static414.method5547(arg2 - arg5, Static379.anInt5914, Static624.anInt10032);
			local56 = Static414.method5547(arg5 + arg2, Static379.anInt5914, Static624.anInt10032);
			local64 = Static414.method5547(arg2 - local14, Static379.anInt5914, Static624.anInt10032);
			local72 = Static414.method5547(arg2 + local14, Static379.anInt5914, Static624.anInt10032);
			Static134.method1841(local40, local48, local64, arg4);
			Static134.method1841(local40, local64, local72, arg3);
			Static134.method1841(local40, local72, local56, arg4);
		}
		@Pc(92) int local92 = -1;
		while (local20 > local10) {
			local92 += 2;
			local30 += 2;
			local23 += local30;
			local28 += local92;
			if (local28 >= 0 && local25 >= 1) {
				local25--;
				local28 -= local25 << 1;
				Static486.anIntArray563[local25] = local10;
			}
			local10++;
			@Pc(242) int local242;
			@Pc(251) int local251;
			@Pc(262) int[] local262;
			@Pc(138) int local138;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local138 = arg0 - local20;
				local48 = arg0 + local20;
				if (local48 >= Static257.anInt4068 && Static67.anInt1214 >= local138) {
					if (local14 <= local20) {
						local56 = Static414.method5547(arg2 + local10, Static379.anInt5914, Static624.anInt10032);
						local64 = Static414.method5547(arg2 - local10, Static379.anInt5914, Static624.anInt10032);
						if (local48 <= Static67.anInt1214) {
							Static134.method1841(Static543.anIntArrayArray57[local48], local64, local56, arg4);
						}
						if (Static257.anInt4068 <= local138) {
							Static134.method1841(Static543.anIntArrayArray57[local138], local64, local56, arg4);
						}
					} else {
						local56 = Static486.anIntArray563[local20];
						local64 = Static414.method5547(arg2 + local10, Static379.anInt5914, Static624.anInt10032);
						local72 = Static414.method5547(arg2 - local10, Static379.anInt5914, Static624.anInt10032);
						local242 = Static414.method5547(arg2 + local56, Static379.anInt5914, Static624.anInt10032);
						local251 = Static414.method5547(arg2 - local56, Static379.anInt5914, Static624.anInt10032);
						if (local48 <= Static67.anInt1214) {
							local262 = Static543.anIntArrayArray57[local48];
							Static134.method1841(local262, local72, local251, arg4);
							Static134.method1841(local262, local251, local242, arg3);
							Static134.method1841(local262, local242, local64, arg4);
						}
						if (local138 >= Static257.anInt4068) {
							local262 = Static543.anIntArrayArray57[local138];
							Static134.method1841(local262, local72, local251, arg4);
							Static134.method1841(local262, local251, local242, arg3);
							Static134.method1841(local262, local242, local64, arg4);
						}
					}
				}
			}
			local138 = arg0 - local10;
			local48 = local10 + arg0;
			if (Static257.anInt4068 <= local48 && local138 <= Static67.anInt1214) {
				local56 = local20 + arg2;
				local64 = arg2 - local20;
				if (Static379.anInt5914 <= local56 && local64 <= Static624.anInt10032) {
					local56 = Static414.method5547(local56, Static379.anInt5914, Static624.anInt10032);
					local64 = Static414.method5547(local64, Static379.anInt5914, Static624.anInt10032);
					if (local14 > local10) {
						local72 = local25 >= local10 ? local25 : Static486.anIntArray563[local10];
						local242 = Static414.method5547(arg2 + local72, Static379.anInt5914, Static624.anInt10032);
						local251 = Static414.method5547(arg2 - local72, Static379.anInt5914, Static624.anInt10032);
						if (Static67.anInt1214 >= local48) {
							local262 = Static543.anIntArrayArray57[local48];
							Static134.method1841(local262, local64, local251, arg4);
							Static134.method1841(local262, local251, local242, arg3);
							Static134.method1841(local262, local242, local56, arg4);
						}
						if (Static257.anInt4068 <= local138) {
							local262 = Static543.anIntArrayArray57[local138];
							Static134.method1841(local262, local64, local251, arg4);
							Static134.method1841(local262, local251, local242, arg3);
							Static134.method1841(local262, local242, local56, arg4);
						}
					} else {
						if (Static67.anInt1214 >= local48) {
							Static134.method1841(Static543.anIntArrayArray57[local48], local64, local56, arg4);
						}
						if (local138 >= Static257.anInt4068) {
							Static134.method1841(Static543.anIntArrayArray57[local138], local64, local56, arg4);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIBILclient!aa;Ljava/lang/String;Lclient!da;Lclient!oq;Lclient!paa;II)V")
	public static void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class62 arg6, @OriginalArg(8) Class256 arg7, @OriginalArg(9) Class261 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static445.anInt7122 == 4) {
			local13 = (int) Static440.aFloat144 & 0x3FFF;
		} else {
			local13 = (int) Static440.aFloat144 + Static99.anInt7118 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg8.anInt6595 / 2, arg8.anInt6622 / 2) + 10;
		@Pc(42) int local42 = arg9 * arg9 + arg10 * arg10;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(64) int local64 = Canvas_Sub1.anIntArray497[local13];
		@Pc(68) int local68 = Canvas_Sub1.anIntArray498[local13];
		if (Static445.anInt7122 != 4) {
			local68 = local68 * 256 / (Static407.anInt9051 + 256);
			local64 = local64 * 256 / (Static407.anInt9051 + 256);
		}
		@Pc(100) int local100 = arg10 * local64 + local68 * arg9 >> 14;
		@Pc(111) int local111 = local68 * arg10 - local64 * arg9 >> 14;
		@Pc(118) int local118 = arg7.method5533(100, arg5, null);
		@Pc(124) int local124 = local100 - local118 / 2;
		@Pc(132) int local132 = arg7.method5536(0, 100, arg5, null);
		if (local124 >= -arg8.anInt6595 && local124 <= arg8.anInt6595 && -arg8.anInt6622 <= local111 && local111 <= arg8.anInt6622) {
			arg6.method5680(null, 1, local124 + arg1 + arg8.anInt6595 / 2, 0, arg3, arg1, 0, null, arg2, arg5, arg2 + arg8.anInt6622 / 2 - local132 - arg0 - local111, 0, arg4, local118, 50);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!gs;Z)Z")
	public static boolean method7521(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static314.aClass76Array2 == Static313.aClass76Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7691();
		if (arg0.aShort117 < 0 || arg0.aShort119 < 0 || arg0.aShort120 >= Static322.anInt5120 || arg0.aShort118 >= Class13_Sub1_Sub4_Sub1.lb) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort117; local36 <= arg0.aShort120; local36++) {
			for (local40 = arg0.aShort119; local40 <= arg0.aShort118; local40++) {
				@Pc(47) Class53 local47 = Static435.method2767(arg0.aByte127, local36, local40);
				if (local47 != null) {
					@Pc(53) Class325 local53 = Static441.method5552(arg0);
					@Pc(56) Class325 local56 = local47.aClass325_1;
					if (local56 == null) {
						local47.aClass325_1 = local53;
					} else {
						while (local56.aClass325_3 != null) {
							local56 = local56.aClass325_3;
						}
						local56.aClass325_3 = local53;
					}
					if (local6 && (Static491.anIntArrayArray50[local36][local40] & 0xFF000000) != 0) {
						local8 = Static491.anIntArrayArray50[local36][local40];
						local10 = Static459.aShortArrayArray25[local36][local40];
						local12 = Static136.aByteArrayArray32[local36][local40];
					}
					if (!arg1 && local47.aClass13_Sub1_Sub2_1 != null && local47.aClass13_Sub1_Sub2_1.aShort55 > local33) {
						local33 = local47.aClass13_Sub1_Sub2_1.aShort55;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort117; local40 <= arg0.aShort120; local40++) {
				for (@Pc(136) int local136 = arg0.aShort119; local136 <= arg0.aShort118; local136++) {
					if ((Static491.anIntArrayArray50[local40][local136] & 0xFF000000) == 0) {
						Static491.anIntArrayArray50[local40][local136] = local8;
						Static459.aShortArrayArray25[local40][local136] = local10;
						Static136.aByteArrayArray32[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static335.aClass13_Sub1_Sub1Array1[Static332.anInt5259++] = arg0;
		} else {
			local40 = Static314.aClass76Array2 == Static313.aClass76Array1 ? 1 : 0;
			if (!arg0.method8408()) {
				Static139.aClass13_Sub1ArrayArray1[local40][Static497.anIntArray571[local40]++] = arg0;
			} else if (arg0.method8413()) {
				Static417.aClass13_Sub1ArrayArray2[local40][Static28.anIntArray63[local40]++] = arg0;
			} else {
				Static597.aClass13_Sub1ArrayArray3[local40][Static369.anIntArray426[local40]++] = arg0;
				Static116.aBoolean155 = true;
			}
		}
		if (arg1) {
			arg0.anInt10097 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIZI)V")
	public static void method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 0) {
			Static393.method5366(false);
		} else {
			Static50.anInt1058 = Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280();
			Static317.method4257(true, 0);
		}
		Static514.anInt8566 = arg1;
		Static528.anInt8671 = arg2;
		Static350.aBoolean400 = arg3;
		Static193.method1305(arg0);
	}
}
