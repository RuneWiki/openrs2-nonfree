import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Lclient!jo;")
	public static Class6_Sub3_Sub4 aClass6_Sub3_Sub4_1;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
	public static int anInt4364;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	public static int anInt4365 = -1;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIII)I")
	public static int method3779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static195.aClass199Array1 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(21) int local21 = arg2 >> 9;
			@Pc(25) int local25 = arg3 >> 9;
			if (arg0 < 0 || arg4 < 0 || Static442.anInt7975 - 1 < arg0 || Static284.anInt7916 - 1 < arg4) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static442.anInt7975 - 1 && Static284.anInt7916 - 1 >= local25) {
				@Pc(88) boolean local88 = (Static197.aByteArrayArrayArray24[1][arg2 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(113) boolean local113;
				@Pc(129) boolean local129;
				if ((arg2 & 0x1FF) == 0) {
					local113 = (Static197.aByteArrayArrayArray24[1][local21 - 1][arg3 >> 9] & 0x2) != 0;
					local129 = (Static197.aByteArrayArrayArray24[1][local21][arg3 >> 9] & 0x2) != 0;
					if (local113 != local129) {
						local88 = (Static197.aByteArrayArrayArray24[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local113 = (Static197.aByteArrayArrayArray24[1][arg2 >> 9][local25 - 1] & 0x2) != 0;
					local129 = (Static197.aByteArrayArrayArray24[1][arg2 >> 9][local25] & 0x2) != 0;
					if (local129 != local113) {
						local88 = (Static197.aByteArrayArrayArray24[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local88) {
					arg1++;
				}
				return Static195.aClass199Array1[arg1].method8531(arg3, arg2);
			} else {
				return 0;
			}
		} else {
			return Static195.aClass199Array1[arg1].method8531(arg3, arg2);
		}
	}
}
