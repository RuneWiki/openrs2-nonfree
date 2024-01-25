import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "Lclient!aka;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIIIILclient!qba;Lclient!qba;II)V")
	public static void method5944(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class34_Sub1_Sub1_Sub2 arg3, @OriginalArg(7) Class34_Sub1_Sub1_Sub2 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method7871();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class6 local20 = (Class6) Static359.aClass295_37.method6470((long) local7);
		if (local20 == null) {
			@Pc(27) Class370[] local27 = Static688.method8597(Static142.aClass362_32, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static119.aClass95_4.method8008(local27[0], true);
			Static359.aClass295_37.method6469((long) local7, local20);
		}
		Static294.method8855(arg6 >> 1, arg1 >> 1, 0, arg3.aByte132, arg3.anInt9619, arg3.anInt9614, arg3.method7866() * 256);
		@Pc(75) int local75 = arg5 + Static33.anIntArray465[0] - 18;
		@Pc(83) int local83 = local75 + arg0 / 4 * 18;
		@Pc(94) int local94 = arg2 + Static33.anIntArray465[1] - 16 - 54;
		@Pc(102) int local102 = local94 + arg0 % 4 * 18;
		local20.method5115(local83, local102);
		if (arg4 == arg3) {
			Static119.aClass95_4.method8071(18, local83 - 1, local102 + -1, -256, 18);
		}
		Static63.method1147(local102 - 1, local83 + 18, local83 - 1, local102 + 18);
		@Pc(143) Class34_Sub4 local143 = Static527.method6832();
		local143.anInt3653 = local83;
		local143.anInt3658 = local83 + 16;
		local143.aClass34_Sub1_Sub1_Sub2_1 = arg4;
		local143.anInt3655 = local102;
		local143.anInt3656 = local102 + 16;
		Static122.aClass317_2.method6890(local143);
	}
}
