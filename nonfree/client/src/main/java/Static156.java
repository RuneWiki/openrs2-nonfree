import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
	public static int anInt3881;

	@OriginalMember(owner = "client!tg", name = "bb", descriptor = "[I")
	public static int[] anIntArray563 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!tg", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1327 = Static146.method2172("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1328 = Static146.method2172("");

	@OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lclient!qf;II)V")
	public static void method2668(@OriginalArg(0) Class66[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class66 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt3237 && (!local13.aBoolean131 || !Static164.method2754(local13))) {
				if (local13.anInt3230 == 0) {
					if (!local13.aBoolean131 && Static164.method2754(local13) && local13 != Static112.aClass66_9) {
						continue;
					}
					method2668(arg0, local13.anInt3229);
					if (local13.aClass66Array2 != null) {
						method2668(local13.aClass66Array2, local13.anInt3229);
					}
					@Pc(64) Class2_Sub10 local64 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local13.anInt3229);
					if (local64 != null) {
						Static38.method769(local64.anInt1896);
					}
				}
				if (local13.anInt3230 == 6) {
					@Pc(94) int local94;
					if (local13.anInt3206 != -1 || local13.anInt3238 != -1) {
						@Pc(89) boolean local89 = Static17.method436(local13);
						if (local89) {
							local94 = local13.anInt3238;
						} else {
							local94 = local13.anInt3206;
						}
						if (local94 != -1) {
							@Pc(106) Class2_Sub2_Sub15 local106 = Static140.method2333(local94);
							local13.anInt3226 += Static131.anInt4359;
							while (local13.anInt3226 > local106.anIntArray549[local13.anInt3209]) {
								local13.anInt3226 -= local106.anIntArray549[local13.anInt3209];
								local13.anInt3209++;
								if (local13.anInt3209 >= local106.anIntArray548.length) {
									local13.anInt3209 -= local106.anInt3736;
									if (local13.anInt3209 < 0 || local106.anIntArray548.length <= local13.anInt3209) {
										local13.anInt3209 = 0;
									}
								}
								Static57.method2994(local13);
							}
						}
					}
					if (local13.anInt3175 != 0 && !local13.aBoolean131) {
						@Pc(187) int local187 = local13.anInt3175 >> 16;
						local94 = local13.anInt3175 << 16 >> 16;
						local94 *= Static131.anInt4359;
						@Pc(202) int local202 = local187 * Static131.anInt4359;
						local13.anInt3220 = local94 + local13.anInt3220 & 0x7FF;
						local13.anInt3235 = local202 + local13.anInt3235 & 0x7FF;
						Static57.method2994(local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
	public static void method2669() {
		aClass77_1328 = null;
		anIntArray563 = null;
		aClass77_1327 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
	public static void method2670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg2; local3++) {
			for (@Pc(7) int local7 = arg3; local7 <= arg0 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static27.aByteArrayArrayArray1[0][local7][local3] = 127;
					if (arg3 == local7 && local7 > 0) {
						Static122.anIntArrayArrayArray2[0][local7][local3] = Static122.anIntArrayArrayArray2[0][local7 - 1][local3];
					}
					if (arg3 + arg0 == local7 && local7 < 103) {
						Static122.anIntArrayArrayArray2[0][local7][local3] = Static122.anIntArrayArrayArray2[0][local7 + 1][local3];
					}
					if (local3 == arg1 && local3 > 0) {
						Static122.anIntArrayArrayArray2[0][local7][local3] = Static122.anIntArrayArrayArray2[0][local7][local3 - 1];
					}
					if (local3 == arg2 + arg1 && local3 < 103) {
						Static122.anIntArrayArrayArray2[0][local7][local3] = Static122.anIntArrayArrayArray2[0][local7][local3 + 1];
					}
				}
			}
		}
	}
}
