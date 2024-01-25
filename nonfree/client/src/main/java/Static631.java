import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Lclient!eba;")
	public static Class85 aClass85_2;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
	public static int anInt10199 = -1;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIII)I")
	public static int method8547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static639.aClass313Array2 == null) {
			return 0;
		}
		if (arg0 < 3) {
			@Pc(21) int local21 = arg1 >> 9;
			@Pc(25) int local25 = arg2 >> 9;
			if (arg3 < 0 || arg4 < 0 || Static362.anInt8653 - 1 < arg3 || Static206.anInt11291 - 1 < arg4) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Static362.anInt8653 - 1 < local21 || local25 > Static206.anInt11291 - 1) {
				return 0;
			}
			@Pc(101) boolean local101 = (Static6.aByteArrayArrayArray1[1][arg1 >> 9][arg2 >> 9] & 0x2) != 0;
			@Pc(126) boolean local126;
			@Pc(143) boolean local143;
			if ((arg1 & 0x1FF) == 0) {
				local126 = (Static6.aByteArrayArrayArray1[1][local21 - 1][arg2 >> 9] & 0x2) != 0;
				local143 = (Static6.aByteArrayArrayArray1[1][local21][arg2 >> 9] & 0x2) != 0;
				if (local143 != local126) {
					local101 = (Static6.aByteArrayArrayArray1[1][arg3][arg4] & 0x2) != 0;
				}
			}
			if ((arg2 & 0x1FF) == 0) {
				local126 = (Static6.aByteArrayArrayArray1[1][arg1 >> 9][local25 - 1] & 0x2) != 0;
				local143 = (Static6.aByteArrayArrayArray1[1][arg1 >> 9][local25] & 0x2) != 0;
				if (local143 != local126) {
					local101 = (Static6.aByteArrayArrayArray1[1][arg3][arg4] & 0x2) != 0;
				}
			}
			if (local101) {
				arg0++;
			}
		}
		return Static639.aClass313Array2[arg0].method9096(arg1, arg2);
	}
}
