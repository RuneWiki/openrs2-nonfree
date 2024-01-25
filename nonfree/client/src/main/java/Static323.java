import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public static final int anInt6118 = 1406;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)I")
	public static int method5570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static296.aClass7Array11 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(19) int local19 = arg3 >> 7;
			@Pc(23) int local23 = arg2 >> 7;
			if (arg0 < 0 || arg4 < 0 || arg0 > Static237.anInt4563 - 1 || arg4 > Static373.anInt6694 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static237.anInt4563 - 1 >= local19 && local23 <= Static373.anInt6694 - 1) {
				@Pc(94) boolean local94 = (Static379.aByteArrayArrayArray13[1][arg3 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(116) boolean local116;
				@Pc(132) boolean local132;
				if ((arg3 & 0x7F) == 0) {
					local116 = (Static379.aByteArrayArrayArray13[1][local19 - 1][arg2 >> 7] & 0x2) != 0;
					local132 = (Static379.aByteArrayArrayArray13[1][local19][arg2 >> 7] & 0x2) != 0;
					if (local116 != local132) {
						local94 = (Static379.aByteArrayArrayArray13[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local116 = (Static379.aByteArrayArrayArray13[1][arg3 >> 7][local23 - 1] & 0x2) != 0;
					local132 = (Static379.aByteArrayArrayArray13[1][arg3 >> 7][local23] & 0x2) != 0;
					if (local116 != local132) {
						local94 = (Static379.aByteArrayArrayArray13[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local94) {
					arg1++;
				}
				return Static296.aClass7Array11[arg1].aa(arg3, arg2);
			} else {
				return 0;
			}
		} else {
			return Static296.aClass7Array11[arg1].aa(arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
	public static void method5571(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub16 local13 = Static422.method6588(14, arg0);
		local13.method6700();
	}
}
