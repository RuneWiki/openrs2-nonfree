import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Z")
	public static boolean aBoolean545 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIBI)I")
	public static int method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static544.aClass205Array3 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(27) int local27 = arg1 >> 9;
			@Pc(31) int local31 = arg0 >> 9;
			if (arg3 < 0 || arg2 < 0 || Static459.anInt7799 - 1 < arg3 || arg2 > Static482.anInt7990 - 1) {
				return 0;
			}
			if (local27 < 1 || local31 < 1 || local27 > Static459.anInt7799 - 1 || local31 > Static482.anInt7990 - 1) {
				return 0;
			}
			@Pc(97) boolean local97 = (Static530.aByteArrayArrayArray17[1][arg1 >> 9][arg0 >> 9] & 0x2) != 0;
			@Pc(122) boolean local122;
			@Pc(138) boolean local138;
			if ((arg1 & 0x1FF) == 0) {
				local122 = (Static530.aByteArrayArrayArray17[1][local27 - 1][arg0 >> 9] & 0x2) != 0;
				local138 = (Static530.aByteArrayArrayArray17[1][local27][arg0 >> 9] & 0x2) != 0;
				if (local122 != local138) {
					local97 = (Static530.aByteArrayArrayArray17[1][arg3][arg2] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x1FF) == 0) {
				local122 = (Static530.aByteArrayArrayArray17[1][arg1 >> 9][local31 - 1] & 0x2) != 0;
				local138 = (Static530.aByteArrayArrayArray17[1][arg1 >> 9][local31] & 0x2) != 0;
				if (local122 != local138) {
					local97 = (Static530.aByteArrayArrayArray17[1][arg3][arg2] & 0x2) != 0;
				}
			}
			if (local97) {
				arg4++;
			}
		}
		return Static544.aClass205Array3[arg4].aa(arg1, arg0);
	}
}
