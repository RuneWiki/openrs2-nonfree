import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt3133;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([SZ[Ljava/lang/String;)V")
	public static void method2692(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static23.method347(arg1, 0, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method2693(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static244.anInt4491; local9++) {
			if (arg0.equalsIgnoreCase(Static328.aStringArray27[local9])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static140.aStringArray12[local9])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static76.method1083(arg3)) {
			if (Static140.aClass97ArrayArray1[arg3] == null) {
				Static270.method4037(Static360.aClass97ArrayArray2[arg3], arg7, arg4, arg6, -1, arg1, arg0, arg2, arg5);
			} else {
				Static270.method4037(Static140.aClass97ArrayArray1[arg3], arg7, arg4, arg6, -1, arg1, arg0, arg2, arg5);
			}
		} else if (arg0 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static543.aBooleanArray30[local20] = true;
			}
		} else {
			Static543.aBooleanArray30[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIB)Z")
	public static boolean method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method2697(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static49.method762(arg2, arg4, arg1, arg3, null, arg0, -1, arg5);
	}
}
