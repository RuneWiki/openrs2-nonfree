import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public static int anInt392;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public static int anInt391 = 0;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!va;")
	public static final Class199 aClass199_1 = new Class199(16);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZI)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static313.aByteArrayArrayArray12 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIBII)I")
	public static int method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static301.aClass73Array31 == null) {
			return 0;
		}
		if (arg3 < 3) {
			@Pc(21) int local21 = arg4 >> 7;
			@Pc(25) int local25 = arg2 >> 7;
			if (arg1 < 0 || arg0 < 0 || Static95.anInt6381 - 1 < arg1 || arg0 > Static237.anInt4532 - 1) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || Static95.anInt6381 - 1 < local21 || Static237.anInt4532 - 1 < local25) {
				return 0;
			}
			@Pc(92) boolean local92 = (Static313.aByteArrayArrayArray12[1][arg4 >> 7][arg2 >> 7] & 0x2) != 0;
			@Pc(117) boolean local117;
			@Pc(136) boolean local136;
			if ((arg4 & 0x7F) == 0) {
				local117 = (Static313.aByteArrayArrayArray12[1][local21 - 1][arg2 >> 7] & 0x2) != 0;
				local136 = (Static313.aByteArrayArrayArray12[1][local21][arg2 >> 7] & 0x2) != 0;
				if (local136 != local117) {
					local92 = (Static313.aByteArrayArrayArray12[1][arg1][arg0] & 0x2) != 0;
				}
			}
			if ((arg2 & 0x7F) == 0) {
				local117 = (Static313.aByteArrayArrayArray12[1][arg4 >> 7][local25 - 1] & 0x2) != 0;
				local136 = (Static313.aByteArrayArrayArray12[1][arg4 >> 7][local25] & 0x2) != 0;
				if (local117 != local136) {
					local92 = (Static313.aByteArrayArrayArray12[1][arg1][arg0] & 0x2) != 0;
				}
			}
			if (local92) {
				arg3++;
			}
		}
		return Static301.aClass73Array31[arg3].method4932(arg4, arg2);
	}
}
