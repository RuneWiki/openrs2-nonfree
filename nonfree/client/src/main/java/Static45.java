import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "Z")
	public static boolean aBoolean73;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "Lclient!sc;")
	public static Class72 aClass72_14 = new Class72();

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_613 = Static122.method531("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_618 = Static122.method531("glow2:");

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_614 = aClass73_618;

	@OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
	public static int anInt1056 = 0;

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_615 = Static122.method531(" (X");

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_616 = Static122.method531(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_620 = Static122.method531("To create a new account you need to");

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_617 = aClass73_620;

	@OriginalMember(owner = "client!fd", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_619 = aClass73_618;

	@OriginalMember(owner = "client!fd", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_621 = Static122.method531("::qa_op_test");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)I")
	public static int method806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = 256 - arg2;
		return ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * local9 & 0xFF0000) + ((arg0 & 0xFF00FF) * arg2 + local9 * (arg1 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZBLclient!f;Lclient!f;)V")
	public static void method807(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2) {
		Static32.aClass13_7 = arg2;
		Static25.aClass13_5 = arg1;
		Static130.aBoolean197 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
	public static void method808() {
		aClass73_617 = null;
		aClass72_14 = null;
		aClass73_614 = null;
		aClass73_613 = null;
		aClass73_616 = null;
		aClass73_620 = null;
		aClass73_618 = null;
		aClass73_615 = null;
		aClass73_621 = null;
		aClass73_619 = null;
	}
}
