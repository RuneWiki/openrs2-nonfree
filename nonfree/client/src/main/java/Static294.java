import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!js", name = "K", descriptor = "Lclient!wk;")
	public static Class389 aClass389_1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ha;Lclient!uaa;B)V")
	public static void method4749(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class345 arg1) {
		@Pc(31) boolean local31 = Static110.aClass105_1.method2658(arg1.anInt9612 | 0xFF000000, arg1.anInt9654, arg1.anInt9652, arg0, arg1.anInt9585, arg1.anInt9613, arg1.aBoolean817 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 : null) == null;
		if (local31) {
			Static271.aClass114_40.method2807(new Class5_Sub44(arg1.anInt9654, arg1.anInt9585, arg1.anInt9613, arg1.anInt9612 | 0xFF000000, arg1.anInt9652, arg1.aBoolean817));
			Static211.method3351(arg1);
		}
	}

	@OriginalMember(owner = "client!js", name = "k", descriptor = "(I)V")
	public static void method4752() {
		Static356.anIntArray371 = Static72.method979(0.4F);
	}
}
