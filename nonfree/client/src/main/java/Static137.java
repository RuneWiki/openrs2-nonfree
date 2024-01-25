import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
	public static final int[] anIntArray299 = new int[8];

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_38 = new Class160(41, 4);

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_64 = new Class332(4);

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_60 = new Class40(92, 8);

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	public static int anInt2437 = -1;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public static int anInt2438 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method2053(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static208.aClass9ArrayArrayArray3 = Static177.aClass9ArrayArrayArray2;
			Static285.aClass60Array8 = Static127.aClass60Array7;
		} else {
			Static208.aClass9ArrayArrayArray3 = Static144.aClass9ArrayArrayArray1;
			Static285.aClass60Array8 = Static34.aClass60Array10;
		}
		Static41.anInt687 = Static208.aClass9ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
	public static int method2054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static574.anInt6276 == -1) {
			return 1;
		}
		if (arg0 != Static567.anInt9503) {
			Static360.method5340(arg0);
			if (Static567.anInt9503 != arg0) {
				return -1;
			}
		}
		try {
			@Pc(28) Dimension local28 = Static34.aCanvas15.getSize();
			Static87.method1420(Static141.aClass104_12.method2145(Static470.anInt7957), Static85.aClass56_2, true);
			@Pc(42) Class274 local42 = Static250.method3550(Static251.aClass251_88, Static574.anInt6276);
			@Pc(45) long local45 = method2058();
			Static176.aClass121_5.F();
			Static90.aClass34_8.GA(0, Static431.anInt7547, 0);
			Static176.aClass121_5.method7112(Static90.aClass34_8);
			Static176.aClass121_5.m(local28.width / 2, local28.height / 2, 512, 512);
			Static176.aClass121_5.ha(1.0F);
			Static176.aClass121_5.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(86) Class22 local86 = Static176.aClass121_5.method7088(local42, 2048, 64, 64, 768);
			@Pc(93) int local93 = 0;
			label41: for (@Pc(95) int local95 = 0; local95 < 500; local95++) {
				Static176.aClass121_5.D(0);
				Static176.aClass121_5.method7084();
				for (@Pc(104) int local104 = 15; local104 >= 0; local104--) {
					for (@Pc(108) int local108 = 0; local108 <= local104; local108++) {
						Static19.aClass34_9.GA((int) ((-((float) local104 / 2.0F) + (float) local108) * (float) Static57.anInt953), 0, Static57.anInt953 * (local104 + 1));
						local86.method4689(Static19.aClass34_9, null, 0);
						local93++;
						if (method2058() - local45 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static176.aClass121_5.method7090();
			@Pc(175) long local175 = (long) (local93 * 1000) / (method2058() - local45);
			Static176.aClass121_5.D(0);
			Static176.aClass121_5.method7084();
			return (int) local175;
		} catch (@Pc(184) Throwable local184) {
			local184.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ku;)V")
	public static void method2055(@OriginalArg(0) Class178 arg0) {
		if (Static164.anInt2888 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub7 local6 = arg0.aClass6_Sub7_2;
		Static149.aClass178Array1[Static164.anInt2888] = arg0;
		Static368.aBooleanArray35[Static164.anInt2888] = false;
		Static164.anInt2888++;
		@Pc(21) int local21 = arg0.anInt4479;
		if (arg0.aBoolean274) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4479;
		if (arg0.aBoolean273) {
			local29 = Static41.anInt687 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method3492() + Static431.anInt7547 - local6.method3487() >> Static188.anInt3275;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method3492() + local6.method3487() - Static431.anInt7547 >> Static188.anInt3275;
			if (local73 >= Static164.anInt2881) {
				local73 = Static164.anInt2881 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray78[local41++];
				@Pc(105) int local105 = (local6.method3490() + Static431.anInt7547 - local6.method3487() >> Static188.anInt3275) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static80.anInt1391) {
					local113 = Static80.anInt1391 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static140.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static140.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static164.anInt2888;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static140.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static164.anInt2888 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static140.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static164.anInt2888 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static140.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static164.anInt2888 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
	public static boolean method2057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)J")
	public static synchronized long method2058() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (Static93.aLong53 > local9) {
			Static204.aLong95 += Static93.aLong53 - local9;
		}
		Static93.aLong53 = local9;
		return Static204.aLong95 + local9;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method2059() {
		if (Static487.anInt8139 == -1) {
			return;
		}
		@Pc(18) int local18 = Static427.aClass134_1.method6093();
		@Pc(22) int local22 = Static427.aClass134_1.method6092();
		@Pc(27) Class6_Sub8 local27 = (Class6_Sub8) Static274.aClass275_64.method6366();
		if (local27 != null) {
			local18 = local27.method7645();
			local22 = local27.method7643();
		}
		Static474.method6605(0, Static487.anInt8139, local22, 0, Static476.anInt8045, 0, Static502.anInt8364, 0, local18);
		if (Static157.aClass97_5 != null) {
			Static477.method7180(local18, local22);
		}
	}
}
