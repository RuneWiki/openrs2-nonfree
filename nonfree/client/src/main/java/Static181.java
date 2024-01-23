import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString201 = " from your ignore list first.";

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!fj;")
	public static Class1_Sub15 aClass1_Sub15_1 = new Class1_Sub15(0, 0);

	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	public static int anInt3481 = 0;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "I")
	public static int anInt3482 = -1;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!lf;")
	public static Class1_Sub14 aClass1_Sub14_7 = new Class1_Sub14(new byte[5000]);

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	public static int anInt3484 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method2986() {
		Static179.aClass187_92.method4525();
		Static251.aClass187_128.method4525();
		Static219.aClass187_111.method4525();
		Static102.aClass187_60.method4525();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lclient!ak;")
	public static Class1_Sub2_Sub2 method2988(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub2 local10 = (Class1_Sub2_Sub2) Static141.aClass148_7.method3600((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static163.aClass121_78.method3115(Static172.method2905(arg0), Static300.method4556(arg0));
		local10 = new Class1_Sub2_Sub2();
		if (local26 != null) {
			local10.method150(new Class1_Sub14(local26));
		}
		Static141.aClass148_7.method3602(local10, (long) arg0);
		return local10;
	}
}
