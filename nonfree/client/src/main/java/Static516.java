import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!ht;B)V")
	public static void method7430(@OriginalArg(0) Class148 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(61) int local61;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(106) int local106;
		@Pc(110) int local110;
		@Pc(114) int local114;
		@Pc(89) int local89;
		if (Static247.aClass148_22 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = (local12 >> 4 & 0xF) + Static148.anInt4149 * 2;
			local30 = (local12 & 0xF) + Static602.anInt9884 * 2;
			local34 = Static167.aClass5_Sub12_Sub2_1.method8645();
			@Pc(45) boolean local45 = (local34 & 0x1) != 0;
			@Pc(53) boolean local53 = (local34 & 0x2) != 0;
			local61 = local53 ? local34 >> 2 : -1;
			local67 = Static167.aClass5_Sub12_Sub2_1.method8635() + local22;
			local73 = Static167.aClass5_Sub12_Sub2_1.method8635() + local30;
			local77 = Static167.aClass5_Sub12_Sub2_1.method8595();
			local81 = Static167.aClass5_Sub12_Sub2_1.method8595();
			local85 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local89 = Static167.aClass5_Sub12_Sub2_1.method8645();
			if (local53) {
				local89 = (byte) local89;
			} else {
				local89 *= 4;
			}
			local106 = Static167.aClass5_Sub12_Sub2_1.method8645() * 4;
			local110 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local114 = Static167.aClass5_Sub12_Sub2_1.method8631();
			@Pc(118) int local118 = Static167.aClass5_Sub12_Sub2_1.method8645();
			@Pc(122) int local122 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local118 == 255) {
				local118 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && Static111.anInt1752 * 2 > local22 && Static111.anInt1752 * 2 > local30 && local67 >= 0 && local73 >= 0 && Static279.anInt4567 * 2 > local67 && local73 < Static279.anInt4567 * 2 && local85 != 65535) {
				local89 <<= 0x2;
				local67 *= 256;
				local22 *= 256;
				local122 <<= 0x2;
				local30 *= 256;
				local73 = local73 * 256;
				local106 <<= 0x2;
				if (local77 != 0 && local61 != -1) {
					@Pc(214) Class14_Sub1_Sub1_Sub3 local214 = null;
					@Pc(220) int local220;
					if (local77 >= 0) {
						local220 = local77 - 1;
						@Pc(227) Class5_Sub13 local227 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local220);
						if (local227 != null) {
							local214 = local227.aClass14_Sub1_Sub1_Sub3_Sub2_1;
						}
					} else {
						local220 = -local77 - 1;
						if (Static620.anInt10055 == local220) {
							local214 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1;
						} else {
							local214 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local220];
						}
					}
					if (local214 != null) {
						@Pc(254) Class295 local254 = local214.method2519();
						if (local254.anIntArrayArray48 != null && local254.anIntArrayArray48[local61] != null) {
							local89 -= local254.anIntArrayArray48[local61][1];
						}
						if (local254.anIntArrayArray49 != null && local254.anIntArrayArray49[local61] != null) {
							local89 -= local254.anIntArrayArray49[local61][1];
						}
					}
				}
				@Pc(311) Class14_Sub1_Sub1_Sub2 local311 = new Class14_Sub1_Sub1_Sub2(local85, Static408.anInt7024, Static408.anInt7024, local22, local30, local89, Static235.anInt3998 + local110, local114 + Static235.anInt3998, local118, local122, local77, local81, local106, local45, local61);
				local311.method1865(local67, local73, Static600.method8378(local73, local67, Static408.anInt7024) - local106, Static235.anInt3998 + local110);
				Static471.aClass306_45.method7303(new Class5_Sub4_Sub11(local311));
			}
			return;
		}
		@Pc(375) int local375;
		@Pc(369) int local369;
		if (Static449.aClass148_27 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = (local12 >> 4 & 0x7) + Static148.anInt4149;
			local30 = Static602.anInt9884 + (local12 & 0x7);
			local34 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local34 == 65535) {
				local34 = -1;
			}
			local369 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local375 = local369 >> 4 & 0xF;
			local61 = local369 & 0x7;
			local67 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local77 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local22 >= 0 && local30 >= 0 && Static111.anInt1752 > local22 && local30 < Static279.anInt4567) {
				local81 = local375 + 1;
				if (local22 - local81 <= Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] <= local81 + local22 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0] >= local30 - local81 && local81 + local30 >= Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0]) {
					Static648.method8898(local61, local34, local375 + (local30 << 8) + (Static408.anInt7024 << 24) + (local22 << 16), local73, local77, local67);
				}
			}
		} else if (arg0 == Static284.aClass148_24) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8640();
			local22 = Static167.aClass5_Sub12_Sub2_1.method8606();
			local30 = Static167.aClass5_Sub12_Sub2_1.method8607();
			local34 = (local30 & 0x7) + Static602.anInt9884;
			local369 = Static622.anInt10087 + local34;
			local375 = Static148.anInt4149 + (local30 >> 4 & 0x7);
			local61 = Static113.anInt1785 + local375;
			local67 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local12 != Static620.anInt10055) {
				@Pc(545) boolean local545 = local375 >= 0 && local34 >= 0 && local375 < Static111.anInt1752 && Static279.anInt4567 > local34;
				if (local545 || Static121.method1820(Static466.anInt7862)) {
					Static374.method5838(local369, new Class5_Sub32(local67, local22), Static408.anInt7024, local61);
					if (local545) {
						Static292.method4306(local375, Static408.anInt7024, local34);
					}
				}
			}
		} else if (arg0 == Static79.aClass148_28) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8633();
			if (local12 == 65535) {
				local12 = -1;
			}
			local22 = Static167.aClass5_Sub12_Sub2_1.method8607();
			local30 = local22 >> 2;
			local34 = local22 & 0x3;
			local369 = Static192.anIntArray687[local30];
			local375 = Static167.aClass5_Sub12_Sub2_1.method8615();
			local61 = Static148.anInt4149 + (local375 >> 4 & 0x7);
			local67 = Static602.anInt9884 + (local375 & 0x7);
			Static604.method8429(local369, local67, local12, local61, local34, Static408.anInt7024, local30);
		} else if (Static198.aClass148_19 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			@Pc(642) boolean local642 = (local12 & 0x80) != 0;
			local30 = (local12 >> 3 & 0x7) + Static148.anInt4149;
			local34 = (local12 & 0x7) + Static602.anInt9884;
			local369 = local30 + Static167.aClass5_Sub12_Sub2_1.method8635();
			local375 = Static167.aClass5_Sub12_Sub2_1.method8635() + local34;
			local61 = Static167.aClass5_Sub12_Sub2_1.method8595();
			local67 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local73 = Static167.aClass5_Sub12_Sub2_1.method8645() * 4;
			local77 = Static167.aClass5_Sub12_Sub2_1.method8645() * 4;
			local81 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local85 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local89 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local106 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local89 == 255) {
				local89 = -1;
			}
			if (local30 >= 0 && local34 >= 0 && local30 < Static111.anInt1752 && local34 < Static279.anInt4567 && local369 >= 0 && local375 >= 0 && Static111.anInt1752 > local369 && Static279.anInt4567 > local375 && local67 != 65535) {
				local369 = local369 * 512 + 256;
				local73 <<= 0x2;
				local375 = local375 * 512 + 256;
				local30 = local30 * 512 + 256;
				local77 <<= 0x2;
				local106 <<= 0x2;
				local34 = local34 * 512 + 256;
				@Pc(812) Class14_Sub1_Sub1_Sub2 local812 = new Class14_Sub1_Sub1_Sub2(local67, Static408.anInt7024, Static408.anInt7024, local30, local34, local73, local81 + Static235.anInt3998, Static235.anInt3998 + local85, local89, local106, 0, local61, local77, local642, -1);
				local812.method1865(local369, local375, Static600.method8378(local375, local369, Static408.anInt7024) - local77, local81 - -Static235.anInt3998);
				Static471.aClass306_45.method7303(new Class5_Sub4_Sub11(local812));
			}
		} else if (arg0 == Static388.aClass148_26) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = (local12 >> 4 & 0x7) + Static148.anInt4149;
			local30 = Static602.anInt9884 + (local12 & 0x7);
			local34 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local369 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local375 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local61 = Static167.aClass5_Sub12_Sub2_1.method8645();
			if (local22 >= 0 && local30 >= 0 && local22 < Static111.anInt1752 && Static279.anInt4567 > local30) {
				local67 = local22 * 512 + 256;
				local73 = local30 * 512 + 256;
				local77 = Static408.anInt7024;
				if (local77 < 3 && Static353.method5596(local22, local30)) {
					local77++;
				}
				@Pc(946) Class14_Sub1_Sub1_Sub4 local946 = new Class14_Sub1_Sub1_Sub4(local34, local375, Static235.anInt3998, Static408.anInt7024, local77, local67, Static600.method8378(local73, local67, Static408.anInt7024) - local369, local73, local22, local22, local30, local30, local61);
				Static334.aClass306_29.method7303(new Class5_Sub4_Sub9(local946));
			}
		} else if (Static111.aClass148_7 == arg0) {
			Static167.aClass5_Sub12_Sub2_1.method8645();
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = Static148.anInt4149 + (local12 >> 4 & 0x7);
			local30 = Static602.anInt9884 + (local12 & 0x7);
			local34 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local369 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local375 = Static167.aClass5_Sub12_Sub2_1.method8657();
			@Pc(996) String local996 = Static167.aClass5_Sub12_Sub2_1.method8617();
			Static582.method8177(local369, local34, local375, local22, local996, local30, Static408.anInt7024);
		} else if (Static201.aClass148_20 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local22 = Static167.aClass5_Sub12_Sub2_1.method8645();
			Static525.aClass371_4.method8554(local12).method6849(local22);
		} else if (Static205.aClass148_21 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8615();
			local22 = local12 >> 2;
			local30 = local12 & 0x3;
			local34 = Static192.anIntArray687[local22];
			local369 = Static167.aClass5_Sub12_Sub2_1.method8639();
			local375 = (local369 >> 4 & 0x7) + Static148.anInt4149;
			local61 = (local369 & 0x7) + Static602.anInt9884;
			if (Static121.method1820(Static466.anInt7862) || local375 >= 0 && local61 >= 0 && local375 < Static111.anInt1752 && Static279.anInt4567 > local61) {
				Static521.method7480(local375, local34, -1, local22, Static408.anInt7024, local30, local61);
			}
		} else if (Static532.aClass148_31 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = (local12 & 0x7) + Static602.anInt9884;
			local30 = Static622.anInt10087 + local22;
			local34 = (local12 >> 4 & 0x7) + Static148.anInt4149;
			local369 = local34 + Static113.anInt1785;
			local375 = Static167.aClass5_Sub12_Sub2_1.method8633();
			@Pc(1148) Class5_Sub17 local1148 = (Class5_Sub17) Static402.aClass81_65.method1599((long) (local30 << 14 | Static408.anInt7024 << 28 | local369));
			if (local1148 != null) {
				for (@Pc(1156) Class5_Sub32 local1156 = (Class5_Sub32) local1148.aClass306_14.method7313(); local1156 != null; local1156 = (Class5_Sub32) local1148.aClass306_14.method7301()) {
					if (local1156.anInt5871 == (local375 & 0x7FFF)) {
						local1156.method8911();
						break;
					}
				}
				if (local1148.aClass306_14.method7309()) {
					local1148.method8911();
				}
				if (local34 >= 0 && local22 >= 0 && Static111.anInt1752 > local34 && Static279.anInt4567 > local22) {
					Static292.method4306(local34, Static408.anInt7024, local22);
				}
			}
		} else if (arg0 == Static552.aClass148_32) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8633();
			local22 = Static167.aClass5_Sub12_Sub2_1.method8615();
			local30 = local22 >> 2;
			local34 = local22 & 0x3;
			local369 = Static192.anIntArray687[local30];
			local375 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local61 = (local375 >> 4 & 0x7) + Static148.anInt4149;
			local67 = Static602.anInt9884 + (local375 & 0x7);
			if (Static121.method1820(Static466.anInt7862) || local61 >= 0 && local67 >= 0 && Static111.anInt1752 > local61 && local67 < Static279.anInt4567) {
				Static521.method7480(local61, local369, local12, local30, Static408.anInt7024, local34, local67);
			}
		} else if (arg0 == Static286.aClass148_34) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = Static602.anInt9884 + (local12 & 0x7);
			local30 = Static622.anInt10087 + local22;
			local34 = Static148.anInt4149 + (local12 >> 4 & 0x7);
			local369 = Static113.anInt1785 + local34;
			local375 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local61 = Static167.aClass5_Sub12_Sub2_1.method8631();
			local67 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (Static402.aClass81_65 != null) {
				@Pc(1340) Class5_Sub17 local1340 = (Class5_Sub17) Static402.aClass81_65.method1599((long) (Static408.anInt7024 << 28 | local30 << 14 | local369));
				if (local1340 != null) {
					for (@Pc(1348) Class5_Sub32 local1348 = (Class5_Sub32) local1340.aClass306_14.method7313(); local1348 != null; local1348 = (Class5_Sub32) local1340.aClass306_14.method7301()) {
						if (local1348.anInt5871 == (local375 & 0x7FFF) && local1348.anInt5869 == local61) {
							local1348.method8911();
							local1348.anInt5869 = local67;
							Static374.method5838(local30, local1348, Static408.anInt7024, local369);
							break;
						}
					}
					if (local34 >= 0 && local22 >= 0 && Static111.anInt1752 > local34 && local22 < Static279.anInt4567) {
						Static292.method4306(local34, Static408.anInt7024, local22);
					}
				}
			}
		} else if (Static527.aClass148_35 == arg0) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local22 = (local12 >> 4 & 0x7) + Static148.anInt4149;
			local30 = Static602.anInt9884 + (local12 & 0x7);
			local34 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local34 == 65535) {
				local34 = -1;
			}
			local369 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local375 = local369 >> 4 & 0xF;
			local61 = local369 & 0x7;
			local67 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
			local77 = Static167.aClass5_Sub12_Sub2_1.method8631();
			if (local22 >= 0 && local30 >= 0 && local22 < Static111.anInt1752 && local30 < Static279.anInt4567) {
				local81 = local375 + 1;
				if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] >= local22 - local81 && local22 + local81 >= Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] && local30 - local81 <= Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0] && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0] <= local30 + local81) {
					Static270.method4080(local77, local67, (Static408.anInt7024 << 24) + (local22 << 16) + (local30 << 8) + local375, local61, local34, local73);
				}
			}
		} else if (arg0 == Static58.aClass148_4) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8633();
			local22 = Static167.aClass5_Sub12_Sub2_1.method8640();
			local30 = Static167.aClass5_Sub12_Sub2_1.method8615();
			local34 = (local30 & 0x7) + Static602.anInt9884;
			local369 = Static622.anInt10087 + local34;
			local375 = (local30 >> 4 & 0x7) + Static148.anInt4149;
			local61 = local375 + Static113.anInt1785;
			@Pc(1609) boolean local1609 = local375 >= 0 && local34 >= 0 && local375 < Static111.anInt1752 && Static279.anInt4567 > local34;
			if (local1609 || Static121.method1820(Static466.anInt7862)) {
				Static374.method5838(local369, new Class5_Sub32(local12, local22), Static408.anInt7024, local61);
				if (local1609) {
					Static292.method4306(local375, Static408.anInt7024, local34);
				}
			}
		} else if (arg0 == Static617.aClass148_36) {
			local12 = Static167.aClass5_Sub12_Sub2_1.method8639();
			local22 = local12 >> 2;
			local30 = Static192.anIntArray687[local22];
			local34 = Static167.aClass5_Sub12_Sub2_1.method8631();
			@Pc(1657) Class283 local1657 = Static525.aClass371_4.method8554(local34);
			local375 = Static167.aClass5_Sub12_Sub2_1.method8615();
			local61 = (local375 >> 4 & 0x7) + Static148.anInt4149;
			local67 = Static602.anInt9884 + (local375 & 0x7);
			if (local22 == 11) {
				local22 = 10;
			}
			local73 = Static167.aClass5_Sub12_Sub2_1.method8615();
			local77 = 0;
			if (local1657.aByteArray71 != null) {
				local81 = -1;
				for (local85 = 0; local85 < local1657.aByteArray71.length; local85++) {
					if (local1657.aByteArray71[local85] == local22) {
						local81 = local85;
						break;
					}
				}
				local77 = local1657.anIntArrayArray44[local81].length;
			}
			local81 = 0;
			if (local1657.aShortArray124 != null) {
				local81 = local1657.aShortArray124.length;
			}
			local85 = 0;
			if (local1657.aShortArray125 != null) {
				local85 = local1657.aShortArray125.length;
			}
			if ((local73 & 0x1) == 1) {
				Static395.method6125(Static408.anInt7024, local61, local30, local67, (Class35) null);
			} else {
				@Pc(1755) int[] local1755 = null;
				if ((local73 & 0x2) == 2) {
					local1755 = new int[local77];
					for (local106 = 0; local106 < local77; local106++) {
						local1755[local106] = Static167.aClass5_Sub12_Sub2_1.method8631();
					}
				}
				@Pc(1785) short[] local1785 = null;
				if ((local73 & 0x4) == 4) {
					local1785 = new short[local81];
					for (local110 = 0; local110 < local81; local110++) {
						local1785[local110] = (short) Static167.aClass5_Sub12_Sub2_1.method8631();
					}
				}
				@Pc(1812) short[] local1812 = null;
				if ((local73 & 0x8) == 8) {
					local1812 = new short[local85];
					for (local114 = 0; local114 < local85; local114++) {
						local1812[local114] = (short) Static167.aClass5_Sub12_Sub2_1.method8631();
					}
				}
				Static395.method6125(Static408.anInt7024, local61, local30, local67, new Class35((long) Static583.aLong252++, local1755, local1785, local1812));
			}
		} else {
			Static280.method4194("T3 - " + arg0, (Throwable) null);
			Static268.method4076(false);
		}
	}
}
