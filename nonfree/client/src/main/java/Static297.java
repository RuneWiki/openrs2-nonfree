import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static int anInt5234;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public static int anInt5235;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lclient!pf;")
	public static final Class275[] aClass275Array2 = new Class275[14];

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public static int anInt5240 = 503;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public static void method4371(@OriginalArg(0) int arg0) {
		@Pc(10) Class14_Sub15 local10 = (Class14_Sub15) Static205.aClass187_31.method4078((long) arg0);
		if (local10 != null) {
			local10.aBoolean180 = !local10.aBoolean180;
			local10.aClass63_Sub1_1.method1526(local10.aBoolean180);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)[Lclient!ls;")
	public static Class222[] method4373() {
		return new Class222[] { Static370.aClass222_7, Static105.aClass222_1, Static276.aClass222_6 };
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FIIFFFFF)F")
	public static float method4374(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg4 - arg5;
		@Pc(16) float local16 = arg6 - arg0;
		@Pc(25) float local25 = arg2 - arg3;
		@Pc(27) float local27 = 0.0F;
		@Pc(29) float local29 = 0.0F;
		@Pc(31) float local31 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(39) float local39 = arg5 + local12 * local7;
			@Pc(45) float local45 = arg0 + local7 * local16;
			@Pc(51) float local51 = arg3 + local7 * local25;
			@Pc(56) int local56 = (int) local39 >> 9;
			@Pc(61) int local61 = (int) local51 >> 9;
			if (local56 > 0 && local61 > 0 && Static26.anInt462 > local56 && local61 < Static445.anInt6140) {
				@Pc(81) int local81 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146;
				if (local81 < 3 && (Static553.aByteArrayArrayArray18[1][local56][local61] & 0x2) != 0) {
					local81++;
				}
				@Pc(107) int local107 = Static343.aClass51Array1[local81].method7866((int) local39, (int) local51);
				if (local45 > (float) local107) {
					if (arg1 < 2) {
						return local7;
					}
					return method4374(local29, arg1 - 1, local51, local31, local39, local27, local45) * 0.1F + local7 - 0.1F;
				}
			}
			local27 = local39;
			local29 = local45;
			local31 = local51;
			local7 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
	public static boolean method4375() {
		if (Static678.aClass14_Sub3_Sub11_4 == null) {
			return false;
		} else {
			if (Static678.aClass14_Sub3_Sub11_4.anInt4752 >= 2000) {
				Static678.aClass14_Sub3_Sub11_4.anInt4752 -= 2000;
			}
			return Static678.aClass14_Sub3_Sub11_4.anInt4752 == 1004;
		}
	}
}
