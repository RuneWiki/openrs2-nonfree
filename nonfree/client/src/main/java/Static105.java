import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public static int anInt1713;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public static int anInt1715;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
	public static final int[] anIntArray90 = new int[1];

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "[I")
	public static final int[] anIntArray91 = new int[200];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method1530(@OriginalArg(1) int arg0) {
		Static670.anInt10721 = 2;
		Static295.anInt5127 = arg0;
		@Pc(9) String local9 = null;
		if (Static672.aByteArray113 != null) {
			@Pc(16) Class5_Sub23 local16 = new Class5_Sub23(Static672.aByteArray113);
			local9 = Static447.method6658(local16.method8509());
			Static183.aLong91 = local16.method8509();
		}
		if (local9 == null) {
			Static326.method4967(35);
		} else {
			Static261.method3843(false, true, "", local9);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
	public static boolean method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!tu;Lclient!ha;BI)V")
	public static void method1532(@OriginalArg(0) Class337 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19;
		if (Static500.anIntArray491 != null && arg0.aByte139 >= arg2) {
			for (local19 = 0; local19 < Static500.anIntArray491.length; local19++) {
				if (Static500.anIntArray491[local19] != -1000000 && (arg0.anIntArray547[0] <= Static500.anIntArray491[local19] || Static500.anIntArray491[local19] >= arg0.anIntArray547[1] || arg0.anIntArray547[2] <= Static500.anIntArray491[local19] || Static500.anIntArray491[local19] >= arg0.anIntArray547[3]) && (Static588.anIntArray548[local19] >= arg0.anIntArray546[0] || arg0.anIntArray546[1] <= Static588.anIntArray548[local19] || Static588.anIntArray548[local19] >= arg0.anIntArray546[2] || arg0.anIntArray546[3] <= Static588.anIntArray548[local19]) && (Static57.anIntArray44[local19] <= arg0.anIntArray546[0] || Static57.anIntArray44[local19] <= arg0.anIntArray546[1] || Static57.anIntArray44[local19] <= arg0.anIntArray546[2] || Static57.anIntArray44[local19] <= arg0.anIntArray546[3]) && (arg0.anIntArray545[0] <= Static510.anIntArray496[local19] || Static510.anIntArray496[local19] >= arg0.anIntArray545[1] || Static510.anIntArray496[local19] >= arg0.anIntArray545[2] || Static510.anIntArray496[local19] >= arg0.anIntArray545[3]) && (Static478.anIntArray477[local19] <= arg0.anIntArray545[0] || arg0.anIntArray545[1] >= Static478.anIntArray477[local19] || arg0.anIntArray545[2] >= Static478.anIntArray477[local19] || arg0.anIntArray545[3] >= Static478.anIntArray477[local19])) {
					return;
				}
			}
		}
		@Pc(320) int local320;
		@Pc(347) int local347;
		@Pc(370) boolean local370;
		@Pc(405) float local405;
		if (arg0.aByte140 == 1) {
			local19 = Static28.anInt9243 + arg0.aShort112 - Static128.anInt7021;
			if (local19 >= 0 && local19 <= Static28.anInt9243 + Static28.anInt9243) {
				local320 = arg0.aShort114 + Static28.anInt9243 - Static97.anInt1574;
				if (local320 < 0) {
					local320 = 0;
				} else if (Static28.anInt9243 + Static28.anInt9243 < local320) {
					return;
				}
				local347 = Static28.anInt9243 + arg0.aShort113 - Static97.anInt1574;
				if (local347 > Static28.anInt9243 + Static28.anInt9243) {
					local347 = Static28.anInt9243 + Static28.anInt9243;
				} else if (local347 < 0) {
					return;
				}
				local370 = false;
				while (local347 >= local320) {
					if (Static300.aBooleanArrayArray6[local19][local320++]) {
						local370 = true;
						break;
					}
				}
				if (local370) {
					local405 = (float) (Static225.anInt3671 - arg0.anIntArray546[0]);
					if (local405 < 0.0F) {
						local405 *= -1.0F;
					}
					if (!local405 < (float) Static424.anInt7319 && (Static394.method5767(0, arg0) && (Static394.method5767(1, arg0) && (Static394.method5767(2, arg0) && Static394.method5767(3, arg0))))) {
						Static128.aClass337Array6[Static443.anInt7616++] = arg0;
					}
				}
			}
		} else if (arg0.aByte140 == 2) {
			local19 = arg0.aShort114 + Static28.anInt9243 - Static97.anInt1574;
			if (local19 >= 0 && Static28.anInt9243 + Static28.anInt9243 >= local19) {
				local320 = Static28.anInt9243 + arg0.aShort112 - Static128.anInt7021;
				if (local320 < 0) {
					local320 = 0;
				} else if (Static28.anInt9243 + Static28.anInt9243 < local320) {
					return;
				}
				local347 = Static28.anInt9243 + arg0.aShort111 - Static128.anInt7021;
				if (local347 > Static28.anInt9243 + Static28.anInt9243) {
					local347 = Static28.anInt9243 + Static28.anInt9243;
				} else if (local347 < 0) {
					return;
				}
				local370 = false;
				while (local320 <= local347) {
					if (Static300.aBooleanArrayArray6[local320++][local19]) {
						local370 = true;
						break;
					}
				}
				if (local370) {
					local405 = (float) (Static384.anInt6573 - arg0.anIntArray545[0]);
					if (local405 < 0.0F) {
						local405 *= -1.0F;
					}
					if (!((float) Static424.anInt7319 > local405) && (Static394.method5767(0, arg0) && (Static394.method5767(1, arg0) && (Static394.method5767(2, arg0) && Static394.method5767(3, arg0))))) {
						Static128.aClass337Array6[Static443.anInt7616++] = arg0;
					}
				}
			}
		} else if (arg0.aByte140 == 16 || arg0.aByte140 == 8) {
			local19 = arg0.aShort112 + Static28.anInt9243 - Static128.anInt7021;
			if (local19 >= 0 && local19 <= Static28.anInt9243 + Static28.anInt9243) {
				local320 = Static28.anInt9243 + arg0.aShort114 - Static97.anInt1574;
				if (local320 >= 0 && local320 <= Static28.anInt9243 + Static28.anInt9243 && Static300.aBooleanArrayArray6[local19][local320]) {
					@Pc(717) float local717 = (float) (Static225.anInt3671 - arg0.anIntArray546[0]);
					if (local717 < 0.0F) {
						local717 *= -1.0F;
					}
					@Pc(734) float local734 = (float) (Static384.anInt6573 - arg0.anIntArray545[0]);
					if (local734 < 0.0F) {
						local734 *= -1.0F;
					}
					if ((!(local717 < (float) Static424.anInt7319) || !(local734 < (float) Static424.anInt7319)) && (Static394.method5767(0, arg0) && (Static394.method5767(1, arg0) && (Static394.method5767(2, arg0) && Static394.method5767(3, arg0))))) {
						Static128.aClass337Array6[Static443.anInt7616++] = arg0;
					}
				}
			}
		} else if (arg0.aByte140 == 4) {
			@Pc(808) float local808 = (float) (arg0.anIntArray547[0] - Static92.anInt1522);
			if (!(local808 <= (float) Static384.anInt6569)) {
				local320 = Static28.anInt9243 + arg0.aShort114 - Static97.anInt1574;
				if (local320 < 0) {
					local320 = 0;
				} else if (Static28.anInt9243 + Static28.anInt9243 < local320) {
					return;
				}
				local347 = arg0.aShort113 + Static28.anInt9243 - Static97.anInt1574;
				if (local347 > Static28.anInt9243 + Static28.anInt9243) {
					local347 = Static28.anInt9243 + Static28.anInt9243;
				} else if (local347 < 0) {
					return;
				}
				@Pc(871) int local871 = Static28.anInt9243 + arg0.aShort112 - Static128.anInt7021;
				if (local871 < 0) {
					local871 = 0;
				} else if (local871 > Static28.anInt9243 + Static28.anInt9243) {
					return;
				}
				@Pc(896) int local896 = arg0.aShort111 + Static28.anInt9243 - Static128.anInt7021;
				if (Static28.anInt9243 + Static28.anInt9243 < local896) {
					local896 = Static28.anInt9243 + Static28.anInt9243;
				} else if (local896 < 0) {
					return;
				}
				@Pc(913) boolean local913 = false;
				label283: for (@Pc(915) int local915 = local871; local915 <= local896; local915++) {
					for (@Pc(921) int local921 = local320; local921 <= local347; local921++) {
						if (Static300.aBooleanArrayArray6[local915][local921]) {
							local913 = true;
							break label283;
						}
					}
				}
				if (local913 && (Static394.method5767(0, arg0) && (Static394.method5767(1, arg0) && (Static394.method5767(2, arg0) && Static394.method5767(3, arg0))))) {
					Static128.aClass337Array6[Static443.anInt7616++] = arg0;
				}
			}
		}
	}
}
