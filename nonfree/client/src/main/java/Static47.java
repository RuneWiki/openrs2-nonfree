import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public static int anInt1204;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public static int anInt1205;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	public static int anInt1211;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Z")
	public static boolean aBoolean50;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_505 = Static78.method1313("Loaded wordpack");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_502 = aClass25_505;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public static int anInt1203 = -1;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public static int anInt1209 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!fc;")
	private static Class25 aClass25_503 = Static78.method1313("Sorry invited players only)3");

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_504 = Static78.method1313("l");

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_506 = aClass25_503;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public static volatile int anInt1213 = 0;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "[I")
	public static int[] anIntArray241 = new int[200];

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	public static int anInt1217 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII[Lclient!ob;IIIILclient!ob;)Lclient!ob;")
	public static Class1_Sub2_Sub14 method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub14[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class1_Sub2_Sub14 arg10) {
		if (arg0 < arg7 || arg9 < arg3 || arg0 >= arg5 || arg9 >= arg1) {
			return null;
		}
		for (@Pc(29) int local29 = 0; local29 < arg6.length; local29++) {
			@Pc(35) Class1_Sub2_Sub14 local35 = arg6[local29];
			if (local35 != null && arg8 == local35.anInt1905 && !Static39.method890(local35) && arg10 != local35) {
				@Pc(61) int local61 = arg7 + local35.anInt1959 - arg2;
				@Pc(68) int local68 = arg3 + local35.anInt1917 - arg4;
				if (local35.anInt1960 == 0) {
					@Pc(94) Class1_Sub2_Sub14 local94 = method972(arg0, local35.anInt1923 + local68, local35.anInt1949, local68, local35.anInt1957, local61 + local35.anInt1911, arg6, local61, local35.anInt1937, arg9, arg10);
					if (local94 != null) {
						return local94;
					}
					if (local35.aClass1_Sub2_Sub14Array2 != null) {
						local94 = method972(arg0, local35.anInt1923 + local68, local35.anInt1949, local68, local35.anInt1957, local61 + local35.anInt1911, local35.aClass1_Sub2_Sub14Array2, local61, local35.anInt1937, arg9, arg10);
						if (local94 != null) {
							return local94;
						}
					}
				}
				if (Static34.method754(Static77.method1300(local35)) && arg0 >= local61 && arg9 >= local68 && arg0 < local61 + local35.anInt1911 && arg9 < local68 + local35.anInt1923) {
					return local35;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method973(@OriginalArg(1) Class56 arg0) {
		Static12.aClass56_11 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!oc;Lclient!fc;Lclient!fc;)Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 method974(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(8) int local8 = arg0.method1278(arg1);
		@Pc(14) int local14 = arg0.method1264(arg2, local8);
		return Static37.method856(arg0, local14, local8);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method975() {
		aClass25_502 = null;
		aClass25_505 = null;
		aClass25_506 = null;
		anIntArray241 = null;
		aClass1_Sub2_Sub2_Sub1_4 = null;
		aClass25_504 = null;
		aClass25_503 = null;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] method976() {
		@Pc(8) Class1_Sub2_Sub2_Sub1[] local8 = new Class1_Sub2_Sub2_Sub1[Static60.anInt1363];
		for (@Pc(10) int local10 = 0; local10 < Static60.anInt1363; local10++) {
			@Pc(20) Class1_Sub2_Sub2_Sub1 local20 = local8[local10] = new Class1_Sub2_Sub2_Sub1();
			local20.anInt213 = Static39.anInt1092;
			local20.anInt211 = Static1.anInt20;
			local20.anInt212 = Static111.anIntArray434[local10];
			local20.anInt214 = Static62.anIntArray267[local10];
			local20.anInt215 = Static88.anIntArray349[local10];
			local20.anInt210 = Static100.anIntArray402[local10];
			@Pc(52) int local52 = local20.anInt210 * local20.anInt215;
			@Pc(56) byte[] local56 = Static13.aByteArrayArray1[local10];
			local20.anIntArray40 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray40[local62] = Static1.anIntArray10[local56[local62] & 0xFF];
			}
		}
		Static99.method1649();
		return local8;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public static void method977(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static114.method1829(Static75.aClass25_774, Static56.aClass25_567, Static46.aClass25_501);
		} else if (arg0 == -2) {
			Static114.method1829(Static75.aClass25_746, Static75.aClass25_756, Static105.aClass25_1140);
		} else if (arg0 == -1) {
			Static114.method1829(Static75.aClass25_761, Static9.aClass25_138, Static46.aClass25_499);
		} else if (arg0 == 3) {
			Static114.method1829(Static75.aClass25_757, Static75.aClass25_771, Static60.aClass25_596);
		} else if (arg0 == 4) {
			Static114.method1829(Static75.aClass25_770, Static66.aClass25_676, Static99.aClass25_1090);
		} else if (arg0 == 5) {
			Static114.method1829(Static75.aClass25_764, Static24.aClass25_298, Static84.aClass25_918);
		} else if (arg0 == 6) {
			Static114.method1829(Static75.aClass25_742, Static8.aClass25_131, Static60.aClass25_598);
		} else if (arg0 == 7) {
			Static114.method1829(Static75.aClass25_767, Static58.aClass25_583, Static35.aClass25_409);
		} else if (arg0 == 8) {
			Static114.method1829(Static75.aClass25_753, Static119.aClass25_1339, Static5.aClass25_51);
		} else if (arg0 == 9) {
			Static114.method1829(Static75.aClass25_777, Static78.aClass25_826, Static46.aClass25_492);
		} else if (arg0 == 10) {
			Static114.method1829(Static75.aClass25_766, Static119.aClass25_1342, Static15.aClass25_216);
		} else if (arg0 == 11) {
			Static114.method1829(Static75.aClass25_750, Static11.aClass25_152, Static1.aClass25_15);
		} else if (arg0 == 12) {
			Static114.method1829(Static75.aClass25_768, Static37.aClass25_428, Static42.aClass25_476);
		} else if (arg0 == 13) {
			Static114.method1829(Static75.aClass25_740, Static62.aClass25_625, Static46.aClass25_493);
		} else if (arg0 == 14) {
			Static114.method1829(Static75.aClass25_741, Static61.aClass25_618, Static63.aClass25_640);
		} else if (arg0 == 16) {
			Static114.method1829(Static75.aClass25_773, Static9.aClass25_132, Static107.aClass25_1186);
		} else if (arg0 == 17) {
			Static114.method1829(Static75.aClass25_759, Static61.aClass25_611, Static58.aClass25_584);
		} else if (arg0 == 18) {
			Static114.method1829(Static75.aClass25_778, Static106.aClass25_1172, Static6.aClass25_54);
		} else if (arg0 == 19) {
			Static114.method1829(Static35.aClass25_411, Static35.aClass25_407, aClass25_506);
		} else if (arg0 == 20) {
			Static114.method1829(Static75.aClass25_745, Static97.aClass25_1087, Static46.aClass25_497);
		} else if (arg0 == 22) {
			Static114.method1829(Static75.aClass25_749, Static37.aClass25_431, Static15.aClass25_214);
		} else if (arg0 == 23) {
			Static114.method1829(Static75.aClass25_744, Static93.aClass25_998, Static63.aClass25_642);
		} else if (arg0 == 24) {
			Static114.method1829(Static75.aClass25_775, Static74.aClass25_732, Static50.aClass25_522);
		} else if (arg0 == 25) {
			Static114.method1829(Static75.aClass25_747, Static102.aClass25_1122, Static46.aClass25_496);
		} else if (arg0 == 26) {
			Static114.method1829(Static75.aClass25_765, Static67.aClass25_681, Static26.aClass25_321);
		} else if (arg0 == 27) {
			Static114.method1829(Static75.aClass25_758, Static75.aClass25_754, Static42.aClass25_469);
		} else {
			Static114.method1829(Static75.aClass25_776, Static95.aClass25_1036, Static46.aClass25_494);
		}
		Static99.method1645(10);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) Static67.aClass66_10.method1650((long) arg1);
		if (local12 == null) {
			local12 = new Class1_Sub1();
			Static67.aClass66_10.method1653(local12, (long) arg1);
		}
		if (local12.anIntArray9.length <= arg2) {
			@Pc(34) int[] local34 = new int[arg2 + 1];
			@Pc(39) int[] local39 = new int[arg2 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray9.length; local41++) {
				local34[local41] = local12.anIntArray9[local41];
				local39[local41] = local12.anIntArray11[local41];
			}
			for (@Pc(67) int local67 = local12.anIntArray9.length; local67 < arg2; local67++) {
				local34[local67] = -1;
				local39[local67] = 0;
			}
			local12.anIntArray11 = local39;
			local12.anIntArray9 = local34;
		}
		local12.anIntArray9[arg2] = arg3;
		local12.anIntArray11[arg2] = arg0;
	}
}
