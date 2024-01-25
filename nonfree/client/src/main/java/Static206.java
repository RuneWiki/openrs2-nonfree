import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
	public static int anInt3355;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_79 = new Class151(22, -1);

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Lclient!tm;")
	public static final Class176 aClass176_1 = Static194.method3020();

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3094(@OriginalArg(1) String arg0) {
		if (Static547.aClass275Array1 != null) {
			@Pc(15) Class4_Sub48 local15 = Static335.method4615(Static386.aClass216_98, Static669.aClass196_2);
			local15.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0));
			local15.aClass4_Sub11_Sub1_2.method8857(arg0);
			Static410.method5170(local15);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)Z")
	public static boolean method3095(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
