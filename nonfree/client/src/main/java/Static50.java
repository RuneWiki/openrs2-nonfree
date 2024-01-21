import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt1602;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt1604;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_24;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public static int anInt1601 = -1;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!mb;")
	private static Class45 aClass45_640 = Static63.method1251("Hidden");

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static int anInt1603 = 0;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!mb;")
	private static Class45 aClass45_641 = Static63.method1251(" from your friend list first");

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_642 = aClass45_640;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_643 = Static63.method1251("Hierhin gehen");

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!mb;")
	private static Class45 aClass45_644 = Static63.method1251("glow3:");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_645 = aClass45_644;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_646 = Static63.method1251("Konfig geladen)3");

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_647 = aClass45_641;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt1606 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lclient!qe;")
	public static Class5_Sub2_Sub12 method1110(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub12 local11 = (Class5_Sub2_Sub12) Static105.aClass67_24.method1823((long) arg0);
		if (local11 != null) {
			return local11;
		}
		local11 = Static13.method266(Static108.aClass29_71, arg0, Static54.aClass29_36);
		if (local11 != null) {
			Static105.aClass67_24.method1818(local11, (long) arg0);
		}
		return local11;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method1111() {
		aClass45_646 = null;
		aClass45_645 = null;
		aClass45_640 = null;
		aClass45_644 = null;
		aClass45_647 = null;
		aClass45_642 = null;
		aClass45_643 = null;
		anIntArrayArray18 = null;
		aClass45_641 = null;
		aClass5_Sub2_Sub6_Sub4_24 = null;
	}
}
