import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
	public static int anInt2214;

	@OriginalMember(owner = "client!jd", name = "lb", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_665 = Static170.method3101(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lclient!eh;")
	private static Class28 aClass28_666 = Static170.method3101("Loading title screen )2 ");

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
	public static int anInt2213 = 0;

	@OriginalMember(owner = "client!jd", name = "ib", descriptor = "Lclient!eh;")
	private static Class28 aClass28_670 = Static170.method3101("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_667 = aClass28_670;

	@OriginalMember(owner = "client!jd", name = "gb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_669 = Static170.method3101("Bad session id)3");

	@OriginalMember(owner = "client!jd", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_668 = aClass28_669;

	@OriginalMember(owner = "client!jd", name = "nb", descriptor = "I")
	public static int anInt2220 = 0;

	@OriginalMember(owner = "client!jd", name = "pb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_671 = aClass28_666;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	public static void method1707() {
		aClass28_669 = null;
		aClass28_668 = null;
		aClass28_665 = null;
		aClass28_670 = null;
		aClass28_671 = null;
		aClass28_667 = null;
		anIntArray363 = null;
		aShortArrayArray5 = null;
		aClass28_666 = null;
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	public static void method1708() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(III)J")
	public static long method1709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass84_1 == null ? 0L : local7.aClass84_1.aLong143;
	}
}
