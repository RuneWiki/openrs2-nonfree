import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	public static int anInt1634;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!kn;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	public static int anInt1635;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()V", line = 7)
	public static void method1767() {
		for (@Pc(1) int local1 = 0; local1 < Static154.anInt3135; local1++) {
			if (!Static326.aBooleanArray57[local1]) {
				@Pc(10) Class2_Sub26_Sub1 local10 = Static283.aClass2_Sub26_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt4373;
				@Pc(18) int local18 = local10.anInt4367 - Static233.anInt4684;
				@Pc(26) int local26 = (local18 * 2 >> Static299.anInt6017) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt4363 - local18 >> Static299.anInt6017;
				@Pc(47) int local47 = local10.anInt4364 - local18 >> Static299.anInt6017;
				@Pc(54) int local54 = local10.anInt4364 + local18 >> Static299.anInt6017;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static196.anInt3769) {
					local54 = Static196.anInt3769 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray91[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static68.anInt1682) {
						local101 = Static68.anInt1682 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class11_Sub5 local134 = Static98.method2209(local13, local118, local71, hb.class);
						if (local134 != null && local134.aByte77 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte77 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray91[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray91[local28 - 1];
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
									local175 = local10.aShortArray91[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray91[local28 + 1];
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
				Static326.aBooleanArray57[local1] = true;
				Static340.aClass6Array4[local13].method5722(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V", line = 348)
	public static void method1774() {
		if (Static260.aBoolean383) {
			Static260.aBoolean383 = false;
			Static232.aClass13_14 = null;
			Static310.aClass13_21 = null;
		}
	}
}
