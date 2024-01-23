import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public static int anInt3641;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_15;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	public static int[] anIntArray326 = new int[100];

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45 = null;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int anInt3644 = 1;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[I")
	public static int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public static int anInt3648 = -1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
	public static boolean method2928(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
	public static int method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(30) int local30 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local30;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([[II)V")
	public static void method2930(@OriginalArg(0) int[][] arg0) {
		Static22.anIntArrayArray3 = arg0;
	}
}
