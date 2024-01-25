import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V")
	public static void method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg0) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local25;
		@Pc(39) Object local39 = arg3[local19];
		arg3[local19] = arg3[arg0];
		arg3[arg0] = local39;
		@Pc(56) int local56 = local25 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg0; local58++) {
			if ((local56 & local58) + local25 > arg2[local58]) {
				@Pc(73) int local73 = arg2[local58];
				arg2[local58] = arg2[local21];
				arg2[local21] = local73;
				@Pc(87) Object local87 = arg3[local58];
				arg3[local58] = arg3[local21];
				arg3[local21++] = local87;
			}
		}
		arg2[arg0] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg0] = arg3[local21];
		arg3[local21] = local39;
		method738(local21 - 1, arg1, arg2, arg3);
		method738(arg0, local21 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	public static void method740() {
		for (@Pc(1) int local1 = 0; local1 < Static389.anInt6119; local1++) {
			if (!Static182.aBooleanArray159[local1]) {
				@Pc(10) Class367 local10 = Static90.aClass367Array1[local1];
				@Pc(13) Class2_Sub24 local13 = local10.aClass2_Sub24_3;
				@Pc(16) int local16 = local10.anInt9858;
				@Pc(22) int local22 = local13.method6302() - Static427.anInt6729;
				@Pc(30) int local30 = (local22 * 2 >> Static609.anInt9827) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6299() - local22 >> Static609.anInt9827;
				@Pc(53) int local53 = local13.method6301() - local22 >> Static609.anInt9827;
				@Pc(61) int local61 = local13.method6301() + local22 >> Static609.anInt9827;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Class13_Sub1_Sub4_Sub1.lb) {
					local61 = Class13_Sub1_Sub4_Sub1.lb - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray145[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static322.anInt5120) {
						local108 = Static322.anInt5120 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class13_Sub1_Sub1 local141 = Static245.method3380(local16, local125, local78, gs.class);
						if (local141 != null && local141.aByte118 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte118 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray145[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray145[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray145[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray145[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static182.aBooleanArray159[local1] = true;
				Static314.aClass76Array2[local16].method7400(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public static void method741() {
		@Pc(5) int local5 = 0;
		if (Static234.aClass2_Sub5_48.aClass6_Sub17_1.method4403() == 1) {
			local5 = 55;
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8110() == 0) {
			local5 |= 0x40;
		}
		Static574.method7871(local5);
		Static319.aClass141_4.method2972(local5);
		Static72.aClass225_2.method4787(local5);
		Static409.aClass107_2.method2292(local5);
		Static460.aClass155_2.method3358(local5);
		Static180.method2630(local5);
		Static237.method3329(local5);
		Static90.method1431(local5);
		Static270.method3779(local5);
		Static566.method7765();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZIZ)V")
	public static void method743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static28.aClass53ArrayArrayArray1 == null) {
			Static192.aClass95_4.method6936(arg2, arg0, arg1, -16777216, arg3);
		} else if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >= 0 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 < Static228.anInt3704 * 512 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >= 0 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 < Static162.anInt2911 * 512) {
			Static482.anInt7692++;
			if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 != null && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 + 256 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() * 256 >> 9 == Static621.anInt9980 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 + 256 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() * 256 >> 9 == Static507.anInt8466) {
				Static621.anInt9980 = -1;
				Static507.anInt8466 = -1;
				Static46.method751();
			}
			Static290.method4014();
			if (!arg4) {
				Static199.method2846();
			}
			Static79.method1108();
			Static40.method644(arg2, arg1, arg3, true, arg0);
			@Pc(111) int local111 = Static244.anInt9751;
			@Pc(113) int local113 = Static621.anInt9968;
			@Pc(115) int local115 = Static93.anInt1717;
			Static638.anInt7982 = Static638.anInt7981;
			@Pc(119) int local119 = Static425.anInt6682;
			@Pc(127) int local127;
			@Pc(164) int local164;
			if (Static445.anInt7122 == 1) {
				local127 = (int) Static339.aFloat100;
				if (Static167.anInt2956 >> 8 > local127) {
					local127 = Static167.anInt2956 >> 8;
				}
				if (Static85.aBooleanArray124[4] && Static637.anIntArray694[4] + 128 > local127) {
					local127 = Static637.anIntArray694[4] + 128;
				}
				local164 = Static365.anInt5778 + (int) Static440.aFloat144 & 0x3FFF;
				Static533.method7367(Static263.anInt4236, local164, local127, Static203.anInt3426, Static504.method6917(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090, Static91.anInt1705, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089) - 200, local115, (local127 >> 3) * 3 + 600 << 2);
			} else if (Static445.anInt7122 == 4) {
				local127 = (int) Static339.aFloat100;
				if (local127 < Static167.anInt2956 >> 8) {
					local127 = Static167.anInt2956 >> 8;
				}
				if (Static85.aBooleanArray124[4] && Static637.anIntArray694[4] + 128 > local127) {
					local127 = Static637.anIntArray694[4] + 128;
				}
				local164 = (int) Static440.aFloat144 & 0x3FFF;
				Static533.method7367(Static263.anInt4236, local164, local127, Static203.anInt3426, Static504.method6917(Static319.anInt5080, Static91.anInt1705, Static418.anInt6556) - 200, local115, (local127 >> 3) * 3 + 600 << 2);
			} else if (Static445.anInt7122 == 5) {
				Static242.method3405(local115);
			}
			local127 = Static250.anInt4000;
			local164 = Static220.anInt3605;
			@Pc(272) int local272 = Static644.anInt10376;
			@Pc(274) int local274 = Static440.anInt7072;
			@Pc(276) int local276 = Static338.anInt5355;
			@Pc(319) int local319;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static85.aBooleanArray124[local278]) {
					local319 = (int) (Math.random() * (double) (Static598.anIntArray663[local278] * 2 + 1) - (double) Static598.anIntArray663[local278] + Math.sin((double) Static356.anIntArray402[local278] * ((double) Static243.anIntArray271[local278] / 100.0D)) * (double) Static637.anIntArray694[local278]);
					if (local278 == 1) {
						Static220.anInt3605 += local319 << 2;
					}
					if (local278 == 4) {
						Static440.anInt7072 += local319;
						if (Static440.anInt7072 < 1024) {
							Static440.anInt7072 = 1024;
						} else if (Static440.anInt7072 > 3072) {
							Static440.anInt7072 = 3072;
						}
					}
					if (local278 == 3) {
						Static338.anInt5355 = local319 + Static338.anInt5355 & 0x3FFF;
					}
					if (local278 == 0) {
						Static250.anInt4000 += local319 << 2;
					}
					if (local278 == 2) {
						Static644.anInt10376 += local319 << 2;
					}
				}
			}
			if (Static250.anInt4000 < 0) {
				Static250.anInt4000 = 0;
			}
			if (Static250.anInt4000 > (Static322.anInt5120 << 9) - 1) {
				Static250.anInt4000 = (Static322.anInt5120 << 9) - 1;
			}
			if (Static644.anInt10376 < 0) {
				Static644.anInt10376 = 0;
			}
			if (Static644.anInt10376 > (Class13_Sub1_Sub4_Sub1.lb << 9) - 1) {
				Static644.anInt10376 = (Class13_Sub1_Sub4_Sub1.lb << 9) - 1;
			}
			Static141.method2159();
			Static384.method5146();
			Static192.aClass95_4.KA(local111, local119, local113 + local111, local115 + local119);
			Static296.method4089(true);
			if (Static319.aBoolean356) {
				Static366.method4959(Static519.anInt8614);
				if (Static638.anInt7982 != Static33.anInt739) {
					Static116.aBoolean155 = true;
				}
				Static33.anInt739 = Static638.anInt7982;
			} else {
				Static192.aClass95_4.ya();
				local319 = Static519.anInt8614;
				if (Static382.aClass160_1 == null) {
					Static192.aClass95_4.GA(local319);
				} else {
					Static382.aClass160_1.method3443(Static192.aClass95_4, Static222.anInt3623 << 3, Static440.anInt7072, local319, local113, local111, local119, Static338.anInt5355, local115);
				}
			}
			Static48.method803();
			Static185.aClass177_4.method7881(Static250.anInt4000, Static220.anInt3605, Static644.anInt10376, -Static440.anInt7072 & 0x3FFF, -Static338.anInt5355 & 0x3FFF, -Static161.anInt2901 & 0x3FFF);
			Static192.aClass95_4.method6941(Static185.aClass177_4);
			Static192.aClass95_4.DA(local113 / 2 + local111, local119 - -(local115 / 2), Static92.anInt1709 << 1, Static92.anInt1709 << 1);
			Static51.method832(Static92.anInt1709 << 1, Static92.anInt1709 << 1, local111 + local113 / 2, local119 + local115 / 2);
			Static215.method2966(-Static440.anInt7072 & 0x3FFF, Static250.anInt4000, -Static161.anInt2901 & 0x3FFF, Static220.anInt3605, -Static338.anInt5355 & 0x3FFF, Static644.anInt10376);
			@Pc(570) byte local570 = Static234.aClass2_Sub5_48.aClass6_Sub18_2.method5409() == 2 ? (byte) Static482.anInt7692 : 1;
			if (Static319.aBoolean356) {
				Static586.method8001(-Static338.anInt5355 & 0x3FFF, -Static440.anInt7072 & 0x3FFF, -Static161.anInt2901 & 0x3FFF);
				Static115.method1714(local570, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9, Static220.anInt3605, Static638.anInt7982, Static236.anIntArray267, Static250.anInt4000, Static410.anIntArray471, Static148.aByteArrayArrayArray4, Static100.anIntArray132, Static234.aClass2_Sub5_48.aClass6_Sub16_1.method4321() == 0, Static560.anIntArray627, Static644.anInt10376, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9, Static262.anInt5597, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 + 1, Static179.anIntArray228);
			} else {
				Static362.method4887(Static262.anInt5597, Static250.anInt4000, Static220.anInt3605, Static644.anInt10376, Static148.aByteArrayArrayArray4, Static410.anIntArray471, Static100.anIntArray132, Static179.anIntArray228, Static236.anIntArray267, Static560.anIntArray627, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 + 1, local570, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9, Static234.aClass2_Sub5_48.aClass6_Sub16_1.method4321() == 0, Static449.aBoolean538 ? Static638.anInt7982 : -1, 0, false);
			}
			Static48.method803();
			if (Static324.anInt5145 == 10) {
				Static532.method7362(local113, local111, local115, local119);
				Static204.method2870(local111, local119, local113, local115);
				Static460.method6253(local111, local119, local115, local113);
				Static353.method4722(local113, local119, local115, local111);
			}
			Static100.method1531();
			Static338.anInt5355 = local276;
			Static250.anInt4000 = local127;
			Static220.anInt3605 = local164;
			Static644.anInt10376 = local272;
			Static440.anInt7072 = local274;
			if (Static49.aBoolean648 && Static301.aClass104_3.method2237() == 0) {
				Static49.aBoolean648 = false;
			}
			if (Static49.aBoolean648) {
				Static192.aClass95_4.method6936(local115, local113, local111, -16777216, local119);
				Static445.method6068(Static389.aClass256_13, Static434.aClass271_12.method5972(Static483.anInt7694), Static505.aClass62_21, false, Static192.aClass95_4);
			}
			Static296.method4089(false);
		} else {
			Static192.aClass95_4.method6936(arg2, arg0, arg1, -16777216, arg3);
		}
	}
}
