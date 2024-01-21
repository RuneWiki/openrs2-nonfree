import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_77;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!ic;")
	public static Class2_Sub10 aClass2_Sub10_61;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!de;")
	public static Class15 aClass15_59;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!e;")
	public static Class16 aClass16_93 = new Class16(500);

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!da;")
	public static Class13 aClass13_69 = new Class13();

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_1717 = Static72.method1077("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt2887 = 0;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public static int anInt2888 = 0;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!oe;")
	public static Class58 aClass58_69 = new Class58(4096);

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "[I")
	public static int[] anIntArray413 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1718 = Static72.method1077("gr-Un:");

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!u;")
	private static Class74 aClass74_1719 = Static72.method1077(" million");

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1720 = aClass74_1719;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1931(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static112.aClass65_1);
		arg0.addMouseMotionListener(Static112.aClass65_1);
		arg0.addFocusListener(Static112.aClass65_1);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method1933() {
		aClass58_69 = null;
		aClass26_Sub1_77 = null;
		aClass13_69 = null;
		aClass74_1717 = null;
		aClass74_1718 = null;
		aClass2_Sub10_61 = null;
		anIntArray413 = null;
		aClass74_1720 = null;
		aClass16_93 = null;
		aClass74_1719 = null;
		aClass15_59 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!nd;")
	public static Class2_Sub2_Sub12 method1934(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub12 local6 = (Class2_Sub2_Sub12) Static63.aClass16_52.method490((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static68.aClass26_14.method1358(arg0, 10);
		local6 = new Class2_Sub2_Sub12();
		local6.anInt1717 = arg0;
		if (local20 != null) {
			local6.method1226(new Class2_Sub10(local20));
		}
		local6.method1218();
		if (local6.anInt1725 != -1) {
			local6.method1227(method1934(local6.anInt1725), method1934(local6.anInt1719));
		}
		if (!Static56.aBoolean51 && local6.aBoolean69) {
			local6.aClass74_1184 = Static90.aClass74_1300;
			local6.aClass74Array11 = null;
			local6.aClass74Array12 = null;
			local6.anInt1693 = 0;
		}
		Static63.aClass16_52.method492(local6, (long) arg0);
		return local6;
	}
}
