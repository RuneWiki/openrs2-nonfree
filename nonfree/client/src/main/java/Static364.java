import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static364 {

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
	public static int anInt6575;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Lclient!dn;")
	public static Class69 aClass69_74;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIIIII)V")
	public static void method5911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static286.aClass1_Sub15_Sub1_1.anInt7030 != 0 && arg2 != 0 && Static482.anInt8558 < 50 && arg4 != -1) {
			Static314.aClass182Array1[Static482.anInt8558++] = new Class182((byte) 1, arg4, arg2, arg1, arg0, arg3);
		}
	}
}
