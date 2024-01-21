import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "J")
	public static long aLong5;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!gd;")
	private static Class23 aClass23_98 = Static15.method178("level)2");

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_99 = Static15.method178("Privater Chat");

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
	public static final boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!gd;")
	private static Class23 aClass23_100 = Static15.method178("Loaded update list");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_101 = aClass23_98;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_102 = aClass23_100;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_103 = Static15.method178("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public static int anInt144 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method69() {
		aClass23_100 = null;
		aClass23_102 = null;
		aClass23_103 = null;
		aClass23_101 = null;
		aClass23_98 = null;
		aClass23_99 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBII)I")
	public static int method70(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(18) int local18 = arg1 & arg2 - 1;
		@Pc(24) int local24 = arg2 - 1 & arg0;
		@Pc(28) int local28 = arg1 / arg2;
		@Pc(33) int local33 = Static98.method1647(local3, local28);
		@Pc(40) int local40 = Static98.method1647(local3 + 1, local28);
		@Pc(47) int local47 = Static98.method1647(local3, local28 + 1);
		@Pc(56) int local56 = Static98.method1647(local3 + 1, local28 - -1);
		@Pc(65) int local65 = Static37.method745(local40, arg2, local24, local33);
		@Pc(72) int local72 = Static37.method745(local56, arg2, local24, local47);
		return Static37.method745(local72, arg2, local18, local65);
	}
}
