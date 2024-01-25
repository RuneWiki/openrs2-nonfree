import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "[I")
	public static int[] anIntArray710;

	@OriginalMember(owner = "client!taa", name = "v", descriptor = "I")
	public static int anInt8266;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIII)V")
	public static void method6859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg3;
		@Pc(20) int local20 = arg4 + arg3;
		for (@Pc(22) int local22 = arg4; local22 < local20; local22++) {
			Static257.method4540(Static68.anIntArrayArray24[local22], arg2, arg5, arg1);
		}
		for (@Pc(38) int local38 = arg0; local38 > local10; local38--) {
			Static257.method4540(Static68.anIntArrayArray24[local38], arg2, arg5, arg1);
		}
		@Pc(57) int local57 = arg5 + arg3;
		@Pc(61) int local61 = arg1 - arg3;
		for (@Pc(63) int local63 = local20; local63 <= local10; local63++) {
			@Pc(69) int[] local69 = Static68.anIntArrayArray24[local63];
			Static257.method4540(local69, arg2, arg5, local57);
			Static257.method4540(local69, arg2, local61, arg1);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6860(@OriginalArg(1) String arg0) {
		if (Static305.aStringArray37 == null) {
			Static48.method1023();
		}
		@Pc(14) String[] local14 = Static439.method6626('\n', arg0);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static504.anInt9379; local20 > 0; local20--) {
				Static305.aStringArray37[local20] = Static305.aStringArray37[local20 - 1];
			}
			Static305.aStringArray37[0] = local14[local16];
			if (Static504.anInt9379 < Static305.aStringArray37.length - 1) {
				Static504.anInt9379++;
				if (Static167.anInt3861 > 0) {
					Static167.anInt3861++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z")
	public static boolean method6861(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
