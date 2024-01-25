import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
	public static boolean aBoolean731;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!paa;Lclient!ha;)V")
	public static void method8323(@OriginalArg(1) Class261 arg0, @OriginalArg(2) Class95 arg1) {
		@Pc(31) boolean local31 = Static72.aClass225_2.method4781(arg0.anInt6626, arg0.anInt6658, arg0.anInt6592 | 0xFF000000, arg0.anInt6619, arg0.anInt6585, arg0.aBoolean477 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 : null, arg1) == null;
		if (local31) {
			Static386.aClass109_38.method2323(new Class2_Sub44(arg0.anInt6585, arg0.anInt6626, arg0.anInt6658, arg0.anInt6592 | 0xFF000000, arg0.anInt6619, arg0.aBoolean477));
			Static624.method8351(arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public static void method8324(@OriginalArg(1) int arg0) {
		if (Static507.anInt8408 == 1) {
			Static69.anInt1229 = arg0;
		} else if (Static507.anInt8408 == 2) {
			Static354.anInt5584 = arg0;
		}
	}
}
