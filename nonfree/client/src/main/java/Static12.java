import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array2;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt716;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!pb;")
	public static Class40 aClass40_11;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Z")
	public static boolean aBoolean31;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!mb;")
	public static Class38 aClass38_8 = new Class38(32);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!rc;")
	private static Class55 aClass55_259 = Static34.method846(" from your friend list first");

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_260 = aClass55_259;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_261 = Static34.method846("Absender:");

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public static int anInt712 = 0;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[Lclient!jb;")
	public static Class6_Sub2_Sub3_Sub3[] aClass6_Sub2_Sub3_Sub3Array1 = new Class6_Sub2_Sub3_Sub3[4];

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!mc;Z)V")
	public static void method458(@OriginalArg(0) Class39 arg0) {
		Static26.aClass39_3 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method460() {
		aClass38_8 = null;
		aClass6_Sub2_Sub2_Sub2Array2 = null;
		aClass40_11 = null;
		aCalendar1 = null;
		aClass55_259 = null;
		aClass6_Sub2_Sub3_Sub3Array1 = null;
		aClass55_260 = null;
		aClass55_261 = null;
	}
}
