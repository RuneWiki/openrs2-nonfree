import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!cp;")
	public static final Class60 aClass60_5 = new Class60();

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_44 = new Class341(11, 16);

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!it;ILclient!it;)V")
	public static void method3563(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_337 != null) {
			arg1.method9825();
		}
		arg1.aClass2_337 = arg0.aClass2_337;
		arg1.aClass2_338 = arg0;
		arg1.aClass2_337.aClass2_338 = arg1;
		arg1.aClass2_338.aClass2_337 = arg1;
	}
}
