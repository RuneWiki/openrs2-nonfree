import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!gw;")
	public static Class3_Sub4_Sub11 aClass3_Sub4_Sub11_1;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[Lclient!qk;")
	public static Class279[] aClass279Array1;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_17 = new Class200(7, -2);

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_36 = new Class130(71, -1);

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/lang/String;")
	public static String aString8 = null;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!qk;IIIIIIIIIII)V")
	public static void method1823(@OriginalArg(0) Class279[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class279 local6 = arg0[local1];
			if (local6 != null && local6.anInt8203 == arg1) {
				@Pc(17) int local17 = local6.anInt8200 + arg6;
				@Pc(22) int local22 = local6.anInt8139 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt8204 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt8153;
					local45 = local22 + local6.anInt8141;
					if (local6.anInt8204 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt8204 == 0 || local6.aBoolean563 || method1833(local6).anInt2466 != 0 || local6 == Static220.aClass279_6 || local6.anInt8137 == Static470.anInt8250 || local6.anInt8137 == Static49.anInt1402) {
					if (!method1836(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static219.aBoolean285) {
							local40 = Static30.method1089();
							local45 = Static166.method2921();
						}
						if (local6 == Static608.aClass279_18 && Static49.method1446(Static608.aClass279_18) != null) {
							Static376.aBoolean508 = true;
							Static475.anInt8308 = local17;
							Static528.anInt9013 = local22;
						}
						if (local6.aBoolean575 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean564 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class3_Sub21 local168 = (Class3_Sub21) Static443.aClass223_45.method5874(); local168 != null; local168 = (Class3_Sub21) Static443.aClass223_45.method5870()) {
									if (local168.aBoolean192) {
										local168.method8769();
										local168.aClass279_5.aBoolean570 = false;
									}
								}
								if (Static343.anInt6700 == 0) {
									Static608.aClass279_18 = null;
									Static220.aClass279_6 = null;
								}
								Static242.anInt4494 = 0;
								Static362.aBoolean497 = false;
								Static617.aBoolean718 = false;
								if (!Static447.aBoolean555) {
									Static309.method5103();
								}
							}
							@Pc(232) boolean local232;
							if (Static483.aClass191_1.method6989() + local40 >= local28 && Static483.aClass191_1.method6982() + local45 >= local30 && Static483.aClass191_1.method6989() + local40 < local32 && Static483.aClass191_1.method6982() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static190.aBoolean232 && local232) {
								if (local6.anInt8184 >= 0) {
									Static32.anInt7819 = local6.anInt8184;
								} else if (local6.aBoolean564) {
									Static32.anInt7819 = -1;
								}
							}
							if (!Static447.aBoolean555 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static240.method8601(local6, arg11 - local22, arg10 - local17);
							}
							@Pc(276) boolean local276 = false;
							if (Static483.aClass191_1.method6984() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class3_Sub31 local291 = (Class3_Sub31) Static537.aClass223_58.method5874();
							if (local291 != null && local291.method6923() == 0 && local291.method6921() + local40 >= local28 && local291.method6924() + local45 >= local30 && local291.method6921() + local40 < local32 && local291.method6924() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray92 != null && !Static3.method35()) {
								for (local335 = 0; local335 < local6.aByteArray92.length; local335++) {
									if (Static339.aClass163_1.method4104(local6.aByteArray92[local335])) {
										if (local6.anIntArray517 == null || Static101.anInt2262 >= local6.anIntArray517[local335]) {
											@Pc(367) byte local367 = local6.aByteArray91[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static339.aClass163_1.method4104(86) && !Static339.aClass163_1.method4104(82) && !Static339.aClass163_1.method4104(81)) && ((local367 & 0x2) == 0 || Static339.aClass163_1.method4104(86)) && ((local367 & 0x1) == 0 || Static339.aClass163_1.method4104(82)) && ((local367 & 0x4) == 0 || Static339.aClass163_1.method4104(81))) {
												if (local335 < 10) {
													Static641.method8741("", local335 + 1, -1, local6.anInt8185);
												} else if (local335 == 10) {
													Static282.method4549();
													@Pc(438) Class3_Sub15 local438 = method1833(local6);
													Static93.method2084(local438.anInt2463, local6, local438.method2322());
													Static136.aString18 = Static203.method3500(local6);
													if (Static136.aString18 == null) {
														Static136.aString18 = "Null";
													}
													Static11.aString107 = local6.aString91 + "<col=ffffff>";
												}
												local469 = local6.anIntArray511[local335];
												if (local6.anIntArray517 == null) {
													local6.anIntArray517 = new int[local6.aByteArray92.length];
												}
												if (local469 == 0) {
													local6.anIntArray517[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray517[local335] = Static101.anInt2262 + local469;
												}
											}
										}
									} else if (local6.anIntArray517 != null) {
										local6.anIntArray517[local335] = 0;
									}
								}
							}
							if (local286) {
								Static603.method8428(local6, local45 + local291.method6924() - local22, local40 + local291.method6921() - local17);
							}
							if (Static608.aClass279_18 != null && Static608.aClass279_18 != local6 && local232 && method1833(local6).method2320()) {
								Static600.aClass279_15 = local6;
							}
							if (local6 == Static220.aClass279_6) {
								Static465.aBoolean562 = true;
								Static322.anInt6043 = local17;
								Static92.anInt2193 = local22;
							}
							if (local6.aBoolean563 || local6.anInt8137 != 0) {
								@Pc(558) Class3_Sub21 local558;
								if (local232 && Static472.anInt8271 != 0 && local6.anObjectArray4 != null) {
									local558 = new Class3_Sub21();
									local558.aBoolean192 = true;
									local558.aClass279_5 = local6;
									local558.anInt2947 = Static472.anInt8271;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static443.aClass223_45.method5868(local558);
								}
								if (Static608.aClass279_18 != null || Static447.aBoolean555 || local6.anInt8137 != Static511.anInt8835 && Static242.anInt4494 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt8137 != 0) {
									if (local6.anInt8137 == Static198.anInt8759 || local6.anInt8137 == Static334.anInt6286) {
										Static270.aClass279_8 = local6;
										if (Static175.aClass327_1 != null) {
											Static175.aClass327_1.method8022(Static323.aClass5_9, local6.anInt8141);
										}
										if (local6.anInt8137 == Static198.anInt8759) {
											if (Static447.aBoolean555 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static377.method6070(arg9, Static323.aClass5_9, arg8);
											@Pc(641) Class4_Sub6 local641 = (Class4_Sub6) Static131.aClass120_2.method2966();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt7220 && arg10 < local641.anInt7224 && arg11 >= local641.anInt7221 && arg11 < local641.anInt7222) {
													Static309.method5103();
													Static264.method4348(local641.aClass4_Sub1_Sub2_Sub1_1);
												}
												local641 = (Class4_Sub6) Static131.aClass120_2.method2962();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt8137 == Static470.anInt8250) {
										if (local6.method7073(Static323.aClass5_9) == null || Static51.anInt1431 != 0 && Static51.anInt1431 != 3 || Static447.aBoolean555 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray514[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray519[local708]) {
											continue;
										}
										local335 -= local6.anInt8153 / 2;
										local708 -= local6.anInt8141 / 2;
										if (Static305.anInt5422 == 4) {
											local747 = (int) Static401.aFloat165 & 0x3FFF;
										} else {
											local747 = (int) Static401.aFloat165 + Static226.anInt1879 & 0x3FFF;
										}
										@Pc(759) int local759 = Class21.anIntArray656[local747];
										@Pc(763) int local763 = Class21.anIntArray655[local747];
										if (Static305.anInt5422 != 4) {
											local759 = local759 * (Static517.anInt8961 + 256) >> 8;
											local763 = local763 * (Static517.anInt8961 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static305.anInt5422 == 4) {
											local813 = (Static602.anInt9811 >> 9) + (local792 >> 2);
											local821 = (Static349.anInt6751 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() - 1) * 256;
											local813 = (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 - local830 >> 9) + (local792 >> 2);
											local821 = (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 - local830 >> 9) - (local802 >> 2);
										}
										if (Static190.aBoolean232 && (Static37.anInt1189 & 0x40) != 0) {
											@Pc(863) Class279 local863 = Static406.method6473(Static161.anInt3179, Static433.anInt7818);
											if (local863 == null) {
												Static282.method4549();
											} else {
												Static582.method8234(Static136.aString18, true, local821, true, " ->", local813, (long) (local6.anInt8147 << 0 | local6.anInt8185), Static262.anInt4805, 1L, 47, local6.anInt8217, false);
											}
											continue;
										}
										if (Static212.aClass222_2 == Static542.aClass222_7) {
											Static582.method8234(Static59.aClass43_27.method1598(Static325.anInt6083), true, local821, true, "", local813, 0L, -1, 1L, 18, -1, false);
										}
										Static582.method8234(Static123.aString17, true, local821, true, "", local813, 0L, Static524.anInt8435, 1L, 5, -1, false);
										continue;
									}
									if (local6.anInt8137 == Static511.anInt8835) {
										Static87.aClass279_3 = local6;
										if (local232) {
											Static362.aBoolean497 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method6921() - local17 - local6.anInt8153 / 2) * 2.0D / (double) Static110.aFloat79);
											local708 = (int) -((double) (local45 + local291.method6924() - local22 - local6.anInt8141 / 2) * 2.0D / (double) Static110.aFloat79);
											local469 = Static365.anInt6941 + local335 + Static110.anInt3014;
											local747 = Static561.anInt9391 + local708 + Static110.anInt3012;
											@Pc(994) Class3_Sub4_Sub11 local994 = Static212.method3590();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method3418(local469, local999, local747);
											if (local999 != null) {
												if (Static339.aClass163_1.method4104(82) && Static302.anInt5364 > 0) {
													Static94.method2090(local999[2], local999[0], local999[1]);
													continue;
												}
												Static617.aBoolean718 = true;
												Static166.anInt3243 = local999[0];
												Static423.anInt7640 = local999[1];
												Static165.anInt3237 = local999[2];
											}
											Static242.anInt4494 = 1;
											Static373.aBoolean503 = false;
											Static219.anInt4151 = Static483.aClass191_1.method6989();
											Static448.anInt7978 = Static483.aClass191_1.method6982();
											continue;
										}
										if (local276 && Static242.anInt4494 > 0) {
											if (Static242.anInt4494 == 1 && (Static219.anInt4151 != Static483.aClass191_1.method6989() || Static448.anInt7978 != Static483.aClass191_1.method6982())) {
												Static72.anInt1725 = Static365.anInt6941;
												Static334.anInt6284 = Static561.anInt9391;
												Static242.anInt4494 = 2;
											}
											if (Static242.anInt4494 == 2) {
												Static373.aBoolean503 = true;
												Static146.method2670(Static72.anInt1725 + (int) ((double) (Static219.anInt4151 - Static483.aClass191_1.method6989()) * 2.0D / (double) Static110.aFloat80));
												Static313.method5147(Static334.anInt6284 - (int) ((double) (Static448.anInt7978 - Static483.aClass191_1.method6982()) * 2.0D / (double) Static110.aFloat80));
											}
											continue;
										}
										if (Static242.anInt4494 > 0 && !Static373.aBoolean503) {
											if ((Static583.anInt9564 == 1 || Static509.method7603()) && Static160.anInt3142 > 2) {
												Static322.method5268(Static448.anInt7978, Static219.anInt4151);
											} else if (Static155.method2822()) {
												Static322.method5268(Static448.anInt7978, Static219.anInt4151);
											}
										}
										Static242.anInt4494 = 0;
										continue;
									}
									if (local6.anInt8137 == Static334.anInt6285) {
										if (local276) {
											Static480.method7175(local40 + Static483.aClass191_1.method6989() - local17, local6.anInt8141, local6.anInt8153, local45 + Static483.aClass191_1.method6982() - local22);
										}
										continue;
									}
									if (local6.anInt8137 == Static49.anInt1402) {
										Static464.method7045(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean569 && local286) {
									local6.aBoolean569 = true;
									if (local6.anObjectArray13 != null) {
										local558 = new Class3_Sub21();
										local558.aBoolean192 = true;
										local558.aClass279_5 = local6;
										local558.anInt2953 = local40 + local291.method6921() - local17;
										local558.anInt2947 = local45 + local291.method6924() - local22;
										local558.anObjectArray1 = local6.anObjectArray13;
										Static443.aClass223_45.method5868(local558);
									}
								}
								if (local6.aBoolean569 && local276 && local6.anObjectArray18 != null) {
									local558 = new Class3_Sub21();
									local558.aBoolean192 = true;
									local558.aClass279_5 = local6;
									local558.anInt2953 = local40 + Static483.aClass191_1.method6989() - local17;
									local558.anInt2947 = local45 + Static483.aClass191_1.method6982() - local22;
									local558.anObjectArray1 = local6.anObjectArray18;
									Static443.aClass223_45.method5868(local558);
								}
								if (local6.aBoolean569 && !local276) {
									local6.aBoolean569 = false;
									if (local6.anObjectArray24 != null) {
										local558 = new Class3_Sub21();
										local558.aBoolean192 = true;
										local558.aClass279_5 = local6;
										local558.anInt2953 = local40 + Static483.aClass191_1.method6989() - local17;
										local558.anInt2947 = local45 + Static483.aClass191_1.method6982() - local22;
										local558.anObjectArray1 = local6.anObjectArray24;
										Static483.aClass223_50.method5868(local558);
									}
								}
								if (local276 && local6.anObjectArray26 != null) {
									local558 = new Class3_Sub21();
									local558.aBoolean192 = true;
									local558.aClass279_5 = local6;
									local558.anInt2953 = local40 + Static483.aClass191_1.method6989() - local17;
									local558.anInt2947 = local45 + Static483.aClass191_1.method6982() - local22;
									local558.anObjectArray1 = local6.anObjectArray26;
									Static443.aClass223_45.method5868(local558);
								}
								if (!local6.aBoolean570 && local232) {
									local6.aBoolean570 = true;
									if (local6.anObjectArray14 != null) {
										local558 = new Class3_Sub21();
										local558.aBoolean192 = true;
										local558.aClass279_5 = local6;
										local558.anInt2953 = local40 + Static483.aClass191_1.method6989() - local17;
										local558.anInt2947 = local45 + Static483.aClass191_1.method6982() - local22;
										local558.anObjectArray1 = local6.anObjectArray14;
										Static443.aClass223_45.method5868(local558);
									}
								}
								if (local6.aBoolean570 && local232 && local6.anObjectArray22 != null) {
									local558 = new Class3_Sub21();
									local558.aBoolean192 = true;
									local558.aClass279_5 = local6;
									local558.anInt2953 = local40 + Static483.aClass191_1.method6989() - local17;
									local558.anInt2947 = local45 + Static483.aClass191_1.method6982() - local22;
									local558.anObjectArray1 = local6.anObjectArray22;
									Static443.aClass223_45.method5868(local558);
								}
								if (local6.aBoolean570 && !local232) {
									local6.aBoolean570 = false;
									if (local6.anObjectArray8 != null) {
										local558 = new Class3_Sub21();
										local558.aBoolean192 = true;
										local558.aClass279_5 = local6;
										local558.anInt2953 = local40 + Static483.aClass191_1.method6989() - local17;
										local558.anInt2947 = local45 + Static483.aClass191_1.method6982() - local22;
										local558.anObjectArray1 = local6.anObjectArray8;
										Static483.aClass223_50.method5868(local558);
									}
								}
								if (local6.anObjectArray19 != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.anObjectArray19;
									Static82.aClass223_11.method5868(local558);
								}
								@Pc(1570) Class3_Sub21 local1570;
								if (local6.anObjectArray11 != null && Static311.anInt7191 > local6.anInt8181) {
									if (local6.anIntArray520 == null || Static311.anInt7191 - local6.anInt8181 > 32) {
										local558 = new Class3_Sub21();
										local558.aClass279_5 = local6;
										local558.anObjectArray1 = local6.anObjectArray11;
										Static443.aClass223_45.method5868(local558);
									} else {
										label687: for (local335 = local6.anInt8181; local335 < Static311.anInt7191; local335++) {
											local708 = Static379.anIntArray423[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray520.length; local469++) {
												if (local6.anIntArray520[local469] == local708) {
													local1570 = new Class3_Sub21();
													local1570.aClass279_5 = local6;
													local1570.anObjectArray1 = local6.anObjectArray11;
													Static443.aClass223_45.method5868(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt8181 = Static311.anInt7191;
								}
								if (local6.anObjectArray12 != null && Static199.anInt3911 > local6.anInt8211) {
									if (local6.anIntArray516 == null || Static199.anInt3911 - local6.anInt8211 > 32) {
										local558 = new Class3_Sub21();
										local558.aClass279_5 = local6;
										local558.anObjectArray1 = local6.anObjectArray12;
										Static443.aClass223_45.method5868(local558);
									} else {
										label663: for (local335 = local6.anInt8211; local335 < Static199.anInt3911; local335++) {
											local708 = Static595.anIntArray663[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray516.length; local469++) {
												if (local6.anIntArray516[local469] == local708) {
													local1570 = new Class3_Sub21();
													local1570.aClass279_5 = local6;
													local1570.anObjectArray1 = local6.anObjectArray12;
													Static443.aClass223_45.method5868(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt8211 = Static199.anInt3911;
								}
								if (local6.anObjectArray16 != null && Static231.anInt4366 > local6.anInt8132) {
									if (local6.anIntArray515 == null || Static231.anInt4366 - local6.anInt8132 > 32) {
										local558 = new Class3_Sub21();
										local558.aClass279_5 = local6;
										local558.anObjectArray1 = local6.anObjectArray16;
										Static443.aClass223_45.method5868(local558);
									} else {
										label639: for (local335 = local6.anInt8132; local335 < Static231.anInt4366; local335++) {
											local708 = Static332.anIntArray374[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray515.length; local469++) {
												if (local6.anIntArray515[local469] == local708) {
													local1570 = new Class3_Sub21();
													local1570.aClass279_5 = local6;
													local1570.anObjectArray1 = local6.anObjectArray16;
													Static443.aClass223_45.method5868(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt8132 = Static231.anInt4366;
								}
								if (local6.anObjectArray32 != null && Static416.anInt7577 > local6.anInt8143) {
									if (local6.anIntArray518 == null || Static416.anInt7577 - local6.anInt8143 > 32) {
										local558 = new Class3_Sub21();
										local558.aClass279_5 = local6;
										local558.anObjectArray1 = local6.anObjectArray32;
										Static443.aClass223_45.method5868(local558);
									} else {
										label615: for (local335 = local6.anInt8143; local335 < Static416.anInt7577; local335++) {
											local708 = Static382.anIntArray435[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray518.length; local469++) {
												if (local6.anIntArray518[local469] == local708) {
													local1570 = new Class3_Sub21();
													local1570.aClass279_5 = local6;
													local1570.anObjectArray1 = local6.anObjectArray32;
													Static443.aClass223_45.method5868(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt8143 = Static416.anInt7577;
								}
								if (local6.anObjectArray30 != null && Static159.anInt3137 > local6.anInt8212) {
									if (local6.anIntArray513 == null || Static159.anInt3137 - local6.anInt8212 > 32) {
										local558 = new Class3_Sub21();
										local558.aClass279_5 = local6;
										local558.anObjectArray1 = local6.anObjectArray30;
										Static443.aClass223_45.method5868(local558);
									} else {
										label591: for (local335 = local6.anInt8212; local335 < Static159.anInt3137; local335++) {
											local708 = Static324.anIntArray508[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray513.length; local469++) {
												if (local6.anIntArray513[local469] == local708) {
													local1570 = new Class3_Sub21();
													local1570.aClass279_5 = local6;
													local1570.anObjectArray1 = local6.anObjectArray30;
													Static443.aClass223_45.method5868(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt8212 = Static159.anInt3137;
								}
								if (Static501.anInt8624 > local6.anInt8209 && local6.anObjectArray10 != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.anObjectArray10;
									Static443.aClass223_45.method5868(local558);
								}
								if (Static258.anInt4764 > local6.anInt8209 && local6.anObjectArray17 != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.anObjectArray17;
									Static443.aClass223_45.method5868(local558);
								}
								if (Static337.anInt6314 > local6.anInt8209 && local6.anObjectArray29 != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.anObjectArray29;
									Static443.aClass223_45.method5868(local558);
								}
								if (Static16.anInt4340 > local6.anInt8209 && local6.lb != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.lb;
									Static443.aClass223_45.method5868(local558);
								}
								if (Static406.anInt7450 > local6.anInt8209 && local6.anObjectArray20 != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.anObjectArray20;
									Static443.aClass223_45.method5868(local558);
								}
								local6.anInt8209 = Static371.anInt7006;
								if (local6.anObjectArray6 != null) {
									for (local335 = 0; local335 < Static611.anInt9889; local335++) {
										@Pc(2038) Class3_Sub21 local2038 = new Class3_Sub21();
										local2038.aClass279_5 = local6;
										local2038.anInt2948 = Static283.anInterface5Array5[local335].method7864();
										local2038.anInt2950 = Static283.anInterface5Array5[local335].method7866();
										local2038.anObjectArray1 = local6.anObjectArray6;
										Static443.aClass223_45.method5868(local2038);
									}
								}
								if (Static504.aBoolean616 && local6.anObjectArray28 != null) {
									local558 = new Class3_Sub21();
									local558.aClass279_5 = local6;
									local558.anObjectArray1 = local6.anObjectArray28;
									Static443.aClass223_45.method5868(local558);
								}
							}
							if (local6.anInt8204 == 5 && local6.anInt8172 != -1) {
								local6.method7071(Static229.aClass306_1, Static300.aClass186_1).method8022(Static323.aClass5_9, local6.anInt8141);
							}
							Static274.method4474(local6);
							if (local6.anInt8204 == 0) {
								method1823(arg0, local6.anInt8185, local28, local30, local32, local34, local17 - local6.anInt8136, local22 - local6.anInt8130, arg8, arg9, arg10, arg11);
								if (local6.aClass279Array2 != null) {
									method1823(local6.aClass279Array2, local6.anInt8185, local28, local30, local32, local34, local17 - local6.anInt8136, local22 - local6.anInt8130, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class3_Sub29 local2164 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local6.anInt8185);
								if (local2164 != null) {
									if (Static212.aClass222_2 == Static232.aClass222_3 && local2164.anInt4603 == 0 && !Static447.aBoolean555 && local232 && !Static351.aBoolean491) {
										Static309.method5103();
									}
									Static455.method6990(arg9, local34, arg11, arg10, arg8, local2164.anInt4601, local22, local17, local30, local28, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static274.method4474(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1824() {
		Static247.anInt4559 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static94.anInt2209; local3++) {
			@Pc(14) Class4_Sub1_Sub2_Sub1_Sub1 local14 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local3])).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			if (local14.aBoolean405 && local14.method5070() != -1) {
				@Pc(32) int local32 = (local14.method5059() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8916 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8911 - local32 >> 9;
				@Pc(53) Class4_Sub1_Sub2_Sub1 local53 = Static338.method5700(local39, local14.aByte123, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt5759;
					if (local53 instanceof Class4_Sub1_Sub2_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt5772 == 0 && local53.method5070() != -1) {
						Static133.anIntArray130[Static247.anInt4559] = local58;
						Static582.anIntArray613[Static247.anInt4559] = local58;
						Static247.anInt4559++;
						local53.anInt5772++;
					}
					Static133.anIntArray130[Static247.anInt4559] = local58;
					Static582.anIntArray613[Static247.anInt4559] = local14.anInt5759 + 2048;
					Static247.anInt4559++;
					local53.anInt5772++;
				}
			}
		}
		Static544.method7940(Static582.anIntArray613, Static247.anInt4559 - 1, Static133.anIntArray130, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!qk;)Lclient!qk;")
	public static Class279 method1825(@OriginalArg(0) Class279 arg0) {
		@Pc(4) int local4 = method1833(arg0).method2316();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static433.method6771(arg0.anInt8203);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1826(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static274.anInt4964;
		@Pc(3) int[] local3 = Static70.anIntArray392;
		@Pc(11) int local11 = Static68.aBoolean103 ? local1 : local1 + Static94.anInt2209;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub1_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local13 - local1])).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			}
			if (local23.aByte123 == arg0) {
				local23.anInt5772 = 0;
				if (local23.anInt5724 < 0) {
					local23.aBoolean405 = false;
				} else {
					@Pc(54) int local54 = local23.method5059();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8916 & 0x1FF) != 0 || (local23.anInt8911 & 0x1FF) != 0) {
							local23.aBoolean405 = false;
							continue;
						}
					} else if ((local23.anInt8916 & 0x1FF) != 256 || (local23.anInt8911 & 0x1FF) != 256) {
						local23.aBoolean405 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8916 >> 9;
						local101 = local23.anInt8911 >> 9;
						if (local23.anInt5724 != Static609.anIntArrayArray63[local96][local101]) {
							local23.aBoolean405 = true;
							continue;
						}
						if (Static85.anIntArrayArray11[local96][local101] > 1) {
							local126 = Static85.anIntArrayArray11[local96][local101]--;
							local23.aBoolean405 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8916 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8911 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8916 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8911 + local96 >> 9;
						if (!Static219.method3674(local101, local23.anInt5724, local169, local162, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt5724 == Static609.anIntArrayArray63[local180][local183]) {
										local126 = Static85.anIntArrayArray11[local180][local183]--;
									}
								}
							}
							local23.aBoolean405 = true;
							continue;
						}
					}
					local23.aBoolean405 = false;
					local23.anInt8915 = Static192.method3263(local23.anInt8911, local23.anInt8916, local23.aByte123);
					Static67.method1693(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1830() {
		for (@Pc(1) int local1 = 0; local1 < Static634.anInt10129; local1++) {
			@Pc(6) int[] local6 = Static609.anIntArrayArray63[local1];
			for (@Pc(8) int local8 = 0; local8 < Static638.anInt10172; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!qk;)Lclient!ea;")
	public static Class3_Sub15 method1833(@OriginalArg(0) Class279 arg0) {
		@Pc(13) Class3_Sub15 local13 = (Class3_Sub15) Static559.aClass280_44.method7107(((long) arg0.anInt8185 << 32) + (long) arg0.anInt8147);
		return local13 == null ? arg0.aClass3_Sub15_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	public static boolean method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static108.method2180(arg0, arg1) | (arg0 & 0x70000) != 0 || Static136.method2563(arg0, arg1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!qk;)Z")
	public static boolean method1836(@OriginalArg(0) Class279 arg0) {
		if (Static351.aBoolean491) {
			if (method1833(arg0).anInt2466 != 0) {
				return false;
			}
			if (arg0.anInt8204 == 0) {
				return false;
			}
		}
		return arg0.aBoolean580;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1837() {
		@Pc(1) int local1 = Static274.anInt4964;
		@Pc(3) int[] local3 = Static70.anIntArray392;
		@Pc(8) int local8 = Static262.aClass3_Sub27_12.aClass21_Sub21_1.method6846();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class4_Sub1_Sub2_Sub1_Sub2 local32 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local3[local25]];
			if (!local32.method5079()) {
				local32.anInt5724 = -1;
			} else if (local32.aBoolean409) {
				local32.anInt5724 = -1;
			} else {
				local32.method7707();
				if (local32.aShort118 >= 0 && local32.aShort116 >= 0 && local32.aShort117 < Static634.anInt10129 && local32.aShort119 < Static638.anInt10172) {
					local32.aBoolean410 = local32.aBoolean404 ? local23 : false;
					if (local32 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2) {
						local32.anInt5724 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean405) {
							local85++;
						}
						if (local32.anInt5757 > Static101.anInt2262) {
							local85 += 2;
						}
						local85 += 5 - local32.method5059() << 2;
						if (local32.aBoolean408) {
							local85 += 512;
						} else {
							if (Static454.anInt8026 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt5724 = local85 + 1;
					}
				} else {
					local32.anInt5724 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static94.anInt2209; local126++) {
			@Pc(137) Class4_Sub1_Sub2_Sub1_Sub1 local137 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local126])).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			if (local137.method3333() && local137.aClass109_1.method2817(Static373.aClass150_1)) {
				local137.method7707();
				if (local137.aShort118 >= 0 && local137.aShort116 >= 0 && local137.aShort117 < Static634.anInt10129 && local137.aShort119 < Static638.anInt10172) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean405) {
						local174++;
					}
					if (local137.anInt5757 > Static101.anInt2262) {
						local174 += 2;
					}
					local174 += 5 - local137.method5059() << 2;
					if (Static454.anInt8026 == 0) {
						if (local137.aClass109_1.aBoolean202) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static454.anInt8026 == 1) {
						if (local137.aClass109_1.aBoolean202) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass109_1.aBoolean198) {
						local174 += 1024;
					} else if (!local137.aClass109_1.aBoolean201) {
						local174 += 256;
					}
					local137.anInt5724 = local174 + 1;
				} else {
					local137.anInt5724 = -1;
				}
			} else {
				local137.anInt5724 = -1;
			}
		}
		for (local85 = 0; local85 < Static82.aClass251Array1.length; local85++) {
			@Pc(240) Class251 local240 = Static82.aClass251Array1[local85];
			if (local240 != null) {
				if (local240.anInt7476 == 1) {
					@Pc(254) Class3_Sub28 local254 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local240.anInt7486);
					if (local254 != null) {
						@Pc(259) Class4_Sub1_Sub2_Sub1_Sub1 local259 = local254.aClass4_Sub1_Sub2_Sub1_Sub1_2;
						if (local259.anInt5724 >= 0) {
							local259.anInt5724 += 2048;
						}
					}
				} else if (local240.anInt7476 == 10) {
					@Pc(278) Class4_Sub1_Sub2_Sub1_Sub2 local278 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local240.anInt7486];
					if (local278 != null && local278 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 && local278.anInt5724 >= 0) {
						local278.anInt5724 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1838() {
		@Pc(1) int local1 = Static274.anInt4964;
		@Pc(3) int[] local3 = Static70.anIntArray392;
		@Pc(11) int local11 = Static68.aBoolean103 ? local1 : local1 + Static94.anInt2209;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub1_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local13 - local1])).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			}
			if (local23.anInt5724 >= 0) {
				@Pc(43) int local43 = local23.method5059();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8916 & 0x1FF) == 0 && (local23.anInt8911 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8916 & 0x1FF) == 256 && (local23.anInt8911 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8915 = Static192.method3263(local23.anInt8911, local23.anInt8916, local23.aByte123);
				Static67.method1693(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1839(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static274.anInt4964;
		@Pc(3) int[] local3 = Static70.anIntArray392;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static94.anInt2209; local5++) {
			@Pc(15) Class4_Sub1_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local5 - local1])).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			}
			if (local15.aByte123 == arg0 && local15.anInt5724 >= 0) {
				@Pc(39) int local39 = local15.method5059();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8916 & 0x1FF) != 0 || (local15.anInt8911 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8916 & 0x1FF) != 256 || (local15.anInt8911 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8916 >> 9;
					local80 = local15.anInt8911 >> 9;
					if (local15.anInt5724 > Static609.anIntArrayArray63[local75][local80]) {
						Static609.anIntArrayArray63[local75][local80] = local15.anInt5724;
						Static85.anIntArrayArray11[local75][local80] = 1;
					} else if (local15.anInt5724 == Static609.anIntArrayArray63[local75][local80]) {
						local116 = Static85.anIntArrayArray11[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8916 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8911 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8916 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8911 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt5724 > Static609.anIntArrayArray63[local158][local161]) {
								Static609.anIntArrayArray63[local158][local161] = local15.anInt5724;
								Static85.anIntArrayArray11[local158][local161] = 1;
							} else if (local15.anInt5724 == Static609.anIntArrayArray63[local158][local161]) {
								local116 = Static85.anIntArrayArray11[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}
}
