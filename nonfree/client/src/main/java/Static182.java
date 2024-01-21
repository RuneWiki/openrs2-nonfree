import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1350 = Static161.method2452("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ta", name = "W", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1351 = Static161.method2452("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)Lclient!ji;")
	public static Class5_Sub2_Sub10 method2753() {
		@Pc(13) int local13 = Static210.anIntArray84[0] * Static153.anIntArray337[0];
		@Pc(17) byte[] local17 = Static191.aByteArrayArray9[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static3.anIntArray9[local17[local22] & 0xFF];
		}
		@Pc(61) Class5_Sub2_Sub10_Sub1 local61 = new Class5_Sub2_Sub10_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[0], Static5.anIntArray10[0], Static153.anIntArray337[0], Static210.anIntArray84[0], local20);
		Static85.method1452();
		return local61;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!dc;B)V")
	public static void method2754(@OriginalArg(0) Class20 arg0) {
		try {
			Static91.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method592(Static91.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(10) Exception local10) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
	public static void method2758(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub2_Sub10_Sub1 local17;
		if (Static104.aClass5_Sub2_Sub10_4 == null) {
			local17 = new Class5_Sub2_Sub10_Sub1(512, 512);
		} else {
			local17 = (Class5_Sub2_Sub10_Sub1) Static104.aClass5_Sub2_Sub10_4;
		}
		@Pc(29) int[] local29 = local17.anIntArray347;
		@Pc(32) int local32 = local29.length;
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			local29[local34] = 1;
		}
		@Pc(59) int local59;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
			local59 = (52736 - local46 * 512) * 4 + 24628;
			for (local61 = 1; local61 < 103; local61++) {
				if ((Static168.aByteArrayArrayArray13[arg0][local61][local46] & 0x18) == 0) {
					Static5.method127(local29, local59, arg0, local61, local46);
				}
				if (arg0 < 3 && (Static168.aByteArrayArrayArray13[arg0 + 1][local61][local46] & 0x8) != 0) {
					Static5.method127(local29, local59, arg0 + 1, local61, local46);
				}
				local59 += 4;
			}
		}
		local17.method2432();
		local59 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local61 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(170) int local170;
		for (@Pc(166) int local166 = 1; local166 < 103; local166++) {
			for (local170 = 1; local170 < 103; local170++) {
				if ((Static168.aByteArrayArrayArray13[arg0][local170][local166] & 0x18) == 0) {
					Static158.method937(local170, local61, local59, local166, arg0);
				}
				if (arg0 < 3 && (Static168.aByteArrayArrayArray13[arg0 + 1][local170][local166] & 0x8) != 0) {
					Static158.method937(local170, local61, local59, local166, arg0 + 1);
				}
			}
		}
		Static205.anInt4067 = 0;
		for (local170 = 0; local170 < 104; local170++) {
			for (@Pc(232) int local232 = 0; local232 < 104; local232++) {
				@Pc(239) long local239 = Static216.method3183(Static111.anInt2327, local170, local232);
				if (local239 != 0L) {
					@Pc(254) Class5_Sub2_Sub7 local254 = Static63.method1046(Integer.MAX_VALUE & (int) (local239 >>> 32));
					@Pc(257) int local257 = local254.anInt516;
					if (local257 >= 0) {
						@Pc(264) int local264 = local232;
						@Pc(266) int local266 = local170;
						if (local257 != 22 && local257 != 29 && local257 != 34 && local257 != 36 && local257 != 46 && local257 != 47 && local257 != 48) {
							@Pc(300) int[][] local300 = Static9.aClass76Array1[Static111.anInt2327].anIntArrayArray30;
							for (@Pc(302) int local302 = 0; local302 < 10; local302++) {
								@Pc(309) int local309 = (int) (Math.random() * 4.0D);
								if (local309 == 0 && local266 > 0 && local170 - 3 < local266 && (local300[local266 - 1][local264] & 0x12C0108) == 0) {
									local266--;
								}
								if (local309 == 1 && local266 < 103 && local170 + 3 > local266 && (local300[local266 + 1][local264] & 0x12C0180) == 0) {
									local266++;
								}
								if (local309 == 2 && local264 > 0 && local232 - 3 < local264 && (local300[local266][local264 - 1] & 0x12C0102) == 0) {
									local264--;
								}
								if (local309 == 3 && local264 < 103 && local232 + 3 > local264 && (local300[local266][local264 + 1] & 0x12C0120) == 0) {
									local264++;
								}
							}
						}
						Static80.anIntArray176[Static205.anInt4067] = local254.anInt542;
						Static207.anIntArray422[Static205.anInt4067] = local266;
						Static134.anIntArray303[Static205.anInt4067] = local264;
						Static205.anInt4067++;
					}
				}
			}
		}
		Static104.aClass5_Sub2_Sub10_4 = local17;
		Static197.aClass24_1.method2292();
	}
}
