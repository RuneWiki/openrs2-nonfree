import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
	public static int anInt5049;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_32 = new Class6(4);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII)V")
	public static void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 + arg0;
		@Pc(13) int local13 = arg5 - arg0;
		for (@Pc(15) int local15 = arg3; local15 < local9; local15++) {
			Static583.method7816(Static158.anIntArrayArray66[local15], arg2, arg4, arg1);
		}
		for (@Pc(42) int local42 = arg5; local42 > local13; local42--) {
			Static583.method7816(Static158.anIntArrayArray66[local42], arg2, arg4, arg1);
		}
		@Pc(65) int local65 = arg4 + arg0;
		@Pc(70) int local70 = arg1 - arg0;
		for (@Pc(72) int local72 = local9; local72 <= local13; local72++) {
			@Pc(78) int[] local78 = Static158.anIntArrayArray66[local72];
			Static583.method7816(local78, arg2, arg4, local65);
			Static583.method7816(local78, arg2, local70, arg1);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	public static void method4392() {
		if (!Static369.aBoolean463) {
			return;
		}
		@Pc(11) Class361 local11 = Static556.method7352(Static377.anInt6474, Static196.anInt9125);
		if (local11 != null && local11.anObjectArray15 != null) {
			@Pc(20) Class3_Sub32 local20 = new Class3_Sub32();
			local20.aClass361_6 = local11;
			local20.anObjectArray1 = local11.anObjectArray15;
			Static312.method4566(local20);
		}
		Static28.anInt515 = -1;
		Static369.aBoolean463 = false;
		Static69.anInt1582 = -1;
		if (local11 != null) {
			Static186.method3170(local11);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method4398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg0] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static361.aCharArray16[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local8[local15++] = (char) local27;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!ce;I)V")
	public static void method4399(@OriginalArg(1) Class3_Sub11_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static582.aBoolean385 = false;
		Static485.anInt7939 = 0;
		Static583.method7817(arg0);
		Static167.method3010(arg0);
		if (Static582.aBoolean385) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt6128) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6128 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B[[BLclient!uk;)V")
	public static void method4400(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt8536; local14++) {
			Static236.method3658();
			for (@Pc(20) int local20 = 0; local20 < Static54.anInt1038 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static140.anInt3026 >> 3; local24++) {
					@Pc(34) int local34 = Static358.anIntArrayArrayArray18[local14][local20][local24];
					if (local34 != -1) {
						@Pc(43) int local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean662 || local43 == 0) {
							@Pc(54) int local54 = local34 >> 1 & 0x3;
							@Pc(60) int local60 = local34 >> 14 & 0x3FF;
							@Pc(66) int local66 = local34 >> 3 & 0x7FF;
							@Pc(77) int local77 = (local60 / 8 << 8) + (local66 / 8);
							for (@Pc(79) int local79 = 0; local79 < Static403.anIntArray428.length; local79++) {
								if (Static403.anIntArray428[local79] == local77 && arg0[local79] != null) {
									@Pc(97) Class3_Sub11 local97 = new Class3_Sub11(arg0[local79]);
									arg1.method7104(local97, Static460.aClass169Array3, local20 * 8, local66, local14, local60, local24 * 8, local43, local54);
									arg1.method7122(local66, local43, local20 * 8, local24 * 8, local97, Static505.aClass45_11, local60, local54, local14, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static84.aClass350_1 = Static420.aClass356_1.method7704(local12[0], local12[2], Static508.aClass232_1, local12[1], local12[3]);
			Static330.anInt5541 = local12[4];
		}
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)V")
	public static void method4401() {
		if (Static271.anIntArray256 != null) {
			return;
		}
		Static271.anIntArray256 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(88) float local88 = (1.0F - local50) * local59;
				@Pc(97) float local97 = local59 * (1.0F - local50 * local81);
				@Pc(108) float local108 = local59 * (1.0F - (1.0F - local81) * local50);
				if (local76 == 0) {
					local63 = local108;
					local61 = local59;
					local65 = local88;
				} else if (local76 == 1) {
					local65 = local88;
					local63 = local59;
					local61 = local97;
				} else if (local76 == 2) {
					local65 = local108;
					local63 = local59;
					local61 = local88;
				} else if (local76 == 3) {
					local65 = local59;
					local63 = local97;
					local61 = local88;
				} else if (local76 == 4) {
					local63 = local88;
					local65 = local59;
					local61 = local108;
				} else if (local76 == 5) {
					local65 = local97;
					local61 = local59;
					local63 = local88;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(199) int local199 = (int) (local61 * 256.0F);
				@Pc(204) int local204 = (int) (local63 * 256.0F);
				@Pc(209) int local209 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = local209 + (local204 << 8) + (local199 << 16) - 16777216;
				Static271.anIntArray256[local26++] = local221;
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZLclient!r;)V")
	public static void method4402(@OriginalArg(1) Class45 arg0) {
		if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 != Static32.anInt609 && (Static309.aClass299ArrayArrayArray3 != null && Static287.method5761(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117, arg0))) {
			Static32.anInt609 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117;
		}
	}
}
