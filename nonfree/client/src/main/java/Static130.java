import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public static int anInt4898;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
	public static int anInt4899;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray137 = new int[128][128];

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_90 = new Class93("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method4521(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub11_Sub19 local13 = Static306.method5411(16, arg0);
		local13.method5539();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	public static void method4522() {
		for (@Pc(1) int local1 = 0; local1 < Static350.anInt6740; local1++) {
			if (!Static99.aBooleanArray10[local1]) {
				@Pc(10) Class2_Sub36_Sub1 local10 = Static288.aClass2_Sub36_Sub1Array7[local1];
				@Pc(13) int local13 = local10.anInt5129;
				@Pc(18) int local18 = local10.anInt5108 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt5111 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt5115 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt5115 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static160.anInt3244) {
					local54 = Static160.anInt3244 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray77[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static223.anInt4280) {
						local101 = Static223.anInt4280 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class62_Sub1 local134 = Static280.method5066(local13, local118, local71, wl.class);
						if (local134 != null && local134.aByte55 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte55 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray77[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray77[local28 - 1];
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
									local175 = local10.aShortArray77[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray77[local28 + 1];
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
				Static99.aBooleanArray10[local1] = true;
				Static301.aClass73Array31[local13].method4933(local10, local33);
			}
		}
	}
}
