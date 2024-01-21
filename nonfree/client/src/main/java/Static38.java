import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "Lclient!oc;")
	public static Class56 aClass56_35;

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "Lclient!ea;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "J")
	public static long aLong76;

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_5;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_445 = Static78.method1313("Offline");

	@OriginalMember(owner = "client!g", name = "T", descriptor = "Lclient!aa;")
	public static Class2 aClass2_5 = new Class2();

	@OriginalMember(owner = "client!g", name = "db", descriptor = "I")
	public static int anInt1078 = 0;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_446 = Static78.method1313("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_447 = Static78.method1313("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
	public static int anInt1079 = 0;

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_448 = Static78.method1313("@cr2@");

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_449 = Static78.method1313("Cancel");

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_450 = Static78.method1313("white:");

	@OriginalMember(owner = "client!g", name = "ob", descriptor = "Lclient!fc;")
	public static Class25 aClass25_451 = aClass25_450;

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
	public static volatile int anInt1081 = 0;

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_452 = aClass25_450;

	@OriginalMember(owner = "client!g", name = "sb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_453 = aClass25_449;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
	public static Object method870(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static93.aBoolean102) {
			try {
				@Pc(23) Class37 local23 = (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
				local23.method1777(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static93.aBoolean102 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	public static void method871(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static13.anInt383; local8++) {
			@Pc(19) int local19 = (Static106.anIntArray423[local8] << 14) + 536870912;
			@Pc(25) Class1_Sub2_Sub3_Sub4_Sub1 local25 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static106.anIntArray423[local8]];
			if (local25 != null && local25.method1977() && local25.aClass1_Sub2_Sub13_1.aBoolean80 == arg0 && local25.aClass1_Sub2_Sub13_1.method1403()) {
				@Pc(50) int local50 = local25.anInt2832 >> 7;
				@Pc(55) int local55 = local25.anInt2827 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local25.anInt2834 == 1 && (local25.anInt2832 & 0x7F) == 64 && (local25.anInt2827 & 0x7F) == 64) {
						if (Static124.anInt2899 == Static49.anIntArrayArray12[local50][local55]) {
							continue;
						}
						Static49.anIntArrayArray12[local50][local55] = Static124.anInt2899;
					}
					if (!local25.aClass1_Sub2_Sub13_1.aBoolean78) {
						local19 += Integer.MIN_VALUE;
					}
					Static118.aClass4_1.method66(Static21.anInt596, local25.anInt2832, local25.anInt2827, Static129.method2048(local25.anInt2834 * 64 + local25.anInt2827 - 64, Static21.anInt596, local25.anInt2832 + (local25.anInt2834 - 1) * 64), local25.anInt2834 * 64 + 60 - 64, local25, local25.anInt2819, local19, local25.aBoolean124);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
	public static void method872() {
		aByteArrayArrayArray3 = null;
		aClass56_Sub1_5 = null;
		aClass25_449 = null;
		aClass25_445 = null;
		aClass25_452 = null;
		aClass2_5 = null;
		aClass25_451 = null;
		aClass25_446 = null;
		aClass25_448 = null;
		aClass21_1 = null;
		aClass25_450 = null;
		aClass56_35 = null;
		aClass25_447 = null;
		aClass25_453 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!dc;BIIII)V")
	public static void method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(40) int local40;
		if (arg5 < 0 || arg5 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local40 = arg2.method672();
				if (local40 == 0) {
					return;
				}
				if (local40 == 1) {
					arg2.method672();
					return;
				}
				if (local40 <= 49) {
					arg2.method672();
				}
			}
			return;
		}
		Static116.aByteArrayArrayArray7[arg0][arg5][arg6] = 0;
		while (true) {
			local40 = arg2.method672();
			if (local40 == 0) {
				if (arg0 == 0) {
					Static7.anIntArrayArrayArray3[0][arg5][arg6] = -Static123.method2000(arg6 + arg1 + 556238, arg5 + 932731 - -arg3) * 8;
					return;
				} else {
					Static7.anIntArrayArrayArray3[arg0][arg5][arg6] = Static7.anIntArrayArrayArray3[arg0 - 1][arg5][arg6] - 240;
					return;
				}
			}
			if (local40 == 1) {
				@Pc(100) int local100 = arg2.method672();
				if (local100 == 1) {
					local100 = 0;
				}
				if (arg0 == 0) {
					Static7.anIntArrayArrayArray3[0][arg5][arg6] = -local100 * 8;
					return;
				}
				Static7.anIntArrayArrayArray3[arg0][arg5][arg6] = Static7.anIntArrayArrayArray3[arg0 - 1][arg5][arg6] - local100 * 8;
				return;
			}
			if (local40 <= 49) {
				aByteArrayArrayArray3[arg0][arg5][arg6] = arg2.method643();
				Static39.aByteArrayArrayArray5[arg0][arg5][arg6] = (byte) ((local40 - 2) / 4);
				Static26.aByteArrayArrayArray1[arg0][arg5][arg6] = (byte) (local40 + arg4 - 2 & 0x3);
			} else if (local40 <= 81) {
				Static116.aByteArrayArrayArray7[arg0][arg5][arg6] = (byte) (local40 - 49);
			} else {
				Static85.aByteArrayArrayArray6[arg0][arg5][arg6] = (byte) (local40 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class25 method874(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static74.method1214(arg0);
		} else if (arg0 < 10000000) {
			return Static116.method1859(new Class25[] { Static74.method1214(arg0 / 1000), Static1.aClass25_22 });
		} else {
			return Static116.method1859(new Class25[] { Static74.method1214(arg0 / 1000000), Static116.aClass25_1300 });
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[BIZ)I")
	public static int method877(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local7 = local7 >>> 8 ^ Class27.anIntArray205[(arg1[local14] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILclient!nf;I)V")
	public static void method878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub13 arg2, @OriginalArg(4) int arg3) {
		if (Static108.anInt2503 >= 400) {
			return;
		}
		if (arg2.anIntArray332 != null) {
			arg2 = arg2.method1408();
		}
		if (arg2 == null || !arg2.aBoolean78) {
			return;
		}
		@Pc(28) Class25 local28 = arg2.aClass25_884;
		if (arg2.anInt1857 != 0) {
			local28 = Static116.method1859(new Class25[] { local28, Static115.method1849(arg2.anInt1857, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2840), Static108.aClass25_1196, Static53.aClass25_1241, Static74.method1214(arg2.anInt1857), Static26.aClass25_322 });
		}
		if (Static80.anInt1774 == 1) {
			Static80.method1365(arg0, 49, arg3, arg1, Static116.method1859(new Class25[] { Static65.aClass25_670, Static82.aClass25_870, local28 }), Static42.aClass25_475);
		} else if (!Static84.aBoolean83) {
			@Pc(122) Class25[] local122 = arg2.aClass25Array12;
			if (Static107.aBoolean112) {
				local122 = Static86.method1430(local122);
			}
			@Pc(136) int local136;
			if (local122 != null) {
				for (local136 = 4; local136 >= 0; local136--) {
					if (local122[local136] != null && !local122[local136].method786(Static98.aClass25_1369)) {
						@Pc(155) byte local155 = 0;
						if (local136 == 0) {
							local155 = 33;
						}
						if (local136 == 1) {
							local155 = 26;
						}
						if (local136 == 2) {
							local155 = 8;
						}
						if (local136 == 3) {
							local155 = 57;
						}
						if (local136 == 4) {
							local155 = 53;
						}
						Static80.method1365(arg0, local155, arg3, arg1, Static116.method1859(new Class25[] { Static95.aClass25_1032, local28 }), local122[local136]);
					}
				}
			}
			if (local122 != null) {
				for (local136 = 4; local136 >= 0; local136--) {
					if (local122[local136] != null && local122[local136].method786(Static98.aClass25_1369)) {
						@Pc(228) short local228 = 0;
						if (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2840 < arg2.anInt1857) {
							local228 = 2000;
						}
						@Pc(237) int local237 = 0;
						if (local136 == 0) {
							local237 = local228 + 33;
						}
						if (local136 == 1) {
							local237 = local228 + 26;
						}
						if (local136 == 2) {
							local237 = local228 + 8;
						}
						if (local136 == 3) {
							local237 = local228 + 57;
						}
						if (local136 == 4) {
							local237 = local228 + 53;
						}
						Static80.method1365(arg0, local237, arg3, arg1, Static116.method1859(new Class25[] { Static95.aClass25_1032, local28 }), local122[local136]);
					}
				}
			}
			Static80.method1365(arg0, 1004, arg3, arg1, Static116.method1859(new Class25[] { Static95.aClass25_1032, local28 }), Static37.aClass25_433);
		} else if ((Static94.anInt2162 & 0x2) == 2) {
			Static80.method1365(arg0, 6, arg3, arg1, Static116.method1859(new Class25[] { Static89.aClass25_236, Static82.aClass25_870, local28 }), Static83.aClass25_888);
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB[BLclient!rb;)V")
	public static void method879(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(7) Class1_Sub15 local7 = new Class1_Sub15();
		local7.anInt2097 = 0;
		local7.aLong184 = arg0;
		local7.aByteArray22 = arg1;
		local7.aClass70_3 = arg2;
		@Pc(30) Class2 local30 = Static7.aClass2_2;
		synchronized (Static7.aClass2_2) {
			Static7.aClass2_2.method33(local7);
		}
		Static50.method986();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZLclient!ob;IIIII)V")
	public static void method880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static101.aBoolean107) {
			Static7.anInt169 = 32;
		} else {
			Static7.anInt169 = 0;
		}
		Static101.aBoolean107 = false;
		@Pc(164) int local164;
		if (arg3 >= arg1 && arg1 + 16 > arg3 && arg4 <= arg0 && arg0 < arg4 + 16) {
			arg2.anInt1957 -= Static88.anInt1975 * 4;
			if (arg7 == 1) {
				Static90.aBoolean98 = true;
			}
			if (arg7 == 2 || arg7 == 3) {
				Static110.aBoolean113 = true;
			}
		} else if (arg1 <= arg3 && arg3 < arg1 + 16 && arg4 + arg6 - 16 <= arg0 && arg0 < arg6 + arg4) {
			arg2.anInt1957 += Static88.anInt1975 * 4;
			if (arg7 == 1) {
				Static90.aBoolean98 = true;
			}
			if (arg7 == 2 || arg7 == 3) {
				Static110.aBoolean113 = true;
			}
		} else if (arg1 - Static7.anInt169 <= arg3 && arg3 < arg1 + Static7.anInt169 + 16 && arg4 + 16 <= arg0 && arg4 + arg6 - 16 > arg0 && Static88.anInt1975 > 0) {
			if (arg7 == 2 || arg7 == 3) {
				Static110.aBoolean113 = true;
			}
			Static101.aBoolean107 = true;
			local164 = arg6 * (arg6 - 32) / arg5;
			if (arg7 == 1) {
				Static90.aBoolean98 = true;
			}
			if (local164 < 8) {
				local164 = 8;
			}
			@Pc(181) int local181 = arg6 - local164 - 32;
			@Pc(193) int local193 = arg0 - local164 / 2 - arg4 - 16;
			arg2.anInt1957 = local193 * (arg5 - arg6) / local181;
		}
		if (Static59.anInt1355 == 0) {
			return;
		}
		local164 = arg2.anInt1911;
		if (arg7 == -1) {
			local164 = 479;
		}
		if (arg3 < arg1 - local164 || arg0 < arg4 || arg1 + 16 <= arg3 || arg4 + arg6 < arg0) {
			return;
		}
		if (arg7 == 2 || arg7 == 3) {
			Static110.aBoolean113 = true;
		}
		if (arg7 == 1) {
			Static90.aBoolean98 = true;
		}
		arg2.anInt1957 += Static59.anInt1355 * 45;
		return;
	}
}
