import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	public static int anInt1037;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	public static int anInt1041 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sj;IILclient!l;IIILclient!sf;)V")
	public static void method811(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class57 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class74 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static261.anInt5200 == 4) {
			local18 = (int) Static57.aFloat3 & 0x3FFF;
		} else {
			local18 = Static42.anInt892 + (int) Static57.aFloat3 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg0.anInt5704 / 2, arg0.anInt5721 / 2) + 10;
		@Pc(45) int local45 = arg4 * arg4 + arg5 * arg5;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class19.anIntArray20[local18];
		@Pc(63) int local63 = Class19.anIntArray21[local18];
		if (Static261.anInt5200 != 4) {
			local63 = local63 * 256 / (Static12.anInt309 + 256);
			local59 = local59 * 256 / (Static12.anInt309 + 256);
		}
		@Pc(94) int local94 = arg5 * local63 + local59 * arg4 >> 15;
		@Pc(105) int local105 = arg4 * local63 - local59 * arg5 >> 15;
		arg3.method5444(local94 + arg2 + arg0.anInt5704 / 2 - arg3.method5433() / 2, -local105 + arg0.anInt5721 / 2 + arg1 + -(arg3.method5441() / 2), arg6, arg2, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method812() {
		for (@Pc(1) int local1 = -1; local1 < Static170.anInt6275 + Static42.anInt897; local1++) {
			@Pc(6) Class5_Sub4_Sub4 local6;
			if (local1 < 0) {
				local6 = Static349.aClass5_Sub4_Sub4_Sub1_2;
			} else if (local1 < Static170.anInt6275) {
				local6 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local1]];
			} else {
				local6 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local1 - Static170.anInt6275]];
			}
			if (local6.anInt4893 >= 0) {
				@Pc(32) int local32 = local6.method4208();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5901 & 0x7F) != 0 || (local6.anInt5905 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5901 & 0x7F) != 64 || (local6.anInt5905 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5901 >> 7;
					local73 = local6.anInt5905 >> 7;
					if (local6.anInt4893 > Static72.anIntArrayArray8[local68][local73]) {
						Static72.anIntArrayArray8[local68][local73] = local6.anInt4893;
						Static149.anIntArrayArray19[local68][local73] = 1;
					} else if (local6.anInt4893 == Static72.anIntArrayArray8[local68][local73]) {
						local109 = Static149.anIntArrayArray19[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5901 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5905 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5901 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5905 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt4893 > Static72.anIntArrayArray8[local151][local154]) {
								Static72.anIntArrayArray8[local151][local154] = local6.anInt4893;
								Static149.anIntArrayArray19[local151][local154] = 1;
							} else if (local6.anInt4893 == Static72.anIntArrayArray8[local151][local154]) {
								local109 = Static149.anIntArrayArray19[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method814() {
		for (@Pc(1) int local1 = 0; local1 < Static162.anInt2152; local1++) {
			@Pc(6) int[] local6 = Static72.anIntArrayArray8[local1];
			for (@Pc(8) int local8 = 0; local8 < Static122.anInt2632; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ir;B)V")
	public static void method816(@OriginalArg(0) Class100 arg0) {
		Static128.aClass100_61 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method817() {
		@Pc(5) Class198 local5 = Static190.aClass198_34;
		synchronized (Static190.aClass198_34) {
			Static190.aClass198_34.method5236();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sj;)Z")
	public static boolean method818(@OriginalArg(0) Class181 arg0) {
		if (Static212.aBoolean98) {
			if (method819(arg0).anInt1455 != 0) {
				return false;
			}
			if (arg0.anInt5715 == 0) {
				return false;
			}
		}
		return arg0.aBoolean388;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!sj;)Lclient!ee;")
	public static Class3_Sub15 method819(@OriginalArg(0) Class181 arg0) {
		@Pc(13) Class3_Sub15 local13 = (Class3_Sub15) Static74.aClass24_7.method609(((long) arg0.anInt5761 << 32) + (long) arg0.anInt5688);
		return local13 == null ? arg0.aClass3_Sub15_4 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!sj;)Lclient!sj;")
	public static Class181 method823(@OriginalArg(0) Class181 arg0) {
		@Pc(4) int local4 = method819(arg0).method1141();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static20.method415(arg0.anInt5734);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method825() {
		Static311.anInt6166 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static42.anInt897; local3++) {
			@Pc(10) Class5_Sub4_Sub4_Sub2 local10 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local3]];
			if (local10.aBoolean282 && local10.method4204() != -1) {
				@Pc(28) int local28 = (local10.method4208() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5901 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5905 - local28 >> 7;
				@Pc(48) Class5_Sub4_Sub4 local48 = Static27.method576(local35, local42, Static163.anInt3184);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt4946;
					if (local48 instanceof Class5_Sub4_Sub4_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt4881 == 0 && local48.method4204() != -1) {
						Static321.anIntArray520[Static311.anInt6166] = local53;
						Static84.anIntArray101[Static311.anInt6166] = local53;
						Static311.anInt6166++;
						local48.anInt4881++;
					}
					Static321.anIntArray520[Static311.anInt6166] = local53;
					Static84.anIntArray101[Static311.anInt6166] = local10.anInt4946 + 2048;
					Static311.anInt6166++;
					local48.anInt4881++;
				}
			}
		}
		Static188.method3392(Static321.anIntArray520, 0, Static311.anInt6166 - 1, Static84.anIntArray101);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method827() {
		@Pc(7) int local7 = Static175.aBoolean198 ? Static170.anInt6275 : Static170.anInt6275 + Static42.anInt897;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class5_Sub4_Sub4 local14;
			if (local9 < 0) {
				local14 = Static349.aClass5_Sub4_Sub4_Sub1_2;
			} else if (local9 < Static170.anInt6275) {
				local14 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local9]];
			} else {
				local14 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local9 - Static170.anInt6275]];
			}
			if (local14.anInt4893 >= 0) {
				@Pc(40) int local40 = local14.method4208();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5901 & 0x7F) == 0 && (local14.anInt5905 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5901 & 0x7F) == 64 && (local14.anInt5905 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class5_Sub4_Sub4_Sub1 && local14.anInterface5_3 != null && Static51.anInt1101 >= local14.anInt4949 && Static51.anInt1101 < local14.anInt4951) {
					((Class5_Sub4_Sub4_Sub1) local14).aBoolean190 = false;
				}
				local14.anInt5907 = Static286.method4919(local14.anInt5901, local14.anInt5905, Static163.anInt3184);
				Static321.method5272(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
	public static void method828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg3 - 32) * arg3 / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		Static55.aClass57Array19[0].method5448(arg0, arg1);
		@Pc(36) int local36 = (arg3 - local11 - 32) * arg2 / (arg4 - arg3);
		Static55.aClass57Array19[1].method5448(arg0, arg3 + arg1 - 16);
		Static212.aClass122_2.method4801(arg3 - 32, arg0, arg1 + 16, 16, Static80.anInt1611);
		Static212.aClass122_2.method4801(local11, arg0, local36 + arg1 + 16, 16, Static40.anInt6446);
		Static212.aClass122_2.method4760(local11, Static215.anInt4408, arg0, local36 + arg1 + 16);
		Static212.aClass122_2.method4760(local11, Static215.anInt4408, arg0 + 1, arg1 - -16 - -local36);
		Static212.aClass122_2.method4736(Static215.anInt4408, arg0, 16, local36 + arg1 + 16);
		Static212.aClass122_2.method4736(Static215.anInt4408, arg0, 16, arg1 + local36 + 17);
		Static212.aClass122_2.method4760(local11, Static200.anInt4107, arg0 + 15, arg1 + 16 - -local36);
		Static212.aClass122_2.method4760(local11 - 1, Static200.anInt4107, arg0 + 14, local36 + 17 + arg1);
		Static212.aClass122_2.method4736(Static200.anInt4107, arg0, 16, local11 + arg1 + local36 + 15);
		Static212.aClass122_2.method4736(Static200.anInt4107, arg0 + 1, 15, local11 + local36 + arg1 + 14);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method829() {
		@Pc(7) int local7 = Static175.aBoolean198 ? Static170.anInt6275 : Static170.anInt6275 + Static42.anInt897;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class5_Sub4_Sub4 local14;
			if (local9 < 0) {
				local14 = Static349.aClass5_Sub4_Sub4_Sub1_2;
			} else if (local9 < Static170.anInt6275) {
				local14 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local9]];
			} else {
				local14 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local9 - Static170.anInt6275]];
			}
			local14.anInt4881 = 0;
			if (local14.anInt4893 < 0) {
				local14.aBoolean282 = false;
			} else {
				@Pc(47) int local47 = local14.method4208();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5901 & 0x7F) != 0 || (local14.anInt5905 & 0x7F) != 0) {
						local14.aBoolean282 = false;
						continue;
					}
				} else if ((local14.anInt5901 & 0x7F) != 64 || (local14.anInt5905 & 0x7F) != 64) {
					local14.aBoolean282 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5901 >> 7;
					local94 = local14.anInt5905 >> 7;
					if (local14.anInt4893 != Static72.anIntArrayArray8[local89][local94]) {
						local14.aBoolean282 = true;
						continue;
					}
					if (Static149.anIntArrayArray19[local89][local94] > 1) {
						local119 = Static149.anIntArrayArray19[local89][local94]--;
						local14.aBoolean282 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5901 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5905 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5901 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5905 + local89 >> 7;
					if (!Static215.method3745(local14.anInt4893, local148, local155, local162, local94)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt4893 == Static72.anIntArrayArray8[local173][local176]) {
									local119 = Static149.anIntArrayArray19[local173][local176]--;
								}
							}
						}
						local14.aBoolean282 = true;
						continue;
					}
				}
				if (local14 instanceof Class5_Sub4_Sub4_Sub1 && local14.anInterface5_3 != null && Static51.anInt1101 >= local14.anInt4949 && Static51.anInt1101 < local14.anInt4951) {
					((Class5_Sub4_Sub4_Sub1) local14).aBoolean190 = false;
				}
				local14.aBoolean282 = false;
				local14.anInt5907 = Static286.method4919(local14.anInt5901, local14.anInt5905, Static163.anInt3184);
				Static321.method5272(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method830() {
		@Pc(14) boolean local14 = Static33.anInt778 == 1 && Static170.anInt6275 > 200 || Static33.anInt778 == 0 && Static170.anInt6275 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static170.anInt6275; local16++) {
			@Pc(23) Class5_Sub4_Sub4_Sub1 local23 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local16]];
			if (local23.method2676()) {
				local23.method5040();
				if (local23.aShort86 >= 0 && local23.aShort87 >= 0 && local23.aShort89 < Static162.anInt2152 && local23.aShort88 < Static122.anInt2632) {
					local23.aBoolean190 = local23.aBoolean285 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean282) {
						local62++;
					}
					if (local23.anInt4938 > Static51.anInt1101) {
						local62 += 2;
					}
					local62 += 5 - local23.method4208() << 2;
					if (Static172.anInt3604 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt4893 = local62 + 1;
				} else {
					local23.anInt4893 = -1;
				}
			} else {
				local23.anInt4893 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static42.anInt897; local98++) {
			@Pc(105) Class5_Sub4_Sub4_Sub2 local105 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local98]];
			if (local105.method4217() && local105.aClass119_1.method2891()) {
				local105.method5040();
				if (local105.aShort86 >= 0 && local105.aShort87 >= 0 && local105.aShort89 < Static162.anInt2152 && local105.aShort88 < Static122.anInt2632) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean282) {
						local141++;
					}
					if (local105.anInt4938 > Static51.anInt1101) {
						local141 += 2;
					}
					local141 += 5 - local105.method4208() << 2;
					if (Static172.anInt3604 == 0) {
						if (local105.aClass119_1.aBoolean202) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static172.anInt3604 == 1) {
						if (local105.aClass119_1.aBoolean202) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass119_1.aBoolean204) {
						local141 += 512;
					} else if (!local105.aClass119_1.aBoolean203) {
						local141 += 256;
					}
					local105.anInt4893 = local141 + 1;
				} else {
					local105.anInt4893 = -1;
				}
			} else {
				local105.anInt4893 = -1;
			}
		}
		for (local62 = 0; local62 < Static108.aClass125Array11.length; local62++) {
			@Pc(207) Class125 local207 = Static108.aClass125Array11[local62];
			if (local207 != null) {
				if (local207.anInt3931 == 1) {
					@Pc(218) Class5_Sub4_Sub4_Sub2 local218 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local207.anInt3922];
					if (local218 != null && local218.anInt4893 >= 0) {
						local218.anInt4893 += 1024;
					}
				} else if (local207.anInt3931 == 10) {
					@Pc(239) Class5_Sub4_Sub4_Sub1 local239 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local207.anInt3922];
					if (local239 != null && local239.anInt4893 >= 0) {
						local239.anInt4893 += 1024;
					}
				}
			}
		}
		Static349.aClass5_Sub4_Sub4_Sub1_2.anInt4893 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!sj;IIIIIII)V")
	public static void method831(@OriginalArg(0) Class181[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class181 local6 = arg0[local1];
			if (local6 != null && local6.anInt5734 == arg1) {
				@Pc(17) int local17 = local6.anInt5687 + arg6;
				@Pc(22) int local22 = local6.anInt5690 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt5715 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt5704;
					@Pc(45) int local45 = local22 + local6.anInt5721;
					if (local6.anInt5715 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean381 || local6.anInt5715 == 0 || local6.aBoolean380 || method819(local6).anInt1455 != 0 || local6 == Static163.aClass181_28 || local6.anInt5755 == 1338) {
					if (!local6.aBoolean381 || !method818(local6)) {
						if (local6 == Static328.aClass181_50) {
							Static25.aBoolean31 = true;
							Static349.anInt6770 = local17;
							Static151.anInt2968 = local22;
						}
						if (!local6.aBoolean381 || local6.aBoolean390 || local28 < local32 && local30 < local34) {
							if (local6.anInt5715 == 0) {
								if (!local6.aBoolean381 && method818(local6) && Static118.aClass181_22 != local6) {
									continue;
								}
								if (local6.aBoolean391 && Static192.anInt4000 >= local28 && Static221.anInt4562 >= local30 && Static192.anInt4000 < local32 && Static221.anInt4562 < local34) {
									for (@Pc(175) Class3_Sub41 local175 = (Class3_Sub41) Static160.aClass127_16.method3402(); local175 != null; local175 = (Class3_Sub41) Static160.aClass127_16.method3400()) {
										if (local175.aBoolean436) {
											local175.method5717();
											local175.aClass181_54.aBoolean392 = false;
										}
									}
									if (Static218.anInt4470 == 0) {
										Static328.aClass181_50 = null;
										Static163.aClass181_28 = null;
									}
									Static278.anInt5569 = 0;
									Static97.aBoolean103 = false;
									Static260.aBoolean301 = false;
									if (!Static168.aBoolean192) {
										Static256.method4301();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static192.anInt4000 >= local28 && Static221.anInt4562 >= local30 && Static192.anInt4000 < local32 && Static221.anInt4562 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static168.aBoolean192 && local223) {
								Static144.method2367(local6, Static192.anInt4000 - local17, Static221.anInt4562 - local22);
							}
							if (local6.aBoolean381) {
								@Pc(244) boolean local244 = false;
								if (Static1.anInt12 == 1 && local223) {
									local244 = true;
								}
								@Pc(253) boolean local253 = false;
								if (Static249.anInt4645 == 1 && Static99.anInt2129 >= local28 && Static170.anInt6277 >= local30 && Static99.anInt2129 < local32 && Static170.anInt6277 < local34) {
									local253 = true;
								}
								@Pc(275) int local275;
								@Pc(364) int local364;
								if (local6.aByteArray86 != null) {
									for (local275 = 0; local275 < local6.aByteArray86.length; local275++) {
										if (Static192.aBooleanArray19[local6.aByteArray86[local275]]) {
											if (local6.anIntArray460 == null || Static51.anInt1101 >= local6.anIntArray460[local275]) {
												@Pc(306) byte local306 = local6.aByteArray87[local275];
												if (local306 == 0 || ((local306 & 0x8) == 0 || !Static192.aBooleanArray19[86] && !Static192.aBooleanArray19[82] && !Static192.aBooleanArray19[81]) && ((local306 & 0x2) == 0 || Static192.aBooleanArray19[86]) && ((local306 & 0x1) == 0 || Static192.aBooleanArray19[82]) && ((local306 & 0x4) == 0 || Static192.aBooleanArray19[81])) {
													Static10.method167(-1, local6.anInt5761, "", local275 + 1);
													local364 = local6.anIntArray468[local275];
													if (local6.anIntArray460 == null) {
														local6.anIntArray460 = new int[local6.aByteArray86.length];
													}
													if (local364 == 0) {
														local6.anIntArray460[local275] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray460[local275] = Static51.anInt1101 + local364;
													}
												}
											}
										} else if (local6.anIntArray460 != null) {
											local6.anIntArray460[local275] = 0;
										}
									}
								}
								if (local253) {
									Static87.method1383(local6, Static99.anInt2129 - local17, Static170.anInt6277 - local22);
								}
								if (Static328.aClass181_50 != null && Static328.aClass181_50 != local6 && local223 && method819(local6).method1140()) {
									Static6.aClass181_48 = local6;
								}
								if (local6 == Static163.aClass181_28) {
									Static61.aBoolean62 = true;
									Static98.anInt2072 = local17;
									Static105.anInt2212 = local22;
								}
								if (local6.aBoolean380 || local6.anInt5755 != 0) {
									@Pc(445) Class3_Sub41 local445;
									if (local223 && Static19.anInt532 != 0 && local6.anObjectArray29 != null) {
										local445 = new Class3_Sub41();
										local445.aBoolean436 = true;
										local445.aClass181_54 = local6;
										local445.anInt6470 = Static19.anInt532;
										local445.anObjectArray34 = local6.anObjectArray29;
										Static160.aClass127_16.method3387(local445);
									}
									if (Static328.aClass181_50 != null || Static262.aClass181_59 != null || Static168.aBoolean192 || local6.anInt5755 != 1400 && Static278.anInt5569 > 0) {
										local253 = false;
										local244 = false;
										local223 = false;
									}
									@Pc(580) int local580;
									if (local6.anInt5755 != 0) {
										if (local6.anInt5755 == 1337 || local6.anInt5755 == 1403) {
											Static88.aClass181_14 = local6;
											if (Static55.aClass26_3 != null) {
												Static55.aClass26_3.method620(local6.anInt5721, Static212.aClass122_2);
											}
											if (local6.anInt5755 == 1337) {
												if (!Static168.aBoolean192 && local223) {
													Static3.method32(Static212.aClass122_2);
													for (@Pc(518) Class8_Sub6 local518 = (Class8_Sub6) Static321.aClass65_8.method1462(); local518 != null; local518 = (Class8_Sub6) Static321.aClass65_8.method1461()) {
														if (Static192.anInt4000 >= local518.anInt4680 && Static192.anInt4000 < local518.anInt4681 && Static221.anInt4562 >= local518.anInt4677 && Static221.anInt4562 < local518.anInt4675) {
															Static256.method4301();
															Static334.method5495(local518.aClass5_Sub4_Sub4_1);
														}
													}
												}
												Static319.method5266(local6, local22, local17);
												continue;
											}
										}
										@Pc(619) int local619;
										if (local6.anInt5755 == 1338) {
											if (local6.method4918(Static212.aClass122_2) == null || Static251.anInt4974 != 0 && Static251.anInt4974 != 3 || Static168.aBoolean192 || !local223) {
												continue;
											}
											local275 = Static192.anInt4000 - local17;
											local580 = Static221.anInt4562 - local22;
											local364 = local6.anIntArray466[local580];
											if (local275 < local364 || local275 > local364 + local6.anIntArray457[local580]) {
												continue;
											}
											local275 -= local6.anInt5704 / 2;
											local580 -= local6.anInt5721 / 2;
											if (Static261.anInt5200 == 4) {
												local619 = (int) Static57.aFloat3 & 0x3FFF;
											} else {
												local619 = (int) Static57.aFloat3 + Static42.anInt892 & 0x3FFF;
											}
											@Pc(631) int local631 = Class19.anIntArray20[local619];
											@Pc(635) int local635 = Class19.anIntArray21[local619];
											if (Static261.anInt5200 != 4) {
												local631 = local631 * (Static12.anInt309 + 256) >> 8;
												local635 = local635 * (Static12.anInt309 + 256) >> 8;
											}
											@Pc(664) int local664 = local580 * local631 + local275 * local635 >> 15;
											@Pc(674) int local674 = local580 * local635 - local275 * local631 >> 15;
											@Pc(685) int local685;
											@Pc(693) int local693;
											if (Static261.anInt5200 == 4) {
												local685 = (Static189.anInt3967 >> 7) + (local664 >> 2);
												local693 = (Static350.anInt6803 >> 7) - (local674 >> 2);
											} else {
												@Pc(702) int local702 = (Static349.aClass5_Sub4_Sub4_Sub1_2.method4208() - 1) * 64;
												local685 = (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 - local702 >> 7) + (local664 >> 2);
												local693 = (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 - local702 >> 7) - (local674 >> 2);
											}
											if (Static155.aBoolean96 && (Static299.anInt5948 & 0x40) != 0) {
												@Pc(735) Class181 local735 = Static214.method3735(Static203.anInt4169, Static147.anInt2908);
												if (local735 == null) {
													Static345.method5626();
												} else {
													Static271.method4580(local693, Static303.aString199, " ->", Static244.anInt4838, 1L, local685, 9);
												}
												continue;
											}
											if (Static309.anInt6133 == 1) {
												Static271.method4580(local693, Static153.aString113, "", -1, 1L, local685, 14);
											}
											Static271.method4580(local693, Static340.aString251, "", -1, 1L, local685, 25);
											continue;
										}
										if (local6.anInt5755 == 1400) {
											Static18.aClass181_4 = local6;
											if (local223) {
												Static97.aBoolean103 = true;
											}
											if (local253) {
												local275 = (int) ((double) (Static99.anInt2129 - local17 - local6.anInt5704 / 2) * 2.0D / (double) Static193.aFloat14);
												local580 = (int) -((double) (Static170.anInt6277 - local22 - local6.anInt5721 / 2) * 2.0D / (double) Static193.aFloat14);
												local364 = Static330.anInt6402 + local275 + Static193.anInt2349;
												local619 = Static114.anInt2413 + local580 + Static193.anInt2354;
												@Pc(832) Class3_Sub7_Sub13 local832 = Static18.method403();
												if (local832 == null) {
													continue;
												}
												@Pc(837) int[] local837 = new int[3];
												local832.method2563(local364, local619, local837);
												if (local837 != null) {
													if (Static192.aBooleanArray19[82] && Static350.anInt6800 > 0) {
														Static12.method220(local837[2], local837[0], local837[1]);
														continue;
													}
													Static260.aBoolean301 = true;
													Static187.anInt3943 = local837[0];
													Static164.anInt6258 = local837[1];
													Static234.anInt5169 = local837[2];
												}
												Static278.anInt5569 = 1;
												Static51.aBoolean55 = false;
												Static45.anInt926 = Static192.anInt4000;
												Static337.anInt6550 = Static221.anInt4562;
												continue;
											}
											if (local244 && Static278.anInt5569 > 0) {
												if (Static278.anInt5569 == 1 && (Static45.anInt926 != Static192.anInt4000 || Static337.anInt6550 != Static221.anInt4562)) {
													Static126.anInt4403 = Static330.anInt6402;
													Static307.anInt6091 = Static114.anInt2413;
													Static278.anInt5569 = 2;
												}
												if (Static278.anInt5569 == 2) {
													Static51.aBoolean55 = true;
													Static289.method4949(Static126.anInt4403 + (int) ((double) (Static45.anInt926 - Static192.anInt4000) * 2.0D / (double) Static193.aFloat15));
													Static130.method2224(Static307.anInt6091 - (int) ((double) (Static337.anInt6550 - Static221.anInt4562) * 2.0D / (double) Static193.aFloat15));
												}
												continue;
											}
											if (Static278.anInt5569 > 0 && !Static51.aBoolean55) {
												if ((Static285.anInt5662 == 1 || Static331.method5461()) && Static170.anInt6279 > 2) {
													Static187.method3385(2);
												} else if (Static340.method5559()) {
													Static187.method3385(1);
												}
											}
											Static278.anInt5569 = 0;
											continue;
										}
										if (local6.anInt5755 == 1401) {
											if (local244) {
												Static177.method2892(Static192.anInt4000 - local17, local6.anInt5721, Static221.anInt4562 - local22, local6.anInt5704);
											}
											continue;
										}
										if (local6.anInt5755 == 1402) {
											Static316.method5250(local6);
											continue;
										}
										if (local6.anInt5755 == 1406) {
											Static246.method4183(local17, local22, local6);
											continue;
										}
									}
									if (!local6.aBoolean387 && local253) {
										local6.aBoolean387 = true;
										if (local6.anObjectArray13 != null) {
											local445 = new Class3_Sub41();
											local445.aBoolean436 = true;
											local445.aClass181_54 = local6;
											local445.anInt6473 = Static99.anInt2129 - local17;
											local445.anInt6470 = Static170.anInt6277 - local22;
											local445.anObjectArray34 = local6.anObjectArray13;
											Static160.aClass127_16.method3387(local445);
										}
									}
									if (local6.aBoolean387 && local244 && local6.anObjectArray17 != null) {
										local445 = new Class3_Sub41();
										local445.aBoolean436 = true;
										local445.aClass181_54 = local6;
										local445.anInt6473 = Static192.anInt4000 - local17;
										local445.anInt6470 = Static221.anInt4562 - local22;
										local445.anObjectArray34 = local6.anObjectArray17;
										Static160.aClass127_16.method3387(local445);
									}
									if (local6.aBoolean387 && !local244) {
										local6.aBoolean387 = false;
										if (local6.anObjectArray23 != null) {
											local445 = new Class3_Sub41();
											local445.aBoolean436 = true;
											local445.aClass181_54 = local6;
											local445.anInt6473 = Static192.anInt4000 - local17;
											local445.anInt6470 = Static221.anInt4562 - local22;
											local445.anObjectArray34 = local6.anObjectArray23;
											Static132.aClass127_14.method3387(local445);
										}
									}
									if (local244 && local6.anObjectArray22 != null) {
										local445 = new Class3_Sub41();
										local445.aBoolean436 = true;
										local445.aClass181_54 = local6;
										local445.anInt6473 = Static192.anInt4000 - local17;
										local445.anInt6470 = Static221.anInt4562 - local22;
										local445.anObjectArray34 = local6.anObjectArray22;
										Static160.aClass127_16.method3387(local445);
									}
									if (!local6.aBoolean392 && local223) {
										local6.aBoolean392 = true;
										if (local6.anObjectArray30 != null) {
											local445 = new Class3_Sub41();
											local445.aBoolean436 = true;
											local445.aClass181_54 = local6;
											local445.anInt6473 = Static192.anInt4000 - local17;
											local445.anInt6470 = Static221.anInt4562 - local22;
											local445.anObjectArray34 = local6.anObjectArray30;
											Static160.aClass127_16.method3387(local445);
										}
									}
									if (local6.aBoolean392 && local223 && local6.anObjectArray33 != null) {
										local445 = new Class3_Sub41();
										local445.aBoolean436 = true;
										local445.aClass181_54 = local6;
										local445.anInt6473 = Static192.anInt4000 - local17;
										local445.anInt6470 = Static221.anInt4562 - local22;
										local445.anObjectArray34 = local6.anObjectArray33;
										Static160.aClass127_16.method3387(local445);
									}
									if (local6.aBoolean392 && !local223) {
										local6.aBoolean392 = false;
										if (local6.anObjectArray20 != null) {
											local445 = new Class3_Sub41();
											local445.aBoolean436 = true;
											local445.aClass181_54 = local6;
											local445.anInt6473 = Static192.anInt4000 - local17;
											local445.anInt6470 = Static221.anInt4562 - local22;
											local445.anObjectArray34 = local6.anObjectArray20;
											Static132.aClass127_14.method3387(local445);
										}
									}
									if (local6.anObjectArray7 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray7;
										Static65.aClass127_6.method3387(local445);
									}
									@Pc(1337) Class3_Sub41 local1337;
									if (local6.anObjectArray18 != null && Static307.anInt6095 > local6.anInt5756) {
										if (local6.anIntArray461 == null || Static307.anInt6095 - local6.anInt5756 > 32) {
											local445 = new Class3_Sub41();
											local445.aClass181_54 = local6;
											local445.anObjectArray34 = local6.anObjectArray18;
											Static160.aClass127_16.method3387(local445);
										} else {
											label675: for (local275 = local6.anInt5756; local275 < Static307.anInt6095; local275++) {
												local580 = Static41.anIntArray58[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray461.length; local364++) {
													if (local6.anIntArray461[local364] == local580) {
														local1337 = new Class3_Sub41();
														local1337.aClass181_54 = local6;
														local1337.anObjectArray34 = local6.anObjectArray18;
														Static160.aClass127_16.method3387(local1337);
														break label675;
													}
												}
											}
										}
										local6.anInt5756 = Static307.anInt6095;
									}
									if (local6.anObjectArray19 != null && Static120.anInt2593 > local6.anInt5683) {
										if (local6.anIntArray464 == null || Static120.anInt2593 - local6.anInt5683 > 32) {
											local445 = new Class3_Sub41();
											local445.aClass181_54 = local6;
											local445.anObjectArray34 = local6.anObjectArray19;
											Static160.aClass127_16.method3387(local445);
										} else {
											label655: for (local275 = local6.anInt5683; local275 < Static120.anInt2593; local275++) {
												local580 = Static308.anIntArray509[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray464.length; local364++) {
													if (local6.anIntArray464[local364] == local580) {
														local1337 = new Class3_Sub41();
														local1337.aClass181_54 = local6;
														local1337.anObjectArray34 = local6.anObjectArray19;
														Static160.aClass127_16.method3387(local1337);
														break label655;
													}
												}
											}
										}
										local6.anInt5683 = Static120.anInt2593;
									}
									if (local6.anObjectArray4 != null && Static345.anInt6709 > local6.anInt5725) {
										if (local6.anIntArray455 == null || Static345.anInt6709 - local6.anInt5725 > 32) {
											local445 = new Class3_Sub41();
											local445.aClass181_54 = local6;
											local445.anObjectArray34 = local6.anObjectArray4;
											Static160.aClass127_16.method3387(local445);
										} else {
											label635: for (local275 = local6.anInt5725; local275 < Static345.anInt6709; local275++) {
												local580 = Static54.anIntArray71[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray455.length; local364++) {
													if (local6.anIntArray455[local364] == local580) {
														local1337 = new Class3_Sub41();
														local1337.aClass181_54 = local6;
														local1337.anObjectArray34 = local6.anObjectArray4;
														Static160.aClass127_16.method3387(local1337);
														break label635;
													}
												}
											}
										}
										local6.anInt5725 = Static345.anInt6709;
									}
									if (local6.anObjectArray25 != null && Static295.anInt5871 > local6.anInt5680) {
										if (local6.anIntArray454 == null || Static295.anInt5871 - local6.anInt5680 > 32) {
											local445 = new Class3_Sub41();
											local445.aClass181_54 = local6;
											local445.anObjectArray34 = local6.anObjectArray25;
											Static160.aClass127_16.method3387(local445);
										} else {
											label615: for (local275 = local6.anInt5680; local275 < Static295.anInt5871; local275++) {
												local580 = Static92.anIntArray104[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray454.length; local364++) {
													if (local6.anIntArray454[local364] == local580) {
														local1337 = new Class3_Sub41();
														local1337.aClass181_54 = local6;
														local1337.anObjectArray34 = local6.anObjectArray25;
														Static160.aClass127_16.method3387(local1337);
														break label615;
													}
												}
											}
										}
										local6.anInt5680 = Static295.anInt5871;
									}
									if (local6.anObjectArray15 != null && Static132.anInt2758 > local6.anInt5738) {
										if (local6.anIntArray462 == null || Static132.anInt2758 - local6.anInt5738 > 32) {
											local445 = new Class3_Sub41();
											local445.aClass181_54 = local6;
											local445.anObjectArray34 = local6.anObjectArray15;
											Static160.aClass127_16.method3387(local445);
										} else {
											label595: for (local275 = local6.anInt5738; local275 < Static132.anInt2758; local275++) {
												local580 = Static290.anIntArray475[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray462.length; local364++) {
													if (local6.anIntArray462[local364] == local580) {
														local1337 = new Class3_Sub41();
														local1337.aClass181_54 = local6;
														local1337.anObjectArray34 = local6.anObjectArray15;
														Static160.aClass127_16.method3387(local1337);
														break label595;
													}
												}
											}
										}
										local6.anInt5738 = Static132.anInt2758;
									}
									if (Static44.anInt900 > local6.anInt5780 && local6.anObjectArray27 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray27;
										Static160.aClass127_16.method3387(local445);
									}
									if (Static294.anInt6362 > local6.anInt5780 && local6.anObjectArray11 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray11;
										Static160.aClass127_16.method3387(local445);
									}
									if (Static9.anInt240 > local6.anInt5780 && local6.anObjectArray21 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray21;
										Static160.aClass127_16.method3387(local445);
									}
									if (Static152.anInt2974 > local6.anInt5780 && local6.anObjectArray16 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray16;
										Static160.aClass127_16.method3387(local445);
									}
									if (Static316.anInt6202 > local6.anInt5780 && local6.anObjectArray9 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray9;
										Static160.aClass127_16.method3387(local445);
									}
									local6.anInt5780 = Static293.anInt6247;
									if (local6.anObjectArray24 != null) {
										for (local275 = 0; local275 < Static114.anInt2412; local275++) {
											@Pc(1805) Class3_Sub41 local1805 = new Class3_Sub41();
											local1805.aClass181_54 = local6;
											local1805.anInt6469 = Static198.anIntArray340[local275];
											local1805.anInt6467 = Static223.anIntArray372[local275];
											local1805.anObjectArray34 = local6.anObjectArray24;
											Static160.aClass127_16.method3387(local1805);
										}
									}
									if (Static254.aBoolean288 && local6.anObjectArray14 != null) {
										local445 = new Class3_Sub41();
										local445.aClass181_54 = local6;
										local445.anObjectArray34 = local6.anObjectArray14;
										Static160.aClass127_16.method3387(local445);
									}
								}
								if (local6.anInt5715 == 5 && local6.anInt5702 != -1) {
									local6.method4931().method620(local6.anInt5721, Static212.aClass122_2);
								}
							}
							if (!local6.aBoolean381 && Static328.aClass181_50 == null && Static262.aClass181_59 == null && !Static168.aBoolean192) {
								if ((local6.anInt5728 >= 0 || local6.anInt5742 != 0) && Static192.anInt4000 >= local28 && Static221.anInt4562 >= local30 && Static192.anInt4000 < local32 && Static221.anInt4562 < local34) {
									if (local6.anInt5728 >= 0) {
										Static118.aClass181_22 = arg0[local6.anInt5728];
									} else {
										Static118.aClass181_22 = local6;
									}
								}
								if (local6.anInt5715 == 8 && Static192.anInt4000 >= local28 && Static221.anInt4562 >= local30 && Static192.anInt4000 < local32 && Static221.anInt4562 < local34) {
									Static188.aClass181_32 = local6;
								}
								if (local6.anInt5724 > local6.anInt5721) {
									Static172.method2853(local17 + local6.anInt5704, local22, Static192.anInt4000, local6, local6.anInt5721, Static221.anInt4562, local6.anInt5724);
								}
							}
							Static58.method956(arg4, arg2, local6, arg3, arg5, local17, local22);
							if (local6.anInt5715 == 0) {
								method831(arg0, local6.anInt5761, local28, local30, local32, local34, local17 - local6.anInt5717, local22 - local6.anInt5685);
								if (local6.aClass181Array2 != null) {
									method831(local6.aClass181Array2, local6.anInt5761, local28, local30, local32, local34, local17 - local6.anInt5717, local22 - local6.anInt5685);
								}
								@Pc(1998) Class3_Sub32 local1998 = (Class3_Sub32) Static188.aClass24_21.method609((long) local6.anInt5761);
								if (local1998 != null) {
									if (local1998.anInt4349 == 0 && !Static168.aBoolean192 && local223 && !Static212.aBoolean98) {
										Static256.method4301();
									}
									Static171.method2835(local22, local34, local28, local1998.anInt4348, local17, local32, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static58.method956(arg4, arg2, local6, arg3, arg5, local17, local22);
				}
			}
		}
	}
}
