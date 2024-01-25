import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!oja", name = "j", descriptor = "Z")
	public static boolean aBoolean555 = false;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILclient!rv;)V")
	public static void method6453(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(11) int local11 = arg0.method3690();
		Static211.aClass17Array1 = new Class17[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			Static211.aClass17Array1[local16] = new Class17();
			Static211.aClass17Array1[local16].anInt266 = arg0.method3690();
			Static211.aClass17Array1[local16].aString2 = arg0.method3674();
		}
		Static132.anInt2228 = arg0.method3690();
		Static598.anInt9726 = arg0.method3690();
		Static236.anInt3827 = arg0.method3690();
		Static166.aClass160_Sub1Array1 = new Class160_Sub1[Static598.anInt9726 + 1 - Static132.anInt2228];
		for (@Pc(67) int local67 = 0; local67 < Static236.anInt3827; local67++) {
			@Pc(72) int local72 = arg0.method3690();
			@Pc(80) Class160_Sub1 local80 = Static166.aClass160_Sub1Array1[local72] = new Class160_Sub1();
			local80.anInt3884 = arg0.method3642();
			local80.anInt3889 = arg0.method3671();
			local80.anInt3895 = Static132.anInt2228 + local72;
			local80.aString33 = arg0.method3674();
			local80.aString34 = arg0.method3674();
		}
		Static479.anInt8280 = arg0.method3671();
		Static299.aBoolean308 = true;
	}
}
