import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "Lclient!uc;")
	public static Class241 aClass241_3;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method5705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(14) int local14 = arg1 % 8;
		@Pc(23) int local23;
		if (local14 == 0) {
			local23 = 0;
		} else {
			local23 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg2 + 7) / 8);
		@Pc(46) int local46 = -((arg1 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local23;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!nf;B)V")
	public static void method5707(@OriginalArg(0) Class2_Sub13_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static250.anInt4042; local3++) {
			@Pc(9) int local9 = Static151.anIntArray209[local3];
			@Pc(13) Class3_Sub4_Sub1_Sub2 local13 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method3580();
			if ((local17 & 0x8) != 0) {
				local17 += arg0.method3580() << 8;
			}
			if ((local17 & 0x800) != 0) {
				local17 += arg0.method3580() << 16;
			}
			Static333.method4455(local13, local17, arg0, local9);
		}
	}
}
