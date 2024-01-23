import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "[[Lclient!fn;")
	public static Class2_Sub12[][] aClass2_Sub12ArrayArray1;

	@OriginalMember(owner = "client!fi", name = "eb", descriptor = "Lclient!jd;")
	public static Class84 aClass84_32;

	@OriginalMember(owner = "client!fi", name = "gb", descriptor = "Lclient!co;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "Lclient!ec;")
	public static Class46 aClass46_9 = new Class46(50);

	@OriginalMember(owner = "client!fi", name = "db", descriptor = "[Lclient!cj;")
	public static Class30[] aClass30Array1 = new Class30[50];

	@OriginalMember(owner = "client!fi", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString82 = "wave2:";

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lclient!ua;")
	public static Class2_Sub1 method1362(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub1_Sub12();
		} else if (arg0 == 1) {
			return new Class2_Sub1_Sub34();
		} else if (arg0 == 2) {
			return new Class2_Sub1_Sub27();
		} else if (arg0 == 3) {
			return new Class2_Sub1_Sub38();
		} else if (arg0 == 4) {
			return new Class2_Sub1_Sub21();
		} else if (arg0 == 5) {
			return new Class2_Sub1_Sub23();
		} else if (arg0 == 6) {
			return new Class2_Sub1_Sub37();
		} else if (arg0 == 7) {
			return new Class2_Sub1_Sub5();
		} else if (arg0 == 8) {
			return new Class2_Sub1_Sub4();
		} else if (arg0 == 9) {
			return new Class2_Sub1_Sub39();
		} else if (arg0 == 10) {
			return new Class2_Sub1_Sub6();
		} else if (arg0 == 11) {
			return new Class2_Sub1_Sub9();
		} else if (arg0 == 12) {
			return new Class2_Sub1_Sub29();
		} else if (arg0 == 13) {
			return new Class2_Sub1_Sub14();
		} else if (arg0 == 14) {
			return new Class2_Sub1_Sub33();
		} else if (arg0 == 15) {
			return new Class2_Sub1_Sub19();
		} else if (arg0 == 16) {
			return new Class2_Sub1_Sub11();
		} else if (arg0 == 17) {
			return new Class2_Sub1_Sub36();
		} else if (arg0 == 18) {
			return new Class2_Sub1_Sub1_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub1_Sub24();
		} else if (arg0 == 20) {
			return new Class2_Sub1_Sub18();
		} else if (arg0 == 21) {
			return new Class2_Sub1_Sub17();
		} else if (arg0 == 22) {
			return new Class2_Sub1_Sub2();
		} else if (arg0 == 23) {
			return new Class2_Sub1_Sub22();
		} else if (arg0 == 24) {
			return new Class2_Sub1_Sub15();
		} else if (arg0 == 25) {
			return new Class2_Sub1_Sub25();
		} else if (arg0 == 26) {
			return new Class2_Sub1_Sub3();
		} else if (arg0 == 27) {
			return new Class2_Sub1_Sub16();
		} else if (arg0 == 28) {
			return new Class2_Sub1_Sub13();
		} else if (arg0 == 29) {
			return new Class2_Sub1_Sub8();
		} else if (arg0 == 30) {
			return new Class2_Sub1_Sub31();
		} else if (arg0 == 31) {
			return new Class2_Sub1_Sub30();
		} else if (arg0 == 32) {
			return new Class2_Sub1_Sub28();
		} else if (arg0 == 33) {
			return new Class2_Sub1_Sub7();
		} else if (arg0 == 34) {
			return new Class2_Sub1_Sub35();
		} else if (arg0 == 35) {
			return new Class2_Sub1_Sub32();
		} else if (arg0 == 36) {
			return new Class2_Sub1_Sub26();
		} else if (arg0 == 37) {
			return new Class2_Sub1_Sub20();
		} else if (arg0 == 38) {
			return new Class2_Sub1_Sub10();
		} else if (arg0 == 39) {
			return new Class2_Sub1_Sub1();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!bl;)V")
	public static void method1363(@OriginalArg(1) Class2_Sub6 arg0) {
		Static295.method4894(arg0, 200000);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	public static void method1364() {
		Static102.aClass46_14.method1079();
		Static261.aClass46_35.method1079();
		Static39.aClass46_6.method1079();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Lclient!bg;")
	public static Class17 method1365(@OriginalArg(0) int arg0) {
		@Pc(10) Class17 local10 = (Class17) Static137.aClass46_22.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static192.aClass84_81.method2127(arg0, 33);
		local10 = new Class17();
		if (local20 != null) {
			local10.method417(arg0, new Class2_Sub26(local20));
		}
		Static137.aClass46_22.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(B)Z")
	public static boolean method1366() {
		@Pc(6) Class128 local6 = Static165.aClass128_1;
		synchronized (Static165.aClass128_1) {
			if (Static13.anInt336 == Static242.anInt4899) {
				return false;
			} else {
				Static213.anInt4465 = Static196.anIntArray340[Static242.anInt4899];
				Static251.aChar4 = Static203.aCharArray5[Static242.anInt4899];
				Static242.anInt4899 = Static242.anInt4899 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1367(@OriginalArg(1) String arg0) {
		Static16.aString23 = arg0;
		if (Static299.aClass177_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static299.aClass177_5.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static299.aClass177_5.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static120.method2212(Static6.method126() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static303.method483(Static299.aClass177_5.anApplet1, "document.cookie=\"" + local36 + "\"");
		} catch (@Pc(89) Throwable local89) {
		}
	}
}
