import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
	public static int anInt6617;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!dr;BI)V")
	public static void method5223(@OriginalArg(0) Class7_Sub14_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static106.aBoolean121 = false;
		Static345.anInt5547 = 0;
		Static268.method3596(arg0);
		Static251.method3353(arg0);
		if (Static106.aBoolean121) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt4989) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4989 + " psize:" + arg1);
		}
	}
}
