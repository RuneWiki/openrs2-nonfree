import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "[[Lclient!ao;")
	public static Class14[][] aClass14ArrayArray1;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "[I")
	public static int[] anIntArray779;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
	public static int anInt6136;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "F")
	public static float aFloat76 = 0.0F;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!rk;IZ)Lclient!vm;")
	public static Class208 method5184(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) byte[] local17 = arg0.method4583(arg1);
		return local17 == null ? null : new Class208(local17);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
	public static void method5185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static20.anIntArrayArray5 != null) {
			Static20.anIntArrayArray5[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILclient!rk;)Lclient!gs;")
	public static Class7_Sub1_Sub10 method5186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class180 arg2) {
		@Pc(12) Class7_Sub3 local12 = new Class7_Sub3(arg2.method4560(arg1, arg0));
		@Pc(42) Class7_Sub1_Sub10 local42 = new Class7_Sub1_Sub10(arg1, local12.method2782(), local12.method2782(), local12.method2767(), local12.method2767(), local12.method2772() == 1, local12.method2772());
		@Pc(46) int local46 = local12.method2772();
		for (@Pc(48) int local48 = 0; local48 < local46; local48++) {
			local42.aClass74_10.method1802(new Class7_Sub13(local12.method2772(), local12.method2764(), local12.method2764(), local12.method2764(), local12.method2764(), local12.method2764(), local12.method2764(), local12.method2764(), local12.method2764()));
		}
		local42.method2133();
		return local42;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
	public static void method5187() {
		for (@Pc(1) int local1 = 0; local1 < Static105.anInt6014; local1++) {
			if (!Static42.aBooleanArray9[local1]) {
				@Pc(10) Class7_Sub16_Sub1 local10 = Static116.aClass7_Sub16_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt4088;
				@Pc(18) int local18 = local10.anInt4076 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4070 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt4072 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt4072 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static174.anInt3604) {
					local54 = Static174.anInt3604 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray70[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static346.anInt6536) {
						local101 = Static346.anInt6536 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class22_Sub2 local134 = Static252.method5177(local13, local118, local71, fo.class);
						if (local134 != null && local134.aByte68 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte68 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray70[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray70[local28 - 1];
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
									local175 = local10.aShortArray70[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray70[local28 + 1];
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
				Static42.aBooleanArray9[local1] = true;
				Static331.aClass8Array5[local13].method4162(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public static void method5188() {
		Static343.aClass103_71.method2678();
	}
}
