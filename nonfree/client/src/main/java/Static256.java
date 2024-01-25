import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZZ)V")
	public static void method4022(@OriginalArg(2) boolean arg0) {
		Static6.anInt170++;
		Static384.method5702();
		if (arg0) {
			Static275.anInt4897++;
			Static345.method5252();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
	public static void method4023() {
		for (@Pc(1) int local1 = 0; local1 < Static356.anInt6269; local1++) {
			if (!Static163.aBooleanArray64[local1]) {
				@Pc(10) Class2_Sub14_Sub1 local10 = Static305.aClass2_Sub14_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt2183;
				@Pc(18) int local18 = local10.anInt2166 - Static365.anInt2303;
				@Pc(26) int local26 = (local18 * 2 >> Static315.anInt5584) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt2170 - local18 >> Static315.anInt5584;
				@Pc(47) int local47 = local10.anInt2167 - local18 >> Static315.anInt5584;
				@Pc(54) int local54 = local10.anInt2167 + local18 >> Static315.anInt5584;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static244.anInt1024) {
					local54 = Static244.anInt1024 - 1;
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
					if (local101 >= Static166.anInt2967) {
						local101 = Static166.anInt2967 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class12_Sub1 local134 = Static86.method4712(local13, local118, local71, tq.class);
						if (local134 != null && local134.aByte73 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte73 == 1) {
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
				Static163.aBooleanArray64[local1] = true;
				Static17.aClass33Array1[local13].method4061(local10, local33);
			}
		}
	}
}
