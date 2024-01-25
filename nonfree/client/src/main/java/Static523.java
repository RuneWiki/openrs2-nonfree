import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_62 = new Class353();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method7235(@OriginalArg(1) int arg0) {
		Static589.method7834(arg0, Static568.aClass351_16.method7651(Static307.anInt5279));
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)I")
	public static int method7242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static199.aClass47Array1 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(16) int local16 = arg2 >> 9;
			@Pc(20) int local20 = arg3 >> 9;
			if (arg1 < 0 || arg0 < 0 || Static71.anInt1410 - 1 < arg1 || Static471.anInt8012 - 1 < arg0) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && Static71.anInt1410 - 1 >= local16 && local20 <= Static471.anInt8012 - 1) {
				@Pc(90) boolean local90 = (Static455.aByteArrayArrayArray17[1][arg2 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(128) boolean local128;
				if ((arg2 & 0x1FF) == 0) {
					local112 = (Static455.aByteArrayArrayArray17[1][local16 - 1][arg3 >> 9] & 0x2) != 0;
					local128 = (Static455.aByteArrayArrayArray17[1][local16][arg3 >> 9] & 0x2) != 0;
					if (local128 != local112) {
						local90 = (Static455.aByteArrayArrayArray17[1][arg1][arg0] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local112 = (Static455.aByteArrayArrayArray17[1][arg2 >> 9][local20 - 1] & 0x2) != 0;
					local128 = (Static455.aByteArrayArrayArray17[1][arg2 >> 9][local20] & 0x2) != 0;
					if (local128 != local112) {
						local90 = (Static455.aByteArrayArrayArray17[1][arg1][arg0] & 0x2) != 0;
					}
				}
				if (local90) {
					arg4++;
				}
				return Static199.aClass47Array1[arg4].method7550(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static199.aClass47Array1[arg4].method7550(arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
	public static boolean method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static375.method5039(arg0, arg1) | (arg0 & 0x800) != 0 || Static113.method1787(arg1, arg0);
	}
}
