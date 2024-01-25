import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static int anInt9937 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public static void method7917() {
		if (Static498.anInt8676 < 0) {
			return;
		}
		@Pc(9) long local9 = Static416.method5922();
		Static498.anInt8676 = (int) ((long) Static498.anInt8676 + Static177.aLong72 - local9);
		if (Static498.anInt8676 > 0) {
			@Pc(26) int local26 = (Static498.anInt8676 << 8) / Static195.anInt3802;
			@Pc(31) int local31 = 255 - local26;
			@Pc(36) float local36 = (float) local26 / 255.0F;
			Static281.anInt5187 = ((Static325.aClass5_2.anInt73 & 0xFF00FF) * local31 + (Static250.anInt4585 & 0xFF00FF) * local26 & 0xFF00FF00) + ((Static325.aClass5_2.anInt73 & 0xFF00) * local31 + local26 * (Static250.anInt4585 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(73) float local73 = 1.0F - local36;
			Static582.aFloat171 = Static256.aFloat121 + local73 * (Static325.aClass5_2.aFloat9 - Static256.aFloat121);
			Static343.aFloat156 = Static290.aFloat128 + (Static325.aClass5_2.aFloat10 - Static290.aFloat128) * local73;
			Static348.aFloat157 = local73 * (Static325.aClass5_2.aFloat6 - Static151.aFloat64) + Static151.aFloat64;
			Static163.anInt2988 = (local31 * (Static325.aClass5_2.anInt72 & 0xFF00) + (Static413.anInt7399 & 0xFF00) * local26 & 0xFF0000) + (local26 * (Static413.anInt7399 & 0xFF00FF) + local31 * (Static325.aClass5_2.anInt72 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static121.aFloat36 = local73 * (Static325.aClass5_2.aFloat11 - Static333.aFloat154) + Static333.aFloat154;
			Static475.aFloat175 = local73 * (Static325.aClass5_2.aFloat8 - Static570.aFloat209) + Static570.aFloat209;
			Static78.aFloat25 = (Static325.aClass5_2.aFloat7 - Static566.aFloat208) * local73 + Static566.aFloat208;
			Static239.anInt4386 = Static169.anInt9273 * local26 + local31 * Static325.aClass5_2.anInt76 >> 8;
			if (Static473.aClass3_3 != Static325.aClass5_2.aClass3_1) {
				Static23.aClass3_2 = Static89.aClass90_3.method7503(Static473.aClass3_3, Static325.aClass5_2.aClass3_1, local73, Static23.aClass3_2);
			}
		} else {
			Static475.aFloat175 = Static325.aClass5_2.aFloat8;
			Static348.aFloat157 = Static325.aClass5_2.aFloat6;
			Static343.aFloat156 = Static325.aClass5_2.aFloat10;
			Static163.anInt2988 = Static325.aClass5_2.anInt72;
			Static78.aFloat25 = Static325.aClass5_2.aFloat7;
			Static281.anInt5187 = Static325.aClass5_2.anInt73;
			Static121.aFloat36 = Static325.aClass5_2.aFloat11;
			Static582.aFloat171 = Static325.aClass5_2.aFloat9;
			Static239.anInt4386 = Static325.aClass5_2.anInt76;
			Static23.aClass3_2 = Static325.aClass5_2.aClass3_1;
			Static498.anInt8676 = -1;
		}
		Static177.aLong72 = local9;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
	public static void method7918(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static152.anInt1936 != -1) {
				Static228.method3571(Static152.anInt1936);
			}
			for (@Pc(18) Class6_Sub43 local18 = (Class6_Sub43) Static162.aClass234_23.method5469(); local18 != null; local18 = (Class6_Sub43) Static162.aClass234_23.method5465()) {
				if (!local18.method7949()) {
					local18 = (Class6_Sub43) Static162.aClass234_23.method5469();
					if (local18 == null) {
						break;
					}
				}
				Static536.method7299(false, true, local18);
			}
			Static152.anInt1936 = -1;
			Static162.aClass234_23 = new Class234(8);
			Static291.method4405();
			Static152.anInt1936 = Static320.anInt6124;
			Static20.method306(false);
			Static39.method645();
			Static199.method3320(Static152.anInt1936);
		}
		Static576.aString93 = "";
		Static286.aString42 = "";
		Static31.aBoolean30 = false;
		Static108.method1675();
		Static427.anInt7590 = -1;
		Static28.method408(Static269.anInt4756);
		Static461.aClass15_Sub2_Sub4_Sub2_2 = new Class15_Sub2_Sub4_Sub2();
		Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 = Static80.anInt1367 * 512 / 2;
		Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] = Static18.anInt5706 / 2;
		Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 = Static18.anInt5706 * 512 / 2;
		Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] = Static80.anInt1367 / 2;
		Static208.anInt3949 = 0;
		Static378.anInt6923 = 0;
		if (Static60.anInt1008 == 2) {
			Static378.anInt6923 = Static577.anInt9916 << 9;
			Static208.anInt3949 = Static478.anInt8409 << 9;
		} else {
			Static213.method3439();
		}
		Static323.method4986();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLclient!ql;I)V")
	public static void method7919(@OriginalArg(1) Class6_Sub12_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method6061(1) == 1;
		if (local17) {
			Static124.anIntArray181[Static534.anInt8867++] = arg1;
		}
		@Pc(32) int local32 = arg0.method6061(2);
		@Pc(36) Class15_Sub2_Sub4_Sub2 local36 = Static551.aClass15_Sub2_Sub4_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local32 == 1) {
				local149 = arg0.method6061(3);
				local154 = local36.anIntArray638[0];
				local159 = local36.anIntArray637[0];
				if (local149 == 0) {
					local154--;
					local159--;
				} else if (local149 == 1) {
					local159--;
				} else if (local149 == 2) {
					local159--;
					local154++;
				} else if (local149 == 3) {
					local154--;
				} else if (local149 == 4) {
					local154++;
				} else if (local149 == 5) {
					local154--;
					local159++;
				} else if (local149 == 6) {
					local159++;
				} else if (local149 == 7) {
					local159++;
					local154++;
				}
				if (local17) {
					local36.anInt9019 = local154;
					local36.aBoolean584 = true;
					local36.anInt9017 = local159;
				} else {
					local36.method7151(local154, Static507.aByteArray104[arg1], local159);
				}
			} else if (local32 == 2) {
				local149 = arg0.method6061(4);
				local154 = local36.anIntArray638[0];
				local159 = local36.anIntArray637[0];
				if (local149 == 0) {
					local154 -= 2;
					local159 -= 2;
				} else if (local149 == 1) {
					local154--;
					local159 -= 2;
				} else if (local149 == 2) {
					local159 -= 2;
				} else if (local149 == 3) {
					local154++;
					local159 -= 2;
				} else if (local149 == 4) {
					local159 -= 2;
					local154 += 2;
				} else if (local149 == 5) {
					local159--;
					local154 -= 2;
				} else if (local149 == 6) {
					local154 += 2;
					local159--;
				} else if (local149 == 7) {
					local154 -= 2;
				} else if (local149 == 8) {
					local154 += 2;
				} else if (local149 == 9) {
					local159++;
					local154 -= 2;
				} else if (local149 == 10) {
					local154 += 2;
					local159++;
				} else if (local149 == 11) {
					local159 += 2;
					local154 -= 2;
				} else if (local149 == 12) {
					local154--;
					local159 += 2;
				} else if (local149 == 13) {
					local159 += 2;
				} else if (local149 == 14) {
					local159 += 2;
					local154++;
				} else if (local149 == 15) {
					local159 += 2;
					local154 += 2;
				}
				if (local17) {
					local36.anInt9017 = local159;
					local36.aBoolean584 = true;
					local36.anInt9019 = local154;
				} else {
					local36.method7151(local154, Static507.aByteArray104[arg1], local159);
				}
			} else {
				local149 = arg0.method6061(1);
				@Pc(426) int local426;
				@Pc(436) int local436;
				@Pc(448) int local448;
				@Pc(455) int local455;
				if (local149 == 0) {
					local154 = arg0.method6061(12);
					local159 = local154 >> 10;
					local426 = local154 >> 5 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local436 = local154 & 0x1F;
					if (local436 > 15) {
						local436 -= 32;
					}
					local448 = local36.anIntArray638[0] + local426;
					local455 = local436 + local36.anIntArray637[0];
					if (local17) {
						local36.aBoolean584 = true;
						local36.anInt9019 = local448;
						local36.anInt9017 = local455;
					} else {
						local36.method7151(local448, Static507.aByteArray104[arg1], local455);
					}
					local36.aByte98 = (byte) (local36.aByte98 + local159 & 0x3);
					if (arg1 == Static517.anInt8881) {
						Static391.anInt7128 = local36.aByte98;
					}
				} else {
					local154 = arg0.method6061(30);
					local159 = local154 >> 28;
					local426 = local154 >> 14 & 0x3FFF;
					local436 = local154 & 0x3FFF;
					local448 = (local36.anIntArray638[0] + Static150.anInt2792 + local426 & 0x3FFF) - Static150.anInt2792;
					local455 = (local436 + local36.anIntArray637[0] + Static154.anInt2878 & 0x3FFF) - Static154.anInt2878;
					if (local17) {
						local36.anInt9017 = local455;
						local36.aBoolean584 = true;
						local36.anInt9019 = local448;
					} else {
						local36.method7151(local448, Static507.aByteArray104[arg1], local455);
					}
					local36.aByte98 = (byte) (local159 + local36.aByte98 & 0x3);
					if (arg1 == Static517.anInt8881) {
						Static391.anInt7128 = local36.aByte98;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean584 = false;
		} else if (arg1 == Static517.anInt8881) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class83 local64 = Static252.aClass83Array1[arg1] = new Class83();
			local64.anInt1959 = (local36.anIntArray638[0] + Static150.anInt2792 >> 6 << 14) + ((local36.aByte98 << 28) + (Static154.anInt2878 + local36.anIntArray637[0] >> 6));
			if (local36.anInt9036 == -1) {
				local64.anInt1961 = local36.aClass218_7.method5310();
			} else {
				local64.anInt1961 = local36.anInt9036;
			}
			local64.anInt1956 = local36.anInt8927;
			local64.aBoolean130 = local36.aBoolean586;
			if (local36.anInt9025 > 0) {
				Static31.method502(local36);
			}
			Static551.aClass15_Sub2_Sub4_Sub2Array1[arg1] = null;
			if (arg0.method6061(1) != 0) {
				Static318.method4956(arg0, arg1);
			}
		}
	}
}
