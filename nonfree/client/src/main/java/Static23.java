import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
	public static int anInt642;

	@OriginalMember(owner = "client!df", name = "nb", descriptor = "Lclient!re;")
	public static Class9 aClass9_13;

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "Lclient!re;")
	public static Class9 aClass9_14;

	@OriginalMember(owner = "client!df", name = "pb", descriptor = "Lclient!od;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!df", name = "rb", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_24;

	@OriginalMember(owner = "client!df", name = "Ab", descriptor = "I")
	public static int anInt648;

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "Lclient!u;")
	private static Class74 aClass74_504 = Static72.method1077("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_502 = aClass74_504;

	@OriginalMember(owner = "client!df", name = "db", descriptor = "[I")
	public static int[] anIntArray67 = new int[200];

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_503 = Static72.method1077("l");

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "Lclient!u;")
	private static Class74 aClass74_509 = Static72.method1077("slide:");

	@OriginalMember(owner = "client!df", name = "ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_505 = aClass74_509;

	@OriginalMember(owner = "client!df", name = "kb", descriptor = "Lclient!u;")
	private static Class74 aClass74_506 = Static72.method1077("Click to switch");

	@OriginalMember(owner = "client!df", name = "lb", descriptor = "Lclient!u;")
	public static Class74 aClass74_507 = aClass74_509;

	@OriginalMember(owner = "client!df", name = "sb", descriptor = "J")
	public static volatile long aLong25 = 0L;

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "Lclient!u;")
	public static Class74 aClass74_508 = Static72.method1077("null");

	@OriginalMember(owner = "client!df", name = "yb", descriptor = "Lclient!u;")
	public static Class74 aClass74_510 = aClass74_506;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)Lclient!ve;")
	public static Class2_Sub2_Sub17 method478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class2_Sub2_Sub17 local3 = Static41.method668(arg1);
		if (arg0 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass2_Sub2_Sub17Array2 == null || local3.aClass2_Sub2_Sub17Array2.length <= arg0) {
			return null;
		} else {
			return local3.aClass2_Sub2_Sub17Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!g;III)Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 method483(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static65.method1010(arg0, arg2, arg1) ? Static43.method683() : null;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public static void method484() {
		aClass74_505 = null;
		aClass74_504 = null;
		aClass57_1 = null;
		aClass26_Sub1_24 = null;
		aClass9_13 = null;
		aClass74_507 = null;
		aClass74_510 = null;
		aClass9_14 = null;
		aClass74_502 = null;
		aClass74_503 = null;
		aClass74_508 = null;
		anIntArray67 = null;
		aClass74_509 = null;
		aClass74_506 = null;
	}
}
