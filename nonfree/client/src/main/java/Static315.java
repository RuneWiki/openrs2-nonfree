import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!tr", name = "T", descriptor = "[I")
	public static int[] anIntArray593;

	@OriginalMember(owner = "client!tr", name = "L", descriptor = "I")
	public static int anInt6162 = 0;

	@OriginalMember(owner = "client!tr", name = "O", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_131 = new Class85("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
	public static int anInt6170 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5534(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static114.method1986("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "(I)V")
	public static void method5535() {
		if (Static311.aClass47_3 != null) {
			Static311.aClass47_3.method5326();
		}
		if (Static143.aClass47_1 != null) {
			Static143.aClass47_1.method5326();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "()V")
	public static void method5536() {
		for (@Pc(1) int local1 = 0; local1 < Static303.anInt5904; local1++) {
			if (!Static29.aBooleanArray4[local1]) {
				@Pc(10) Class5_Sub9_Sub1 local10 = Static182.aClass5_Sub9_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt722;
				@Pc(18) int local18 = local10.anInt705 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt703 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt708 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt708 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static236.anInt4222) {
					local54 = Static236.anInt4222 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray7[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static350.anInt6715) {
						local101 = Static350.anInt6715 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class4_Sub5 local134 = Static259.method4533(local13, local118, local71, ti.class);
						if (local134 != null && local134.aByte76 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte76 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray7[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray7[local28 - 1];
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
									local175 = local10.aShortArray7[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray7[local28 + 1];
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
				Static29.aBooleanArray4[local1] = true;
				Static8.aClass51Array1[local13].method1857(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[BII)Ljava/lang/String;")
	public static String method5537(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) char[] local12 = new char[arg1];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			@Pc(26) int local26 = arg0[arg2 + local16] & 0xFF;
			if (local26 != 0) {
				if (local26 >= 128 && local26 < 160) {
					@Pc(45) char local45 = Static198.aCharArray2[local26 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local26 = local45;
				}
				local12[local14++] = (char) local26;
			}
		}
		return new String(local12, 0, local14);
	}
}
