import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!cba;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_21 = new Class40("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_32 = new Class150(104, -1);

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	public static int anInt1407 = 0;

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1282(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static103.anInt992;
		@Pc(3) int[] local3 = Static523.anIntArray682;
		@Pc(11) int local11 = Static360.aBoolean478 ? local1 : local1 + Static438.anInt7689;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local13 - local1])).aClass15_Sub2_Sub1_Sub2_2;
			}
			if (local23.aByte91 == arg0) {
				local23.anInt4723 = 0;
				if (local23.anInt4697 < 0) {
					local23.aBoolean300 = false;
				} else {
					@Pc(54) int local54 = local23.method4035();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8492 & 0x7F) != 0 || (local23.anInt8493 & 0x7F) != 0) {
							local23.aBoolean300 = false;
							continue;
						}
					} else if ((local23.anInt8492 & 0x7F) != 64 || (local23.anInt8493 & 0x7F) != 64) {
						local23.aBoolean300 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8492 >> 7;
						local101 = local23.anInt8493 >> 7;
						if (local23.anInt4697 != Static448.anIntArrayArray65[local96][local101]) {
							local23.aBoolean300 = true;
							continue;
						}
						if (Static357.anIntArrayArray53[local96][local101] > 1) {
							local126 = Static357.anIntArrayArray53[local96][local101]--;
							local23.aBoolean300 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt8492 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt8493 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt8492 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt8493 + local96 >> 7;
						if (!Static104.method2130(local169, local23.anInt4697, local162, local101, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4697 == Static448.anIntArrayArray65[local180][local183]) {
										local126 = Static357.anIntArrayArray53[local180][local183]--;
									}
								}
							}
							local23.aBoolean300 = true;
							continue;
						}
					}
					if (local23 instanceof Class15_Sub2_Sub1_Sub1 && local23.aClass5_Sub32_3 != null && Static481.anInt8318 >= local23.aClass5_Sub32_3.anInt6221 && Static481.anInt8318 < local23.aClass5_Sub32_3.anInt6217) {
						((Class15_Sub2_Sub1_Sub1) local23).aBoolean32 = false;
					}
					local23.aBoolean300 = false;
					local23.anInt8494 = Static191.method5464(local23.anInt8492, local23.anInt8493, local23.aByte91);
					method1297(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1283() {
		@Pc(1) int local1 = Static103.anInt992;
		@Pc(3) int[] local3 = Static523.anIntArray682;
		@Pc(20) boolean local20 = Static300.aClass5_Sub28_Sub1_1.anInt4877 == 1 && local1 > 200 || Static300.aClass5_Sub28_Sub1_1.anInt4877 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class15_Sub2_Sub1_Sub1 local29 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local3[local22]];
			if (local29.method797()) {
				local29.method6865();
				if (local29.aShort110 >= 0 && local29.aShort109 >= 0 && local29.aShort111 < Static460.anInt7894 && local29.aShort108 < Static235.anInt4493) {
					local29.aBoolean32 = local29.aBoolean299 ? local20 : false;
					if (local29 == Static35.aClass15_Sub2_Sub1_Sub1_1) {
						local29.anInt4697 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean300) {
							local75++;
						}
						if (local29.anInt4739 > Static481.anInt8318) {
							local75 += 2;
						}
						local75 += 5 - local29.method4035() << 2;
						if (local29.aBoolean33) {
							local75 += 512;
						} else {
							if (Static508.anInt8632 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt4697 = local75 + 1;
					}
				} else {
					local29.anInt4697 = -1;
				}
			} else {
				local29.anInt4697 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static438.anInt7689; local116++) {
			@Pc(127) Class15_Sub2_Sub1_Sub2 local127 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local116])).aClass15_Sub2_Sub1_Sub2_2;
			if (local127.method4052() && local127.aClass305_1.method7148(Static540.aClass242_1)) {
				local127.method6865();
				if (local127.aShort110 >= 0 && local127.aShort109 >= 0 && local127.aShort111 < Static460.anInt7894 && local127.aShort108 < Static235.anInt4493) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean300) {
						local164++;
					}
					if (local127.anInt4739 > Static481.anInt8318) {
						local164 += 2;
					}
					local164 += 5 - local127.method4035() << 2;
					if (Static508.anInt8632 == 0) {
						if (local127.aClass305_1.aBoolean636) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static508.anInt8632 == 1) {
						if (local127.aClass305_1.aBoolean636) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass305_1.aBoolean641) {
						local164 += 1024;
					} else if (!local127.aClass305_1.aBoolean638) {
						local164 += 256;
					}
					local127.anInt4697 = local164 + 1;
				} else {
					local127.anInt4697 = -1;
				}
			} else {
				local127.anInt4697 = -1;
			}
		}
		for (local75 = 0; local75 < Static531.aClass34Array1.length; local75++) {
			@Pc(230) Class34 local230 = Static531.aClass34Array1[local75];
			if (local230 != null) {
				if (local230.anInt976 == 1) {
					@Pc(244) Class5_Sub51 local244 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local230.anInt973);
					if (local244 != null) {
						@Pc(249) Class15_Sub2_Sub1_Sub2 local249 = local244.aClass15_Sub2_Sub1_Sub2_2;
						if (local249.anInt4697 >= 0) {
							local249.anInt4697 += 2048;
						}
					}
				} else if (local230.anInt976 == 10) {
					@Pc(268) Class15_Sub2_Sub1_Sub1 local268 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local230.anInt973];
					if (local268 != null && local268 != Static35.aClass15_Sub2_Sub1_Sub1_1 && local268.anInt4697 >= 0) {
						local268.anInt4697 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1284(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static103.anInt992;
		@Pc(3) int[] local3 = Static523.anIntArray682;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static438.anInt7689; local5++) {
			@Pc(15) Class15_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local5 - local1])).aClass15_Sub2_Sub1_Sub2_2;
			}
			if (local15.aByte91 == arg0 && local15.anInt4697 >= 0) {
				@Pc(39) int local39 = local15.method4035();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8492 & 0x7F) != 0 || (local15.anInt8493 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt8492 & 0x7F) != 64 || (local15.anInt8493 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8492 >> 7;
					local80 = local15.anInt8493 >> 7;
					if (local15.anInt4697 > Static448.anIntArrayArray65[local75][local80]) {
						Static448.anIntArrayArray65[local75][local80] = local15.anInt4697;
						Static357.anIntArrayArray53[local75][local80] = 1;
					} else if (local15.anInt4697 == Static448.anIntArrayArray65[local75][local80]) {
						local116 = Static357.anIntArrayArray53[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt8492 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt8493 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt8492 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt8493 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4697 > Static448.anIntArrayArray65[local158][local161]) {
								Static448.anIntArrayArray65[local158][local161] = local15.anInt4697;
								Static357.anIntArrayArray53[local158][local161] = 1;
							} else if (local15.anInt4697 == Static448.anIntArrayArray65[local158][local161]) {
								local116 = Static357.anIntArrayArray53[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1285() {
		@Pc(1) int local1 = Static103.anInt992;
		@Pc(3) int[] local3 = Static523.anIntArray682;
		@Pc(11) int local11 = Static360.aBoolean478 ? local1 : local1 + Static438.anInt7689;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local13 - local1])).aClass15_Sub2_Sub1_Sub2_2;
			}
			if (local23.anInt4697 >= 0) {
				@Pc(43) int local43 = local23.method4035();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8492 & 0x7F) == 0 && (local23.anInt8493 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt8492 & 0x7F) == 64 && (local23.anInt8493 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class15_Sub2_Sub1_Sub1 && local23.aClass5_Sub32_3 != null && Static481.anInt8318 >= local23.aClass5_Sub32_3.anInt6221 && Static481.anInt8318 < local23.aClass5_Sub32_3.anInt6217) {
					((Class15_Sub2_Sub1_Sub1) local23).aBoolean32 = false;
				}
				local23.anInt8494 = Static191.method5464(local23.anInt8492, local23.anInt8493, local23.aByte91);
				method1297(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!oh;)Lclient!oh;")
	public static Class220 method1286(@OriginalArg(0) Class220 arg0) {
		@Pc(4) int local4 = method1303(arg0).method1954();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static352.method5447(arg0.anInt6605);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;ZLjava/awt/Color;I)V")
	public static void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static209.aCanvas6.getGraphics();
			if (Static531.aFont1 == null) {
				Static531.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static383.anInt6994, Static456.anInt7874);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(255, 255, 255);
			}
			try {
				if (Static522.anImage3 == null) {
					Static522.anImage3 = Static209.aCanvas6.createImage(304, 34);
				}
				@Pc(67) Graphics local67 = Static522.anImage3.getGraphics();
				local67.setColor(arg1);
				local67.drawRect(0, 0, 303, 33);
				local67.setColor(arg3);
				local67.fillRect(2, 2, arg0 * 3, 30);
				local67.setColor(Color.black);
				local67.drawRect(1, 1, 301, 31);
				local67.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local67.setFont(Static531.aFont1);
				local67.setColor(arg5);
				local67.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local2.drawImage(Static522.anImage3, Static383.anInt6994 / 2 - 152, Static456.anInt7874 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static383.anInt6994 / 2 - 152;
				@Pc(159) int local159 = Static456.anInt7874 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local153 + 2, local159 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local153 + 1, local159 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local153 + 2, local159 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static531.aFont1);
				local2.setColor(arg5);
				local2.drawString(arg2, (304 - arg2.length() * 6) / 2 + local153, local159 - -22);
			}
			if (Static499.aString78 != null) {
				local2.setFont(Static531.aFont1);
				local2.setColor(arg5);
				local2.drawString(Static499.aString78, Static383.anInt6994 / 2 - Static499.aString78.length() * 6 / 2, Static456.anInt7874 / 2 - 26);
			}
		} catch (@Pc(265) Exception local265) {
			Static209.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!oh;IIIIIIIII)V")
	public static void method1290(@OriginalArg(0) Class220[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class220 local6 = arg0[local1];
			if (local6 != null && local6.anInt6605 == arg1) {
				@Pc(17) int local17 = local6.anInt6603 + arg6;
				@Pc(22) int local22 = local6.anInt6631 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6669 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6627;
					@Pc(45) int local45 = local22 + local6.anInt6681;
					if (local6.anInt6669 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6669 == 0 || local6.aBoolean472 || method1303(local6).anInt2112 != 0 || local6 == Static178.aClass220_8 || local6.anInt6618 == Static532.anInt8964) {
					if (!method1302(local6)) {
						if (local6 == Static499.aClass220_17 && Static443.method6279(Static499.aClass220_17) != null) {
							Static525.aBoolean644 = true;
							Static219.anInt4144 = local17;
							Static503.anInt8592 = local22;
						}
						if (local6.aBoolean459 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean470 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class5_Sub17 local152 = (Class5_Sub17) Static287.aClass99_49.method2526(); local152 != null; local152 = (Class5_Sub17) Static287.aClass99_49.method2519()) {
									if (local152.aBoolean198) {
										local152.method7425();
										local152.aClass220_5.aBoolean469 = false;
									}
								}
								if (Static136.anInt2832 == 0) {
									Static499.aClass220_17 = null;
									Static178.aClass220_8 = null;
								}
								Static464.anInt7969 = 0;
								Static535.aBoolean654 = false;
								Static11.aBoolean11 = false;
								if (!Static218.aBoolean250) {
									Static390.method7043();
								}
							}
							@Pc(208) boolean local208;
							if (Static280.aClass214_1.method6766() >= local28 && Static280.aClass214_1.method6770() >= local30 && Static280.aClass214_1.method6766() < local32 && Static280.aClass214_1.method6770() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static479.aBoolean594 && local208) {
								if (local6.anInt6611 >= 0) {
									Static92.anInt2142 = local6.anInt6611;
								} else if (local6.aBoolean470) {
									Static92.anInt2142 = -1;
								}
							}
							if (!Static218.aBoolean250 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static269.method5648(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(252) boolean local252 = false;
							if (Static280.aClass214_1.method6774() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class5_Sub42 local267 = (Class5_Sub42) Static483.aClass99_76.method2526();
							if (local267 != null && local267.method7431() == 0 && local267.method7433() >= local28 && local267.method7432() >= local30 && local267.method7433() < local32 && local267.method7432() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray89 != null) {
								for (local300 = 0; local300 < local6.aByteArray89.length; local300++) {
									if (Static59.aClass18_1.method5977(local6.aByteArray89[local300])) {
										if (local6.anIntArray497 == null || Static481.anInt8318 >= local6.anIntArray497[local300]) {
											@Pc(332) byte local332 = local6.aByteArray90[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static59.aClass18_1.method5977(86) && !Static59.aClass18_1.method5977(82) && !Static59.aClass18_1.method5977(81)) && ((local332 & 0x2) == 0 || Static59.aClass18_1.method5977(86)) && ((local332 & 0x1) == 0 || Static59.aClass18_1.method5977(82)) && ((local332 & 0x4) == 0 || Static59.aClass18_1.method5977(81))) {
												if (local300 < 10) {
													Static307.method5028(local6.anInt6661, -1, "", local300 + 1);
												} else if (local300 == 10) {
													Static187.method3151();
													@Pc(403) Class5_Sub11 local403 = method1303(local6);
													Static121.method2295(local6, local403.method1953(), local403.anInt2105);
													Static150.aString37 = Static247.method4238(local6);
													if (Static150.aString37 == null) {
														Static150.aString37 = "Null";
													}
													Static516.aString81 = local6.aString63 + "<col=ffffff>";
												}
												local434 = local6.anIntArray493[local300];
												if (local6.anIntArray497 == null) {
													local6.anIntArray497 = new int[local6.aByteArray89.length];
												}
												if (local434 == 0) {
													local6.anIntArray497[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray497[local300] = Static481.anInt8318 + local434;
												}
											}
										}
									} else if (local6.anIntArray497 != null) {
										local6.anIntArray497[local300] = 0;
									}
								}
							}
							if (local262) {
								Static26.method669(local6, local267.method7432() - local22, local267.method7433() - local17);
							}
							if (Static499.aClass220_17 != null && Static499.aClass220_17 != local6 && local208 && method1303(local6).method1956()) {
								Static350.aClass220_11 = local6;
							}
							if (local6 == Static178.aClass220_8) {
								Static527.aBoolean646 = true;
								Static277.anInt5400 = local17;
								Static492.anInt8448 = local22;
							}
							if (local6.aBoolean472 || local6.anInt6618 != 0) {
								@Pc(519) Class5_Sub17 local519;
								if (local208 && Static189.anInt4752 != 0 && local6.anObjectArray35 != null) {
									local519 = new Class5_Sub17();
									local519.aBoolean198 = true;
									local519.aClass220_5 = local6;
									local519.anInt2985 = Static189.anInt4752;
									local519.anObjectArray3 = local6.anObjectArray35;
									Static287.aClass99_49.method2513(local519);
								}
								if (Static499.aClass220_17 != null || Static218.aBoolean250 || local6.anInt6618 != Static306.anInt5961 && Static464.anInt7969 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt6618 != 0) {
									if (local6.anInt6618 == Static256.anInt5129 || local6.anInt6618 == Static216.anInt8990) {
										Static24.aClass220_9 = local6;
										if (Static514.aClass82_1 != null) {
											Static514.aClass82_1.method2242(Static110.aClass62_15, local6.anInt6681);
										}
										if (local6.anInt6618 == Static256.anInt5129) {
											if (!Static218.aBoolean250 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static268.method4442(arg9, Static110.aClass62_15, arg8);
												for (@Pc(602) Class30_Sub4 local602 = (Class30_Sub4) Static547.aClass77_14.method2157(); local602 != null; local602 = (Class30_Sub4) Static547.aClass77_14.method2160()) {
													if (arg8 >= local602.anInt6008 && arg8 < local602.anInt6013 && arg9 >= local602.anInt6007 && arg9 < local602.anInt6011) {
														Static390.method7043();
														Static306.method4961(local602.aClass15_Sub2_Sub1_1);
													}
												}
											}
											Static90.method1963(local22, local17, local6);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt6618 == Static532.anInt8964) {
										if (local6.method5482(Static110.aClass62_15) == null || Static219.anInt4147 != 0 && Static219.anInt4147 != 3 || Static218.aBoolean250 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray492[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray499[local674]) {
											continue;
										}
										local300 -= local6.anInt6627 / 2;
										local674 -= local6.anInt6681 / 2;
										if (Static166.anInt3343 == 4) {
											local713 = (int) Static476.aFloat339 & 0x3FFF;
										} else {
											local713 = (int) Static476.aFloat339 + Static352.anInt6565 & 0x3FFF;
										}
										@Pc(725) int local725 = Class5_Sub2_Sub16.anIntArray411[local713];
										@Pc(729) int local729 = Class5_Sub2_Sub16.anIntArray410[local713];
										if (Static166.anInt3343 != 4) {
											local725 = local725 * (Static145.anInt3048 + 256) >> 8;
											local729 = local729 * (Static145.anInt3048 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 15;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 15;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static166.anInt3343 == 4) {
											local779 = (Static409.anInt7303 >> 7) + (local758 >> 2);
											local787 = (Static433.anInt7633 >> 7) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() - 1) * 64;
											local779 = (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 - local796 >> 7) + (local758 >> 2);
											local787 = (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 - local796 >> 7) - (local768 >> 2);
										}
										if (Static479.aBoolean594 && (Static354.anInt6690 & 0x40) != 0) {
											@Pc(829) Class220 local829 = Static485.method6724(Static496.anInt8516, Static207.anInt3882);
											if (local829 == null) {
												Static187.method3151();
											} else {
												Static371.method5606(Static186.anInt3582, local787, 20, local6.anInt6641, true, 1L, local779, Static150.aString37, false, " ->");
											}
											continue;
										}
										if (Static525.aClass155_4 == Static53.aClass155_1) {
											Static371.method5606(-1, local787, 59, -1, true, 1L, local779, Static426.aClass40_122.method1063(Static194.anInt3737), false, "");
										}
										Static371.method5606(Static399.anInt7152, local787, 46, -1, true, 1L, local779, Static222.aString80, false, "");
										continue;
									}
									if (local6.anInt6618 == Static306.anInt5961) {
										Static75.aClass220_4 = local6;
										if (local208) {
											Static535.aBoolean654 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method7433() - local17 - local6.anInt6627 / 2) * 2.0D / (double) Static245.aFloat312);
											local674 = (int) -((double) (local267.method7432() - local22 - local6.anInt6681 / 2) * 2.0D / (double) Static245.aFloat312);
											local434 = Static435.anInt7668 + local300 + Static245.anInt7314;
											local713 = Static489.anInt8411 + local674 + Static245.anInt7315;
											@Pc(943) Class5_Sub2_Sub5 local943 = Static47.method1047();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method826(local434, local713, local948);
											if (local948 != null) {
												if (Static59.aClass18_1.method5977(82) && Static137.anInt1383 > 0) {
													Static281.method4575(local948[1], local948[0], local948[2]);
													continue;
												}
												Static11.aBoolean11 = true;
												Static127.anInt2676 = local948[0];
												Static250.anInt5060 = local948[1];
												Static300.anInt5968 = local948[2];
											}
											Static464.anInt7969 = 1;
											Static126.aBoolean607 = false;
											Static543.anInt6390 = Static280.aClass214_1.method6766();
											Static364.anInt6815 = Static280.aClass214_1.method6770();
											continue;
										}
										if (local252 && Static464.anInt7969 > 0) {
											if (Static464.anInt7969 == 1 && (Static543.anInt6390 != Static280.aClass214_1.method6766() || Static364.anInt6815 != Static280.aClass214_1.method6770())) {
												Static149.anInt3093 = Static435.anInt7668;
												Static517.anInt8764 = Static489.anInt8411;
												Static464.anInt7969 = 2;
											}
											if (Static464.anInt7969 == 2) {
												Static126.aBoolean607 = true;
												Static38.method835(Static149.anInt3093 + (int) ((double) (Static543.anInt6390 - Static280.aClass214_1.method6766()) * 2.0D / (double) Static245.aFloat313));
												Static43.method896(Static517.anInt8764 - (int) ((double) (Static364.anInt6815 - Static280.aClass214_1.method6770()) * 2.0D / (double) Static245.aFloat313));
											}
											continue;
										}
										if (Static464.anInt7969 > 0 && !Static126.aBoolean607) {
											if ((Static325.anInt6252 == 1 || Static136.method2573()) && Static257.anInt5147 > 2) {
												Static162.method2908(Static543.anInt6390, Static364.anInt6815);
											} else if (Static358.method5520()) {
												Static162.method2908(Static543.anInt6390, Static364.anInt6815);
											}
										}
										Static464.anInt7969 = 0;
										continue;
									}
									if (local6.anInt6618 == Static505.anInt8209) {
										if (local252) {
											Static201.method3299(Static280.aClass214_1.method6766() - local17, local6.anInt6681, Static280.aClass214_1.method6770() - local22, local6.anInt6627);
										}
										continue;
									}
									if (local6.anInt6618 == Static534.anInt8997) {
										Static282.method4791(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean466 && local262) {
									local6.aBoolean466 = true;
									if (local6.anObjectArray26 != null) {
										local519 = new Class5_Sub17();
										local519.aBoolean198 = true;
										local519.aClass220_5 = local6;
										local519.anInt2983 = local267.method7433() - local17;
										local519.anInt2985 = local267.method7432() - local22;
										local519.anObjectArray3 = local6.anObjectArray26;
										Static287.aClass99_49.method2513(local519);
									}
								}
								if (local6.aBoolean466 && local252 && local6.anObjectArray31 != null) {
									local519 = new Class5_Sub17();
									local519.aBoolean198 = true;
									local519.aClass220_5 = local6;
									local519.anInt2983 = Static280.aClass214_1.method6766() - local17;
									local519.anInt2985 = Static280.aClass214_1.method6770() - local22;
									local519.anObjectArray3 = local6.anObjectArray31;
									Static287.aClass99_49.method2513(local519);
								}
								if (local6.aBoolean466 && !local252) {
									local6.aBoolean466 = false;
									if (local6.anObjectArray8 != null) {
										local519 = new Class5_Sub17();
										local519.aBoolean198 = true;
										local519.aClass220_5 = local6;
										local519.anInt2983 = Static280.aClass214_1.method6766() - local17;
										local519.anInt2985 = Static280.aClass214_1.method6770() - local22;
										local519.anObjectArray3 = local6.anObjectArray8;
										Static24.aClass99_25.method2513(local519);
									}
								}
								if (local252 && local6.anObjectArray10 != null) {
									local519 = new Class5_Sub17();
									local519.aBoolean198 = true;
									local519.aClass220_5 = local6;
									local519.anInt2983 = Static280.aClass214_1.method6766() - local17;
									local519.anInt2985 = Static280.aClass214_1.method6770() - local22;
									local519.anObjectArray3 = local6.anObjectArray10;
									Static287.aClass99_49.method2513(local519);
								}
								if (!local6.aBoolean469 && local208) {
									local6.aBoolean469 = true;
									if (local6.anObjectArray14 != null) {
										local519 = new Class5_Sub17();
										local519.aBoolean198 = true;
										local519.aClass220_5 = local6;
										local519.anInt2983 = Static280.aClass214_1.method6766() - local17;
										local519.anInt2985 = Static280.aClass214_1.method6770() - local22;
										local519.anObjectArray3 = local6.anObjectArray14;
										Static287.aClass99_49.method2513(local519);
									}
								}
								if (local6.aBoolean469 && local208 && local6.anObjectArray16 != null) {
									local519 = new Class5_Sub17();
									local519.aBoolean198 = true;
									local519.aClass220_5 = local6;
									local519.anInt2983 = Static280.aClass214_1.method6766() - local17;
									local519.anInt2985 = Static280.aClass214_1.method6770() - local22;
									local519.anObjectArray3 = local6.anObjectArray16;
									Static287.aClass99_49.method2513(local519);
								}
								if (local6.aBoolean469 && !local208) {
									local6.aBoolean469 = false;
									if (local6.anObjectArray32 != null) {
										local519 = new Class5_Sub17();
										local519.aBoolean198 = true;
										local519.aClass220_5 = local6;
										local519.anInt2983 = Static280.aClass214_1.method6766() - local17;
										local519.anInt2985 = Static280.aClass214_1.method6770() - local22;
										local519.anObjectArray3 = local6.anObjectArray32;
										Static24.aClass99_25.method2513(local519);
									}
								}
								if (local6.anObjectArray29 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray29;
									Static443.aClass99_67.method2513(local519);
								}
								@Pc(1487) Class5_Sub17 local1487;
								if (local6.anObjectArray21 != null && Static106.anInt2320 > local6.anInt6660) {
									if (local6.anIntArray496 == null || Static106.anInt2320 - local6.anInt6660 > 32) {
										local519 = new Class5_Sub17();
										local519.aClass220_5 = local6;
										local519.anObjectArray3 = local6.anObjectArray21;
										Static287.aClass99_49.method2513(local519);
									} else {
										label680: for (local300 = local6.anInt6660; local300 < Static106.anInt2320; local300++) {
											local674 = Static243.anIntArray310[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray496.length; local434++) {
												if (local6.anIntArray496[local434] == local674) {
													local1487 = new Class5_Sub17();
													local1487.aClass220_5 = local6;
													local1487.anObjectArray3 = local6.anObjectArray21;
													Static287.aClass99_49.method2513(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt6660 = Static106.anInt2320;
								}
								if (local6.anObjectArray33 != null && Static539.anInt9044 > local6.anInt6682) {
									if (local6.anIntArray491 == null || Static539.anInt9044 - local6.anInt6682 > 32) {
										local519 = new Class5_Sub17();
										local519.aClass220_5 = local6;
										local519.anObjectArray3 = local6.anObjectArray33;
										Static287.aClass99_49.method2513(local519);
									} else {
										label656: for (local300 = local6.anInt6682; local300 < Static539.anInt9044; local300++) {
											local674 = Static78.anIntArray172[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray491.length; local434++) {
												if (local6.anIntArray491[local434] == local674) {
													local1487 = new Class5_Sub17();
													local1487.aClass220_5 = local6;
													local1487.anObjectArray3 = local6.anObjectArray33;
													Static287.aClass99_49.method2513(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt6682 = Static539.anInt9044;
								}
								if (local6.anObjectArray17 != null && Static352.anInt6563 > local6.anInt6662) {
									if (local6.anIntArray500 == null || Static352.anInt6563 - local6.anInt6662 > 32) {
										local519 = new Class5_Sub17();
										local519.aClass220_5 = local6;
										local519.anObjectArray3 = local6.anObjectArray17;
										Static287.aClass99_49.method2513(local519);
									} else {
										label632: for (local300 = local6.anInt6662; local300 < Static352.anInt6563; local300++) {
											local674 = Static496.anIntArray660[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray500.length; local434++) {
												if (local6.anIntArray500[local434] == local674) {
													local1487 = new Class5_Sub17();
													local1487.aClass220_5 = local6;
													local1487.anObjectArray3 = local6.anObjectArray17;
													Static287.aClass99_49.method2513(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt6662 = Static352.anInt6563;
								}
								if (local6.anObjectArray28 != null && Static228.anInt4307 > local6.anInt6656) {
									if (local6.anIntArray495 == null || Static228.anInt4307 - local6.anInt6656 > 32) {
										local519 = new Class5_Sub17();
										local519.aClass220_5 = local6;
										local519.anObjectArray3 = local6.anObjectArray28;
										Static287.aClass99_49.method2513(local519);
									} else {
										label608: for (local300 = local6.anInt6656; local300 < Static228.anInt4307; local300++) {
											local674 = Static161.anIntArray249[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray495.length; local434++) {
												if (local6.anIntArray495[local434] == local674) {
													local1487 = new Class5_Sub17();
													local1487.aClass220_5 = local6;
													local1487.anObjectArray3 = local6.anObjectArray28;
													Static287.aClass99_49.method2513(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt6656 = Static228.anInt4307;
								}
								if (local6.anObjectArray27 != null && Static542.anInt9117 > local6.anInt6678) {
									if (local6.anIntArray498 == null || Static542.anInt9117 - local6.anInt6678 > 32) {
										local519 = new Class5_Sub17();
										local519.aClass220_5 = local6;
										local519.anObjectArray3 = local6.anObjectArray27;
										Static287.aClass99_49.method2513(local519);
									} else {
										label584: for (local300 = local6.anInt6678; local300 < Static542.anInt9117; local300++) {
											local674 = Static409.anIntArray565[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray498.length; local434++) {
												if (local6.anIntArray498[local434] == local674) {
													local1487 = new Class5_Sub17();
													local1487.aClass220_5 = local6;
													local1487.anObjectArray3 = local6.anObjectArray27;
													Static287.aClass99_49.method2513(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt6678 = Static542.anInt9117;
								}
								if (Static383.anInt6995 > local6.anInt6600 && local6.anObjectArray36 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray36;
									Static287.aClass99_49.method2513(local519);
								}
								if (Static49.anInt1093 > local6.anInt6600 && local6.anObjectArray15 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray15;
									Static287.aClass99_49.method2513(local519);
								}
								if (Static510.anInt8651 > local6.anInt6600 && local6.anObjectArray25 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray25;
									Static287.aClass99_49.method2513(local519);
								}
								if (Static370.anInt7927 > local6.anInt6600 && local6.anObjectArray12 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray12;
									Static287.aClass99_49.method2513(local519);
								}
								if (Static51.anInt1105 > local6.anInt6600 && local6.anObjectArray22 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray22;
									Static287.aClass99_49.method2513(local519);
								}
								local6.anInt6600 = Static356.anInt6716;
								if (local6.anObjectArray13 != null) {
									for (local300 = 0; local300 < Static214.anInt4064; local300++) {
										@Pc(1955) Class5_Sub17 local1955 = new Class5_Sub17();
										local1955.aClass220_5 = local6;
										local1955.anInt2976 = Static39.anInterface1Array1[local300].method5005();
										local1955.anInt2979 = Static39.anInterface1Array1[local300].method5008();
										local1955.anObjectArray3 = local6.anObjectArray13;
										Static287.aClass99_49.method2513(local1955);
									}
								}
								if (Static381.aBoolean491 && local6.anObjectArray9 != null) {
									local519 = new Class5_Sub17();
									local519.aClass220_5 = local6;
									local519.anObjectArray3 = local6.anObjectArray9;
									Static287.aClass99_49.method2513(local519);
								}
							}
							if (local6.anInt6669 == 5 && local6.anInt6679 != -1) {
								local6.method5486(Static420.aClass118_10, Static175.aClass49_1).method2242(Static110.aClass62_15, local6.anInt6681);
							}
							Static56.method1139(local6);
							if (local6.anInt6669 == 0) {
								method1290(arg0, local6.anInt6661, local28, local30, local32, local34, local17 - local6.anInt6626, local22 - local6.anInt6609, arg8, arg9);
								if (local6.aClass220Array6 != null) {
									method1290(local6.aClass220Array6, local6.anInt6661, local28, local30, local32, local34, local17 - local6.anInt6626, local22 - local6.anInt6609, arg8, arg9);
								}
								@Pc(2077) Class5_Sub43 local2077 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local6.anInt6661);
								if (local2077 != null) {
									if (Static525.aClass155_4 == Static300.aClass155_2 && local2077.anInt7805 == 0 && !Static218.aBoolean250 && local208 && !Static525.aBoolean645) {
										Static390.method7043();
									}
									Static190.method3194(local22, local34, arg9, local17, local28, local2077.anInt7801, local32, arg8, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static56.method1139(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!bda;Z[I[I[I)V")
	public static void method1291(@OriginalArg(0) Class15_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg0.aClass170Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass170Array3[local19] = null;
					} else {
						@Pc(34) Class31 local34 = Static155.aClass76_2.method2152(local9);
						@Pc(37) int local37 = local34.anInt923;
						@Pc(42) Class170 local42 = arg0.aClass170Array3[local19];
						if (local42 != null) {
							if (local42.anInt5058 == local9) {
								if (local37 == 0) {
									local42 = arg0.aClass170Array3[local19] = null;
								} else if (local37 == 1) {
									local42.anInt5052 = local17;
									local42.anInt5054 = 0;
									local42.anInt5056 = 1;
									local42.anInt5055 = 0;
									local42.anInt5053 = 0;
									Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, 0, local34, arg0.anInt8492, arg0.aByte91);
								} else if (local37 == 2) {
									local42.anInt5053 = 0;
								}
							} else if (local34.anInt933 >= Static155.aClass76_2.method2152(local42.anInt5058).anInt933) {
								local42 = arg0.aClass170Array3[local19] = null;
							}
						}
						if (local42 == null) {
							local42 = arg0.aClass170Array3[local19] = new Class170();
							local42.anInt5055 = 0;
							local42.anInt5053 = 0;
							local42.anInt5058 = local9;
							local42.anInt5054 = 0;
							local42.anInt5052 = local17;
							local42.anInt5056 = 1;
							Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, 0, local34, arg0.anInt8492, arg0.aByte91);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1292() {
		Static339.anInt6369 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static438.anInt7689; local3++) {
			@Pc(14) Class15_Sub2_Sub1_Sub2 local14 = ((Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local3])).aClass15_Sub2_Sub1_Sub2_2;
			if (local14.aBoolean300 && local14.method4032() != -1) {
				@Pc(32) int local32 = (local14.method4035() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt8492 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt8493 - local32 >> 7;
				@Pc(53) Class15_Sub2_Sub1 local53 = Static528.method6946(local39, local14.aByte91, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4745;
					if (local53 instanceof Class15_Sub2_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt4723 == 0 && local53.method4032() != -1) {
						Static34.anIntArray62[Static339.anInt6369] = local58;
						Static378.anIntArray547[Static339.anInt6369] = local58;
						Static339.anInt6369++;
						local53.anInt4723++;
					}
					Static34.anIntArray62[Static339.anInt6369] = local58;
					Static378.anIntArray547[Static339.anInt6369] = local14.anInt4745 + 2048;
					Static339.anInt6369++;
					local53.anInt4723++;
				}
			}
		}
		Static116.method2262(Static339.anInt6369 - 1, 0, Static378.anIntArray547, Static34.anIntArray62);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1295() {
		for (@Pc(1) int local1 = 0; local1 < Static460.anInt7894; local1++) {
			@Pc(6) int[] local6 = Static448.anIntArrayArray65[local1];
			for (@Pc(8) int local8 = 0; local8 < Static235.anInt4493; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tv;Z)Z")
	public static boolean method1297(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static248.aClass131Array4 == Static511.aClass131Array6;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6865();
		if (arg0.aShort110 < 0 || arg0.aShort109 < 0 || arg0.aShort111 >= Static374.anInt6925 || arg0.aShort108 >= Static430.anInt7565) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort110; local34 <= arg0.aShort111; local34++) {
			for (local38 = arg0.aShort109; local38 <= arg0.aShort108; local38++) {
				@Pc(45) Class37 local45 = Static464.method6477(arg0.aByte91, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort110) {
						local49++;
					}
					if (local34 < arg0.aShort111) {
						local49 += 4;
					}
					if (local38 > arg0.aShort109) {
						local49 += 8;
					}
					if (local38 < arg0.aShort108) {
						local49 += 2;
					}
					@Pc(74) Class108 local74 = Static528.method6948(local49, arg0);
					@Pc(77) Class108 local77 = local45.aClass108_1;
					if (local77 == null) {
						local45.aClass108_1 = local74;
					} else {
						while (local77.aClass108_3 != null) {
							local77 = local77.aClass108_3;
						}
						local77.aClass108_3 = local74;
					}
					local45.aByte27 = (byte) (local45.aByte27 | local49);
					if (local6 && (Static2.anIntArrayArray1[local34][local38] & 0xFF000000) != 0) {
						local8 = Static2.anIntArrayArray1[local34][local38];
						local10 = Static401.aShortArrayArray8[local34][local38];
						local12 = Static60.aByteArrayArray48[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort110; local38 <= arg0.aShort111; local38++) {
				for (@Pc(150) int local150 = arg0.aShort109; local150 <= arg0.aShort108; local150++) {
					if ((Static2.anIntArrayArray1[local38][local150] & 0xFF000000) == 0) {
						Static2.anIntArrayArray1[local38][local150] = local8;
						Static401.aShortArrayArray8[local38][local150] = local10;
						Static60.aByteArrayArray48[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static448.aClass15_Sub2Array3[Static255.anInt5115++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!oh;)Z")
	public static boolean method1302(@OriginalArg(0) Class220 arg0) {
		if (Static525.aBoolean645) {
			if (method1303(arg0).anInt2112 != 0) {
				return false;
			}
			if (arg0.anInt6669 == 0) {
				return false;
			}
		}
		return arg0.aBoolean463;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!oh;)Lclient!df;")
	public static Class5_Sub11 method1303(@OriginalArg(0) Class220 arg0) {
		@Pc(13) Class5_Sub11 local13 = (Class5_Sub11) Static236.aClass42_17.method1109(((long) arg0.anInt6661 << 32) + (long) arg0.anInt6674);
		return local13 == null ? arg0.aClass5_Sub11_1 : local13;
	}
}
