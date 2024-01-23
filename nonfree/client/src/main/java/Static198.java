import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!hc;")
	public static Class51 aClass51_66;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!hc;")
	public static Class51 aClass51_67;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	public static int anInt4582 = 0;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "J")
	public static long aLong151 = 0L;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public static int anInt4590 = 0;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt4594 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)V")
	public static void method3467() {
		@Pc(7) byte[][] local7 = Static254.aByteArrayArray13;
		@Pc(12) int local12 = local7.length;
		@Pc(30) int local30;
		@Pc(41) int local41;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(18) int[] local18 = null;
			@Pc(24) int local24 = Static169.anIntArray298[local14] & 0xFF;
			local30 = Static169.anIntArray298[local14] >> 8;
			@Pc(34) byte[] local34 = local7[local14];
			local41 = local30 * 64 - Static64.anInt1786;
			@Pc(48) int local48 = local24 * 64 - Static29.anInt907;
			if (local34 != null) {
				Static98.method2086();
				local18 = Static208.method3459(local34, Static47.aClass65Array1, local48, local41, Static64.anInt1786, Static29.anInt907);
			}
			if (Static165.anInt3877 / 8 == local30 && local24 == Static261.anInt5479 / 8) {
				if (local18 == null) {
					Static54.anInt1509 = -1;
				} else {
					Static29.anInt910 = local18[1];
					Static66.anInt1837 = local18[3];
					Static54.anInt1509 = local18[0];
					Static117.anInt3032 = local18[2];
					Static33.anInt5179 = local18[4];
				}
			}
		}
		for (@Pc(114) int local114 = 0; local114 < local12; local114++) {
			@Pc(132) int local132 = (Static169.anIntArray298[local114] >> 8) * 64 - Static64.anInt1786;
			local30 = (Static169.anIntArray298[local114] & 0xFF) * 64 - Static29.anInt907;
			@Pc(147) byte[] local147 = local7[local114];
			if (local147 == null && Static261.anInt5479 < 800) {
				Static98.method2086();
				for (local41 = 0; local41 < 4; local41++) {
					Static127.method2421(64, local41, local30, local132, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hc;B)V")
	public static void method3468(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!tl;")
	public static Class1_Sub3 method3469(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub3_Sub12();
		} else if (arg0 == 1) {
			return new Class1_Sub3_Sub13();
		} else if (arg0 == 2) {
			return new Class1_Sub3_Sub39();
		} else if (arg0 == 3) {
			return new Class1_Sub3_Sub26();
		} else if (arg0 == 4) {
			return new Class1_Sub3_Sub2();
		} else if (arg0 == 5) {
			return new Class1_Sub3_Sub38();
		} else if (arg0 == 6) {
			return new Class1_Sub3_Sub20();
		} else if (arg0 == 7) {
			return new Class1_Sub3_Sub37();
		} else if (arg0 == 8) {
			return new Class1_Sub3_Sub21();
		} else if (arg0 == 9) {
			return new Class1_Sub3_Sub15();
		} else if (arg0 == 10) {
			return new Class1_Sub3_Sub34();
		} else if (arg0 == 11) {
			return new Class1_Sub3_Sub16();
		} else if (arg0 == 12) {
			return new Class1_Sub3_Sub19();
		} else if (arg0 == 13) {
			return new Class1_Sub3_Sub31();
		} else if (arg0 == 14) {
			return new Class1_Sub3_Sub22();
		} else if (arg0 == 15) {
			return new Class1_Sub3_Sub4();
		} else if (arg0 == 16) {
			return new Class1_Sub3_Sub32();
		} else if (arg0 == 17) {
			return new Class1_Sub3_Sub24();
		} else if (arg0 == 18) {
			return new Class1_Sub3_Sub5_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub3_Sub7();
		} else if (arg0 == 20) {
			return new Class1_Sub3_Sub1();
		} else if (arg0 == 21) {
			return new Class1_Sub3_Sub23();
		} else if (arg0 == 22) {
			return new Class1_Sub3_Sub29();
		} else if (arg0 == 23) {
			return new Class1_Sub3_Sub18();
		} else if (arg0 == 24) {
			return new Class1_Sub3_Sub27();
		} else if (arg0 == 25) {
			return new Class1_Sub3_Sub17();
		} else if (arg0 == 26) {
			return new Class1_Sub3_Sub11();
		} else if (arg0 == 27) {
			return new Class1_Sub3_Sub25();
		} else if (arg0 == 28) {
			return new Class1_Sub3_Sub36();
		} else if (arg0 == 29) {
			return new Class1_Sub3_Sub8();
		} else if (arg0 == 30) {
			return new Class1_Sub3_Sub28();
		} else if (arg0 == 31) {
			return new Class1_Sub3_Sub6();
		} else if (arg0 == 32) {
			return new Class1_Sub3_Sub35();
		} else if (arg0 == 33) {
			return new Class1_Sub3_Sub9();
		} else if (arg0 == 34) {
			return new Class1_Sub3_Sub30();
		} else if (arg0 == 35) {
			return new Class1_Sub3_Sub33();
		} else if (arg0 == 36) {
			return new Class1_Sub3_Sub3();
		} else if (arg0 == 37) {
			return new Class1_Sub3_Sub14();
		} else if (arg0 == 38) {
			return new Class1_Sub3_Sub10();
		} else if (arg0 == 39) {
			return new Class1_Sub3_Sub5();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method3472() {
		Static26.method382();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static47.aClass65Array1[local13].method2206();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB[Lclient!se;IZ)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class122[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(14) Class122 local14 = arg2[local3];
			if (local14 != null && local14.anInt4703 == arg1) {
				Static136.method2543(arg4, arg3, local14, arg0);
				Static3.method39(arg3, arg0, local14);
				if (local14.anInt4673 > local14.anInt4725 - local14.anInt4695) {
					local14.anInt4673 = local14.anInt4725 - local14.anInt4695;
				}
				if (local14.anInt4715 - local14.anInt4726 < local14.anInt4653) {
					local14.anInt4653 = local14.anInt4715 - local14.anInt4726;
				}
				if (local14.anInt4673 < 0) {
					local14.anInt4673 = 0;
				}
				if (local14.anInt4653 < 0) {
					local14.anInt4653 = 0;
				}
				if (local14.anInt4656 == 0) {
					Static147.method2678(arg4, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3474(@OriginalArg(1) String arg0) {
		if (Static203.anInt4493 >= 2) {
			@Pc(16) int local16;
			@Pc(25) Runtime local25;
			@Pc(34) int local34;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static129.method2455();
				for (local16 = 0; local16 < 10; local16++) {
					System.gc();
				}
				local25 = Runtime.getRuntime();
				local34 = (int) ((local25.totalMemory() - local25.freeMemory()) / 1024L);
				Static50.method1013(null, "mem=" + local34 + "k", 0);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static129.method2455();
				for (local16 = 0; local16 < 10; local16++) {
					System.gc();
				}
				local25 = Runtime.getRuntime();
				local34 = (int) ((local25.totalMemory() - local25.freeMemory()) / 1024L);
				Static50.method1013(null, "Memory before cleanup=" + local34 + "k", 0);
				Static12.method228();
				Static129.method2455();
				for (@Pc(93) int local93 = 0; local93 < 10; local93++) {
					System.gc();
				}
				local34 = (int) ((local25.totalMemory() - local25.freeMemory()) / 1024L);
				Static50.method1013(null, "Memory after cleanup=" + local34 + "k", 0);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static50.method1013(null, "Number of player models in cache:" + Static83.method1672(), 0);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static250.method4059();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static196.aClass18_2.method439();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static196.aClass18_2.method433();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static38.aClass28_1.method726();
				Static34.aClass109_2.method3147();
				Static196.aClass18_2.method437();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static64.aBoolean99 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static168.method2918(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static266.aBoolean282 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static266.aBoolean282 = false;
			}
			if (arg0.startsWith("::setba")) {
				Static216.anInt4750 = Static195.method3280(arg0.substring(8));
				Static22.method2185(Static38.aClass28_1);
				Static2.aBoolean2 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static163.method2836(Static195.method3280(arg0.substring(15)));
				Static22.method2185(Static38.aClass28_1);
				Static2.aBoolean2 = false;
			}
			if (arg0.startsWith("::fps ") && Static25.anInt848 != 0) {
				Static151.method2718(Static195.method3280(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static242.anInt5228 = Static195.method3280(arg0.substring(12).trim());
				Static50.method1013(null, "rect_debug=" + Static242.anInt5228, 0);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static70.aBoolean113 = true;
			}
			arg0.startsWith("::hdr");
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static33.aBoolean265) {
					Static33.aBoolean265 = false;
					Static50.method1013(null, "Forced tweening disabled.", 0);
				} else {
					Static33.aBoolean265 = true;
					Static50.method1013(null, "Forced tweening ENABLED!", 0);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static202.aBoolean219) {
					System.out.println("Shift-click disabled.");
					Static202.aBoolean219 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static202.aBoolean219 = true;
				}
			}
		}
		Static171.aClass1_Sub13_Sub1_3.method1825(98);
		Static171.aClass1_Sub13_Sub1_3.method1766(arg0.length() - 1);
		Static171.aClass1_Sub13_Sub1_3.method1791(arg0.substring(2));
	}
}
