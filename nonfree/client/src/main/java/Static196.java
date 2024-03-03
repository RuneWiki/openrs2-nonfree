import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	public static int anInt3769;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIB)I", line = 164)
	public static int method3720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static340.aClass6Array4 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(21) int local21 = arg3 >> 7;
			@Pc(25) int local25 = arg4 >> 7;
			if (arg2 < 0 || arg0 < 0 || Class241.anInt7020 - 1 < arg2 || arg0 > OutputStream_Sub1.anInt4442 - 1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Class241.anInt7020 - 1 < local21 || local25 > OutputStream_Sub1.anInt4442 - 1) {
				return 0;
			}
			@Pc(91) boolean local91 = (Static334.aByteArrayArrayArray16[1][arg3 >> 7][arg4 >> 7] & 0x2) != 0;
			@Pc(116) boolean local116;
			@Pc(135) boolean local135;
			if ((arg3 & 0x7F) == 0) {
				local116 = (Static334.aByteArrayArrayArray16[1][local21 - 1][arg4 >> 7] & 0x2) != 0;
				local135 = (Static334.aByteArrayArrayArray16[1][local21][arg4 >> 7] & 0x2) != 0;
				if (local135 != local116) {
					local91 = (Static334.aByteArrayArrayArray16[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg4 & 0x7F) == 0) {
				local116 = (Static334.aByteArrayArrayArray16[1][arg3 >> 7][local25 - 1] & 0x2) != 0;
				local135 = (Static334.aByteArrayArrayArray16[1][arg3 >> 7][local25] & 0x2) != 0;
				if (local135 != local116) {
					local91 = (Static334.aByteArrayArrayArray16[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local91) {
				arg1++;
			}
		}
		return Static340.aClass6Array4[arg1].method5729(arg3, arg4);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 237)
	public static void method3721() {
		Static25.aClass161ArrayArray1 = new Class161[Static260.aClass197_68.method5093()][];
		Static106.aClass161ArrayArray2 = new Class161[Static260.aClass197_68.method5093()][];
		Static120.aBooleanArray21 = new boolean[Static260.aClass197_68.method5093()];
	}
}
