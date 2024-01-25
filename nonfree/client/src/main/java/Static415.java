import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass39;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public static final int[] anIntArray520 = new int[1];

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
	public static boolean aBoolean615 = true;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Z")
	public static boolean method6538(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	public static void method6539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(34) int local34 = Static67.method9535(Static8.anInt99, arg2 + arg0, Static14.anInt206);
		@Pc(43) int local43 = Static67.method9535(Static8.anInt99, arg2 - arg0, Static14.anInt206);
		Static494.method7075(local43, arg3, local34, Static449.anIntArrayArray48[arg1], 18601);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(75) int local75;
			@Pc(80) int local80;
			@Pc(100) int local100;
			@Pc(109) int local109;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local75 = arg1 - local9;
				local80 = arg1 + local9;
				if (local80 >= Static617.anInt9501 && local75 <= Static519.anInt8267) {
					local100 = Static67.method9535(Static8.anInt99, local7 + arg2, Static14.anInt206);
					local109 = Static67.method9535(Static8.anInt99, arg2 - local7, Static14.anInt206);
					if (Static519.anInt8267 >= local80) {
						Static494.method7075(local109, arg3, local100, Static449.anIntArrayArray48[local80], 18601);
					}
					if (local75 >= Static617.anInt9501) {
						Static494.method7075(local109, arg3, local100, Static449.anIntArrayArray48[local75], 18601);
					}
				}
			}
			local7++;
			local75 = arg1 - local7;
			local80 = local7 + arg1;
			if (Static617.anInt9501 <= local80 && Static519.anInt8267 >= local75) {
				local100 = Static67.method9535(Static8.anInt99, local9 + arg2, Static14.anInt206);
				local109 = Static67.method9535(Static8.anInt99, arg2 - local9, Static14.anInt206);
				if (Static519.anInt8267 >= local80) {
					Static494.method7075(local109, arg3, local100, Static449.anIntArrayArray48[local80], 18601);
				}
				if (local75 >= Static617.anInt9501) {
					Static494.method7075(local109, arg3, local100, Static449.anIntArrayArray48[local75], 18601);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public static void method6540() {
		for (@Pc(1) int local1 = 0; local1 < Static488.anInt7862; local1++) {
			if (!Static336.aBooleanArray24[local1]) {
				@Pc(10) Class248 local10 = Static292.aClass248Array1[local1];
				@Pc(13) Class2_Sub7 local13 = local10.aClass2_Sub7_3;
				@Pc(16) int local16 = local10.anInt6688;
				@Pc(22) int local22 = local13.method8173() - Static328.anInt5032;
				@Pc(30) int local30 = (local22 * 2 >> Static260.anInt4053) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8171() - local22 >> Static260.anInt4053;
				@Pc(53) int local53 = local13.method8172() - local22 >> Static260.anInt4053;
				@Pc(61) int local61 = local13.method8172() + local22 >> Static260.anInt4053;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static545.anInt8590) {
					local61 = Static545.anInt8590 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray111[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static372.anInt5930) {
						local108 = Static372.anInt5930 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class4_Sub2_Sub1 local144 = Static140.method2072(local16, local125, local78, aClass39 == null ? (aClass39 = Class33.a("kg")) : aClass39);
						if (local144 != null && local144.aByte135 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte135 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray111[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray111[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray111[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray111[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static336.aBooleanArray24[local1] = true;
				Static158.aClass133Array4[local16].method8215(local13, local37);
			}
		}
	}
}
