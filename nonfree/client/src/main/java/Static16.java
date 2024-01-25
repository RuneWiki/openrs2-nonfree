import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Lclient!ph;")
	public static Class187 aClass187_6;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public static int anInt302;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "F")
	public static float aFloat6 = 1024.0F;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ms;IIIIIZ)V")
	public static void method243(@OriginalArg(0) Class24_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static95.method1725(arg0.anInt7094, 0, arg2, arg1, arg0.aByte98, arg3, arg0.anInt7092);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	public static void method244() {
		Static206.method3214();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static11.aClass220Array1[local13].method4879();
		}
		Static341.method4585();
		Static365.method2561();
		System.gc();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lclient!gh;BI)V")
	public static void method245(@OriginalArg(0) Class89[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class89 local17 = arg0[local11];
			if (local17 != null && arg1 == local17.anInt2694 && !Static56.method998(local17)) {
				if (local17.anInt2727 == 0) {
					method245(arg0, local17.anInt2677);
					if (local17.aClass89Array1 != null) {
						method245(local17.aClass89Array1, local17.anInt2677);
					}
					@Pc(55) Class10_Sub21 local55 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local17.anInt2677);
					if (local55 != null) {
						Static298.method4150(local55.anInt3646);
					}
				}
				if (local17.anInt2727 == 6 && local17.anInt2697 != -1) {
					@Pc(77) Class137 local77 = Static281.aClass98_3.method2405(local17.anInt2697);
					if (local77 != null) {
						local17.anInt2661 += Static68.anInt1469;
						while (local17.anInt2661 > local77.anIntArray404[local17.anInt2704]) {
							local17.anInt2661 -= local77.anIntArray404[local17.anInt2704];
							local17.anInt2704++;
							if (local17.anInt2704 >= local77.anIntArray403.length) {
								local17.anInt2704 -= local77.anInt4046;
								if (local17.anInt2704 < 0 || local77.anIntArray403.length <= local17.anInt2704) {
									local17.anInt2704 = 0;
								}
							}
							local17.anInt2665 = local17.anInt2704 + 1;
							if (local17.anInt2665 >= local77.anIntArray403.length) {
								local17.anInt2665 -= local77.anInt4046;
								if (local17.anInt2665 < 0 || local17.anInt2665 >= local77.anIntArray403.length) {
									local17.anInt2665 = -1;
								}
							}
							Static135.method5400(local17);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!sf;B)V")
	public static void method248(@OriginalArg(0) Class24_Sub3_Sub2_Sub2 arg0) {
		@Pc(16) Class10_Sub23 local16 = (Class10_Sub23) Static414.aClass167_32.method3709((long) arg0.anInt6228);
		if (local16 == null) {
			Static129.method2264(arg0.anIntArray611[0], arg0, null, arg0.anIntArray610[0], 0, arg0.aByte98, null);
		} else {
			local16.method3170();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([[BLclient!h;I)V")
	public static void method250(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class101_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg1.anInt2932; local19++) {
			Static278.method4705();
			for (@Pc(25) int local25 = 0; local25 < Static2.anInt7 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static17.anInt315 >> 3; local29++) {
					@Pc(39) int local39 = Static32.anIntArrayArrayArray1[local19][local25][local29];
					if (local39 != -1) {
						@Pc(49) int local49 = local39 >> 24 & 0x3;
						if (!arg1.aBoolean213 || local49 == 0) {
							@Pc(63) int local63 = local39 >> 1 & 0x3;
							@Pc(69) int local69 = local39 >> 14 & 0x3FF;
							@Pc(75) int local75 = local39 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < Static144.anIntArray288.length; local87++) {
								if (local85 == Static144.anIntArray288[local87] && arg0[local87] != null) {
									@Pc(109) Class10_Sub8 local109 = new Class10_Sub8(arg0[local87]);
									arg1.method2436(local109, local29 * 8, local63, local75, local25 * 8, Static11.aClass220Array1, local49, local19, local69);
									arg1.method2446(local17[0] == -1 ? local17 : null, local25 * 8, local63, Static412.aClass50_8, local75, local69, local29 * 8, local19, local109, local49);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local17[0] != -1) {
			Static378.aClass230_1 = Static88.aClass47_2.method1078(local17[0], local17[2], local17[3], Static314.aClass158_1, local17[1]);
			Static352.anInt6038 = local17[4];
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method251(@OriginalArg(1) String arg0) {
		if (Static80.aStringArray13 == null) {
			Static165.method5195();
		}
		@Pc(14) String[] local14 = Static253.method3686('\n', arg0);
		for (@Pc(24) int local24 = 0; local24 < local14.length; local24++) {
			for (@Pc(28) int local28 = Static250.anInt4507; local28 > 0; local28--) {
				Static80.aStringArray13[local28] = Static80.aStringArray13[local28 - 1];
			}
			Static80.aStringArray13[0] = local14[local24];
			if (Static80.aStringArray13.length - 1 > Static250.anInt4507) {
				if (Static302.anInt5234 > 0) {
					Static302.anInt5234++;
				}
				Static250.anInt4507++;
			}
		}
	}
}
