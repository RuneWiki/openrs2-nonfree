import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_158 = new Class34("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method4885(@OriginalArg(1) int arg0) {
		Static128.anInt6686 = -1;
		Static139.anInt4713 = 100;
		Static259.anInt2903 = arg0;
		Static339.anInt6507 = 3;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[BII)Z")
	public static boolean method4888(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub8 local12 = new Class1_Sub8(arg0);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local12.method4530();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(99) Class141 local99;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local12.method4528();
										if (local39 == 0) {
											continue label68;
										}
										local12.method4532();
									}
									local39 = local12.method4528();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(54) int local54 = local31 & 0x3F;
									@Pc(60) int local60 = local31 >> 6 & 0x3F;
									local66 = local12.method4532() >> 2;
									local70 = local60 + arg2;
									local74 = arg1 + local54;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (Static233.anInt5573 - 1 <= local70);
					} while (local74 >= Static134.anInt2971 - 1);
					local99 = Static119.method2548(local19);
				} while (local66 == 22 && !Static84.aBoolean195 && local99.anInt4294 == 0 && local99.anInt4262 != 1 && !local99.aBoolean398);
				local33 = true;
				if (!local99.method3844()) {
					Static87.anInt2181++;
					local7 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!uo;I)V")
	public static void method4889(@OriginalArg(1) Class32 arg0, @OriginalArg(2) int arg1) {
		Static106.method2324(arg0);
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg1 > 1) {
			for (local12 = 0; local12 < Static233.anInt5573; local12++) {
				for (local16 = 0; local16 < Static134.anInt2971; local16++) {
					if ((Static200.aByteArrayArrayArray8[1][local12][local16] & 0x2) == 2) {
						Static185.method3617(local12, local16);
					}
				}
			}
		}
		for (local12 = 0; local12 < arg1; local12++) {
			for (local16 = 0; local16 <= Static134.anInt2971; local16++) {
				for (@Pc(54) int local54 = 0; local54 <= Static233.anInt5573; local54++) {
					@Pc(68) int local68;
					@Pc(70) int local70;
					@Pc(72) int local72;
					@Pc(74) int local74;
					@Pc(123) int local123;
					@Pc(212) int local212;
					@Pc(220) int local220;
					@Pc(240) int local240;
					@Pc(244) int local244;
					if ((Static64.aByteArrayArrayArray2[local12][local54][local16] & 0x1) != 0) {
						local68 = local16;
						local70 = local16;
						local72 = local12;
						local74 = local12;
						while (local68 > 0 && (Static64.aByteArrayArrayArray2[local12][local54][local68 - 1] & 0x1) != 0) {
							local68--;
						}
						while (local70 < Static134.anInt2971 && (Static64.aByteArrayArrayArray2[local12][local54][local70 + 1] & 0x1) != 0) {
							local70++;
						}
						label164: while (local72 > 0) {
							for (local123 = local68; local123 <= local70; local123++) {
								if ((Static64.aByteArrayArrayArray2[local72 - 1][local54][local123] & 0x1) == 0) {
									break label164;
								}
							}
							local72--;
						}
						label153: while (local74 < 3) {
							for (local123 = local68; local123 <= local70; local123++) {
								if ((Static64.aByteArrayArrayArray2[local74 + 1][local54][local123] & 0x1) == 0) {
									break label153;
								}
							}
							local74++;
						}
						local123 = (local74 + 1 - local72) * ((local70 - local68) + 1);
						if (local123 >= 2) {
							local212 = Static251.anIntArrayArrayArray15[local74][local54][local68] - 240;
							local220 = Static251.anIntArrayArrayArray15[local72][local54][local68];
							Static78.method1763(1, local54 * 128, local54 * 128, local68 * 128, local70 * 128 + 128, local212, local220);
							for (local240 = local72; local240 <= local74; local240++) {
								for (local244 = local68; local244 <= local70; local244++) {
									Static64.aByteArrayArrayArray2[local240][local54][local244] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static64.aByteArrayArrayArray2[local12][local54][local16] & 0x2) != 0) {
						local68 = local54;
						local70 = local54;
						local72 = local12;
						local74 = local12;
						while (local68 > 0 && (Static64.aByteArrayArrayArray2[local12][local68 - 1][local16] & 0x2) != 0) {
							local68--;
						}
						while (Static233.anInt5573 > local70 && (Static64.aByteArrayArrayArray2[local12][local70 + 1][local16] & 0x2) != 0) {
							local70++;
						}
						label217: while (local72 > 0) {
							for (local123 = local68; local123 <= local70; local123++) {
								if ((Static64.aByteArrayArrayArray2[local72 - 1][local123][local16] & 0x2) == 0) {
									break label217;
								}
							}
							local72--;
						}
						label206: while (local74 < 3) {
							for (local123 = local68; local123 <= local70; local123++) {
								if ((Static64.aByteArrayArrayArray2[local74 + 1][local123][local16] & 0x2) == 0) {
									break label206;
								}
							}
							local74++;
						}
						local123 = (local70 + 1 - local68) * (local74 + 1 - local72);
						if (local123 >= 2) {
							local212 = Static251.anIntArrayArrayArray15[local74][local68][local16] - 240;
							local220 = Static251.anIntArrayArrayArray15[local72][local68][local16];
							Static78.method1763(2, local68 * 128, local70 * 128 + 128, local16 * 128, local16 * 128, local212, local220);
							for (local240 = local72; local240 <= local74; local240++) {
								for (local244 = local68; local244 <= local70; local244++) {
									Static64.aByteArrayArrayArray2[local240][local244][local16] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static64.aByteArrayArrayArray2[local12][local54][local16] & 0x4) != 0) {
						local68 = local54;
						local70 = local54;
						local72 = local16;
						local74 = local16;
						while (local72 > 0 && (Static64.aByteArrayArrayArray2[local12][local54][local72 - 1] & 0x4) != 0) {
							local72--;
						}
						while (local74 < Static134.anInt2971 && (Static64.aByteArrayArrayArray2[local12][local54][local74 + 1] & 0x4) != 0) {
							local74++;
						}
						label270: while (local68 > 0) {
							for (local123 = local72; local123 <= local74; local123++) {
								if ((Static64.aByteArrayArrayArray2[local12][local68 - 1][local123] & 0x4) == 0) {
									break label270;
								}
							}
							local68--;
						}
						label259: while (Static233.anInt5573 > local70) {
							for (local123 = local72; local123 <= local74; local123++) {
								if ((Static64.aByteArrayArrayArray2[local12][local70 + 1][local123] & 0x4) == 0) {
									break label259;
								}
							}
							local70++;
						}
						if ((local70 + 1 - local68) * (local74 + 1 + -local72) >= 4) {
							local123 = Static251.anIntArrayArrayArray15[local12][local68][local72];
							Static78.method1763(4, local68 * 128, local70 * 128 + 128, local72 * 128, local74 * 128 + 128, local123, local123);
							for (@Pc(679) int local679 = local68; local679 <= local70; local679++) {
								for (local212 = local72; local212 <= local74; local212++) {
									Static64.aByteArrayArrayArray2[local12][local679][local212] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
