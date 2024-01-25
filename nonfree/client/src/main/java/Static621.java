import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!vba", name = "H", descriptor = "I")
	public static int anInt10180;

	@OriginalMember(owner = "client!vba", name = "E", descriptor = "[I")
	public static int[] anIntArray558 = new int[2];

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V")
	public static void method8426() {
		for (@Pc(7) int local7 = 0; local7 < Static256.anInt4715; local7++) {
			@Pc(13) int local13 = Static144.anIntArray129[local7];
			@Pc(21) Class28_Sub1_Sub4_Sub2_Sub1 local21 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) local13)).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			@Pc(25) int local25 = Static474.aClass5_Sub41_Sub2_2.method7816();
			if ((local25 & 0x8) != 0) {
				local25 += Static474.aClass5_Sub41_Sub2_2.method7816() << 8;
			}
			if ((local25 & 0x100) != 0) {
				local25 += Static474.aClass5_Sub41_Sub2_2.method7816() << 16;
			}
			if ((local25 & 0x2) != 0) {
				if (local21.aClass134_1.method3271()) {
					Static46.method609(local21);
				}
				local21.method3061(Static231.aClass19_2.method274(Static474.aClass5_Sub41_Sub2_2.method7860()));
				local21.method4585(local21.aClass134_1.anInt3851);
				local21.anInt5519 = local21.aClass134_1.anInt3825 << 3;
				if (local21.aClass134_1.method3271()) {
					Static331.method5106(0, local21.anIntArray307[0], local21.anIntArray308[0], (Class28_Sub1_Sub4_Sub2_Sub2) null, local21.aByte145, local21, (Class164) null);
				}
			}
			if ((local25 & 0x4) != 0) {
				local21.anInt3566 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local21.anInt3577 = Static474.aClass5_Sub41_Sub2_2.method7838();
			}
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(155) int local155;
			@Pc(159) int local159;
			@Pc(165) int local165;
			if ((local25 & 0x20) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7796();
				local146 = Static474.aClass5_Sub41_Sub2_2.method7834();
				if (local142 == 65535) {
					local142 = -1;
				}
				local155 = Static474.aClass5_Sub41_Sub2_2.method7829();
				local159 = local155 & 0x7;
				local165 = local155 >> 3 & 0xF;
				if (local165 == 15) {
					local165 = -1;
				}
				local21.method4595(local146, local165, 0, local142, local159);
			}
			@Pc(206) int local206;
			@Pc(192) int[] local192;
			@Pc(195) int[] local195;
			if ((local25 & 0x400) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local192 = new int[local142];
				local195 = new int[local142];
				@Pc(198) int[] local198 = new int[local142];
				for (local165 = 0; local165 < local142; local165++) {
					local206 = Static474.aClass5_Sub41_Sub2_2.method7838();
					if (local206 == 65535) {
						local206 = -1;
					}
					local192[local165] = local206;
					local195[local165] = Static474.aClass5_Sub41_Sub2_2.method7818();
					local198[local165] = Static474.aClass5_Sub41_Sub2_2.method7838();
				}
				Static515.method8506(local21, local195, local192, local198);
			}
			if ((local25 & 0x4000) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local192 = new int[local142];
				local195 = new int[local142];
				for (local159 = 0; local159 < local142; local159++) {
					local165 = Static474.aClass5_Sub41_Sub2_2.method7838();
					if ((local165 & 0xC000) == 49152) {
						local206 = Static474.aClass5_Sub41_Sub2_2.method7860();
						local192[local159] = local206 | local165 << 16;
					} else {
						local192[local159] = local165;
					}
					local195[local159] = Static474.aClass5_Sub41_Sub2_2.method7860();
				}
				local21.method4581(local192, local195);
			}
			if ((local25 & 0x8000) != 0) {
				local21.aByte81 = Static474.aClass5_Sub41_Sub2_2.method7811();
				local21.lb = Static474.aClass5_Sub41_Sub2_2.method7810();
				local21.aByte80 = Static474.aClass5_Sub41_Sub2_2.method7810();
				local21.aByte78 = (byte) Static474.aClass5_Sub41_Sub2_2.method7799();
				local21.anInt5490 = Static26.anInt350 + Static474.aClass5_Sub41_Sub2_2.method7858();
				local21.anInt5495 = Static26.anInt350 + Static474.aClass5_Sub41_Sub2_2.method7838();
			}
			if ((local25 & 0x20000) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7838();
				if (local142 == 65535) {
					local142 = -1;
				}
				local146 = Static474.aClass5_Sub41_Sub2_2.method7833();
				local155 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local159 = local155 & 0x7;
				local165 = local155 >> 3 & 0xF;
				if (local165 == 15) {
					local165 = -1;
				}
				local21.method4595(local146, local165, 2, local142, local159);
			}
			if ((local25 & 0x10000) != 0) {
				local21.aString25 = Static474.aClass5_Sub41_Sub2_2.method7847();
				if ("".equals(local21.aString25) || local21.aString25.equals(local21.aClass134_1.aString29)) {
					local21.aString25 = local21.aClass134_1.aString29;
				}
			}
			@Pc(502) int local502;
			@Pc(527) int local527;
			@Pc(517) short[] local517;
			@Pc(468) int[] local468;
			@Pc(492) short[] local492;
			@Pc(554) long local554;
			if ((local25 & 0x200) != 0) {
				local142 = local21.aClass134_1.anIntArray193.length;
				local146 = 0;
				if (local21.aClass134_1.aShortArray45 != null) {
					local146 = local21.aClass134_1.aShortArray45.length;
				}
				local155 = 0;
				if (local21.aClass134_1.aShortArray42 != null) {
					local155 = local21.aClass134_1.aShortArray42.length;
				}
				local159 = Static474.aClass5_Sub41_Sub2_2.method7816();
				if ((local159 & 0x1) == 1) {
					local21.aClass129_1 = null;
				} else {
					local468 = null;
					if ((local159 & 0x2) == 2) {
						local468 = new int[local142];
						for (local206 = 0; local206 < local142; local206++) {
							local468[local206] = Static474.aClass5_Sub41_Sub2_2.method7858();
						}
					}
					local492 = null;
					if ((local159 & 0x4) == 4) {
						local492 = new short[local146];
						for (local502 = 0; local502 < local146; local502++) {
							local492[local502] = (short) Static474.aClass5_Sub41_Sub2_2.method7858();
						}
					}
					local517 = null;
					if ((local159 & 0x8) == 8) {
						local517 = new short[local155];
						for (local527 = 0; local527 < local155; local527++) {
							local517[local527] = (short) Static474.aClass5_Sub41_Sub2_2.method7838();
						}
					}
					local554 = (long) local13 | (long) local21.anInt3579++ << 32;
					local21.aClass129_1 = new Class129(local554, local468, local492, local517);
				}
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt5500 = Static474.aClass5_Sub41_Sub2_2.method7838();
				if (local21.anInt5500 == 65535) {
					local21.anInt5500 = -1;
				}
			}
			if ((local25 & 0x80000) != 0) {
				local21.anInt3582 = Static474.aClass5_Sub41_Sub2_2.method7838();
				if (local21.anInt3582 == 65535) {
					local21.anInt3582 = local21.aClass134_1.anInt3820;
				}
			}
			if ((local25 & 0x40) != 0) {
				local21.aString43 = Static474.aClass5_Sub41_Sub2_2.method7847();
				local21.anInt5454 = 100;
			}
			if ((local25 & 0x40000) != 0) {
				local142 = local21.aClass134_1.anIntArray190.length;
				local146 = 0;
				if (local21.aClass134_1.aShortArray45 != null) {
					local146 = local21.aClass134_1.aShortArray45.length;
				}
				if (local21.aClass134_1.aShortArray42 != null) {
					local146 = local21.aClass134_1.aShortArray42.length;
				}
				local159 = Static474.aClass5_Sub41_Sub2_2.method7799();
				if ((local159 & 0x1) != 1) {
					local468 = null;
					if ((local159 & 0x2) == 2) {
						local468 = new int[local142];
						for (local206 = 0; local206 < local142; local206++) {
							local468[local206] = Static474.aClass5_Sub41_Sub2_2.method7860();
						}
					}
					local492 = null;
					if ((local159 & 0x4) == 4) {
						local492 = new short[local146];
						for (local502 = 0; local502 < local146; local502++) {
							local492[local502] = (short) Static474.aClass5_Sub41_Sub2_2.method7858();
						}
					}
					local517 = null;
					if ((local159 & 0x8) == 8) {
						local517 = new short[0];
						for (local527 = 0; local527 < 0; local527++) {
							local517[local527] = (short) Static474.aClass5_Sub41_Sub2_2.method7858();
						}
					}
					local554 = (long) local21.anInt3574++ << 32 | (long) local13;
					new Class129(local554, local468, local492, local517);
				}
			}
			if ((local25 & 0x2000) != 0) {
				local21.anInt5511 = Static474.aClass5_Sub41_Sub2_2.method7861();
				local21.anInt5518 = Static474.aClass5_Sub41_Sub2_2.method7861();
				local21.anInt5503 = Static474.aClass5_Sub41_Sub2_2.method7819();
				local21.anInt5467 = Static474.aClass5_Sub41_Sub2_2.method7810();
				local21.anInt5463 = Static474.aClass5_Sub41_Sub2_2.method7796() + Static26.anInt350;
				local21.anInt5473 = Static474.aClass5_Sub41_Sub2_2.method7858() + Static26.anInt350;
				local21.anInt5476 = Static474.aClass5_Sub41_Sub2_2.method7829();
				local21.anInt5511 += local21.anIntArray308[0];
				local21.anInt5503 += local21.anIntArray308[0];
				local21.anInt5518 += local21.anIntArray307[0];
				local21.anInt5467 += local21.anIntArray307[0];
				local21.anInt5525 = 0;
				local21.anInt5524 = 1;
			}
			if ((local25 & 0x1000) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7796();
				if (local142 == 65535) {
					local142 = -1;
				}
				local146 = Static474.aClass5_Sub41_Sub2_2.method7859();
				local155 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local159 = local155 & 0x7;
				local165 = local155 >> 3 & 0xF;
				if (local165 == 15) {
					local165 = -1;
				}
				local21.method4595(local146, local165, 1, local142, local159);
			}
			if ((local25 & 0x1) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7829();
				if (local142 > 0) {
					for (local146 = 0; local146 < local142; local146++) {
						local159 = -1;
						local165 = -1;
						local206 = -1;
						local155 = Static474.aClass5_Sub41_Sub2_2.method7812();
						if (local155 == 32767) {
							local155 = Static474.aClass5_Sub41_Sub2_2.method7812();
							local165 = Static474.aClass5_Sub41_Sub2_2.method7812();
							local159 = Static474.aClass5_Sub41_Sub2_2.method7812();
							local206 = Static474.aClass5_Sub41_Sub2_2.method7812();
						} else if (local155 == 32766) {
							local155 = -1;
						} else {
							local165 = Static474.aClass5_Sub41_Sub2_2.method7812();
						}
						local502 = Static474.aClass5_Sub41_Sub2_2.method7812();
						local527 = Static474.aClass5_Sub41_Sub2_2.method7816();
						local21.method4579(local527, Static26.anInt350, local165, local155, local502, local159, local206);
					}
				}
			}
			if ((local25 & 0x800) != 0) {
				local142 = Static474.aClass5_Sub41_Sub2_2.method7838();
				local21.anInt5488 = Static474.aClass5_Sub41_Sub2_2.method7829();
				local21.anInt5520 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local21.aBoolean469 = (local142 & 0x8000) != 0;
				local21.anInt5484 = local142 & 0x7FFF;
				local21.anInt5483 = local21.anInt5488 + local21.anInt5484 + Static26.anInt350;
			}
			if ((local25 & 0x80) != 0) {
				@Pc(1033) int[] local1033 = new int[4];
				for (local146 = 0; local146 < 4; local146++) {
					local1033[local146] = Static474.aClass5_Sub41_Sub2_2.method7858();
					if (local1033[local146] == 65535) {
						local1033[local146] = -1;
					}
				}
				local155 = Static474.aClass5_Sub41_Sub2_2.method7799();
				Static664.method8873(local21, local155, local1033);
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
	public static void method8428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static330.anInt756 / (float) Static330.anInt763;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(44) int local44 = arg3 - (arg2 - local13) / 2;
		@Pc(53) int local53 = arg0 - (arg1 - local11) / 2;
		Static596.anInt3354 = -1;
		Static193.anInt3730 = local53 * Static330.anInt763 / local11;
		Static241.anInt4462 = Static330.anInt756 - Static330.anInt756 * local44 / local13;
		Static293.anInt5675 = -1;
		Static126.method2284();
	}
}
