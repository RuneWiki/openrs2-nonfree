import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt6519;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static428.anInt7352 = arg1 - Static528.anInt5361;
		Static360.anInt9757 = arg0 - Static528.anInt5366;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
	public static void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static571.method7962(local7.aClass2_Sub1_Sub2_2);
		Static571.method7962(local7.aClass2_Sub1_Sub2_1);
		if (local7.aClass2_Sub1_Sub2_2 != null) {
			local7.aClass2_Sub1_Sub2_2 = null;
		}
		if (local7.aClass2_Sub1_Sub2_1 != null) {
			local7.aClass2_Sub1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5524(@OriginalArg(1) Class132 arg0) {
		if (Static183.anInt3155 < 2 && !Static291.aBoolean314 || Static489.aClass321_39 != null) {
			return;
		}
		@Pc(40) String local40;
		if (Static291.aBoolean314 && Static183.anInt3155 < 2) {
			local40 = Static355.aString75 + Static52.aClass41_32.method1007(Static616.anInt10077) + Static172.aString32 + " ->";
		} else if (Static71.aBoolean71 && Static170.aClass4_1.method1024(81) && Static183.anInt3155 > 2) {
			local40 = Static103.method1677(Static593.aClass6_Sub4_Sub12_4);
		} else {
			@Pc(44) Class6_Sub4_Sub12 local44 = Static593.aClass6_Sub4_Sub12_4;
			if (local44 == null) {
				return;
			}
			local40 = Static103.method1677(local44);
			@Pc(53) int[] local53 = null;
			if (Static273.method4028(local44.anInt7577)) {
				local53 = Static340.aClass121_1.method2647((int) local44.aLong224).anIntArray357;
			} else if (local44.anInt7576 != -1) {
				local53 = Static340.aClass121_1.method2647(local44.anInt7576).anIntArray357;
			} else if (Static186.method2659(local44.anInt7577)) {
				@Pc(87) Class6_Sub44 local87 = (Class6_Sub44) Static349.aClass209_32.method5038((long) (int) local44.aLong224);
				if (local87 != null) {
					@Pc(92) Class2_Sub1_Sub1_Sub3_Sub2 local92 = local87.aClass2_Sub1_Sub1_Sub3_Sub2_2;
					@Pc(95) Class91 local95 = local92.aClass91_1;
					if (local95.anIntArray140 != null) {
						local95 = local95.method2036(Static659.aClass363_3);
					}
					if (local95 != null) {
						local53 = local95.anIntArray142;
					}
				}
			} else if (Static59.method1104(local44.anInt7577)) {
				@Pc(133) Class308 local133;
				if (local44.anInt7577 == 1003) {
					local133 = Static411.aClass88_3.method2024((int) local44.aLong224);
				} else {
					local133 = Static411.aClass88_3.method2024((int) (local44.aLong224 >>> 32 & 0x7FFFFFFFL));
				}
				if (local133.anIntArray566 != null) {
					local133 = local133.method7297(Static659.aClass363_3);
				}
				if (local133 != null) {
					local53 = local133.anIntArray570;
				}
			}
			if (local53 != null) {
				local40 = local40 + Static521.method7353(local53);
			}
		}
		if (Static183.anInt3155 > 2) {
			local40 = local40 + "<col=ffffff> / " + (Static183.anInt3155 - 2) + Static52.aClass41_25.method1007(Static616.anInt10077);
		}
		if (Static662.aClass321_54 != null) {
			@Pc(260) Class19 local260 = Static662.aClass321_54.method7667(arg0);
			if (local260 == null) {
				local260 = Static51.aClass19_4;
			}
			local260.method6331(Static662.aClass321_54.anInt9031, Static662.aClass321_54.anInt9069, Static662.aClass321_54.anInt9077, Static662.aClass321_54.anInt9073, Static53.aRandom1, Static662.aClass321_54.anInt9094, Static96.anInt1740, Static291.anIntArray279, local40, Static460.anInt7982, Static493.anIntArray540, Static662.aClass321_54.anInt9103, Static24.aClass9Array7, Static184.anInt3170);
			Static94.method1546(Static291.anIntArray279[1], Static291.anIntArray279[3], Static291.anIntArray279[2], Static291.anIntArray279[0]);
		} else if (Static396.aClass321_29 != null && Static457.aClass176_6 == Static615.aClass176_7) {
			@Pc(241) int local241 = Static51.aClass19_4.method6321(Static575.anInt9484 + 4, Static493.anIntArray540, local40, Static187.anInt3188 + 16, Static460.anInt7982, Static24.aClass9Array7, Static53.aRandom1);
			Static94.method1546(Static187.anInt3188, 16, local241 + Static173.aClass151_4.method3323(local40), Static575.anInt9484 + 4);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method5525(@OriginalArg(1) int arg0) {
		Static560.anInt1380 = 2;
		Static595.anInt9707 = arg0;
		if (Static259.aString53 == null) {
			Static82.method1399(35);
		} else {
			@Pc(28) Class6_Sub23 local28 = new Class6_Sub23(Static96.method1571(Static379.method5360(Static259.aString53)));
			@Pc(32) long local32 = local28.method8381();
			Static62.aLong38 = local28.method8381();
			Static539.method7683(Static74.method1301(local32), true, "");
		}
	}
}
