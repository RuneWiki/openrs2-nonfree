import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[S")
	public static short[] aShortArray15;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array2;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!od;")
	private static Class60 aClass60_402 = method597("Please wait)3)3)3");

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_398 = aClass60_402;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
	public static short[] aShortArray16 = new short[] { -1, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_399 = method597("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!od;")
	private static Class60 aClass60_404 = method597("Loaded config");

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_400 = aClass60_404;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!ud;")
	public static Class75 aClass75_6 = new Class75(4096);

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_401 = method597("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
	public static int[] anIntArray114 = new int[25];

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_403 = method597("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_405 = method597("<)4col>");

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_406 = aClass60_399;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public static int anInt1083 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public static void method592() {
		aShortArray15 = null;
		anIntArray114 = null;
		aShortArray16 = null;
		aClass75_6 = null;
		aClass60_405 = null;
		aClass60_404 = null;
		aClass60_400 = null;
		aClass60_399 = null;
		aClass60_402 = null;
		aClass60_403 = null;
		aClass60_406 = null;
		aClass60_398 = null;
		aClass4_Sub3_Sub6_Sub3Array2 = null;
		aClass60_401 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
	public static int method593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return (arg1 / 32 << 7) + (arg2 / 4 << 10) + arg0 / 2;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public static int method594() {
		return Static72.anInt1824++;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public static void method595(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static47.method649(Static67.aClass60_647, Static63.aClass60_614, Static5.aClass60_34);
		} else if (arg0 == -2) {
			Static47.method649(Static77.aClass60_777, Static63.aClass60_588, Static63.aClass60_590);
		} else if (arg0 == -1) {
			Static47.method649(Static67.aClass60_648, Static63.aClass60_615, Static56.aClass60_549);
		} else if (arg0 == 3) {
			Static47.method649(Static52.aClass60_513, Static63.aClass60_616, Static63.aClass60_613);
		} else if (arg0 == 4) {
			Static47.method649(Static12.aClass60_1000, Static63.aClass60_599, Static70.aClass60_698);
		} else if (arg0 == 5) {
			Static47.method649(Static68.aClass60_686, Static63.aClass60_595, Static124.aClass60_1102);
		} else if (arg0 == 6) {
			Static47.method649(Static32.aClass60_327, Static63.aClass60_625, Static81.aClass60_798);
		} else if (arg0 == 7) {
			Static47.method649(Static33.aClass60_336, Static63.aClass60_606, Static54.aClass60_522);
		} else if (arg0 == 8) {
			Static47.method649(Static6.aClass60_47, Static63.aClass60_600, Static78.aClass60_787);
		} else if (arg0 == 9) {
			Static47.method649(Static32.aClass60_331, Static63.aClass60_602, Static110.aClass60_1015);
		} else if (arg0 == 10) {
			Static47.method649(Static25.aClass60_276, Static63.aClass60_604, Static78.aClass60_784);
		} else if (arg0 == 11) {
			Static47.method649(Static110.aClass60_1013, Static63.aClass60_610, Static20.aClass60_212);
		} else if (arg0 == 12) {
			Static47.method649(aClass60_406, Static63.aClass60_589, Static55.aClass60_541);
		} else if (arg0 == 13) {
			Static47.method649(Static67.aClass60_646, Static63.aClass60_624, Static62.aClass60_581);
		} else if (arg0 == 14) {
			Static47.method649(Static61.aClass60_574, Static63.aClass60_623, Static116.aClass60_1055);
		} else if (arg0 == 16) {
			Static47.method649(Static47.aClass60_434, Static63.aClass60_608, Static1.aClass60_1);
		} else if (arg0 == 17) {
			Static47.method649(Static53.aClass60_515, Static63.aClass60_618, Static46.aClass60_425);
		} else if (arg0 == 18) {
			Static47.method649(Static123.aClass60_1092, Static63.aClass60_601, Static103.aClass60_967);
		} else if (arg0 == 19) {
			Static47.method649(Static80.aClass60_792, Static33.aClass60_334, Static60.aClass60_1149);
		} else if (arg0 == 20) {
			Static47.method649(Static67.aClass60_641, Static63.aClass60_621, Static37.aClass60_374);
		} else if (arg0 == 22) {
			Static47.method649(Static106.aClass60_986, Static63.aClass60_617, Static80.aClass60_791);
		} else if (arg0 == 23) {
			Static47.method649(Static61.aClass60_576, Static63.aClass60_605, Static27.aClass60_291);
		} else if (arg0 == 24) {
			Static47.method649(Static36.aClass60_367, Static63.aClass60_594, Static117.aClass60_1062);
		} else if (arg0 == 25) {
			Static47.method649(Static67.aClass60_642, Static63.aClass60_603, Static66.aClass60_637);
		} else if (arg0 == 26) {
			Static47.method649(Static51.aClass60_491, Static63.aClass60_619, Static15.aClass60_1031);
		} else if (arg0 == 27) {
			Static47.method649(Static10.aClass60_101, Static63.aClass60_612, Static63.aClass60_620);
		} else {
			Static47.method649(Static67.aClass60_643, Static63.aClass60_596, Static121.aClass60_1085);
		}
		Static32.method496(10);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!c;II)Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 method596(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static110.method1825(arg1, arg2, arg0) ? Static125.method1933() : null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)Lclient!od;")
	public static Class60 method597(@OriginalArg(1) String arg0) {
		@Pc(5) int local5 = 0;
		@Pc(16) byte[] local16 = arg0.getBytes();
		@Pc(19) int local19 = local16.length;
		@Pc(23) Class60 local23 = new Class60();
		local23.aByteArray21 = new byte[local19];
		while (local19 > local5) {
			@Pc(35) int local35 = local16[local5++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local5 >= local19) {
					break;
				}
				@Pc(51) int local51 = local16[local5++] & 0xFF;
				local23.aByteArray21[local23.anInt1991++] = (byte) ((local35 - 40) * 43 + local51 - 48);
			} else if (local35 != 0) {
				local23.aByteArray21[local23.anInt1991++] = (byte) local35;
			}
		}
		local23.method1335();
		return local23.method1346();
	}
}
