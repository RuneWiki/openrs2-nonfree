import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!ek;")
	public static Class42 aClass42_76;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static int anInt4787 = -1;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
	public static float aFloat51 = 0.0F;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[S")
	public static short[] aShortArray65 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(JIII)Z")
	public static boolean method3835(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg0 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg0 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(44) Class146 local44 = Static10.method158(local31);
			@Pc(52) int local52;
			@Pc(55) int local55;
			if (local24 == 0 || local24 == 2) {
				local55 = local44.anInt4721;
				local52 = local44.anInt4749;
			} else {
				local52 = local44.anInt4721;
				local55 = local44.anInt4749;
			}
			@Pc(66) int local66 = local44.anInt4740;
			if (local24 != 0) {
				local66 = (local66 << local24 & 0xF) + (local66 >> 4 - local24);
			}
			Static3.method82(local55, arg2, 0, 0, local52, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], arg1, local66);
		} else {
			Static3.method82(0, arg2, local12 + 1, local24, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], arg1, 0);
		}
		return true;
	}
}
