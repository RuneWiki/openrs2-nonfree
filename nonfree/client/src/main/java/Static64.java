import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
	public static int anInt10320;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString116 = null;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
	public static int anInt10318 = -1;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)V")
	public static void method8730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static194.anInt3940 == 1) {
			Static20.method337(arg1, Static120.aClass6_Sub2_Sub4_1, arg0);
		} else if (Static194.anInt3940 == 2) {
			if (Static389.aBoolean497) {
				Static293.method5060(arg0 + Static240.method4161(), arg1 - -Static452.method6945());
			} else {
				Static293.method5060(arg0, arg1);
			}
		}
		Static194.anInt3940 = 0;
		Static120.aClass6_Sub2_Sub4_1 = null;
	}
}
