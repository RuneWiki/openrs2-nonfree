import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	public static int anInt1321;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "Lclient!c;")
	public static Class11 aClass11_7 = new Class11();

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_612 = Static109.method1737(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!na;")
	private static Class53 aClass53_617 = Static109.method1737("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Lclient!na;")
	public static Class53 aClass53_613 = aClass53_617;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!na;")
	private static Class53 aClass53_614 = Static109.method1737("red:");

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_615 = Static109.method1737("Fertigkeit)2");

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lclient!na;")
	private static Class53 aClass53_620 = Static109.method1737("Click to continue");

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Lclient!na;")
	public static Class53 aClass53_616 = aClass53_620;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!na;")
	public static Class53 aClass53_618 = aClass53_614;

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lclient!na;")
	public static Class53 aClass53_619 = aClass53_614;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
	public static int anInt1322 = 0;

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "J")
	public static long aLong53 = 0L;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
	public static void method936() {
		aClass53_620 = null;
		aClass53_612 = null;
		aClass11_7 = null;
		aClass53_619 = null;
		aClass53_616 = null;
		aClass53_614 = null;
		aClass53_618 = null;
		aClass53_613 = null;
		aClass53_617 = null;
		aClass53_615 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!we;)V")
	public static void method937(@OriginalArg(1) Class62 arg0) {
		Static16.aClass62_1 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	public static void method939() {
		Static29.aClass75_25.method1724();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBII)I")
	public static int method940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
