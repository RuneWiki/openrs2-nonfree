import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!oka", name = "C", descriptor = "Lclient!tb;")
	public static Class49 aClass49_28;

	@OriginalMember(owner = "client!oka", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray134;

	@OriginalMember(owner = "client!oka", name = "u", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_132 = new Class322(43, -2);

	@OriginalMember(owner = "client!oka", name = "z", descriptor = "I")
	public static int anInt7414 = 0;

	@OriginalMember(owner = "client!oka", name = "D", descriptor = "Lclient!hh;")
	public static final Class155 aClass155_45 = new Class155(4);

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(BLclient!jc;)V")
	public static void method6595(@OriginalArg(1) Class6_Sub15 arg0) {
		if (arg0.aByteArray20.length - arg0.anInt3174 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method3030();
		if (local22 < 0 || local22 > 1 || arg0.aByteArray20.length - arg0.anInt3174 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method3018();
		if (arg0.aByteArray20.length - arg0.anInt3174 < local48 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local48; local63++) {
			@Pc(71) int local71 = arg0.method3018();
			@Pc(75) int local75 = arg0.method3015();
			if (Static333.anIntArray333.length > local71 && Static371.aBooleanArray19[local71] && (Static197.aClass388_1.method8843(local71).aChar7 != '1' || local75 >= -1 && local75 <= 1)) {
				Static333.anIntArray333[local71] = local75;
			}
		}
		if (119 < 15) {
			method6596();
		}
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIII[BZI)Z")
	public static boolean method6598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg2 + 8 - 1) / 8);
		@Pc(37) int local37 = -((arg0 + 7) / 8);
		for (@Pc(46) int local46 = local28; local46 < 0; local46++) {
			for (@Pc(52) int local52 = local37; local52 < 0; local52++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local15;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}
}
