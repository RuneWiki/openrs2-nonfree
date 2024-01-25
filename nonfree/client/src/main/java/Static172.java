import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_47 = new Class158(26, -1);

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt3949 = 503;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt3951 = 1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method3278() {
		Static236.aClass5_4.ha(((float) Static7.aClass3_Sub15_Sub1_1.anInt8374 * 0.1F + 0.7F) * 1.1523438F);
		Static236.aClass5_4.YA(Static505.anInt8839, 0.69921875F, 1.2F, (float) -200, -240.0F, -200.0F);
		Static236.aClass5_4.X(Static66.anInt1452, -1, 0);
		Static236.aClass5_4.method7485(Static214.aClass66_2);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBIIIII)I")
	public static int method3280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg0;
		} else {
			return 7 + 1 - arg3 - arg2;
		}
	}
}
