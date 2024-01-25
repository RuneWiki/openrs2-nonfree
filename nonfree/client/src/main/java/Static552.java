import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!sk", name = "gc", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!sk", name = "Dc", descriptor = "[I")
	public static final int[] anIntArray586 = new int[3];

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIII)V")
	public static void method7370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 + Static445.anInt6949;
		@Pc(13) int local13 = arg2 + Static321.anInt5000;
		if (Static267.aClass73ArrayArrayArray2 == null || arg0 < 0 || arg2 < 0 || arg0 >= Static224.anInt3557 || Static267.anInt4309 <= arg2 || Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 0 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 != arg1) {
			return;
		}
		@Pc(61) long local61 = (long) (local13 << 14 | arg1 << 28 | local9);
		@Pc(69) Class4_Sub7 local69 = (Class4_Sub7) Static406.aClass66_28.method1994(local61);
		if (local69 == null) {
			Static132.method2406(arg1, arg0, arg2);
			return;
		}
		@Pc(83) Class4_Sub33 local83 = (Class4_Sub33) local69.aClass163_8.method3639();
		if (local83 == null) {
			Static132.method2406(arg1, arg0, arg2);
			return;
		}
		@Pc(97) Class3_Sub1_Sub1_Sub1 local97 = (Class3_Sub1_Sub1_Sub1) Static132.method2406(arg1, arg0, arg2);
		if (local97 == null) {
			local97 = new Class3_Sub1_Sub1_Sub1(arg0 << 9, Static140.aClass42Array4[arg1].method7450(arg2, arg0), arg2 << 9, arg1, arg1);
		} else {
			local97.anInt3620 = local97.anInt3617 = -1;
		}
		local97.anInt3630 = local83.anInt5595;
		local97.anInt3624 = local83.anInt5597;
		label56: while (true) {
			@Pc(142) Class4_Sub33 local142 = (Class4_Sub33) local69.aClass163_8.method3640();
			if (local142 == null) {
				break;
			}
			if (local97.anInt3630 != local142.anInt5595) {
				local97.anInt3620 = local142.anInt5595;
				local97.anInt3631 = local142.anInt5597;
				while (true) {
					@Pc(165) Class4_Sub33 local165 = (Class4_Sub33) local69.aClass163_8.method3640();
					if (local165 == null) {
						break label56;
					}
					if (local97.anInt3630 != local165.anInt5595 && local165.anInt5595 != local97.anInt3620) {
						local97.anInt3618 = local165.anInt5597;
						local97.anInt3617 = local165.anInt5595;
					}
				}
			}
		}
		@Pc(209) int local209 = Static674.method8951(arg1, (arg2 << 9) + 256, (arg0 << 9) + 256);
		local97.aByte141 = (byte) arg1;
		local97.anInt3615 = 0;
		local97.anInt9915 = local209;
		local97.anInt9925 = arg0 << 9;
		local97.anInt9917 = arg2 << 9;
		local97.aByte142 = (byte) arg1;
		if (Static547.method7286(arg0, arg2)) {
			local97.aByte142++;
		}
		Static321.method4419(arg1, arg0, arg2, local209, local97);
	}
}
