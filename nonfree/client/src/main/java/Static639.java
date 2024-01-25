import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public static int anInt10307;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array19;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_225 = new Class200(106, 11);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ei;I)V")
	public static void method8762(@OriginalArg(1) Class2_Sub17_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) boolean local13 = arg0.method2456(1) == 1;
		if (local13) {
			Static494.anIntArray565[Static136.anInt2909++] = arg1;
		}
		@Pc(28) int local28 = arg0.method2456(2);
		@Pc(32) Class16_Sub1_Sub1_Sub3_Sub2 local32 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[arg1];
		if (local28 != 0) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (local28 == 1) {
				local141 = arg0.method2456(3);
				local146 = local32.anIntArray595[0];
				local151 = local32.anIntArray594[0];
				if (local141 == 0) {
					local146--;
					local151--;
				} else if (local141 == 1) {
					local151--;
				} else if (local141 == 2) {
					local151--;
					local146++;
				} else if (local141 == 3) {
					local146--;
				} else if (local141 == 4) {
					local146++;
				} else if (local141 == 5) {
					local151++;
					local146--;
				} else if (local141 == 6) {
					local151++;
				} else if (local141 == 7) {
					local146++;
					local151++;
				}
				if (local13) {
					local32.anInt8151 = local151;
					local32.aBoolean591 = true;
					local32.anInt8155 = local146;
				} else {
					local32.method7019(local146, local151, Static645.aByteArray107[arg1]);
				}
			} else if (local28 == 2) {
				local141 = arg0.method2456(4);
				local146 = local32.anIntArray595[0];
				local151 = local32.anIntArray594[0];
				if (local141 == 0) {
					local151 -= 2;
					local146 -= 2;
				} else if (local141 == 1) {
					local151 -= 2;
					local146--;
				} else if (local141 == 2) {
					local151 -= 2;
				} else if (local141 == 3) {
					local146++;
					local151 -= 2;
				} else if (local141 == 4) {
					local151 -= 2;
					local146 += 2;
				} else if (local141 == 5) {
					local146 -= 2;
					local151--;
				} else if (local141 == 6) {
					local146 += 2;
					local151--;
				} else if (local141 == 7) {
					local146 -= 2;
				} else if (local141 == 8) {
					local146 += 2;
				} else if (local141 == 9) {
					local146 -= 2;
					local151++;
				} else if (local141 == 10) {
					local146 += 2;
					local151++;
				} else if (local141 == 11) {
					local151 += 2;
					local146 -= 2;
				} else if (local141 == 12) {
					local151 += 2;
					local146--;
				} else if (local141 == 13) {
					local151 += 2;
				} else if (local141 == 14) {
					local151 += 2;
					local146++;
				} else if (local141 == 15) {
					local151 += 2;
					local146 += 2;
				}
				if (local13) {
					local32.aBoolean591 = true;
					local32.anInt8155 = local146;
					local32.anInt8151 = local151;
				} else {
					local32.method7019(local146, local151, Static645.aByteArray107[arg1]);
				}
			} else {
				local141 = arg0.method2456(1);
				@Pc(402) int local402;
				@Pc(412) int local412;
				@Pc(423) int local423;
				@Pc(430) int local430;
				if (local141 == 0) {
					local146 = arg0.method2456(12);
					local151 = local146 >> 10;
					local402 = local146 >> 5 & 0x1F;
					if (local402 > 15) {
						local402 -= 32;
					}
					local412 = local146 & 0x1F;
					if (local412 > 15) {
						local412 -= 32;
					}
					local423 = local402 + local32.anIntArray595[0];
					local430 = local32.anIntArray594[0] + local412;
					if (local13) {
						local32.aBoolean591 = true;
						local32.anInt8151 = local430;
						local32.anInt8155 = local423;
					} else {
						local32.method7019(local423, local430, Static645.aByteArray107[arg1]);
					}
					local32.aByte109 = local32.aByte108 = (byte) (local32.aByte109 + local151 & 0x3);
					if (Static481.method6813(local430, local423)) {
						local32.aByte108++;
					}
					if (arg1 == Static608.anInt10056) {
						if (local32.aByte109 != Static531.anInt8550) {
							Static578.aBoolean673 = true;
						}
						Static531.anInt8550 = local32.aByte109;
					}
				} else {
					local146 = arg0.method2456(30);
					local151 = local146 >> 28;
					local402 = local146 >> 14 & 0x3FFF;
					local412 = local146 & 0x3FFF;
					local423 = (Static406.anInt6899 + local32.anIntArray595[0] + local402 & 0x3FFF) - Static406.anInt6899;
					local430 = (local412 + local32.anIntArray594[0] + Static338.anInt5885 & 0x3FFF) - Static338.anInt5885;
					if (local13) {
						local32.anInt8155 = local423;
						local32.aBoolean591 = true;
						local32.anInt8151 = local430;
					} else {
						local32.method7019(local423, local430, Static645.aByteArray107[arg1]);
					}
					local32.aByte109 = local32.aByte108 = (byte) (local151 + local32.aByte109 & 0x3);
					if (Static481.method6813(local430, local423)) {
						local32.aByte108++;
					}
					if (Static608.anInt10056 == arg1) {
						Static531.anInt8550 = local32.aByte109;
					}
				}
			}
		} else if (local13) {
			local32.aBoolean591 = false;
		} else if (Static608.anInt10056 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(59) Class122 local59 = Static44.aClass122Array1[arg1] = new Class122();
			local59.anInt3507 = (Static338.anInt5885 + local32.anIntArray594[0] >> 6) + (local32.anIntArray595[0] + Static406.anInt6899 >> 6 << 14) + (local32.aByte109 << 28);
			if (local32.anInt8170 == -1) {
				local59.anInt3504 = local32.aClass111_7.method2696();
			} else {
				local59.anInt3504 = local32.anInt8170;
			}
			local59.anInt3503 = local32.anInt8100;
			local59.aBoolean269 = local32.aBoolean592;
			if (local32.anInt8153 > 0) {
				Static406.method6021(local32);
			}
			Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[arg1] = null;
			if (arg0.method2456(1) != 0) {
				Static234.method3744(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ha;ILclient!d;IIII)V")
	public static void method8763(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static60.anInt1449 < 100) {
			Static157.method2750(arg2, arg0);
		}
		arg0.KA(arg4, arg3, arg1 + arg4, arg3 + arg5);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static60.anInt1449 < 100) {
			local34 = arg4 + arg1 / 2;
			local45 = arg3 + arg5 / 2 - 20 - 18;
			arg0.aa(arg4, arg3, arg1, arg5, -16777216, 0);
			arg0.method8104(local34 - 152, local45, 304, 34, Static587.aColorArray7[Static145.anInt3032].getRGB(), 0);
			arg0.aa(local34 - 150, local45 + 2, Static60.anInt1449 * 3, 30, Static472.aColorArray6[Static145.anInt3032].getRGB(), 0);
			Static544.aClass37_8.method6075(local34, -1, Static467.aColorArray8[Static145.anInt3032].getRGB(), local45 + 20, Static573.aClass345_20.method7951(Static496.anInt7407));
			return;
		}
		@Pc(109) int local109 = Static331.anInt5801 - (int) ((float) arg1 / Static371.aFloat186);
		local34 = Static611.anInt10071 + (int) ((float) arg5 / Static371.aFloat186);
		local45 = (int) ((float) arg1 / Static371.aFloat186) + Static331.anInt5801;
		Static388.anInt6681 = (int) ((float) (arg1 * 2) / Static371.aFloat186);
		Static646.anInt10428 = Static611.anInt10071 - (int) ((float) arg5 / Static371.aFloat186);
		Static92.anInt2246 = Static331.anInt5801 - (int) ((float) arg1 / Static371.aFloat186);
		Static318.anInt5613 = (int) ((float) (arg5 * 2) / Static371.aFloat186);
		@Pc(166) int local166 = Static611.anInt10071 - (int) ((float) arg5 / Static371.aFloat186);
		Static371.method7977(Static371.anInt9384 + local109, Static371.anInt9385 + local34, local45 + Static371.anInt9384, Static371.anInt9385 + local166, arg4, arg3, arg4 + arg1, arg5 + 1 + arg3);
		Static371.method7972(arg0);
		@Pc(195) Class114 local195 = Static371.method7986(arg0);
		Static546.method7561(arg0, local195);
		if (Static648.anInt10477 > 0) {
			Static14.anInt274--;
			if (Static14.anInt274 == 0) {
				Static648.anInt10477--;
				Static14.anInt274 = 20;
			}
		}
		if (!Static238.aBoolean585) {
			return;
		}
		@Pc(229) int local229 = arg4 + arg1 - 5;
		@Pc(235) int local235 = arg5 + arg3 - 8;
		Static39.aClass37_1.method6071(16776960, "Fps:" + Static91.anInt2244, local229, -1, local235);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(261) int local261 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(263) int local263 = 16776960;
		if (local261 > 65536) {
			local263 = 16711680;
		}
		Static39.aClass37_1.method6071(local263, "Mem:" + local261 + "k", local229, -1, local250);
		local235 = local250 - 15;
	}
}
