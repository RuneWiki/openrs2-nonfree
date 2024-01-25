import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_88 = new Class32(10);

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
	public static final int[] anIntArray686 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
	public static long aLong277 = 0L;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
	public static boolean aBoolean742 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method8442(@OriginalArg(1) String arg0) {
		return Static214.aHashtable2.containsKey(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ha;ILclient!ta;I)V")
	public static void method8443(@OriginalArg(0) Class95 arg0, @OriginalArg(2) Class327 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		if (Static518.anIntArray580 != null && arg1.aByte113 >= arg2) {
			for (local17 = 0; local17 < Static518.anIntArray580.length; local17++) {
				if (Static518.anIntArray580[local17] != -1000000 && (Static518.anIntArray580[local17] >= arg1.anIntArray596[0] || Static518.anIntArray580[local17] >= arg1.anIntArray596[1] || arg1.anIntArray596[2] <= Static518.anIntArray580[local17] || Static518.anIntArray580[local17] >= arg1.anIntArray596[3]) && (Static173.anIntArray687[local17] >= arg1.anIntArray595[0] || Static173.anIntArray687[local17] >= arg1.anIntArray595[1] || arg1.anIntArray595[2] <= Static173.anIntArray687[local17] || Static173.anIntArray687[local17] >= arg1.anIntArray595[3]) && (Static207.anIntArray227[local17] <= arg1.anIntArray595[0] || Static207.anIntArray227[local17] <= arg1.anIntArray595[1] || arg1.anIntArray595[2] >= Static207.anIntArray227[local17] || arg1.anIntArray595[3] >= Static207.anIntArray227[local17]) && (Static316.anIntArray345[local17] >= arg1.anIntArray594[0] || Static316.anIntArray345[local17] >= arg1.anIntArray594[1] || arg1.anIntArray594[2] <= Static316.anIntArray345[local17] || arg1.anIntArray594[3] <= Static316.anIntArray345[local17]) && (Static231.anIntArray259[local17] <= arg1.anIntArray594[0] || arg1.anIntArray594[1] >= Static231.anIntArray259[local17] || Static231.anIntArray259[local17] <= arg1.anIntArray594[2] || arg1.anIntArray594[3] >= Static231.anIntArray259[local17])) {
					return;
				}
			}
		}
		@Pc(273) int local273;
		@Pc(296) int local296;
		@Pc(314) boolean local314;
		@Pc(342) float local342;
		if (arg1.aByte114 == 1) {
			local17 = arg1.aShort116 + Static335.anInt5343 - Static566.anInt9234;
			if (local17 >= 0 && Static335.anInt5343 + Static335.anInt5343 >= local17) {
				local273 = arg1.aShort115 + Static335.anInt5343 - Static370.anInt5837;
				if (local273 < 0) {
					local273 = 0;
				} else if (Static335.anInt5343 + Static335.anInt5343 < local273) {
					return;
				}
				local296 = arg1.aShort113 + Static335.anInt5343 - Static370.anInt5837;
				if (local296 > Static335.anInt5343 + Static335.anInt5343) {
					local296 = Static335.anInt5343 + Static335.anInt5343;
				} else if (local296 < 0) {
					return;
				}
				local314 = false;
				while (local273 <= local296) {
					if (Static494.aBooleanArrayArray8[local17][local273++]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local342 = Static23.anInt553 - arg1.anIntArray595[0];
					if (local342 < 0.0F) {
						local342 *= -1.0F;
					}
					if (!local342 < (float) Static646.anInt10385 && (Static143.method2180(0, arg1) && (Static143.method2180(1, arg1) && (Static143.method2180(2, arg1) && Static143.method2180(3, arg1))))) {
						Static160.aClass327Array2[Static605.anInt9754++] = arg1;
					}
				}
			}
		} else if (arg1.aByte114 == 2) {
			local17 = arg1.aShort115 + Static335.anInt5343 - Static370.anInt5837;
			if (local17 >= 0 && local17 <= Static335.anInt5343 + Static335.anInt5343) {
				local273 = arg1.aShort116 + Static335.anInt5343 - Static566.anInt9234;
				if (local273 < 0) {
					local273 = 0;
				} else if (Static335.anInt5343 + Static335.anInt5343 < local273) {
					return;
				}
				local296 = Static335.anInt5343 + arg1.aShort114 - Static566.anInt9234;
				if (Static335.anInt5343 + Static335.anInt5343 < local296) {
					local296 = Static335.anInt5343 + Static335.anInt5343;
				} else if (local296 < 0) {
					return;
				}
				local314 = false;
				while (local296 >= local273) {
					if (Static494.aBooleanArrayArray8[local273++][local17]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local342 = Static516.anInt6572 - arg1.anIntArray594[0];
					if (local342 < 0.0F) {
						local342 *= -1.0F;
					}
					if (!(local342 < (float) Static646.anInt10385) && (Static143.method2180(0, arg1) && (Static143.method2180(1, arg1) && (Static143.method2180(2, arg1) && Static143.method2180(3, arg1))))) {
						Static160.aClass327Array2[Static605.anInt9754++] = arg1;
					}
				}
			}
		} else if (arg1.aByte114 == 16 || arg1.aByte114 == 8) {
			local17 = arg1.aShort116 + Static335.anInt5343 - Static566.anInt9234;
			if (local17 >= 0 && local17 <= Static335.anInt5343 + Static335.anInt5343) {
				local273 = arg1.aShort115 + Static335.anInt5343 - Static370.anInt5837;
				if (local273 >= 0 && Static335.anInt5343 + Static335.anInt5343 >= local273 && Static494.aBooleanArrayArray8[local17][local273]) {
					@Pc(628) float local628 = (float) (Static23.anInt553 - arg1.anIntArray595[0]);
					if (local628 < 0.0F) {
						local628 *= -1.0F;
					}
					@Pc(644) float local644 = (float) (Static516.anInt6572 - arg1.anIntArray594[0]);
					if (local644 < 0.0F) {
						local644 *= -1.0F;
					}
					if ((!(local628 < (float) Static646.anInt10385) || !(local644 < (float) Static646.anInt10385)) && (Static143.method2180(0, arg1) && (Static143.method2180(1, arg1) && (Static143.method2180(2, arg1) && Static143.method2180(3, arg1))))) {
						Static160.aClass327Array2[Static605.anInt9754++] = arg1;
					}
				}
			}
		} else if (arg1.aByte114 == 4) {
			@Pc(711) float local711 = (float) (arg1.anIntArray596[0] - Static572.anInt9322);
			if (!((float) Static161.anInt2904 >= local711)) {
				local273 = arg1.aShort115 + Static335.anInt5343 - Static370.anInt5837;
				if (local273 < 0) {
					local273 = 0;
				} else if (local273 > Static335.anInt5343 + Static335.anInt5343) {
					return;
				}
				local296 = arg1.aShort113 + Static335.anInt5343 - Static370.anInt5837;
				if (Static335.anInt5343 + Static335.anInt5343 < local296) {
					local296 = Static335.anInt5343 + Static335.anInt5343;
				} else if (local296 < 0) {
					return;
				}
				@Pc(780) int local780 = Static335.anInt5343 + arg1.aShort116 - Static566.anInt9234;
				if (local780 < 0) {
					local780 = 0;
				} else if (Static335.anInt5343 + Static335.anInt5343 < local780) {
					return;
				}
				@Pc(798) int local798 = Static335.anInt5343 + arg1.aShort114 - Static566.anInt9234;
				if (Static335.anInt5343 + Static335.anInt5343 < local798) {
					local798 = Static335.anInt5343 + Static335.anInt5343;
				} else if (local798 < 0) {
					return;
				}
				@Pc(818) boolean local818 = false;
				label283: for (@Pc(820) int local820 = local780; local820 <= local798; local820++) {
					for (@Pc(824) int local824 = local273; local824 <= local296; local824++) {
						if (Static494.aBooleanArrayArray8[local820][local824]) {
							local818 = true;
							break label283;
						}
					}
				}
				if (local818 && (Static143.method2180(0, arg1) && (Static143.method2180(1, arg1) && (Static143.method2180(2, arg1) && Static143.method2180(3, arg1))))) {
					Static160.aClass327Array2[Static605.anInt9754++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!wu;ZIIZII)V")
	public static void method8445(@OriginalArg(0) Class380 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		if (arg1 <= 0) {
			Static565.method7740(arg3, arg0, arg2);
			return;
		}
		Static74.anInt1268 = arg3;
		Static468.anInt7474 = 0;
		Static140.aBoolean200 = false;
		Static33.anInt738 = arg2;
		Static527.aClass2_Sub13_Sub3_4 = null;
		Static317.anInt5047 = 1;
		Static93.aClass380_31 = arg0;
		Static575.anInt9354 = Static267.aClass2_Sub13_Sub3_3.method6121() / arg1;
		if (Static575.anInt9354 < 1) {
			Static575.anInt9354 = 1;
		}
	}
}
