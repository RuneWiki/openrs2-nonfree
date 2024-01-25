import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
	public static boolean aBoolean295;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public static int anInt3901 = 0;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "F")
	public static float aFloat94 = 1.0F;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3483(@OriginalArg(1) String arg0) {
		if (Static187.aClass103Array1 != null) {
			@Pc(20) Class3_Sub42 local20 = Static591.method7910(Static9.aClass199_3, Static495.aClass303_90);
			local20.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0));
			local20.aClass3_Sub11_Sub1_1.method5227(arg0);
			Static511.method6885(local20);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZZ)V")
	public static void method3484(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static81.anInt1829++;
			Static296.method4401();
		}
		if (arg0) {
			Static108.anInt7946++;
			Static225.method3528();
		}
	}
}
