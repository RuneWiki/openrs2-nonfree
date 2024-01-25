import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hv", name = "G", descriptor = "Lclient!te;")
	public static Class324 aClass324_1;

	@OriginalMember(owner = "client!hv", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "I")
	public static int anInt3812 = 0;

	@OriginalMember(owner = "client!hv", name = "P", descriptor = "[I")
	public static final int[] anIntArray311 = new int[2];

	@OriginalMember(owner = "client!hv", name = "S", descriptor = "[I")
	public static final int[] anIntArray312 = new int[25];

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lclient!rt;")
	public static Class150 method3411() {
		try {
			return (Class150) Class.forName("Class150_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V")
	public static void method3412(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 11);
		local8.method4132();
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(III)V")
	public static void method3414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class248 local14 = Static211.aClass248ArrayArray1[arg1][arg0];
		if (local14 != null) {
			Static505.anInt6237 = local14.anInt6768;
			Static582.anInt9526 = local14.anInt6776;
			Static142.anInt8584 = local14.anInt6772;
		}
		Static533.method389();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIIZLclient!ha;)V")
	public static void method3417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class126 arg4) {
		arg4.method7045(arg1, arg2, arg0, arg3, -10660793);
		arg4.method7045(arg1 - 2, 16, arg0 + 1, arg3 + 1, -16777216);
		arg4.method7005(arg2 - 19, -16777216, -2 + arg1, arg0 + 18, arg3 + 1);
	}
}
