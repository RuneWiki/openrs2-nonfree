import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public static int anInt1616;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!ab;")
	public static Class3 aClass3_7;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Z")
	public static boolean aBoolean125 = true;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_37 = new Class208(76, 4);

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBII)I")
	public static int method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static128.aClass149Array1 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(14) int local14 = arg2 >> 7;
			@Pc(18) int local18 = arg1 >> 7;
			if (arg3 < 0 || arg0 < 0 || arg3 > Static89.anInt1891 - 1 || Static85.anInt1839 - 1 < arg0) {
				return 0;
			} else if (local14 >= 1 && local18 >= 1 && Static89.anInt1891 - 1 >= local14 && Static85.anInt1839 - 1 >= local18) {
				@Pc(84) boolean local84 = (Static329.aByteArrayArrayArray17[1][arg2 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(131) boolean local131;
				if ((arg2 & 0x7F) == 0) {
					local112 = (Static329.aByteArrayArrayArray17[1][local14 - 1][arg1 >> 7] & 0x2) != 0;
					local131 = (Static329.aByteArrayArrayArray17[1][local14][arg1 >> 7] & 0x2) != 0;
					if (local131 != local112) {
						local84 = (Static329.aByteArrayArrayArray17[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local112 = (Static329.aByteArrayArrayArray17[1][arg2 >> 7][local18 - 1] & 0x2) != 0;
					local131 = (Static329.aByteArrayArrayArray17[1][arg2 >> 7][local18] & 0x2) != 0;
					if (local112 != local131) {
						local84 = (Static329.aByteArrayArrayArray17[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if (local84) {
					arg4++;
				}
				return Static128.aClass149Array1[arg4].method5839(arg2, arg1);
			} else {
				return 0;
			}
		} else {
			return Static128.aClass149Array1[arg4].method5839(arg2, arg1);
		}
	}
}
