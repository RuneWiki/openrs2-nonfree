import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public static final int anInt2785 = 0;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
	public static final int[] anIntArray163 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[I")
	public static final int[] anIntArray164 = new int[8];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static165.anInt3313 <= arg0 && arg1 <= Static152.anInt3132 && arg4 >= Static172.anInt3442 && arg6 <= Static324.anInt5590) {
			Static43.method974(arg5, arg6, arg2, arg1, arg0, arg3, arg4);
		} else {
			Static300.method4422(arg6, arg5, arg0, arg1, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	public static void method2328(@OriginalArg(1) boolean arg0) {
		Static280.method4210();
		if (Static217.anInt3941 != 30 && Static217.anInt3941 != 25) {
			return;
		}
		Static258.anInt4690++;
		if (Static258.anInt4690 < 50 && !arg0) {
			return;
		}
		Static258.anInt4690 = 0;
		if (!Static327.aBoolean352 && Static177.aClass73_6 != null) {
			Static403.method5961(Static450.aClass92_155);
			try {
				Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
			} catch (@Pc(55) IOException local55) {
				Static327.aBoolean352 = true;
			}
		}
		Static280.method4210();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ae;)Ljava/lang/String;")
	public static String method2329(@OriginalArg(1) Class6_Sub1 arg0) {
		return Static101.method1829(arg0);
	}
}
