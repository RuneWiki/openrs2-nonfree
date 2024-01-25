import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!ni;")
	public static Class223 aClass223_32;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt2530;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "J")
	public static volatile long aLong50 = 0L;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method2136() {
		for (@Pc(1) int local1 = 0; local1 < Static306.anInt6176; local1++) {
			@Pc(6) int[] local6 = Static634.anIntArrayArray68[local1];
			for (@Pc(8) int local8 = 0; local8 < Static108.anInt2930; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sba;)Lclient!sba;")
	public static Class302 method2137(@OriginalArg(0) Class302 arg0) {
		@Pc(4) int local4 = method2151(arg0).method8487();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static299.method5103(arg0.anInt8857);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method2138(@OriginalArg(1) Class5 arg0) {
		if (Static49.anInt1670 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 && (Static26.aClass186ArrayArrayArray1 != null && Static78.method2282(arg0, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135))) {
			Static49.anInt1670 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!sba;IIIIIIIIIII)V")
	public static void method2139(@OriginalArg(0) Class302[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class302 local6 = arg0[local1];
			if (local6 != null && local6.anInt8857 == arg1) {
				@Pc(17) int local17 = local6.anInt8930 + arg6;
				@Pc(22) int local22 = local6.anInt8897 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt8936 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt8909;
					local45 = local22 + local6.anInt8872;
					if (local6.anInt8936 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt8936 == 0 || local6.aBoolean709 || method2151(local6).anInt10438 != 0 || local6 == Static352.aClass302_9 || local6.anInt8904 == Static562.anInt9684 || local6.anInt8904 == Static82.anInt2602) {
					if (!method2146(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static238.aBoolean425) {
							local40 = Static352.method5739();
							local45 = Static573.method7997();
						}
						if (local6 == Static448.aClass302_13 && Static622.method8522(Static448.aClass302_13) != null) {
							Static308.aBoolean477 = true;
							Static313.anInt6261 = local17;
							Static456.anInt8196 = local22;
						}
						if (local6.aBoolean710 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean719 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class6_Sub29 local168 = (Class6_Sub29) Static138.aClass163_17.method4966(); local168 != null; local168 = (Class6_Sub29) Static138.aClass163_17.method4965()) {
									if (local168.aBoolean442) {
										local168.method8792();
										local168.aClass302_7.aBoolean723 = false;
									}
								}
								if (Static191.anInt4144 == 0) {
									Static448.aClass302_13 = null;
									Static352.aClass302_9 = null;
								}
								Static517.anInt9024 = 0;
								Static446.aBoolean647 = false;
								Static185.aBoolean330 = false;
								if (!Static199.aBoolean358) {
									Static95.method2327();
								}
							}
							@Pc(232) boolean local232;
							if (Static6.aClass96_1.method8026() + local40 >= local28 && Static6.aClass96_1.method8019() + local45 >= local30 && Static6.aClass96_1.method8026() + local40 < local32 && Static6.aClass96_1.method8019() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static141.aBoolean262 && local232) {
								if (local6.anInt8913 >= 0) {
									Static329.anInt6606 = local6.anInt8913;
								} else if (local6.aBoolean719) {
									Static329.anInt6606 = -1;
								}
							}
							if (!Static199.aBoolean358 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static15.method549(local6, arg11 - local22, arg10 - local17);
							}
							@Pc(276) boolean local276 = false;
							if (Static6.aClass96_1.method8018() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class6_Sub22 local291 = (Class6_Sub22) Static313.aClass163_35.method4966();
							if (local291 != null && local291.method3463() == 0 && local291.method3462() + local40 >= local28 && local291.method3458() + local45 >= local30 && local291.method3462() + local40 < local32 && local291.method3458() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray82 != null && !Static388.method6089()) {
								for (local335 = 0; local335 < local6.aByteArray82.length; local335++) {
									if (Static391.aClass91_1.method6224(local6.aByteArray82[local335])) {
										if (local6.anIntArray452 == null || Static384.anInt7234 >= local6.anIntArray452[local335]) {
											@Pc(367) byte local367 = local6.aByteArray81[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static391.aClass91_1.method6224(86) && !Static391.aClass91_1.method6224(82) && !Static391.aClass91_1.method6224(81)) && ((local367 & 0x2) == 0 || Static391.aClass91_1.method6224(86)) && ((local367 & 0x1) == 0 || Static391.aClass91_1.method6224(82)) && ((local367 & 0x4) == 0 || Static391.aClass91_1.method6224(81))) {
												if (local335 < 10) {
													Static526.method7485(local335 + 1, -1, "", local6.anInt8867);
												} else if (local335 == 10) {
													Static516.method7391();
													@Pc(438) Class6_Sub50 local438 = method2151(local6);
													Static246.method4414(local438.anInt10442, local6, local438.method8492());
													Static381.aString72 = Static316.method5294(local6);
													if (Static381.aString72 == null) {
														Static381.aString72 = "Null";
													}
													Static275.aString109 = local6.aString89 + "<col=ffffff>";
												}
												local469 = local6.anIntArray455[local335];
												if (local6.anIntArray452 == null) {
													local6.anIntArray452 = new int[local6.aByteArray82.length];
												}
												if (local469 == 0) {
													local6.anIntArray452[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray452[local335] = Static384.anInt7234 + local469;
												}
											}
										}
									} else if (local6.anIntArray452 != null) {
										local6.anIntArray452[local335] = 0;
									}
								}
							}
							if (local286) {
								Static479.method7086(local6, local40 + local291.method3462() - local17, local45 + local291.method3458() - local22);
							}
							if (Static448.aClass302_13 != null && Static448.aClass302_13 != local6 && local232 && method2151(local6).method8488()) {
								Static302.aClass302_8 = local6;
							}
							if (local6 == Static352.aClass302_9) {
								Static423.aBoolean623 = true;
								Static66.anInt2272 = local17;
								Static397.anInt7407 = local22;
							}
							if (local6.aBoolean709 || local6.anInt8904 != 0) {
								@Pc(558) Class6_Sub29 local558;
								if (local232 && Static551.anInt9470 != 0 && local6.anObjectArray17 != null) {
									local558 = new Class6_Sub29();
									local558.aBoolean442 = true;
									local558.aClass302_7 = local6;
									local558.anInt5603 = Static551.anInt9470;
									local558.anObjectArray1 = local6.anObjectArray17;
									Static138.aClass163_17.method4967(local558);
								}
								if (Static448.aClass302_13 != null || Static199.aBoolean358 || local6.anInt8904 != Static160.anInt3659 && Static517.anInt9024 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt8904 != 0) {
									if (local6.anInt8904 == Static47.anInt1660 || local6.anInt8904 == Static482.anInt8532) {
										Static367.aClass302_17 = local6;
										if (Static406.aClass350_1 != null) {
											Static406.aClass350_1.method8117(local6.anInt8872, Static467.aClass5_13);
										}
										if (local6.anInt8904 == Static47.anInt1660) {
											if (Static199.aBoolean358 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static77.method5028(arg9, arg8, Static467.aClass5_13);
											@Pc(641) Class9_Sub3 local641 = (Class9_Sub3) Static27.aClass234_1.method6092();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt1783 && arg10 < local641.anInt1781 && arg11 >= local641.anInt1778 && arg11 < local641.anInt1784) {
													Static95.method2327();
													Static275.method8429(local641.aClass9_Sub4_Sub2_Sub1_1);
												}
												local641 = (Class9_Sub3) Static27.aClass234_1.method6098();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt8904 == Static562.anInt9684) {
										if (local6.method7356(Static467.aClass5_13) == null || Static571.anInt9787 != 0 && Static571.anInt9787 != 3 || Static199.aBoolean358 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray451[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray458[local708]) {
											continue;
										}
										local335 -= local6.anInt8909 / 2;
										local708 -= local6.anInt8872 / 2;
										if (Static554.anInt9497 == 4) {
											local747 = (int) Static595.aFloat184 & 0x3FFF;
										} else {
											local747 = (int) Static595.aFloat184 + Static372.anInt7080 & 0x3FFF;
										}
										@Pc(759) int local759 = Class78_Sub2_Sub2.anIntArray270[local747];
										@Pc(763) int local763 = Class78_Sub2_Sub2.anIntArray271[local747];
										if (Static554.anInt9497 != 4) {
											local759 = local759 * (Static289.anInt10738 + 256) >> 8;
											local763 = local763 * (Static289.anInt10738 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static554.anInt9497 == 4) {
											local813 = (Static150.anInt3512 >> 9) + (local792 >> 2);
											local821 = (Static260.anInt5570 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() - 1) * 256;
											local813 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 - local830 >> 9) + (local792 >> 2);
											local821 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 - local830 >> 9) - (local802 >> 2);
										}
										if (Static141.aBoolean262 && (Static38.anInt1411 & 0x40) != 0) {
											@Pc(863) Class302 local863 = Static454.method6884(Static350.anInt6854, Static541.anInt9362);
											if (local863 == null) {
												Static516.method7391();
											} else {
												Static513.method7357(true, 1L, Static574.anInt9810, local813, " ->", true, local821, 46, (long) (local6.anInt8898 << 0 | local6.anInt8867), local6.anInt8899, false, Static381.aString72);
											}
											continue;
										}
										if (Static8.aClass290_1 == Static25.aClass290_5) {
											Static513.method7357(true, 1L, -1, local813, "", true, local821, 60, 0L, -1, false, Static536.aClass316_29.method7577(Static638.anInt10709));
										}
										Static513.method7357(true, 1L, Static365.anInt7043, local813, "", true, local821, 6, 0L, -1, false, Static389.aString74);
										continue;
									}
									if (local6.anInt8904 == Static160.anInt3659) {
										Static23.aClass302_1 = local6;
										if (local232) {
											Static446.aBoolean647 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method3462() - local17 - local6.anInt8909 / 2) * 2.0D / (double) Static491.aFloat158);
											local708 = (int) -((double) (local45 + local291.method3458() - local22 - local6.anInt8872 / 2) * 2.0D / (double) Static491.aFloat158);
											local469 = Static468.anInt8336 + local335 + Static491.anInt7783;
											local747 = Static457.anInt8209 + local708 + Static491.anInt7785;
											@Pc(994) Class6_Sub5_Sub13 local994 = Static132.method2687();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method3434(local469, local999, local747);
											if (local999 != null) {
												if (Static391.aClass91_1.method6224(82) && Static497.anInt8643 > 0) {
													Static602.method8316(local999[2], local999[1], local999[0]);
													continue;
												}
												Static185.aBoolean330 = true;
												Static571.anInt9786 = local999[0];
												Static233.anInt5198 = local999[1];
												Static640.anInt10720 = local999[2];
											}
											Static517.anInt9024 = 1;
											Static152.aBoolean280 = false;
											Static334.anInt6640 = Static6.aClass96_1.method8026();
											Static131.anInt3186 = Static6.aClass96_1.method8019();
											continue;
										}
										if (local276 && Static517.anInt9024 > 0) {
											if (Static517.anInt9024 == 1 && (Static334.anInt6640 != Static6.aClass96_1.method8026() || Static131.anInt3186 != Static6.aClass96_1.method8019())) {
												anInt2530 = Static468.anInt8336;
												Static467.anInt8307 = Static457.anInt8209;
												Static517.anInt9024 = 2;
											}
											if (Static517.anInt9024 == 2) {
												Static152.aBoolean280 = true;
												Static165.method3159(anInt2530 + (int) ((double) (Static334.anInt6640 - Static6.aClass96_1.method8026()) * 2.0D / (double) Static491.aFloat159));
												Static208.method3747(Static467.anInt8307 - (int) ((double) (Static131.anInt3186 - Static6.aClass96_1.method8019()) * 2.0D / (double) Static491.aFloat159));
											}
											continue;
										}
										if (Static517.anInt9024 > 0 && !Static152.aBoolean280) {
											if ((Static358.anInt6951 == 1 || Static135.method2721()) && Static611.anInt10324 > 2) {
												Static604.method8339(Static131.anInt3186, Static334.anInt6640);
											} else if (Static182.method3423()) {
												Static604.method8339(Static131.anInt3186, Static334.anInt6640);
											}
										}
										Static517.anInt9024 = 0;
										continue;
									}
									if (local6.anInt8904 == Static423.anInt7804) {
										if (local276) {
											Static370.method5893(local45 + Static6.aClass96_1.method8019() - local22, local6.anInt8909, local40 + Static6.aClass96_1.method8026() - local17, local6.anInt8872);
										}
										continue;
									}
									if (local6.anInt8904 == Static82.anInt2602) {
										Static527.method7491(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean711 && local286) {
									local6.aBoolean711 = true;
									if (local6.anObjectArray19 != null) {
										local558 = new Class6_Sub29();
										local558.aBoolean442 = true;
										local558.aClass302_7 = local6;
										local558.anInt5605 = local40 + local291.method3462() - local17;
										local558.anInt5603 = local45 + local291.method3458() - local22;
										local558.anObjectArray1 = local6.anObjectArray19;
										Static138.aClass163_17.method4967(local558);
									}
								}
								if (local6.aBoolean711 && local276 && local6.anObjectArray31 != null) {
									local558 = new Class6_Sub29();
									local558.aBoolean442 = true;
									local558.aClass302_7 = local6;
									local558.anInt5605 = local40 + Static6.aClass96_1.method8026() - local17;
									local558.anInt5603 = local45 + Static6.aClass96_1.method8019() - local22;
									local558.anObjectArray1 = local6.anObjectArray31;
									Static138.aClass163_17.method4967(local558);
								}
								if (local6.aBoolean711 && !local276) {
									local6.aBoolean711 = false;
									if (local6.anObjectArray33 != null) {
										local558 = new Class6_Sub29();
										local558.aBoolean442 = true;
										local558.aClass302_7 = local6;
										local558.anInt5605 = local40 + Static6.aClass96_1.method8026() - local17;
										local558.anInt5603 = local45 + Static6.aClass96_1.method8019() - local22;
										local558.anObjectArray1 = local6.anObjectArray33;
										Static184.aClass163_22.method4967(local558);
									}
								}
								if (local276 && local6.anObjectArray7 != null) {
									local558 = new Class6_Sub29();
									local558.aBoolean442 = true;
									local558.aClass302_7 = local6;
									local558.anInt5605 = local40 + Static6.aClass96_1.method8026() - local17;
									local558.anInt5603 = local45 + Static6.aClass96_1.method8019() - local22;
									local558.anObjectArray1 = local6.anObjectArray7;
									Static138.aClass163_17.method4967(local558);
								}
								if (!local6.aBoolean723 && local232) {
									local6.aBoolean723 = true;
									if (local6.anObjectArray6 != null) {
										local558 = new Class6_Sub29();
										local558.aBoolean442 = true;
										local558.aClass302_7 = local6;
										local558.anInt5605 = local40 + Static6.aClass96_1.method8026() - local17;
										local558.anInt5603 = local45 + Static6.aClass96_1.method8019() - local22;
										local558.anObjectArray1 = local6.anObjectArray6;
										Static138.aClass163_17.method4967(local558);
									}
								}
								if (local6.aBoolean723 && local232 && local6.anObjectArray23 != null) {
									local558 = new Class6_Sub29();
									local558.aBoolean442 = true;
									local558.aClass302_7 = local6;
									local558.anInt5605 = local40 + Static6.aClass96_1.method8026() - local17;
									local558.anInt5603 = local45 + Static6.aClass96_1.method8019() - local22;
									local558.anObjectArray1 = local6.anObjectArray23;
									Static138.aClass163_17.method4967(local558);
								}
								if (local6.aBoolean723 && !local232) {
									local6.aBoolean723 = false;
									if (local6.anObjectArray15 != null) {
										local558 = new Class6_Sub29();
										local558.aBoolean442 = true;
										local558.aClass302_7 = local6;
										local558.anInt5605 = local40 + Static6.aClass96_1.method8026() - local17;
										local558.anInt5603 = local45 + Static6.aClass96_1.method8019() - local22;
										local558.anObjectArray1 = local6.anObjectArray15;
										Static184.aClass163_22.method4967(local558);
									}
								}
								if (local6.anObjectArray14 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray14;
									Static341.aClass163_38.method4967(local558);
								}
								@Pc(1570) Class6_Sub29 local1570;
								if (local6.anObjectArray3 != null && Static547.anInt512 > local6.anInt8851) {
									if (local6.anIntArray457 == null || Static547.anInt512 - local6.anInt8851 > 32) {
										local558 = new Class6_Sub29();
										local558.aClass302_7 = local6;
										local558.anObjectArray1 = local6.anObjectArray3;
										Static138.aClass163_17.method4967(local558);
									} else {
										label687: for (local335 = local6.anInt8851; local335 < Static547.anInt512; local335++) {
											local708 = Static548.anIntArray502[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray457.length; local469++) {
												if (local6.anIntArray457[local469] == local708) {
													local1570 = new Class6_Sub29();
													local1570.aClass302_7 = local6;
													local1570.anObjectArray1 = local6.anObjectArray3;
													Static138.aClass163_17.method4967(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt8851 = Static547.anInt512;
								}
								if (local6.anObjectArray26 != null && Static171.anInt3809 > local6.anInt8884) {
									if (local6.anIntArray460 == null || Static171.anInt3809 - local6.anInt8884 > 32) {
										local558 = new Class6_Sub29();
										local558.aClass302_7 = local6;
										local558.anObjectArray1 = local6.anObjectArray26;
										Static138.aClass163_17.method4967(local558);
									} else {
										label663: for (local335 = local6.anInt8884; local335 < Static171.anInt3809; local335++) {
											local708 = Static286.anIntArray266[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray460.length; local469++) {
												if (local6.anIntArray460[local469] == local708) {
													local1570 = new Class6_Sub29();
													local1570.aClass302_7 = local6;
													local1570.anObjectArray1 = local6.anObjectArray26;
													Static138.aClass163_17.method4967(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt8884 = Static171.anInt3809;
								}
								if (local6.anObjectArray13 != null && Static423.anInt7806 > local6.anInt8920) {
									if (local6.anIntArray456 == null || Static423.anInt7806 - local6.anInt8920 > 32) {
										local558 = new Class6_Sub29();
										local558.aClass302_7 = local6;
										local558.anObjectArray1 = local6.anObjectArray13;
										Static138.aClass163_17.method4967(local558);
									} else {
										label639: for (local335 = local6.anInt8920; local335 < Static423.anInt7806; local335++) {
											local708 = Static176.anIntArray184[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray456.length; local469++) {
												if (local6.anIntArray456[local469] == local708) {
													local1570 = new Class6_Sub29();
													local1570.aClass302_7 = local6;
													local1570.anObjectArray1 = local6.anObjectArray13;
													Static138.aClass163_17.method4967(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt8920 = Static423.anInt7806;
								}
								if (local6.anObjectArray9 != null && Static282.anInt5928 > local6.anInt8919) {
									if (local6.anIntArray453 == null || Static282.anInt5928 - local6.anInt8919 > 32) {
										local558 = new Class6_Sub29();
										local558.aClass302_7 = local6;
										local558.anObjectArray1 = local6.anObjectArray9;
										Static138.aClass163_17.method4967(local558);
									} else {
										label615: for (local335 = local6.anInt8919; local335 < Static282.anInt5928; local335++) {
											local708 = Static148.anIntArray155[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray453.length; local469++) {
												if (local6.anIntArray453[local469] == local708) {
													local1570 = new Class6_Sub29();
													local1570.aClass302_7 = local6;
													local1570.anObjectArray1 = local6.anObjectArray9;
													Static138.aClass163_17.method4967(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt8919 = Static282.anInt5928;
								}
								if (local6.anObjectArray18 != null && Static243.anInt4625 > local6.anInt8882) {
									if (local6.anIntArray454 == null || Static243.anInt4625 - local6.anInt8882 > 32) {
										local558 = new Class6_Sub29();
										local558.aClass302_7 = local6;
										local558.anObjectArray1 = local6.anObjectArray18;
										Static138.aClass163_17.method4967(local558);
									} else {
										label591: for (local335 = local6.anInt8882; local335 < Static243.anInt4625; local335++) {
											local708 = Static210.anIntArray202[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray454.length; local469++) {
												if (local6.anIntArray454[local469] == local708) {
													local1570 = new Class6_Sub29();
													local1570.aClass302_7 = local6;
													local1570.anObjectArray1 = local6.anObjectArray18;
													Static138.aClass163_17.method4967(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt8882 = Static243.anInt4625;
								}
								if (Static31.anInt837 > local6.anInt8866 && local6.anObjectArray8 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray8;
									Static138.aClass163_17.method4967(local558);
								}
								if (Static617.anInt10423 > local6.anInt8866 && local6.anObjectArray4 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static138.aClass163_17.method4967(local558);
								}
								if (Static507.anInt8770 > local6.anInt8866 && local6.anObjectArray20 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray20;
									Static138.aClass163_17.method4967(local558);
								}
								if (Static221.anInt4989 > local6.anInt8866 && local6.anObjectArray21 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray21;
									Static138.aClass163_17.method4967(local558);
								}
								if (Static440.anInt7977 > local6.anInt8866 && local6.anObjectArray32 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray32;
									Static138.aClass163_17.method4967(local558);
								}
								local6.anInt8866 = Static51.anInt1750;
								if (local6.anObjectArray16 != null) {
									for (local335 = 0; local335 < Static564.anInt9701; local335++) {
										@Pc(2038) Class6_Sub29 local2038 = new Class6_Sub29();
										local2038.aClass302_7 = local6;
										local2038.anInt5602 = Static37.anInterface8Array1[local335].method2085();
										local2038.anInt5601 = Static37.anInterface8Array1[local335].method2083();
										local2038.anObjectArray1 = local6.anObjectArray16;
										Static138.aClass163_17.method4967(local2038);
									}
								}
								if (Static350.aBoolean546 && local6.anObjectArray5 != null) {
									local558 = new Class6_Sub29();
									local558.aClass302_7 = local6;
									local558.anObjectArray1 = local6.anObjectArray5;
									Static138.aClass163_17.method4967(local558);
								}
							}
							if (local6.anInt8936 == 5 && local6.lb != -1) {
								local6.method7354(Static181.aClass132_1, Static82.aClass74_1).method8117(local6.anInt8872, Static467.aClass5_13);
							}
							Static340.method5669(local6);
							if (local6.anInt8936 == 0) {
								method2139(arg0, local6.anInt8867, local28, local30, local32, local34, local17 - local6.anInt8865, local22 - local6.anInt8847, arg8, arg9, arg10, arg11);
								if (local6.aClass302Array2 != null) {
									method2139(local6.aClass302Array2, local6.anInt8867, local28, local30, local32, local34, local17 - local6.anInt8865, local22 - local6.anInt8847, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class6_Sub25 local2164 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local6.anInt8867);
								if (local2164 != null) {
									if (Static8.aClass290_1 == Static406.aClass290_34 && local2164.anInt5035 == 0 && !Static199.aBoolean358 && local232 && !Static30.aBoolean78) {
										Static95.method2327();
									}
									Static120.method2564(arg10, local30, local2164.anInt5034, local32, local34, local17, arg8, arg9, arg11, local22, local28);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static340.method5669(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method2140(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static6.anInt462;
		@Pc(3) int[] local3 = Static551.anIntArray503;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static288.anInt5977; local5++) {
			@Pc(15) Class9_Sub4_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local5 - local1])).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			}
			if (local15.aByte135 == arg0 && local15.anInt4300 >= 0) {
				@Pc(39) int local39 = local15.method3620();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10360 & 0x1FF) != 0 || (local15.anInt10357 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10360 & 0x1FF) != 256 || (local15.anInt10357 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10360 >> 9;
					local80 = local15.anInt10357 >> 9;
					if (local15.anInt4300 > Static634.anIntArrayArray68[local75][local80]) {
						Static634.anIntArrayArray68[local75][local80] = local15.anInt4300;
						Static612.anIntArrayArray65[local75][local80] = 1;
					} else if (local15.anInt4300 == Static634.anIntArrayArray68[local75][local80]) {
						local116 = Static612.anIntArrayArray65[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10360 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10357 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10360 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10357 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4300 > Static634.anIntArrayArray68[local158][local161]) {
								Static634.anIntArrayArray68[local158][local161] = local15.anInt4300;
								Static612.anIntArrayArray65[local158][local161] = 1;
							} else if (local15.anInt4300 == Static634.anIntArrayArray68[local158][local161]) {
								local116 = Static612.anIntArrayArray65[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method2145(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static6.anInt462;
		@Pc(3) int[] local3 = Static551.anIntArray503;
		@Pc(11) int local11 = Static100.aBoolean233 ? local1 : local1 + Static288.anInt5977;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class9_Sub4_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local13 - local1])).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			}
			if (local23.aByte135 == arg0) {
				local23.anInt4287 = 0;
				if (local23.anInt4300 < 0) {
					local23.aBoolean350 = false;
				} else {
					@Pc(54) int local54 = local23.method3620();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10360 & 0x1FF) != 0 || (local23.anInt10357 & 0x1FF) != 0) {
							local23.aBoolean350 = false;
							continue;
						}
					} else if ((local23.anInt10360 & 0x1FF) != 256 || (local23.anInt10357 & 0x1FF) != 256) {
						local23.aBoolean350 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10360 >> 9;
						local101 = local23.anInt10357 >> 9;
						if (local23.anInt4300 != Static634.anIntArrayArray68[local96][local101]) {
							local23.aBoolean350 = true;
							continue;
						}
						if (Static612.anIntArrayArray65[local96][local101] > 1) {
							local126 = Static612.anIntArrayArray65[local96][local101]--;
							local23.aBoolean350 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10360 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10357 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10360 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10357 + local96 >> 9;
						if (!Static173.method3266(local169, local162, local101, local155, local23.anInt4300)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4300 == Static634.anIntArrayArray68[local180][local183]) {
										local126 = Static612.anIntArrayArray65[local180][local183]--;
									}
								}
							}
							local23.aBoolean350 = true;
							continue;
						}
					}
					local23.aBoolean350 = false;
					local23.anInt10365 = Static150.method2982(local23.aByte135, local23.anInt10357, local23.anInt10360);
					Static397.method6261(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!sba;)Z")
	public static boolean method2146(@OriginalArg(0) Class302 arg0) {
		if (Static30.aBoolean78) {
			if (method2151(arg0).anInt10438 != 0) {
				return false;
			}
			if (arg0.anInt8936 == 0) {
				return false;
			}
		}
		return arg0.aBoolean721;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method2148() {
		Static230.anInt5094 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static288.anInt5977; local3++) {
			@Pc(14) Class9_Sub4_Sub2_Sub1_Sub1 local14 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local3])).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			if (local14.aBoolean350 && local14.method3621() != -1) {
				@Pc(32) int local32 = (local14.method3620() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10360 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10357 - local32 >> 9;
				@Pc(53) Class9_Sub4_Sub2_Sub1 local53 = Static411.method6449(local14.aByte135, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4299;
					if (local53 instanceof Class9_Sub4_Sub2_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt4287 == 0 && local53.method3621() != -1) {
						Static19.anIntArray20[Static230.anInt5094] = local58;
						Static312.anIntArray290[Static230.anInt5094] = local58;
						Static230.anInt5094++;
						local53.anInt4287++;
					}
					Static19.anIntArray20[Static230.anInt5094] = local58;
					Static312.anIntArray290[Static230.anInt5094] = local14.anInt4299 + 2048;
					Static230.anInt5094++;
					local53.anInt4287++;
				}
			}
		}
		Static396.method6258(Static19.anIntArray20, Static312.anIntArray290, 0, Static230.anInt5094 - 1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method2149() {
		@Pc(1) int local1 = Static6.anInt462;
		@Pc(3) int[] local3 = Static551.anIntArray503;
		@Pc(8) int local8 = Static87.aClass6_Sub33_6.aClass14_Sub24_1.method7988();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class9_Sub4_Sub2_Sub1_Sub2 local32 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local3[local25]];
			if (!local32.method3634()) {
				local32.anInt4300 = -1;
			} else if (local32.aBoolean354) {
				local32.anInt4300 = -1;
			} else {
				local32.method7823();
				if (local32.aShort115 >= 0 && local32.aShort114 >= 0 && local32.aShort117 < Static306.anInt6176 && local32.aShort116 < Static108.anInt2930) {
					local32.aBoolean353 = local32.aBoolean349 ? local23 : false;
					if (local32 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1) {
						local32.anInt4300 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean350) {
							local85++;
						}
						if (local32.anInt4346 > Static384.anInt7234) {
							local85 += 2;
						}
						local85 += 5 - local32.method3620() << 2;
						if (local32.aBoolean357) {
							local85 += 512;
						} else {
							if (Static186.anInt4078 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt4300 = local85 + 1;
					}
				} else {
					local32.anInt4300 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static288.anInt5977; local126++) {
			@Pc(137) Class9_Sub4_Sub2_Sub1_Sub1 local137 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local126])).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			if (local137.method1992() && local137.aClass158_1.method4863(Static140.aClass157_1)) {
				local137.method7823();
				if (local137.aShort115 >= 0 && local137.aShort114 >= 0 && local137.aShort117 < Static306.anInt6176 && local137.aShort116 < Static108.anInt2930) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean350) {
						local174++;
					}
					if (local137.anInt4346 > Static384.anInt7234) {
						local174 += 2;
					}
					local174 += 5 - local137.method3620() << 2;
					if (Static186.anInt4078 == 0) {
						if (local137.aClass158_1.aBoolean458) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static186.anInt4078 == 1) {
						if (local137.aClass158_1.aBoolean458) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass158_1.aBoolean452) {
						local174 += 1024;
					} else if (!local137.aClass158_1.aBoolean457) {
						local174 += 256;
					}
					local137.anInt4300 = local174 + 1;
				} else {
					local137.anInt4300 = -1;
				}
			} else {
				local137.anInt4300 = -1;
			}
		}
		for (local85 = 0; local85 < Static189.aClass50Array1.length; local85++) {
			@Pc(240) Class50 local240 = Static189.aClass50Array1[local85];
			if (local240 != null) {
				if (local240.anInt2414 == 1) {
					@Pc(254) Class6_Sub42 local254 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local240.anInt2411);
					if (local254 != null) {
						@Pc(259) Class9_Sub4_Sub2_Sub1_Sub1 local259 = local254.aClass9_Sub4_Sub2_Sub1_Sub1_1;
						if (local259.anInt4300 >= 0) {
							local259.anInt4300 += 2048;
						}
					}
				} else if (local240.anInt2414 == 10) {
					@Pc(278) Class9_Sub4_Sub2_Sub1_Sub2 local278 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local240.anInt2411];
					if (local278 != null && local278 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 && local278.anInt4300 >= 0) {
						local278.anInt4300 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method2150() {
		@Pc(1) int local1 = Static6.anInt462;
		@Pc(3) int[] local3 = Static551.anIntArray503;
		@Pc(11) int local11 = Static100.aBoolean233 ? local1 : local1 + Static288.anInt5977;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class9_Sub4_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local13 - local1])).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			}
			if (local23.anInt4300 >= 0) {
				@Pc(43) int local43 = local23.method3620();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10360 & 0x1FF) == 0 && (local23.anInt10357 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10360 & 0x1FF) == 256 && (local23.anInt10357 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10365 = Static150.method2982(local23.aByte135, local23.anInt10357, local23.anInt10360);
				Static397.method6261(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!sba;)Lclient!waa;")
	public static Class6_Sub50 method2151(@OriginalArg(0) Class302 arg0) {
		@Pc(13) Class6_Sub50 local13 = (Class6_Sub50) Static314.aClass380_23.method8747(((long) arg0.anInt8867 << 32) + (long) arg0.anInt8898);
		return local13 == null ? arg0.aClass6_Sub50_2 : local13;
	}
}
