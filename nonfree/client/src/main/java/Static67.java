import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_29 = new Class239(83, -2);

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	public static int anInt1355 = -50;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1237() {
		@Pc(1) int local1 = Static16.anInt362;
		@Pc(3) int[] local3 = Static325.anIntArray473;
		@Pc(20) boolean local20 = Static281.aClass2_Sub19_Sub1_1.anInt2191 == 1 && local1 > 200 || Static281.aClass2_Sub19_Sub1_1.anInt2191 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class1_Sub1_Sub2_Sub1 local29 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local3[local22]];
			if (local29.method2947()) {
				local29.method6430();
				if (local29.aShort127 >= 0 && local29.aShort128 >= 0 && local29.aShort125 < Static363.anInt1158 && local29.aShort126 < Static511.anInt8889) {
					local29.aBoolean258 = local29.aBoolean385 ? local20 : false;
					if (local29 == Static266.aClass1_Sub1_Sub2_Sub1_1) {
						local29.anInt5088 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean384) {
							local75++;
						}
						if (local29.anInt5058 > Static115.anInt2326) {
							local75 += 2;
						}
						local75 += 5 - local29.method4394() << 2;
						if (local29.aBoolean259) {
							local75 += 512;
						} else {
							if (Static498.anInt8746 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt5088 = local75 + 1;
					}
				} else {
					local29.anInt5088 = -1;
				}
			} else {
				local29.anInt5088 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static520.anInt1936; local116++) {
			@Pc(127) Class1_Sub1_Sub2_Sub2 local127 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local116])).aClass1_Sub1_Sub2_Sub2_1;
			if (local127.method4399() && local127.aClass12_1.method454(Static84.aClass302_1)) {
				local127.method6430();
				if (local127.aShort127 >= 0 && local127.aShort128 >= 0 && local127.aShort125 < Static363.anInt1158 && local127.aShort126 < Static511.anInt8889) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean384) {
						local164++;
					}
					if (local127.anInt5058 > Static115.anInt2326) {
						local164 += 2;
					}
					local164 += 5 - local127.method4394() << 2;
					if (Static498.anInt8746 == 0) {
						if (local127.aClass12_1.aBoolean21) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static498.anInt8746 == 1) {
						if (local127.aClass12_1.aBoolean21) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass12_1.aBoolean23) {
						local164 += 1024;
					} else if (!local127.aClass12_1.aBoolean27) {
						local164 += 256;
					}
					local127.anInt5088 = local164 + 1;
				} else {
					local127.anInt5088 = -1;
				}
			} else {
				local127.anInt5088 = -1;
			}
		}
		for (local75 = 0; local75 < Static286.aClass132Array1.length; local75++) {
			@Pc(230) Class132 local230 = Static286.aClass132Array1[local75];
			if (local230 != null) {
				if (local230.anInt3729 == 1) {
					@Pc(244) Class2_Sub11 local244 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local230.anInt3734);
					if (local244 != null) {
						@Pc(249) Class1_Sub1_Sub2_Sub2 local249 = local244.aClass1_Sub1_Sub2_Sub2_1;
						if (local249.anInt5088 >= 0) {
							local249.anInt5088 += 2048;
						}
					}
				} else if (local230.anInt3729 == 10) {
					@Pc(268) Class1_Sub1_Sub2_Sub1 local268 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local230.anInt3734];
					if (local268 != null && local268 != Static266.aClass1_Sub1_Sub2_Sub1_1 && local268.anInt5088 >= 0) {
						local268.anInt5088 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZI)V")
	public static void method1238(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static456.anInt8316 = arg1;
		Static86.anInt1765 = 3;
		Static528.method7626(Static530.aClass163_6.anInt4593, Static530.aClass163_6.aString104);
		if (arg0) {
			Static430.method6614(false, "", "");
		} else {
			Static83.method1623();
			Static430.method6614(false, Static47.aString24, Static316.aString128);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[BIBII)Z")
	public static boolean method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg1 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1240(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static16.anInt362;
		@Pc(3) int[] local3 = Static325.anIntArray473;
		@Pc(11) int local11 = Static96.aBoolean134 ? local1 : local1 + Static520.anInt1936;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local13 - local1])).aClass1_Sub1_Sub2_Sub2_1;
			}
			if (local23.aByte90 == arg0) {
				local23.anInt5059 = 0;
				if (local23.anInt5088 < 0) {
					local23.aBoolean384 = false;
				} else {
					@Pc(54) int local54 = local23.method4394();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7660 & 0x7F) != 0 || (local23.anInt7659 & 0x7F) != 0) {
							local23.aBoolean384 = false;
							continue;
						}
					} else if ((local23.anInt7660 & 0x7F) != 64 || (local23.anInt7659 & 0x7F) != 64) {
						local23.aBoolean384 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7660 >> 7;
						local101 = local23.anInt7659 >> 7;
						if (local23.anInt5088 != Static200.anIntArrayArray44[local96][local101]) {
							local23.aBoolean384 = true;
							continue;
						}
						if (Static97.anIntArrayArray23[local96][local101] > 1) {
							local126 = Static97.anIntArrayArray23[local96][local101]--;
							local23.aBoolean384 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7660 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7659 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7660 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7659 + local96 >> 7;
						if (!Static30.method632(local23.anInt5088, local101, local162, local155, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt5088 == Static200.anIntArrayArray44[local180][local183]) {
										local126 = Static97.anIntArrayArray23[local180][local183]--;
									}
								}
							}
							local23.aBoolean384 = true;
							continue;
						}
					}
					if (local23 instanceof Class1_Sub1_Sub2_Sub1 && local23.aClass2_Sub47_3 != null && Static115.anInt2326 >= local23.aClass2_Sub47_3.anInt9135 && Static115.anInt2326 < local23.aClass2_Sub47_3.anInt9145) {
						((Class1_Sub1_Sub2_Sub1) local23).aBoolean258 = false;
					}
					local23.aBoolean384 = false;
					local23.anInt7657 = Static200.method3233(local23.aByte90, local23.anInt7660, local23.anInt7659);
					Static58.method1076(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wca;)Lclient!wca;")
	public static Class310 method1241(@OriginalArg(0) Class310 arg0) {
		@Pc(4) int local4 = method1257(arg0).method6270();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static111.method2143(arg0.anInt9167);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1246(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static16.anInt362;
		@Pc(3) int[] local3 = Static325.anIntArray473;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static520.anInt1936; local5++) {
			@Pc(15) Class1_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local5 - local1])).aClass1_Sub1_Sub2_Sub2_1;
			}
			if (local15.aByte90 == arg0 && local15.anInt5088 >= 0) {
				@Pc(39) int local39 = local15.method4394();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7660 & 0x7F) != 0 || (local15.anInt7659 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7660 & 0x7F) != 64 || (local15.anInt7659 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7660 >> 7;
					local80 = local15.anInt7659 >> 7;
					if (local15.anInt5088 > Static200.anIntArrayArray44[local75][local80]) {
						Static200.anIntArrayArray44[local75][local80] = local15.anInt5088;
						Static97.anIntArrayArray23[local75][local80] = 1;
					} else if (local15.anInt5088 == Static200.anIntArrayArray44[local75][local80]) {
						local116 = Static97.anIntArrayArray23[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7660 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7659 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7660 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7659 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt5088 > Static200.anIntArrayArray44[local158][local161]) {
								Static200.anIntArrayArray44[local158][local161] = local15.anInt5088;
								Static97.anIntArrayArray23[local158][local161] = 1;
							} else if (local15.anInt5088 == Static200.anIntArrayArray44[local158][local161]) {
								local116 = Static97.anIntArrayArray23[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1247() {
		for (@Pc(1) int local1 = 0; local1 < Static363.anInt1158; local1++) {
			@Pc(6) int[] local6 = Static200.anIntArrayArray44[local1];
			for (@Pc(8) int local8 = 0; local8 < Static511.anInt8889; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wca;IIIIIIIII)V")
	public static void method1249(@OriginalArg(0) Class310[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class310 local6 = arg0[local1];
			if (local6 != null && local6.anInt9167 == arg1) {
				@Pc(17) int local17 = local6.anInt9184 + arg6;
				@Pc(22) int local22 = local6.anInt9175 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt9220 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt9163;
					@Pc(45) int local45 = local22 + local6.anInt9198;
					if (local6.anInt9220 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9220 == 0 || local6.aBoolean664 || method1257(local6).anInt7446 != 0 || local6 == Static325.aClass310_15 || local6.anInt9234 == Static403.anInt7608) {
					if (!method1256(local6)) {
						if (local6 == Static72.aClass310_4 && Static47.method854(Static72.aClass310_4) != null) {
							Static499.aBoolean632 = true;
							Static135.anInt2546 = local17;
							Static212.anInt3812 = local22;
						}
						if (local6.aBoolean658 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean654 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class2_Sub28 local152 = (Class2_Sub28) Static17.aClass249_4.method6527(); local152 != null; local152 = (Class2_Sub28) Static17.aClass249_4.method6525()) {
									if (local152.aBoolean297) {
										local152.method7802();
										local152.aClass310_8.aBoolean663 = false;
									}
								}
								if (Static13.anInt304 == 0) {
									Static72.aClass310_4 = null;
									Static325.aClass310_15 = null;
								}
								Static358.anInt6807 = 0;
								Static414.aBoolean621 = false;
								Static158.aBoolean236 = false;
								if (!Static452.aBoolean600) {
									Static95.method1762();
								}
							}
							@Pc(208) boolean local208;
							if (Static61.aClass214_1.method7241() >= local28 && Static61.aClass214_1.method7240() >= local30 && Static61.aClass214_1.method7241() < local32 && Static61.aClass214_1.method7240() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static21.aBoolean31 && local208) {
								if (local6.anInt9205 >= 0) {
									Static94.anInt1853 = local6.anInt9205;
								} else if (local6.aBoolean654) {
									Static94.anInt1853 = -1;
								}
							}
							if (!Static452.aBoolean600 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static107.method2064(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(252) boolean local252 = false;
							if (Static61.aClass214_1.method7244() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class2_Sub26 local267 = (Class2_Sub26) Static431.aClass249_61.method6527();
							if (local267 != null && local267.method6655() == 0 && local267.method6659() >= local28 && local267.method6660() >= local30 && local267.method6659() < local32 && local267.method6660() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray120 != null) {
								for (local300 = 0; local300 < local6.aByteArray120.length; local300++) {
									if (Static311.aClass189_1.method4710(local6.aByteArray120[local300])) {
										if (local6.anIntArray703 == null || Static115.anInt2326 >= local6.anIntArray703[local300]) {
											@Pc(332) byte local332 = local6.aByteArray121[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static311.aClass189_1.method4710(86) && !Static311.aClass189_1.method4710(82) && !Static311.aClass189_1.method4710(81)) && ((local332 & 0x2) == 0 || Static311.aClass189_1.method4710(86)) && ((local332 & 0x1) == 0 || Static311.aClass189_1.method4710(82)) && ((local332 & 0x4) == 0 || Static311.aClass189_1.method4710(81))) {
												if (local300 < 10) {
													Static72.method1459(local300 + 1, -1, local6.anInt9226, "");
												} else if (local300 == 10) {
													Static465.method7011();
													@Pc(403) Class2_Sub39 local403 = method1257(local6);
													Static260.method4053(local403.anInt7452, local6, local403.method6272());
													Static131.aString66 = Static331.method5295(local6);
													if (Static131.aString66 == null) {
														Static131.aString66 = "Null";
													}
													Static125.aString61 = local6.aString203 + "<col=ffffff>";
												}
												local434 = local6.anIntArray712[local300];
												if (local6.anIntArray703 == null) {
													local6.anIntArray703 = new int[local6.aByteArray120.length];
												}
												if (local434 == 0) {
													local6.anIntArray703[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray703[local300] = Static115.anInt2326 + local434;
												}
											}
										}
									} else if (local6.anIntArray703 != null) {
										local6.anIntArray703[local300] = 0;
									}
								}
							}
							if (local262) {
								Static498.method7333(local267.method6659() - local17, local6, local267.method6660() - local22);
							}
							if (Static72.aClass310_4 != null && Static72.aClass310_4 != local6 && local208 && method1257(local6).method6276()) {
								Static38.aClass310_1 = local6;
							}
							if (local6 == Static325.aClass310_15) {
								Static161.aBoolean238 = true;
								Static327.anInt6051 = local17;
								Static540.anInt9345 = local22;
							}
							if (local6.aBoolean664 || local6.anInt9234 != 0) {
								@Pc(519) Class2_Sub28 local519;
								if (local208 && Static101.anInt8474 != 0 && local6.anObjectArray16 != null) {
									local519 = new Class2_Sub28();
									local519.aBoolean297 = true;
									local519.aClass310_8 = local6;
									local519.anInt3744 = Static101.anInt8474;
									local519.anObjectArray2 = local6.anObjectArray16;
									Static17.aClass249_4.method6523(local519);
								}
								if (Static72.aClass310_4 != null || Static452.aBoolean600 || local6.anInt9234 != Static23.anInt475 && Static358.anInt6807 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt9234 != 0) {
									if (local6.anInt9234 == Static249.anInt4562 || local6.anInt9234 == Static231.anInt4165) {
										Static65.aClass310_3 = local6;
										if (Static26.aClass191_1 != null) {
											Static26.aClass191_1.method4741(local6.anInt9198, Static103.aClass39_3);
										}
										if (local6.anInt9234 == Static249.anInt4562) {
											if (!Static452.aBoolean600 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static118.method2284(Static103.aClass39_3, arg9, arg8);
												for (@Pc(602) Class6_Sub2 local602 = (Class6_Sub2) Static331.aClass107_5.method2832(); local602 != null; local602 = (Class6_Sub2) Static331.aClass107_5.method2835()) {
													if (arg8 >= local602.anInt484 && arg8 < local602.anInt480 && arg9 >= local602.anInt481 && arg9 < local602.anInt482) {
														Static95.method1762();
														Static139.method2472(local602.aClass1_Sub1_Sub2_1);
													}
												}
											}
											Static145.method2533(local6, local17, local22);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt9234 == Static403.anInt7608) {
										if (local6.method7649(Static103.aClass39_3) == null || Static68.anInt1451 != 0 && Static68.anInt1451 != 3 || Static452.aBoolean600 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray705[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray704[local674]) {
											continue;
										}
										local300 -= local6.anInt9163 / 2;
										local674 -= local6.anInt9198 / 2;
										if (Static427.anInt7875 == 4) {
											local713 = (int) Static161.aFloat56 & 0x3FFF;
										} else {
											local713 = (int) Static161.aFloat56 + Static87.anInt1767 & 0x3FFF;
										}
										@Pc(725) int local725 = Class125.anIntArray381[local713];
										@Pc(729) int local729 = Class125.anIntArray382[local713];
										if (Static427.anInt7875 != 4) {
											local725 = local725 * (Static3.anInt111 + 256) >> 8;
											local729 = local729 * (Static3.anInt111 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 15;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 15;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static427.anInt7875 == 4) {
											local779 = (Static4.anInt115 >> 7) + (local758 >> 2);
											local787 = (Static365.anInt6883 >> 7) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() - 1) * 64;
											local779 = (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 - local796 >> 7) + (local758 >> 2);
											local787 = (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 - local796 >> 7) - (local768 >> 2);
										}
										if (Static21.aBoolean31 && (Static176.anInt3294 & 0x40) != 0) {
											@Pc(829) Class310 local829 = Static519.method7538(Static116.anInt2332, Static55.anInt970);
											if (local829 == null) {
												Static465.method7011();
											} else {
												Static111.method2154(1L, local6.anInt9224, 9, local787, true, Static131.aString66, local779, " ->", Static472.anInt8248, false);
											}
											continue;
										}
										if (Static185.aClass212_1 == Static533.aClass212_4) {
											Static111.method2154(1L, -1, 23, local787, true, Static141.aClass202_255.method5139(Static172.anInt6352), local779, "", -1, false);
										}
										Static111.method2154(1L, -1, 19, local787, true, Static62.aString37, local779, "", Static322.anInt6010, false);
										continue;
									}
									if (local6.anInt9234 == Static23.anInt475) {
										Static292.aClass310_13 = local6;
										if (local208) {
											Static414.aBoolean621 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method6659() - local17 - local6.anInt9163 / 2) * 2.0D / (double) Static201.aFloat5);
											local674 = (int) -((double) (local267.method6660() - local22 - local6.anInt9198 / 2) * 2.0D / (double) Static201.aFloat5);
											local434 = Static202.anInt3644 + local300 + Static201.anInt205;
											local713 = Static140.anInt2619 + local674 + Static201.anInt198;
											@Pc(943) Class2_Sub13_Sub16 local943 = Static176.method2959();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method7028(local713, local948, local434);
											if (local948 != null) {
												if (Static311.aClass189_1.method4710(82) && Static475.anInt8486 > 0) {
													Static161.method2731(local948[1], local948[0], local948[2]);
													continue;
												}
												Static158.aBoolean236 = true;
												Static9.anInt223 = local948[0];
												Static419.anInt7799 = local948[1];
												Static283.anInt5239 = local948[2];
											}
											Static358.anInt6807 = 1;
											Static207.aBoolean296 = false;
											Static203.anInt3701 = Static61.aClass214_1.method7241();
											Static376.anInt6978 = Static61.aClass214_1.method7240();
											continue;
										}
										if (local252 && Static358.anInt6807 > 0) {
											if (Static358.anInt6807 == 1 && (Static203.anInt3701 != Static61.aClass214_1.method7241() || Static376.anInt6978 != Static61.aClass214_1.method7240())) {
												Static439.anInt8020 = Static202.anInt3644;
												Static335.anInt6244 = Static140.anInt2619;
												Static358.anInt6807 = 2;
											}
											if (Static358.anInt6807 == 2) {
												Static207.aBoolean296 = true;
												Static64.method1162(Static439.anInt8020 + (int) ((double) (Static203.anInt3701 - Static61.aClass214_1.method7241()) * 2.0D / (double) Static201.aFloat6));
												Static411.method6442(Static335.anInt6244 - (int) ((double) (Static376.anInt6978 - Static61.aClass214_1.method7240()) * 2.0D / (double) Static201.aFloat6));
											}
											continue;
										}
										if (Static358.anInt6807 > 0 && !Static207.aBoolean296) {
											if ((Static539.anInt9337 == 1 || Static388.method6241()) && Static323.anInt6016 > 2) {
												Static42.method814(Static376.anInt6978, Static203.anInt3701);
											} else if (Static42.method809()) {
												Static42.method814(Static376.anInt6978, Static203.anInt3701);
											}
										}
										Static358.anInt6807 = 0;
										continue;
									}
									if (local6.anInt9234 == Static199.anInt3598) {
										if (local252) {
											Static8.method375(Static61.aClass214_1.method7240() - local22, local6.anInt9163, Static61.aClass214_1.method7241() - local17, local6.anInt9198);
										}
										continue;
									}
									if (local6.anInt9234 == Static436.anInt7965) {
										Static485.method7209(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean659 && local262) {
									local6.aBoolean659 = true;
									if (local6.anObjectArray7 != null) {
										local519 = new Class2_Sub28();
										local519.aBoolean297 = true;
										local519.aClass310_8 = local6;
										local519.anInt3743 = local267.method6659() - local17;
										local519.anInt3744 = local267.method6660() - local22;
										local519.anObjectArray2 = local6.anObjectArray7;
										Static17.aClass249_4.method6523(local519);
									}
								}
								if (local6.aBoolean659 && local252 && local6.lb != null) {
									local519 = new Class2_Sub28();
									local519.aBoolean297 = true;
									local519.aClass310_8 = local6;
									local519.anInt3743 = Static61.aClass214_1.method7241() - local17;
									local519.anInt3744 = Static61.aClass214_1.method7240() - local22;
									local519.anObjectArray2 = local6.lb;
									Static17.aClass249_4.method6523(local519);
								}
								if (local6.aBoolean659 && !local252) {
									local6.aBoolean659 = false;
									if (local6.anObjectArray10 != null) {
										local519 = new Class2_Sub28();
										local519.aBoolean297 = true;
										local519.aClass310_8 = local6;
										local519.anInt3743 = Static61.aClass214_1.method7241() - local17;
										local519.anInt3744 = Static61.aClass214_1.method7240() - local22;
										local519.anObjectArray2 = local6.anObjectArray10;
										Static96.aClass249_9.method6523(local519);
									}
								}
								if (local252 && local6.anObjectArray20 != null) {
									local519 = new Class2_Sub28();
									local519.aBoolean297 = true;
									local519.aClass310_8 = local6;
									local519.anInt3743 = Static61.aClass214_1.method7241() - local17;
									local519.anInt3744 = Static61.aClass214_1.method7240() - local22;
									local519.anObjectArray2 = local6.anObjectArray20;
									Static17.aClass249_4.method6523(local519);
								}
								if (!local6.aBoolean663 && local208) {
									local6.aBoolean663 = true;
									if (local6.anObjectArray33 != null) {
										local519 = new Class2_Sub28();
										local519.aBoolean297 = true;
										local519.aClass310_8 = local6;
										local519.anInt3743 = Static61.aClass214_1.method7241() - local17;
										local519.anInt3744 = Static61.aClass214_1.method7240() - local22;
										local519.anObjectArray2 = local6.anObjectArray33;
										Static17.aClass249_4.method6523(local519);
									}
								}
								if (local6.aBoolean663 && local208 && local6.anObjectArray24 != null) {
									local519 = new Class2_Sub28();
									local519.aBoolean297 = true;
									local519.aClass310_8 = local6;
									local519.anInt3743 = Static61.aClass214_1.method7241() - local17;
									local519.anInt3744 = Static61.aClass214_1.method7240() - local22;
									local519.anObjectArray2 = local6.anObjectArray24;
									Static17.aClass249_4.method6523(local519);
								}
								if (local6.aBoolean663 && !local208) {
									local6.aBoolean663 = false;
									if (local6.anObjectArray17 != null) {
										local519 = new Class2_Sub28();
										local519.aBoolean297 = true;
										local519.aClass310_8 = local6;
										local519.anInt3743 = Static61.aClass214_1.method7241() - local17;
										local519.anInt3744 = Static61.aClass214_1.method7240() - local22;
										local519.anObjectArray2 = local6.anObjectArray17;
										Static96.aClass249_9.method6523(local519);
									}
								}
								if (local6.anObjectArray35 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray35;
									Static313.aClass249_47.method6523(local519);
								}
								@Pc(1487) Class2_Sub28 local1487;
								if (local6.anObjectArray34 != null && Static170.anInt3115 > local6.anInt9208) {
									if (local6.anIntArray709 == null || Static170.anInt3115 - local6.anInt9208 > 32) {
										local519 = new Class2_Sub28();
										local519.aClass310_8 = local6;
										local519.anObjectArray2 = local6.anObjectArray34;
										Static17.aClass249_4.method6523(local519);
									} else {
										label680: for (local300 = local6.anInt9208; local300 < Static170.anInt3115; local300++) {
											local674 = Static87.anIntArray134[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray709.length; local434++) {
												if (local6.anIntArray709[local434] == local674) {
													local1487 = new Class2_Sub28();
													local1487.aClass310_8 = local6;
													local1487.anObjectArray2 = local6.anObjectArray34;
													Static17.aClass249_4.method6523(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt9208 = Static170.anInt3115;
								}
								if (local6.anObjectArray23 != null && Static153.anInt9007 > local6.anInt9166) {
									if (local6.anIntArray706 == null || Static153.anInt9007 - local6.anInt9166 > 32) {
										local519 = new Class2_Sub28();
										local519.aClass310_8 = local6;
										local519.anObjectArray2 = local6.anObjectArray23;
										Static17.aClass249_4.method6523(local519);
									} else {
										label656: for (local300 = local6.anInt9166; local300 < Static153.anInt9007; local300++) {
											local674 = Static285.anIntArray461[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray706.length; local434++) {
												if (local6.anIntArray706[local434] == local674) {
													local1487 = new Class2_Sub28();
													local1487.aClass310_8 = local6;
													local1487.anObjectArray2 = local6.anObjectArray23;
													Static17.aClass249_4.method6523(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt9166 = Static153.anInt9007;
								}
								if (local6.anObjectArray30 != null && Static3.anInt104 > local6.anInt9201) {
									if (local6.anIntArray708 == null || Static3.anInt104 - local6.anInt9201 > 32) {
										local519 = new Class2_Sub28();
										local519.aClass310_8 = local6;
										local519.anObjectArray2 = local6.anObjectArray30;
										Static17.aClass249_4.method6523(local519);
									} else {
										label632: for (local300 = local6.anInt9201; local300 < Static3.anInt104; local300++) {
											local674 = Static132.anIntArray324[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray708.length; local434++) {
												if (local6.anIntArray708[local434] == local674) {
													local1487 = new Class2_Sub28();
													local1487.aClass310_8 = local6;
													local1487.anObjectArray2 = local6.anObjectArray30;
													Static17.aClass249_4.method6523(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt9201 = Static3.anInt104;
								}
								if (local6.anObjectArray11 != null && Static505.anInt8840 > local6.anInt9164) {
									if (local6.anIntArray707 == null || Static505.anInt8840 - local6.anInt9164 > 32) {
										local519 = new Class2_Sub28();
										local519.aClass310_8 = local6;
										local519.anObjectArray2 = local6.anObjectArray11;
										Static17.aClass249_4.method6523(local519);
									} else {
										label608: for (local300 = local6.anInt9164; local300 < Static505.anInt8840; local300++) {
											local674 = Static357.anIntArray518[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray707.length; local434++) {
												if (local6.anIntArray707[local434] == local674) {
													local1487 = new Class2_Sub28();
													local1487.aClass310_8 = local6;
													local1487.anObjectArray2 = local6.anObjectArray11;
													Static17.aClass249_4.method6523(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt9164 = Static505.anInt8840;
								}
								if (local6.anObjectArray25 != null && Static465.anInt8383 > local6.anInt9213) {
									if (local6.anIntArray711 == null || Static465.anInt8383 - local6.anInt9213 > 32) {
										local519 = new Class2_Sub28();
										local519.aClass310_8 = local6;
										local519.anObjectArray2 = local6.anObjectArray25;
										Static17.aClass249_4.method6523(local519);
									} else {
										label584: for (local300 = local6.anInt9213; local300 < Static465.anInt8383; local300++) {
											local674 = Static437.anIntArray608[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray711.length; local434++) {
												if (local6.anIntArray711[local434] == local674) {
													local1487 = new Class2_Sub28();
													local1487.aClass310_8 = local6;
													local1487.anObjectArray2 = local6.anObjectArray25;
													Static17.aClass249_4.method6523(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt9213 = Static465.anInt8383;
								}
								if (Static342.anInt6310 > local6.anInt9149 && local6.anObjectArray29 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray29;
									Static17.aClass249_4.method6523(local519);
								}
								if (Static224.anInt4039 > local6.anInt9149 && local6.anObjectArray31 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray31;
									Static17.aClass249_4.method6523(local519);
								}
								if (Static487.anInt8609 > local6.anInt9149 && local6.anObjectArray9 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray9;
									Static17.aClass249_4.method6523(local519);
								}
								if (Static460.anInt9074 > local6.anInt9149 && local6.anObjectArray14 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray14;
									Static17.aClass249_4.method6523(local519);
								}
								if (Static209.anInt3778 > local6.anInt9149 && local6.anObjectArray12 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray12;
									Static17.aClass249_4.method6523(local519);
								}
								local6.anInt9149 = Static507.anInt2745;
								if (local6.anObjectArray19 != null) {
									for (local300 = 0; local300 < Static33.anInt600; local300++) {
										@Pc(1955) Class2_Sub28 local1955 = new Class2_Sub28();
										local1955.aClass310_8 = local6;
										local1955.anInt3738 = Static394.anInterface13Array2[local300].method5854();
										local1955.anInt3740 = Static394.anInterface13Array2[local300].method5852();
										local1955.anObjectArray2 = local6.anObjectArray19;
										Static17.aClass249_4.method6523(local1955);
									}
								}
								if (Static435.aBoolean585 && local6.anObjectArray13 != null) {
									local519 = new Class2_Sub28();
									local519.aClass310_8 = local6;
									local519.anObjectArray2 = local6.anObjectArray13;
									Static17.aClass249_4.method6523(local519);
								}
							}
							if (local6.anInt9220 == 5 && local6.anInt9235 != -1) {
								local6.method7643(Static171.aClass131_1, Static222.aClass299_2).method4741(local6.anInt9198, Static103.aClass39_3);
							}
							Static460.method7580(local6);
							if (local6.anInt9220 == 0) {
								method1249(arg0, local6.anInt9226, local28, local30, local32, local34, local17 - local6.anInt9230, local22 - local6.anInt9227, arg8, arg9);
								if (local6.aClass310Array2 != null) {
									method1249(local6.aClass310Array2, local6.anInt9226, local28, local30, local32, local34, local17 - local6.anInt9230, local22 - local6.anInt9227, arg8, arg9);
								}
								@Pc(2077) Class2_Sub9 local2077 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local6.anInt9226);
								if (local2077 != null) {
									if (Static185.aClass212_1 == Static230.aClass212_2 && local2077.anInt832 == 0 && !Static452.aBoolean600 && local208 && !Static372.aBoolean522) {
										Static95.method1762();
									}
									Static139.method2470(local2077.anInt833, arg9, local28, local17, local22, local30, local34, local32, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static460.method7580(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1253() {
		@Pc(1) int local1 = Static16.anInt362;
		@Pc(3) int[] local3 = Static325.anIntArray473;
		@Pc(11) int local11 = Static96.aBoolean134 ? local1 : local1 + Static520.anInt1936;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local13 - local1])).aClass1_Sub1_Sub2_Sub2_1;
			}
			if (local23.anInt5088 >= 0) {
				@Pc(43) int local43 = local23.method4394();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7660 & 0x7F) == 0 && (local23.anInt7659 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7660 & 0x7F) == 64 && (local23.anInt7659 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class1_Sub1_Sub2_Sub1 && local23.aClass2_Sub47_3 != null && Static115.anInt2326 >= local23.aClass2_Sub47_3.anInt9135 && Static115.anInt2326 < local23.aClass2_Sub47_3.anInt9145) {
					((Class1_Sub1_Sub2_Sub1) local23).aBoolean258 = false;
				}
				local23.anInt7657 = Static200.method3233(local23.aByte90, local23.anInt7660, local23.anInt7659);
				Static58.method1076(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1254() {
		Static105.anInt2009 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static520.anInt1936; local3++) {
			@Pc(14) Class1_Sub1_Sub2_Sub2 local14 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local3])).aClass1_Sub1_Sub2_Sub2_1;
			if (local14.aBoolean384 && local14.method4384() != -1) {
				@Pc(32) int local32 = (local14.method4394() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7660 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7659 - local32 >> 7;
				@Pc(53) Class1_Sub1_Sub2 local53 = Static90.method6987(local39, local46, local14.aByte90);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt5076;
					if (local53 instanceof Class1_Sub1_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt5059 == 0 && local53.method4384() != -1) {
						Static41.anIntArray60[Static105.anInt2009] = local58;
						Static447.anIntArray623[Static105.anInt2009] = local58;
						Static105.anInt2009++;
						local53.anInt5059++;
					}
					Static41.anIntArray60[Static105.anInt2009] = local58;
					Static447.anIntArray623[Static105.anInt2009] = local14.anInt5076 + 2048;
					Static105.anInt2009++;
					local53.anInt5059++;
				}
			}
		}
		Static352.method5540(Static105.anInt2009 - 1, Static447.anIntArray623, Static41.anIntArray60, 0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wca;)Z")
	public static boolean method1256(@OriginalArg(0) Class310 arg0) {
		if (Static372.aBoolean522) {
			if (method1257(arg0).anInt7446 != 0) {
				return false;
			}
			if (arg0.anInt9220 == 0) {
				return false;
			}
		}
		return arg0.aBoolean655;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wca;)Lclient!qe;")
	public static Class2_Sub39 method1257(@OriginalArg(0) Class310 arg0) {
		@Pc(13) Class2_Sub39 local13 = (Class2_Sub39) Static275.aClass127_42.method3205(((long) arg0.anInt9226 << 32) + (long) arg0.anInt9170);
		return local13 == null ? arg0.aClass2_Sub39_2 : local13;
	}
}
