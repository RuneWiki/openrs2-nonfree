import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!ffa", name = "J", descriptor = "Z")
	public static boolean aBoolean245;

	@OriginalMember(owner = "client!ffa", name = "L", descriptor = "Lclient!uu;")
	public static Class239 aClass239_3;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!wea;ZZ)V")
	public static void method2928(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean817 = arg1;
		if (Static140.aBoolean220) {
			Static324.aClass148Array1[Static324.aClass148Array1.length - 1].method4029(arg0);
		} else {
			Static548.method7842(arg0, Static296.aClass3_Sub15Array3);
		}
	}
}
