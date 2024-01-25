import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static503.aByteArrayArrayArray11[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static503.aByteArrayArrayArray11[arg1][arg0][arg3] & 0x10) == 0) {
			return arg2 == Static536.method7151(arg1, arg3, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILclient!ce;)V")
	public static void method2958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method1383(1) == 1;
		if (local15) {
			Static29.anIntArray560[Static485.anInt7939++] = arg0;
		}
		@Pc(34) int local34 = arg1.method1383(2);
		@Pc(38) Class41_Sub2_Sub1_Sub4_Sub2 local38 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[arg0];
		if (local34 != 0) {
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local34 == 1) {
				local149 = arg1.method1383(3);
				local154 = local38.anIntArray629[0];
				local159 = local38.anIntArray628[0];
				if (local149 == 0) {
					local154--;
					local159--;
				} else if (local149 == 1) {
					local159--;
				} else if (local149 == 2) {
					local154++;
					local159--;
				} else if (local149 == 3) {
					local154--;
				} else if (local149 == 4) {
					local154++;
				} else if (local149 == 5) {
					local154--;
					local159++;
				} else if (local149 == 6) {
					local159++;
				} else if (local149 == 7) {
					local159++;
					local154++;
				}
				if (local15) {
					local38.anInt9537 = local154;
					local38.aBoolean747 = true;
					local38.anInt9550 = local159;
				} else {
					local38.method7880(local154, local159, Static477.aByteArray89[arg0]);
				}
			} else if (local34 == 2) {
				local149 = arg1.method1383(4);
				local154 = local38.anIntArray629[0];
				local159 = local38.anIntArray628[0];
				if (local149 == 0) {
					local159 -= 2;
					local154 -= 2;
				} else if (local149 == 1) {
					local154--;
					local159 -= 2;
				} else if (local149 == 2) {
					local159 -= 2;
				} else if (local149 == 3) {
					local159 -= 2;
					local154++;
				} else if (local149 == 4) {
					local159 -= 2;
					local154 += 2;
				} else if (local149 == 5) {
					local159--;
					local154 -= 2;
				} else if (local149 == 6) {
					local159--;
					local154 += 2;
				} else if (local149 == 7) {
					local154 -= 2;
				} else if (local149 == 8) {
					local154 += 2;
				} else if (local149 == 9) {
					local159++;
					local154 -= 2;
				} else if (local149 == 10) {
					local159++;
					local154 += 2;
				} else if (local149 == 11) {
					local159 += 2;
					local154 -= 2;
				} else if (local149 == 12) {
					local159 += 2;
					local154--;
				} else if (local149 == 13) {
					local159 += 2;
				} else if (local149 == 14) {
					local154++;
					local159 += 2;
				} else if (local149 == 15) {
					local154 += 2;
					local159 += 2;
				}
				if (local15) {
					local38.anInt9537 = local154;
					local38.aBoolean747 = true;
					local38.anInt9550 = local159;
				} else {
					local38.method7880(local154, local159, Static477.aByteArray89[arg0]);
				}
			} else {
				local149 = arg1.method1383(1);
				@Pc(426) int local426;
				@Pc(434) int local434;
				@Pc(447) int local447;
				@Pc(454) int local454;
				if (local149 == 0) {
					local154 = arg1.method1383(12);
					local159 = local154 >> 10;
					local426 = local154 >> 5 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local434 = local154 & 0x1F;
					if (local434 > 15) {
						local434 -= 32;
					}
					local447 = local426 + local38.anIntArray629[0];
					local454 = local434 + local38.anIntArray628[0];
					if (local15) {
						local38.anInt9537 = local447;
						local38.aBoolean747 = true;
						local38.anInt9550 = local454;
					} else {
						local38.method7880(local447, local454, Static477.aByteArray89[arg0]);
					}
					local38.aByte117 = local38.aByte118 = (byte) (local38.aByte117 + local159 & 0x3);
					if (Static511.method6886(local454, local447)) {
						local38.aByte118++;
					}
					if (arg0 == Static166.anInt3327) {
						Static117.anInt2694 = local38.aByte117;
					}
				} else {
					local154 = arg1.method1383(30);
					local159 = local154 >> 28;
					local426 = local154 >> 14 & 0x3FFF;
					local434 = local154 & 0x3FFF;
					local447 = (local426 + Static335.anInt5608 + local38.anIntArray629[0] & 0x3FFF) - Static335.anInt5608;
					local454 = (local38.anIntArray628[0] + Static246.anInt4344 + local434 & 0x3FFF) - Static246.anInt4344;
					if (local15) {
						local38.anInt9537 = local447;
						local38.aBoolean747 = true;
						local38.anInt9550 = local454;
					} else {
						local38.method7880(local447, local454, Static477.aByteArray89[arg0]);
					}
					local38.aByte117 = local38.aByte118 = (byte) (local159 + local38.aByte117 & 0x3);
					if (Static511.method6886(local454, local447)) {
						local38.aByte118++;
					}
					if (arg0 == Static166.anInt3327) {
						Static117.anInt2694 = local38.aByte117;
					}
				}
			}
		} else if (local15) {
			local38.aBoolean747 = false;
		} else if (arg0 == Static166.anInt3327) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(66) Class252 local66 = Static352.aClass252Array1[arg0] = new Class252();
			local66.anInt6967 = (Static246.anInt4344 + local38.anIntArray628[0] >> 6) + (local38.aByte117 << 28) + (Static335.anInt5608 - -local38.anIntArray629[0] >> 6 << 14);
			if (local38.anInt9560 == -1) {
				local66.anInt6970 = local38.aClass259_7.method5914();
			} else {
				local66.anInt6970 = local38.anInt9560;
			}
			local66.anInt6965 = local38.anInt9483;
			local66.aBoolean522 = local38.aBoolean743;
			if (local38.anInt9570 > 0) {
				Static350.method5140(local38);
			}
			Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[arg0] = null;
			if (arg1.method1383(1) != 0) {
				Static537.method7174(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI[F)[F")
	public static float[] method2959(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static601.method2817(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
