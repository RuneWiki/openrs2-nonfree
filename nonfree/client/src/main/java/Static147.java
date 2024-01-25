import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public static int anInt2986;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[[[Lclient!hg;")
	public static Class101[][][] aClass101ArrayArrayArray1;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static final int anInt2987 = -1;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public static int anInt2995 = -1;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	public static int anInt2996 = 0;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "[I")
	public static final int[] anIntArray184 = new int[14];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static165.anInt3313 <= arg5 && Static152.anInt3132 >= arg5 && arg3 >= Static165.anInt3313 && arg3 <= Static152.anInt3132 && arg0 >= Static165.anInt3313 && arg0 <= Static152.anInt3132 && arg6 >= Static165.anInt3313 && Static152.anInt3132 >= arg6 && arg1 >= Static172.anInt3442 && arg1 <= Static324.anInt5590 && arg8 >= Static172.anInt3442 && arg8 <= Static324.anInt5590 && arg4 >= Static172.anInt3442 && arg4 <= Static324.anInt5590 && arg2 >= Static172.anInt3442 && arg2 <= Static324.anInt5590) {
			Static84.method1575(arg5, arg7, arg4, arg2, arg6, arg8, arg0, arg3, arg1);
		} else {
			Static217.method3262(arg5, arg3, arg1, arg0, arg8, arg6, arg2, arg4, arg7);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method2522() {
		Static95.anInt2186 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static184.aClass6_Sub1Array1[local9] = null;
			Static340.aByteArray74[local9] = 1;
			Static373.aClass216Array1[local9] = null;
		}
	}
}
