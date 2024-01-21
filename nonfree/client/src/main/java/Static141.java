import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rg", name = "bc", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_6;

	@OriginalMember(owner = "client!rg", name = "Ub", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1224 = Static146.method2172("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!rg", name = "Yb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1225 = Static146.method2172("Hidden)2");

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "(B)V")
	public static void method2399() {
		aClass77_1224 = null;
		aClass77_1225 = null;
		aClass2_Sub2_Sub3_Sub2_6 = null;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(II)Z")
	public static boolean method2402(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fb;")
	public static RuntimeException_Sub1 method2404(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
