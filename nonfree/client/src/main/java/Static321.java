import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "Lclient!nq;")
	public static Class144 aClass144_102;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
	public static void method5325() {
		for (@Pc(1) int local1 = 0; local1 < Static219.anInt4457; local1++) {
			if (!Static117.aBooleanArray10[local1]) {
				@Pc(10) Class11_Sub5_Sub1 local10 = Static171.aClass11_Sub5_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt1306;
				@Pc(18) int local18 = local10.anInt1289 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt1285 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt1286 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt1286 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static300.anInt5931) {
					local54 = Static300.anInt5931 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray40[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static232.anInt4703) {
						local101 = Static232.anInt4703 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class67_Sub3 local134 = Static284.method4725(local13, local118, local71, kr.class);
						if (local134 != null && local134.aByte72 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte72 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray40[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray40[local28 - 1];
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
									local175 = local10.aShortArray40[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray40[local28 + 1];
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
				Static117.aBooleanArray10[local1] = true;
				Static108.aClass77Array2[local13].method4137(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BIIILclient!gm;)V")
	public static void method5328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class84 arg3) {
		for (@Pc(14) Class11_Sub1 local14 = (Class11_Sub1) Static108.aClass16_19.method193(); local14 != null; local14 = (Class11_Sub1) Static108.aClass16_19.method188()) {
			if (local14.anInt98 == arg0 && local14.anInt88 == arg1 * 128 && local14.anInt97 == arg2 * 128 && local14.aClass84_1.anInt2012 == arg3.anInt2012) {
				if (local14.aClass11_Sub10_Sub1_2 != null) {
					Static341.aClass11_Sub10_Sub3_2.method3737(local14.aClass11_Sub10_Sub1_2);
					local14.aClass11_Sub10_Sub1_2 = null;
				}
				if (local14.aClass11_Sub10_Sub1_1 != null) {
					Static341.aClass11_Sub10_Sub3_2.method3737(local14.aClass11_Sub10_Sub1_1);
					local14.aClass11_Sub10_Sub1_1 = null;
				}
				local14.method5701();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method5331(@OriginalArg(0) String arg0) {
		return Static17.method226(16, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
	public static void method5337() {
		Static246.anInt4945 = Static102.aClass114_3.anInt2912 + Static102.aClass114_3.anInt2911 + 2;
		Static96.anInt1757 = Static332.aClass114_8.anInt2911 + Static332.aClass114_8.anInt2912 + 2;
		Static314.aStringArray21 = new String[500];
		for (@Pc(31) int local31 = 0; local31 < Static314.aStringArray21.length; local31++) {
			Static314.aStringArray21[local31] = "";
		}
	}
}
