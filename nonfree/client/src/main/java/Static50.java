import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ia", name = "Mb", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!ia", name = "Xb", descriptor = "I")
	public static int anInt1428;

	@OriginalMember(owner = "client!ia", name = "Fb", descriptor = "Lclient!cb;")
	public static Class12 aClass12_11 = new Class12(64);

	@OriginalMember(owner = "client!ia", name = "Lb", descriptor = "I")
	public static int anInt1418 = 0;

	@OriginalMember(owner = "client!ia", name = "bc", descriptor = "Lclient!od;")
	public static Class60 aClass60_507 = Static41.method597("rot:");

	@OriginalMember(owner = "client!ia", name = "cc", descriptor = "[Lclient!ge;")
	public static Class28[] aClass28Array3 = new Class28[4];

	@OriginalMember(owner = "client!ia", name = "nc", descriptor = "Lclient!od;")
	private static Class60 aClass60_509 = Static41.method597("Members object");

	@OriginalMember(owner = "client!ia", name = "hc", descriptor = "Lclient!od;")
	public static Class60 aClass60_508 = aClass60_509;

	@OriginalMember(owner = "client!ia", name = "jc", descriptor = "I")
	public static int anInt1437 = 0;

	@OriginalMember(owner = "client!ia", name = "rc", descriptor = "Lclient!od;")
	public static Class60 aClass60_510 = Static41.method597("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIILclient!sa;I)V")
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub14 arg5, @OriginalArg(7) int arg6) {
		if (Static122.aBoolean117) {
			Static128.anInt2845 = 32;
		} else {
			Static128.anInt2845 = 0;
		}
		Static122.aBoolean117 = false;
		@Pc(119) int local119;
		if (Static24.anInt834 != 0) {
			if (arg4 >= arg6 && arg6 + 16 > arg4 && arg3 >= arg0 && arg3 < arg0 + 16) {
				arg5.anInt2437 -= 4;
				Static36.method558(arg5);
			} else if (arg6 <= arg4 && arg6 + 16 > arg4 && arg3 >= arg1 + arg0 - 16 && arg1 + arg0 > arg3) {
				arg5.anInt2437 += 4;
				Static36.method558(arg5);
			} else if (arg6 - Static128.anInt2845 <= arg4 && arg4 < Static128.anInt2845 + arg6 + 16 && arg0 + 16 <= arg3 && arg0 + arg1 - 16 > arg3) {
				local119 = (arg1 - 32) * arg1 / arg2;
				if (local119 < 8) {
					local119 = 8;
				}
				@Pc(136) int local136 = arg3 - local119 / 2 - arg0 - 16;
				@Pc(143) int local143 = arg1 - local119 - 32;
				arg5.anInt2437 = (arg2 - arg1) * local136 / local143;
				Static36.method558(arg5);
				Static122.aBoolean117 = true;
			}
		}
		if (Static105.anInt2480 == 0) {
			return;
		}
		local119 = arg5.anInt2392;
		if (arg6 - local119 <= arg4 && arg0 <= arg3 && arg6 + 16 > arg4 && arg0 + arg1 >= arg3) {
			arg5.anInt2437 += Static105.anInt2480 * 45;
			Static36.method558(arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)Z")
	public static boolean method849() {
		try {
			if (Static9.anInt112 == 2) {
				if (Static109.aClass4_Sub11_1 == null) {
					Static109.aClass4_Sub11_1 = Static138.method953(Static82.aClass10_22, Static130.anInt2874, Static44.anInt2165);
					if (Static109.aClass4_Sub11_1 == null) {
						return false;
					}
				}
				if (Static27.aClass62_1 == null) {
					Static27.aClass62_1 = new Class62(Static51.aClass10_16, Static3.aClass10_3);
				}
				if (Static30.aClass4_Sub1_Sub1_1.method116(Static86.aClass10_25, Static109.aClass4_Sub11_1, Static27.aClass62_1)) {
					Static30.aClass4_Sub1_Sub1_1.method120();
					Static30.aClass4_Sub1_Sub1_1.method121(Static118.anInt2733);
					Static30.aClass4_Sub1_Sub1_1.method107(Static109.aClass4_Sub11_1, Static133.aBoolean128);
					Static82.aClass10_22 = null;
					Static9.anInt112 = 0;
					Static109.aClass4_Sub11_1 = null;
					Static27.aClass62_1 = null;
					return true;
				}
			}
		} catch (@Pc(71) Exception local71) {
			local71.printStackTrace();
			Static30.aClass4_Sub1_Sub1_1.method122();
			Static109.aClass4_Sub11_1 = null;
			Static82.aClass10_22 = null;
			Static9.anInt112 = 0;
			Static27.aClass62_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!sa;)Z")
	public static boolean method850(@OriginalArg(1) Class4_Sub14 arg0) {
		if (arg0.anIntArray307 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray307.length; local17++) {
			@Pc(24) int local24 = Static119.method1900(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray306[local17];
			if (arg0.anIntArray307[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray307[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray307[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B)[B")
	public static byte[] method853(@OriginalArg(1) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local2];
		Static136.method700(arg0, 0, local14, 0, local2);
		return local14;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method857() {
		aClass60_509 = null;
		aClass60_508 = null;
		aClass28Array3 = null;
		aClass60_507 = null;
		aClass60_510 = null;
		anIntArray139 = null;
		aClass12_11 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class45 local11 = Static48.aClass45ArrayArrayArray1[Static77.anInt1866][arg1][arg0];
		if (local11 == null) {
			Static30.aClass48_1.method1034(Static77.anInt1866, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class4_Sub3_Sub1_Sub1 local23 = null;
		@Pc(28) Class4_Sub3_Sub1_Sub1 local28;
		for (local28 = (Class4_Sub3_Sub1_Sub1) local11.method982(); local28 != null; local28 = (Class4_Sub3_Sub1_Sub1) local11.method986()) {
			@Pc(34) Class4_Sub3_Sub16 local34 = Static112.method1854(local28.anInt221);
			@Pc(37) int local37 = local34.anInt2868;
			if (local34.anInt2866 == 1) {
				local37 *= local28.anInt225 + 1;
			}
			if (local37 > local21) {
				local23 = local28;
				local21 = local37;
			}
		}
		if (local23 == null) {
			Static30.aClass48_1.method1034(Static77.anInt1866, arg1, arg0);
			return;
		}
		local11.method990(local23);
		@Pc(82) Class4_Sub3_Sub1_Sub1 local82 = null;
		local28 = (Class4_Sub3_Sub1_Sub1) local11.method982();
		@Pc(93) Class4_Sub3_Sub1_Sub1 local93 = null;
		@Pc(101) int local101 = arg1 + (arg0 << 7) + 1610612736;
		while (local28 != null) {
			if (local23.anInt221 != local28.anInt221) {
				if (local93 == null) {
					local93 = local28;
				}
				if (local28.anInt221 != local93.anInt221 && local82 == null) {
					local82 = local28;
				}
			}
			local28 = (Class4_Sub3_Sub1_Sub1) local11.method986();
		}
		Static30.aClass48_1.method1041(Static77.anInt1866, arg1, arg0, Static55.method882(arg0 * 128 + 64, arg1 * 128 + 64, Static77.anInt1866), local23, local101, local93, local82);
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(I)V")
	public static void method859() {
		while (true) {
			if (Static96.aClass4_Sub9_Sub1_2.method825(Static7.anInt79) >= 11) {
				@Pc(21) int local21 = Static96.aClass4_Sub9_Sub1_2.method833(11);
				if (local21 != 2047) {
					@Pc(26) boolean local26 = false;
					if (Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local21] == null) {
						Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local21] = new Class4_Sub3_Sub1_Sub2_Sub1();
						if (Static65.aClass4_Sub9Array1[local21] != null) {
							Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local21].method218(Static65.aClass4_Sub9Array1[local21]);
						}
						local26 = true;
					}
					Static118.anIntArray336[Static125.anInt2830++] = local21;
					@Pc(62) Class4_Sub3_Sub1_Sub2_Sub1 local62 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local21];
					local62.anInt1394 = Static118.anInt2741;
					@Pc(70) int local70 = Static96.aClass4_Sub9_Sub1_2.method833(1);
					if (local70 == 1) {
						Static35.anIntArray97[Static9.anInt116++] = local21;
					}
					@Pc(86) int local86 = Static96.aClass4_Sub9_Sub1_2.method833(5);
					@Pc(91) int local91 = Static96.aClass4_Sub9_Sub1_2.method833(1);
					if (local86 > 15) {
						local86 -= 32;
					}
					@Pc(102) int local102 = Static96.aClass4_Sub9_Sub1_2.method833(5);
					@Pc(109) int local109 = Static42.anIntArray115[Static96.aClass4_Sub9_Sub1_2.method833(3)];
					if (local102 > 15) {
						local102 -= 32;
					}
					if (local26) {
						local62.anInt1414 = local62.anInt1415 = local109;
					}
					local62.method856(local91 == 1, local86 + Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0] - -local102);
					continue;
				}
			}
			Static96.aClass4_Sub9_Sub1_2.method828();
			return;
		}
	}
}
