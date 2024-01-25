import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIII)I")
	public static int method6964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static51.aClass215Array6 == null) {
			return 0;
		}
		if (arg1 < 3) {
			@Pc(14) int local14 = arg4 >> 7;
			@Pc(18) int local18 = arg3 >> 7;
			if (arg2 < 0 || arg0 < 0 || Static37.anInt7512 - 1 < arg2 || arg0 > Static329.anInt6247 - 1) {
				return 0;
			}
			if (local14 < 1 || local18 < 1 || Static37.anInt7512 - 1 < local14 || Static329.anInt6247 - 1 < local18) {
				return 0;
			}
			@Pc(91) boolean local91 = (Static387.aByteArrayArrayArray18[1][arg4 >> 7][arg3 >> 7] & 0x2) != 0;
			@Pc(116) boolean local116;
			@Pc(132) boolean local132;
			if ((arg4 & 0x7F) == 0) {
				local116 = (Static387.aByteArrayArrayArray18[1][local14 - 1][arg3 >> 7] & 0x2) != 0;
				local132 = (Static387.aByteArrayArrayArray18[1][local14][arg3 >> 7] & 0x2) != 0;
				if (local132 != local116) {
					local91 = (Static387.aByteArrayArrayArray18[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg3 & 0x7F) == 0) {
				local116 = (Static387.aByteArrayArrayArray18[1][arg4 >> 7][local18 - 1] & 0x2) != 0;
				local132 = (Static387.aByteArrayArrayArray18[1][arg4 >> 7][local18] & 0x2) != 0;
				if (local132 != local116) {
					local91 = (Static387.aByteArrayArrayArray18[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local91) {
				arg1++;
			}
		}
		return Static51.aClass215Array6[arg1].aa(arg4, arg3);
	}
}
