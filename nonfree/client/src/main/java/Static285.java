import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	public static int anInt5736;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "Lclient!rn;")
	public static Class155 aClass155_116;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public static int anInt5735 = 0;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "[I")
	public static int[] anIntArray597 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z")
	public static boolean method4730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static118.aBoolean169) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static96.aClass151ArrayArray1[local13] == null || Static96.aClass151ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(37) Class151 local37 = Static96.aClass151ArrayArray1[local13][local17];
		@Pc(46) int local46;
		if (arg0 == -1 && local37.anInt4721 == 0) {
			for (local46 = 0; local46 < Static152.anInt2876; local46++) {
				if (Static259.aShortArray87[local46] == 57 || Static259.aShortArray87[local46] == 1007 || Static259.aShortArray87[local46] == 20 || Static259.aShortArray87[local46] == 2 || Static259.aShortArray87[local46] == 58) {
					for (@Pc(89) Class151 local89 = Static243.method4115(Static196.anIntArray438[local46]); local89 != null; local89 = Static249.method4206(local89)) {
						if (local89.anInt4800 == local37.anInt4800) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = 0; local46 < Static152.anInt2876; local46++) {
				if (Static56.anIntArray99[local46] == arg0 && Static196.anIntArray438[local46] == local37.anInt4800 && (Static259.aShortArray87[local46] == 57 || Static259.aShortArray87[local46] == 1007 || Static259.aShortArray87[local46] == 20 || Static259.aShortArray87[local46] == 2 || Static259.aShortArray87[local46] == 58)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZIIIII)V")
	public static void method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static245.method4932(arg4)) {
			Static243.method4112(arg5, arg6, -1, arg0, arg3, arg2, arg1, arg7, Static96.aClass151ArrayArray1[arg4]);
		} else if (arg5 == -1) {
			for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
				Static292.aBooleanArray129[local29] = true;
			}
		} else {
			Static292.aBooleanArray129[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII[[I)I")
	public static int method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[][] arg4) {
		@Pc(26) int local26 = arg4[arg0 + 1][arg3] * arg1 + (128 - arg1) * arg4[arg0][arg3] >> 7;
		@Pc(57) int local57 = arg4[arg0 + 1][arg3 + 1] * arg1 + arg4[arg0][arg3 + 1] * (128 - arg1) >> 7;
		return local26 * (128 - arg2) + arg2 * local57 >> 7;
	}
}
