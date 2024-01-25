import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "[I")
	public static final int[] anIntArray569 = new int[14];

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_198 = new Class81(106, 6);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIZIIII)Z")
	public static boolean method6900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0];
		@Pc(13) int local13 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0];
		if (local8 < 0 || local8 >= Static500.anInt6888 || local13 < 0 || local13 >= Static573.anInt9325) {
			return false;
		} else if (arg2 >= 0 && Static500.anInt6888 > arg2 && arg6 >= 0 && Static573.anInt9325 > arg6) {
			@Pc(65) int local65 = Static264.method4168(local8, arg5, Static28.aClass94Array2[Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116], arg0, arg2, arg7, arg4, Static328.anIntArray379, local13, arg6, arg3, arg1, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349(), Static519.anIntArray588);
			if (local65 < 1) {
				return false;
			}
			Static90.anInt1998 = Static519.anIntArray588[local65 - 1];
			Static328.anInt5893 = Static328.anIntArray379[local65 - 1];
			Static275.aBoolean387 = false;
			Static561.method5040();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(JZ)V")
	public static void method6901(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static116.anInt2337;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local7 != Static82.anInt9165) {
			local19 = local7 - Static82.anInt9165;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local27 > local19) {
				local27 = local19;
			}
			Static82.anInt9165 += local27;
		}
		@Pc(69) int local69 = Static260.anInt4768;
		if (!Static479.aClass1_Sub7_Sub1_1.aBoolean231) {
			Static79.aFloat37 += (float) arg0 * Static257.aFloat111 / 40.0F * 8.0F;
			Static143.aFloat61 += (float) arg0 * Static327.aFloat150 / 40.0F * 8.0F;
		}
		if (local69 != Static536.anInt8844) {
			local19 = local69 - Static536.anInt8844;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local19 < local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static536.anInt8844 += local27;
		}
		Static21.method551();
	}
}
