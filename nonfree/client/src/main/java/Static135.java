import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Lclient!nq;")
	public static Class144 aClass144_38;

	@OriginalMember(owner = "client!iq", name = "W", descriptor = "[Lclient!ri;")
	public static Class177[] aClass177Array2;

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[128][128];

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
	public static int anInt2530 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ko;Ljava/lang/String;IB)Lclient!aa;")
	public static Class2 method2123(@OriginalArg(0) Class118 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg0.method2701(arg1);
		}
		@Pc(38) Class2 local38;
		if (arg2 == 1) {
			try {
				Static360.method556(new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg1)).toString() }, "openjs", arg0.anApplet1);
				local38 = new Class2();
				local38.anInt6 = 1;
				return local38;
			} catch (@Pc(44) Throwable local44) {
				local38 = new Class2();
				local38.anInt6 = 2;
				return local38;
			}
		} else if (arg2 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_blank");
				local38 = new Class2();
				local38.anInt6 = 1;
				return local38;
			} catch (@Pc(78) Exception local78) {
				local38 = new Class2();
				local38.anInt6 = 2;
				return local38;
			}
		} else if (arg2 == 3) {
			try {
				Static360.method555("loggedout", arg0.anApplet1);
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_top");
				local38 = new Class2();
				local38.anInt6 = 1;
				return local38;
			} catch (@Pc(122) Exception local122) {
				local38 = new Class2();
				local38.anInt6 = 2;
				return local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
	public static void method2126() {
		Static69.method1039(Static45.aClass137_4);
		Static226.anInt4573++;
		if (Static259.aBoolean342 && Static137.aBoolean171) {
			@Pc(26) int local26 = Static214.aClass29_1.method384();
			@Pc(30) int local30 = Static214.aClass29_1.method381();
			local26 -= Static325.anInt1278;
			local30 -= Static91.anInt1787;
			@Pc(51) int local51;
			@Pc(56) int local56;
			if (Static45.aClass137_4.anInt4041 < Static226.anInt4573) {
				local51 = local26 - Static10.anInt228;
				local56 = local30 - Static59.anInt1119;
				if (Static45.aClass137_4.anInt4072 < local51 || -Static45.aClass137_4.anInt4072 > local51 || local56 > Static45.aClass137_4.anInt4072 || -Static45.aClass137_4.anInt4072 > local56) {
					Static131.aBoolean156 = true;
				}
			}
			if (Static74.anInt1410 > local26) {
				local26 = Static74.anInt1410;
			}
			if (Static42.aClass137_3.anInt4060 + Static74.anInt1410 < Static45.aClass137_4.anInt4060 + local26) {
				local26 = Static42.aClass137_3.anInt4060 + Static74.anInt1410 - Static45.aClass137_4.anInt4060;
			}
			if (local30 < Static67.anInt1250) {
				local30 = Static67.anInt1250;
			}
			if (local30 + Static45.aClass137_4.anInt4110 > Static42.aClass137_3.anInt4110 + Static67.anInt1250) {
				local30 = Static67.anInt1250 + Static42.aClass137_3.anInt4110 - Static45.aClass137_4.anInt4110;
			}
			local51 = local26 + Static42.aClass137_3.anInt4107 - Static74.anInt1410;
			local56 = local30 + Static42.aClass137_3.anInt4062 - Static67.anInt1250;
			@Pc(168) Class11_Sub13 local168;
			if (Static45.aClass137_4.anObjectArray31 != null && Static131.aBoolean156) {
				local168 = new Class11_Sub13();
				local168.aClass137_5 = Static45.aClass137_4;
				local168.anInt1535 = local51;
				local168.anObjectArray3 = Static45.aClass137_4.anObjectArray31;
				local168.anInt1537 = local56;
				Static93.method1353(local168);
			}
			if (!Static214.aClass29_1.method380()) {
				if (Static131.aBoolean156) {
					if (Static45.aClass137_4.anObjectArray25 != null) {
						local168 = new Class11_Sub13();
						local168.aClass137_6 = Static275.aClass137_16;
						local168.anInt1535 = local51;
						local168.anObjectArray3 = Static45.aClass137_4.anObjectArray25;
						local168.anInt1537 = local56;
						local168.aClass137_5 = Static45.aClass137_4;
						Static93.method1353(local168);
					}
					if (Static275.aClass137_16 != null && Static42.method642(Static45.aClass137_4) != null) {
						Static254.method4448(Static275.aClass137_16, Static45.aClass137_4);
					}
				} else if ((Static294.anInt5813 == 1 || Static117.method1782()) && Static13.anInt245 > 2) {
					Static274.method4647(Static59.anInt1119 + Static91.anInt1787, 2, Static10.anInt228 + Static325.anInt1278);
				} else if (Static151.method2284()) {
					Static274.method4647(Static91.anInt1787 + Static59.anInt1119, 0, Static325.anInt1278 + Static10.anInt228);
				}
				Static45.aClass137_4 = null;
			}
		} else if (Static226.anInt4573 > 1) {
			Static45.aClass137_4 = null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI)V")
	public static void method2128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(13, arg0);
		local13.method3858();
		local13.anInt4390 = arg1;
	}
}
