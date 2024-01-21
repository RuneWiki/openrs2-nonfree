import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!nb;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!sd;")
	public static Class29 aClass29_35;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt1599;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_634 = Static63.method1251("(U(Y");

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!mb;")
	private static Class45 aClass45_635 = Static63.method1251("M");

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!mb;")
	private static Class45 aClass45_637 = Static63.method1251("Malformed login packet)3");

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_636 = aClass45_637;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_638 = aClass45_635;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!mb;")
	public static Class45 aClass45_639 = Static63.method1251(": ");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!df;IIBI)V")
	public static void method1104(@OriginalArg(0) Class5_Sub2_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static16.aClass11_23.method2152();
		Static100.aClass5_Sub2_Sub6_Sub4_41.method1874(0, 0);
		arg0.method503(Static88.aClass45_1040, 55, 28, 16777215, true);
		if (arg1 == 0) {
			arg0.method503(Static25.aClass45_384, 55, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg0.method503(Static109.aClass45_1262, 55, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg0.method503(Static62.aClass45_767, 55, 41, 16711680, true);
		}
		if (arg1 == 3) {
			arg0.method503(Static16.aClass45_233, 55, 41, 65535, true);
		}
		arg0.method503(Static102.aClass45_1181, 184, 28, 16777215, true);
		if (arg3 == 0) {
			arg0.method503(Static25.aClass45_384, 184, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg0.method503(Static109.aClass45_1262, 184, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg0.method503(Static62.aClass45_767, 184, 41, 16711680, true);
		}
		arg0.method503(Static98.aClass45_1136, 324, 28, 16777215, true);
		if (arg2 == 0) {
			arg0.method503(Static25.aClass45_384, 324, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg0.method503(Static109.aClass45_1262, 324, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg0.method503(Static62.aClass45_767, 324, 41, 16711680, true);
		}
		arg0.method521(Static37.aClass45_500, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(156) Graphics local156 = Static75.aCanvas1.getGraphics();
			Static16.aClass11_23.method2148(local156, 0, 453);
		} catch (@Pc(164) Exception local164) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1105() {
		aClass29_35 = null;
		aClass45_634 = null;
		aClass45_638 = null;
		aClass48_1 = null;
		aClass45_635 = null;
		aClass45_637 = null;
		aClass45_636 = null;
		aClass45_639 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!sd;)V")
	public static void method1106(@OriginalArg(1) Class29 arg0) {
		Static54.aClass29_37 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
	public static boolean method1107(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
	public static void method1108(@OriginalArg(0) boolean arg0) {
		Static104.method1900();
		Static78.anInt2215++;
		if (Static78.anInt2215 < 50 && !arg0) {
			return;
		}
		Static78.anInt2215 = 0;
		if (Static47.aBoolean72 || Static104.aClass7_3 == null) {
			return;
		}
		Static64.aClass5_Sub9_Sub1_2.method1466(229);
		try {
			Static104.aClass7_3.method80(Static64.aClass5_Sub9_Sub1_2.anInt2140, Static64.aClass5_Sub9_Sub1_2.aByteArray28);
			Static64.aClass5_Sub9_Sub1_2.anInt2140 = 0;
		} catch (@Pc(49) IOException local49) {
			Static47.aBoolean72 = true;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lclient!nc;")
	public static Class4 method1109() {
		try {
			return (Class4) Class.forName("Class4_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class4_Sub2();
		}
	}
}
