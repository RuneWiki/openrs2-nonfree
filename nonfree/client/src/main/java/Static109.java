import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!uc", name = "gc", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!uc", name = "Ub", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1642 = Static69.method1153("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!uc", name = "Vb", descriptor = "I")
	public static int anInt2628 = 0;

	@OriginalMember(owner = "client!uc", name = "Wb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1643 = Static69.method1153("scape main");

	@OriginalMember(owner = "client!uc", name = "sc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1652 = Static69.method1153("Loading textures )2 ");

	@OriginalMember(owner = "client!uc", name = "Xb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1644 = aClass64_1652;

	@OriginalMember(owner = "client!uc", name = "ac", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1645 = Static69.method1153("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!uc", name = "cc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1646 = Static69.method1153("Public chat");

	@OriginalMember(owner = "client!uc", name = "hc", descriptor = "[I")
	public static int[] anIntArray382 = new int[5];

	@OriginalMember(owner = "client!uc", name = "wc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1655 = Static69.method1153("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!uc", name = "jc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1647 = aClass64_1655;

	@OriginalMember(owner = "client!uc", name = "kc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1648 = Static69.method1153("red:");

	@OriginalMember(owner = "client!uc", name = "lc", descriptor = "I")
	public static int anInt2637 = 0;

	@OriginalMember(owner = "client!uc", name = "oc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1649 = aClass64_1646;

	@OriginalMember(owner = "client!uc", name = "pc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1650 = aClass64_1642;

	@OriginalMember(owner = "client!uc", name = "qc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1651 = Static69.method1153("mod_icons");

	@OriginalMember(owner = "client!uc", name = "uc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1653 = Static69.method1153("::fpson");

	@OriginalMember(owner = "client!uc", name = "vc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1654 = aClass64_1648;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "(I)Z")
	public static boolean method1872() {
		return Static79.aClass17_1 != null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public static void method1876(@OriginalArg(1) boolean arg0) {
		Static118.anInt2841++;
		if (Static118.anInt2841 < 50 && !arg0) {
			return;
		}
		Static118.anInt2841 = 0;
		if (Static50.aBoolean69 || Static14.aClass27_1 == null) {
			return;
		}
		Static49.aClass1_Sub6_Sub1_1.method1877(249);
		try {
			Static14.aClass27_1.method560(Static49.aClass1_Sub6_Sub1_1.anInt2574, Static49.aClass1_Sub6_Sub1_1.aByteArray27);
			Static49.aClass1_Sub6_Sub1_1.anInt2574 = 0;
		} catch (@Pc(46) IOException local46) {
			Static50.aBoolean69 = true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "(B)V")
	public static void method1880() {
		aClass64_1646 = null;
		aClass64_1654 = null;
		aClass64_1650 = null;
		aClass64_1655 = null;
		aClass64_1645 = null;
		aClass64_1653 = null;
		anIntArray382 = null;
		aClass64_1649 = null;
		aClass64_1644 = null;
		aClass64_1643 = null;
		aClass64_1652 = null;
		aClass64_1642 = null;
		aClass64_1651 = null;
		aClass64_1648 = null;
		aClass64_1647 = null;
	}
}
