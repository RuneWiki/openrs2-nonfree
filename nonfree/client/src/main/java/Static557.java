import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public static int anInt9078;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[S")
	public static final short[] aShortArray113 = new short[] { 44, 3, 30, 10, 13, 5, 16, 9 };

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_219 = new Class81(110, 4);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg2 < 1 || Static500.anInt6888 - 2 < arg4 || Static573.anInt9325 - 2 < arg2) {
			return;
		}
		@Pc(37) int local37 = arg5;
		if (arg5 < 3 && Static70.method1506(arg2, arg4)) {
			local37 = arg5 + 1;
		}
		if (!Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609) && !Static484.method6767(Static296.anInt5478, arg2, local37, arg4)) {
			return;
		}
		if (Static118.aClass293ArrayArrayArray14 == null) {
			return;
		}
		Static81.aClass231_Sub1_1.method6695(arg0, arg4, arg5, Static28.aClass94Array2[arg5], arg2, Static136.aClass12_8);
		if (arg3 < 0) {
			return;
		}
		@Pc(83) boolean local83 = Static479.aClass1_Sub7_Sub1_1.aBoolean220;
		Static479.aClass1_Sub7_Sub1_1.aBoolean220 = true;
		Static81.aClass231_Sub1_1.method6700(arg1, local37, arg4, arg7, Static28.aClass94Array2[arg5], Static136.aClass12_8, arg2, arg3, arg5, arg6);
		Static479.aClass1_Sub7_Sub1_1.aBoolean220 = local83;
		return;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!jd;II)V")
	public static void method7517(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) boolean local17 = arg0.method3924(1) == 1;
		if (local17) {
			Static263.anIntArray300[Static121.anInt2449++] = arg1;
		}
		@Pc(40) int local40 = arg0.method3924(2);
		@Pc(44) Class20_Sub2_Sub4_Sub1_Sub1 local44 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[arg1];
		if (local40 != 0) {
			@Pc(156) int local156;
			@Pc(161) int local161;
			@Pc(166) int local166;
			if (local40 == 1) {
				local156 = arg0.method3924(3);
				local161 = local44.anIntArray437[0];
				local166 = local44.anIntArray436[0];
				if (local156 == 0) {
					local161--;
					local166--;
				} else if (local156 == 1) {
					local166--;
				} else if (local156 == 2) {
					local166--;
					local161++;
				} else if (local156 == 3) {
					local161--;
				} else if (local156 == 4) {
					local161++;
				} else if (local156 == 5) {
					local161--;
					local166++;
				} else if (local156 == 6) {
					local166++;
				} else if (local156 == 7) {
					local166++;
					local161++;
				}
				if (local17) {
					local44.anInt4927 = local161;
					local44.aBoolean377 = true;
					local44.anInt4942 = local166;
				} else {
					local44.method4150(local161, local166, Static444.aByteArray57[arg1]);
				}
			} else if (local40 == 2) {
				local156 = arg0.method3924(4);
				local161 = local44.anIntArray437[0];
				local166 = local44.anIntArray436[0];
				if (local156 == 0) {
					local161 -= 2;
					local166 -= 2;
				} else if (local156 == 1) {
					local161--;
					local166 -= 2;
				} else if (local156 == 2) {
					local166 -= 2;
				} else if (local156 == 3) {
					local161++;
					local166 -= 2;
				} else if (local156 == 4) {
					local166 -= 2;
					local161 += 2;
				} else if (local156 == 5) {
					local161 -= 2;
					local166--;
				} else if (local156 == 6) {
					local166--;
					local161 += 2;
				} else if (local156 == 7) {
					local161 -= 2;
				} else if (local156 == 8) {
					local161 += 2;
				} else if (local156 == 9) {
					local161 -= 2;
					local166++;
				} else if (local156 == 10) {
					local166++;
					local161 += 2;
				} else if (local156 == 11) {
					local161 -= 2;
					local166 += 2;
				} else if (local156 == 12) {
					local166 += 2;
					local161--;
				} else if (local156 == 13) {
					local166 += 2;
				} else if (local156 == 14) {
					local161++;
					local166 += 2;
				} else if (local156 == 15) {
					local161 += 2;
					local166 += 2;
				}
				if (local17) {
					local44.anInt4927 = local161;
					local44.anInt4942 = local166;
					local44.aBoolean377 = true;
				} else {
					local44.method4150(local161, local166, Static444.aByteArray57[arg1]);
				}
			} else {
				local156 = arg0.method3924(1);
				@Pc(429) int local429;
				@Pc(439) int local439;
				@Pc(451) int local451;
				@Pc(459) int local459;
				if (local156 == 0) {
					local161 = arg0.method3924(12);
					local166 = local161 >> 10;
					local429 = local161 >> 5 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local439 = local161 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local451 = local44.anIntArray437[0] + local429;
					local459 = local44.anIntArray436[0] + local439;
					if (local17) {
						local44.aBoolean377 = true;
						local44.anInt4942 = local459;
						local44.anInt4927 = local451;
					} else {
						local44.method4150(local451, local459, Static444.aByteArray57[arg1]);
					}
					local44.aByte116 = local44.aByte117 = (byte) (local166 + local44.aByte116 & 0x3);
					if (Static70.method1506(local459, local451)) {
						local44.aByte117++;
					}
					if (arg1 == Static594.anInt9653) {
						Static240.anInt4595 = local44.aByte116;
					}
				} else {
					local161 = arg0.method3924(30);
					local166 = local161 >> 28;
					local429 = local161 >> 14 & 0x3FFF;
					local439 = local161 & 0x3FFF;
					local451 = (local429 + Static376.anInt6631 + local44.anIntArray437[0] & 0x3FFF) - Static376.anInt6631;
					local459 = (Static24.anInt674 + local44.anIntArray436[0] + local439 & 0x3FFF) - Static24.anInt674;
					if (local17) {
						local44.anInt4927 = local451;
						local44.aBoolean377 = true;
						local44.anInt4942 = local459;
					} else {
						local44.method4150(local451, local459, Static444.aByteArray57[arg1]);
					}
					local44.aByte116 = local44.aByte117 = (byte) (local166 + local44.aByte116 & 0x3);
					if (Static70.method1506(local459, local451)) {
						local44.aByte117++;
					}
					if (arg1 == Static594.anInt9653) {
						Static240.anInt4595 = local44.aByte116;
					}
				}
			}
		} else if (local17) {
			local44.aBoolean377 = false;
		} else if (Static594.anInt9653 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(72) Class228 local72 = Static496.aClass228Array1[arg1] = new Class228();
			local72.anInt6256 = (Static24.anInt674 + local44.anIntArray436[0] >> 6) + ((local44.aByte116 << 28) + (Static376.anInt6631 + local44.anIntArray437[0] >> 6 << 14));
			if (local44.anInt4932 == -1) {
				local72.anInt6257 = local44.aClass66_7.method1724();
			} else {
				local72.anInt6257 = local44.anInt4932;
			}
			local72.aBoolean442 = local44.aBoolean378;
			local72.anInt6253 = local44.anInt6436;
			if (local44.anInt4920 > 0) {
				Static52.method1236(local44);
			}
			Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[arg1] = null;
			if (arg0.method3924(1) != 0) {
				Static569.method7668(arg1, arg0);
			}
		}
	}
}
