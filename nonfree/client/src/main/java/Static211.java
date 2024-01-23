import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!mb;")
	public static Class70 aClass70_42;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_65;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
	public static int[] anIntArray334;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!sf;")
	public static Class105 aClass105_22 = new Class105();

	@OriginalMember(owner = "client!v", name = "f", descriptor = "I")
	public static int anInt4507 = -1;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1558 = Static64.method1101("<br>(X");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method3498() {
		Static140.aClass53_22.method1496(5);
		Static76.aClass53_15.method1496(5);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	public static void method3499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class105 local11 = Static111.aClass105ArrayArrayArray1[Static197.anInt2422][arg1][arg0];
		if (local11 == null) {
			Static56.method2736(Static197.anInt2422, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub2_Sub2 local23 = null;
		@Pc(28) Class1_Sub2_Sub2 local28;
		for (local28 = (Class1_Sub2_Sub2) local11.method3120(); local28 != null; local28 = (Class1_Sub2_Sub2) local11.method3109()) {
			@Pc(38) Class92 local38 = Static36.method637(local28.aClass5_Sub4_1.anInt2768);
			@Pc(41) int local41 = local38.anInt3681;
			if (local38.anInt3644 == 1) {
				local41 *= local28.aClass5_Sub4_1.anInt2772 + 1;
			}
			if (local41 > local21) {
				local23 = local28;
				local21 = local41;
			}
		}
		if (local23 == null) {
			Static56.method2736(Static197.anInt2422, arg1, arg0);
			return;
		}
		local11.method3116(local23);
		local28 = (Class1_Sub2_Sub2) local11.method3120();
		@Pc(94) Class5_Sub4 local94 = null;
		@Pc(96) Class5_Sub4 local96 = null;
		while (local28 != null) {
			@Pc(100) Class5_Sub4 local100 = local28.aClass5_Sub4_1;
			if (local23.aClass5_Sub4_1.anInt2768 != local100.anInt2768) {
				if (local94 == null) {
					local94 = local100;
				}
				if (local100.anInt2768 != local94.anInt2768 && local96 == null) {
					local96 = local100;
				}
			}
			local28 = (Class1_Sub2_Sub2) local11.method3109();
		}
		@Pc(143) long local143 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static26.method2451(Static197.anInt2422, arg1, arg0, Static26.method2454(Static197.anInt2422, arg0 * 128 + 64, arg1 * 128 + 64), local23.aClass5_Sub4_1, local143, local94, local96);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIII)V")
	public static void method3501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) long local6 = Static225.method3687(arg0, arg2, arg1);
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(57) int local57;
		@Pc(64) int local64;
		if (local6 != 0L) {
			local23 = (int) local6 >> 20 & 0x3;
			local30 = (int) local6 >> 14 & 0x1F;
			local32 = arg4;
			if (local6 > 0L) {
				local32 = arg3;
			}
			@Pc(42) int[] local42 = Static96.anIntArray137;
			local57 = arg2 * 4 + (52736 - arg1 * 512) * 4 + 24624;
			local64 = Integer.MAX_VALUE & (int) (local6 >>> 32);
			@Pc(68) Class82 local68 = Static9.method132(local64);
			if (local68.anInt3297 == -1) {
				if (local30 == 0 || local30 == 2) {
					if (local23 == 0) {
						local42[local57] = local32;
						local42[local57 + 512] = local32;
						local42[local57 + 1024] = local32;
						local42[local57 + 1536] = local32;
					} else if (local23 == 1) {
						local42[local57] = local32;
						local42[local57 + 1] = local32;
						local42[local57 + 2] = local32;
						local42[local57 + 3] = local32;
					} else if (local23 == 2) {
						local42[local57 + 3] = local32;
						local42[local57 + 3 + 512] = local32;
						local42[local57 + 1024 + 3] = local32;
						local42[local57 + 1536 + 3] = local32;
					} else if (local23 == 3) {
						local42[local57 + 1536] = local32;
						local42[local57 + 1537] = local32;
						local42[local57 + 1538] = local32;
						local42[local57 + 1539] = local32;
					}
				}
				if (local30 == 3) {
					if (local23 == 0) {
						local42[local57] = local32;
					} else if (local23 == 1) {
						local42[local57 + 3] = local32;
					} else if (local23 == 2) {
						local42[local57 + 1539] = local32;
					} else if (local23 == 3) {
						local42[local57 + 1536] = local32;
					}
				}
				if (local30 == 2) {
					if (local23 == 3) {
						local42[local57] = local32;
						local42[local57 + 512] = local32;
						local42[local57 + 1024] = local32;
						local42[local57 + 1536] = local32;
					} else if (local23 == 0) {
						local42[local57] = local32;
						local42[local57 + 1] = local32;
						local42[local57 + 2] = local32;
						local42[local57 + 3] = local32;
					} else if (local23 == 1) {
						local42[local57 + 3] = local32;
						local42[local57 + 3 + 512] = local32;
						local42[local57 + 3 + 1024] = local32;
						local42[local57 + 1536 + 3] = local32;
					} else if (local23 == 2) {
						local42[local57 + 1536] = local32;
						local42[local57 + 1537] = local32;
						local42[local57 + 1538] = local32;
						local42[local57 + 1539] = local32;
					}
				}
			} else {
				@Pc(77) Class41_Sub1 local77 = Static187.aClass41_Sub1Array2[local68.anInt3297];
				if (local77 != null) {
					@Pc(90) int local90 = (local68.anInt3258 * 4 - local77.anInt1294) / 2;
					@Pc(101) int local101 = (local68.anInt3279 * 4 - local77.anInt1298) / 2;
					local77.method969(local90 + arg2 * 4 + 48, local101 + 48 + (104 - (arg1 + local68.anInt3279)) * 4);
				}
			}
		}
		local6 = Static25.method503(arg0, arg2, arg1);
		if (local6 != 0L) {
			local30 = (int) local6 >> 14 & 0x1F;
			local23 = (int) local6 >> 20 & 0x3;
			local32 = (int) (local6 >>> 32) & Integer.MAX_VALUE;
			@Pc(461) Class82 local461 = Static9.method132(local32);
			@Pc(493) int local493;
			if (local461.anInt3297 != -1) {
				@Pc(470) Class41_Sub1 local470 = Static187.aClass41_Sub1Array2[local461.anInt3297];
				if (local470 != null) {
					local64 = (local461.anInt3258 * 4 - local470.anInt1294) / 2;
					local493 = (local461.anInt3279 * 4 - local470.anInt1298) / 2;
					local470.method969(arg2 * 4 + local64 + 48, local493 + (48 - -((-local461.anInt3279 + -arg1 + 104) * 4)));
				}
			} else if (local30 == 9) {
				local57 = 15658734;
				if (local6 > 0L) {
					local57 = 15597568;
				}
				@Pc(534) int[] local534 = Static96.anIntArray137;
				local493 = (103 - arg1) * 4 * 512 + arg2 * 4 + 24624;
				if (local23 == 0 || local23 == 2) {
					local534[local493 + 1536] = local57;
					local534[local493 + 1025] = local57;
					local534[local493 + 2 + 512] = local57;
					local534[local493 + 3] = local57;
				} else {
					local534[local493] = local57;
					local534[local493 + 513] = local57;
					local534[local493 + 2 + 1024] = local57;
					local534[local493 + 1536 + 3] = local57;
				}
			}
		}
		local6 = Static224.method3674(arg0, arg2, arg1);
		if (local6 == 0L) {
			return;
		}
		local23 = Integer.MAX_VALUE & (int) (local6 >>> 32);
		@Pc(633) Class82 local633 = Static9.method132(local23);
		if (local633.anInt3297 == -1) {
			return;
		}
		@Pc(643) Class41_Sub1 local643 = Static187.aClass41_Sub1Array2[local633.anInt3297];
		if (local643 != null) {
			@Pc(656) int local656 = (local633.anInt3258 * 4 - local643.anInt1294) / 2;
			local57 = (local633.anInt3279 * 4 - local643.anInt1298) / 2;
			local643.method969(local656 + arg2 * 4 + 48, 48 - -((-arg1 + 104 + -local633.anInt3279) * 4) - -local57);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ia;BZ)V")
	public static void method3502(@OriginalArg(0) Class51 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(22) int local22 = Static52.aClass1_Sub2_Sub11_1.method2024(arg0, 250);
		@Pc(34) int local34 = Static52.aClass1_Sub2_Sub11_1.method2029(arg0, 250) * 13;
		Static96.method1623(6, 6, local22 + 4 + 4, local34 + 4 + 4, 0);
		Static96.method1633(6, 6, local22 + 4 + 4, 4 + 4 + local34, 16777215);
		Static52.aClass1_Sub2_Sub11_1.method2023(arg0, 10, 10, local22, local34, 16777215, -1, 1, 1, 0);
		Static221.method3642(6, local22 + 4 + 4, 4 + 4 + local34, 6);
		if (!arg1) {
			Static178.method3025(local22, 10, 10, local34);
			return;
		}
		try {
			@Pc(120) Graphics local120 = Static36.aCanvas1.getGraphics();
			Static210.aClass19_1.method888(local120);
		} catch (@Pc(128) Exception local128) {
			Static36.aCanvas1.repaint();
		}
	}
}
