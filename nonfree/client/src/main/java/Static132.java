import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jl", name = "ab", descriptor = "Lclient!ph;")
	public static Class138 aClass138_42;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString95 = "wave2:";

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString96 = "Connecting to update server";

	@OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!ph;I)[Lclient!wi;")
	public static Class103_Sub2[] method2153(@OriginalArg(0) int arg0, @OriginalArg(2) Class138 arg1) {
		return Static27.method486(arg0, 0, arg1) ? Static131.method2058() : null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BZ)V")
	public static void method2155(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static89.aBoolean128) {
			Static89.aBoolean128 = arg0;
			Static44.method781();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBILclient!qf;IILclient!mo;)V")
	public static void method2157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class146 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class103 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static101.anInt1895 == 4) {
			local19 = (int) Static2.aFloat1 & 0x7FF;
		} else {
			local19 = Static39.anInt794 + (int) Static2.aFloat1 & 0x7FF;
		}
		@Pc(35) int local35 = arg1 * arg1 + arg0 * arg0;
		@Pc(47) int local47 = Math.max(arg2.anInt4345 / 2, arg2.anInt4371 / 2) + 10;
		if (local35 > local47 * local47) {
			return;
		}
		@Pc(61) int local61 = Class17.anIntArray22[local19];
		@Pc(70) int local70 = Class17.anIntArray24[local19];
		if (Static101.anInt1895 != 4) {
			local70 = local70 * 256 / (Static54.anInt1055 + 256);
			local61 = local61 * 256 / (Static54.anInt1055 + 256);
		}
		@Pc(101) int local101 = arg0 * local70 - arg1 * local61 >> 16;
		@Pc(111) int local111 = local70 * arg1 + local61 * arg0 >> 16;
		if (Static291.aBoolean404) {
			((Class103_Sub1) arg5).method2439(local111 + arg4 + arg2.anInt4345 / 2 - arg5.anInt5860 / 2, -(arg5.anInt5856 / 2) + -local101 + arg3 + arg2.anInt4371 / 2, (Class1_Sub1_Sub3_Sub1) arg2.method3519(false));
		} else {
			((Class103_Sub2) arg5).method4605(arg2.anInt4345 / 2 + arg4 + local111 - arg5.anInt5860 / 2, -local101 + arg3 + arg2.anInt4371 / 2 + -(arg5.anInt5856 / 2), arg2.anIntArray362, arg2.anIntArray363);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method2160(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
