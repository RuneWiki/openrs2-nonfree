import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Lclient!am;")
	public static Class11 aClass11_145;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString240 = " has logged in.";

	@OriginalMember(owner = "client!um", name = "i", descriptor = "I")
	public static int anInt6408 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
	public static void method5364() {
		for (@Pc(1) int local1 = 0; local1 < Static161.anInt3632; local1++) {
			if (!Static6.aBooleanArray15[local1]) {
				@Pc(10) Class4_Sub12_Sub1 local10 = Static126.aClass4_Sub12_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt6093;
				@Pc(18) int local18 = local10.anInt6083 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt6082 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt6081 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt6081 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static220.anInt4569) {
					local54 = Static220.anInt4569 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray111[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static151.anInt3338) {
						local101 = Static151.anInt3338 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class2_Sub2 local134 = Static166.method3153(local13, local118, local71, hd.class);
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
									local175 = local10.aShortArray111[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray111[local28 - 1];
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
									local175 = local10.aShortArray111[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray111[local28 + 1];
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
				Static6.aBooleanArray15[local1] = true;
				Static307.aClass26Array3[local13].method4995(local10, local33);
			}
		}
	}
}
