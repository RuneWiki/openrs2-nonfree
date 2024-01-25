import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "Lclient!ta;")
	public static Class82 aClass82_5;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_122 = new Class98(31, -1);

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
	public static int anInt7773 = 0;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public static void method6194() {
		Static116.anInt1993 = 0;
		Static186.anInt3614 = 0;
		Static400.anInt7246 = 0;
		Static556.anInt9659 = 0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIIII)I")
	public static int method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static205.aClass46Array1 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(27) int local27 = arg1 >> 9;
			@Pc(31) int local31 = arg4 >> 9;
			if (arg2 < 0 || arg3 < 0 || Static18.anInt5706 - 1 < arg2 || Static80.anInt1367 - 1 < arg3) {
				return 0;
			} else if (local27 >= 1 && local31 >= 1 && Static18.anInt5706 - 1 >= local27 && Static80.anInt1367 - 1 >= local31) {
				@Pc(103) boolean local103 = (Static267.aByteArrayArrayArray8[1][arg1 >> 9][arg4 >> 9] & 0x2) != 0;
				@Pc(128) boolean local128;
				@Pc(144) boolean local144;
				if ((arg1 & 0x1FF) == 0) {
					local128 = (Static267.aByteArrayArrayArray8[1][local27 - 1][arg4 >> 9] & 0x2) != 0;
					local144 = (Static267.aByteArrayArrayArray8[1][local27][arg4 >> 9] & 0x2) != 0;
					if (local144 != local128) {
						local103 = (Static267.aByteArrayArrayArray8[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x1FF) == 0) {
					local128 = (Static267.aByteArrayArrayArray8[1][arg1 >> 9][local31 - 1] & 0x2) != 0;
					local144 = (Static267.aByteArrayArrayArray8[1][arg1 >> 9][local31] & 0x2) != 0;
					if (local144 != local128) {
						local103 = (Static267.aByteArrayArrayArray8[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if (local103) {
					arg0++;
				}
				return Static205.aClass46Array1[arg0].sa(arg1, arg4);
			} else {
				return 0;
			}
		} else {
			return Static205.aClass46Array1[arg0].sa(arg1, arg4);
		}
	}
}
