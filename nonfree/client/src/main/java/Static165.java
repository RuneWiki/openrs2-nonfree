import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!oj;")
	public static Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt3459 = 0;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!ec;")
	public static Class46 aClass46_28 = new Class46(50);

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "J")
	public static long aLong180 = 0L;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString169 = " is already on your ignore list.";

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg3;
		@Pc(20) int local20 = arg1 * arg1;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg1 - arg3;
		@Pc(32) int local32 = local28 * local28;
		@Pc(36) int local36 = local16 * local16;
		@Pc(40) int local40 = local24 << 1;
		@Pc(44) int local44 = local20 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local16 << 1;
		@Pc(56) int local56 = arg4 << 1;
		@Pc(60) int local60 = local32 << 1;
		@Pc(69) int local69 = local40 + local20 * (1 - local56);
		@Pc(78) int local78 = local36 - (local52 - 1) * local60;
		@Pc(87) int local87 = local24 - (local56 - 1) * local44;
		@Pc(95) int local95 = local48 + (1 - local52) * local32;
		@Pc(99) int local99 = local20 << 2;
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(119) int local119 = local48 * 3;
		@Pc(125) int local125 = (local56 - 3) * local44;
		@Pc(127) int local127 = local103;
		@Pc(133) int local133 = local60 * (local52 - 3);
		@Pc(135) int local135 = local111;
		@Pc(141) int local141 = (arg4 - 1) * local99;
		@Pc(147) int local147 = local107 * (local16 - 1);
		@Pc(151) int[] local151 = Static274.anIntArrayArray50[arg0];
		Static133.method2321(arg6 - local28, arg6 - arg1, local151, arg2);
		Static133.method2321(arg6 + local28, -local28 + arg6, local151, arg5);
		Static133.method2321(arg6 + arg1, arg6 + local28, local151, arg2);
		while (local9 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local3++;
					local69 += local115;
					local115 += local103;
					local87 += local127;
					local127 += local103;
				}
			}
			if (local87 < 0) {
				local87 += local127;
				local3++;
				local127 += local103;
				local69 += local115;
				local115 += local103;
			}
			local87 += -local125;
			local125 -= local99;
			@Pc(257) boolean local257 = local9 <= local16;
			if (local257) {
				if (local95 < 0) {
					while (local95 < 0) {
						local11++;
						local78 += local135;
						local95 += local119;
						local119 += local111;
						local135 += local111;
					}
				}
				if (local78 < 0) {
					local95 += local119;
					local11++;
					local78 += local135;
					local119 += local111;
					local135 += local111;
				}
				local78 += -local133;
				local95 += -local147;
				local133 -= local107;
				local147 -= local107;
			}
			local69 += -local141;
			local9--;
			local141 -= local99;
			@Pc(338) int local338 = local9 + arg0;
			@Pc(343) int local343 = arg0 - local9;
			@Pc(347) int local347 = local3 + arg6;
			@Pc(352) int local352 = arg6 - local3;
			if (local257) {
				@Pc(379) int local379 = arg6 + local11;
				@Pc(384) int local384 = arg6 - local11;
				Static133.method2321(local384, local352, Static274.anIntArrayArray50[local343], arg2);
				Static133.method2321(local379, local384, Static274.anIntArrayArray50[local343], arg5);
				Static133.method2321(local347, local379, Static274.anIntArrayArray50[local343], arg2);
				Static133.method2321(local384, local352, Static274.anIntArrayArray50[local338], arg2);
				Static133.method2321(local379, local384, Static274.anIntArrayArray50[local338], arg5);
				Static133.method2321(local347, local379, Static274.anIntArrayArray50[local338], arg2);
			} else {
				Static133.method2321(local347, local352, Static274.anIntArrayArray50[local343], arg2);
				Static133.method2321(local347, local352, Static274.anIntArrayArray50[local338], arg2);
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method2847() {
		@Pc(10) int local10 = Static250.aClass2_Sub26_Sub1_2.method4278(8);
		@Pc(19) int local19;
		if (Static68.anInt1507 > local10) {
			for (local19 = local10; local19 < Static68.anInt1507; local19++) {
				Static33.anIntArray51[Static67.anInt6137++] = Static33.anIntArray50[local19];
			}
		}
		if (Static68.anInt1507 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static68.anInt1507 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(63) int local63 = Static33.anIntArray50[local19];
			@Pc(67) Class36_Sub3_Sub2 local67 = Static212.aClass36_Sub3_Sub2Array1[local63];
			@Pc(72) int local72 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
			if (local72 == 0) {
				Static33.anIntArray50[Static68.anInt1507++] = local63;
				local67.anInt5091 = Static148.anInt3168;
			} else {
				@Pc(96) int local96 = Static250.aClass2_Sub26_Sub1_2.method4278(2);
				if (local96 == 0) {
					Static33.anIntArray50[Static68.anInt1507++] = local63;
					local67.anInt5091 = Static148.anInt3168;
					Static161.anIntArray256[Static102.anInt2234++] = local63;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local96 == 1) {
						Static33.anIntArray50[Static68.anInt1507++] = local63;
						local67.anInt5091 = Static148.anInt3168;
						local142 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
						local67.method4094(1, local142);
						local152 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
						if (local152 == 1) {
							Static161.anIntArray256[Static102.anInt2234++] = local63;
						}
					} else if (local96 == 2) {
						Static33.anIntArray50[Static68.anInt1507++] = local63;
						local67.anInt5091 = Static148.anInt3168;
						if (Static250.aClass2_Sub26_Sub1_2.method4278(1) == 1) {
							local142 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
							local67.method4094(2, local142);
							local152 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
							local67.method4094(2, local152);
						} else {
							local142 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
							local67.method4094(0, local142);
						}
						local142 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
						if (local142 == 1) {
							Static161.anIntArray256[Static102.anInt2234++] = local63;
						}
					} else if (local96 == 3) {
						Static33.anIntArray51[Static67.anInt6137++] = local63;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)V")
	public static void method2848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg3 - 32) * arg3 / arg0;
		Static280.aClass71Array5[0].method4629(arg1, arg4);
		if (local11 < 8) {
			local11 = 8;
		}
		Static280.aClass71Array5[1].method4629(arg1, arg4 + arg3 - 16);
		@Pc(55) int local55 = arg2 * (arg3 - local11 - 32) / (arg0 - arg3);
		if (!Static60.aBoolean106) {
			Static160.method2788(arg1, arg4 + 16, 16, arg3 - 32, Static221.anInt4605);
			Static160.method2788(arg1, local55 + arg4 + 16, 16, local11, Static41.anInt1019);
			Static160.method2780(arg1, local55 + arg4 + 16, local11, Static91.anInt2031);
			Static160.method2780(arg1 + 1, arg4 - (-16 - local55), local11, Static91.anInt2031);
			Static160.method2791(arg1, arg4 + local55 + 16, 16, Static91.anInt2031);
			Static160.method2791(arg1, local55 + arg4 + 17, 16, Static91.anInt2031);
			Static160.method2780(arg1 + 15, arg4 + 16 + local55, local11, Static145.anInt3131);
			Static160.method2780(arg1 + 14, local55 + arg4 - -17, local11 - 1, Static145.anInt3131);
			Static160.method2791(arg1, local11 + arg4 + local55 + 15, 16, Static145.anInt3131);
			Static160.method2791(arg1 + 1, arg4 + 14 + (local55 - -local11), 15, Static145.anInt3131);
			return;
		}
		Static94.method1758(arg1, arg4 + 16, 16, arg3 - 32, Static221.anInt4605);
		Static94.method1758(arg1, arg4 + local55 + 16, 16, local11, Static41.anInt1019);
		Static94.method1755(arg1, local55 + arg4 + 16, local11, Static91.anInt2031);
		Static94.method1755(arg1 + 1, local55 + 16 + arg4, local11, Static91.anInt2031);
		Static94.method1745(arg1, arg4 + local55 + 16, 16, Static91.anInt2031);
		Static94.method1745(arg1, arg4 + local55 + 17, 16, Static91.anInt2031);
		Static94.method1755(arg1 + 15, local55 + 16 + arg4, local11, Static145.anInt3131);
		Static94.method1755(arg1 + 14, local55 + 17 + arg4, local11 - 1, Static145.anInt3131);
		Static94.method1745(arg1, arg4 + local55 + local11 + 15, 16, Static145.anInt3131);
		Static94.method1745(arg1 + 1, arg4 - -14 + local55 + local11, 15, Static145.anInt3131);
	}
}
