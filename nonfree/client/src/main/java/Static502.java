import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
	public static int anInt8651;

	@OriginalMember(owner = "client!rq", name = "R", descriptor = "Lclient!kca;")
	public static final Class182 aClass182_14 = new Class182(4);

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)Lclient!dk;")
	public static Class3_Sub14 method7404() {
		return Static250.anInt4604 == 0 ? new Class3_Sub14() : Static465.aClass3_Sub14Array1[--Static250.anInt4604];
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZIB)Lclient!ir;")
	public static Class3_Sub29 method7412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub29 local7 = new Class3_Sub29();
		local7.anInt4603 = arg3;
		local7.anInt4601 = arg1;
		Static356.aClass280_29.method7109(local7, (long) arg0);
		Static117.method2402(arg1);
		@Pc(34) Class279 local34 = Static433.method6771(arg0);
		if (local34 != null) {
			Static482.method7193(local34);
		}
		if (Static25.aClass279_13 != null) {
			Static482.method7193(Static25.aClass279_13);
			Static25.aClass279_13 = null;
		}
		Static206.method3540();
		if (local34 != null) {
			Static5.method3192(local34, !arg2);
		}
		if (!arg2) {
			Static304.method4838(arg1);
		}
		if (!arg2 && Static307.anInt5465 != -1) {
			Static596.method8356(1, Static307.anInt5465);
		}
		return local7;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "()V")
	public static void method7415() {
		for (@Pc(1) int local1 = 0; local1 < Static99.anInt2252; local1++) {
			if (!Static303.aBooleanArray16[local1]) {
				@Pc(10) Class206 local10 = Static89.aClass206Array1[local1];
				@Pc(13) Class3_Sub16 local13 = local10.aClass3_Sub16_3;
				@Pc(16) int local16 = local10.anInt6053;
				@Pc(22) int local22 = local13.method4781() - Static161.anInt3180;
				@Pc(30) int local30 = (local22 * 2 >> Static308.anInt5834) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4778() - local22 >> Static308.anInt5834;
				@Pc(53) int local53 = local13.method4783() - local22 >> Static308.anInt5834;
				@Pc(61) int local61 = local13.method4783() + local22 >> Static308.anInt5834;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static293.anInt5181) {
					local61 = Static293.anInt5181 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray78[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static569.anInt9425) {
						local108 = Static569.anInt9425 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class4_Sub1_Sub2 local141 = Static572.method8142(local16, local125, local78, jf.class);
						if (local141 != null && local141.aByte125 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte125 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray78[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray78[local32 - 1];
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
									local182 = local10.aShortArray78[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray78[local32 + 1];
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
				Static303.aBooleanArray16[local1] = true;
				Static364.aClass51Array3[local16].method7834(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)Lclient!gm;")
	public static Class128 method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass128_1;
	}
}
