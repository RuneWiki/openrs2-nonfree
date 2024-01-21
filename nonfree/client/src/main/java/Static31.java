import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "Lclient!f;")
	public static Class13 aClass13_6;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "I")
	public static int anInt814;

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "I")
	public static int anInt806 = 0;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_467 = Static122.method531("purple:");

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_474 = Static122.method531(" is already on your friend list)3");

	@OriginalMember(owner = "client!de", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_468 = aClass73_474;

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_469 = Static122.method531("null");

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_470 = Static122.method531("Lade)3)3)3");

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_471 = Static122.method531("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "Lclient!sd;")
	public static Class73 aClass73_472 = aClass73_467;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_473 = Static122.method531("m");

	@OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
	public static int anInt815 = 1;

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_475 = Static122.method531("(U0a )2 via: ");

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_476 = aClass73_467;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	public static void method595(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static175.aBooleanArray18[arg0]) {
			return;
		}
		Static63.aClass13_12.method366(arg0);
		if (Static57.aClass83ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < Static57.aClass83ArrayArray1[arg0].length; local31++) {
			if (Static57.aClass83ArrayArray1[arg0][local31] != null) {
				if (Static57.aClass83ArrayArray1[arg0][local31].anInt3722 == 2) {
					local29 = false;
				} else {
					Static57.aClass83ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local29) {
			Static57.aClass83ArrayArray1[arg0] = null;
		}
		Static175.aBooleanArray18[arg0] = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!f;I)V")
	public static void method596(@OriginalArg(0) Class13 arg0) {
		Static119.aClass13_21 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method597() {
		if (Static117.aClass64_1 != null) {
			@Pc(3) Class64 local3 = Static117.aClass64_1;
			synchronized (Static117.aClass64_1) {
				Static117.aClass64_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "k", descriptor = "(I)V")
	public static void method598() {
		aClass73_475 = null;
		aClass73_470 = null;
		aClass13_6 = null;
		aClass73_476 = null;
		aClass73_467 = null;
		aClass73_471 = null;
		aClass73_472 = null;
		aClass73_474 = null;
		aClass73_468 = null;
		aClass73_469 = null;
		aClass73_473 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method599() {
		if (Static4.aClass56_1 != null) {
			@Pc(7) Class56 local7 = Static4.aClass56_1;
			synchronized (Static4.aClass56_1) {
				Static4.aClass56_1 = null;
			}
		}
	}
}
