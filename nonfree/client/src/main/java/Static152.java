import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array4;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_18 = new Class163();

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "J")
	public static long aLong89 = -1L;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z")
	public static boolean method2628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!vk;IZ)V")
	public static void method2629(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static574.anInt8895 >= 400) {
			return;
		}
		@Pc(16) Class345 local16 = arg0.aClass345_1;
		@Pc(19) String local19 = arg0.aString120;
		if (local16.anIntArray624 != null) {
			local16 = local16.method7529(Static526.aClass293_1);
			if (local16 == null) {
				return;
			}
			local19 = local16.aString107;
		}
		if (!local16.aBoolean699) {
			return;
		}
		if (arg0.anInt10019 != 0) {
			@Pc(53) String local53 = Static333.aClass234_5 == Static92.aClass234_1 ? Static279.aClass179_30.method4066(Static164.anInt2984) : Static279.aClass179_28.method4066(Static164.anInt2984);
			local19 = local19 + Static570.method7542(arg0.anInt10019, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920) + " (" + local53 + arg0.anInt10019 + ")";
		}
		if (Static463.aBoolean582 && !arg1) {
			@Pc(91) Class257 local91 = Static231.anInt8415 == -1 ? null : Static482.aClass84_2.method2152(Static231.anInt8415);
			if ((Static25.anInt576 & 0x2) != 0 && (local91 == null || local16.method7538(Static231.anInt8415, local91.anInt6617) != local91.anInt6617)) {
				Static321.method4431((long) arg0.anInt9961, -1, false, Static203.aString30 + " -> <col=ffff00>" + local19, Static111.anInt2192, (long) arg0.anInt9961, false, 0, 48, 0, Static384.aString73, true);
			}
		}
		if (!arg1) {
			@Pc(146) String[] local146 = local16.aStringArray43;
			if (Static561.aBoolean672) {
				local146 = Static411.method5184(local146);
			}
			@Pc(156) int local156;
			if (local146 != null) {
				for (local156 = 4; local156 >= 0; local156--) {
					if (local146[local156] != null && (local16.aByte130 == 0 || !local146[local156].equalsIgnoreCase(Static279.aClass179_23.method4066(Static164.anInt2984)))) {
						@Pc(179) byte local179 = 0;
						if (local156 == 0) {
							local179 = 18;
						}
						@Pc(185) int local185 = Static232.anInt3661;
						if (local156 == 1) {
							local179 = 10;
						}
						if (local156 == 2) {
							local179 = 47;
						}
						if (local156 == 3) {
							local179 = 53;
						}
						if (local156 == local16.anInt8780) {
							local185 = local16.anInt8800;
						}
						if (local156 == 4) {
							local179 = 59;
						}
						if (local156 == local16.anInt8788) {
							local185 = local16.anInt8791;
						}
						Static321.method4431((long) arg0.anInt9961, -1, false, "<col=ffff00>" + local19, local146[local156].equalsIgnoreCase(Static279.aClass179_23.method4066(Static164.anInt2984)) ? local16.anInt8810 : local185, (long) arg0.anInt9961, false, 0, local179, 0, local146[local156], true);
					}
				}
			}
			if (local16.aByte130 == 1 && local146 != null) {
				for (local156 = 4; local156 >= 0; local156--) {
					if (local146[local156] != null && local146[local156].equalsIgnoreCase(Static279.aClass179_23.method4066(Static164.anInt2984))) {
						@Pc(301) short local301 = 0;
						if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920 < arg0.anInt10019) {
							local301 = 2000;
						}
						@Pc(310) short local310 = 0;
						if (local156 == 0) {
							local310 = 18;
						}
						if (local156 == 1) {
							local310 = 10;
						}
						if (local156 == 2) {
							local310 = 47;
						}
						if (local156 == 3) {
							local310 = 53;
						}
						if (local156 == 4) {
							local310 = 59;
						}
						if (local310 != 0) {
							local310 += local301;
						}
						Static321.method4431((long) arg0.anInt9961, -1, false, "<col=ffff00>" + local19, local16.anInt8810, (long) arg0.anInt9961, false, 0, local310, 0, local146[local156], true);
					}
				}
			}
		}
		Static321.method4431((long) arg0.anInt9961, -1, false, "<col=ffff00>" + local19, Static431.anInt6801, (long) arg0.anInt9961, arg1, 0, 1010, 0, Static279.aClass179_22.method4066(Static164.anInt2984), true);
	}
}
