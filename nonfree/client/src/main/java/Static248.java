import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jea", name = "r", descriptor = "Lclient!mv;")
	public static Class229 aClass229_57;

	@OriginalMember(owner = "client!jea", name = "v", descriptor = "Lclient!mv;")
	public static Class229 aClass229_58;

	@OriginalMember(owner = "client!jea", name = "t", descriptor = "Lclient!id;")
	public static final Class155 aClass155_5 = new Class155();

	@OriginalMember(owner = "client!jea", name = "x", descriptor = "I")
	public static int anInt4116 = 0;

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(B)I")
	public static int method3529() {
		return Static48.anIntArray101 == null ? 0 : Static48.anIntArray101.length * 2;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIII)V")
	public static void method3531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = Static257.aClass2_Sub35_Sub1_1.anInt7490 * arg1 >> 8;
		if (local18 == 0 || arg2 == -1) {
			return;
		}
		if (!Static271.aBoolean352 && Static491.anInt7770 != -1 && Static343.method5007()) {
			Static562.aClass2_Sub3_Sub2_6 = Static483.method6231();
			@Pc(39) Class2_Sub3_Sub2 local39 = Static269.method3734(Static562.aClass2_Sub3_Sub2_6);
			Static177.method2289(local39);
		}
		Static228.method2769(arg2, Static403.aClass229_125, local18);
		Static329.method4757(-1, 255);
		Static271.aBoolean352 = true;
	}
}
