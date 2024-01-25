import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	public static int anInt10598 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIII)I")
	public static int method8945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static177.aClass84Array2 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(28) int local28 = arg3 >> 9;
			@Pc(32) int local32 = arg1 >> 9;
			if (arg4 < 0 || arg0 < 0 || Static271.anInt4910 - 1 < arg4 || Static613.anInt9909 - 1 < arg0) {
				return 0;
			} else if (local28 >= 1 && local32 >= 1 && local28 <= Static271.anInt4910 - 1 && local32 <= Static613.anInt9909 - 1) {
				@Pc(121) boolean local121 = (Static172.aByteArrayArrayArray23[1][arg3 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(146) boolean local146;
				@Pc(166) boolean local166;
				if ((arg3 & 0x1FF) == 0) {
					local146 = (Static172.aByteArrayArrayArray23[1][local28 - 1][arg1 >> 9] & 0x2) != 0;
					local166 = (Static172.aByteArrayArrayArray23[1][local28][arg1 >> 9] & 0x2) != 0;
					if (local166 != local146) {
						local121 = (Static172.aByteArrayArrayArray23[1][arg4][arg0] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local146 = (Static172.aByteArrayArrayArray23[1][arg3 >> 9][local32 - 1] & 0x2) != 0;
					local166 = (Static172.aByteArrayArrayArray23[1][arg3 >> 9][local32] & 0x2) != 0;
					if (local146 != local166) {
						local121 = (Static172.aByteArrayArrayArray23[1][arg4][arg0] & 0x2) != 0;
					}
				}
				if (local121) {
					arg2++;
				}
				return Static177.aClass84Array2[arg2].method7625(arg3, arg1);
			} else {
				return 0;
			}
		} else {
			return Static177.aClass84Array2[arg2].method7625(arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII)Z")
	public static boolean method8947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
