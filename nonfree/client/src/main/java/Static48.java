import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
	public static int[] anIntArray137 = new int[50];

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!je;")
	private static Class40 aClass40_631 = Static69.method1231("Could not complete login)3");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_632 = Static69.method1231("welle:");

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public static int anInt1295 = 0;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_633 = Static69.method1231("k");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!je;")
	public static Class40 aClass40_634 = Static69.method1231(")1p");

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_635 = Static69.method1231("au");

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_636 = Static69.method1231("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_637 = aClass40_631;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_638 = Static69.method1231("huffman");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ed;I)V")
	public static void method869(@OriginalArg(0) Class19 arg0) {
		Static47.aClass19_1 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method870() {
		if (Static91.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static122.anIntArray334[192] = 58;
			Static122.anIntArray334[190] = 72;
			Static122.anIntArray334[187] = 27;
			Static122.anIntArray334[220] = 74;
			Static122.anIntArray334[188] = 71;
			Static122.anIntArray334[221] = 43;
			Static122.anIntArray334[191] = 73;
			Static122.anIntArray334[219] = 42;
			Static122.anIntArray334[186] = 57;
			Static122.anIntArray334[189] = 26;
			Static122.anIntArray334[222] = 59;
			Static122.anIntArray334[223] = 28;
			return;
		}
		Static122.anIntArray334[93] = 43;
		Static122.anIntArray334[44] = 71;
		Static122.anIntArray334[45] = 26;
		Static122.anIntArray334[61] = 27;
		Static122.anIntArray334[47] = 73;
		Static122.anIntArray334[91] = 42;
		Static122.anIntArray334[92] = 74;
		Static122.anIntArray334[46] = 72;
		Static122.anIntArray334[59] = 57;
		if (Static91.aMethod2 == null) {
			Static122.anIntArray334[222] = 59;
			Static122.anIntArray334[192] = 58;
		} else {
			Static122.anIntArray334[520] = 59;
			Static122.anIntArray334[222] = 58;
			Static122.anIntArray334[192] = 28;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method871(@OriginalArg(1) int arg0) {
		Static47.method864();
		Static126.method2090();
		@Pc(14) int local14 = Static83.method1493(arg0).anInt2025;
		if (local14 == 0) {
			return;
		}
		@Pc(21) int local21 = Static35.anIntArray96[arg0];
		if (local14 == 1) {
			if (local21 == 1) {
				Static78.method1383(0.9D);
				((Class42) Static78.anInterface1_1).method1014(0.9D);
			}
			if (local21 == 2) {
				Static78.method1383(0.8D);
				((Class42) Static78.anInterface1_1).method1014(0.8D);
			}
			if (local21 == 3) {
				Static78.method1383(0.7D);
				((Class42) Static78.anInterface1_1).method1014(0.7D);
			}
			if (local21 == 4) {
				Static78.method1383(0.6D);
				((Class42) Static78.anInterface1_1).method1014(0.6D);
			}
			Static102.method1802();
		}
		if (local14 == 3) {
			@Pc(79) short local79 = 0;
			if (local21 == 0) {
				local79 = 255;
			}
			if (local21 == 1) {
				local79 = 192;
			}
			if (local21 == 2) {
				local79 = 128;
			}
			if (local21 == 3) {
				local79 = 64;
			}
			if (local21 == 4) {
				local79 = 0;
			}
			if (Static81.anInt2089 != local79) {
				if (Static81.anInt2089 == 0 && Static79.anInt2069 != -1) {
					Static52.method940(Static79.anInt2069, 0, Static61.aClass24_Sub1_8, local79);
					Static86.aBoolean247 = false;
				} else if (local79 == 0) {
					Static52.method939();
					Static86.aBoolean247 = false;
				} else {
					Static74.method659(local79);
				}
				Static81.anInt2089 = local79;
			}
		}
		if (local14 == 5) {
			Static23.anInt650 = local21;
		}
		if (local14 == 4) {
			if (local21 == 0) {
				Static66.anInt1735 = 127;
			}
			if (local21 == 1) {
				Static66.anInt1735 = 96;
			}
			if (local21 == 2) {
				Static66.anInt1735 = 64;
			}
			if (local21 == 3) {
				Static66.anInt1735 = 32;
			}
			if (local21 == 4) {
				Static66.anInt1735 = 0;
			}
		}
		if (local14 == 6) {
			Static109.anInt2955 = local21;
		}
		if (local14 == 10) {
			if (local21 == 0) {
				Static106.anInt2536 = 127;
			}
			if (local21 == 1) {
				Static106.anInt2536 = 96;
			}
			if (local21 == 2) {
				Static106.anInt2536 = 64;
			}
			if (local21 == 3) {
				Static106.anInt2536 = 32;
			}
			if (local21 == 4) {
				Static106.anInt2536 = 0;
			}
		}
		if (local14 == 9) {
			Static10.anInt2973 = local21;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public static void method872() {
		aByteArrayArrayArray8 = null;
		aClass40_635 = null;
		aClass40_637 = null;
		aClass40_636 = null;
		aClass40_634 = null;
		aClass40_638 = null;
		aClass40_631 = null;
		aClass40_633 = null;
		anIntArray137 = null;
		aClass40_632 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZII)I")
	public static int method873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(11) int local11 = arg1 / arg0;
		@Pc(17) int local17 = arg0 - 1 & arg2;
		@Pc(22) int local22 = Static92.method1659(local7, local11);
		@Pc(29) int local29 = Static92.method1659(local7 + 1, local11);
		@Pc(36) int local36 = Static92.method1659(local7, local11 + 1);
		@Pc(42) int local42 = arg0 - 1 & arg1;
		@Pc(56) int local56 = Static92.method1659(local7 + 1, local11 + 1);
		@Pc(63) int local63 = Static11.method208(arg0, local22, local29, local17);
		@Pc(70) int local70 = Static11.method208(arg0, local36, local56, local17);
		return Static11.method208(arg0, local63, local70, local42);
	}
}
