import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!wi", name = "F", descriptor = "Z")
	public static boolean aBoolean281;

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
	public static int anInt5531 = -2;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
	public static void method4205() {
		Static201.aClass79_29.method2487();
		Static100.aClass79_15.method2487();
		Static47.aClass79_5.method2487();
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
	public static void method4206() {
		if (!Static88.aBoolean138) {
			return;
		}
		@Pc(11) Class122 local11 = Static106.method2192(Static161.anInt3798, Static167.anInt3917);
		if (local11 != null && local11.anObjectArray23 != null) {
			@Pc(20) Class1_Sub30 local20 = new Class1_Sub30();
			local20.aClass122_18 = local11;
			local20.anObjectArray32 = local11.anObjectArray23;
			Static153.method2746(local20);
		}
		Static88.aBoolean138 = false;
		Static266.anInt5558 = -1;
		Static257.method4146(local11);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!df;Z)V")
	public static void method4207(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.anInt1358;
		@Pc(12) int local12 = (int) arg0.aLong184;
		arg0.method4186();
		if (arg1) {
			Static15.method253(local8);
		}
		Static144.method2611(local8);
		@Pc(32) Class122 local32 = Static206.method3444(local12);
		if (local32 != null) {
			Static257.method4146(local32);
		}
		@Pc(39) int local39 = Static230.anInt5417;
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			if (Static52.method1019(Static57.aShortArray26[local41])) {
				Static73.method1456(local41);
			}
		}
		if (Static230.anInt5417 == 1) {
			Static259.aBoolean280 = false;
			Static199.method3321(Static95.anInt2633, Static197.anInt2398, Static75.anInt2037, Static48.anInt1406);
		} else {
			Static199.method3321(Static95.anInt2633, Static197.anInt2398, Static75.anInt2037, Static48.anInt1406);
			@Pc(83) int local83 = Static120.aClass1_Sub2_Sub7_2.method1922(Static16.aString354);
			for (@Pc(85) int local85 = 0; local85 < Static230.anInt5417; local85++) {
				@Pc(93) int local93 = Static120.aClass1_Sub2_Sub7_2.method1922(Static174.method2990(local85));
				if (local83 < local93) {
					local83 = local93;
				}
			}
			Static75.anInt2037 = local83 + 8;
			Static197.anInt2398 = Static230.anInt5417 * 15 + (Static4.aBoolean4 ? 26 : 22);
		}
		if (Static140.anInt3388 != -1) {
			Static146.method2662(1, Static140.anInt3388);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static257.method4147(arg2);
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(19) int local19 = arg2 - arg3;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(26) int local26 = -arg2;
		@Pc(33) int local33 = -1;
		@Pc(36) int local36 = -local19;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = local19;
		@Pc(44) int[] local44 = Static29.anIntArrayArray10[arg5];
		@Pc(49) int local49 = arg0 - local19;
		Static147.method2681(local44, arg1, arg0 - arg2, local49);
		@Pc(63) int local63 = arg0 + local19;
		Static147.method2681(local44, arg4, local49, local63);
		Static147.method2681(local44, arg1, local63, arg2 + arg0);
		while (local14 > local12) {
			local33 += 2;
			local38 += 2;
			local36 += local33;
			local26 += local38;
			if (local36 >= 0 && local40 >= 1) {
				Static261.anIntArray467[local40] = local12;
				local40--;
				local36 -= local40 << 1;
			}
			local12++;
			@Pc(128) int[] local128;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(178) int local178;
			@Pc(183) int local183;
			@Pc(187) int local187;
			if (local26 >= 0) {
				local14--;
				if (local19 <= local14) {
					local128 = Static29.anIntArrayArray10[local14 + arg5];
					local134 = Static29.anIntArrayArray10[arg5 - local14];
					local138 = local12 + arg0;
					local143 = arg0 - local12;
					Static147.method2681(local128, arg1, local143, local138);
					Static147.method2681(local134, arg1, local143, local138);
				} else {
					local128 = Static29.anIntArrayArray10[local14 + arg5];
					local134 = Static29.anIntArrayArray10[arg5 - local14];
					local138 = Static261.anIntArray467[local14];
					local178 = arg0 - local12;
					local183 = arg0 + local138;
					local187 = arg0 - local138;
					Static147.method2681(local128, arg1, local178, local187);
					Static147.method2681(local128, arg4, local187, local183);
					local143 = arg0 + local12;
					Static147.method2681(local128, arg1, local183, local143);
					Static147.method2681(local134, arg1, local178, local187);
					Static147.method2681(local134, arg4, local187, local183);
					Static147.method2681(local134, arg1, local183, local143);
				}
				local26 -= local14 << 1;
			}
			local128 = Static29.anIntArrayArray10[arg5 + local12];
			local134 = Static29.anIntArrayArray10[arg5 - local12];
			local143 = arg0 - local14;
			local138 = local14 + arg0;
			if (local19 > local12) {
				local178 = local12 <= local40 ? local40 : Static261.anIntArray467[local12];
				local183 = local178 + arg0;
				local187 = arg0 - local178;
				Static147.method2681(local128, arg1, local143, local187);
				Static147.method2681(local128, arg4, local187, local183);
				Static147.method2681(local128, arg1, local183, local138);
				Static147.method2681(local134, arg1, local143, local187);
				Static147.method2681(local134, arg4, local187, local183);
				Static147.method2681(local134, arg1, local183, local138);
			} else {
				Static147.method2681(local128, arg1, local143, local138);
				Static147.method2681(local134, arg1, local143, local138);
			}
		}
	}
}
