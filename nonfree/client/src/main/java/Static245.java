import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_116 = new Class131(46, 2);

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[I")
	public static final int[] anIntArray351 = new int[32];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)I")
	public static int method3605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static92.aClass136Array1 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(21) int local21 = arg3 >> 7;
			@Pc(25) int local25 = arg2 >> 7;
			if (arg0 < 0 || arg4 < 0 || arg0 > Static135.anInt2314 - 1 || arg4 > Static352.anInt6022 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static135.anInt2314 - 1 >= local21 && local25 <= Static352.anInt6022 - 1) {
				@Pc(92) boolean local92 = (Static184.aByteArrayArrayArray3[1][arg3 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(117) boolean local117;
				@Pc(136) boolean local136;
				if ((arg3 & 0x7F) == 0) {
					local117 = (Static184.aByteArrayArrayArray3[1][local21 - 1][arg2 >> 7] & 0x2) != 0;
					local136 = (Static184.aByteArrayArrayArray3[1][local21][arg2 >> 7] & 0x2) != 0;
					if (local136 != local117) {
						local92 = (Static184.aByteArrayArrayArray3[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local117 = (Static184.aByteArrayArrayArray3[1][arg3 >> 7][local25 - 1] & 0x2) != 0;
					local136 = (Static184.aByteArrayArrayArray3[1][arg3 >> 7][local25] & 0x2) != 0;
					if (local136 != local117) {
						local92 = (Static184.aByteArrayArrayArray3[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local92) {
					arg1++;
				}
				return Static92.aClass136Array1[arg1].va(arg3, arg2);
			} else {
				return 0;
			}
		} else {
			return Static92.aClass136Array1[arg1].va(arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)I")
	public static int method3606(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	public static void method3607() {
		Static228.aClass1_Sub8_2 = new Class1_Sub8(Static336.aClass84_76.method1678(Static167.anInt3118), "", Static246.anInt4394, 1008, -1, 0L, 0, 0, true, false);
	}
}
