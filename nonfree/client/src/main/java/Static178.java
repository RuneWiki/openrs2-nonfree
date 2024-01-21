import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static int anInt4249;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1488 = Static170.method3101("rot:");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1490 = Static170.method3101("Loading interfaces )2 ");

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1489 = aClass28_1490;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!hd;IIIIIIZ)V")
	public static void method3188(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(23) int local23;
		if (arg6 < 0 || arg6 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local23 = arg0.method1545();
				if (local23 == 0) {
					break;
				}
				if (local23 == 1) {
					arg0.method1545();
					break;
				}
				if (local23 <= 49) {
					arg0.method1545();
				}
			}
			return;
		}
		Static157.aByteArrayArrayArray41[arg5][arg6][arg2] = 0;
		while (true) {
			local23 = arg0.method1545();
			if (local23 == 0) {
				if (arg5 == 0) {
					Static90.anIntArrayArrayArray31[0][arg6][arg2] = -Static54.method1224(arg4 + arg6 + 932731, arg1 + 556238 + arg2) * 8;
				} else {
					Static90.anIntArrayArrayArray31[arg5][arg6][arg2] = Static90.anIntArrayArrayArray31[arg5 - 1][arg6][arg2] - 240;
				}
				break;
			}
			if (local23 == 1) {
				@Pc(81) int local81 = arg0.method1545();
				if (local81 == 1) {
					local81 = 0;
				}
				if (arg5 == 0) {
					Static90.anIntArrayArrayArray31[0][arg6][arg2] = -local81 * 8;
				} else {
					Static90.anIntArrayArrayArray31[arg5][arg6][arg2] = Static90.anIntArrayArrayArray31[arg5 - 1][arg6][arg2] - local81 * 8;
				}
				break;
			}
			if (local23 <= 49) {
				Static48.aByteArrayArrayArray10[arg5][arg6][arg2] = arg0.method1508();
				Static107.aByteArrayArrayArray23[arg5][arg6][arg2] = (byte) ((local23 - 2) / 4);
				Static91.aByteArrayArrayArray44[arg5][arg6][arg2] = (byte) (arg3 + local23 - 2 & 0x3);
			} else if (local23 <= 81) {
				Static157.aByteArrayArrayArray41[arg5][arg6][arg2] = (byte) (local23 - 49);
			} else {
				Static57.aByteArrayArrayArray11[arg5][arg6][arg2] = (byte) (local23 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method3190() {
		aClass28_1489 = null;
		aClass28_1490 = null;
		aClass28_1488 = null;
	}
}
