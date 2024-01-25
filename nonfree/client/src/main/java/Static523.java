import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	public static void method7750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class167 local17 = Static198.aClass167ArrayArray1[arg0][arg2];
		Static251.method4501(local17 == null ? Static305.aClass167_6 : local17, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public static void method7751(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub6 local10 = Static367.method6025(14, arg0);
		local10.method1896();
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(BII)Z")
	public static boolean method7752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(20) Class292 local20 = Static253.aClass146_2.method3356(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local20.method7186(arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIII)V")
	public static void method7753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static535.anInt9696 && arg3 <= Static35.anInt993) {
			@Pc(23) int local23 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg2);
			@Pc(29) int local29 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg1);
			Static443.method6923(local29, arg3, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[FI)[F")
	public static float[] method7754(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(15) float[] local15 = new float[arg1];
		Static602.method4665(arg0, 0, local15, 0, arg1);
		return local15;
	}
}
