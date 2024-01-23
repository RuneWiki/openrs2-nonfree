import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!tg;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_98;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	public static int anInt4759;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!sd;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!hj;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_3;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!jd;")
	public static Class61 aClass61_87 = new Class61(64);

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1283 = Static231.method3737("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1281 = aClass107_1283;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1282 = Static231.method3737(" <col=00ff80>");

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt4760 = 1;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	public static int anInt4761 = 0;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	public static int anInt4762 = -1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Z")
	public static boolean method3569(@OriginalArg(0) int arg0) {
		return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public static void method3570(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static43.aBooleanArray7[arg0]) {
			return;
		}
		Static57.aClass28_83.method844(arg0);
		if (Static6.aClass86ArrayArray11[arg0] == null) {
			return;
		}
		@Pc(32) boolean local32 = true;
		for (@Pc(34) int local34 = 0; local34 < Static6.aClass86ArrayArray11[arg0].length; local34++) {
			if (Static6.aClass86ArrayArray11[arg0][local34] != null) {
				if (Static6.aClass86ArrayArray11[arg0][local34].anInt3286 == 2) {
					local32 = false;
				} else {
					Static6.aClass86ArrayArray11[arg0][local34] = null;
				}
			}
		}
		if (local32) {
			Static6.aClass86ArrayArray11[arg0] = null;
		}
		Static43.aBooleanArray7[arg0] = false;
	}
}
