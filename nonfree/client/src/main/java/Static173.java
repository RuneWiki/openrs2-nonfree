import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
	public static int anInt3123;

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!ro;")
	public static Class306 aClass306_13;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "Lclient!ws;")
	public static Class383 aClass383_3;

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "Lclient!on;")
	public static Class262 aClass262_1;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_75 = new Class136(102, -2);

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_76 = new Class136(106, 8);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)I")
	public static int method2662() {
		return Static453.anInt7627 == 1 ? Static444.anInt7482 : Static554.anInt9157;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!wd;)V")
	public static void method2663(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12_Sub2 arg1) {
		@Pc(15) boolean local15 = arg1.method8670(1) == 1;
		if (local15) {
			Static417.anIntArray574[Static385.anInt6764++] = arg0;
		}
		@Pc(30) int local30 = arg1.method8670(2);
		@Pc(34) Class14_Sub1_Sub1_Sub3_Sub1 local34 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[arg0];
		if (local30 != 0) {
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(149) int local149;
			if (local30 == 1) {
				local139 = arg1.method8670(3);
				local144 = local34.anIntArray253[0];
				local149 = local34.anIntArray252[0];
				if (local139 == 0) {
					local144--;
					local149--;
				} else if (local139 == 1) {
					local149--;
				} else if (local139 == 2) {
					local149--;
					local144++;
				} else if (local139 == 3) {
					local144--;
				} else if (local139 == 4) {
					local144++;
				} else if (local139 == 5) {
					local144--;
					local149++;
				} else if (local139 == 6) {
					local149++;
				} else if (local139 == 7) {
					local149++;
					local144++;
				}
				if (local15) {
					local34.anInt2732 = local144;
					local34.aBoolean240 = true;
					local34.anInt2749 = local149;
				} else {
					local34.method2372(Static514.aByteArray78[arg0], local149, local144);
				}
			} else if (local30 == 2) {
				local139 = arg1.method8670(4);
				local144 = local34.anIntArray253[0];
				local149 = local34.anIntArray252[0];
				if (local139 == 0) {
					local149 -= 2;
					local144 -= 2;
				} else if (local139 == 1) {
					local149 -= 2;
					local144--;
				} else if (local139 == 2) {
					local149 -= 2;
				} else if (local139 == 3) {
					local149 -= 2;
					local144++;
				} else if (local139 == 4) {
					local144 += 2;
					local149 -= 2;
				} else if (local139 == 5) {
					local144 -= 2;
					local149--;
				} else if (local139 == 6) {
					local149--;
					local144 += 2;
				} else if (local139 == 7) {
					local144 -= 2;
				} else if (local139 == 8) {
					local144 += 2;
				} else if (local139 == 9) {
					local144 -= 2;
					local149++;
				} else if (local139 == 10) {
					local144 += 2;
					local149++;
				} else if (local139 == 11) {
					local149 += 2;
					local144 -= 2;
				} else if (local139 == 12) {
					local149 += 2;
					local144--;
				} else if (local139 == 13) {
					local149 += 2;
				} else if (local139 == 14) {
					local144++;
					local149 += 2;
				} else if (local139 == 15) {
					local144 += 2;
					local149 += 2;
				}
				if (local15) {
					local34.aBoolean240 = true;
					local34.anInt2749 = local149;
					local34.anInt2732 = local144;
				} else {
					local34.method2372(Static514.aByteArray78[arg0], local149, local144);
				}
			} else {
				local139 = arg1.method8670(1);
				@Pc(416) int local416;
				@Pc(426) int local426;
				@Pc(437) int local437;
				@Pc(444) int local444;
				if (local139 == 0) {
					local144 = arg1.method8670(12);
					local149 = local144 >> 10;
					local416 = local144 >> 5 & 0x1F;
					if (local416 > 15) {
						local416 -= 32;
					}
					local426 = local144 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local437 = local416 + local34.anIntArray253[0];
					local444 = local34.anIntArray252[0] + local426;
					if (local15) {
						local34.anInt2749 = local444;
						local34.aBoolean240 = true;
						local34.anInt2732 = local437;
					} else {
						local34.method2372(Static514.aByteArray78[arg0], local444, local437);
					}
					local34.aByte125 = local34.aByte126 = (byte) (local34.aByte125 + local149 & 0x3);
					if (Static353.method5596(local437, local444)) {
						local34.aByte126++;
					}
					if (arg0 == Static620.anInt10055) {
						if (local34.aByte125 != Static299.anInt4751) {
							Static367.aBoolean541 = true;
						}
						Static299.anInt4751 = local34.aByte125;
					}
				} else {
					local144 = arg1.method8670(30);
					local149 = local144 >> 28;
					local416 = local144 >> 14 & 0x3FFF;
					local426 = local144 & 0x3FFF;
					local437 = (local34.anIntArray253[0] + Static113.anInt1785 + local416 & 0x3FFF) - Static113.anInt1785;
					local444 = (local426 + Static622.anInt10087 + local34.anIntArray252[0] & 0x3FFF) - Static622.anInt10087;
					if (local15) {
						local34.aBoolean240 = true;
						local34.anInt2732 = local437;
						local34.anInt2749 = local444;
					} else {
						local34.method2372(Static514.aByteArray78[arg0], local444, local437);
					}
					local34.aByte125 = local34.aByte126 = (byte) (local149 + local34.aByte125 & 0x3);
					if (Static353.method5596(local437, local444)) {
						local34.aByte126++;
					}
					if (arg0 == Static620.anInt10055) {
						Static299.anInt4751 = local34.aByte125;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean240 = false;
		} else if (Static620.anInt10055 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(58) Class127 local58 = Static495.aClass127Array3[arg0] = new Class127();
			local58.anInt3245 = (local34.anIntArray252[0] + Static622.anInt10087 >> 6) + (local34.aByte125 << 28) + (local34.anIntArray253[0] + Static113.anInt1785 >> 6 << 14);
			if (local34.anInt2714 == -1) {
				local58.anInt3248 = local34.aClass130_7.method2930();
			} else {
				local58.anInt3248 = local34.anInt2714;
			}
			local58.aBoolean271 = local34.aBoolean238;
			local58.anInt3247 = local34.anInt2951;
			if (local34.anInt2727 > 0) {
				Static261.method3993(local34);
			}
			Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[arg0] = null;
			if (arg1.method8670(1) != 0) {
				Static226.method3560(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!vfa;I)V")
	public static void method2667(@OriginalArg(0) int arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2) {
		Static76.anInt1278 = arg0;
		Static611.aClass357_14 = arg1;
		Static455.anInt7664 = arg2;
	}
}
