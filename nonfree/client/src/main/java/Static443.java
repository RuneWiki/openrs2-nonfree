import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_225 = new Class214(31, 28);

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public static int anInt6230 = 1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)Z")
	public static boolean method4778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public static void method4782() {
		@Pc(6) Class167 local6 = Static250.aClass167_9;
		synchronized (Static250.aClass167_9) {
			Static250.aClass167_9.method3390();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ic;IIB)Lclient!qc;")
	public static Class199 method4784(@OriginalArg(0) Class113 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte[] local17 = arg0.method2274(arg1, 0);
		return local17 == null ? null : new Class199(local17);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method4785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static266.method2725(arg7)) {
			return;
		}
		if (Static11.aClass250ArrayArray1[arg7] == null) {
			Static52.method812(Static369.aClass250ArrayArray5[arg7], -1, arg6, arg4, arg3, arg1, arg0, arg8, arg2, arg5);
		} else {
			Static52.method812(Static11.aClass250ArrayArray1[arg7], -1, arg6, arg4, arg3, arg1, arg0, arg8, arg2, arg5);
		}
	}
}
