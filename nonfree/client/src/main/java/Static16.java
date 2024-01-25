import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_15 = new Class150(33, 8);

	@OriginalMember(owner = "client!al", name = "J", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
	public static void method590() {
		for (@Pc(1) int local1 = 0; local1 < Static511.anInt8700; local1++) {
			if (!Static161.aBooleanArray14[local1]) {
				@Pc(10) Class250 local10 = Static24.aClass250Array3[local1];
				@Pc(13) Class5_Sub10 local13 = local10.aClass5_Sub10_3;
				@Pc(16) int local16 = local10.anInt7363;
				@Pc(22) int local22 = local13.method5191() - Static261.anInt5167;
				@Pc(30) int local30 = (local22 * 2 >> Static270.anInt5288) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5189() - local22 >> Static270.anInt5288;
				@Pc(53) int local53 = local13.method5183() - local22 >> Static270.anInt5288;
				@Pc(61) int local61 = local13.method5183() + local22 >> Static270.anInt5288;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static430.anInt7565) {
					local61 = Static430.anInt7565 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray116[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static374.anInt6925) {
						local108 = Static374.anInt6925 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class15_Sub2 local141 = Static188.method3173(local16, local125, local78, tv.class);
						if (local141 != null && local141.aByte90 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte90 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray116[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray116[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray116[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray116[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static161.aBooleanArray14[local1] = true;
				Static248.aClass131Array4[local16].method7187(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method592(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg1); local14 != -1; local14 = arg0.indexOf(arg1, local14 + arg2.length())) {
			arg0 = arg0.substring(0, local14) + arg2 + arg0.substring(arg1.length() + local14);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method593(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static59.anInt1208 >= 100 && !Static153.aBoolean206 || Static59.anInt1208 >= 200) {
			Static340.method5291(Static384.aClass40_117.method1063(Static194.anInt3737));
			return;
		}
		@Pc(29) String local29 = Static86.method1503(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(34) int local34 = 0; local34 < Static59.anInt1208; local34++) {
			@Pc(46) String local46 = Static86.method1503(Static23.aStringArray7[local34]);
			if (local46 != null && local46.equals(local29)) {
				Static340.method5291(arg0 + Static180.aClass40_57.method1063(Static194.anInt3737));
				return;
			}
			if (Static386.aStringArray18[local34] != null) {
				local76 = Static86.method1503(Static386.aStringArray18[local34]);
				if (local76 != null && local76.equals(local29)) {
					Static340.method5291(arg0 + Static180.aClass40_57.method1063(Static194.anInt3737));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static150.anInt3101; local102++) {
			local76 = Static86.method1503(Static3.aStringArray3[local102]);
			if (local76 != null && local76.equals(local29)) {
				Static340.method5291(Static22.aClass40_7.method1063(Static194.anInt3737) + arg0 + Static483.aClass40_143.method1063(Static194.anInt3737));
				return;
			}
			if (Static207.aStringArray20[local102] != null) {
				@Pc(145) String local145 = Static86.method1503(Static207.aStringArray20[local102]);
				if (local145 != null && local145.equals(local29)) {
					Static340.method5291(Static22.aClass40_7.method1063(Static194.anInt3737) + arg0 + Static483.aClass40_143.method1063(Static194.anInt3737));
					return;
				}
			}
		}
		if (Static86.method1503(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18).equals(local29)) {
			Static340.method5291(Static520.aClass40_151.method1063(Static194.anInt3737));
		} else {
			Static415.method5995(Static211.aClass236_42);
			Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(arg0));
			Static164.aClass5_Sub3_Sub1_2.method4208(arg0);
		}
	}
}
