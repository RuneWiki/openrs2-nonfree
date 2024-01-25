import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!dk;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
	public static long method5236() {
		return Static149.aClass15_10.method8365();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5238(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class2_Sub50 local17 = Static595.method8194(Static610.aClass310_2, Static377.aClass269_68);
			local17.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0));
			local17.aClass2_Sub34_Sub2_2.method6918(arg0);
			Static311.method4754(local17);
		}
	}
}
