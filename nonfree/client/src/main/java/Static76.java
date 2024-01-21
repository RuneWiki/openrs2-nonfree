import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!qe;")
	public static Class5_Sub11 aClass5_Sub11_4;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "J")
	public static long aLong67;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Lclient!rb;")
	public static Class57 aClass57_11;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
	public static int anInt1884;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Lclient!ra;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[I")
	public static int[] anIntArray231 = new int[128];

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "Lclient!vc;")
	private static Class71 aClass71_913 = Static38.method736("cyan:");

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_910 = aClass71_913;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
	public static int anInt1881 = 0;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] aClass5_Sub1_Sub10_Sub3Array9 = new Class5_Sub1_Sub10_Sub3[1000];

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "Lclient!vc;")
	public static Class71 aClass71_911 = Static38.method736("(U3");

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Lclient!vc;")
	public static Class71 aClass71_912 = Static38.method736("@whi@ )4 ");

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lclient!af;")
	public static Class5_Sub1_Sub2 method1246(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub2 local10 = (Class5_Sub1_Sub2) Static30.aClass54_19.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static29.aClass24_10.method679(1, arg0);
		local10 = new Class5_Sub1_Sub2();
		if (local27 != null) {
			local10.method140(arg0, new Class5_Sub11(local27));
		}
		local10.method147();
		Static30.aClass54_19.method1399(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public static void method1247() {
		anIntArray233 = null;
		aClass71_911 = null;
		anIntArray231 = null;
		aClass5_Sub11_4 = null;
		aClass71_912 = null;
		aClass71_913 = null;
		aClass57_11 = null;
		aClass56_4 = null;
		aClass71_910 = null;
		aClass5_Sub1_Sub10_Sub3Array9 = null;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Lclient!gb;")
	public static Class5_Sub1_Sub7 method1248(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub1_Sub7 local10 = (Class5_Sub1_Sub7) Static38.aClass54_21.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static9.aClass24_3.method679(5, arg0);
		local10 = new Class5_Sub1_Sub7();
		if (local22 != null) {
			local10.method732(new Class5_Sub11(local22));
		}
		Static38.aClass54_21.method1399(local10, (long) arg0);
		return local10;
	}
}
