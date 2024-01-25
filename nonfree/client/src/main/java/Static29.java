import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!av", name = "C", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!av", name = "L", descriptor = "Lclient!cr;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!av", name = "R", descriptor = "I")
	public static int anInt622;

	@OriginalMember(owner = "client!av", name = "S", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!av", name = "J", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_10 = new Class268(49, -2);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BLclient!oo;)V")
	public static void method524(@OriginalArg(1) Class244 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(71) int local71;
		if (Static21.aClass244_2 == arg0) {
			local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
			local20 = (local12 >> 4 & 0x7) + Static619.anInt10219;
			local26 = Static245.anInt6442 + (local12 & 0x7);
			local30 = Static456.aClass6_Sub40_Sub2_2.method8571();
			local34 = Static456.aClass6_Sub40_Sub2_2.method8604();
			local38 = Static456.aClass6_Sub40_Sub2_2.method8571();
			local42 = Static456.aClass6_Sub40_Sub2_2.method8604();
			if (local20 >= 0 && local26 >= 0 && local20 < Static442.anInt7975 && Static284.anInt7916 > local26) {
				local65 = local20 * 512 + 256;
				local71 = local26 * 512 + 256;
				local73 = Static482.anInt8366;
				if (local73 < 3 && Static492.method7384(local20, local26)) {
					local73++;
				}
				@Pc(107) Class20_Sub2_Sub2_Sub3 local107 = new Class20_Sub2_Sub2_Sub3(local30, local38, Static113.anInt2243, Static482.anInt8366, local73, local65, Static138.method2248(local65, Static482.anInt8366, local71) - local34, local71, local20, local20, local26, local26, local42);
				Static576.aClass8_29.method157(new Class6_Sub2_Sub13(local107));
			}
		} else if (arg0 == Static245.aClass244_14) {
			local12 = Static456.aClass6_Sub40_Sub2_2.method8576();
			local20 = (local12 & 0x7) + Static245.anInt6442;
			local26 = Static195.anInt3961 + local20;
			local30 = (local12 >> 4 & 0x7) + Static619.anInt10219;
			local34 = Static606.anInt8651 + local30;
			local38 = Static456.aClass6_Sub40_Sub2_2.method8614();
			local42 = Static456.aClass6_Sub40_Sub2_2.method8614();
			@Pc(176) boolean local176 = local30 >= 0 && local20 >= 0 && Static442.anInt7975 > local30 && local20 < Static284.anInt7916;
			if (local176 || Static148.method2358(Static152.anInt5122)) {
				Static50.method880(new Class6_Sub14(local38, local42), local26, Static482.anInt8366, local34);
				if (local176) {
					Static596.method8371(Static482.anInt8366, local30, local20);
				}
			}
		} else if (arg0 == Static237.aClass244_8) {
			local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
			local20 = (local12 & 0x7) + Static245.anInt6442;
			local26 = local20 + Static195.anInt3961;
			local30 = (local12 >> 4 & 0x7) + Static619.anInt10219;
			local34 = Static606.anInt8651 + local30;
			local38 = Static456.aClass6_Sub40_Sub2_2.method8571();
			local42 = Static456.aClass6_Sub40_Sub2_2.method8571();
			local65 = Static456.aClass6_Sub40_Sub2_2.method8571();
			if (Static333.aClass128_46 != null) {
				@Pc(259) Class6_Sub41 local259 = (Class6_Sub41) Static333.aClass128_46.method3560((long) (local26 << 14 | Static482.anInt8366 << 28 | local34));
				if (local259 != null) {
					for (@Pc(269) Class6_Sub14 local269 = (Class6_Sub14) local259.aClass8_57.method149(); local269 != null; local269 = (Class6_Sub14) local259.aClass8_57.method155()) {
						if (local269.anInt2255 == (local38 & 0x7FFF) && local42 == local269.anInt2253) {
							local269.method9043();
							local269.anInt2253 = local65;
							Static50.method880(local269, local26, Static482.anInt8366, local34);
							break;
						}
					}
					if (local30 >= 0 && local20 >= 0 && local30 < Static442.anInt7975 && local20 < Static284.anInt7916) {
						Static596.method8371(Static482.anInt8366, local30, local20);
					}
				}
			}
		} else if (arg0 == Static420.aClass244_17) {
			Static456.aClass6_Sub40_Sub2_2.method8604();
			local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
			local20 = (local12 >> 4 & 0x7) + Static619.anInt10219;
			local26 = Static245.anInt6442 + (local12 & 0x7);
			local30 = Static456.aClass6_Sub40_Sub2_2.method8571();
			local34 = Static456.aClass6_Sub40_Sub2_2.method8604();
			local38 = Static456.aClass6_Sub40_Sub2_2.method8606();
			@Pc(375) String local375 = Static456.aClass6_Sub40_Sub2_2.method8611();
			Static44.method827(local34, Static482.anInt8366, local38, local30, local20, local375, local26);
		} else if (Static39.aClass244_3 == arg0) {
			local12 = Static456.aClass6_Sub40_Sub2_2.method8573();
			local20 = (local12 >> 4 & 0x7) + Static619.anInt10219;
			local26 = (local12 & 0x7) + Static245.anInt6442;
			local30 = Static456.aClass6_Sub40_Sub2_2.method8560();
			local34 = local30 >> 2;
			local38 = local30 & 0x3;
			local42 = Static622.anIntArray622[local34];
			local65 = Static456.aClass6_Sub40_Sub2_2.method8585();
			if (Static148.method2358(Static152.anInt5122) || local20 >= 0 && local26 >= 0 && local20 < Static442.anInt7975 && Static284.anInt7916 > local26) {
				Static637.method8954(Static482.anInt8366, local42, local34, local65, local26, local38, local20);
			}
		} else if (arg0 == Static245.aClass244_13) {
			local12 = Static456.aClass6_Sub40_Sub2_2.method8571();
			local20 = Static456.aClass6_Sub40_Sub2_2.method8604();
			Static283.aClass210_2.method5629(local12).method7855(local20);
		} else {
			@Pc(562) int local562;
			if (Static105.aClass244_4 == arg0) {
				local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local20 = Static619.anInt10219 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static245.anInt6442;
				local30 = Static456.aClass6_Sub40_Sub2_2.method8571();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local65 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local71 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local73 = Static456.aClass6_Sub40_Sub2_2.method8571();
				if (local20 >= 0 && local26 >= 0 && Static442.anInt7975 > local20 && Static284.anInt7916 > local26) {
					local562 = local38 + 1;
					if (local20 - local562 <= Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] <= local20 + local562 && local26 - local562 <= Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0] && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0] <= local26 + local562) {
						Static95.method1540(local71, (Static482.anInt8366 << 24) + ((local20 << 16) - (-(local26 << 8) - local38)), local30, local73, local65, local42);
					}
				}
			} else if (Static108.aClass244_5 == arg0) {
				local12 = Static456.aClass6_Sub40_Sub2_2.method8552();
				local20 = Static456.aClass6_Sub40_Sub2_2.method8573();
				local26 = Static245.anInt6442 + (local20 & 0x7);
				local30 = Static195.anInt3961 + local26;
				local34 = Static619.anInt10219 + (local20 >> 4 & 0x7);
				local38 = local34 + Static606.anInt8651;
				@Pc(682) Class6_Sub41 local682 = (Class6_Sub41) Static333.aClass128_46.method3560((long) (local38 | Static482.anInt8366 << 28 | local30 << 14));
				if (local682 != null) {
					for (@Pc(692) Class6_Sub14 local692 = (Class6_Sub14) local682.aClass8_57.method149(); local692 != null; local692 = (Class6_Sub14) local682.aClass8_57.method155()) {
						if (local692.anInt2255 == (local12 & 0x7FFF)) {
							local692.method9043();
							break;
						}
					}
					if (local682.aClass8_57.method151()) {
						local682.method9043();
					}
					if (local34 >= 0 && local26 >= 0 && Static442.anInt7975 > local34 && local26 < Static284.anInt7916) {
						Static596.method8371(Static482.anInt8366, local34, local26);
					}
				}
			} else if (arg0 == Static437.aClass244_18) {
				local12 = Static456.aClass6_Sub40_Sub2_2.method8576();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static622.anIntArray622[local20];
				local34 = Static456.aClass6_Sub40_Sub2_2.method8576();
				local38 = Static619.anInt10219 + (local34 >> 4 & 0x7);
				local42 = Static245.anInt6442 + (local34 & 0x7);
				local65 = Static456.aClass6_Sub40_Sub2_2.method8552();
				if (local65 == 65535) {
					local65 = -1;
				}
				Static381.method5937(Static482.anInt8366, local42, local26, local30, local65, local20, local38);
			} else if (Static1.aClass244_19 == arg0) {
				local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local20 = (local12 >> 4 & 0x7) + Static619.anInt10219;
				local26 = (local12 & 0x7) + Static245.anInt6442;
				local30 = Static456.aClass6_Sub40_Sub2_2.method8571();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local65 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local71 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local73 = Static456.aClass6_Sub40_Sub2_2.method8571();
				if (local20 >= 0 && local26 >= 0 && Static442.anInt7975 > local20 && local26 < Static284.anInt7916) {
					local562 = local38 + 1;
					if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] >= local20 - local562 && local562 + local20 >= Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0] >= local26 - local562 && local562 + local26 >= Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0]) {
						Static637.method8956(local65, local38 + (local20 << 16) + (Static482.anInt8366 << 24) + (local26 << 8), local73, local30, local71, local42);
					}
				}
			} else {
				@Pc(1018) int local1018;
				@Pc(1022) int local1022;
				@Pc(1033) int local1033;
				if (Static477.aClass244_20 == arg0) {
					local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
					@Pc(963) boolean local963 = (local12 & 0x80) != 0;
					local26 = (local12 >> 3 & 0x7) + Static619.anInt10219;
					local30 = (local12 & 0x7) + Static245.anInt6442;
					local34 = local26 + Static456.aClass6_Sub40_Sub2_2.method8602();
					local38 = local30 + Static456.aClass6_Sub40_Sub2_2.method8602();
					local42 = Static456.aClass6_Sub40_Sub2_2.method8615();
					local65 = Static456.aClass6_Sub40_Sub2_2.method8571();
					local71 = Static456.aClass6_Sub40_Sub2_2.method8604() * 4;
					local73 = Static456.aClass6_Sub40_Sub2_2.method8604() * 4;
					local562 = Static456.aClass6_Sub40_Sub2_2.method8571();
					local1018 = Static456.aClass6_Sub40_Sub2_2.method8571();
					local1022 = Static456.aClass6_Sub40_Sub2_2.method8604();
					if (local1022 == 255) {
						local1022 = -1;
					}
					local1033 = Static456.aClass6_Sub40_Sub2_2.method8571();
					if (local26 >= 0 && local30 >= 0 && Static442.anInt7975 > local26 && Static284.anInt7916 > local30 && local34 >= 0 && local38 >= 0 && Static442.anInt7975 > local34 && Static284.anInt7916 > local38 && local65 != 65535) {
						local26 = local26 * 512 + 256;
						local73 <<= 0x2;
						local1033 <<= 0x2;
						local30 = local30 * 512 + 256;
						local71 <<= 0x2;
						local34 = local34 * 512 + 256;
						local38 = local38 * 512 + 256;
						@Pc(1129) Class20_Sub2_Sub2_Sub4 local1129 = new Class20_Sub2_Sub2_Sub4(local65, Static482.anInt8366, Static482.anInt8366, local26, local30, local71, Static113.anInt2243 + local562, Static113.anInt2243 + local1018, local1022, local1033, 0, local42, local73, local963, -1);
						local1129.method8090(Static138.method2248(local34, Static482.anInt8366, local38) - local73, local562 - -Static113.anInt2243, local34, local38);
						Static364.aClass8_36.method157(new Class6_Sub2_Sub20(local1129));
					}
				} else if (arg0 == Static647.aClass244_21) {
					local12 = Static456.aClass6_Sub40_Sub2_2.method8576();
					local20 = (local12 >> 4 & 0x7) + Static619.anInt10219;
					local26 = (local12 & 0x7) + Static245.anInt6442;
					local30 = Static456.aClass6_Sub40_Sub2_2.method8604();
					local34 = local30 >> 2;
					local38 = local30 & 0x3;
					local42 = Static622.anIntArray622[local34];
					if (Static148.method2358(Static152.anInt5122) || local20 >= 0 && local26 >= 0 && local20 < Static442.anInt7975 && local26 < Static284.anInt7916) {
						Static637.method8954(Static482.anInt8366, local42, local34, -1, local26, local38, local20);
					}
				} else {
					@Pc(1384) int local1384;
					@Pc(1415) int local1415;
					if (Static275.aClass244_12 == arg0) {
						local12 = Static456.aClass6_Sub40_Sub2_2.method8576();
						local20 = (local12 >> 4 & 0x7) + Static619.anInt10219;
						local26 = (local12 & 0x7) + Static245.anInt6442;
						local30 = Static456.aClass6_Sub40_Sub2_2.method8585();
						@Pc(1257) Class312 local1257 = Static283.aClass210_2.method5629(local30);
						local38 = Static456.aClass6_Sub40_Sub2_2.method8560();
						local42 = local38 >> 2;
						local65 = Static622.anIntArray622[local42];
						local71 = Static456.aClass6_Sub40_Sub2_2.method8604();
						if (local42 == 11) {
							local42 = 10;
						}
						local73 = 0;
						if (local1257.aByteArray105 != null) {
							local562 = -1;
							for (local1018 = 0; local1018 < local1257.aByteArray105.length; local1018++) {
								if (local1257.aByteArray105[local1018] == local42) {
									local562 = local1018;
									break;
								}
							}
							local73 = local1257.anIntArrayArray48[local562].length;
						}
						local562 = 0;
						if (local1257.aShortArray126 != null) {
							local562 = local1257.aShortArray126.length;
						}
						local1018 = 0;
						if (local1257.aShortArray127 != null) {
							local1018 = local1257.aShortArray127.length;
						}
						if ((local71 & 0x1) == 1) {
							Static176.method9005(local26, local20, Static482.anInt8366, local65, (Class94) null);
						} else {
							@Pc(1344) int[] local1344 = null;
							if ((local71 & 0x2) == 2) {
								local1344 = new int[local73];
								for (local1033 = 0; local1033 < local73; local1033++) {
									local1344[local1033] = Static456.aClass6_Sub40_Sub2_2.method8571();
								}
							}
							@Pc(1374) short[] local1374 = null;
							if ((local71 & 0x4) == 4) {
								local1374 = new short[local562];
								for (local1384 = 0; local1384 < local562; local1384++) {
									local1374[local1384] = (short) Static456.aClass6_Sub40_Sub2_2.method8571();
								}
							}
							@Pc(1403) short[] local1403 = null;
							if ((local71 & 0x8) == 8) {
								local1403 = new short[local1018];
								for (local1415 = 0; local1415 < local1018; local1415++) {
									local1403[local1415] = (short) Static456.aClass6_Sub40_Sub2_2.method8571();
								}
							}
							Static176.method9005(local26, local20, Static482.anInt8366, local65, new Class94((long) Static78.aLong37++, local1344, local1374, local1403));
						}
					} else if (Static240.aClass244_9 == arg0) {
						local12 = Static456.aClass6_Sub40_Sub2_2.method8585();
						local20 = Static456.aClass6_Sub40_Sub2_2.method8576();
						local26 = (local20 & 0x7) + Static245.anInt6442;
						local30 = local26 + Static195.anInt3961;
						local34 = (local20 >> 4 & 0x7) + Static619.anInt10219;
						local38 = Static606.anInt8651 + local34;
						local42 = Static456.aClass6_Sub40_Sub2_2.method8585();
						local65 = Static456.aClass6_Sub40_Sub2_2.method8585();
						if (Static229.anInt4561 != local42) {
							@Pc(1523) boolean local1523 = local34 >= 0 && local26 >= 0 && Static442.anInt7975 > local34 && local26 < Static284.anInt7916;
							if (local1523 || Static148.method2358(Static152.anInt5122)) {
								Static50.method880(new Class6_Sub14(local65, local12), local30, Static482.anInt8366, local38);
								if (local1523) {
									Static596.method8371(Static482.anInt8366, local34, local26);
								}
							}
						}
					} else if (Static369.aClass244_16 == arg0) {
						local12 = Static456.aClass6_Sub40_Sub2_2.method8604();
						local20 = (local12 >> 4 & 0xF) + Static619.anInt10219 * 2;
						local26 = (local12 & 0xF) + Static245.anInt6442 * 2;
						local30 = Static456.aClass6_Sub40_Sub2_2.method8604();
						@Pc(1591) boolean local1591 = (local30 & 0x1) != 0;
						@Pc(1602) boolean local1602 = (local30 & 0x2) != 0;
						local42 = local1602 ? local30 >> 2 : -1;
						local65 = Static456.aClass6_Sub40_Sub2_2.method8602() + local20;
						local71 = local26 + Static456.aClass6_Sub40_Sub2_2.method8602();
						local73 = Static456.aClass6_Sub40_Sub2_2.method8615();
						local562 = Static456.aClass6_Sub40_Sub2_2.method8615();
						local1018 = Static456.aClass6_Sub40_Sub2_2.method8571();
						local1022 = Static456.aClass6_Sub40_Sub2_2.method8604();
						if (local1602) {
							local1022 = (byte) local1022;
						} else {
							local1022 *= 4;
						}
						local1033 = Static456.aClass6_Sub40_Sub2_2.method8604() * 4;
						local1384 = Static456.aClass6_Sub40_Sub2_2.method8571();
						local1415 = Static456.aClass6_Sub40_Sub2_2.method8571();
						@Pc(1671) int local1671 = Static456.aClass6_Sub40_Sub2_2.method8604();
						@Pc(1675) int local1675 = Static456.aClass6_Sub40_Sub2_2.method8571();
						if (local1671 == 255) {
							local1671 = -1;
						}
						if (local20 >= 0 && local26 >= 0 && Static442.anInt7975 * 2 > local20 && Static442.anInt7975 * 2 > local26 && local65 >= 0 && local71 >= 0 && local65 < Static284.anInt7916 * 2 && local71 < Static284.anInt7916 * 2 && local1018 != 65535) {
							local1675 <<= 0x2;
							local1022 <<= 0x2;
							local1033 <<= 0x2;
							local26 *= 256;
							local20 *= 256;
							local65 *= 256;
							local71 *= 256;
							if (local73 != 0 && local42 != -1) {
								@Pc(1767) Class20_Sub2_Sub2_Sub1 local1767 = null;
								@Pc(1776) int local1776;
								if (local73 >= 0) {
									local1776 = local73 - 1;
									@Pc(1783) Class6_Sub46 local1783 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local1776);
									if (local1783 != null) {
										local1767 = local1783.aClass20_Sub2_Sub2_Sub1_Sub2_1;
									}
								} else {
									local1776 = -local73 - 1;
									if (local1776 == Static229.anInt4561) {
										local1767 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1;
									} else {
										local1767 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local1776];
									}
								}
								if (local1767 != null) {
									@Pc(1810) Class201 local1810 = local1767.method4911();
									if (local1810.anIntArrayArray25 != null && local1810.anIntArrayArray25[local42] != null) {
										local1022 -= local1810.anIntArrayArray25[local42][1];
									}
									if (local1810.anIntArrayArray26 != null && local1810.anIntArrayArray26[local42] != null) {
										local1022 -= local1810.anIntArrayArray26[local42][1];
									}
								}
							}
							@Pc(1867) Class20_Sub2_Sub2_Sub4 local1867 = new Class20_Sub2_Sub2_Sub4(local1018, Static482.anInt8366, Static482.anInt8366, local20, local26, local1022, Static113.anInt2243 + local1384, local1415 + Static113.anInt2243, local1671, local1675, local73, local562, local1033, local1591, local42);
							local1867.method8090(Static138.method2248(local65, Static482.anInt8366, local71) - local1033, local1384 + Static113.anInt2243, local65, local71);
							Static364.aClass8_36.method157(new Class6_Sub2_Sub20(local1867));
						}
					} else {
						Static619.method8645((Throwable) null, "T3 - " + arg0);
						Static126.method2048(false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
	public static boolean method525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static413.method6509(arg0, arg1) | (arg1 & 0x70000) != 0 || Static216.method3671(arg0, arg1);
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)Lclient!tl;")
	public static Class6_Sub45 method526() {
		if (Static487.aClass8_51 == null || Static275.aClass91_1 == null) {
			return null;
		}
		for (@Pc(21) Class6_Sub45 local21 = (Class6_Sub45) Static275.aClass91_1.method2335(); local21 != null; local21 = (Class6_Sub45) Static275.aClass91_1.method2335()) {
			@Pc(29) Class105 local29 = Static487.aClass337_4.method8119(local21.anInt9417);
			if (local29 != null && local29.aBoolean244 && local29.method3042(Static487.anInterface25_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!ha;IIIBIII)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface12 local11 = (Interface12) Static245.method5549(arg2, arg6, arg7);
		@Pc(20) Class312 local20;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(38) int local38;
		if (local11 != null) {
			local20 = Static283.aClass210_2.method5629(local11.method9026());
			local28 = local11.method9029() & 0x3;
			local32 = local11.method9032();
			if (local20.anInt9222 == -1) {
				local38 = arg5;
				if (local20.anInt9207 > 0) {
					local38 = arg3;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg1.method8782(local38, 4, arg4, arg0);
					} else if (local28 == 1) {
						arg1.method8790(arg4, 4, local38, arg0);
					} else if (local28 == 2) {
						arg1.method8782(local38, 4, arg4, arg0 + 3);
					} else if (local28 == 3) {
						arg1.method8790(arg4 + 3, 4, local38, arg0);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg1.method8815(arg0, local38, 1, arg4, 1);
					} else if (local28 == 1) {
						arg1.method8815(arg0 + 3, local38, 1, arg4, 1);
					} else if (local28 == 2) {
						arg1.method8815(arg0 + 3, local38, 1, arg4 + 3, 1);
					} else if (local28 == 3) {
						arg1.method8815(arg0, local38, 1, arg4 + 3, 1);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg1.method8790(arg4, 4, local38, arg0);
					} else if (local28 == 1) {
						arg1.method8782(local38, 4, arg4, arg0 + 3);
					} else if (local28 == 2) {
						arg1.method8790(arg4 + 3, 4, local38, arg0);
					} else if (local28 == 3) {
						arg1.method8782(local38, 4, arg4, arg0);
					}
				}
			} else {
				Static269.method4789(arg4, arg1, local28, local20, arg0);
			}
		}
		local11 = (Interface12) Static366.method5797(arg2, arg6, arg7, jn.class);
		if (local11 != null) {
			local20 = Static283.aClass210_2.method5629(local11.method9026());
			local28 = local11.method9029() & 0x3;
			local32 = local11.method9032();
			if (local20.anInt9222 != -1) {
				Static269.method4789(arg4, arg1, local28, local20, arg0);
			} else if (local32 == 9) {
				local38 = -1118482;
				if (local20.anInt9207 > 0) {
					local38 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg1.method8832(arg4 + 3, arg4, arg0, local38, arg0 + 3);
				} else {
					arg1.method8832(arg4, arg4 + 3, arg0, local38, arg0 + 3);
				}
			}
		}
		local11 = (Interface12) Static158.method2999(arg2, arg6, arg7);
		if (local11 == null) {
			return;
		}
		local20 = Static283.aClass210_2.method5629(local11.method9026());
		local28 = local11.method9029() & 0x3;
		if (local20.anInt9222 != -1) {
			Static269.method4789(arg4, arg1, local28, local20, arg0);
		}
	}
}
