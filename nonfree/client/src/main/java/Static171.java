import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	public static int anInt3173;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array8;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "[Lclient!bp;")
	public static final Class6_Sub2_Sub1_Sub1[] aClass6_Sub2_Sub1_Sub1Array1 = new Class6_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!il", name = "i", descriptor = "I")
	public static int anInt3177 = 0;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "Lclient!jb;")
	public static Class126 aClass126_6 = null;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public static void method2497(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static40.aClass53ArrayArrayArray2 = Static39.aClass53ArrayArrayArray3;
			Static346.aClass146Array2 = Static117.aClass146Array1;
		} else {
			Static40.aClass53ArrayArrayArray2 = Static301.aClass53ArrayArrayArray4;
			Static346.aClass146Array2 = Static422.aClass146Array3;
		}
		Static338.anInt5952 = Static40.aClass53ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BIIII)V")
	public static void method2499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static198.anInt3778 = arg1;
		Static414.anInt7043 = 0;
		Static388.anInt6740 = 0;
		Static387.anInt6727 = arg0;
	}
}
