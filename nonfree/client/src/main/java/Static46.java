import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static int anInt1190;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!oc;")
	public static Class56 aClass56_43;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	public static int anInt1197;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Lclient!ma;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
	public static int[] anIntArray239 = new int[500];

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!fc;")
	private static Class25 aClass25_500 = Static78.method1313("Too many connections from your address)3");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_492 = aClass25_500;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
	public static int[] anIntArray240 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!fc;")
	private static Class25 aClass25_495 = Static78.method1313("Please try using a different world)3");

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_493 = aClass25_495;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_494 = aClass25_495;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_496 = aClass25_495;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_497 = aClass25_495;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_498 = Static78.method1313("backhmid1");

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_499 = aClass25_495;

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_501 = aClass25_495;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!q;)V")
	public static void method966(@OriginalArg(1) Class1_Sub2_Sub3_Sub4 arg0) {
		arg0.aBoolean124 = false;
		@Pc(13) Class1_Sub2_Sub17 local13;
		if (arg0.anInt2795 != -1) {
			local13 = Static34.method755(arg0.anInt2795);
			if (local13 == null || local13.anIntArray410 == null) {
				arg0.anInt2795 = -1;
			} else {
				arg0.anInt2824++;
				if (arg0.anInt2814 < local13.anIntArray410.length && arg0.anInt2824 > local13.anIntArray406[arg0.anInt2814]) {
					arg0.anInt2824 = 1;
					arg0.anInt2814++;
					Static54.method1022(arg0.anInt2814, arg0.anInt2832, arg0.anInt2827, local13);
				}
				if (arg0.anInt2814 >= local13.anIntArray410.length) {
					arg0.anInt2824 = 0;
					arg0.anInt2814 = 0;
					Static54.method1022(arg0.anInt2814, arg0.anInt2832, arg0.anInt2827, local13);
				}
			}
		}
		if (arg0.anInt2813 != -1 && arg0.anInt2805 <= Static60.anInt1366) {
			if (arg0.anInt2792 < 0) {
				arg0.anInt2792 = 0;
			}
			@Pc(102) int local102 = Static52.method1009(arg0.anInt2813).anInt2083;
			if (local102 == -1) {
				arg0.anInt2813 = -1;
			} else {
				@Pc(109) Class1_Sub2_Sub17 local109 = Static34.method755(local102);
				if (local109 == null || local109.anIntArray410 == null) {
					arg0.anInt2813 = -1;
				} else {
					arg0.anInt2787++;
					if (local109.anIntArray410.length > arg0.anInt2792 && local109.anIntArray406[arg0.anInt2792] < arg0.anInt2787) {
						arg0.anInt2787 = 1;
						arg0.anInt2792++;
						Static54.method1022(arg0.anInt2792, arg0.anInt2832, arg0.anInt2827, local109);
					}
					if (arg0.anInt2792 >= local109.anIntArray410.length && (arg0.anInt2792 < 0 || local109.anIntArray410.length <= arg0.anInt2792)) {
						arg0.anInt2813 = -1;
					}
				}
			}
		}
		if (arg0.anInt2810 != -1 && arg0.anInt2829 <= 1) {
			local13 = Static34.method755(arg0.anInt2810);
			if (local13.anInt2354 == 1 && arg0.anInt2806 > 0 && Static60.anInt1366 >= arg0.anInt2822 && arg0.anInt2803 < Static60.anInt1366) {
				arg0.anInt2829 = 1;
				return;
			}
		}
		if (arg0.anInt2810 != -1 && arg0.anInt2829 == 0) {
			local13 = Static34.method755(arg0.anInt2810);
			if (local13 == null || local13.anIntArray410 == null) {
				arg0.anInt2810 = -1;
			} else {
				arg0.anInt2807++;
				if (arg0.anInt2808 < local13.anIntArray410.length && local13.anIntArray406[arg0.anInt2808] < arg0.anInt2807) {
					arg0.anInt2807 = 1;
					arg0.anInt2808++;
					Static54.method1022(arg0.anInt2808, arg0.anInt2832, arg0.anInt2827, local13);
				}
				if (arg0.anInt2808 >= local13.anIntArray410.length) {
					arg0.anInt2790++;
					arg0.anInt2808 -= local13.anInt2348;
					if (arg0.anInt2790 >= local13.anInt2351) {
						arg0.anInt2810 = -1;
					} else if (arg0.anInt2808 >= 0 && local13.anIntArray410.length > arg0.anInt2808) {
						Static54.method1022(arg0.anInt2808, arg0.anInt2832, arg0.anInt2827, local13);
					} else {
						arg0.anInt2810 = -1;
					}
				}
				arg0.aBoolean124 = local13.aBoolean108;
			}
		}
		if (arg0.anInt2829 > 0) {
			arg0.anInt2829--;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static118.aClass4_1.method62(arg4, arg2, arg1);
		@Pc(48) int local48;
		@Pc(67) int local67;
		@Pc(52) int local52;
		@Pc(19) int local19;
		@Pc(41) int local41;
		@Pc(58) int local58;
		if (local7 != 0) {
			local19 = arg0;
			if (local7 > 0) {
				local19 = arg3;
			}
			local41 = arg2 * 4 + (-(arg1 * 512) + 52736) * 4 + 24624;
			local48 = Static118.aClass4_1.method57(arg4, arg2, arg1, local7);
			local52 = local48 & 0x1F;
			local58 = local7 >> 14 & 0x7FFF;
			@Pc(61) int[] local61 = Static60.aClass1_Sub2_Sub2_Sub1_6.anIntArray40;
			local67 = local48 >> 6 & 0x3;
			@Pc(73) Class1_Sub2_Sub6 local73 = Static78.method1315(local58);
			if (local73.anInt852 == -1) {
				if (local52 == 0 || local52 == 2) {
					if (local67 == 0) {
						local61[local41] = local19;
						local61[local41 + 512] = local19;
						local61[local41 + 1024] = local19;
						local61[local41 + 1536] = local19;
					} else if (local67 == 1) {
						local61[local41] = local19;
						local61[local41 + 1] = local19;
						local61[local41 + 2] = local19;
						local61[local41 + 3] = local19;
					} else if (local67 == 2) {
						local61[local41 + 3] = local19;
						local61[local41 + 3 + 512] = local19;
						local61[local41 + 3 + 1024] = local19;
						local61[local41 + 1536 + 3] = local19;
					} else if (local67 == 3) {
						local61[local41 + 1536] = local19;
						local61[local41 + 1 + 1536] = local19;
						local61[local41 + 1536 + 2] = local19;
						local61[local41 + 1536 + 3] = local19;
					}
				}
				if (local52 == 3) {
					if (local67 == 0) {
						local61[local41] = local19;
					} else if (local67 == 1) {
						local61[local41 + 3] = local19;
					} else if (local67 == 2) {
						local61[local41 + 3 + 1536] = local19;
					} else if (local67 == 3) {
						local61[local41 + 1536] = local19;
					}
				}
				if (local52 == 2) {
					if (local67 == 3) {
						local61[local41] = local19;
						local61[local41 + 512] = local19;
						local61[local41 + 1024] = local19;
						local61[local41 + 1536] = local19;
					} else if (local67 == 0) {
						local61[local41] = local19;
						local61[local41 + 1] = local19;
						local61[local41 + 2] = local19;
						local61[local41 + 3] = local19;
					} else if (local67 == 1) {
						local61[local41 + 3] = local19;
						local61[local41 + 3 + 512] = local19;
						local61[local41 + 3 + 1024] = local19;
						local61[local41 + 1539] = local19;
					} else if (local67 == 2) {
						local61[local41 + 1536] = local19;
						local61[local41 + 1536 + 1] = local19;
						local61[local41 + 1536 + 2] = local19;
						local61[local41 + 3 + 1536] = local19;
					}
				}
			} else {
				@Pc(392) Class1_Sub2_Sub2_Sub4 local392 = Static104.aClass1_Sub2_Sub2_Sub4Array9[local73.anInt852];
				if (local392 != null) {
					@Pc(405) int local405 = (local73.anInt845 * 4 - local392.anInt2756) / 2;
					@Pc(416) int local416 = (local73.anInt857 * 4 - local392.anInt2758) / 2;
					local392.method1953(local405 + arg2 * 4 + 48, (-local73.anInt857 + (104 - arg1)) * 4 + 48 - -local416);
				}
			}
		}
		local7 = Static118.aClass4_1.method60(arg4, arg2, arg1);
		if (local7 != 0) {
			local48 = Static118.aClass4_1.method57(arg4, arg2, arg1, local7);
			local67 = local48 >> 6 & 0x3;
			local52 = local48 & 0x1F;
			local19 = local7 >> 14 & 0x7FFF;
			@Pc(474) Class1_Sub2_Sub6 local474 = Static78.method1315(local19);
			@Pc(512) int local512;
			if (local474.anInt852 != -1) {
				@Pc(582) Class1_Sub2_Sub2_Sub4 local582 = Static104.aClass1_Sub2_Sub2_Sub4Array9[local474.anInt852];
				if (local582 != null) {
					local58 = (local474.anInt845 * 4 - local582.anInt2756) / 2;
					local512 = (local474.anInt857 * 4 - local582.anInt2758) / 2;
					local582.method1953(local58 + arg2 * 4 + 48, (104 - (arg1 - -local474.anInt857)) * 4 + 48 + local512);
				}
			} else if (local52 == 9) {
				@Pc(487) int[] local487 = Static60.aClass1_Sub2_Sub2_Sub1_6.anIntArray40;
				local41 = 15658734;
				if (local7 > 0) {
					local41 = 15597568;
				}
				local512 = arg2 * 4 + (-arg1 + 103) * 4 * 512 + 24624;
				if (local67 == 0 || local67 == 2) {
					local487[local512 + 1536] = local41;
					local487[local512 + 1 + 1024] = local41;
					local487[local512 + 512 + 2] = local41;
					local487[local512 + 3] = local41;
				} else {
					local487[local512] = local41;
					local487[local512 + 512 + 1] = local41;
					local487[local512 + 1024 + 2] = local41;
					local487[local512 + 3 + 1536] = local41;
				}
			}
		}
		local7 = Static118.aClass4_1.method90(arg4, arg2, arg1);
		if (local7 == 0) {
			return;
		}
		local48 = local7 >> 14 & 0x7FFF;
		@Pc(650) Class1_Sub2_Sub6 local650 = Static78.method1315(local48);
		if (local650.anInt852 == -1) {
			return;
		}
		@Pc(659) Class1_Sub2_Sub2_Sub4 local659 = Static104.aClass1_Sub2_Sub2_Sub4Array9[local650.anInt852];
		if (local659 != null) {
			@Pc(672) int local672 = (local650.anInt857 * 4 - local659.anInt2758) / 2;
			local19 = (local650.anInt845 * 4 - local659.anInt2756) / 2;
			local659.method1953(local19 + arg2 * 4 + 48, (-local650.anInt857 + -arg1 + 104) * 4 + 48 + local672);
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!ob;")
	public static Class1_Sub2_Sub14 method968(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static56.aClass1_Sub2_Sub14ArrayArray1[local7] == null || Static56.aClass1_Sub2_Sub14ArrayArray1[local7][local18] == null) {
			@Pc(32) boolean local32 = Static57.method1727(local7);
			if (!local32) {
				return null;
			}
		}
		return Static56.aClass1_Sub2_Sub14ArrayArray1[local7][local18];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lclient!ma;")
	public static Class1_Sub2_Sub2_Sub3 method969() {
		@Pc(8) Class1_Sub2_Sub2_Sub3 local8 = new Class1_Sub2_Sub2_Sub3(Static62.anIntArray267, Static88.anIntArray349, Static100.anIntArray402, Static1.anIntArray10, Static13.aByteArrayArray1);
		Static99.method1649();
		return local8;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method970() {
		if (Static61.anInt1383 != 0 && Static61.anInt1383 != 3 || Static11.anInt277 != 1) {
			return;
		}
		@Pc(22) int local22 = Static23.anInt675 - 5 - 4;
		@Pc(28) int local28 = Static30.anInt815 - 550 - 25;
		if (local28 < 0 || local22 < 0 || local28 >= 146 || local22 >= 151) {
			return;
		}
		local22 -= 75;
		local28 -= 73;
		@Pc(56) int local56 = Static23.anInt673 + Static54.anInt1298 & 0x7FF;
		@Pc(60) int local60 = Class1_Sub2_Sub2_Sub2.anIntArray189[local56];
		@Pc(64) int local64 = Class1_Sub2_Sub2_Sub2.anIntArray185[local56];
		@Pc(72) int local72 = local60 * (Static129.anInt2953 + 256) >> 8;
		@Pc(80) int local80 = (Static129.anInt2953 + 256) * local64 >> 8;
		@Pc(91) int local91 = local22 * local80 - local28 * local72 >> 11;
		@Pc(98) int local98 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 - local91 >> 7;
		@Pc(108) int local108 = local22 * local72 + local80 * local28 >> 11;
		@Pc(115) int local115 = local108 + Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7;
		@Pc(135) boolean local135 = Static81.method1376(true, 0, 1, 0, 0, local98, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local115);
		if (!local135) {
			return;
		}
		Static68.aClass1_Sub5_Sub1_2.method676(local28);
		Static68.aClass1_Sub5_Sub1_2.method676(local22);
		Static68.aClass1_Sub5_Sub1_2.method675(Static54.anInt1298);
		Static68.aClass1_Sub5_Sub1_2.method676(57);
		Static68.aClass1_Sub5_Sub1_2.method676(Static23.anInt673);
		Static68.aClass1_Sub5_Sub1_2.method676(Static129.anInt2953);
		Static68.aClass1_Sub5_Sub1_2.method676(89);
		Static68.aClass1_Sub5_Sub1_2.method675(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832);
		Static68.aClass1_Sub5_Sub1_2.method675(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827);
		Static68.aClass1_Sub5_Sub1_2.method676(Static106.anInt2479);
		Static68.aClass1_Sub5_Sub1_2.method676(63);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method971() {
		aByteArrayArray3 = null;
		aClass25_500 = null;
		aClass25_499 = null;
		aClass25_493 = null;
		aClass25_498 = null;
		aClass25_494 = null;
		aClass25_496 = null;
		aClass25_501 = null;
		aClass25_497 = null;
		aClass25_492 = null;
		anIntArray240 = null;
		aClass1_Sub2_Sub2_Sub3_2 = null;
		aByteArrayArray2 = null;
		aClass25_495 = null;
		aClass56_43 = null;
		anIntArray239 = null;
	}
}
