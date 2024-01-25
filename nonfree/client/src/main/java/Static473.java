import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static473 {

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[Lclient!nd;")
	public static Class235_Sub1[] aClass235_Sub1Array1;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!v;")
	public static Class362 aClass362_54;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public static int anInt8160 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ae;IIIIZB)V")
	public static void method6969(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 <= 0) {
			Static276.method4067(arg2, arg3, arg0);
			return;
		}
		Static363.anInt6191 = arg3;
		Static382.anInt6400 = arg2;
		Static459.aBoolean514 = false;
		Static338.anInt5833 = 1;
		Static194.anInt3305 = 0;
		Static589.aClass8_129 = arg0;
		Static471.aClass6_Sub8_Sub4_9 = null;
		Static335.anInt5754 = Static544.aClass6_Sub8_Sub4_10.method5084() / arg1;
		if (Static335.anInt5754 < 1) {
			Static335.anInt5754 = 1;
		}
	}
}
