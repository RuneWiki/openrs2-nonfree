import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!dn;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8 = "Started 3d Library";

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Z")
	public static boolean aBoolean12 = true;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public static int anInt278 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZI)V")
	public static void method220() {
		Static106.aClass155_18.method4364(5);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([[II[[BI[[B[Lclient!mm;B[[B[[B[[F[[F[[F)V")
	public static void method221(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class103[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			@Pc(10) Class103 local10 = arg5[local3];
			if (arg3 == local10.anInt3848) {
				@Pc(19) Class178 local19 = new Class178();
				@Pc(21) int local21 = 0;
				@Pc(29) int local29 = (local10.anInt3861 >> 7) - local10.anInt3860;
				@Pc(38) int local38 = (local10.anInt3854 >> 7) - local10.anInt3860;
				@Pc(46) int local46 = local10.anInt3860 + (local10.anInt3854 >> 7);
				if (local46 > 103) {
					local46 = 103;
				}
				if (local38 < 0) {
					local21 = -local38;
					local38 = 0;
				}
				@Pc(63) int local63;
				@Pc(71) short local71;
				@Pc(78) int local78;
				@Pc(87) int local87;
				@Pc(98) int local98;
				@Pc(109) int local109;
				@Pc(306) boolean local306;
				@Pc(334) int local334;
				for (local63 = local38; local63 <= local46; local63++) {
					local71 = local10.aShortArray62[local21];
					local78 = local29 + (local71 >> 8);
					local87 = local78 + (local71 & 0xFF) - 1;
					if (local87 > 103) {
						local87 = 103;
					}
					if (local78 < 0) {
						local78 = 0;
					}
					for (local98 = local78; local98 <= local87; local98++) {
						local109 = arg2[local98][local63] & 0xFF;
						@Pc(117) int local117 = arg7[local98][local63] & 0xFF;
						@Pc(119) boolean local119 = false;
						@Pc(135) Class159 local135;
						@Pc(155) int[] local155;
						@Pc(226) int[] local226;
						if (local117 == 0) {
							if (local109 == 0) {
								continue;
							}
							local135 = Static50.method1056(local109 - 1);
							if (local135.anInt5803 == -1) {
								continue;
							}
							if (arg6[local98][local63] != 0) {
								local155 = Static58.anIntArrayArray11[arg6[local98][local63]];
								local19.anInt6194 += ((local155.length >> 1) - 2) * 3;
								local19.anInt6193 += local155.length >> 1;
								continue;
							}
						} else if (local109 != 0) {
							local135 = Static50.method1056(local109 - 1);
							@Pc(202) byte local202;
							if (local135.anInt5803 == -1) {
								local202 = arg6[local98][local63];
								if (local202 != 0) {
									local226 = Static165.anIntArrayArray24[local202];
									local19.anInt6194 += (local226.length >> 1) * 3 - 6;
									local19.anInt6193 += local226.length >> 1;
								}
								continue;
							}
							local202 = arg6[local98][local63];
							if (local202 != 0) {
								local119 = true;
							}
						}
						@Pc(255) Class152 local255 = Static263.method4471(arg3, local98, local63);
						if (local255 != null) {
							@Pc(267) int local267 = (int) (local255.aLong181 >> 14) & 0x3F;
							if (local267 == 9) {
								local226 = null;
								@Pc(280) int local280 = (int) (local255.aLong181 >> 20) & 0x3;
								@Pc(293) boolean local293;
								@Pc(321) short local321;
								@Pc(327) int local327;
								if ((local280 & 0x1) == 0) {
									local306 = local98 + 1 <= local87;
									local293 = local98 - 1 >= local78;
									if (!local293 && local63 + 1 <= local46) {
										local321 = local10.aShortArray62[local21 + 1];
										local327 = (local321 >> 8) + local29;
										local334 = (local321 & 0xFF) + local327;
										local293 = local98 > local327 && local98 < local334;
									}
									if (!local306 && local63 - 1 >= local38) {
										local321 = local10.aShortArray62[local21 - 1];
										local327 = local29 + (local321 >> 8);
										local334 = (local321 & 0xFF) + local327;
										local306 = local327 < local98 && local98 < local334;
									}
									if (local293 && local306) {
										local226 = Static58.anIntArrayArray11[0];
									} else if (local293) {
										local226 = Static58.anIntArrayArray11[1];
									} else if (local306) {
										local226 = Static58.anIntArrayArray11[1];
									}
								} else {
									local293 = local98 - 1 >= local78;
									local306 = local87 >= local98 + 1;
									if (!local293 && local63 - 1 >= local38) {
										local321 = local10.aShortArray62[local21 - 1];
										local327 = (local321 >> 8) + local29;
										local334 = local327 + (local321 & 0xFF);
										local293 = local327 < local98 && local334 > local98;
									}
									if (!local306 && local46 >= local63 + 1) {
										local321 = local10.aShortArray62[local21 + 1];
										local327 = (local321 >> 8) + local29;
										local334 = local327 + (local321 & 0xFF);
										local306 = local327 < local98 && local334 > local98;
									}
									if (local293 && local306) {
										local226 = Static58.anIntArrayArray11[0];
									} else if (local293) {
										local226 = Static58.anIntArrayArray11[1];
									} else if (local306) {
										local226 = Static58.anIntArrayArray11[1];
									}
								}
								if (local226 != null) {
									local19.anInt6194 += (local226.length >> 1) * 3 - 6;
									local19.anInt6193 += local226.length >> 1;
								}
								continue;
							}
						}
						if (local119) {
							local155 = Static58.anIntArrayArray11[arg6[local98][local63]];
							local226 = Static165.anIntArrayArray24[arg6[local98][local63]];
							local19.anInt6194 += ((local155.length >> 1) - 2) * 3;
							local19.anInt6194 += (local226.length >> 1) * 3 - 6;
							local19.anInt6193 += local155.length >> 1;
							local19.anInt6193 += local226.length >> 1;
						} else {
							local155 = Static58.anIntArrayArray11[0];
							local19.anInt6194 += ((local155.length >> 1) - 2) * 3;
							local19.anInt6193 += local155.length >> 1;
						}
					}
					local21++;
				}
				local21 = 0;
				local19.method4796();
				if ((local10.anInt3854 >> 7) - local10.anInt3860 < 0) {
					local21 = local10.anInt3860 - (local10.anInt3854 >> 7);
				}
				for (local63 = local38; local63 <= local46; local63++) {
					local71 = local10.aShortArray62[local21];
					local78 = local29 + (local71 >> 8);
					local87 = (local71 & 0xFF) + local78 - 1;
					if (local87 > 103) {
						local87 = 103;
					}
					if (local78 < 0) {
						local78 = 0;
					}
					for (local98 = local78; local98 <= local87; local98++) {
						local109 = arg7[local98][local63] & 0xFF;
						@Pc(736) byte local736 = arg4[local98][local63];
						@Pc(744) int local744 = arg2[local98][local63] & 0xFF;
						@Pc(746) boolean local746 = false;
						@Pc(759) Class159 local759;
						if (local109 == 0) {
							if (local744 == 0) {
								continue;
							}
							local759 = Static50.method1056(local744 - 1);
							if (local759.anInt5803 == -1) {
								continue;
							}
							if (arg6[local98][local63] != 0) {
								Static275.method4582(local98, local63, arg0, local19, arg8, arg4[local98][local63], arg10, Static58.anIntArrayArray11[arg6[local98][local63]], arg9, local10);
								continue;
							}
						} else if (local744 != 0) {
							local759 = Static50.method1056(local744 - 1);
							if (local759.anInt5803 == -1) {
								Static275.method4582(local98, local63, arg0, local19, arg8, arg4[local98][local63], arg10, Static165.anIntArrayArray24[arg6[local98][local63]], arg9, local10);
								continue;
							}
							@Pc(795) byte local795 = arg6[local98][local63];
							if (local795 != 0) {
								local746 = true;
							}
						}
						@Pc(859) Class152 local859 = Static263.method4471(arg3, local98, local63);
						if (local859 != null) {
							@Pc(871) int local871 = (int) (local859.aLong181 >> 14) & 0x3F;
							if (local871 == 9) {
								@Pc(878) int[] local878 = null;
								@Pc(886) int local886 = (int) (local859.aLong181 >> 20) & 0x3;
								@Pc(943) int local943;
								@Pc(915) boolean local915;
								@Pc(930) short local930;
								if ((local886 & 0x1) == 0) {
									local915 = local87 >= local98 + 1;
									local306 = local98 - 1 >= local78;
									if (!local306 && local63 + 1 <= local46) {
										local930 = local10.aShortArray62[local21 + 1];
										local334 = (local930 >> 8) + local29;
										local943 = local334 + (local930 & 0xFF);
										local306 = local98 > local334 && local98 < local943;
									}
									if (!local915 && local63 - 1 >= local38) {
										local930 = local10.aShortArray62[local21 - 1];
										local334 = local29 + (local930 >> 8);
										local943 = local334 + (local930 & 0xFF);
										local915 = local98 > local334 && local943 > local98;
									}
									if (local306 && local915) {
										local878 = Static58.anIntArrayArray11[0];
									} else if (local306) {
										local878 = Static58.anIntArrayArray11[1];
										local736 = 1;
									} else if (local915) {
										local878 = Static58.anIntArrayArray11[1];
										local736 = 3;
									}
								} else {
									local306 = local98 - 1 >= local78;
									local915 = local87 >= local98 + 1;
									if (!local306 && local38 <= local63 - 1) {
										local930 = local10.aShortArray62[local21 - 1];
										local334 = local29 + (local930 >> 8);
										local943 = (local930 & 0xFF) + local334;
										local306 = local334 < local98 && local943 > local98;
									}
									if (!local915 && local63 + 1 <= local46) {
										local930 = local10.aShortArray62[local21 + 1];
										local334 = local29 + (local930 >> 8);
										local943 = (local930 & 0xFF) + local334;
										local915 = local334 < local98 && local98 < local943;
									}
									if (local306 && local915) {
										local878 = Static58.anIntArrayArray11[0];
									} else if (local306) {
										local878 = Static58.anIntArrayArray11[1];
										local736 = 0;
									} else if (local915) {
										local878 = Static58.anIntArrayArray11[1];
										local736 = 2;
									}
								}
								if (local878 != null) {
									Static275.method4582(local98, local63, arg0, local19, arg8, local736, arg10, local878, arg9, local10);
								}
								continue;
							}
						}
						if (local746) {
							Static275.method4582(local98, local63, arg0, local19, arg8, arg4[local98][local63], arg10, Static165.anIntArrayArray24[arg6[local98][local63]], arg9, local10);
							Static275.method4582(local98, local63, arg0, local19, arg8, arg4[local98][local63], arg10, Static58.anIntArrayArray11[arg6[local98][local63]], arg9, local10);
						} else {
							Static275.method4582(local98, local63, arg0, local19, arg8, local736, arg10, Static58.anIntArrayArray11[0], arg9, local10);
						}
					}
					local21++;
				}
				if (local19.anInt6196 > 0 && local19.anInt6195 > 0) {
					local19.method4797();
					local10.aClass178_1 = local19;
				}
			}
		}
	}
}
