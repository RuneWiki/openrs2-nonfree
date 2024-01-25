import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "Lclient!bn;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_1 = new Class4_Sub11_Sub1(15000);

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_59 = new Class216(41, 7);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZI)V")
	public static void method2742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static436.anInt7550 == 1) {
			Static524.method7049(Static46.aClass4_Sub5_Sub17_1, arg0, arg1);
		} else if (Static436.anInt7550 == 2) {
			if (Static423.aBoolean517) {
				Static459.method6401(arg1 + Static383.method8455(), Static286.method4120() + arg0);
			} else {
				Static459.method6401(arg1, arg0);
			}
		}
		Static46.aClass4_Sub5_Sub17_1 = null;
		Static436.anInt7550 = 0;
	}
}
