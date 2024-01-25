import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!wu;")
	public static Class320 aClass320_17;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt8621 = -1;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
	public static boolean aBoolean621 = false;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method7235() {
		if (Static103.aClass39_3 == null) {
			return;
		}
		Static64.aClass107_1.method2838();
		Static53.method968();
		Static469.method7062();
		Static119.method2312();
		Static535.method6662();
		Static266.method4293();
		if (Static26.aClass191_1 != null) {
			Static26.aClass191_1.method4745();
		}
		Static434.method7679();
		Static209.method3332();
		Static531.method7658();
		Static499.method7335(false);
		Static7.method6811();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class1_Sub1_Sub2_Sub1 local45 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local39];
			if (local45 != null) {
				local45.aClass2_Sub47_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass63Array3.length; local52++) {
					local45.aClass63Array3[local52] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static61.anInt1174; local73++) {
			@Pc(80) Class1_Sub1_Sub2_Sub2 local80 = Static539.aClass2_Sub11Array1[local73].aClass1_Sub1_Sub2_Sub2_1;
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < local80.aClass63Array3.length; local84++) {
					local80.aClass63Array3[local84] = null;
				}
			}
		}
		Static267.aClass181_14 = null;
		Static338.aClass181_13 = null;
		Static103.aClass39_3.method6021();
		Static103.aClass39_3 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method7236(@OriginalArg(1) byte[] arg0) {
		@Pc(16) int local16 = arg0.length;
		@Pc(19) char[] local19 = new char[local16];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(31) int local31 = arg0[local23] & 0xFF;
			if (local31 >= 128) {
				if (local31 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local31);
				}
				@Pc(72) int local72;
				if (local31 < 224) {
					if (local23 + 1 >= local16) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local72 = arg0[local23] & 0xFF;
					if (local72 < 128 || local72 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local19[local21++] = (char) (local72 & 0xFFFFFF7F | (local31 & 0x3FFFF3F) << 6);
				} else if (local31 < 240) {
					if (local16 <= local23 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local72 = arg0[local23] & 0xFF;
					if (local72 < 128 || local72 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local23++;
					@Pc(160) int local160 = arg0[local23] & 0xFF;
					if (local160 < 128 || local160 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local19[local21++] = (char) ((local31 & 0xFFFFFF1F) << 12 | (local72 & 0xFFFFFF7F) << 6 | local160 & 0xFFFFFF7F);
				} else if (local31 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local31);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				local19[local21++] = (char) local31;
			}
		}
		return new String(local19, 0, local21);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method7238() {
		for (@Pc(7) int local7 = 0; local7 < Static374.anInt6954; local7++) {
			@Pc(13) Class141 local13 = Static469.aClass141Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(146) int local146;
			if (local13.aClass2_Sub12_Sub3_2 == null) {
				local13.anInt3894--;
				if (local13.anInt3894 < (local13.aByte59 == 2 ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte59 == 1 && local13.aClass70_1 == null) {
						local13.aClass70_1 = Static550.method2068(Static383.aClass53_109, local13.anInt3893, 0);
						if (local13.aClass70_1 == null) {
							continue;
						}
						local13.anInt3894 += local13.aClass70_1.method2065();
					} else if (local13.aByte59 == 2 && (local13.aClass2_Sub6_1 == null || local13.aClass2_Sub31_Sub1_2 == null)) {
						if (local13.aClass2_Sub6_1 == null) {
							local13.aClass2_Sub6_1 = Static27.method610(Static442.aClass53_122, local13.anInt3893);
						}
						if (local13.aClass2_Sub6_1 == null) {
							continue;
						}
						if (local13.aClass2_Sub31_Sub1_2 == null) {
							local13.aClass2_Sub31_Sub1_2 = local13.aClass2_Sub6_1.method613(new int[] { 22050 });
							if (local13.aClass2_Sub31_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt3894 < 0) {
						if (local13.anInt3895 == 0) {
							local146 = local13.anInt3892 * Static281.aClass2_Sub19_Sub1_1.anInt2187 >> 8;
						} else {
							@Pc(136) int local136 = local13.anInt3895 >> 24 & 0x3;
							if (Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 == local136) {
								@Pc(155) int local155 = (local13.anInt3895 & 0xFF) << 7;
								@Pc(162) int local162 = local13.anInt3895 >> 16 & 0xFF;
								@Pc(171) int local171 = (local162 << 7) + 64 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660;
								if (local171 < 0) {
									local171 = -local171;
								}
								@Pc(186) int local186 = local13.anInt3895 >> 8 & 0xFF;
								@Pc(196) int local196 = (local186 << 7) + 64 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659;
								if (local196 < 0) {
									local196 = -local196;
								}
								@Pc(208) int local208 = local171 + local196 - 128;
								if (local155 < local208) {
									local13.anInt3894 = -99999;
									continue;
								}
								if (local208 < 0) {
									local208 = 0;
								}
								local146 = local13.anInt3892 * Static281.aClass2_Sub19_Sub1_1.anInt2202 * (local155 - local208) / local155 >> 8;
							} else {
								local146 = 0;
							}
						}
						if (local146 > 0) {
							@Pc(259) Class2_Sub31_Sub1 local259 = null;
							if (local13.aByte59 == 1) {
								local259 = local13.aClass70_1.method2066().method4633(Static460.aClass250_41);
							} else if (local13.aByte59 == 2) {
								local259 = local13.aClass2_Sub31_Sub1_2;
							}
							@Pc(287) Class2_Sub12_Sub3 local287 = local13.aClass2_Sub12_Sub3_2 = Static555.method5570(local259, local146);
							local287.method5579(local13.anInt3897 - 1);
							Static288.aClass2_Sub12_Sub2_5.method2086(local287);
						}
					}
				}
			} else if (!local13.aClass2_Sub12_Sub3_2.method7799()) {
				local15 = true;
			}
			if (local15) {
				Static374.anInt6954--;
				for (local146 = local7; local146 < Static374.anInt6954; local146++) {
					Static469.aClass141Array1[local146] = Static469.aClass141Array1[local146 + 1];
				}
				local7--;
			}
		}
		if (Static539.aBoolean675 && !Static192.method3149()) {
			if (Static281.aClass2_Sub19_Sub1_1.anInt2190 != 0 && Static294.anInt5419 != -1) {
				Static286.method4519(Static281.aClass2_Sub19_Sub1_1.anInt2190, Static294.anInt5419, Static463.aClass53_134);
			}
			Static539.aBoolean675 = false;
		} else if (Static281.aClass2_Sub19_Sub1_1.anInt2190 != 0 && Static294.anInt5419 != -1 && !Static192.method3149()) {
			Static93.method1721(Static431.aClass243_79);
			Static381.aClass2_Sub29_Sub2_2.method5185(Static294.anInt5419);
			Static294.anInt5419 = -1;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
	public static void method7246(@OriginalArg(1) int arg0) {
		Static211.anIntArray607 = new int[arg0];
		Static415.anIntArray592 = new int[arg0];
		Static358.anIntArray519 = new int[arg0];
		Static92.anIntArray139 = new int[arg0];
		Static261.anIntArray438 = new int[arg0];
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
	public static int method7248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static206.aByteArrayArray15 == null ? 0 : Static206.aByteArrayArray15[arg0][arg1] & 0xFF;
	}
}
