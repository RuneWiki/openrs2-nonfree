import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
	public static int anInt847;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	public static final int anInt848 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIJ)V")
	public static void method748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static136.method2083(arg0, 0, local10, arg1, true, 0, local21, 0);
			return;
		}
		@Pc(44) Class95 local44 = Static518.aClass96_4.method1925(local28);
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (local21 == 0 || local21 == 2) {
			local55 = local44.anInt2403;
			local58 = local44.anInt2387;
		} else {
			local55 = local44.anInt2387;
			local58 = local44.anInt2403;
		}
		@Pc(69) int local69 = local44.anInt2411;
		if (local21 != 0) {
			local69 = (local69 << local21 & 0xF) + (local69 >> 4 - local21);
		}
		Static136.method2083(arg0, local58, 0, arg1, true, local55, 0, local69);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII)I")
	public static int method749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZI)V")
	public static void method750(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static585.aClass1_Sub35_Sub2_2.method5808(Static445.anInt7693) >= 15) {
				@Pc(22) int local22 = Static585.aClass1_Sub35_Sub2_2.method5806(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					@Pc(36) Class1_Sub42 local36 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local22);
					@Pc(42) Class8_Sub3_Sub3_Sub1_Sub2 local42;
					if (local36 == null) {
						local42 = new Class8_Sub3_Sub3_Sub1_Sub2();
						local42.anInt6821 = local22;
						local36 = new Class1_Sub42(local42);
						Static84.aClass187_40.method3795(local36, (long) local22);
						Static466.aClass1_Sub42Array1[Static35.anInt540++] = local36;
						local29 = true;
					}
					local42 = local36.aClass8_Sub3_Sub3_Sub1_Sub2_2;
					Static17.anIntArray24[Static39.anInt609++] = local22;
					local42.anInt6780 = Static301.anInt5197;
					if (local42.aClass20_1 != null && local42.aClass20_1.method277()) {
						Static428.method5939(local42);
					}
					@Pc(96) int local96 = Static585.aClass1_Sub35_Sub2_2.method5806(1);
					if (local96 == 1) {
						Static283.anIntArray376[Static429.anInt7505++] = local22;
					}
					@Pc(114) int local114;
					if (arg0) {
						local114 = Static585.aClass1_Sub35_Sub2_2.method5806(8);
						if (local114 > 127) {
							local114 -= 256;
						}
					} else {
						local114 = Static585.aClass1_Sub35_Sub2_2.method5806(5);
						if (local114 > 15) {
							local114 -= 32;
						}
					}
					@Pc(144) int local144 = Static585.aClass1_Sub35_Sub2_2.method5806(3) + 4 << 11 & 0x3A15;
					local42.method5450(Static322.aClass326_2.method7234(Static585.aClass1_Sub35_Sub2_2.method5806(14)));
					@Pc(159) int local159 = Static585.aClass1_Sub35_Sub2_2.method5806(2);
					@Pc(166) int local166;
					if (arg0) {
						local166 = Static585.aClass1_Sub35_Sub2_2.method5806(8);
						if (local166 > 127) {
							local166 -= 256;
						}
					} else {
						local166 = Static585.aClass1_Sub35_Sub2_2.method5806(5);
						if (local166 > 15) {
							local166 -= 32;
						}
					}
					@Pc(188) int local188 = Static585.aClass1_Sub35_Sub2_2.method5806(1);
					local42.method5429(local42.aClass20_1.anInt350);
					local42.anInt6804 = local42.aClass20_1.anInt330 << 3;
					if (local29) {
						local42.method5435(local144, true);
					}
					local42.method5448(local166 + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0], local42.method5434(), local188 == 1, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] + local114, local159);
					if (local42.aClass20_1.method277()) {
						Static229.method3478(local42.anIntArray534[0], local42, local42.aByte123, local42.anIntArray533[0], null, 0, null);
					}
					continue;
				}
			}
			Static585.aClass1_Sub35_Sub2_2.method5814();
			return;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Lclient!vg;")
	public static Class341 method751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class341 local9 = Static350.method4758(arg0);
		if (arg1 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass341Array2 == null || arg1 >= local9.aClass341Array2.length) {
			return null;
		} else {
			return local9.aClass341Array2[arg1];
		}
	}
}
