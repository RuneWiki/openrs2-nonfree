import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!pi;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	public static int anInt5635;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString254;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
	public static final int[] anIntArray636 = new int[128];

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	public static int anInt5636 = 0;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt5639 = -1;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public static final int anInt5640 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)Z")
	public static boolean method5105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class66 local7 = Static196.method3622(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method1371(arg1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method5106() {
		Static191.aClass6_Sub12_Sub1_3.method1469();
		Static252.aClass53_117 = null;
		Static319.anInt5902 = 1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static318.anInt5896++;
		Static317.anInt5887 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static157.anInt2943; local7 < Static131.anInt2392; local7++) {
			@Pc(12) Class187[][] local12 = Static39.aClass187ArrayArrayArray1[local7];
			for (local14 = Static107.anInt1991; local14 < Static236.anInt2368; local14++) {
				for (@Pc(17) int local17 = Static23.anInt378; local17 < Static305.anInt5784; local17++) {
					@Pc(24) Class187 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static258.aBooleanArrayArray5[local14 + Static30.anInt573 - Static339.anInt6187][local17 + Static30.anInt573 - Static8.anInt3154] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean376 = true;
							local24.aBoolean374 = true;
							if (local24.aClass214_19 == null) {
								local24.aBoolean375 = false;
							} else {
								local24.aBoolean375 = true;
							}
							Static317.anInt5887++;
						} else {
							local24.aBoolean376 = false;
							local24.aBoolean374 = false;
							local24.aByte84 = 0;
							if (local14 >= Static339.anInt6187 - 16 && local14 <= Static339.anInt6187 + 16 && local17 >= Static8.anInt3154 - 16 && local17 <= Static8.anInt3154 + 16 && (local24.aClass44_Sub5_1 != null || local24.aClass44_Sub5_2 != null || local24.aClass44_Sub1_1 != null || local24.aClass44_Sub1_2 != null || local24.aClass44_Sub3_1 != null || local24.aClass214_19 != null)) {
								Static59.aClass155_1.method5563(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static84.aClass106Array1 == Static203.aClass106Array3;
		for (local14 = Static157.anInt2943; local14 < Static131.anInt2392; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static289.aClass81_6.method2988() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static258.aBooleanArrayArray5.length;
				if (Static107.anInt1991 + Static258.aBooleanArrayArray5.length > Static310.anInt5828) {
					local172 -= Static107.anInt1991 + Static258.aBooleanArrayArray5.length - Static310.anInt5828;
				}
				@Pc(192) int local192 = Static258.aBooleanArrayArray5[0].length;
				if (Static23.anInt378 + Static258.aBooleanArrayArray5[0].length > Static163.anInt3084) {
					local192 -= Static23.anInt378 + Static258.aBooleanArrayArray5[0].length - Static163.anInt3084;
				}
				@Pc(213) int local213 = Static28.anInt540;
				while (true) {
					if (local213 >= local172) {
						Static59.aClass155_1.method5566(local161, local14, true, Static203.aClass106Array3[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static107.anInt1991 - Static28.anInt540;
					for (@Pc(222) int local222 = Static2.anInt45; local222 < local192; local222++) {
						Static266.aBooleanArrayArray6[local213][local222] = false;
						if (Static258.aBooleanArrayArray5[local213][local222]) {
							@Pc(241) int local241 = local222 + Static23.anInt378 - Static2.anInt45;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static39.aClass187ArrayArrayArray1[local243][local220][local241] != null && Static39.aClass187ArrayArrayArray1[local243][local220][local241].aByte83 == local14) {
									Static266.aBooleanArrayArray6[local213][local222] = Static39.aClass187ArrayArrayArray1[local243][local220][local241].aBoolean376;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static59.aClass155_1.method5566(local161, local14, false, Static203.aClass106Array3[local14]);
			}
			Static59.aClass155_1.method5569();
		}
		if (!Static189.method3563(true)) {
			Static189.method3563(false);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!mb;)V")
	public static void method5108(@OriginalArg(1) Class132 arg0) {
		if (Static268.anInt5004 == arg0.anInt3574) {
			Static103.aBooleanArray18[arg0.anInt3567] = true;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method5109(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;ZI)Z")
	public static boolean method5111(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local33; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local26 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(91) int local91;
			if (local47 >= '0' && local47 <= '9') {
				local91 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local91 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local91 = local47 - 'W';
			} else {
				return false;
			}
			if (local91 >= 10) {
				return false;
			}
			if (local26) {
				local91 = -local91;
			}
			@Pc(113) int local113 = local91 + local30 * 10;
			if (local30 != local113 / 10) {
				return false;
			}
			local30 = local113;
			local28 = true;
		}
		return local28;
	}
}
