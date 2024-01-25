import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "Lclient!al;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "Lclient!vba;")
	public static final Class366 aClass366_1 = new Class366();

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
	public static int anInt1402 = 0;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public static void method1231() {
		for (@Pc(8) int local8 = 0; local8 < Static393.anInt6534; local8++) {
			Static165.aClass272Array7[local8] = null;
		}
		Static393.anInt6534 = 0;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (@Pc(30) int local30 = 0; local30 < Static247.anInt4367; local30++) {
			for (local34 = 0; local34 < Static133.anInt2551; local34++) {
				for (local38 = 0; local38 < Static155.anInt2874; local38++) {
					@Pc(48) Class368 local48 = Static254.aClass368ArrayArrayArray2[local30][local38][local34];
					if (local48 != null) {
						if (local48.aShort112 > 0) {
							local48.aShort112 = (short) (local48.aShort112 * -1);
						}
						if (local48.aShort111 > 0) {
							local48.aShort111 = (short) (local48.aShort111 * -1);
						}
					}
				}
			}
		}
		for (local34 = 0; local34 < Static247.anInt4367; local34++) {
			for (local38 = 0; local38 < Static133.anInt2551; local38++) {
				for (@Pc(99) int local99 = 0; local99 < Static155.anInt2874; local99++) {
					@Pc(109) Class368 local109 = Static254.aClass368ArrayArrayArray2[local34][local99][local38];
					if (local109 != null) {
						@Pc(132) boolean local132 = Static254.aClass368ArrayArrayArray2[0][local99][local38] != null && Static254.aClass368ArrayArrayArray2[0][local99][local38].aClass368_1 != null;
						@Pc(137) int local137;
						@Pc(139) int local139;
						@Pc(153) Class368 local153;
						@Pc(161) int local161;
						@Pc(326) int local326;
						@Pc(340) int local340;
						@Pc(347) int local347;
						@Pc(363) int local363;
						@Pc(371) int local371;
						@Pc(375) int local375;
						@Pc(379) int local379;
						@Pc(385) int local385;
						@Pc(423) int local423;
						@Pc(427) int local427;
						if (local109.aShort112 < 0) {
							local137 = local38;
							local139 = local38;
							local153 = Static254.aClass368ArrayArrayArray2[local34][local99][local38 - 1];
							local161 = Static556.aClass35Array2[local34].method7461(local38, local99);
							while (local137 > 0 && local153 != null && local153.aShort112 < 0 && local153.aShort112 == local109.aShort112 && local153.aShort110 == local109.aShort110 && local161 == Static556.aClass35Array2[local34].method7461(local137 - 1, local99) && (local137 - 1 <= 0 || Static556.aClass35Array2[local34].method7461(local137 - 2, local99) == local161)) {
								local137--;
								local153 = Static254.aClass368ArrayArrayArray2[local34][local99][local137 - 1];
							}
							for (local153 = Static254.aClass368ArrayArrayArray2[local34][local99][local38 + 1]; local139 < Static155.anInt2874 && local153 != null && local153.aShort112 < 0 && local153.aShort112 == local109.aShort112 && local109.aShort110 == local153.aShort110 && Static556.aClass35Array2[local34].method7461(local139 + 1, local99) == local161 && (Static155.anInt2874 <= local139 + 1 || local161 == Static556.aClass35Array2[local34].method7461(local139 + 2, local99)); local153 = Static254.aClass368ArrayArrayArray2[local34][local99][local139 + 1]) {
								local139++;
							}
							local326 = local34 + 1 - local34;
							local340 = Static556.aClass35Array2[local132 ? local34 + 1 : local34].method7461(local137, local99);
							local347 = local109.aShort112 * local326 + local340;
							local363 = Static556.aClass35Array2[local132 ? local34 + 1 : local34].method7461(local139 + 1, local99);
							local371 = local363 + local109.aShort112 * local326;
							local375 = local99 << Static571.anInt9216;
							local379 = local137 << Static571.anInt9216;
							local385 = Static599.anInt7773 + (local139 << Static571.anInt9216);
							Static165.aClass272Array7[Static393.anInt6534++] = new Class272(1, local34, local375 + local109.aShort110, local375 + local109.aShort110, local375 + local109.aShort110, local109.aShort110 + local375, local340, local363, local371, local347, local379, local385, local385, local379);
							for (local423 = local34; local423 <= local34; local423++) {
								for (local427 = local137; local427 <= local139; local427++) {
									Static254.aClass368ArrayArrayArray2[local423][local99][local427].aShort112 = (short) (Static254.aClass368ArrayArrayArray2[local423][local99][local427].aShort112 * -1);
								}
							}
						}
						if (local109.aShort111 < 0) {
							local137 = local99;
							local139 = local99;
							local153 = Static254.aClass368ArrayArrayArray2[local34][local99 - 1][local38];
							local161 = Static556.aClass35Array2[local34].method7461(local38, local99);
							while (local137 > 0 && local153 != null && local153.aShort111 < 0 && local153.aShort111 == local109.aShort111 && local153.aShort109 == local109.aShort109 && Static556.aClass35Array2[local34].method7461(local38, local137 - 1) == local161 && (local137 - 1 <= 0 || local161 == Static556.aClass35Array2[local34].method7461(local38, local137 - 2))) {
								local137--;
								local153 = Static254.aClass368ArrayArrayArray2[local34][local137 - 1][local38];
							}
							for (local153 = Static254.aClass368ArrayArrayArray2[local34][local99 + 1][local38]; local139 < Static133.anInt2551 && local153 != null && local153.aShort111 < 0 && local153.aShort111 == local109.aShort111 && local153.aShort109 == local109.aShort109 && local161 == Static556.aClass35Array2[local34].method7461(local38, local139 + 1) && (local139 + 1 >= Static133.anInt2551 || local161 == Static556.aClass35Array2[local34].method7461(local38, local139 + 2)); local153 = Static254.aClass368ArrayArrayArray2[local34][local139 + 1][local38]) {
								local139++;
							}
							local326 = local34 + 1 - local34;
							local340 = Static556.aClass35Array2[local132 ? local34 + 1 : local34].method7461(local38, local137);
							local347 = local109.aShort111 * local326 + local340;
							local363 = Static556.aClass35Array2[local132 ? local34 + 1 : local34].method7461(local38, local139 + 1);
							local371 = local109.aShort111 * local326 + local363;
							local375 = local137 << Static571.anInt9216;
							local379 = (local139 << Static571.anInt9216) + Static599.anInt7773;
							local385 = local38 << Static571.anInt9216;
							Static165.aClass272Array7[Static393.anInt6534++] = new Class272(2, local34, local375, local379, local379, local375, local340, local363, local371, local347, local385 + local109.aShort109, local109.aShort109 + local385, local385 + local109.aShort109, local109.aShort109 + local385);
							for (local423 = local34; local423 <= local34; local423++) {
								for (local427 = local137; local427 <= local139; local427++) {
									Static254.aClass368ArrayArrayArray2[local423][local427][local38].aShort111 = (short) (Static254.aClass368ArrayArrayArray2[local423][local427][local38].aShort111 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static454.aBoolean523 = true;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "()V")
	public static void method1234() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static416.aClass368ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static416.aClass368ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static133.anInt2551; local6++) {
					for (local9 = 0; local9 < Static155.anInt2874; local9++) {
						if (Static416.aClass368ArrayArrayArray3[local3][local6][local9] != null) {
							Static416.aClass368ArrayArrayArray3[local3][local6][local9].method8580();
						}
						Static416.aClass368ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static416.aClass368ArrayArrayArray3 = null;
		Static556.aClass35Array2 = null;
		if (Static195.aClass368ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static195.aClass368ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static133.anInt2551; local6++) {
					for (local9 = 0; local9 < Static155.anInt2874; local9++) {
						if (Static195.aClass368ArrayArrayArray1[local3][local6][local9] != null) {
							Static195.aClass368ArrayArrayArray1[local3][local6][local9].method8580();
						}
						Static195.aClass368ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static195.aClass368ArrayArrayArray1 = null;
		Static368.aClass35Array1 = null;
		Static254.aClass368ArrayArrayArray2 = null;
		Static582.aClass35Array3 = null;
		Static375.aBooleanArrayArray6 = null;
		Static591.aBooleanArrayArray9 = null;
		Static40.anIntArray46 = null;
		Static30.aBooleanArrayArrayArray2 = null;
		Static579.aBooleanArrayArrayArray3 = null;
		Static323.method4614();
		if (Static579.aClass34_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static23.anInt559; local3++) {
				Static579.aClass34_Sub1_Sub1Array1[local3] = null;
			}
			Static23.anInt559 = 0;
		}
		Static368.aClass34_Sub1Array3 = null;
		Static218.aClass34_Sub1Array2 = null;
		Static392.aClass34_Sub1Array4 = null;
		if (Static137.aClass34_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static137.aClass34_Sub1Array1.length; local3++) {
				Static137.aClass34_Sub1Array1[local3] = null;
			}
			Static194.anInt3515 = 0;
		}
		if (Static428.aClass34_Sub1Array5 != null) {
			for (local3 = 0; local3 < Static428.aClass34_Sub1Array5.length; local3++) {
				Static428.aClass34_Sub1Array5[local3] = null;
			}
			Static313.anInt9097 = 0;
		}
		if (Static192.aClass165Array1 != null) {
			for (local3 = 0; local3 < Static619.anInt10271; local3++) {
				Static192.aClass165Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static247.anInt4367; local6++) {
				for (local9 = 0; local9 < Static133.anInt2551; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static155.anInt2874; local195++) {
						Static231.aLongArrayArrayArray3[local6][local9][local195] = 0L;
					}
				}
			}
			Static619.anInt10271 = 0;
		}
		Static98.method403();
		Static305.aClass255_2 = Static305.aClass255_3;
		Static305.aClass255_2.method5616();
		Static510.aByteArrayArray12 = null;
		Static403.anIntArrayArray59 = null;
		Static465.aShortArrayArray8 = null;
		if (Static433.aClass298Array6 != null) {
			Static58.method7703();
			Static50.aClass95_1.method8029(1);
			Static50.aClass95_1.method8035(0);
		}
		if (Static304.aClass283Array1 != null) {
			Static304.aClass283Array1 = null;
		}
		Static50.aClass95_1 = null;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)I")
	public static int method1235() {
		return Static427.anInt6960;
	}
}
