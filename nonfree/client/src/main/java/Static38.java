import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dg", name = "nb", descriptor = "I")
	public static int anInt1031;

	@OriginalMember(owner = "client!dg", name = "Hb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_643 = Static107.method1838("Loaded sprites");

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "Lclient!gg;")
	public static Class28 aClass28_639 = aClass28_643;

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
	public static int anInt1022 = 0;

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "Lclient!gg;")
	public static Class28 aClass28_640 = Static107.method1838(":duelstake:");

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
	public static final int anInt1026 = 2301979;

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lclient!qd;")
	public static Class65 aClass65_3 = new Class65();

	@OriginalMember(owner = "client!dg", name = "Fb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_642 = Static107.method1838("Benutzername: ");

	@OriginalMember(owner = "client!dg", name = "Tb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_644 = Static107.method1838("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	public static void method704() {
		aClass28_642 = null;
		aClass65_3 = null;
		aClass28_639 = null;
		aClass28_640 = null;
		aClass28_643 = null;
		aClass28_644 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Z")
	public static boolean method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(17) Class2_Sub4_Sub6 local17 = Static151.method2339(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local17.method714(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([S[Lclient!gg;B)V")
	public static void method707(@OriginalArg(0) short[] arg0, @OriginalArg(1) Class28[] arg1) {
		Static13.method386(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!jc;ILclient!gg;Lclient!gg;)[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] method709(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(4) int local4 = arg0.method1777(arg2);
		@Pc(21) int local21 = arg0.method1774(arg1, local4);
		return Static44.method800(arg0, local21, local4);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)I")
	public static int method713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static139.method2184(arg1 - 1, arg0 - 1) + Static139.method2184(arg1 + 1, arg0 + -1) + Static139.method2184(arg1 + -1, arg0 + 1) + Static139.method2184(arg1 - -1, arg0 + 1);
		@Pc(70) int local70 = Static139.method2184(arg1 - 1, arg0) + Static139.method2184(arg1 + 1, arg0) + Static139.method2184(arg1, arg0 - 1) + Static139.method2184(arg1, arg0 + 1);
		@Pc(80) int local80 = Static139.method2184(arg1, arg0);
		return local41 / 16 + local70 / 8 + local80 / 4;
	}
}
