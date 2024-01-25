import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!q", name = "V", descriptor = "Z")
	public static boolean aBoolean590 = true;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public static final int anInt8342 = 1339;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!wha;Lclient!ha;I)V")
	public static void method7278(@OriginalArg(1) Class393 arg0, @OriginalArg(2) Class144 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		if (Static54.anIntArray59 != null && arg2 <= arg0.aByte144) {
			for (local17 = 0; local17 < Static54.anIntArray59.length; local17++) {
				if (Static54.anIntArray59[local17] != -1000000 && (Static54.anIntArray59[local17] >= arg0.anIntArray592[0] || Static54.anIntArray59[local17] >= arg0.anIntArray592[1] || Static54.anIntArray59[local17] >= arg0.anIntArray592[2] || arg0.anIntArray592[3] <= Static54.anIntArray59[local17]) && (Static614.anIntArray552[local17] >= arg0.anIntArray593[0] || Static614.anIntArray552[local17] >= arg0.anIntArray593[1] || Static614.anIntArray552[local17] >= arg0.anIntArray593[2] || arg0.anIntArray593[3] <= Static614.anIntArray552[local17]) && (Static265.anIntArray251[local17] <= arg0.anIntArray593[0] || arg0.anIntArray593[1] >= Static265.anIntArray251[local17] || arg0.anIntArray593[2] >= Static265.anIntArray251[local17] || arg0.anIntArray593[3] >= Static265.anIntArray251[local17]) && (arg0.anIntArray591[0] <= Static53.anIntArray57[local17] || Static53.anIntArray57[local17] >= arg0.anIntArray591[1] || Static53.anIntArray57[local17] >= arg0.anIntArray591[2] || Static53.anIntArray57[local17] >= arg0.anIntArray591[3]) && (Static645.anIntArray567[local17] <= arg0.anIntArray591[0] || Static645.anIntArray567[local17] <= arg0.anIntArray591[1] || arg0.anIntArray591[2] >= Static645.anIntArray567[local17] || arg0.anIntArray591[3] >= Static645.anIntArray567[local17])) {
					return;
				}
			}
		}
		@Pc(306) int local306;
		@Pc(334) int local334;
		@Pc(377) float local377;
		@Pc(350) boolean local350;
		if (arg0.aByte145 == 1) {
			local17 = arg0.aShort121 + Static459.anInt10513 - Static307.anInt5453;
			if (local17 >= 0 && local17 <= Static459.anInt10513 + Static459.anInt10513) {
				local306 = arg0.aShort119 + Static459.anInt10513 - Static325.anInt5630;
				if (local306 < 0) {
					local306 = 0;
				} else if (local306 > Static459.anInt10513 + Static459.anInt10513) {
					return;
				}
				local334 = arg0.aShort120 + Static459.anInt10513 - Static325.anInt5630;
				if (local334 > Static459.anInt10513 + Static459.anInt10513) {
					local334 = Static459.anInt10513 + Static459.anInt10513;
				} else if (local334 < 0) {
					return;
				}
				local350 = false;
				while (local334 >= local306) {
					if (Static18.aBooleanArrayArray1[local17][local306++]) {
						local350 = true;
						break;
					}
				}
				if (local350) {
					local377 = (float) (Static543.anInt9224 - arg0.anIntArray593[0]);
					if (local377 < 0.0F) {
						local377 *= -1.0F;
					}
					if (!(float) Static307.anInt5462 > local377 && (Static317.method5018(arg0, 0) && (Static317.method5018(arg0, 1) && (Static317.method5018(arg0, 2) && Static317.method5018(arg0, 3))))) {
						Static682.aClass393Array4[Static475.anInt8190++] = arg0;
					}
				}
			}
		} else if (arg0.aByte145 == 2) {
			local17 = arg0.aShort119 + Static459.anInt10513 - Static325.anInt5630;
			if (local17 >= 0 && Static459.anInt10513 + Static459.anInt10513 >= local17) {
				local306 = Static459.anInt10513 + arg0.aShort121 - Static307.anInt5453;
				if (local306 < 0) {
					local306 = 0;
				} else if (Static459.anInt10513 + Static459.anInt10513 < local306) {
					return;
				}
				local334 = Static459.anInt10513 + arg0.aShort122 - Static307.anInt5453;
				if (local334 > Static459.anInt10513 + Static459.anInt10513) {
					local334 = Static459.anInt10513 + Static459.anInt10513;
				} else if (local334 < 0) {
					return;
				}
				local350 = false;
				while (local334 >= local306) {
					if (Static18.aBooleanArrayArray1[local306++][local17]) {
						local350 = true;
						break;
					}
				}
				if (local350) {
					local377 = (float) (Static277.anInt5150 - arg0.anIntArray591[0]);
					if (local377 < 0.0F) {
						local377 *= -1.0F;
					}
					if (!((float) Static307.anInt5462 > local377) && (Static317.method5018(arg0, 0) && (Static317.method5018(arg0, 1) && (Static317.method5018(arg0, 2) && Static317.method5018(arg0, 3))))) {
						Static682.aClass393Array4[Static475.anInt8190++] = arg0;
					}
				}
			}
		} else if (arg0.aByte145 == 16 || arg0.aByte145 == 8) {
			local306 = arg0.aShort121 + Static459.anInt10513 - Static307.anInt5453;
			if (local306 >= 0 && Static459.anInt10513 + Static459.anInt10513 >= local306) {
				local334 = Static459.anInt10513 + arg0.aShort119 - Static325.anInt5630;
				if (local334 >= 0 && Static459.anInt10513 + Static459.anInt10513 >= local334 && Static18.aBooleanArrayArray1[local306][local334]) {
					@Pc(673) float local673 = (float) (Static543.anInt9224 - arg0.anIntArray593[0]);
					if (local673 < 0.0F) {
						local673 *= -1.0F;
					}
					local377 = (float) (Static277.anInt5150 - arg0.anIntArray591[0]);
					if (local377 < 0.0F) {
						local377 *= -1.0F;
					}
					if ((!(local673 < (float) Static307.anInt5462) || !((float) Static307.anInt5462 > local377)) && (Static317.method5018(arg0, 0) && (Static317.method5018(arg0, 1) && (Static317.method5018(arg0, 2) && Static317.method5018(arg0, 3))))) {
						Static682.aClass393Array4[Static475.anInt8190++] = arg0;
					}
				}
			}
		} else if (arg0.aByte145 == 4) {
			@Pc(763) float local763 = (float) (arg0.anIntArray592[0] - Static171.anInt2640);
			if (!(local763 <= (float) Static314.anInt5517)) {
				local334 = arg0.aShort119 + Static459.anInt10513 - Static325.anInt5630;
				if (local334 < 0) {
					local334 = 0;
				} else if (local334 > Static459.anInt10513 + Static459.anInt10513) {
					return;
				}
				@Pc(807) int local807 = arg0.aShort120 + Static459.anInt10513 - Static325.anInt5630;
				if (Static459.anInt10513 + Static459.anInt10513 < local807) {
					local807 = Static459.anInt10513 + Static459.anInt10513;
				} else if (local807 < 0) {
					return;
				}
				@Pc(837) int local837 = arg0.aShort121 + Static459.anInt10513 - Static307.anInt5453;
				if (local837 < 0) {
					local837 = 0;
				} else if (Static459.anInt10513 + Static459.anInt10513 < local837) {
					return;
				}
				@Pc(860) int local860 = Static459.anInt10513 + arg0.aShort122 - Static307.anInt5453;
				if (local860 > Static459.anInt10513 + Static459.anInt10513) {
					local860 = Static459.anInt10513 + Static459.anInt10513;
				} else if (local860 < 0) {
					return;
				}
				@Pc(884) boolean local884 = false;
				label283: for (@Pc(886) int local886 = local837; local886 <= local860; local886++) {
					for (@Pc(889) int local889 = local334; local889 <= local807; local889++) {
						if (Static18.aBooleanArrayArray1[local886][local889]) {
							local884 = true;
							break label283;
						}
					}
				}
				if (local884 && (Static317.method5018(arg0, 0) && (Static317.method5018(arg0, 1) && (Static317.method5018(arg0, 2) && Static317.method5018(arg0, 3))))) {
					Static682.aClass393Array4[Static475.anInt8190++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
	public static void method7288() {
		if (Static103.aClass144_3 == null) {
			return;
		}
		if (Static656.aBoolean741) {
			Static73.method1218();
		}
		Static603.aClass307_3.method7676();
		Static444.method6621();
		Static563.method4401();
		Static249.method4223();
		Static344.method5260();
		Static612.method8633();
		Static104.method1716();
		Static419.method9119();
		Static53.method969();
		Static165.method2379();
		Static467.method6886(false);
		for (@Pc(50) int local50 = 0; local50 < 2048; local50++) {
			@Pc(55) Class4_Sub3_Sub3_Sub3_Sub2 local55 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local50];
			if (local55 != null) {
				for (@Pc(59) int local59 = 0; local59 < local55.aClass129Array3.length; local59++) {
					local55.aClass129Array3[local59] = null;
				}
			}
		}
		for (@Pc(85) int local85 = 0; local85 < Static549.anInt1216; local85++) {
			@Pc(91) Class4_Sub3_Sub3_Sub3_Sub1 local91 = Static28.aClass14_Sub44Array2[local85].aClass4_Sub3_Sub3_Sub3_Sub1_2;
			if (local91 != null) {
				for (@Pc(95) int local95 = 0; local95 < local91.aClass129Array3.length; local95++) {
					local91.aClass129Array3[local95] = null;
				}
			}
		}
		Static281.aClass263_4 = null;
		Static467.aClass263_9 = null;
		Static103.aClass144_3.method6932();
		Static103.aClass144_3 = null;
	}
}
