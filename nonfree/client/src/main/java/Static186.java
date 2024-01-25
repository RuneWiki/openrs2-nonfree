import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array10;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method3165(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		@Pc(41) int local41 = arg0 / 10;
		while (local41 != 0) {
			local41 /= 10;
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(69) int local69 = local37 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(84) int local84 = local73 - arg0 * 10;
			if (local84 < 10) {
				local56[local69] = (char) (local84 + 48);
			} else {
				local56[local69] = (char) (local84 + 87);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB[B)I")
	public static int method3166(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static260.method3992(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method3169(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static432.method6083(arg4, arg3, arg5, arg1, arg0, arg2, 0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!wp;I)V")
	public static void method3170(@OriginalArg(0) Class361 arg0) {
		if (arg0.anInt9646 == Static229.anInt4022) {
			Static319.aBooleanArray17[arg0.anInt9578] = true;
		}
	}
}
