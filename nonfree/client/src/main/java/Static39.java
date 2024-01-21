import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt1055;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIILclient!ab;)V")
	public static void method720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class2_Sub2 arg6) {
		@Pc(29) int local29;
		if (arg5 < 0 || arg5 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local29 = arg6.method1698();
				if (local29 == 0) {
					break;
				}
				if (local29 == 1) {
					arg6.method1698();
					break;
				}
				if (local29 <= 49) {
					arg6.method1698();
				}
			}
			return;
		}
		Static49.aByteArrayArrayArray4[arg4][arg5][arg0] = 0;
		while (true) {
			local29 = arg6.method1698();
			if (local29 == 0) {
				if (arg4 == 0) {
					Static78.anIntArrayArrayArray6[0][arg5][arg0] = -Static178.method2781(arg0 + arg3 + 556238, arg5 + 932731 - -arg2) * 8;
				} else {
					Static78.anIntArrayArrayArray6[arg4][arg5][arg0] = Static78.anIntArrayArrayArray6[arg4 - 1][arg5][arg0] - 240;
				}
				break;
			}
			if (local29 == 1) {
				@Pc(132) int local132 = arg6.method1698();
				if (local132 == 1) {
					local132 = 0;
				}
				if (arg4 == 0) {
					Static78.anIntArrayArrayArray6[0][arg5][arg0] = -local132 * 8;
				} else {
					Static78.anIntArrayArrayArray6[arg4][arg5][arg0] = Static78.anIntArrayArrayArray6[arg4 - 1][arg5][arg0] - local132 * 8;
				}
				break;
			}
			if (local29 <= 49) {
				Static160.aByteArrayArrayArray8[arg4][arg5][arg0] = arg6.method1707();
				Static41.aByteArrayArrayArray3[arg4][arg5][arg0] = (byte) ((local29 - 2) / 4);
				Static18.aByteArrayArrayArray9[arg4][arg5][arg0] = (byte) (local29 + arg1 - 2 & 0x3);
			} else if (local29 <= 81) {
				Static49.aByteArrayArrayArray4[arg4][arg5][arg0] = (byte) (local29 - 49);
			} else {
				Static116.aByteArrayArrayArray7[arg4][arg5][arg0] = (byte) (local29 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method721() {
		anIntArrayArrayArray5 = null;
	}
}
