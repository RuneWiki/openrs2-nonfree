import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_1 = new Class326(0, 3, Static53.aClass42_8);

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_2 = new Class326(1, 3, Static53.aClass42_8);

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_3 = new Class326(2, 4, Static53.aClass42_4);

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_4 = new Class326(3, 1, Static53.aClass42_8);

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_5 = new Class326(4, 2, Static53.aClass42_8);

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_6 = new Class326(5, 3, Static53.aClass42_8);

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Lclient!uba;")
	public static final Class326 aClass326_7 = new Class326(6, 4, Static53.aClass42_8);

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
	public static final int anInt9361 = Static244.method3930(16);

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "Lclient!jk;")
	private static final Class173 aClass173_114 = new Class173(81, 7);

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "[S")
	public static short[] aShortArray128 = new short[256];

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_59 = new Class244();

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "[I")
	public static final int[] anIntArray503 = new int[5];

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)Lclient!uba;")
	public static Class326 method7618(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass326_1;
		} else if (arg0 == 1) {
			return aClass326_2;
		} else if (arg0 == 2) {
			return aClass326_3;
		} else if (arg0 == 3) {
			return aClass326_4;
		} else if (arg0 == 4) {
			return aClass326_5;
		} else if (arg0 == 5) {
			return aClass326_6;
		} else if (arg0 == 6) {
			return aClass326_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	public static void method7620() {
		if (Static564.anInt9904 < 0) {
			return;
		}
		@Pc(11) long local11 = Static574.method8210();
		Static564.anInt9904 = (int) ((long) Static564.anInt9904 + Static383.aLong189 - local11);
		if (Static564.anInt9904 <= 0) {
			Static565.aFloat227 = Static441.aClass112_8.aFloat114;
			Static242.anInt4382 = Static441.aClass112_8.anInt3251;
			Static170.aFloat122 = Static441.aClass112_8.aFloat111;
			Static73.aFloat36 = Static441.aClass112_8.aFloat112;
			Static143.aFloat108 = Static441.aClass112_8.aFloat113;
			Static195.aFloat127 = Static441.aClass112_8.aFloat116;
			Static231.aClass36_4 = Static441.aClass112_8.aClass36_3;
			Static128.aFloat107 = Static441.aClass112_8.aFloat115;
			Static226.anInt4164 = Static441.aClass112_8.anInt3247;
			Static453.anInt8519 = Static441.aClass112_8.anInt3244;
			Static564.anInt9904 = -1;
		} else {
			@Pc(65) int local65 = (Static564.anInt9904 << 8) / Static20.anInt301;
			@Pc(70) int local70 = 255 - local65;
			@Pc(75) float local75 = (float) local65 / 255.0F;
			@Pc(79) float local79 = 1.0F - local75;
			Static226.anInt4164 = (local65 * (Static161.anInt566 & 0xFF00FF) + local70 * (Static441.aClass112_8.anInt3247 & 0xFF00FF) & 0xFF00FF00) + ((Static161.anInt566 & 0xFF00) * local65 + ((Static441.aClass112_8.anInt3247 & 0xFF00) * local70) & 0xFF0000) >>> 8;
			Static128.aFloat107 = Static331.aFloat194 + (Static441.aClass112_8.aFloat115 - Static331.aFloat194) * local79;
			Static143.aFloat108 = Static148.aFloat229 + (Static441.aClass112_8.aFloat113 - Static148.aFloat229) * local79;
			Static453.anInt8519 = Static441.aClass112_8.anInt3244 * local70 + local65 * Static307.anInt6165 >> 8;
			Static195.aFloat127 = Static123.aFloat105 + local79 * (Static441.aClass112_8.aFloat116 - Static123.aFloat105);
			Static565.aFloat227 = (Static441.aClass112_8.aFloat114 - Static188.aFloat125) * local79 + Static188.aFloat125;
			Static242.anInt4382 = (local70 * (Static441.aClass112_8.anInt3251 & 0xFF00FF) + local65 * (Static506.anInt3161 & 0xFF00FF) & 0xFF00FF00) + (local70 * (Static441.aClass112_8.anInt3251 & 0xFF00) + local65 * (Static506.anInt3161 & 0xFF00) & 0xFF0000) >>> 8;
			Static170.aFloat122 = local79 * (Static441.aClass112_8.aFloat111 - Static347.aFloat195) + Static347.aFloat195;
			Static73.aFloat36 = (Static441.aClass112_8.aFloat112 - Static290.aFloat186) * local79 + Static290.aFloat186;
			if (Static441.aClass112_8.aClass36_3 != Static204.aClass36_8) {
				Static231.aClass36_4 = Static458.aClass44_13.method5005(Static204.aClass36_8, Static441.aClass112_8.aClass36_3, local79, Static231.aClass36_4);
			}
		}
		Static383.aLong189 = local11;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	public static void method7621() {
		if (Static454.anInt8310 > 1) {
			Static284.anInt5784 = Static436.anInt8161;
			Static454.anInt8310--;
		}
		if (Static152.aBoolean276) {
			Static152.aBoolean276 = false;
			Static501.method5640();
			return;
		}
		if (!Static49.aBoolean36) {
			Static10.method173();
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static95.method2110(); local32++) {
		}
		if (Static203.anInt3855 != 10) {
			return;
		}
		@Pc(58) Class4_Sub14 local58;
		@Pc(67) int local67;
		while (Static158.method2934()) {
			local58 = Static196.method3380(Static17.aClass159_1, Static402.aClass173_96);
			local58.aClass4_Sub11_Sub1_3.method4957(0);
			local67 = local58.aClass4_Sub11_Sub1_3.anInt5831;
			Static374.method5999(local58.aClass4_Sub11_Sub1_3);
			local58.aClass4_Sub11_Sub1_3.method4941(local58.aClass4_Sub11_Sub1_3.anInt5831 - local67);
			Static353.method5712(local58);
		}
		if (Static484.aClass4_Sub42_2 == null) {
			if (Static574.method8210() >= Static406.aLong201) {
				Static484.aClass4_Sub42_2 = Static282.aClass317_2.method7507(Static60.aClass342_1.aString96);
			}
		} else if (Static484.aClass4_Sub42_2.anInt8816 != -1) {
			local58 = Static196.method3380(Static17.aClass159_1, Static441.aClass173_83);
			local58.aClass4_Sub11_Sub1_3.method4937(Static484.aClass4_Sub42_2.anInt8816);
			Static353.method5712(local58);
			Static484.aClass4_Sub42_2 = null;
			Static406.aLong201 = Static574.method8210() + 30000L;
		}
		@Pc(143) Class4_Sub15 local143 = (Class4_Sub15) Static222.aClass244_35.method5963();
		@Pc(160) int local160;
		@Pc(183) int local183;
		@Pc(200) int local200;
		@Pc(252) int local252;
		@Pc(259) int local259;
		@Pc(270) int local270;
		@Pc(158) Class4_Sub14 local158;
		if (local143 != null || Static574.method8210() - 2000L > Static300.aLong149) {
			local158 = null;
			local160 = 0;
			for (@Pc(165) Class4_Sub15 local165 = (Class4_Sub15) Static316.aClass244_50.method5963(); local165 != null && (local158 == null || local158.aClass4_Sub11_Sub1_3.anInt5831 - local160 < 240); local165 = (Class4_Sub15) Static316.aClass244_50.method5965()) {
				local165.method8379();
				local183 = local165.method3498();
				if (local183 < -1) {
					local183 = -1;
				} else if (local183 > 65534) {
					local183 = 65534;
				}
				local200 = local165.method3495();
				if (local200 < -1) {
					local200 = -1;
				} else if (local200 > 65534) {
					local200 = 65534;
				}
				if (Static267.anInt5133 != local200 || Static32.anInt495 != local183) {
					if (local158 == null) {
						local158 = Static196.method3380(Static17.aClass159_1, Static102.aClass173_89);
						local158.aClass4_Sub11_Sub1_3.method4957(0);
						local160 = local158.aClass4_Sub11_Sub1_3.anInt5831;
					}
					local252 = local200 - Static267.anInt5133;
					Static267.anInt5133 = local200;
					local259 = local183 - Static32.anInt495;
					Static32.anInt495 = local183;
					local270 = (int) ((local165.method3493() - Static300.aLong149) / 20L);
					if (local270 < 8 && local252 >= -32 && local252 <= 31 && local259 >= -32 && local259 <= 31) {
						local252 += 32;
						local259 += 32;
						local158.aClass4_Sub11_Sub1_3.method4937((local270 << 12) + ((local252 << 6) + local259));
					} else if (local270 < 32 && local252 >= -128 && local252 <= 127 && local259 >= -128 && local259 <= 127) {
						local158.aClass4_Sub11_Sub1_3.method4957(local270 + 128);
						local259 += 128;
						local252 += 128;
						local158.aClass4_Sub11_Sub1_3.method4937(local259 + (local252 << 8));
					} else if (local270 < 32) {
						local158.aClass4_Sub11_Sub1_3.method4957(local270 + 192);
						if (local200 == 1 || local183 == -1) {
							local158.aClass4_Sub11_Sub1_3.method4909(Integer.MIN_VALUE);
						} else {
							local158.aClass4_Sub11_Sub1_3.method4909(local183 << 16 | local200);
						}
					} else {
						local158.aClass4_Sub11_Sub1_3.method4937(local270 + 57344);
						if (local200 == 1 || local183 == -1) {
							local158.aClass4_Sub11_Sub1_3.method4909(Integer.MIN_VALUE);
						} else {
							local158.aClass4_Sub11_Sub1_3.method4909(local183 << 16 | local200);
						}
					}
					Static300.aLong149 = local165.method3493();
				}
			}
			if (local158 != null) {
				local158.aClass4_Sub11_Sub1_3.method4941(local158.aClass4_Sub11_Sub1_3.anInt5831 - local160);
				Static353.method5712(local158);
			}
		}
		@Pc(473) int local473;
		if (local143 != null) {
			@Pc(459) long local459 = (local143.method3493() - Static256.aLong136) / 50L;
			Static256.aLong136 = local143.method3493();
			if (local459 > 32767L) {
				local459 = 32767L;
			}
			local473 = local143.method3498();
			if (local473 < 0) {
				local473 = 0;
			} else if (local473 > 65535) {
				local473 = 65535;
			}
			local183 = local143.method3495();
			if (local183 < 0) {
				local183 = 0;
			} else if (local183 > 65535) {
				local183 = 65535;
			}
			@Pc(507) byte local507 = 0;
			if (local143.method3496() == 2) {
				local507 = 1;
			}
			local252 = (int) local459;
			@Pc(528) Class4_Sub14 local528 = Static196.method3380(Static17.aClass159_1, Static349.aClass173_93);
			local528.aClass4_Sub11_Sub1_3.method4932(local507 << 15 | local252);
			local528.aClass4_Sub11_Sub1_3.method4943(local473 << 16 | local183);
			Static353.method5712(local528);
		}
		if (Static566.anInt9917 > 0) {
			local158 = Static196.method3380(Static17.aClass159_1, Static279.aClass173_81);
			local158.aClass4_Sub11_Sub1_3.method4957(Static566.anInt9917 * 3);
			for (local160 = 0; local160 < Static566.anInt9917; local160++) {
				@Pc(582) Interface2 local582 = Static7.anInterface2Array1[local160];
				@Pc(591) long local591 = (local582.method5850() - Static397.aLong196) / 50L;
				if (local591 > 65535L) {
					local591 = 65535L;
				}
				Static397.aLong196 = local582.method5850();
				local158.aClass4_Sub11_Sub1_3.method4957(local582.method5852());
				local158.aClass4_Sub11_Sub1_3.method4937((int) local591);
			}
			Static353.method5712(local158);
		}
		if (Static438.anInt8197 > 0) {
			Static438.anInt8197--;
		}
		if (Static65.aBoolean51 && Static438.anInt8197 <= 0) {
			Static65.aBoolean51 = false;
			Static438.anInt8197 = 20;
			local158 = Static196.method3380(Static17.aClass159_1, Static138.aClass173_43);
			local158.aClass4_Sub11_Sub1_3.method4902((int) Static213.aFloat141 >> 3);
			local158.aClass4_Sub11_Sub1_3.method4902((int) Static201.aFloat128 >> 3);
			Static353.method5712(local158);
		}
		if (Static450.aBoolean600 != Static408.aBoolean535) {
			Static408.aBoolean535 = Static450.aBoolean600;
			local158 = Static196.method3380(Static17.aClass159_1, Static5.aClass173_2);
			local158.aClass4_Sub11_Sub1_3.method4957(Static450.aBoolean600 ? 1 : 0);
			Static353.method5712(local158);
		}
		if (!Static265.aBoolean367) {
			local158 = Static196.method3380(Static17.aClass159_1, Static38.aClass173_8);
			local158.aClass4_Sub11_Sub1_3.method4957(0);
			local160 = local158.aClass4_Sub11_Sub1_3.anInt5831;
			@Pc(725) Class4_Sub11 local725 = new Class4_Sub11(Static72.method6568());
			Static214.aClass4_Sub19_Sub1_1.method2776(local725);
			local158.aClass4_Sub11_Sub1_3.method4929(local725.aByteArray68, local725.anInt5831);
			local158.aClass4_Sub11_Sub1_3.method4941(local158.aClass4_Sub11_Sub1_3.anInt5831 - local160);
			Static353.method5712(local158);
			Static265.aBoolean367 = true;
		}
		if (Static60.aClass53ArrayArrayArray1 != null) {
			if (Static166.anInt3419 == 2) {
				Static276.method4773();
			} else if (Static166.anInt3419 == 3) {
				Static548.method7957();
			}
		}
		if (Static191.aBoolean294) {
			Static191.aBoolean294 = false;
		} else {
			Static429.aFloat208 /= 2.0F;
		}
		if (Static534.aBoolean671) {
			Static534.aBoolean671 = false;
		} else {
			Static436.aFloat210 /= 2.0F;
		}
		Static439.method6805();
		if (Static203.anInt3855 != 10) {
			return;
		}
		Static239.method7074();
		Static478.method7169();
		Static577.method8234();
		Static395.anInt7584++;
		if (Static395.anInt7584 > 750) {
			Static501.method5640();
			return;
		}
		Static55.method6494();
		Static344.method5587();
		Static343.method5576();
		for (local67 = Static45.aClass148_1.method3452(true); local67 != -1; local67 = Static45.aClass148_1.method3452(false)) {
			Static351.method7424(local67);
			Static246.anIntArray228[Static532.anInt9484++ & 0x1F] = local67;
		}
		@Pc(922) Class225 local922;
		for (@Pc(852) Class4_Sub5_Sub16 local852 = Static50.method666(); local852 != null; local852 = Static50.method666()) {
			local473 = local852.method7132();
			local183 = local852.method7135();
			if (local473 == 1) {
				Static419.anIntArray414[local183] = local852.anInt8736;
				Static478.aBoolean619 |= Static225.aBooleanArray11[local183];
				Static58.anIntArray36[Static328.anInt6327++ & 0x1F] = local183;
			} else if (local473 == 2) {
				Static53.aStringArray10[local183] = local852.aString84;
				Static469.anIntArray475[Static11.anInt218++ & 0x1F] = local183;
			} else if (local473 == 3) {
				local922 = Static490.method7272(local183);
				if (!local852.aString84.equals(local922.aString67)) {
					local922.aString67 = local852.aString84;
					Static92.method2100(local922);
				}
			} else if (local473 == 4) {
				local922 = Static490.method7272(local183);
				local252 = local852.anInt8736;
				local259 = local852.anInt8738;
				local270 = local852.anInt8739;
				if (local922.anInt6538 != local252 || local922.anInt6488 != local259 || local270 != local922.anInt6544) {
					local922.anInt6544 = local270;
					local922.anInt6488 = local259;
					local922.anInt6538 = local252;
					Static92.method2100(local922);
				}
			} else if (local473 == 5) {
				local922 = Static490.method7272(local183);
				if (local852.anInt8736 != local922.anInt6510 || local852.anInt8736 == -1) {
					local922.anInt6510 = local852.anInt8736;
					local922.anInt6530 = 1;
					local922.anInt6512 = 0;
					local922.anInt6541 = 0;
					@Pc(1383) Class365 local1383 = local922.anInt6510 == -1 ? null : Static61.aClass48_1.method1016(local922.anInt6510);
					if (local1383 != null) {
						Static594.method8374(local922.anInt6541, local1383);
					}
					Static92.method2100(local922);
				}
			} else if (local473 == 6) {
				local200 = local852.anInt8736;
				local252 = local200 >> 10 & 0x1F;
				local259 = local200 >> 5 & 0x1F;
				local270 = local200 & 0x1F;
				@Pc(1006) int local1006 = (local259 << 11) + (local252 << 19) + (local270 << 3);
				@Pc(1010) Class225 local1010 = Static490.method7272(local183);
				if (local1010.anInt6560 != local1006) {
					local1010.anInt6560 = local1006;
					Static92.method2100(local1010);
				}
			} else if (local473 == 7) {
				local922 = Static490.method7272(local183);
				@Pc(1037) boolean local1037 = local852.anInt8736 == 1;
				if (local922.aBoolean484 != local1037) {
					local922.aBoolean484 = local1037;
					Static92.method2100(local922);
				}
			} else if (local473 == 8) {
				local922 = Static490.method7272(local183);
				if (local922.anInt6525 != local852.anInt8736 || local852.anInt8738 != local922.anInt6548 || local922.anInt6543 != local852.anInt8739) {
					local922.anInt6543 = local852.anInt8739;
					local922.anInt6548 = local852.anInt8738;
					local922.anInt6525 = local852.anInt8736;
					if (local922.anInt6527 != -1) {
						if (local922.anInt6519 > 0) {
							local922.anInt6543 = local922.anInt6543 * 32 / local922.anInt6519;
						} else if (local922.anInt6503 > 0) {
							local922.anInt6543 = local922.anInt6543 * 32 / local922.anInt6503;
						}
					}
					Static92.method2100(local922);
				}
			} else if (local473 == 9) {
				local922 = Static490.method7272(local183);
				if (local922.anInt6527 != local852.anInt8736 || local852.anInt8738 != local922.anInt6500) {
					local922.anInt6500 = local852.anInt8738;
					local922.anInt6527 = local852.anInt8736;
					Static92.method2100(local922);
				}
			} else if (local473 == 10) {
				local922 = Static490.method7272(local183);
				if (local922.anInt6509 != local852.anInt8736 || local922.anInt6518 != local852.anInt8738 || local922.anInt6561 != local852.anInt8739) {
					local922.anInt6561 = local852.anInt8739;
					local922.anInt6509 = local852.anInt8736;
					local922.anInt6518 = local852.anInt8738;
					Static92.method2100(local922);
				}
			} else if (local473 == 11) {
				local922 = Static490.method7272(local183);
				local922.anInt6552 = local922.anInt6540 = local852.anInt8736;
				local922.aByte68 = 0;
				local922.anInt6494 = local922.anInt6528 = local852.anInt8738;
				local922.aByte69 = 0;
				Static92.method2100(local922);
			} else if (local473 == 12) {
				local922 = Static490.method7272(local183);
				local252 = local852.anInt8736;
				if (local922 != null && local922.anInt6508 == 0) {
					if (local922.anInt6489 - local922.anInt6521 < local252) {
						local252 = local922.anInt6489 - local922.anInt6521;
					}
					if (local252 < 0) {
						local252 = 0;
					}
					if (local922.anInt6563 != local252) {
						local922.anInt6563 = local252;
						Static92.method2100(local922);
					}
				}
			} else if (local473 == 14) {
				local922 = Static490.method7272(local183);
				local922.anInt6520 = local852.anInt8736;
			} else if (local473 == 15) {
				Static8.anInt182 = local852.anInt8738;
				Static582.anInt10107 = local852.anInt8736;
				Static569.aBoolean704 = true;
			} else if (local473 == 16) {
				local922 = Static490.method7272(local183);
				local922.anInt6492 = local852.anInt8736;
			}
		}
		if (Static568.anInt9975 != 0) {
			Static225.anInt4138 += 20;
			if (Static225.anInt4138 >= 400) {
				Static568.anInt9975 = 0;
			}
		}
		Static356.anInt6930++;
		if (Static238.aClass225_19 != null) {
			Static208.anInt3874++;
			if (Static208.anInt3874 >= 15) {
				Static92.method2100(Static238.aClass225_19);
				Static238.aClass225_19 = null;
			}
		}
		Static529.aClass225_48 = null;
		Static487.aBoolean624 = false;
		Static136.aClass225_14 = null;
		Static320.aBoolean455 = false;
		Static272.method4722(null, -1, -1);
		Static182.method3246(null, -1, -1);
		if (!Static418.aBoolean541) {
			Static180.anInt3622 = -1;
		}
		Static444.method6845();
		Static436.anInt8161++;
		if (Static145.aBoolean271) {
			@Pc(1489) Class4_Sub14 local1489 = Static196.method3380(Static17.aClass159_1, Static421.aClass173_102);
			local1489.aClass4_Sub11_Sub1_3.method4896(Static215.anInt4009 << 28 | Static215.anInt4006 << 14 | Static111.anInt2629);
			Static353.method5712(local1489);
			Static145.aBoolean271 = false;
		}
		while (true) {
			@Pc(1512) Class4_Sub25 local1512;
			@Pc(1517) Class225 local1517;
			do {
				local1512 = (Class4_Sub25) Static61.aClass244_6.method5968();
				if (local1512 == null) {
					while (true) {
						do {
							local1512 = (Class4_Sub25) Static60.aClass244_5.method5968();
							if (local1512 == null) {
								while (true) {
									do {
										local1512 = (Class4_Sub25) aClass244_59.method5968();
										if (local1512 == null) {
											if (Static136.aClass225_14 == null) {
												Static116.anInt2677 = 0;
											}
											if (Static317.aClass225_54 != null) {
												Static458.method6988();
											}
											if (Static204.anInt8827 > 0 && Static584.aClass154_1.method3569(82) && Static584.aClass154_1.method3569(81) && Static581.anInt10088 != 0) {
												local473 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 - Static581.anInt10088;
												if (local473 < 0) {
													local473 = 0;
												} else if (local473 > 3) {
													local473 = 3;
												}
												Static326.method5358(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0] + Static254.anInt4667, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] + Static552.anInt9805, local473);
											}
											Static552.method8003();
											for (local473 = 0; local473 < 5; local473++) {
												@Pc(1718) int local1718 = anIntArray503[local473]++;
											}
											if (Static478.aBoolean619 && Static574.method8210() - 60000L > Static543.aLong252) {
												Static355.method5748();
											}
											for (@Pc(1745) Class1_Sub1_Sub2 local1745 = (Class1_Sub1_Sub2) Static543.aClass136_8.method3288(); local1745 != null; local1745 = (Class1_Sub1_Sub2) Static543.aClass136_8.method3286()) {
												if (Static574.method8210() / 1000L - 5L > (long) local1745.anInt6758) {
													if (local1745.aShort79 > 0) {
														Static574.method8209("", local1745.aString70 + Static590.aClass364_23.method8334(Static154.anInt3181), "", "", 5, 0);
													}
													if (local1745.aShort79 == 0) {
														Static574.method8209("", local1745.aString70 + Static590.aClass364_24.method8334(Static154.anInt3181), "", "", 5, 0);
													}
													local1745.method8252();
												}
											}
											Static192.anInt3751++;
											if (Static192.anInt3751 > 500) {
												Static192.anInt3751 = 0;
												local200 = (int) (Math.random() * 8.0D);
												if ((local200 & 0x1) == 1) {
													Static424.anInt7961 += Static375.anInt7257;
												}
												if ((local200 & 0x2) == 2) {
													Static288.anInt10006 += Static563.anInt9902;
												}
												if ((local200 & 0x4) == 4) {
													Static321.anInt6261 += Static27.anInt406;
												}
											}
											if (Static424.anInt7961 < -50) {
												Static375.anInt7257 = 2;
											}
											if (Static424.anInt7961 > 50) {
												Static375.anInt7257 = -2;
											}
											if (Static288.anInt10006 < -55) {
												Static563.anInt9902 = 2;
											}
											if (Static321.anInt6261 < -40) {
												Static27.anInt406 = 1;
											}
											if (Static288.anInt10006 > 55) {
												Static563.anInt9902 = -2;
											}
											if (Static321.anInt6261 > 40) {
												Static27.anInt406 = -1;
											}
											Static421.anInt7923++;
											if (Static421.anInt7923 > 500) {
												Static421.anInt7923 = 0;
												local200 = (int) (Math.random() * 8.0D);
												if ((local200 & 0x2) == 2) {
													Static595.anInt10298 += Static594.anInt10259;
												}
												if ((local200 & 0x1) == 1) {
													Static368.anInt7167 += Static563.anInt9901;
												}
											}
											if (Static368.anInt7167 < -60) {
												Static563.anInt9901 = 2;
											}
											if (Static595.anInt10298 < -20) {
												Static594.anInt10259 = 1;
											}
											if (Static368.anInt7167 > 60) {
												Static563.anInt9901 = -2;
											}
											Static12.anInt226++;
											if (Static595.anInt10298 > 10) {
												Static594.anInt10259 = -1;
											}
											if (Static12.anInt226 > 50) {
												@Pc(1987) Class4_Sub14 local1987 = Static196.method3380(Static17.aClass159_1, Static122.aClass173_40);
												Static353.method5712(local1987);
											}
											if (Static79.aBoolean83) {
												Static379.method6042();
												Static79.aBoolean83 = false;
											}
											try {
												Static367.method5899();
												return;
											} catch (@Pc(2002) IOException local2002) {
												Static501.method5640();
												return;
											}
										}
										local1517 = local1512.aClass225_21;
										if (local1517.anInt6565 < 0) {
											break;
										}
										local922 = Static490.method7272(local1517.anInt6559);
									} while (local922 == null || local922.aClass225Array1 == null || local1517.anInt6565 >= local922.aClass225Array1.length || local1517 != local922.aClass225Array1[local1517.anInt6565]);
									Static388.method6121(local1512);
								}
							}
							local1517 = local1512.aClass225_21;
							if (local1517.anInt6565 < 0) {
								break;
							}
							local922 = Static490.method7272(local1517.anInt6559);
						} while (local922 == null || local922.aClass225Array1 == null || local1517.anInt6565 >= local922.aClass225Array1.length || local922.aClass225Array1[local1517.anInt6565] != local1517);
						Static388.method6121(local1512);
					}
				}
				local1517 = local1512.aClass225_21;
				if (local1517.anInt6565 < 0) {
					break;
				}
				local922 = Static490.method7272(local1517.anInt6559);
			} while (local922 == null || local922.aClass225Array1 == null || local1517.anInt6565 >= local922.aClass225Array1.length || local922.aClass225Array1[local1517.anInt6565] != local1517);
			Static388.method6121(local1512);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI)V")
	public static void method7622(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub5_Sub16 local13 = Static219.method3587(arg0, 16);
		local13.method7134();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILclient!rm;I)V")
	public static void method7623(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub39 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || Static40.aClass244_4.aClass4_185 == arg1) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt8542;
		@Pc(18) int local18 = arg1.anInt8543;
		@Pc(21) int local21 = arg1.anInt8541;
		@Pc(25) int local25 = (int) arg1.aLong219;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg1.aLong219;
		@Pc(46) Class225 local46;
		if (local21 == 19) {
			local46 = Static24.method318(local18, local15);
			if (local46 != null) {
				Static419.method6558();
				@Pc(53) Class4_Sub2 local53 = Static69.method1180(local46);
				Static572.method8105(local53.method131(), local46, local53.anInt151);
				Static152.aString28 = Static327.method5372(local46);
				if (Static152.aString28 == null) {
					Static152.aString28 = "Null";
				}
				Static551.aString95 = local46.aString65 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 59 || local21 == 1007) {
			Static34.method453(local15, local25, arg1.aString80, local18);
		}
		@Pc(117) Class4_Sub14 local117;
		if (local21 == 6) {
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static253.aClass173_76);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4902(Static552.anInt9805 + local15);
			local117.aClass4_Sub11_Sub1_3.method4932(local25);
			local117.aClass4_Sub11_Sub1_3.method4898(local18 + Static254.anInt4667);
			Static353.method5712(local117);
			Static44.method529(local18, local15);
		}
		if (local21 == 5) {
			Static225.anInt4138 = 0;
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			Static568.anInt9975 = 2;
			local117 = Static196.method3380(Static17.aClass159_1, aClass173_114);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4902((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local117.aClass4_Sub11_Sub1_3.method4898(Static254.anInt4667 + local18);
			local117.aClass4_Sub11_Sub1_3.method4902(Static552.anInt9805 + local15);
			Static353.method5712(local117);
			Static442.method6823(local34, local15, local18);
		}
		@Pc(254) Class1_Sub4_Sub2_Sub1_Sub1 local254;
		@Pc(265) Class4_Sub14 local265;
		@Pc(243) Class4_Sub4 local243;
		if (local21 == 48) {
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				Static152.anInt3145 = arg0;
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static568.anInt9975 = 2;
				local265 = Static196.method3380(Static17.aClass159_1, Static57.aClass173_20);
				local265.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local265.aClass4_Sub11_Sub1_3.method4932(local25);
				Static353.method5712(local265);
				Static398.method6283(0, local254.anIntArray463[0], 0, -2, true, local254.method6925(), local254.anIntArray462[0], local254.method6925());
			}
		}
		if (local21 == 17) {
			if (Static204.anInt8827 > 0 && Static584.aClass154_1.method3569(82) && Static584.aClass154_1.method3569(81)) {
				Static326.method5358(local18 + Static254.anInt4667, Static552.anInt9805 + local15, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126);
			} else {
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				Static152.anInt3145 = arg0;
				Static568.anInt9975 = 1;
				local117 = Static196.method3380(Static17.aClass159_1, Static141.aClass173_44);
				local117.aClass4_Sub11_Sub1_3.method4898(Static254.anInt4667 + local18);
				local117.aClass4_Sub11_Sub1_3.method4937(Static552.anInt9805 + local15);
				Static353.method5712(local117);
			}
		}
		if (local21 == 1002 || local21 == 1008 || local21 == 1012 || local21 == 1010 || local21 == 1004) {
			Static207.method3458(local15, local25, local21);
		}
		@Pc(410) Class1_Sub4_Sub2_Sub1_Sub2 local410;
		@Pc(429) Class4_Sub14 local429;
		if (local21 == 15) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				Static568.anInt9975 = 2;
				Static152.anInt3145 = arg0;
				local429 = Static196.method3380(Static17.aClass159_1, Static23.aClass173_54);
				local429.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4932(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 20) {
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static23.anInt3730 = arg2;
				Static152.anInt3145 = arg0;
				Static225.anInt4138 = 0;
				Static568.anInt9975 = 2;
				local265 = Static196.method3380(Static17.aClass159_1, Static82.aClass173_24);
				local265.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local265.aClass4_Sub11_Sub1_3.method4902(Static592.anInt10215);
				local265.aClass4_Sub11_Sub1_3.method4915(Static7.anInt173);
				local265.aClass4_Sub11_Sub1_3.method4932(Static317.anInt10281);
				local265.aClass4_Sub11_Sub1_3.method4902(local25);
				Static353.method5712(local265);
				Static398.method6283(0, local254.anIntArray463[0], 0, -2, true, local254.method6925(), local254.anIntArray462[0], local254.method6925());
			}
		}
		if (local21 == 9) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static225.anInt4138 = 0;
				Static152.anInt3145 = arg0;
				Static23.anInt3730 = arg2;
				Static568.anInt9975 = 2;
				local429 = Static196.method3380(Static17.aClass159_1, Static137.aClass173_42);
				local429.aClass4_Sub11_Sub1_3.method4937(local25);
				local429.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 25) {
			Static152.anInt3145 = arg0;
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			Static23.anInt3730 = arg2;
			local117 = Static196.method3380(Static17.aClass159_1, Static212.aClass173_66);
			local117.aClass4_Sub11_Sub1_3.method4898(Static254.anInt4667 + local18);
			local117.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4932(Static552.anInt9805 + local15);
			local117.aClass4_Sub11_Sub1_3.method4932(local25);
			Static353.method5712(local117);
			Static44.method529(local18, local15);
		}
		if (local21 == 57) {
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			Static225.anInt4138 = 0;
			Static568.anInt9975 = 1;
			local117 = Static196.method3380(Static17.aClass159_1, Static224.aClass173_70);
			local117.aClass4_Sub11_Sub1_3.method4932(local18 + Static254.anInt4667);
			local117.aClass4_Sub11_Sub1_3.method4898(local15 + Static552.anInt9805);
			local117.aClass4_Sub11_Sub1_3.method4902(Static592.anInt10215);
			local117.aClass4_Sub11_Sub1_3.method4943(Static7.anInt173);
			local117.aClass4_Sub11_Sub1_3.method4898(Static317.anInt10281);
			Static353.method5712(local117);
			Static398.method6283(0, local15, 0, -4, true, 1, local18, 1);
		}
		if (local21 == 3) {
			local46 = Static24.method318(local18, local15);
			if (local46 != null) {
				Static555.method8027(local46);
			}
		}
		if (local21 == 16) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static152.anInt3145 = arg0;
				Static568.anInt9975 = 2;
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				local429 = Static196.method3380(Static17.aClass159_1, Static381.aClass173_98);
				local429.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4932(local25);
				local429.aClass4_Sub11_Sub1_3.method4902(Static592.anInt10215);
				local429.aClass4_Sub11_Sub1_3.method4932(Static317.anInt10281);
				local429.aClass4_Sub11_Sub1_3.method4909(Static7.anInt173);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 51) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static568.anInt9975 = 2;
				Static23.anInt3730 = arg2;
				Static225.anInt4138 = 0;
				Static152.anInt3145 = arg0;
				local429 = Static196.method3380(Static17.aClass159_1, Static43.aClass173_12);
				local429.aClass4_Sub11_Sub1_3.method4913(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4902(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 21) {
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				Static152.anInt3145 = arg0;
				Static568.anInt9975 = 2;
				local265 = Static196.method3380(Static17.aClass159_1, Static145.aClass173_45);
				local265.aClass4_Sub11_Sub1_3.method4898(local25);
				local265.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
				Static353.method5712(local265);
				Static398.method6283(0, local254.anIntArray463[0], 0, -2, true, local254.method6925(), local254.anIntArray462[0], local254.method6925());
			}
		}
		if (local21 == 49) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static225.anInt4138 = 0;
				Static568.anInt9975 = 2;
				Static23.anInt3730 = arg2;
				Static152.anInt3145 = arg0;
				local429 = Static196.method3380(Static17.aClass159_1, Static453.aClass173_104);
				local429.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4937(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 4) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static23.anInt3730 = arg2;
				Static225.anInt4138 = 0;
				Static568.anInt9975 = 2;
				Static152.anInt3145 = arg0;
				local429 = Static196.method3380(Static17.aClass159_1, Static270.aClass173_80);
				local429.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4902(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 23) {
			Static23.anInt3730 = arg2;
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static578.aClass173_119);
			local117.aClass4_Sub11_Sub1_3.method4937(local25);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4902(Static552.anInt9805 + local15);
			local117.aClass4_Sub11_Sub1_3.method4898(Static254.anInt4667 + local18);
			Static353.method5712(local117);
			Static44.method529(local18, local15);
		}
		if (local21 == 46) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static152.anInt3145 = arg0;
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				Static568.anInt9975 = 2;
				local429 = Static196.method3380(Static17.aClass159_1, Static461.aClass173_106);
				local429.aClass4_Sub11_Sub1_3.method4913(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4902(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 30) {
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				Static225.anInt4138 = 0;
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static568.anInt9975 = 2;
				Static152.anInt3145 = arg0;
				Static23.anInt3730 = arg2;
				local265 = Static196.method3380(Static17.aClass159_1, Static111.aClass173_36);
				local265.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local265.aClass4_Sub11_Sub1_3.method4902(local25);
				Static353.method5712(local265);
				Static398.method6283(0, local254.anIntArray463[0], 0, -2, true, local254.method6925(), local254.anIntArray462[0], local254.method6925());
			}
		}
		if (local21 == 1011) {
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			Static152.anInt3145 = arg0;
			Static23.anInt3730 = arg2;
			local117 = Static196.method3380(Static17.aClass159_1, Static194.aClass173_56);
			local117.aClass4_Sub11_Sub1_3.method4937(local25);
			Static353.method5712(local117);
		}
		if (local21 == 44) {
			Static225.anInt4138 = 0;
			Static568.anInt9975 = 2;
			Static152.anInt3145 = arg0;
			Static23.anInt3730 = arg2;
			local117 = Static196.method3380(Static17.aClass159_1, Static204.aClass173_110);
			local117.aClass4_Sub11_Sub1_3.method4909(Static7.anInt173);
			local117.aClass4_Sub11_Sub1_3.method4937(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local117.aClass4_Sub11_Sub1_3.method4898(local15 + Static552.anInt9805);
			local117.aClass4_Sub11_Sub1_3.method4937(Static254.anInt4667 + local18);
			local117.aClass4_Sub11_Sub1_3.method4937(Static592.anInt10215);
			local117.aClass4_Sub11_Sub1_3.method4932(Static317.anInt10281);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			Static353.method5712(local117);
			Static442.method6823(local34, local15, local18);
		}
		if (local21 == 11 && Static69.aClass225_8 == null) {
			Static82.method1374(local15, local18);
			Static69.aClass225_8 = Static24.method318(local18, local15);
			Static92.method2100(Static69.aClass225_8);
		}
		if (local21 == 8) {
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static23.anInt3730 = arg2;
				Static568.anInt9975 = 2;
				Static152.anInt3145 = arg0;
				Static225.anInt4138 = 0;
				local265 = Static196.method3380(Static17.aClass159_1, Static316.aClass173_91);
				local265.aClass4_Sub11_Sub1_3.method4932(local25);
				local265.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
				Static353.method5712(local265);
				Static398.method6283(0, local254.anIntArray463[0], 0, -2, true, local254.method6925(), local254.anIntArray462[0], local254.method6925());
			}
		}
		if (local21 == 1001) {
			Static23.anInt3730 = arg2;
			Static225.anInt4138 = 0;
			Static568.anInt9975 = 2;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static29.aClass173_6);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4932((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local117.aClass4_Sub11_Sub1_3.method4932(Static254.anInt4667 + local18);
			local117.aClass4_Sub11_Sub1_3.method4898(Static552.anInt9805 + local15);
			Static353.method5712(local117);
			Static442.method6823(local34, local15, local18);
		}
		if (local21 == 45) {
			Static225.anInt4138 = 0;
			Static568.anInt9975 = 2;
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static371.aClass173_94);
			local117.aClass4_Sub11_Sub1_3.method4898(local18 + Static254.anInt4667);
			local117.aClass4_Sub11_Sub1_3.method4898(local25);
			local117.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4898(Static552.anInt9805 + local15);
			Static353.method5712(local117);
			Static44.method529(local18, local15);
		}
		if (local21 == 47) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static568.anInt9975 = 2;
				Static152.anInt3145 = arg0;
				Static23.anInt3730 = arg2;
				Static225.anInt4138 = 0;
				local429 = Static196.method3380(Static17.aClass159_1, Static99.aClass173_29);
				local429.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4932(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (local21 == 58) {
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			Static225.anInt4138 = 0;
			Static568.anInt9975 = 2;
			local117 = Static196.method3380(Static17.aClass159_1, Static443.aClass173_103);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4902(Static317.anInt10281);
			local117.aClass4_Sub11_Sub1_3.method4937(local18 + Static254.anInt4667);
			local117.aClass4_Sub11_Sub1_3.method4932(local15 + Static552.anInt9805);
			local117.aClass4_Sub11_Sub1_3.method4898(local25);
			local117.aClass4_Sub11_Sub1_3.method4915(Static7.anInt173);
			local117.aClass4_Sub11_Sub1_3.method4902(Static592.anInt10215);
			Static353.method5712(local117);
			Static44.method529(local18, local15);
		}
		if (local21 == 2) {
			Static225.anInt4138 = 0;
			Static23.anInt3730 = arg2;
			Static568.anInt9975 = 2;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static256.aClass173_77);
			local117.aClass4_Sub11_Sub1_3.method4932(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local117.aClass4_Sub11_Sub1_3.method4902(local15 + Static552.anInt9805);
			local117.aClass4_Sub11_Sub1_3.method4932(Static254.anInt4667 + local18);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			Static353.method5712(local117);
			Static442.method6823(local34, local15, local18);
		}
		if (local21 == 1009) {
			Static23.anInt3730 = arg2;
			Static225.anInt4138 = 0;
			Static568.anInt9975 = 2;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static515.aClass173_112);
			local117.aClass4_Sub11_Sub1_3.method4937(local25);
			Static353.method5712(local117);
		}
		if (local21 == 1006) {
			Static152.anInt3145 = arg0;
			Static225.anInt4138 = 0;
			Static23.anInt3730 = arg2;
			Static568.anInt9975 = 2;
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				@Pc(1969) Class283 local1969 = local254.aClass283_1;
				if (local1969.anIntArray453 != null) {
					local1969 = local1969.method6834(Static45.aClass148_1);
				}
				if (local1969 != null) {
					@Pc(1990) Class4_Sub14 local1990 = Static196.method3380(Static17.aClass159_1, Static241.aClass173_73);
					local1990.aClass4_Sub11_Sub1_3.method4937(local1969.anInt8273);
					Static353.method5712(local1990);
				}
			}
		}
		if (local21 == 13) {
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			local117 = Static196.method3380(Static17.aClass159_1, Static210.aClass173_63);
			local117.aClass4_Sub11_Sub1_3.method4902(local15 + Static552.anInt9805);
			local117.aClass4_Sub11_Sub1_3.method4932((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local117.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4932(Static254.anInt4667 + local18);
			Static353.method5712(local117);
			Static442.method6823(local34, local15, local18);
		}
		if (local21 == 10) {
			Static152.anInt3145 = arg0;
			Static23.anInt3730 = arg2;
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			local117 = Static196.method3380(Static17.aClass159_1, Static412.aClass173_100);
			local117.aClass4_Sub11_Sub1_3.method4958(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4932((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local117.aClass4_Sub11_Sub1_3.method4898(Static552.anInt9805 + local15);
			local117.aClass4_Sub11_Sub1_3.method4937(Static254.anInt4667 + local18);
			Static353.method5712(local117);
			Static442.method6823(local34, local15, local18);
		}
		if (local21 == 60) {
			if (Static204.anInt8827 > 0 && Static584.aClass154_1.method3569(82) && Static584.aClass154_1.method3569(81)) {
				Static326.method5358(local18 + Static254.anInt4667, Static552.anInt9805 - -local15, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126);
			} else {
				local117 = Static9.method171(local15, local25, local18);
				if (local25 == 1) {
					local117.aClass4_Sub11_Sub1_3.method4957(-1);
					local117.aClass4_Sub11_Sub1_3.method4957(-1);
					local117.aClass4_Sub11_Sub1_3.method4937((int) Static201.aFloat128);
					local117.aClass4_Sub11_Sub1_3.method4957(57);
					local117.aClass4_Sub11_Sub1_3.method4957(Static368.anInt7167);
					local117.aClass4_Sub11_Sub1_3.method4957(Static595.anInt10298);
					local117.aClass4_Sub11_Sub1_3.method4957(89);
					local117.aClass4_Sub11_Sub1_3.method4937(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934);
					local117.aClass4_Sub11_Sub1_3.method4937(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935);
					local117.aClass4_Sub11_Sub1_3.method4957(63);
				} else {
					Static23.anInt3730 = arg2;
					Static225.anInt4138 = 0;
					Static152.anInt3145 = arg0;
					Static568.anInt9975 = 1;
				}
				Static353.method5712(local117);
				Static398.method6283(0, local15, 0, -4, true, 1, local18, 1);
			}
		}
		if (local21 == 12) {
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			local117 = Static196.method3380(Static17.aClass159_1, Static103.aClass173_30);
			local117.aClass4_Sub11_Sub1_3.method4902(local25);
			local117.aClass4_Sub11_Sub1_3.method4898(local18 + Static254.anInt4667);
			local117.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4898(Static552.anInt9805 + local15);
			Static353.method5712(local117);
			Static44.method529(local18, local15);
		}
		if (local21 == 18) {
			local243 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local25);
			if (local243 != null) {
				Static225.anInt4138 = 0;
				Static23.anInt3730 = arg2;
				Static152.anInt3145 = arg0;
				local254 = local243.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				Static568.anInt9975 = 2;
				local265 = Static196.method3380(Static17.aClass159_1, Static522.aClass173_120);
				local265.aClass4_Sub11_Sub1_3.method4902(local25);
				local265.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
				Static353.method5712(local265);
				Static398.method6283(0, local254.anIntArray463[0], 0, -2, true, local254.method6925(), local254.anIntArray462[0], local254.method6925());
			}
		}
		if (local21 == 50) {
			Static568.anInt9975 = 2;
			Static225.anInt4138 = 0;
			Static23.anInt3730 = arg2;
			Static152.anInt3145 = arg0;
			local117 = Static196.method3380(Static17.aClass159_1, Static381.aClass173_98);
			local117.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
			local117.aClass4_Sub11_Sub1_3.method4932(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8435);
			local117.aClass4_Sub11_Sub1_3.method4902(Static592.anInt10215);
			local117.aClass4_Sub11_Sub1_3.method4932(Static317.anInt10281);
			local117.aClass4_Sub11_Sub1_3.method4909(Static7.anInt173);
			Static353.method5712(local117);
		}
		if (local21 == 22) {
			local410 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local410 != null) {
				Static23.anInt3730 = arg2;
				Static568.anInt9975 = 2;
				Static225.anInt4138 = 0;
				Static152.anInt3145 = arg0;
				local429 = Static196.method3380(Static17.aClass159_1, Static201.aClass173_59);
				local429.aClass4_Sub11_Sub1_3.method4944(Static584.aClass154_1.method3569(82) ? 1 : 0);
				local429.aClass4_Sub11_Sub1_3.method4898(local25);
				Static353.method5712(local429);
				Static398.method6283(0, local410.anIntArray463[0], 0, -2, true, local410.method6925(), local410.anIntArray462[0], local410.method6925());
			}
		}
		if (Static418.aBoolean541) {
			Static419.method6558();
		}
		if (Static238.aClass225_19 != null && Static208.anInt3874 == 0) {
			Static92.method2100(Static238.aClass225_19);
		}
	}
}
