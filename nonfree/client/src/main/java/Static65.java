import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1095(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(21) Class2_Sub34 local21 = Static555.method7264(Static567.aClass154_101, Static551.aClass64_2);
			local21.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0));
			local21.aClass2_Sub7_Sub2_2.method4481(arg0);
			Static100.method1508(local21);
		}
	}
}
