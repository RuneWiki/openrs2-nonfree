import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public static int anInt3809;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	public static void method3336() {
		for (@Pc(1) int local1 = 0; local1 < Static88.anInt1647; local1++) {
			if (!Static121.aBooleanArray10[local1]) {
				@Pc(10) Class2_Sub10_Sub1 local10 = Static120.aClass2_Sub10_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt4052;
				@Pc(18) int local18 = local10.anInt4042 - Static31.anInt496;
				@Pc(26) int local26 = (local18 * 2 >> Static325.anInt6336) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4039 - local18 >> Static325.anInt6336;
				@Pc(47) int local47 = local10.anInt4043 - local18 >> Static325.anInt6336;
				@Pc(54) int local54 = local10.anInt4043 + local18 >> Static325.anInt6336;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static63.anInt1129) {
					local54 = Static63.anInt1129 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray59[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static344.anInt6692) {
						local101 = Static344.anInt6692 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class1_Sub2 local134 = Static109.method2112(local13, local118, local71, bs.class);
						if (local134 != null && local134.aByte76 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte76 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray59[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray59[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray59[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray59[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static121.aBooleanArray10[local1] = true;
				Static9.aClass105Array1[local13].method4454(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method3337(@OriginalArg(1) Class179 arg0) {
		@Pc(12) Class209 local12 = null;
		try {
			@Pc(16) Class26 local16 = arg0.method4885();
			while (local16.anInt484 == 0) {
				Static248.method4401(1L);
			}
			if (local16.anInt484 == 1) {
				local12 = (Class209) local16.anObject1;
				@Pc(39) Class2_Sub12 local39 = Static156.method3215();
				local12.method5625(local39.anInt3606, local39.aByteArray30, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local12 != null) {
				local12.method5628();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}
}
