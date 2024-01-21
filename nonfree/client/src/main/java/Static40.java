import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!jd;")
	public static Class11 aClass11_54;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	public static int anInt1178;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	public static int anInt1179;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!mb;")
	public static Class45 aClass45_520 = Static63.method1251("");

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_515 = aClass45_520;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!mb;")
	private static Class45 aClass45_516 = Static63.method1251("red:");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!mb;")
	public static Class45 aClass45_517 = aClass45_520;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_518 = aClass45_520;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "Lclient!mb;")
	private static Class45 aClass45_519 = Static63.method1251("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][105][105];

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!mb;")
	private static Class45 aClass45_521 = Static63.method1251("Enter name of friend to add to list");

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "Lclient!fc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Lclient!sa;")
	public static Class67 aClass67_11 = new Class67(64);

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!mb;")
	public static Class45 aClass45_522 = Static63.method1251(" x");

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_523 = Static63.method1251("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "Lclient!mb;")
	public static Class45 aClass45_524 = aClass45_520;

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "Lclient!mb;")
	public static Class45 aClass45_525 = aClass45_520;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "Lclient!mb;")
	public static Class45 aClass45_526 = aClass45_519;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "[I")
	public static int[] anIntArray182 = new int[50];

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "Lclient!mb;")
	public static Class45 aClass45_527 = aClass45_516;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "Lclient!mb;")
	public static Class45 aClass45_528 = Static63.method1251(" )2> @cya@");

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_529 = aClass45_520;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "Lclient!mb;")
	public static Class45 aClass45_530 = aClass45_521;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!mb;")
	public static Class45 aClass45_531 = Static63.method1251("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method866() {
		aClass67_11.method1819();
		Static17.aClass67_5.method1819();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public static void method871() {
		aClass45_518 = null;
		aClass45_517 = null;
		aClass45_520 = null;
		aClass45_525 = null;
		anIntArrayArrayArray2 = null;
		aClass45_527 = null;
		aClass45_524 = null;
		aClass45_526 = null;
		anIntArrayArrayArray1 = null;
		aClass11_54 = null;
		aClass45_530 = null;
		aClass45_521 = null;
		aClass45_529 = null;
		aClass45_516 = null;
		aClass67_11 = null;
		aClass45_531 = null;
		aClass45_519 = null;
		aClass45_528 = null;
		aClass45_522 = null;
		aClass45_515 = null;
		aCalendar1 = null;
		anIntArray182 = null;
		aClass45_523 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!md;")
	public static Class5_Sub2_Sub10 method872(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub2_Sub10 local14 = (Class5_Sub2_Sub10) Static9.aClass67_1.method1823((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static110.aClass29_74.method733(arg0, 3);
		local14 = new Class5_Sub2_Sub10();
		if (local28 != null) {
			local14.method1353(new Class5_Sub9(local28));
		}
		Static9.aClass67_1.method1818(local14, (long) arg0);
		return local14;
	}
}
