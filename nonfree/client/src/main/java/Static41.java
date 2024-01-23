import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	public static int anInt849;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[[Lclient!fn;")
	public static Class54[][] aClass54ArrayArray1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt853 = 0;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString32 = "skill: ";

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method786(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static2.method8(0, arg0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lg;)Z")
	public static boolean method790(@OriginalArg(0) Class97 arg0) {
		if (Static14.aBoolean26) {
			if (method791(arg0).anInt3271 != 0) {
				return false;
			}
			if (arg0.anInt3177 == 0) {
				return false;
			}
		}
		return arg0.aBoolean196;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lg;)Lclient!lm;")
	public static Class4_Sub22 method791(@OriginalArg(0) Class97 arg0) {
		@Pc(13) Class4_Sub22 local13 = (Class4_Sub22) Static65.aClass163_37.method4188(((long) arg0.anInt3162 << 32) + (long) arg0.anInt3146);
		return local13 == null ? arg0.aClass4_Sub22_4 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!lg;)Lclient!lg;")
	public static Class97 method792(@OriginalArg(0) Class97 arg0) {
		@Pc(4) int local4 = method791(arg0).method2574();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static148.method2340(arg0.anInt3165);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!lg;IIIIIII)V")
	public static void method793(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class97 local9 = arg0[local1];
			if (local9 != null && local9.anInt3165 == arg1 && (!local9.aBoolean192 || local9.anInt3177 == 0 || local9.aBoolean194 || method791(local9).anInt3271 != 0 || local9 == Static48.aClass97_7 || local9.anInt3123 == 1338) && (!local9.aBoolean192 || !method790(local9))) {
				@Pc(50) int local50 = local9.anInt3160 + arg6;
				@Pc(55) int local55 = local9.anInt3152 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt3177 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt3201;
					@Pc(78) int local78 = local55 + local9.anInt3190;
					if (local9.anInt3177 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static186.aClass97_17) {
					Static214.aBoolean380 = true;
					Static201.anInt4014 = local50;
					Static63.anInt1377 = local55;
				}
				if (!local9.aBoolean192 || local61 < local65 && local63 < local67) {
					if (local9.anInt3177 == 0) {
						if (!local9.aBoolean192 && method790(local9) && Static218.aClass97_19 != local9) {
							continue;
						}
						if (local9.aBoolean199 && Static79.anInt1661 >= local61 && Static178.anInt3603 >= local63 && Static79.anInt1661 < local65 && Static178.anInt3603 < local67) {
							for (@Pc(164) Class4_Sub23 local164 = (Class4_Sub23) Static56.aClass17_6.method613(); local164 != null; local164 = (Class4_Sub23) Static56.aClass17_6.method607()) {
								if (local164.aBoolean234) {
									local164.method4690();
									local164.aClass97_15.aBoolean204 = false;
								}
							}
							if (Static139.anInt2751 == 0) {
								Static186.aClass97_17 = null;
								Static48.aClass97_7 = null;
							}
							Static152.anInt3020 = 0;
						}
					}
					if (local9.aBoolean192) {
						@Pc(207) boolean local207;
						if (Static79.anInt1661 >= local61 && Static178.anInt3603 >= local63 && Static79.anInt1661 < local65 && Static178.anInt3603 < local67) {
							local207 = true;
						} else {
							local207 = false;
						}
						@Pc(212) boolean local212 = false;
						if (Static186.anInt3687 == 1 && local207) {
							local212 = true;
						}
						@Pc(221) boolean local221 = false;
						if (Static79.anInt1662 == 1 && Static72.anInt1466 >= local61 && Static8.anInt159 >= local63 && Static72.anInt1466 < local65 && Static8.anInt159 < local67) {
							local221 = true;
						}
						@Pc(243) int local243;
						@Pc(339) int local339;
						if (local9.aByteArray37 != null) {
							for (local243 = 0; local243 < local9.aByteArray37.length; local243++) {
								if (Static113.aBooleanArray18[local9.aByteArray37[local243]]) {
									if (local9.anIntArray253 == null || Static50.anInt1118 >= local9.anIntArray253[local243]) {
										@Pc(279) byte local279 = local9.aByteArray36[local243];
										if (local279 == 0 || ((local279 & 0x8) == 0 || !Static113.aBooleanArray18[86] && !Static113.aBooleanArray18[82] && !Static113.aBooleanArray18[81]) && ((local279 & 0x2) == 0 || Static113.aBooleanArray18[86]) && ((local279 & 0x1) == 0 || Static113.aBooleanArray18[82]) && ((local279 & 0x4) == 0 || Static113.aBooleanArray18[81])) {
											Static127.method2074(local243 + 1, -1, "", local9.anInt3162);
											local339 = local9.anIntArray250[local243];
											if (local9.anIntArray253 == null) {
												local9.anIntArray253 = new int[local9.aByteArray37.length];
											}
											if (local339 == 0) {
												local9.anIntArray253[local243] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray253[local243] = Static50.anInt1118 + local339;
											}
										}
									}
								} else if (local9.anIntArray253 != null) {
									local9.anIntArray253[local243] = 0;
								}
							}
						}
						if (local221) {
							Static152.method2448(Static8.anInt159 - local55, Static72.anInt1466 - local50, local9);
						}
						if (Static186.aClass97_17 != null && Static186.aClass97_17 != local9 && local207 && method791(local9).method2562()) {
							Static96.aClass97_10 = local9;
						}
						if (local9 == Static48.aClass97_7) {
							Static274.aBoolean366 = true;
							Static190.anInt3864 = local50;
							Static264.anInt5206 = local55;
						}
						if (local9.aBoolean194 || local9.anInt3123 != 0) {
							@Pc(416) Class4_Sub23 local416;
							if (local207 && Static131.anInt1447 != 0 && local9.anObjectArray3 != null) {
								local416 = new Class4_Sub23();
								local416.aBoolean234 = true;
								local416.aClass97_15 = local9;
								local416.anInt3596 = Static131.anInt1447;
								local416.anObjectArray32 = local9.anObjectArray3;
								Static56.aClass17_6.method619(local416);
							}
							if (Static186.aClass97_17 != null || Static97.aClass97_20 != null || Static137.aBoolean176 || local9.anInt3123 != 1400 && Static152.anInt3020 > 0) {
								local221 = false;
								local212 = false;
								local207 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt3123 != 0) {
								if (local9.anInt3123 == 1337) {
									Static304.aClass97_23 = local9;
									continue;
								}
								if (local9.anInt3123 == 1338) {
									if (local221) {
										Static101.anInt2014 = Static72.anInt1466 - local50;
										Static291.anInt5650 = Static8.anInt159 - local55;
									}
									continue;
								}
								if (local9.anInt3123 == 1400) {
									Static134.aClass97_12 = local9;
									if (local221) {
										if (Static113.aBooleanArray18[82] && Static191.anInt3873 > 0) {
											local243 = (int) ((double) (Static72.anInt1466 - local50 - local9.anInt3201 / 2) * 2.0D / (double) Static64.aFloat35);
											local522 = (int) ((double) (Static8.anInt159 - local55 - local9.anInt3190 / 2) * 2.0D / (double) Static64.aFloat35);
											local339 = Static208.anInt4072 + local243;
											@Pc(530) int local530 = Static104.anInt2092 + local522;
											@Pc(534) int local534 = local339 + Static175.anInt3552;
											@Pc(542) int local542 = Static158.anInt3242 + Static133.anInt2663 - local530 - 1;
											@Pc(545) Class4_Sub2_Sub18 local545 = Static27.method578();
											@Pc(551) int[] local551 = local545.method3541(local534, local542);
											if (local551 != null) {
												Static260.method4691(local551[0], local551[1], local551[2]);
												Static32.method641();
											}
											continue;
										}
										Static152.anInt3020 = 1;
										Static85.anInt1726 = Static79.anInt1661;
										Static257.anInt5060 = Static178.anInt3603;
										continue;
									}
									if (local212 && Static152.anInt3020 > 0) {
										if (Static152.anInt3020 == 1 && (Static85.anInt1726 != Static79.anInt1661 || Static257.anInt5060 != Static178.anInt3603)) {
											Static200.anInt4012 = Static208.anInt4072;
											Static254.anInt4978 = Static104.anInt2092;
											Static152.anInt3020 = 2;
										}
										if (Static152.anInt3020 == 2) {
											Static49.method975(Static200.anInt4012 + (int) ((double) (Static85.anInt1726 - Static79.anInt1661) * 2.0D / (double) Static5.aFloat4));
											Static232.method3632(Static254.anInt4978 + (int) ((double) (Static257.anInt5060 - Static178.anInt3603) * 2.0D / (double) Static5.aFloat4));
										}
										continue;
									}
									Static152.anInt3020 = 0;
									continue;
								}
								if (local9.anInt3123 == 1401) {
									if (local212) {
										Static127.method2071(Static178.anInt3603 - local55, local9.anInt3201, local9.anInt3190, Static79.anInt1661 - local50);
									}
									continue;
								}
								if (local9.anInt3123 == 1402) {
									if (!Static251.aBoolean330) {
										Static178.method2927(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean189 && local221) {
								local9.aBoolean189 = true;
								if (local9.anObjectArray30 != null) {
									local416 = new Class4_Sub23();
									local416.aBoolean234 = true;
									local416.aClass97_15 = local9;
									local416.anInt3602 = Static72.anInt1466 - local50;
									local416.anInt3596 = Static8.anInt159 - local55;
									local416.anObjectArray32 = local9.anObjectArray30;
									Static56.aClass17_6.method619(local416);
								}
							}
							if (local9.aBoolean189 && local212 && local9.anObjectArray25 != null) {
								local416 = new Class4_Sub23();
								local416.aBoolean234 = true;
								local416.aClass97_15 = local9;
								local416.anInt3602 = Static79.anInt1661 - local50;
								local416.anInt3596 = Static178.anInt3603 - local55;
								local416.anObjectArray32 = local9.anObjectArray25;
								Static56.aClass17_6.method619(local416);
							}
							if (local9.aBoolean189 && !local212) {
								local9.aBoolean189 = false;
								if (local9.anObjectArray7 != null) {
									local416 = new Class4_Sub23();
									local416.aBoolean234 = true;
									local416.aClass97_15 = local9;
									local416.anInt3602 = Static79.anInt1661 - local50;
									local416.anInt3596 = Static178.anInt3603 - local55;
									local416.anObjectArray32 = local9.anObjectArray7;
									Static92.aClass17_13.method619(local416);
								}
							}
							if (local212 && local9.anObjectArray12 != null) {
								local416 = new Class4_Sub23();
								local416.aBoolean234 = true;
								local416.aClass97_15 = local9;
								local416.anInt3602 = Static79.anInt1661 - local50;
								local416.anInt3596 = Static178.anInt3603 - local55;
								local416.anObjectArray32 = local9.anObjectArray12;
								Static56.aClass17_6.method619(local416);
							}
							if (!local9.aBoolean204 && local207) {
								local9.aBoolean204 = true;
								if (local9.anObjectArray17 != null) {
									local416 = new Class4_Sub23();
									local416.aBoolean234 = true;
									local416.aClass97_15 = local9;
									local416.anInt3602 = Static79.anInt1661 - local50;
									local416.anInt3596 = Static178.anInt3603 - local55;
									local416.anObjectArray32 = local9.anObjectArray17;
									Static56.aClass17_6.method619(local416);
								}
							}
							if (local9.aBoolean204 && local207 && local9.anObjectArray2 != null) {
								local416 = new Class4_Sub23();
								local416.aBoolean234 = true;
								local416.aClass97_15 = local9;
								local416.anInt3602 = Static79.anInt1661 - local50;
								local416.anInt3596 = Static178.anInt3603 - local55;
								local416.anObjectArray32 = local9.anObjectArray2;
								Static56.aClass17_6.method619(local416);
							}
							if (local9.aBoolean204 && !local207) {
								local9.aBoolean204 = false;
								if (local9.anObjectArray8 != null) {
									local416 = new Class4_Sub23();
									local416.aBoolean234 = true;
									local416.aClass97_15 = local9;
									local416.anInt3602 = Static79.anInt1661 - local50;
									local416.anInt3596 = Static178.anInt3603 - local55;
									local416.anObjectArray32 = local9.anObjectArray8;
									Static92.aClass17_13.method619(local416);
								}
							}
							if (local9.anObjectArray21 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray21;
								Static25.aClass17_3.method619(local416);
							}
							@Pc(997) Class4_Sub23 local997;
							if (local9.anObjectArray27 != null && Static106.anInt2115 > local9.anInt3161) {
								if (local9.anIntArray252 == null || Static106.anInt2115 - local9.anInt3161 > 32) {
									local416 = new Class4_Sub23();
									local416.aClass97_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray27;
									Static56.aClass17_6.method619(local416);
								} else {
									label570: for (local243 = local9.anInt3161; local243 < Static106.anInt2115; local243++) {
										local522 = Static103.anIntArray169[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray252.length; local339++) {
											if (local9.anIntArray252[local339] == local522) {
												local997 = new Class4_Sub23();
												local997.aClass97_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray27;
												Static56.aClass17_6.method619(local997);
												break label570;
											}
										}
									}
								}
								local9.anInt3161 = Static106.anInt2115;
							}
							if (local9.anObjectArray15 != null && Static205.anInt4050 > local9.anInt3127) {
								if (local9.anIntArray255 == null || Static205.anInt4050 - local9.anInt3127 > 32) {
									local416 = new Class4_Sub23();
									local416.aClass97_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray15;
									Static56.aClass17_6.method619(local416);
								} else {
									label546: for (local243 = local9.anInt3127; local243 < Static205.anInt4050; local243++) {
										local522 = Static133.anIntArray226[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray255.length; local339++) {
											if (local9.anIntArray255[local339] == local522) {
												local997 = new Class4_Sub23();
												local997.aClass97_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray15;
												Static56.aClass17_6.method619(local997);
												break label546;
											}
										}
									}
								}
								local9.anInt3127 = Static205.anInt4050;
							}
							if (local9.anObjectArray22 != null && Static125.anInt2512 > local9.anInt3174) {
								if (local9.anIntArray251 == null || Static125.anInt2512 - local9.anInt3174 > 32) {
									local416 = new Class4_Sub23();
									local416.aClass97_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray22;
									Static56.aClass17_6.method619(local416);
								} else {
									label522: for (local243 = local9.anInt3174; local243 < Static125.anInt2512; local243++) {
										local522 = Static52.anIntArray121[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray251.length; local339++) {
											if (local9.anIntArray251[local339] == local522) {
												local997 = new Class4_Sub23();
												local997.aClass97_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray22;
												Static56.aClass17_6.method619(local997);
												break label522;
											}
										}
									}
								}
								local9.anInt3174 = Static125.anInt2512;
							}
							if (local9.anObjectArray23 != null && Static146.anInt2878 > local9.anInt3149) {
								if (local9.anIntArray261 == null || Static146.anInt2878 - local9.anInt3149 > 32) {
									local416 = new Class4_Sub23();
									local416.aClass97_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray23;
									Static56.aClass17_6.method619(local416);
								} else {
									label498: for (local243 = local9.anInt3149; local243 < Static146.anInt2878; local243++) {
										local522 = Static305.anIntArray472[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray261.length; local339++) {
											if (local9.anIntArray261[local339] == local522) {
												local997 = new Class4_Sub23();
												local997.aClass97_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray23;
												Static56.aClass17_6.method619(local997);
												break label498;
											}
										}
									}
								}
								local9.anInt3149 = Static146.anInt2878;
							}
							if (local9.anObjectArray24 != null && Static183.anInt3665 > local9.anInt3182) {
								if (local9.anIntArray248 == null || Static183.anInt3665 - local9.anInt3182 > 32) {
									local416 = new Class4_Sub23();
									local416.aClass97_15 = local9;
									local416.anObjectArray32 = local9.anObjectArray24;
									Static56.aClass17_6.method619(local416);
								} else {
									label474: for (local243 = local9.anInt3182; local243 < Static183.anInt3665; local243++) {
										local522 = Static2.anIntArray2[local243 & 0x1F];
										for (local339 = 0; local339 < local9.anIntArray248.length; local339++) {
											if (local9.anIntArray248[local339] == local522) {
												local997 = new Class4_Sub23();
												local997.aClass97_15 = local9;
												local997.anObjectArray32 = local9.anObjectArray24;
												Static56.aClass17_6.method619(local997);
												break label474;
											}
										}
									}
								}
								local9.anInt3182 = Static183.anInt3665;
							}
							if (Static36.anInt690 > local9.anInt3157 && local9.anObjectArray19 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray19;
								Static56.aClass17_6.method619(local416);
							}
							if (Static279.anInt5479 > local9.anInt3157 && local9.anObjectArray9 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray9;
								Static56.aClass17_6.method619(local416);
							}
							if (Static216.anInt4184 > local9.anInt3157 && local9.anObjectArray18 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray18;
								Static56.aClass17_6.method619(local416);
							}
							if (Static146.anInt2879 > local9.anInt3157 && local9.anObjectArray14 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray14;
								Static56.aClass17_6.method619(local416);
							}
							if (Static30.anInt636 > local9.anInt3157 && local9.anObjectArray31 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray31;
								Static56.aClass17_6.method619(local416);
							}
							local9.anInt3157 = Static131.anInt1441;
							if (local9.anObjectArray13 != null) {
								for (local243 = 0; local243 < Static298.anInt5328; local243++) {
									@Pc(1461) Class4_Sub23 local1461 = new Class4_Sub23();
									local1461.aClass97_15 = local9;
									local1461.anInt3605 = Static93.anIntArray267[local243];
									local1461.anInt3601 = Static178.anIntArray300[local243];
									local1461.anObjectArray32 = local9.anObjectArray13;
									Static56.aClass17_6.method619(local1461);
								}
							}
							if (Static236.aBoolean293 && local9.anObjectArray20 != null) {
								local416 = new Class4_Sub23();
								local416.aClass97_15 = local9;
								local416.anObjectArray32 = local9.anObjectArray20;
								Static56.aClass17_6.method619(local416);
							}
						}
					}
					if (!local9.aBoolean192 && Static186.aClass97_17 == null && Static97.aClass97_20 == null && !Static137.aBoolean176) {
						if ((local9.anInt3172 >= 0 || local9.anInt3154 != 0) && Static79.anInt1661 >= local61 && Static178.anInt3603 >= local63 && Static79.anInt1661 < local65 && Static178.anInt3603 < local67) {
							if (local9.anInt3172 >= 0) {
								Static218.aClass97_19 = arg0[local9.anInt3172];
							} else {
								Static218.aClass97_19 = local9;
							}
						}
						if (local9.anInt3177 == 8 && Static79.anInt1661 >= local61 && Static178.anInt3603 >= local63 && Static79.anInt1661 < local65 && Static178.anInt3603 < local67) {
							Static95.aClass97_9 = local9;
						}
						if (local9.anInt3180 > local9.anInt3190) {
							Static80.method1366(local9.anInt3190, Static178.anInt3603, local9.anInt3180, local50 + local9.anInt3201, local9, local55, Static79.anInt1661);
						}
					}
					if (local9.anInt3177 == 0) {
						method793(arg0, local9.anInt3162, local61, local63, local65, local67, local50 - local9.anInt3169, local55 - local9.anInt3199);
						if (local9.aClass97Array1 != null) {
							method793(local9.aClass97Array1, local9.anInt3162, local61, local63, local65, local67, local50 - local9.anInt3169, local55 - local9.anInt3199);
						}
						@Pc(1626) Class4_Sub30 local1626 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local9.anInt3162);
						if (local1626 != null) {
							Static286.method4476(local61, local55, local63, local67, local50, local65, local1626.anInt5208);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lclient!li;")
	public static Class99 method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2694; local13++) {
			@Pc(22) Class99 local22 = local7.aClass99Array19[local13];
			if ((local22.aLong117 >> 29 & 0x3L) == 2L && local22.anInt3225 == arg1 && local22.anInt3222 == arg2) {
				Static169.method2682(local22);
				return local22;
			}
		}
		return null;
	}
}
