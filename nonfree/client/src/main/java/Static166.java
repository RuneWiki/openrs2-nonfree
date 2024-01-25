import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gfa", name = "x", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
	public static int anInt3460 = -1;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!sj;II)V")
	public static void method2751(@OriginalArg(0) Class4_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method7065(1) == 1;
		if (local15) {
			Static442.anIntArray491[Static124.anInt2827++] = arg1;
		}
		@Pc(37) int local37 = arg0.method7065(2);
		@Pc(41) Class21_Sub1_Sub1_Sub1_Sub2 local41 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local37 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local37 == 1) {
				local153 = arg0.method7065(3);
				local158 = local41.anIntArray206[0];
				local163 = local41.anIntArray207[0];
				if (local153 == 0) {
					local163--;
					local158--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local158++;
					local163--;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local163++;
					local158--;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local158++;
					local163++;
				}
				if (local15) {
					local41.anInt4288 = local163;
					local41.aBoolean303 = true;
					local41.anInt4310 = local158;
				} else {
					local41.method3351(local163, local158, Static298.aByteArray48[arg1]);
				}
			} else if (local37 == 2) {
				local153 = arg0.method7065(4);
				local158 = local41.anIntArray206[0];
				local163 = local41.anIntArray207[0];
				if (local153 == 0) {
					local163 -= 2;
					local158 -= 2;
				} else if (local153 == 1) {
					local158--;
					local163 -= 2;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local163 -= 2;
					local158++;
				} else if (local153 == 4) {
					local158 += 2;
					local163 -= 2;
				} else if (local153 == 5) {
					local163--;
					local158 -= 2;
				} else if (local153 == 6) {
					local163--;
					local158 += 2;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local163++;
					local158 -= 2;
				} else if (local153 == 10) {
					local163++;
					local158 += 2;
				} else if (local153 == 11) {
					local163 += 2;
					local158 -= 2;
				} else if (local153 == 12) {
					local158--;
					local163 += 2;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local163 += 2;
					local158++;
				} else if (local153 == 15) {
					local158 += 2;
					local163 += 2;
				}
				if (local15) {
					local41.anInt4288 = local163;
					local41.aBoolean303 = true;
					local41.anInt4310 = local158;
				} else {
					local41.method3351(local163, local158, Static298.aByteArray48[arg1]);
				}
			} else {
				local153 = arg0.method7065(1);
				@Pc(423) int local423;
				@Pc(431) int local431;
				@Pc(442) int local442;
				@Pc(449) int local449;
				if (local153 == 0) {
					local158 = arg0.method7065(12);
					local163 = local158 >> 10;
					local423 = local158 >> 5 & 0x1F;
					if (local423 > 15) {
						local423 -= 32;
					}
					local431 = local158 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local442 = local41.anIntArray206[0] + local423;
					local449 = local431 + local41.anIntArray207[0];
					if (local15) {
						local41.anInt4288 = local449;
						local41.aBoolean303 = true;
						local41.anInt4310 = local442;
					} else {
						local41.method3351(local449, local442, Static298.aByteArray48[arg1]);
					}
					local41.aByte127 = local41.aByte128 = (byte) (local163 + local41.aByte127 & 0x3);
					if (Static193.method3175(local449, local442)) {
						local41.aByte128++;
					}
					if (arg1 == Static1.anInt5011) {
						Static352.anInt6764 = local41.aByte127;
					}
				} else {
					local158 = arg0.method7065(30);
					local163 = local158 >> 28;
					local423 = local158 >> 14 & 0x3FFF;
					local431 = local158 & 0x3FFF;
					local442 = (local423 + local41.anIntArray206[0] + Static242.anInt10133 & 0x3FFF) - Static242.anInt10133;
					local449 = (local431 + local41.anIntArray207[0] + Static157.anInt3323 & 0x3FFF) - Static157.anInt3323;
					if (local15) {
						local41.anInt4310 = local442;
						local41.aBoolean303 = true;
						local41.anInt4288 = local449;
					} else {
						local41.method3351(local449, local442, Static298.aByteArray48[arg1]);
					}
					local41.aByte127 = local41.aByte128 = (byte) (local163 + local41.aByte127 & 0x3);
					if (Static193.method3175(local449, local442)) {
						local41.aByte128++;
					}
					if (arg1 == Static1.anInt5011) {
						Static352.anInt6764 = local41.aByte127;
					}
				}
			}
		} else if (local15) {
			local41.aBoolean303 = false;
		} else if (arg1 == Static1.anInt5011) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(68) Class337 local68 = Static140.aClass337Array1[arg1] = new Class337();
			local68.anInt10020 = (local41.anIntArray207[0] + Static157.anInt3323 >> 6) + (local41.aByte127 << 28) + (local41.anIntArray206[0] + Static242.anInt10133 >> 6 << 14);
			if (local41.anInt4323 == -1) {
				local68.anInt10017 = local41.aClass133_7.method2990();
			} else {
				local68.anInt10017 = local41.anInt4323;
			}
			local68.anInt10018 = local41.anInt4263;
			local68.aBoolean692 = local41.aBoolean302;
			if (local41.anInt4308 > 0) {
				Static65.method1452(local41);
			}
			Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method7065(1) != 0) {
				Static177.method2939(arg1, arg0);
			}
		}
	}
}
