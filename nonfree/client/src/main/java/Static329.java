import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "[I")
	public static final int[] anIntArray447 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!wt;II)V")
	public static void method4787(@OriginalArg(0) Class3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) boolean local13 = arg0.method6057(1) == 1;
		if (local13) {
			Static412.anIntArray499[Static442.anInt7517++] = arg1;
		}
		@Pc(28) int local28 = arg0.method6057(2);
		@Pc(32) Class1_Sub3_Sub3_Sub1 local32 = Static308.aClass1_Sub3_Sub3_Sub1Array1[arg1];
		if (local28 != 0) {
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			if (local28 == 1) {
				local144 = arg0.method6057(3);
				local149 = local32.anIntArray453[0];
				local154 = local32.anIntArray454[0];
				if (local144 == 0) {
					local149--;
					local154--;
				} else if (local144 == 1) {
					local154--;
				} else if (local144 == 2) {
					local154--;
					local149++;
				} else if (local144 == 3) {
					local149--;
				} else if (local144 == 4) {
					local149++;
				} else if (local144 == 5) {
					local149--;
					local154++;
				} else if (local144 == 6) {
					local154++;
				} else if (local144 == 7) {
					local154++;
					local149++;
				}
				if (local13) {
					local32.aBoolean365 = true;
					local32.anInt4899 = local149;
					local32.anInt4885 = local154;
				} else {
					local32.method3927(Static365.aByteArray71[arg1], local154, local149);
				}
			} else if (local28 == 2) {
				local144 = arg0.method6057(4);
				local149 = local32.anIntArray453[0];
				local154 = local32.anIntArray454[0];
				if (local144 == 0) {
					local149 -= 2;
					local154 -= 2;
				} else if (local144 == 1) {
					local154 -= 2;
					local149--;
				} else if (local144 == 2) {
					local154 -= 2;
				} else if (local144 == 3) {
					local154 -= 2;
					local149++;
				} else if (local144 == 4) {
					local154 -= 2;
					local149 += 2;
				} else if (local144 == 5) {
					local154--;
					local149 -= 2;
				} else if (local144 == 6) {
					local149 += 2;
					local154--;
				} else if (local144 == 7) {
					local149 -= 2;
				} else if (local144 == 8) {
					local149 += 2;
				} else if (local144 == 9) {
					local154++;
					local149 -= 2;
				} else if (local144 == 10) {
					local154++;
					local149 += 2;
				} else if (local144 == 11) {
					local149 -= 2;
					local154 += 2;
				} else if (local144 == 12) {
					local154 += 2;
					local149--;
				} else if (local144 == 13) {
					local154 += 2;
				} else if (local144 == 14) {
					local149++;
					local154 += 2;
				} else if (local144 == 15) {
					local154 += 2;
					local149 += 2;
				}
				if (local13) {
					local32.anInt4899 = local149;
					local32.aBoolean365 = true;
					local32.anInt4885 = local154;
				} else {
					local32.method3927(Static365.aByteArray71[arg1], local154, local149);
				}
			} else {
				local144 = arg0.method6057(1);
				@Pc(392) int local392;
				@Pc(400) int local400;
				@Pc(411) int local411;
				@Pc(418) int local418;
				if (local144 == 0) {
					local149 = arg0.method6057(12);
					local154 = local149 >> 10;
					local392 = local149 >> 5 & 0x1F;
					if (local392 > 15) {
						local392 -= 32;
					}
					local400 = local149 & 0x1F;
					if (local400 > 15) {
						local400 -= 32;
					}
					local411 = local392 + local32.anIntArray453[0];
					local418 = local32.anIntArray454[0] + local400;
					if (local13) {
						local32.anInt4899 = local411;
						local32.aBoolean365 = true;
						local32.anInt4885 = local418;
					} else {
						local32.method3927(Static365.aByteArray71[arg1], local418, local411);
					}
					local32.aByte77 = (byte) (local154 + local32.aByte77 & 0x3);
					if (arg1 == Static177.anInt3617) {
						Static124.anInt2688 = local32.aByte77;
					}
				} else {
					local149 = arg0.method6057(30);
					local154 = local149 >> 28;
					local392 = local149 >> 14 & 0x3FFF;
					local400 = local149 & 0x3FFF;
					local411 = (Static108.anInt3458 + local32.anIntArray453[0] + local392 & 0x3FFF) - Static108.anInt3458;
					local418 = (local400 + Static339.anInt6223 + local32.anIntArray454[0] & 0x3FFF) - Static339.anInt6223;
					if (local13) {
						local32.anInt4885 = local418;
						local32.anInt4899 = local411;
						local32.aBoolean365 = true;
					} else {
						local32.method3927(Static365.aByteArray71[arg1], local418, local411);
					}
					local32.aByte77 = (byte) (local32.aByte77 + local154 & 0x3);
					if (Static177.anInt3617 == arg1) {
						Static124.anInt2688 = local32.aByte77;
					}
				}
			}
		} else if (local13) {
			local32.aBoolean365 = false;
		} else if (arg1 == Static177.anInt3617) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(63) Class239 local63 = Static405.aClass239Array1[arg1] = new Class239();
			local63.anInt7065 = (local32.anIntArray454[0] + Static339.anInt6223 >> 6) + (local32.aByte77 << 28) + (Static108.anInt3458 + local32.anIntArray453[0] >> 6 << 14);
			if (local32.anInt4909 == -1) {
				local63.anInt7069 = local32.aClass160_7.method3877();
			} else {
				local63.anInt7069 = local32.anInt4909;
			}
			local63.aBoolean493 = local32.aBoolean364;
			local63.anInt7064 = local32.anInt6102;
			if (local32.anInt4904 > 0) {
				Static290.method4264(local32);
			}
			Static308.aClass1_Sub3_Sub3_Sub1Array1[arg1] = null;
			if (arg0.method6057(1) != 0) {
				Static301.method4449(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method4788(@OriginalArg(0) Class13_Sub5 arg0) {
		arg0.aClass1_Sub3_Sub3_1 = null;
		if (Static258.anInt7455 < 20) {
			Static453.aClass40_7.method1190(arg0);
			Static258.anInt7455++;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(CI)Z")
	public static boolean method4789(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
