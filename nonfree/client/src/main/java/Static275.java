import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "[I")
	public static final int[] anIntArray412 = new int[5];

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	public static int anInt4710 = 0;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_73 = new Class25(0, -1);

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
	public static void method4183() {
		if (Static71.aBoolean131) {
			Static410.aClass12_19 = null;
			Static349.aClass12_17 = null;
			Static71.aBoolean131 = false;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()V")
	public static void method4185() {
		Static268.anInt4599 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static269.anInt4605; local3++) {
			@Pc(8) Class219 local8 = Static84.aClass219Array2[local3];
			@Pc(12) int local12;
			if (Static232.anIntArray339 != null) {
				for (local12 = 0; local12 < Static232.anIntArray339.length; local12++) {
					if (Static232.anIntArray339[local12] != -1000000 && (local8.anInt5940 <= Static232.anIntArray339[local12] || local8.anInt5937 <= Static232.anIntArray339[local12]) && (local8.anInt5943 <= Static18.anIntArray23[local12] || local8.anInt5933 <= Static18.anIntArray23[local12]) && (local8.anInt5943 >= Static173.anIntArray281[local12] || local8.anInt5933 >= Static173.anIntArray281[local12]) && (local8.anInt5936 <= Static393.anIntArray495[local12] || local8.anInt5931 <= Static393.anIntArray495[local12]) && (local8.anInt5936 >= Static327.anIntArray488[local12] || local8.anInt5931 >= Static327.anIntArray488[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt5935 == 1) {
				local12 = local8.anInt5939 + Static99.anInt1813 - Static165.anInt2942;
				if (local12 >= 0 && local12 <= Static99.anInt1813 + Static99.anInt1813) {
					local110 = local8.anInt5938 + Static99.anInt1813 - Static97.anInt1799;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static99.anInt1813 + Static99.anInt1813) {
						continue;
					}
					local128 = local8.anInt5934 + Static99.anInt1813 - Static97.anInt1799;
					if (local128 > Static99.anInt1813 + Static99.anInt1813) {
						local128 = Static99.anInt1813 + Static99.anInt1813;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static27.aBooleanArrayArray2[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static385.anInt6349 - local8.anInt5943;
						if (local164 > Static113.anInt2013) {
							local8.anInt5942 = 1;
						} else {
							if (local164 >= -Static113.anInt2013) {
								continue;
							}
							local8.anInt5942 = 2;
							local164 = -local164;
						}
						local8.anInt5927 = (local8.anInt5936 - Static352.anInt5944 << 8) / local164;
						local8.anInt5941 = (local8.anInt5931 - Static352.anInt5944 << 8) / local164;
						local8.anInt5928 = (local8.anInt5940 - Static72.anInt1493 << 8) / local164;
						local8.anInt5926 = (local8.anInt5937 - Static72.anInt1493 << 8) / local164;
						Static51.aClass219Array1[Static268.anInt4599++] = local8;
					}
				}
			} else if (local8.anInt5935 == 2) {
				local12 = local8.anInt5938 + Static99.anInt1813 - Static97.anInt1799;
				if (local12 >= 0 && local12 <= Static99.anInt1813 + Static99.anInt1813) {
					local110 = local8.anInt5939 + Static99.anInt1813 - Static165.anInt2942;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static99.anInt1813 + Static99.anInt1813) {
						continue;
					}
					local128 = local8.anInt5929 + Static99.anInt1813 - Static165.anInt2942;
					if (local128 > Static99.anInt1813 + Static99.anInt1813) {
						local128 = Static99.anInt1813 + Static99.anInt1813;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static27.aBooleanArrayArray2[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static352.anInt5944 - local8.anInt5936;
						if (local164 > Static113.anInt2013) {
							local8.anInt5942 = 3;
						} else {
							if (local164 >= -Static113.anInt2013) {
								continue;
							}
							local8.anInt5942 = 4;
							local164 = -local164;
						}
						local8.anInt5945 = (local8.anInt5943 - Static385.anInt6349 << 8) / local164;
						local8.anInt5930 = (local8.anInt5933 - Static385.anInt6349 << 8) / local164;
						local8.anInt5928 = (local8.anInt5940 - Static72.anInt1493 << 8) / local164;
						local8.anInt5926 = (local8.anInt5937 - Static72.anInt1493 << 8) / local164;
						Static51.aClass219Array1[Static268.anInt4599++] = local8;
					}
				}
			} else if (local8.anInt5935 == 4) {
				local12 = local8.anInt5940 - Static72.anInt1493;
				if (local12 > Static192.anInt3387) {
					local110 = local8.anInt5938 + Static99.anInt1813 - Static97.anInt1799;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static99.anInt1813 + Static99.anInt1813) {
						continue;
					}
					local128 = local8.anInt5934 + Static99.anInt1813 - Static97.anInt1799;
					if (local128 > Static99.anInt1813 + Static99.anInt1813) {
						local128 = Static99.anInt1813 + Static99.anInt1813;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt5939 + Static99.anInt1813 - Static165.anInt2942;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static99.anInt1813 + Static99.anInt1813) {
						continue;
					}
					local164 = local8.anInt5929 + Static99.anInt1813 - Static165.anInt2942;
					if (local164 > Static99.anInt1813 + Static99.anInt1813) {
						local164 = Static99.anInt1813 + Static99.anInt1813;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static27.aBooleanArrayArray2[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt5942 = 5;
						local8.anInt5945 = (local8.anInt5943 - Static385.anInt6349 << 8) / local12;
						local8.anInt5930 = (local8.anInt5933 - Static385.anInt6349 << 8) / local12;
						local8.anInt5927 = (local8.anInt5936 - Static352.anInt5944 << 8) / local12;
						local8.anInt5941 = (local8.anInt5931 - Static352.anInt5944 << 8) / local12;
						Static51.aClass219Array1[Static268.anInt4599++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Z")
	public static boolean method4186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static41.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static30.anInt498) {
			return false;
		} else if (local7 == Static30.anInt498) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static301.anInt2759;
			@Pc(26) int local26 = arg2 << Static301.anInt2759;
			if (Static365.method3018(local22 + 1, Static420.aClass84Array4[arg0].method5322(arg1, arg2), local26 + 1) && Static365.method3018(local22 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg2), local26 + 1) && Static365.method3018(local22 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg2 + 1), local26 + Static22.anInt397 - 1) && Static365.method3018(local22 + 1, Static420.aClass84Array4[arg0].method5322(arg1, arg2 + 1), local26 + Static22.anInt397 - 1) && Static365.method3018(local22 + Static25.anInt7191, Static420.aClass84Array4[arg0].method5322(arg1, arg2), local26 + 1) && Static365.method3018(local22 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg2), local26 + Static25.anInt7191) && Static365.method3018(local22 + Static25.anInt7191, Static420.aClass84Array4[arg0].method5322(arg1, arg2 + 1), local26 + Static22.anInt397 - 1) && Static365.method3018(local22 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1, arg2), local26 + Static25.anInt7191) && Static365.method3018(local22 + Static25.anInt7191, Static420.aClass84Array4[arg0].method5322(arg1, arg2), local26 + Static25.anInt7191)) {
				Static41.anIntArrayArrayArray2[arg0][arg1][arg2] = Static30.anInt498;
				return true;
			} else {
				Static41.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static30.anInt498;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "(I)V")
	public static void method4187() {
		if (Static92.anIntArray184 != null) {
			return;
		}
		Static92.anIntArray184 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(84) float local84 = (1.0F - local45) * local54;
				@Pc(93) float local93 = local54 * (1.0F - local77 * local45);
				@Pc(104) float local104 = (1.0F - (1.0F - local77) * local45) * local54;
				if (local71 == 0) {
					local56 = local54;
					local58 = local104;
					local60 = local84;
				} else if (local71 == 1) {
					local60 = local84;
					local58 = local54;
					local56 = local93;
				} else if (local71 == 2) {
					local58 = local54;
					local56 = local84;
					local60 = local104;
				} else if (local71 == 3) {
					local56 = local84;
					local58 = local93;
					local60 = local54;
				} else if (local71 == 4) {
					local56 = local104;
					local58 = local84;
					local60 = local54;
				} else if (local71 == 5) {
					local60 = local93;
					local58 = local84;
					local56 = local54;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(197) int local197 = (int) (local56 * 256.0F);
				@Pc(202) int local202 = (int) (local58 * 256.0F);
				@Pc(207) int local207 = (int) (local60 * 256.0F);
				@Pc(221) int local221 = (local197 << 16) + (local202 << 8) + local207 - 16777216;
				Static92.anIntArray184[local21++] = local221;
			}
		}
	}
}
