import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
	public static int anInt5744 = 0;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "[I")
	public static final int[] anIntArray701 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)I")
	public static int method5030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static17.aClass33Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(24) int local24 = arg0 >> 7;
			@Pc(28) int local28 = arg4 >> 7;
			if (arg3 < 0 || arg1 < 0 || Static392.anInt6751 - 1 < arg3 || arg1 > Static307.anInt5484 - 1) {
				return 0;
			} else if (local24 >= 1 && local28 >= 1 && local24 <= Static392.anInt6751 - 1 && local28 <= Static307.anInt5484 - 1) {
				@Pc(97) boolean local97 = (Static244.aByteArrayArrayArray4[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(122) boolean local122;
				@Pc(141) boolean local141;
				if ((arg0 & 0x7F) == 0) {
					local122 = (Static244.aByteArrayArrayArray4[1][local24 - 1][arg4 >> 7] & 0x2) != 0;
					local141 = (Static244.aByteArrayArrayArray4[1][local24][arg4 >> 7] & 0x2) != 0;
					if (local122 != local141) {
						local97 = (Static244.aByteArrayArrayArray4[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local122 = (Static244.aByteArrayArrayArray4[1][arg0 >> 7][local28 - 1] & 0x2) != 0;
					local141 = (Static244.aByteArrayArrayArray4[1][arg0 >> 7][local28] & 0x2) != 0;
					if (local122 != local141) {
						local97 = (Static244.aByteArrayArrayArray4[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if (local97) {
					arg2++;
				}
				return Static17.aClass33Array1[arg2].method4055(arg0, arg4);
			} else {
				return 0;
			}
		} else {
			return Static17.aClass33Array1[arg2].method4055(arg0, arg4);
		}
	}
}
