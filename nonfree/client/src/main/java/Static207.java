import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V")
	public static void method2798() {
		Static81.anInt1504 = -1;
		Static436.aClass113_131 = null;
		Static402.aBoolean534 = false;
		Static156.anInt2618 = 0;
		Static442.anInt7354 = 2;
		Static218.anInt5620 = -1;
		Static356.anInt5885 = 1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
	public static void method2799() {
		for (@Pc(1) int local1 = 0; local1 < Static73.anInt1403; local1++) {
			if (!Static330.aBooleanArray25[local1]) {
				@Pc(10) Class71 local10 = Static280.aClass71Array1[local1];
				@Pc(13) Class1_Sub24 local13 = local10.aClass1_Sub24_1;
				@Pc(16) int local16 = local10.anInt1818;
				@Pc(22) int local22 = local13.method4374() - Static188.anInt3025;
				@Pc(30) int local30 = (local22 * 2 >> Static384.anInt6381) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4367() - local22 >> Static384.anInt6381;
				@Pc(53) int local53 = local13.method4369() - local22 >> Static384.anInt6381;
				@Pc(61) int local61 = local13.method4369() + local22 >> Static384.anInt6381;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static195.anInt3127) {
					local61 = Static195.anInt3127 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray30[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static362.anInt6113) {
						local108 = Static362.anInt6113 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class20_Sub3 local141 = Static422.method5254(local16, local125, local78, sq.class);
						if (local141 != null && local141.aByte88 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte88 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray30[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray30[local32 - 1];
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
									local182 = local10.aShortArray30[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray30[local32 + 1];
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
				Static330.aBooleanArray25[local1] = true;
				Static202.aClass163Array2[local16].method4515(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIIIBIII)V")
	public static void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static202.aClass163Array2 == null) {
			return;
		}
		@Pc(21) Class20_Sub3_Sub3 local21;
		@Pc(17) int local17;
		if (arg10 >= 0) {
			local17 = arg10 - 1;
			local21 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local17];
		} else {
			local17 = -arg10 - 1;
			if (local17 == Static348.anInt5668) {
				local21 = Static239.aClass20_Sub3_Sub3_Sub1_1;
			} else {
				local21 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local17];
			}
		}
		if (local21 == null) {
			return;
		}
		@Pc(47) Class141 local47 = Static259.aClass95_3.method1821(arg3);
		@Pc(58) int local58;
		@Pc(61) int local61;
		if (arg4 == 1 || arg4 == 3) {
			local58 = local47.anInt3403;
			local61 = local47.anInt3423;
		} else {
			local58 = local47.anInt3423;
			local61 = local47.anInt3403;
		}
		@Pc(75) int local75 = (local58 >> 1) + arg2;
		@Pc(88) int local88 = arg2 + (local58 + 1 >> 1);
		@Pc(94) int local94 = (local61 >> 1) + arg0;
		@Pc(102) int local102 = (local61 + 1 >> 1) + arg0;
		@Pc(106) Class163 local106 = Static202.aClass163Array2[arg1];
		@Pc(130) int local130 = local106.I(local75, local94) + local106.I(local88, local94) + local106.I(local75, local102) + local106.I(local88, local102) >> 2;
		@Pc(134) Class1_Sub38 local134 = new Class1_Sub38();
		local134.anInt6265 = arg0;
		local134.anInt6266 = arg5 + Static368.anInt6250;
		local134.anInt6277 = arg9;
		@Pc(150) int local150;
		if (arg6 > arg11) {
			local150 = arg6;
			arg6 = arg11;
			arg11 = local150;
		}
		local134.anInt6268 = local21.aByte89;
		local134.anInt6275 = arg12 + Static368.anInt6250;
		local134.anInt6269 = arg4;
		local134.anInt6267 = arg3;
		local134.anInt6271 = arg2;
		if (arg7 > arg8) {
			local150 = arg7;
			arg7 = arg8;
			arg8 = local150;
		}
		local134.anInt6264 = arg6 + arg2;
		local134.anInt6274 = arg2 + arg11;
		local134.anInt6270 = arg0 + arg7;
		local134.anInt6273 = arg8 + arg0;
		local134.anInt6263 = (local134.anInt6271 << 7) + (local58 << 6);
		local134.anInt6279 = (local61 << 6) + (local134.anInt6265 << 7);
		local134.anInt6272 = local130;
		Static256.aClass254_24.method5430(local134);
		local21.aClass1_Sub38_3 = local134;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
	public static boolean method2801(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
