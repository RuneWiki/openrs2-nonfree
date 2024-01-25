import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qja", name = "l", descriptor = "Lclient!tb;")
	public static Class49 aClass49_30;

	@OriginalMember(owner = "client!qja", name = "i", descriptor = "I")
	public static int anInt8362;

	@OriginalMember(owner = "client!qja", name = "j", descriptor = "S")
	public static short aShort103 = 205;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IILclient!bo;I)V")
	public static void method7301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub2 arg2) {
		if (!Static484.aBoolean623) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class6_Sub2_Sub11 local17 = (Class6_Sub2_Sub11) arg2.aClass82_1.method2071(); local17 != null; local17 = (Class6_Sub2_Sub11) arg2.aClass82_1.method2078()) {
			local25 = Static225.method4050(local17);
			if (local25 > local11) {
				local11 = local25;
			}
		}
		local11 += 8;
		Static587.anInt9342 = (Static356.aBoolean442 ? 26 : 22) + arg2.anInt618 * 16;
		local25 = arg2.anInt618 * 16 + 21;
		@Pc(70) int local70 = Static25.anInt354 + Static406.anInt7073;
		if (local70 + local11 > Static535.anInt4128) {
			local70 = Static25.anInt354 - local11;
		}
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(97) int local97 = Static356.aBoolean442 ? 33 : 31;
		@Pc(103) int local103 = arg1 + 13 - local97;
		if (local25 + local103 > Static274.anInt3226) {
			local103 = Static274.anInt3226 - local25;
		}
		Static421.anInt7230 = local70;
		if (local103 < 0) {
			local103 = 0;
		}
		Static310.aClass6_Sub2_Sub2_1 = arg2;
		Static69.anInt919 = local11;
		Static145.anInt3045 = local103;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(III)Z")
	public static boolean method7307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static409.method6270(arg1, arg0) || Static165.method3263(arg1, arg0);
	}
}
