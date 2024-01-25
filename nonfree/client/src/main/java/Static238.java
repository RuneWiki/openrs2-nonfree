import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!md", name = "G", descriptor = "I")
	public static int anInt4577;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "I")
	public static int anInt4575 = -1;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_103 = new Class209("K", "T", "K", "K");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!jn;B)Z")
	public static boolean method3679(@OriginalArg(0) Interface6 arg0) {
		@Pc(10) Class134 local10 = Static118.aClass165_2.method3799(arg0.method5153());
		if (local10.anInt3637 == -1) {
			return true;
		} else {
			@Pc(22) Class16 local22 = Static258.aClass120_4.method2660(local10.anInt3637);
			return local22.anInt355 == -1 ? true : local22.method325();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
	public static boolean method3680(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V")
	public static void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static12.aClass79_Sub1_1.anInt4920 != 0 && arg2 != 0 && Static66.anInt133 < 50 && arg3 != -1) {
			Static62.aClass218Array1[Static66.anInt133++] = new Class218((byte) 1, arg3, arg2, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!si;)Ljava/lang/String;")
	public static String method3684(@OriginalArg(1) Class2_Sub23 arg0) {
		return Static271.method4024(arg0);
	}
}
