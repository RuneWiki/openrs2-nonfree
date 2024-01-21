import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!ah;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!tg;")
	private static Class81 aClass81_228 = Static120.method2057("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_227 = aClass81_228;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!tg;")
	private static Class81 aClass81_230 = Static120.method2057("Loading title screen )2 ");

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_229 = aClass81_230;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_231 = Static120.method2057("Welt");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I")
	public static int method566() {
		@Pc(12) int local12 = 3;
		if (Static106.anInt2331 < 310) {
			@Pc(21) int local21 = Static53.anInt1289 >> 7;
			@Pc(26) int local26 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 >> 7;
			@Pc(31) int local31 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 >> 7;
			@Pc(43) int local43;
			if (local21 < local26) {
				local43 = local26 - local21;
			} else {
				local43 = local21 - local26;
			}
			@Pc(53) int local53 = Static69.anInt1702 >> 7;
			@Pc(61) int local61;
			if (local31 > local53) {
				local61 = local31 - local53;
			} else {
				local61 = local53 - local31;
			}
			if ((Static43.aByteArrayArrayArray2[Static44.anInt1086][local21][local53] & 0x4) != 0) {
				local12 = Static44.anInt1086;
			}
			@Pc(91) int local91;
			@Pc(85) int local85;
			if (local61 >= local43) {
				local85 = 32768;
				local91 = local43 * 65536 / local61;
				while (local53 != local31) {
					local85 += local91;
					if (local53 < local31) {
						local53++;
					} else if (local31 < local53) {
						local53--;
					}
					if ((Static43.aByteArrayArrayArray2[Static44.anInt1086][local21][local53] & 0x4) != 0) {
						local12 = Static44.anInt1086;
					}
					if (local85 >= 65536) {
						local85 -= 65536;
						if (local26 > local21) {
							local21++;
						} else if (local26 < local21) {
							local21--;
						}
						if ((Static43.aByteArrayArrayArray2[Static44.anInt1086][local21][local53] & 0x4) != 0) {
							local12 = Static44.anInt1086;
						}
					}
				}
			} else {
				local91 = local61 * 65536 / local43;
				local85 = 32768;
				while (local26 != local21) {
					if (local21 < local26) {
						local21++;
					} else if (local21 > local26) {
						local21--;
					}
					if ((Static43.aByteArrayArrayArray2[Static44.anInt1086][local21][local53] & 0x4) != 0) {
						local12 = Static44.anInt1086;
					}
					local85 += local91;
					if (local85 >= 65536) {
						local85 -= 65536;
						if (local53 < local31) {
							local53++;
						} else if (local31 < local53) {
							local53--;
						}
						if ((Static43.aByteArrayArrayArray2[Static44.anInt1086][local21][local53] & 0x4) != 0) {
							local12 = Static44.anInt1086;
						}
					}
				}
			}
		}
		if ((Static43.aByteArrayArrayArray2[Static44.anInt1086][Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 >> 7][Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 >> 7] & 0x4) != 0) {
			local12 = Static44.anInt1086;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBI)V")
	public static void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static121.anInt2707 = 0;
		@Pc(264) int local264;
		@Pc(187) int local187;
		@Pc(119) int local119;
		for (@Pc(5) int local5 = -1; local5 < Static35.anInt962 + Static25.anInt645; local5++) {
			@Pc(12) Class1_Sub2_Sub1_Sub3 local12;
			if (local5 == -1) {
				local12 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1;
			} else if (Static25.anInt645 <= local5) {
				local12 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[Static85.anIntArray15[local5 - Static25.anInt645]];
			} else {
				local12 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[Static176.anIntArray423[local5]];
			}
			if (local12 != null && local12.method2363()) {
				@Pc(53) Class1_Sub2_Sub5 local53;
				if (local12 instanceof Class1_Sub2_Sub1_Sub3_Sub2) {
					local53 = ((Class1_Sub2_Sub1_Sub3_Sub2) local12).aClass1_Sub2_Sub5_1;
					if (local53.anIntArray81 != null) {
						local53 = local53.method766();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (local5 >= Static25.anInt645) {
					local53 = ((Class1_Sub2_Sub1_Sub3_Sub2) local12).aClass1_Sub2_Sub5_1;
					if (local53.anIntArray81 != null) {
						local53 = local53.method766();
					}
					if (local53.anInt1009 >= 0 && local53.anInt1009 < Static146.aClass1_Sub2_Sub2_Sub3Array10.length) {
						Static41.method799(local12, local12.method2364() + 15);
						if (Static20.anInt507 > -1) {
							Static146.aClass1_Sub2_Sub2_Sub3Array10[local53.anInt1009].method2130(arg3 + Static20.anInt507 - 12, arg1 - -Static78.anInt1832 + -30);
						}
					}
					@Pc(117) Class80[] local117 = Static2.aClass80Array1;
					for (local119 = 0; local119 < local117.length; local119++) {
						@Pc(125) Class80 local125 = local117[local119];
						if (local125 != null && local125.anInt3569 == 1 && local125.anInt3564 == Static85.anIntArray15[local5 - Static25.anInt645] && Static142.anInt3104 % 20 < 10) {
							Static41.method799(local12, local12.method2364() + 15);
							if (Static20.anInt507 > -1) {
								Static107.aClass1_Sub2_Sub2_Sub3Array8[local125.anInt3567].method2130(Static20.anInt507 + arg3 - 12, arg1 - -Static78.anInt1832 + -28);
							}
						}
					}
				} else {
					local187 = 30;
					@Pc(190) Class1_Sub2_Sub1_Sub3_Sub1 local190 = (Class1_Sub2_Sub1_Sub3_Sub1) local12;
					if (local190.anInt1527 != -1 || local190.anInt1532 != -1) {
						Static41.method799(local12, local12.method2364() + 15);
						if (Static20.anInt507 > -1) {
							if (local190.anInt1527 != -1) {
								Static135.aClass1_Sub2_Sub2_Sub3Array7[local190.anInt1527].method2130(Static20.anInt507 + arg3 - 12, Static78.anInt1832 + arg1 + -30);
								local187 += 25;
							}
							if (local190.anInt1532 != -1) {
								Static146.aClass1_Sub2_Sub2_Sub3Array10[local190.anInt1532].method2130(Static20.anInt507 + arg3 - 12, -local187 + arg1 - -Static78.anInt1832);
								local187 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(262) Class80[] local262 = Static2.aClass80Array1;
						for (local264 = 0; local264 < local262.length; local264++) {
							@Pc(270) Class80 local270 = local262[local264];
							if (local270 != null && local270.anInt3569 == 10 && local270.anInt3564 == Static176.anIntArray423[local5]) {
								Static41.method799(local12, local12.method2364() + 15);
								if (Static20.anInt507 > -1) {
									Static107.aClass1_Sub2_Sub2_Sub3Array8[local270.anInt3567].method2130(Static20.anInt507 + arg3 - 12, -local187 + Static78.anInt1832 + arg1);
								}
							}
						}
					}
				}
				if (local12.aClass81_1088 != null && (local5 >= Static25.anInt645 || Static70.anInt1713 == 0 || Static70.anInt1713 == 3 || Static70.anInt1713 == 1 && Static99.method2683(((Class1_Sub2_Sub1_Sub3_Sub1) local12).aClass81_518))) {
					Static41.method799(local12, local12.method2364());
					if (Static20.anInt507 > -1 && Static121.anInt2707 < Static133.anInt2875) {
						Static133.anIntArray317[Static121.anInt2707] = Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1934(local12.aClass81_1088) / 2;
						Static133.anIntArray315[Static121.anInt2707] = Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.anInt2496;
						Static133.anIntArray313[Static121.anInt2707] = Static20.anInt507;
						Static133.anIntArray314[Static121.anInt2707] = Static78.anInt1832;
						Static133.anIntArray311[Static121.anInt2707] = local12.anInt3015;
						Static133.anIntArray316[Static121.anInt2707] = local12.anInt3032;
						Static133.anIntArray312[Static121.anInt2707] = local12.anInt3035;
						Static133.aClass81Array15[Static121.anInt2707] = local12.aClass81_1088;
						Static121.anInt2707++;
					}
				}
				if (local12.anInt3043 > Static142.anInt3104) {
					Static41.method799(local12, local12.method2364() + 15);
					if (Static20.anInt507 > -1) {
						Static4.method2572(Static20.anInt507 + arg3 - 15, Static78.anInt1832 + arg1 + -3, local12.anInt3014, 5, 65280);
						Static4.method2572(local12.anInt3014 + arg3 + Static20.anInt507 - 15, Static78.anInt1832 + -3 + arg1, 30 - local12.anInt3014, 5, 16711680);
					}
				}
				for (local187 = 0; local187 < 4; local187++) {
					if (Static142.anInt3104 < local12.anIntArray327[local187]) {
						Static41.method799(local12, local12.method2364() / 2);
						if (Static20.anInt507 > -1) {
							if (local187 == 1) {
								Static78.anInt1832 -= 20;
							}
							if (local187 == 2) {
								Static20.anInt507 -= 15;
								Static78.anInt1832 -= 10;
							}
							if (local187 == 3) {
								Static78.anInt1832 -= 10;
								Static20.anInt507 += 15;
							}
							Static9.aClass1_Sub2_Sub2_Sub3Array2[local12.anIntArray328[local187]].method2130(Static20.anInt507 + arg3 - 12, Static78.anInt1832 + (arg1 - 12));
							Static108.aClass1_Sub2_Sub2_Sub2_Sub1_2.method1948(Static149.method2548(local12.anIntArray325[local187]), arg3 + Static20.anInt507 - 1, Static78.anInt1832 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(573) int local573 = 0; local573 < Static121.anInt2707; local573++) {
			local187 = Static133.anIntArray313[local573];
			@Pc(583) int local583 = Static133.anIntArray314[local573];
			local119 = Static133.anIntArray317[local573];
			local264 = Static133.anIntArray315[local573];
			@Pc(593) boolean local593 = true;
			while (local593) {
				local593 = false;
				for (@Pc(599) int local599 = 0; local599 < local573; local599++) {
					if (local583 + 2 > Static133.anIntArray314[local599] - Static133.anIntArray315[local599] && local583 - local264 < Static133.anIntArray314[local599] + 2 && Static133.anIntArray317[local599] + Static133.anIntArray313[local599] > -local119 + local187 && local119 + local187 > Static133.anIntArray313[local599] - Static133.anIntArray317[local599] && Static133.anIntArray314[local599] - Static133.anIntArray315[local599] < local583) {
						local583 = Static133.anIntArray314[local599] - Static133.anIntArray315[local599];
						local593 = true;
					}
				}
			}
			Static20.anInt507 = Static133.anIntArray313[local573];
			Static78.anInt1832 = Static133.anIntArray314[local573] = local583;
			@Pc(701) Class81 local701 = Static133.aClass81Array15[local573];
			if (Static50.anInt1178 == 0) {
				@Pc(705) int local705 = 16776960;
				if (Static133.anIntArray311[local573] < 6) {
					local705 = Static65.anIntArray133[Static133.anIntArray311[local573]];
				}
				if (Static133.anIntArray311[local573] == 6) {
					local705 = Static92.anInt2056 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static133.anIntArray311[local573] == 7) {
					local705 = Static92.anInt2056 % 20 < 10 ? 255 : 65535;
				}
				if (Static133.anIntArray311[local573] == 8) {
					local705 = Static92.anInt2056 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(778) int local778;
				if (Static133.anIntArray311[local573] == 9) {
					local778 = 150 - Static133.anIntArray312[local573];
					if (local778 < 50) {
						local705 = local778 * 1280 + 16711680;
					} else if (local778 < 100) {
						local705 = 16776960 - (local778 - 50) * 327680;
					} else if (local778 < 150) {
						local705 = (local778 - 100) * 5 + 65280;
					}
				}
				if (Static133.anIntArray311[local573] == 10) {
					local778 = 150 - Static133.anIntArray312[local573];
					if (local778 < 50) {
						local705 = local778 * 5 + 16711680;
					} else if (local778 < 100) {
						local705 = 16711935 + 16384000 - local778 * 327680;
					} else if (local778 < 150) {
						local705 = (local778 - 100) * 327680 + 500 + 255 - local778 * 5;
					}
				}
				if (Static133.anIntArray311[local573] == 11) {
					local778 = 150 - Static133.anIntArray312[local573];
					if (local778 < 50) {
						local705 = 16777215 - local778 * 327685;
					} else if (local778 < 100) {
						local705 = local778 * 327685 + 65280 - 16384250;
					} else if (local778 < 150) {
						local705 = 32768000 + 16777215 - local778 * 327680;
					}
				}
				if (Static133.anIntArray316[local573] == 0) {
					Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1948(local701, arg3 + Static20.anInt507, arg1 + Static78.anInt1832, local705, 0);
				}
				if (Static133.anIntArray316[local573] == 1) {
					Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1929(local701, Static20.anInt507 + arg3, arg1 - -Static78.anInt1832, local705, Static92.anInt2056);
				}
				if (Static133.anIntArray316[local573] == 2) {
					Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1927(local701, Static20.anInt507 + arg3, arg1 + Static78.anInt1832, local705, Static92.anInt2056);
				}
				if (Static133.anIntArray316[local573] == 3) {
					Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1935(local701, Static20.anInt507 + arg3, Static78.anInt1832 + arg1, local705, Static92.anInt2056, 150 - Static133.anIntArray312[local573]);
				}
				if (Static133.anIntArray316[local573] == 4) {
					local778 = (150 - Static133.anIntArray312[local573]) * (Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1934(local701) + 100) / 150;
					Static4.method2567(arg3 + Static20.anInt507 - 50, arg1, Static20.anInt507 + arg3 + 50, arg1 + arg2);
					Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1949(local701, Static20.anInt507 + arg3 + 50 - local778, arg1 + Static78.anInt1832, local705, 0);
					Static4.method2576(arg3, arg1, arg0 + arg3, arg1 - -arg2);
				}
				if (Static133.anIntArray316[local573] == 5) {
					local778 = 150 - Static133.anIntArray312[local573];
					Static4.method2567(arg3, arg1 + Static78.anInt1832 - Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.anInt2496 - 1, arg3 + arg0, arg1 + Static78.anInt1832 + 5);
					@Pc(1100) int local1100 = 0;
					if (local778 < 25) {
						local1100 = local778 - 25;
					} else if (local778 > 125) {
						local1100 = local778 - 125;
					}
					Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1948(local701, Static20.anInt507 + arg3, local1100 + Static78.anInt1832 + arg1, local705, 0);
					Static4.method2576(arg3, arg1, arg3 + arg0, arg2 + arg1);
				}
			} else {
				Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1948(local701, Static20.anInt507 + arg3, Static78.anInt1832 + arg1, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	public static void method568() {
		aClass81_231 = null;
		aClass81_229 = null;
		aClass81_227 = null;
		aByteArrayArrayArray1 = null;
		aClass81_228 = null;
		aClass5_4 = null;
		aClass81_230 = null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)[B")
	public static byte[] method569(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(18) byte[] local18 = new byte[local11];
		Static190.method1388(arg0, 0, local18, 0, local11);
		return local18;
	}
}
