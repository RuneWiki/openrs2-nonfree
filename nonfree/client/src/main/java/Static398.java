import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	public static int anInt6687;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!jn;")
	public static Class179 aClass179_257;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Lclient!sha;")
	public static Class321 aClass321_30 = null;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZLclient!ae;IZIIJ)V")
	public static void method5739(@OriginalArg(2) Class8 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) long arg3) {
		Static557.anInt9343 = 0;
		Static589.aClass8_129 = arg0;
		Static194.anInt3305 = 0;
		Static264.aLong133 = arg3;
		Static382.anInt6400 = arg1;
		Static471.aClass6_Sub8_Sub4_9 = null;
		Static335.anInt5754 = 10000;
		Static459.aBoolean514 = false;
		Static338.anInt5833 = 1;
		Static363.anInt6191 = arg2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZ)V")
	public static void method5741(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static561.anInt9357 != -1) {
				Static582.method8066(Static561.anInt9357);
			}
			for (@Pc(19) Class6_Sub51 local19 = (Class6_Sub51) Static262.aClass209_35.method5037(); local19 != null; local19 = (Class6_Sub51) Static262.aClass209_35.method5036()) {
				if (!local19.method9176()) {
					local19 = (Class6_Sub51) Static262.aClass209_35.method5037();
					if (local19 == null) {
						break;
					}
				}
				Static199.method2913(true, false, local19);
			}
			Static561.anInt9357 = -1;
			Static262.aClass209_35 = new Class209(8);
			Static370.method5331();
			Static561.anInt9357 = Static609.anInt9947;
			Static420.method6263(false);
			Static509.method7248();
			Static295.method4219(Static561.anInt9357);
		}
		Static618.aBoolean708 = true;
	}
}
