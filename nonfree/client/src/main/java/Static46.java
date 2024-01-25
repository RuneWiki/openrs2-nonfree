import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!iq;")
	public static Class104 aClass104_34;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	public static int anInt750 = 0;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt752 = 127;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!fh;")
	public static Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!fh;)Z")
	public static boolean method877(@OriginalArg(0) Class68 arg0) {
		if (Static334.aBoolean581) {
			if (method890(arg0).anInt6736 != 0) {
				return false;
			}
			if (arg0.anInt1871 == 0) {
				return false;
			}
		}
		return arg0.aBoolean172;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!fh;)Lclient!fh;")
	public static Class68 method879(@OriginalArg(0) Class68 arg0) {
		@Pc(4) int local4 = method890(arg0).method5644();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static8.method144(arg0.anInt1830);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method880() {
		Static135.anInt2909 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static186.anInt4092; local3++) {
			@Pc(10) Class1_Sub2_Sub3_Sub2 local10 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local3]];
			if (local10.aBoolean615 && local10.method5776() != -1) {
				@Pc(28) int local28 = (local10.method5787() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6893 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6888 - local28 >> 7;
				@Pc(49) Class1_Sub2_Sub3 local49 = Static24.method868(local35, local10.aByte77, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6896;
					if (local49 instanceof Class1_Sub2_Sub3_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6960 == 0 && local49.method5776() != -1) {
						Static79.anIntArray124[Static135.anInt2909] = local54;
						Static345.anIntArray512[Static135.anInt2909] = local54;
						Static135.anInt2909++;
						local49.anInt6960++;
					}
					Static79.anIntArray124[Static135.anInt2909] = local54;
					Static345.anIntArray512[Static135.anInt2909] = local10.anInt6896 + 2048;
					Static135.anInt2909++;
					local49.anInt6960++;
				}
			}
		}
		Static255.method4488(Static135.anInt2909 - 1, Static79.anIntArray124, Static345.anIntArray512, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
	public static int method881(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return local21 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method883(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static308.method5147(local18) : local18;
		} else if (arg1 instanceof Class119) {
			@Pc(32) Class119 local32 = (Class119) arg1;
			return local32.method3351();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ef;)Lclient!fd;")
	public static Class18_Sub3 method884(@OriginalArg(1) Class2_Sub12 arg0) {
		return new Class18_Sub3(arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3163(), arg0.method3163(), arg0.method3124());
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!fh;IIIIIIIII)V")
	public static void method886(@OriginalArg(0) Class68[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class68 local6 = arg0[local1];
			if (local6 != null && local6.anInt1830 == arg1) {
				@Pc(17) int local17 = local6.anInt1831 + arg6;
				@Pc(22) int local22 = local6.anInt1833 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt1871 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt1874;
					@Pc(45) int local45 = local22 + local6.anInt1845;
					if (local6.anInt1871 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt1871 == 0 || local6.aBoolean160 || method890(local6).anInt6736 != 0 || local6 == Static132.aClass68_20 || local6.anInt1829 == Static245.anInt5189) {
					if (!method877(local6)) {
						if (local6 == Static18.aClass68_1) {
							Static280.aBoolean499 = true;
							Static91.anInt1787 = local17;
							Static191.anInt4212 = local22;
						}
						if (local6.aBoolean166 || local28 < local32 && local30 < local34) {
							if (local6.anInt1871 == 0 && local6.aBoolean173 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class2_Sub41 local151 = (Class2_Sub41) Static245.aClass180_36.method4919(); local151 != null; local151 = (Class2_Sub41) Static245.aClass180_36.method4916()) {
									if (local151.aBoolean543) {
										local151.method5723();
										local151.aClass68_35.aBoolean162 = false;
									}
								}
								if (Static81.anInt1525 == 0) {
									Static18.aClass68_1 = null;
									Static132.aClass68_20 = null;
								}
								Static366.anInt4511 = 0;
								Static261.aBoolean457 = false;
								Static165.aBoolean328 = false;
								if (!Static258.aBoolean470) {
									Static296.method5451();
								}
							}
							@Pc(207) boolean local207;
							if (Class1_Sub2_Sub5.lb.method2470() >= local28 && Class1_Sub2_Sub5.lb.method2466() >= local30 && Class1_Sub2_Sub5.lb.method2470() < local32 && Class1_Sub2_Sub5.lb.method2466() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static258.aBoolean470 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static290.method4859(arg8 - local17, local6, arg9 - local22);
							}
							@Pc(235) boolean local235 = false;
							if (Class1_Sub2_Sub5.lb.method2462() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static17.aClass2_Sub1_1 != null && Static17.aClass2_Sub1_1.method53() == 0 && Static17.aClass2_Sub1_1.method49() >= local28 && Static17.aClass2_Sub1_1.method51() >= local30 && Static17.aClass2_Sub1_1.method49() < local32 && Static17.aClass2_Sub1_1.method51() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray16 != null) {
								for (local278 = 0; local278 < local6.aByteArray16.length; local278++) {
									if (Static166.aClass25_1.method398(local6.aByteArray16[local278])) {
										if (local6.anIntArray141 == null || Static6.anInt91 >= local6.anIntArray141[local278]) {
											@Pc(310) byte local310 = local6.aByteArray17[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static166.aClass25_1.method398(86) && !Static166.aClass25_1.method398(82) && !Static166.aClass25_1.method398(81)) && ((local310 & 0x2) == 0 || Static166.aClass25_1.method398(86)) && ((local310 & 0x1) == 0 || Static166.aClass25_1.method398(82)) && ((local310 & 0x4) == 0 || Static166.aClass25_1.method398(81))) {
												Static338.method5525("", -1, local278 + 1, local6.anInt1857);
												local374 = local6.anIntArray138[local278];
												if (local6.anIntArray141 == null) {
													local6.anIntArray141 = new int[local6.aByteArray16.length];
												}
												if (local374 == 0) {
													local6.anIntArray141[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray141[local278] = Static6.anInt91 + local374;
												}
											}
										}
									} else if (local6.anIntArray141 != null) {
										local6.anIntArray141[local278] = 0;
									}
								}
							}
							if (local245) {
								Static73.method1487(Static17.aClass2_Sub1_1.method49() - local17, Static17.aClass2_Sub1_1.method51() - local22, local6);
							}
							if (Static18.aClass68_1 != null && Static18.aClass68_1 != local6 && local207 && method890(local6).method5635()) {
								Static114.aClass68_17 = local6;
							}
							if (local6 == Static132.aClass68_20) {
								Static193.aBoolean354 = true;
								Static180.anInt4016 = local17;
								Static84.anInt1567 = local22;
							}
							if (local6.aBoolean160 || local6.anInt1829 != 0) {
								@Pc(459) Class2_Sub41 local459;
								if (local207 && Static184.anInt4075 != 0 && local6.anObjectArray5 != null) {
									local459 = new Class2_Sub41();
									local459.aBoolean543 = true;
									local459.aClass68_35 = local6;
									local459.anInt6105 = Static184.anInt4075;
									local459.anObjectArray35 = local6.anObjectArray5;
									Static245.aClass180_36.method4909(local459);
								}
								if (Static18.aClass68_1 != null || Static258.aBoolean470 || local6.anInt1829 != Static49.anInt824 && Static366.anInt4511 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt1829 != 0) {
									if (local6.anInt1829 == Static126.anInt2714 || local6.anInt1829 == Static150.anInt3451) {
										aClass68_4 = local6;
										if (Static11.aClass162_1 != null) {
											Static11.aClass162_1.method4657(local6.anInt1845, Static51.aClass37_1);
										}
										if (local6.anInt1829 == Static126.anInt2714) {
											if (!Static258.aBoolean470 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static40.method503(arg8, Static51.aClass37_1, arg9);
												for (@Pc(542) Class57_Sub3 local542 = (Class57_Sub3) Static319.aClass193_9.method5224(); local542 != null; local542 = (Class57_Sub3) Static319.aClass193_9.method5223()) {
													if (arg8 >= local542.anInt1445 && arg8 < local542.anInt1447 && arg9 >= local542.anInt1448 && arg9 < local542.anInt1446) {
														Static296.method5451();
														Static168.method3342(local542.aClass1_Sub2_Sub3_1);
													}
												}
											}
											Static209.method5788(local6, local17, local22);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt1829 == Static245.anInt5189) {
										if (local6.method1871(Static51.aClass37_1) == null || Static222.anInt6838 != 0 && Static222.anInt6838 != 3 || Static258.aBoolean470 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray142[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray147[local614]) {
											continue;
										}
										local278 -= local6.anInt1874 / 2;
										local614 -= local6.anInt1845 / 2;
										if (Static135.anInt2910 == 4) {
											local653 = (int) Static366.aFloat48 & 0x3FFF;
										} else {
											local653 = (int) Static366.aFloat48 + Static85.anInt1601 & 0x3FFF;
										}
										@Pc(665) int local665 = Class101.anIntArray234[local653];
										@Pc(669) int local669 = Class101.anIntArray235[local653];
										if (Static135.anInt2910 != 4) {
											local665 = local665 * (Static267.anInt5561 + 256) >> 8;
											local669 = local669 * (Static267.anInt5561 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static135.anInt2910 == 4) {
											local719 = (Static118.anInt2492 >> 7) + (local698 >> 2);
											local727 = (Static362.anInt6967 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() - 1) * 64;
											local719 = (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 - local736 >> 7) + (local698 >> 2);
											local727 = (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 - local736 >> 7) - (local708 >> 2);
										}
										if (Static60.aBoolean109 && (Static7.anInt142 & 0x40) != 0) {
											@Pc(769) Class68 local769 = Static50.method942(Static71.anInt1272, Static310.anInt6128);
											if (local769 == null) {
												Static295.method4928();
											} else {
												Static104.method2071(local727, 17, local719, false, Static295.aString63, " ->", Static333.anInt6459, 1L, true);
											}
											continue;
										}
										if (Static13.aClass172_1 == Static150.aClass172_3) {
											Static104.method2071(local727, 59, local719, false, Static361.aClass140_162.method4155(Static239.anInt2803), "", -1, 1L, true);
										}
										Static104.method2071(local727, 20, local719, false, Static79.aString14, "", -1, 1L, true);
										continue;
									}
									if (local6.anInt1829 == Static49.anInt824) {
										Static40.aClass68_3 = local6;
										if (local207) {
											Static261.aBoolean457 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static17.aClass2_Sub1_1.method49() - local17 - local6.anInt1874 / 2) * 2.0D / (double) Static202.aFloat50);
											local614 = (int) -((double) (Static17.aClass2_Sub1_1.method51() - local22 - local6.anInt1845 / 2) * 2.0D / (double) Static202.aFloat50);
											local374 = Static298.anInt5924 + local278 + Static202.anInt4952;
											local653 = Static105.anInt2196 + local614 + Static202.anInt4958;
											@Pc(879) Class2_Sub9_Sub17 local879 = Static360.method5742();
											if (local879 == null) {
												continue;
											}
											@Pc(884) int[] local884 = new int[3];
											local879.method4370(local884, local374, local653);
											if (local884 != null) {
												if (Static166.aClass25_1.method398(82) && Static291.anInt5264 > 0) {
													Static357.method5710(local884[2], local884[0], local884[1]);
													continue;
												}
												Static165.aBoolean328 = true;
												Static1.anInt5235 = local884[0];
												Static222.anInt6841 = local884[1];
												Static338.anInt6591 = local884[2];
											}
											Static366.anInt4511 = 1;
											Static126.aBoolean258 = false;
											Static68.anInt1184 = Class1_Sub2_Sub5.lb.method2470();
											Static214.anInt4719 = Class1_Sub2_Sub5.lb.method2466();
											continue;
										}
										if (local235 && Static366.anInt4511 > 0) {
											if (Static366.anInt4511 == 1 && (Static68.anInt1184 != Class1_Sub2_Sub5.lb.method2470() || Static214.anInt4719 != Class1_Sub2_Sub5.lb.method2466())) {
												Static74.anInt3621 = Static298.anInt5924;
												Static304.anInt6076 = Static105.anInt2196;
												Static366.anInt4511 = 2;
											}
											if (Static366.anInt4511 == 2) {
												Static126.aBoolean258 = true;
												Static71.method1445(Static74.anInt3621 + (int) ((double) (Static68.anInt1184 - Class1_Sub2_Sub5.lb.method2470()) * 2.0D / (double) Static202.aFloat49));
												Static97.method1898(Static304.anInt6076 - (int) ((double) (Static214.anInt4719 - Class1_Sub2_Sub5.lb.method2466()) * 2.0D / (double) Static202.aFloat49));
											}
											continue;
										}
										if (Static366.anInt4511 > 0 && !Static126.aBoolean258) {
											if ((Static163.anInt3758 == 1 || Static354.method5666()) && Static225.anInt4918 > 2) {
												Static227.method4203(Static68.anInt1184, 2, Static214.anInt4719);
											} else if (Static106.method2087()) {
												Static227.method4203(Static68.anInt1184, 0, Static214.anInt4719);
											}
										}
										Static366.anInt4511 = 0;
										continue;
									}
									if (local6.anInt1829 == Static171.anInt3866) {
										if (local235) {
											Static132.method2571(local6.anInt1874, Class1_Sub2_Sub5.lb.method2470() - local17, Class1_Sub2_Sub5.lb.method2466() - local22, local6.anInt1845);
										}
										continue;
									}
									if (local6.anInt1829 == Static193.anInt4256) {
										Static294.method4923(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean167 && local245) {
									local6.aBoolean167 = true;
									if (local6.anObjectArray19 != null) {
										local459 = new Class2_Sub41();
										local459.aBoolean543 = true;
										local459.aClass68_35 = local6;
										local459.anInt6102 = Static17.aClass2_Sub1_1.method49() - local17;
										local459.anInt6105 = Static17.aClass2_Sub1_1.method51() - local22;
										local459.anObjectArray35 = local6.anObjectArray19;
										Static245.aClass180_36.method4909(local459);
									}
								}
								if (local6.aBoolean167 && local235 && local6.anObjectArray6 != null) {
									local459 = new Class2_Sub41();
									local459.aBoolean543 = true;
									local459.aClass68_35 = local6;
									local459.anInt6102 = Class1_Sub2_Sub5.lb.method2470() - local17;
									local459.anInt6105 = Class1_Sub2_Sub5.lb.method2466() - local22;
									local459.anObjectArray35 = local6.anObjectArray6;
									Static245.aClass180_36.method4909(local459);
								}
								if (local6.aBoolean167 && !local235) {
									local6.aBoolean167 = false;
									if (local6.anObjectArray9 != null) {
										local459 = new Class2_Sub41();
										local459.aBoolean543 = true;
										local459.aClass68_35 = local6;
										local459.anInt6102 = Class1_Sub2_Sub5.lb.method2470() - local17;
										local459.anInt6105 = Class1_Sub2_Sub5.lb.method2466() - local22;
										local459.anObjectArray35 = local6.anObjectArray9;
										Static215.aClass180_28.method4909(local459);
									}
								}
								if (local235 && local6.anObjectArray15 != null) {
									local459 = new Class2_Sub41();
									local459.aBoolean543 = true;
									local459.aClass68_35 = local6;
									local459.anInt6102 = Class1_Sub2_Sub5.lb.method2470() - local17;
									local459.anInt6105 = Class1_Sub2_Sub5.lb.method2466() - local22;
									local459.anObjectArray35 = local6.anObjectArray15;
									Static245.aClass180_36.method4909(local459);
								}
								if (!local6.aBoolean162 && local207) {
									local6.aBoolean162 = true;
									if (local6.anObjectArray11 != null) {
										local459 = new Class2_Sub41();
										local459.aBoolean543 = true;
										local459.aClass68_35 = local6;
										local459.anInt6102 = Class1_Sub2_Sub5.lb.method2470() - local17;
										local459.anInt6105 = Class1_Sub2_Sub5.lb.method2466() - local22;
										local459.anObjectArray35 = local6.anObjectArray11;
										Static245.aClass180_36.method4909(local459);
									}
								}
								if (local6.aBoolean162 && local207 && local6.anObjectArray25 != null) {
									local459 = new Class2_Sub41();
									local459.aBoolean543 = true;
									local459.aClass68_35 = local6;
									local459.anInt6102 = Class1_Sub2_Sub5.lb.method2470() - local17;
									local459.anInt6105 = Class1_Sub2_Sub5.lb.method2466() - local22;
									local459.anObjectArray35 = local6.anObjectArray25;
									Static245.aClass180_36.method4909(local459);
								}
								if (local6.aBoolean162 && !local207) {
									local6.aBoolean162 = false;
									if (local6.anObjectArray13 != null) {
										local459 = new Class2_Sub41();
										local459.aBoolean543 = true;
										local459.aClass68_35 = local6;
										local459.anInt6102 = Class1_Sub2_Sub5.lb.method2470() - local17;
										local459.anInt6105 = Class1_Sub2_Sub5.lb.method2466() - local22;
										local459.anObjectArray35 = local6.anObjectArray13;
										Static215.aClass180_28.method4909(local459);
									}
								}
								if (local6.anObjectArray24 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray24;
									Static311.aClass180_42.method4909(local459);
								}
								@Pc(1425) Class2_Sub41 local1425;
								if (local6.anObjectArray26 != null && Static353.anInt5916 > local6.anInt1848) {
									if (local6.anIntArray139 == null || Static353.anInt5916 - local6.anInt1848 > 32) {
										local459 = new Class2_Sub41();
										local459.aClass68_35 = local6;
										local459.anObjectArray35 = local6.anObjectArray26;
										Static245.aClass180_36.method4909(local459);
									} else {
										label659: for (local278 = local6.anInt1848; local278 < Static353.anInt5916; local278++) {
											local614 = Static241.anIntArray399[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray139.length; local374++) {
												if (local6.anIntArray139[local374] == local614) {
													local1425 = new Class2_Sub41();
													local1425.aClass68_35 = local6;
													local1425.anObjectArray35 = local6.anObjectArray26;
													Static245.aClass180_36.method4909(local1425);
													break label659;
												}
											}
										}
									}
									local6.anInt1848 = Static353.anInt5916;
								}
								if (local6.anObjectArray7 != null && Static243.anInt5157 > local6.anInt1876) {
									if (local6.anIntArray144 == null || Static243.anInt5157 - local6.anInt1876 > 32) {
										local459 = new Class2_Sub41();
										local459.aClass68_35 = local6;
										local459.anObjectArray35 = local6.anObjectArray7;
										Static245.aClass180_36.method4909(local459);
									} else {
										label635: for (local278 = local6.anInt1876; local278 < Static243.anInt5157; local278++) {
											local614 = Static78.anIntArray123[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray144.length; local374++) {
												if (local6.anIntArray144[local374] == local614) {
													local1425 = new Class2_Sub41();
													local1425.aClass68_35 = local6;
													local1425.anObjectArray35 = local6.anObjectArray7;
													Static245.aClass180_36.method4909(local1425);
													break label635;
												}
											}
										}
									}
									local6.anInt1876 = Static243.anInt5157;
								}
								if (local6.anObjectArray17 != null && Static139.anInt3006 > local6.anInt1901) {
									if (local6.anIntArray140 == null || Static139.anInt3006 - local6.anInt1901 > 32) {
										local459 = new Class2_Sub41();
										local459.aClass68_35 = local6;
										local459.anObjectArray35 = local6.anObjectArray17;
										Static245.aClass180_36.method4909(local459);
									} else {
										label611: for (local278 = local6.anInt1901; local278 < Static139.anInt3006; local278++) {
											local614 = Static139.anIntArray243[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray140.length; local374++) {
												if (local6.anIntArray140[local374] == local614) {
													local1425 = new Class2_Sub41();
													local1425.aClass68_35 = local6;
													local1425.anObjectArray35 = local6.anObjectArray17;
													Static245.aClass180_36.method4909(local1425);
													break label611;
												}
											}
										}
									}
									local6.anInt1901 = Static139.anInt3006;
								}
								if (local6.anObjectArray29 != null && Static10.anInt184 > local6.anInt1846) {
									if (local6.anIntArray146 == null || Static10.anInt184 - local6.anInt1846 > 32) {
										local459 = new Class2_Sub41();
										local459.aClass68_35 = local6;
										local459.anObjectArray35 = local6.anObjectArray29;
										Static245.aClass180_36.method4909(local459);
									} else {
										label587: for (local278 = local6.anInt1846; local278 < Static10.anInt184; local278++) {
											local614 = Static208.anIntArray339[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray146.length; local374++) {
												if (local6.anIntArray146[local374] == local614) {
													local1425 = new Class2_Sub41();
													local1425.aClass68_35 = local6;
													local1425.anObjectArray35 = local6.anObjectArray29;
													Static245.aClass180_36.method4909(local1425);
													break label587;
												}
											}
										}
									}
									local6.anInt1846 = Static10.anInt184;
								}
								if (local6.anObjectArray4 != null && Static75.anInt1413 > local6.anInt1847) {
									if (local6.anIntArray145 == null || Static75.anInt1413 - local6.anInt1847 > 32) {
										local459 = new Class2_Sub41();
										local459.aClass68_35 = local6;
										local459.anObjectArray35 = local6.anObjectArray4;
										Static245.aClass180_36.method4909(local459);
									} else {
										label563: for (local278 = local6.anInt1847; local278 < Static75.anInt1413; local278++) {
											local614 = Static337.anIntArray502[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray145.length; local374++) {
												if (local6.anIntArray145[local374] == local614) {
													local1425 = new Class2_Sub41();
													local1425.aClass68_35 = local6;
													local1425.anObjectArray35 = local6.anObjectArray4;
													Static245.aClass180_36.method4909(local1425);
													break label563;
												}
											}
										}
									}
									local6.anInt1847 = Static75.anInt1413;
								}
								if (Static242.anInt5663 > local6.anInt1837 && local6.anObjectArray3 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray3;
									Static245.aClass180_36.method4909(local459);
								}
								if (Static193.anInt4255 > local6.anInt1837 && local6.anObjectArray30 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray30;
									Static245.aClass180_36.method4909(local459);
								}
								if (Static218.anInt4844 > local6.anInt1837 && local6.anObjectArray23 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray23;
									Static245.aClass180_36.method4909(local459);
								}
								if (Static214.anInt4721 > local6.anInt1837 && local6.anObjectArray1 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray1;
									Static245.aClass180_36.method4909(local459);
								}
								if (Static196.anInt4296 > local6.anInt1837 && local6.anObjectArray28 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray28;
									Static245.aClass180_36.method4909(local459);
								}
								local6.anInt1837 = Static125.anInt2664;
								if (local6.anObjectArray27 != null) {
									for (local278 = 0; local278 < Static304.anInt6075; local278++) {
										@Pc(1893) Class2_Sub41 local1893 = new Class2_Sub41();
										local1893.aClass68_35 = local6;
										local1893.anInt6108 = Static255.aClass50Array1[local278].method1162();
										local1893.anInt6107 = Static255.aClass50Array1[local278].method1165();
										local1893.anObjectArray35 = local6.anObjectArray27;
										Static245.aClass180_36.method4909(local1893);
									}
								}
								if (Static211.aBoolean560 && local6.anObjectArray20 != null) {
									local459 = new Class2_Sub41();
									local459.aClass68_35 = local6;
									local459.anObjectArray35 = local6.anObjectArray20;
									Static245.aClass180_36.method4909(local459);
								}
							}
							if (local6.anInt1871 == 5 && local6.anInt1893 != -1) {
								local6.method1869().method4657(local6.anInt1845, Static51.aClass37_1);
							}
							Static97.method1895(local6);
							if (local6.anInt1871 == 0) {
								method886(arg0, local6.anInt1857, local28, local30, local32, local34, local17 - local6.anInt1854, local22 - local6.anInt1872, arg8, arg9);
								if (local6.aClass68Array1 != null) {
									method886(local6.aClass68Array1, local6.anInt1857, local28, local30, local32, local34, local17 - local6.anInt1854, local22 - local6.anInt1872, arg8, arg9);
								}
								@Pc(2013) Class2_Sub40 local2013 = (Class2_Sub40) Static303.aClass41_32.method902((long) local6.anInt1857);
								if (local2013 != null) {
									if (Static13.aClass172_1 == Static30.aClass172_2 && local2013.anInt6090 == 0 && !Static258.aBoolean470 && local207 && !Static334.aBoolean581) {
										Static296.method5451();
									}
									Static301.method5063(local17, local2013.anInt6092, arg8, local32, local34, arg9, local30, local28, local22);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static97.method1895(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method888() {
		for (@Pc(1) int local1 = 0; local1 < Static66.anInt1177; local1++) {
			@Pc(6) int[] local6 = Static200.anIntArrayArray39[local1];
			for (@Pc(8) int local8 = 0; local8 < Static12.anInt213; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!fh;)Lclient!vo;")
	public static Class2_Sub43 method890(@OriginalArg(0) Class68 arg0) {
		@Pc(13) Class2_Sub43 local13 = (Class2_Sub43) Static135.aClass41_15.method902(((long) arg0.anInt1857 << 32) + (long) arg0.anInt1851);
		return local13 == null ? arg0.aClass2_Sub43_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method891(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static9.anInt173;
		@Pc(3) int[] local3 = Static195.anIntArray322;
		@Pc(11) int local11 = Static286.aBoolean511 ? local1 : local1 + Static186.anInt4092;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub2_Sub3 local23;
			if (local13 < local1) {
				local23 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local13 - local1]];
			}
			if (local23.aByte77 == arg0) {
				local23.anInt6960 = 0;
				if (local23.anInt6947 < 0) {
					local23.aBoolean615 = false;
				} else {
					@Pc(50) int local50 = local23.method5787();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6893 & 0x7F) != 0 || (local23.anInt6888 & 0x7F) != 0) {
							local23.aBoolean615 = false;
							continue;
						}
					} else if ((local23.anInt6893 & 0x7F) != 64 || (local23.anInt6888 & 0x7F) != 64) {
						local23.aBoolean615 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6893 >> 7;
						local97 = local23.anInt6888 >> 7;
						if (local23.anInt6947 != Static200.anIntArrayArray39[local92][local97]) {
							local23.aBoolean615 = true;
							continue;
						}
						if (Static153.anIntArrayArray32[local92][local97] > 1) {
							local122 = Static153.anIntArrayArray32[local92][local97]--;
							local23.aBoolean615 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6893 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6888 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6893 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6888 + local92 >> 7;
						if (!Static86.method1717(local158, local97, local165, local23.anInt6947, local151)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6947 == Static200.anIntArrayArray39[local176][local179]) {
										local122 = Static153.anIntArrayArray32[local176][local179]--;
									}
								}
							}
							local23.aBoolean615 = true;
							continue;
						}
					}
					if (local23 instanceof Class1_Sub2_Sub3_Sub1 && local23.aClass2_Sub25_3 != null && Static6.anInt91 >= local23.aClass2_Sub25_3.anInt4099 && Static6.anInt91 < local23.aClass2_Sub25_3.anInt4103) {
						((Class1_Sub2_Sub3_Sub1) local23).aBoolean306 = false;
					}
					local23.aBoolean615 = false;
					local23.anInt6886 = Static97.method1899(local23.aByte77, local23.anInt6888, local23.anInt6893);
					Static342.method5581(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method892() {
		@Pc(1) int local1 = Static9.anInt173;
		@Pc(3) int[] local3 = Static195.anIntArray322;
		@Pc(18) boolean local18 = Static360.anInt6856 == 1 && local1 > 200 || Static360.anInt6856 == 0 && local1 > 50;
		@Pc(73) int local73;
		for (@Pc(20) int local20 = 0; local20 < local1; local20++) {
			@Pc(27) Class1_Sub2_Sub3_Sub1 local27 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local3[local20]];
			if (local27.method2974()) {
				local27.method5767();
				if (local27.aShort89 >= 0 && local27.aShort90 >= 0 && local27.aShort88 < Static66.anInt1177 && local27.aShort87 < Static12.anInt213) {
					local27.aBoolean306 = local27.aBoolean613 ? local18 : false;
					if (local27 == Static177.aClass1_Sub2_Sub3_Sub1_1) {
						local27.anInt6947 = Integer.MAX_VALUE;
					} else {
						local73 = 0;
						if (!local27.aBoolean615) {
							local73++;
						}
						if (local27.anInt6935 > Static6.anInt91) {
							local73 += 2;
						}
						local73 += 5 - local27.method5787() << 2;
						if (Static191.anInt4211 == 0) {
							local73 += 32;
						} else {
							local73 += 128;
						}
						local73 += 256;
						local27.anInt6947 = local73 + 1;
					}
				} else {
					local27.anInt6947 = -1;
				}
			} else {
				local27.anInt6947 = -1;
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static186.anInt4092; local109++) {
			@Pc(116) Class1_Sub2_Sub3_Sub2 local116 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local109]];
			if (local116.method5797() && local116.aClass139_1.method4119()) {
				local116.method5767();
				if (local116.aShort89 >= 0 && local116.aShort90 >= 0 && local116.aShort88 < Static66.anInt1177 && local116.aShort87 < Static12.anInt213) {
					@Pc(152) int local152 = 0;
					if (!local116.aBoolean615) {
						local152++;
					}
					if (local116.anInt6935 > Static6.anInt91) {
						local152 += 2;
					}
					local152 += 5 - local116.method5787() << 2;
					if (Static191.anInt4211 == 0) {
						if (local116.aClass139_1.aBoolean418) {
							local152 += 64;
						} else {
							local152 += 128;
						}
					} else if (Static191.anInt4211 == 1) {
						if (local116.aClass139_1.aBoolean418) {
							local152 += 32;
						} else {
							local152 += 64;
						}
					}
					if (local116.aClass139_1.aBoolean420) {
						local152 += 512;
					} else if (!local116.aClass139_1.aBoolean419) {
						local152 += 256;
					}
					local116.anInt6947 = local152 + 1;
				} else {
					local116.anInt6947 = -1;
				}
			} else {
				local116.anInt6947 = -1;
			}
		}
		for (local73 = 0; local73 < Static223.aClass52Array1.length; local73++) {
			@Pc(218) Class52 local218 = Static223.aClass52Array1[local73];
			if (local218 != null) {
				if (local218.anInt1018 == 1) {
					@Pc(229) Class1_Sub2_Sub3_Sub2 local229 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local218.anInt1012];
					if (local229 != null && local229.anInt6947 >= 0) {
						local229.anInt6947 += 1024;
					}
				} else if (local218.anInt1018 == 10) {
					@Pc(250) Class1_Sub2_Sub3_Sub1 local250 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local218.anInt1012];
					if (local250 != null && local250.anInt6947 >= 0) {
						local250.anInt6947 += 1024;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method894() {
		@Pc(1) int local1 = Static9.anInt173;
		@Pc(3) int[] local3 = Static195.anIntArray322;
		@Pc(11) int local11 = Static286.aBoolean511 ? local1 : local1 + Static186.anInt4092;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub2_Sub3 local23;
			if (local13 < local1) {
				local23 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local13 - local1]];
			}
			if (local23.anInt6947 >= 0) {
				@Pc(39) int local39 = local23.method5787();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6893 & 0x7F) == 0 && (local23.anInt6888 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6893 & 0x7F) == 64 && (local23.anInt6888 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class1_Sub2_Sub3_Sub1 && local23.aClass2_Sub25_3 != null && Static6.anInt91 >= local23.aClass2_Sub25_3.anInt4099 && Static6.anInt91 < local23.aClass2_Sub25_3.anInt4103) {
					((Class1_Sub2_Sub3_Sub1) local23).aBoolean306 = false;
				}
				local23.anInt6886 = Static97.method1899(local23.aByte77, local23.anInt6888, local23.anInt6893);
				Static342.method5581(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method895(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static9.anInt173;
		@Pc(3) int[] local3 = Static195.anIntArray322;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static186.anInt4092; local5++) {
			@Pc(15) Class1_Sub2_Sub3 local15;
			if (local5 < local1) {
				local15 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local5 - local1]];
			}
			if (local15.aByte77 == arg0 && local15.anInt6947 >= 0) {
				@Pc(35) int local35 = local15.method5787();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6893 & 0x7F) != 0 || (local15.anInt6888 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6893 & 0x7F) != 64 || (local15.anInt6888 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6893 >> 7;
					local76 = local15.anInt6888 >> 7;
					if (local15.anInt6947 > Static200.anIntArrayArray39[local71][local76]) {
						Static200.anIntArrayArray39[local71][local76] = local15.anInt6947;
						Static153.anIntArrayArray32[local71][local76] = 1;
					} else if (local15.anInt6947 == Static200.anIntArrayArray39[local71][local76]) {
						local112 = Static153.anIntArrayArray32[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6893 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6888 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6893 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6888 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6947 > Static200.anIntArrayArray39[local154][local157]) {
								Static200.anIntArrayArray39[local154][local157] = local15.anInt6947;
								Static153.anIntArrayArray32[local154][local157] = 1;
							} else if (local15.anInt6947 == Static200.anIntArrayArray39[local154][local157]) {
								local112 = Static153.anIntArrayArray32[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}
}
