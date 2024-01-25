import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static726 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[I")
	public static final int[] anIntArray765 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
	public static int anInt11286 = 0;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!mfa;")
	public static final Class239 aClass239_22 = new Class239();

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V")
	public static void method9868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static187.anInt3065 == 1) {
			Static594.method8179(Static40.aClass2_Sub6_Sub20_1, arg0, arg1);
		} else if (Static187.anInt3065 == 2) {
			if (Static392.aBoolean549) {
				Static242.method7777(Static400.method5900() + arg1, arg0 + Static637.method3733());
			} else {
				Static242.method7777(arg1, arg0);
			}
		}
		Static187.anInt3065 = 0;
		Static40.aClass2_Sub6_Sub20_1 = null;
	}
}
