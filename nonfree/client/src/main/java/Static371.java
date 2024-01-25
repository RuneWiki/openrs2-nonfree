import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public static int anInt6244 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "()V")
	public static void method4861() {
		for (@Pc(1) int local1 = 0; local1 < Static268.anInt5045; local1++) {
			if (!Static210.aBooleanArray17[local1]) {
				@Pc(10) Class191 local10 = Static375.aClass191Array2[local1];
				@Pc(13) Class3_Sub8 local13 = local10.aClass3_Sub8_2;
				@Pc(16) int local16 = local10.anInt5456;
				@Pc(22) int local22 = local13.method4400() - Static421.anInt6887;
				@Pc(30) int local30 = (local22 * 2 >> Static336.anInt5747) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4404() - local22 >> Static336.anInt5747;
				@Pc(53) int local53 = local13.method4395() - local22 >> Static336.anInt5747;
				@Pc(61) int local61 = local13.method4395() + local22 >> Static336.anInt5747;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static37.anInt1025) {
					local61 = Static37.anInt1025 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray107[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static405.anInt6684) {
						local108 = Static405.anInt6684 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class7_Sub2 local141 = Static314.method4348(local16, local125, local78, nu.class);
						if (local141 != null && local141.aByte76 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte76 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray107[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray107[local32 - 1];
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
									local182 = local10.aShortArray107[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray107[local32 + 1];
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
				Static210.aBooleanArray17[local1] = true;
				Static444.aClass159Array3[local16].method4835(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[Ljava/lang/Object;[IIB)V")
	public static void method4862(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(12) int local12 = (arg0 + arg3) / 2;
		@Pc(14) int local14 = arg3;
		@Pc(18) int local18 = arg2[local12];
		arg2[local12] = arg2[arg0];
		arg2[arg0] = local18;
		@Pc(32) Object local32 = arg1[local12];
		arg1[local12] = arg1[arg0];
		arg1[arg0] = local32;
		@Pc(49) int local49 = local18 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg3; local51 < arg0; local51++) {
			if ((local51 & local49) + local18 > arg2[local51]) {
				@Pc(65) int local65 = arg2[local51];
				arg2[local51] = arg2[local14];
				arg2[local14] = local65;
				@Pc(79) Object local79 = arg1[local51];
				arg1[local51] = arg1[local14];
				arg1[local14++] = local79;
			}
		}
		arg2[arg0] = arg2[local14];
		arg2[local14] = local18;
		arg1[arg0] = arg1[local14];
		arg1[local14] = local32;
		method4862(local14 - 1, arg1, arg2, arg3);
		method4862(arg0, arg1, arg2, local14 + 1);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!ck;)I")
	public static int method4867(@OriginalArg(1) Class3_Sub7_Sub1 arg0) {
		@Pc(8) int local8 = arg0.method1063(2);
		@Pc(15) int local15;
		if (local8 == 0) {
			local15 = 0;
		} else if (local8 == 1) {
			local15 = arg0.method1063(5);
		} else if (local8 == 2) {
			local15 = arg0.method1063(8);
		} else {
			local15 = arg0.method1063(11);
		}
		return local15;
	}
}
