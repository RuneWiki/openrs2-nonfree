import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!ke;")
	public static Class122 aClass122_2;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString90 = "glow3:";

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt2236 = -1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IC)Z")
	public static boolean method1837(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	public static void method1839() {
		for (@Pc(1) int local1 = 0; local1 < Static168.anInt3459; local1++) {
			if (!Static331.aBooleanArray18[local1]) {
				@Pc(10) Class1_Sub19_Sub1 local10 = Static174.aClass1_Sub19_Sub1Array4[local1];
				@Pc(13) int local13 = local10.anInt2490;
				@Pc(18) int local18 = local10.anInt2479 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt2482 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt2484 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt2484 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static3.anInt38) {
					local54 = Static3.anInt38 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray39[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static97.anInt1852) {
						local101 = Static97.anInt1852 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class10_Sub1 local134 = Static183.method3234(local13, local118, local71, va.class);
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
									local175 = local10.aShortArray39[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray39[local28 - 1];
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
									local175 = local10.aShortArray39[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray39[local28 + 1];
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
				Static331.aBooleanArray18[local1] = true;
				Static263.aClass12Array2[local13].method2695(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ii;IIB)V")
	public static void method1840(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static152.aClass105_9 = arg0;
		Static89.aClass172ArrayArray1 = new Class172[arg2][arg1];
		if (Static332.anIntArray651 != null) {
			Static12.aClass78_1 = Static275.method4909(Static332.anIntArray651[3], Static332.anIntArray651[4], Static332.anIntArray651[1], Static332.anIntArray651[0], Static332.anIntArray651[5], Static332.anIntArray651[2]);
		}
		Static64.aClass172_1 = new Class172();
		Static269.method4847();
	}
}
