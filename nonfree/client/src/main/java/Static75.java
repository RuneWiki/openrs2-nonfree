import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!o", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1076 = Static69.method1153("Login server offline)3");

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1073 = aClass64_1076;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1074 = Static69.method1153("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!o", name = "w", descriptor = "I")
	public static int anInt1770 = 0;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1075 = Static69.method1153(" )2> @cya@");

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	public static int anInt1773 = 0;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method1246() {
		try {
			@Pc(2) Graphics local2 = Static93.aCanvas1.getGraphics();
			Static46.aClass37_15.method1457(553, 205, local2);
		} catch (@Pc(10) Exception local10) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method1248() {
		aByteArrayArrayArray3 = null;
		aClass64_1076 = null;
		aClass64_1074 = null;
		aClass64_1075 = null;
		anIntArray252 = null;
		aClass64_1073 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB[B)I")
	public static int method1251(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static20.method408(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I")
	public static int method1253(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static81.method1071(arg0);
		@Pc(15) int local15 = local12.anInt2136;
		@Pc(18) int local18 = local12.anInt2137;
		@Pc(24) int local24 = Class1_Sub1_Sub2_Sub2.anIntArray186[local18 - local15];
		@Pc(27) int local27 = local12.anInt2140;
		return local24 & Static101.anIntArray333[local27] >> local15;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method1257() {
		try {
			@Pc(11) Graphics local11 = Static93.aCanvas1.getGraphics();
			Static110.aClass37_36.method1457(17, 357, local11);
		} catch (@Pc(19) Exception local19) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)Lclient!nd;")
	public static Class1_Sub1_Sub11 method1258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class1_Sub1_Sub11 local3 = Static12.method1397(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass1_Sub1_Sub11Array2 == null || arg1 >= local3.aClass1_Sub1_Sub11Array2.length) {
			return null;
		} else {
			return local3.aClass1_Sub1_Sub11Array2[arg1];
		}
	}
}
