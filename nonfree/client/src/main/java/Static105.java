import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!ph;")
	public static Class66 aClass66_34;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	public static int anInt3627;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
	public static int anInt3614 = 0;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "[Lclient!dg;")
	public static final Class2_Sub1_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub1_Sub3_Sub1Array3 = new Class2_Sub1_Sub1_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_996 = Static158.method3034("sl_flags");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!hi;IIIIII[BII)V")
	public static void method2804(@OriginalArg(0) Class35[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class2_Sub3 local6 = new Class2_Sub3(arg7);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(12) int local12 = local6.method237();
			if (local12 == 0) {
				return;
			}
			@Pc(16) int local16 = 0;
			local8 += local12;
			while (true) {
				@Pc(24) int local24 = local6.method237();
				if (local24 == 0) {
					break;
				}
				local16 += local24 - 1;
				@Pc(36) int local36 = local16 & 0x3F;
				@Pc(42) int local42 = local16 >> 6 & 0x3F;
				@Pc(46) int local46 = local16 >> 12;
				@Pc(50) int local50 = local6.method218();
				@Pc(54) int local54 = local50 >> 2;
				@Pc(58) int local58 = local50 & 0x3;
				if (arg5 == local46 && local42 >= arg2 && arg2 + 8 > local42 && arg6 <= local36 && arg6 + 8 > local36) {
					@Pc(89) Class2_Sub1_Sub9 local89 = Static158.method3037(local8);
					@Pc(106) int local106 = arg4 + Static149.method2960(local42 & 0x7, arg3, local36 & 0x7, local58, local89.anInt1683, local89.anInt1688);
					@Pc(123) int local123 = Static81.method1905(local89.anInt1688, local36 & 0x7, local58, arg3, local89.anInt1683, local42 & 0x7) + arg1;
					if (local106 > 0 && local123 > 0 && local106 < 103 && local123 < 103) {
						@Pc(141) int local141 = arg8;
						@Pc(143) Class35 local143 = null;
						if ((Static147.aByteArrayArrayArray36[1][local106][local123] & 0x2) == 2) {
							local141 = arg8 - 1;
						}
						if (local141 >= 0) {
							local143 = arg0[local141];
						}
						Static7.method3558(local58 + arg3 & 0x3, local106, local8, arg8, Static8.aBoolean3, local123, arg8, local54, true, local143);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	public static void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].anInt3606 = arg3;
		}
	}
}
