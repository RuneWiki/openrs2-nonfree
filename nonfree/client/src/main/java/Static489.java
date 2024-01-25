import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array10;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "Lclient!un;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "[I")
	public static final int[] anIntArray568 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_135 = new Class274(11, -2);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
	public static void method6997() {
		if (!Static490.aBoolean627) {
			Static490.aBoolean627 = true;
			Static620.aBoolean745 = true;
			Static440.aFloat192 += (-24.0F - Static440.aFloat192) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!ej;)V")
	public static void method6998(@OriginalArg(0) Class93 arg0) {
		if (Static140.anInt3097 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub4 local6 = arg0.aClass2_Sub4_3;
		Static302.aClass93Array1[Static140.anInt3097] = arg0;
		Static190.aBooleanArray49[Static140.anInt3097] = false;
		Static140.anInt3097++;
		@Pc(21) int local21 = arg0.anInt2922;
		if (arg0.aBoolean255) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2922;
		if (arg0.aBoolean254) {
			local29 = Static330.anInt4381 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8151() + Static290.anInt5464 - local6.method8154() >> Static415.anInt7579;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8151() + local6.method8154() - Static290.anInt5464 >> Static415.anInt7579;
			if (local73 >= Static191.anInt6006) {
				local73 = Static191.anInt6006 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray37[local41++];
				@Pc(105) int local105 = (local6.method8150() + Static290.anInt5464 - local6.method8154() >> Static415.anInt7579) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static347.anInt6411) {
					local113 = Static347.anInt6411 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static192.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static192.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static140.anInt3097;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static192.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static140.anInt3097 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static192.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static140.anInt3097 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static192.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static140.anInt3097 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!eq;ILclient!eq;)V")
	public static void method6999(@OriginalArg(1) Class97 arg0, @OriginalArg(3) Class97 arg1) {
		Static498.aClass97_125 = arg1;
		Static493.aClass97_124 = arg0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IBZII)V")
	public static void method7000(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static164.method3053(arg0)) {
			Static118.method2465(-1, Static399.aClass78ArrayArray1[arg0], arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIZLclient!dm;I)V")
	public static void method7001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class78 arg3) {
		@Pc(6) int local6 = arg3.anInt1964;
		if (arg3.aByte49 == 0) {
			arg3.anInt1964 = arg3.anInt1929;
		} else if (arg3.aByte49 == 1) {
			arg3.anInt1964 = arg0 - arg3.anInt1929;
		} else if (arg3.aByte49 == 2) {
			arg3.anInt1964 = arg0 * arg3.anInt1929 >> 14;
		}
		@Pc(46) int local46 = arg3.anInt1991;
		if (arg3.aByte48 == 0) {
			arg3.anInt1991 = arg3.anInt1956;
		} else if (arg3.aByte48 == 1) {
			arg3.anInt1991 = arg1 - arg3.anInt1956;
		} else if (arg3.aByte48 == 2) {
			arg3.anInt1991 = arg3.anInt1956 * arg1 >> 14;
		}
		if (arg3.aByte49 == 4) {
			arg3.anInt1964 = arg3.anInt1991 * arg3.anInt1985 / arg3.anInt1923;
		}
		if (arg3.aByte48 == 4) {
			arg3.anInt1991 = arg3.anInt1923 * arg3.anInt1964 / arg3.anInt1985;
		}
		if (Static612.aBoolean735 && (Static69.method1332(arg3).anInt7661 != 0 || arg3.anInt1955 == 0)) {
			if (arg3.anInt1991 < 5 && arg3.anInt1964 < 5) {
				arg3.anInt1964 = 5;
				arg3.anInt1991 = 5;
			} else {
				if (arg3.anInt1964 <= 0) {
					arg3.anInt1964 = 5;
				}
				if (arg3.anInt1991 <= 0) {
					arg3.anInt1991 = 5;
				}
			}
		}
		if (arg3.anInt1940 == Static227.anInt4636) {
			Static555.aClass78_10 = arg3;
		}
		if (arg2 && arg3.anObjectArray16 != null && (local6 != arg3.anInt1964 || arg3.anInt1991 != local46)) {
			@Pc(194) Class2_Sub42 local194 = new Class2_Sub42();
			local194.anObjectArray33 = arg3.anObjectArray16;
			local194.aClass78_9 = arg3;
			Static564.aClass238_54.method5837(local194);
		}
	}
}
