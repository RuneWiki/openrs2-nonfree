import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_187 = new Class208(89, 12);

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
	public static int anInt6330 = 0;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_188 = new Class208(52, 6);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()V")
	public static void method5496() {
		for (@Pc(1) int local1 = 0; local1 < Static184.anInt3912; local1++) {
			if (!Static160.aBooleanArray16[local1]) {
				@Pc(10) Class2_Sub8_Sub1 local10 = Static41.aClass2_Sub8_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt1381;
				@Pc(18) int local18 = local10.anInt1374 - Static291.anInt5453;
				@Pc(26) int local26 = (local18 * 2 >> Static162.anInt3362) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt1379 - local18 >> Static162.anInt3362;
				@Pc(47) int local47 = local10.anInt1377 - local18 >> Static162.anInt3362;
				@Pc(54) int local54 = local10.anInt1377 + local18 >> Static162.anInt3362;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static285.anInt5263) {
					local54 = Static285.anInt5263 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray15[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static176.anInt3742) {
						local101 = Static176.anInt3742 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class1_Sub2 local134 = Static278.method4615(local13, local118, local71, mt.class);
						if (local134 != null && local134.aByte74 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte74 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray15[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray15[local28 - 1];
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
									local175 = local10.aShortArray15[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray15[local28 + 1];
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
				Static160.aBooleanArray16[local1] = true;
				Static128.aClass149Array1[local13].method5830(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIB)I")
	public static int method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	public static void method5500() {
		@Pc(9) int[] local9 = new int[Static57.aClass196_1.anInt5461];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static57.aClass196_1.anInt5461; local13++) {
			@Pc(20) Class152 local20 = Static57.aClass196_1.method4827(local13);
			if (local20.anInt4344 >= 0 || local20.anInt4336 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static343.anIntArray540 = new int[local11];
		for (@Pc(44) int local44 = 0; local44 < local11; local44++) {
			Static343.anIntArray540[local44] = local9[local44];
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!g;ILclient!oj;)V")
	public static void method5504(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class48 arg1) {
		@Pc(10) Class128[] local10 = Static399.method3369(arg0, Static54.anInt1177);
		Static2.aClass27Array63 = new Class27[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static2.aClass27Array63[local16] = arg1.method2527(local10[local16]);
		}
		local10 = Static399.method3369(arg0, Static134.anInt2939);
		Static260.aClass27Array43 = new Class27[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static260.aClass27Array43[local43] = arg1.method2527(local10[local43]);
		}
		local10 = Static399.method3369(arg0, Static184.anInt3902);
		Static291.aClass27Array49 = new Class27[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static291.aClass27Array49[local74] = arg1.method2527(local10[local74]);
		}
		local10 = Static399.method3369(arg0, Static384.anInt6971);
		Static168.aClass27Array29 = new Class27[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static168.aClass27Array29[local101] = arg1.method2527(local10[local101]);
		}
		local10 = Static399.method3369(arg0, Static327.anInt6034);
		Static178.aClass27Array31 = new Class27[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static178.aClass27Array31[local128] = arg1.method2527(local10[local128]);
		}
		local10 = Static399.method3369(arg0, Static333.anInt6167);
		Static94.aClass27Array12 = new Class27[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static94.aClass27Array12[local155] = arg1.method2527(local10[local155]);
		}
		local10 = Static399.method3369(arg0, Static276.anInt7136);
		Static133.aClass27Array24 = new Class27[local10.length];
		for (@Pc(182) int local182 = 0; local182 < local10.length; local182++) {
			Static133.aClass27Array24[local182] = arg1.method2527(local10[local182]);
		}
		local10 = Static399.method3369(arg0, Static132.anInt2871);
		Static220.aClass27Array38 = new Class27[local10.length];
		for (@Pc(209) int local209 = 0; local209 < local10.length; local209++) {
			Static220.aClass27Array38[local209] = arg1.method2527(local10[local209]);
		}
		local10 = Static399.method3369(arg0, Static359.anInt6584);
		Static190.aClass27Array33 = new Class27[local10.length];
		for (@Pc(240) int local240 = 0; local240 < local10.length; local240++) {
			Static190.aClass27Array33[local240] = arg1.method2527(local10[local240]);
		}
		local10 = Static399.method3369(arg0, Static64.anInt1443);
		Static321.aClass27Array53 = new Class27[local10.length];
		for (@Pc(267) int local267 = 0; local267 < local10.length; local267++) {
			Static321.aClass27Array53[local267] = arg1.method2527(local10[local267]);
		}
		local10 = Static399.method3369(arg0, Static185.anInt3926);
		Static109.aClass27Array17 = new Class27[local10.length];
		for (@Pc(305) int local305 = 0; local305 < local10.length; local305++) {
			Static109.aClass27Array17[local305] = arg1.method2527(local10[local305]);
		}
		local10 = Static399.method3369(arg0, Static167.anInt3450);
		Static221.aClass27Array60 = new Class27[local10.length];
		for (@Pc(336) int local336 = 0; local336 < local10.length; local336++) {
			Static221.aClass27Array60[local336] = arg1.method2527(local10[local336]);
		}
		Static190.aClass27_12 = arg1.method2527(Static399.method3370(arg0, Static358.anInt6525, 0));
		Static62.aClass27_19 = arg1.method2527(Static399.method3370(arg0, Static303.anInt7069, 0));
		local10 = Static399.method3369(arg0, Static109.anInt2441);
		Static128.aClass27Array21 = new Class27[local10.length];
		for (@Pc(379) int local379 = 0; local379 < local10.length; local379++) {
			Static128.aClass27Array21[local379] = arg1.method2527(local10[local379]);
		}
	}
}
