import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!uda", name = "G", descriptor = "Lclient!o;")
	public static final Class260 aClass260_11 = new Class260(2);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public static void method8581() {
		if (Static599.aBoolean682) {
			return;
		}
		Static325.method5095(Static501.aClass89ArrayArrayArray3);
		if (Static389.aClass89ArrayArrayArray2 != null) {
			Static325.method5095(Static389.aClass89ArrayArrayArray2);
		}
		Static599.aBoolean682 = true;
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)I")
	public static int method8582() {
		if (Static455.aBoolean533) {
			return 6;
		} else if (Static379.aClass14_Sub2_Sub20_3 == null) {
			return 0;
		} else {
			@Pc(23) int local23 = Static379.aClass14_Sub2_Sub20_3.anInt10001;
			if (Static668.method9270(local23)) {
				return 1;
			} else if (Static291.method7605(local23)) {
				return 2;
			} else if (Static392.method5967(local23)) {
				return 3;
			} else if (Static621.method8720(local23)) {
				return 4;
			} else if (Static365.method5502(local23)) {
				return 7;
			} else if (local23 == 50) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)I")
	public static int method8583(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method8584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static558.method8063(arg4)) {
			return;
		}
		if (Static359.aClass299ArrayArray2[arg4] == null) {
			Static80.method1370(Static339.aClass299ArrayArray1[arg4], -1, arg6, arg3, arg9, arg7, arg10, arg2, arg1, arg8, arg5, arg0);
		} else {
			Static80.method1370(Static359.aClass299ArrayArray2[arg4], -1, arg6, arg3, arg9, arg7, arg10, arg2, arg1, arg8, arg5, arg0);
		}
	}
}
