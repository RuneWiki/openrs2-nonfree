import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!lga;")
	public static Class223 aClass223_118;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt9970;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_187 = new Class322(1, 4);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_188 = new Class322(83, -1);

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "[Lclient!gd;")
	public static final Class130[] aClass130Array1 = new Class130[37];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
	public static void method8662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static398.anInt6878 <= arg5 - arg0 && arg5 + arg0 <= Static8.anInt136 && arg1 - arg0 >= Static605.anInt9561 && arg0 + arg1 <= Static223.anInt4380) {
			Static373.method5635(arg4, arg3, arg0, arg1, arg2, arg5);
		} else {
			Static575.method8330(arg1, arg3, arg2, arg5, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method8664(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg1, 3);
		local9.method2040();
		local9.aString17 = arg0;
	}
}
