import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!je", name = "O", descriptor = "I")
	public static int anInt1884 = 0;

	@OriginalMember(owner = "client!je", name = "R", descriptor = "Lclient!tg;")
	public static Class81 aClass81_646 = Static120.method2057("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!je", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_647 = Static120.method2057("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!tg;Lclient!tg;Lclient!vb;B)Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 method1382(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class82 arg2) {
		@Pc(4) int local4 = arg2.method2955(arg1);
		@Pc(10) int local10 = arg2.method2967(arg0, local4);
		return Static66.method1195(local10, arg2, local4);
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
	public static void method1383() {
		aClass81_646 = null;
		aClass81_647 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!vb;)V")
	public static void method1384(@OriginalArg(1) Class82 arg0) {
		Static128.aClass82_48 = arg0;
	}
}
