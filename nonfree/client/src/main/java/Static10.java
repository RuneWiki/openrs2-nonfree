import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	public static int anInt180;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "I")
	public static int anInt187;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString6 = "white:";

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII[[I)I")
	public static int method150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4) {
		@Pc(31) int local31 = arg4[arg3 + 1][arg0] * arg1 + arg4[arg3][arg0] * (128 - arg1) >> 7;
		@Pc(58) int local58 = arg4[arg3][arg0 + 1] * (128 - arg1) + arg4[arg3 + 1][arg0 + 1] * arg1 >> 7;
		return local31 * (128 - arg2) + arg2 * local58 >> 7;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
	public static void method151() {
		@Pc(10) Class1_Sub10 local10;
		for (local10 = (Class1_Sub10) Static232.aClass24_20.method460(); local10 != null; local10 = (Class1_Sub10) Static232.aClass24_20.method464()) {
			if (local10.aBoolean76) {
				local10.method873();
			}
		}
		for (local10 = (Class1_Sub10) Static213.aClass24_22.method460(); local10 != null; local10 = (Class1_Sub10) Static213.aClass24_22.method464()) {
			if (local10.aBoolean76) {
				local10.method873();
			}
		}
	}
}
