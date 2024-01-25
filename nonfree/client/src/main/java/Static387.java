import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!rv;")
	public static final Class227 aClass227_6 = new Class227(0);

	@OriginalMember(owner = "client!t", name = "r", descriptor = "[I")
	public static final int[] anIntArray460 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	public static int anInt6226 = 1;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void method4979() {
		Static424.aClass117_11.JA(((float) Static126.aClass19_Sub1_1.anInt4238 * 0.1F + 0.7F) * 1.1523438F);
		Static424.aClass117_11.B(Static417.anInt6743, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static424.aClass117_11.Q(Static334.anInt5474, -1, 256);
		Static424.aClass117_11.method5661(Static386.aClass59_46);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIB)I")
	public static int method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static8.anInt126 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg0 - Static430.anInt4140;
		@Pc(23) int local23 = arg1 - Static430.anInt4146;
		for (@Pc(36) Class1_Sub15 local36 = (Class1_Sub15) Static430.aClass14_23.method203(); local36 != null; local36 = (Class1_Sub15) Static430.aClass14_23.method208()) {
			if (arg2 == local36.anInt1847) {
				@Pc(49) int local49 = local36.anInt1843;
				@Pc(52) int local52 = local36.anInt1842;
				@Pc(62) int local62 = Static430.anInt4146 + local52 | local49 + Static430.anInt4140 << 14;
				@Pc(80) int local80 = (local23 - local52) * (-local52 + local23) + (local19 - local49) * (local19 - local49);
				if (local12 < 0 || local80 < local14) {
					local14 = local80;
					local12 = local62;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method4981() {
		Static405.method5211(Static126.aClass19_Sub1_1.anInt4233);
		@Pc(17) int local17 = (Static386.anInt7155 >> 10) + (Static315.anInt5207 >> 3);
		@Pc(25) int local25 = (Static47.anInt676 >> 3) + (Static80.anInt1106 >> 10);
		Static390.anInt6272 = Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 = 0;
		Static94.aClass11_Sub1_Sub3_Sub2_1.method2655(8, 8);
		Static26.anIntArray60 = new int[18];
		Static114.anIntArray155 = new int[18];
		Static457.aByteArrayArray148 = new byte[18][];
		Static161.aByteArrayArray51 = new byte[18][];
		Static172.aByteArrayArray56 = new byte[18][];
		Static438.anIntArrayArray52 = new int[18][4];
		Static401.aByteArrayArray128 = new byte[18][];
		Static292.anIntArray369 = new int[18];
		Static10.anIntArray385 = new int[18];
		Static275.anIntArray353 = new int[18];
		Static106.aByteArrayArray152 = new byte[18][];
		Static334.anIntArray397 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(85) int local85 = (local17 - (Static147.anInt2300 >> 4)) / 8; local85 <= (local17 + (Static147.anInt2300 >> 4)) / 8; local85++) {
			for (local95 = (local25 - (Static293.anInt4886 >> 4)) / 8; local95 <= (local25 + (Static293.anInt4886 >> 4)) / 8; local95++) {
				@Pc(103) int local103 = (local85 << 8) + local95;
				Static334.anIntArray397[local76] = local103;
				Static292.anIntArray369[local76] = Static210.aClass185_119.method4005("m" + local85 + "_" + local95);
				Static26.anIntArray60[local76] = Static210.aClass185_119.method4005("l" + local85 + "_" + local95);
				Static114.anIntArray155[local76] = Static210.aClass185_119.method4005("n" + local85 + "_" + local95);
				Static275.anIntArray353[local76] = Static210.aClass185_119.method4005("um" + local85 + "_" + local95);
				Static10.anIntArray385[local76] = Static210.aClass185_119.method4005("ul" + local85 + "_" + local95);
				if (Static114.anIntArray155[local76] == -1) {
					Static292.anIntArray369[local76] = -1;
					Static26.anIntArray60[local76] = -1;
					Static275.anIntArray353[local76] = -1;
					Static10.anIntArray385[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static114.anIntArray155.length; local95++) {
			Static114.anIntArray155[local95] = -1;
			Static292.anIntArray369[local95] = -1;
			Static26.anIntArray60[local95] = -1;
			Static275.anIntArray353[local95] = -1;
			Static10.anIntArray385[local95] = -1;
		}
		@Pc(279) byte local279;
		if (Static135.anInt2114 == 1 || Static135.anInt2114 == 2) {
			local279 = 3;
		} else {
			local279 = 7;
		}
		Static282.method3774(local279, local17, false, local25);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4982(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (((long) arg0.charAt(local17)) - local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!hm;B)V")
	public static void method4983(@OriginalArg(0) Class107 arg0) {
		@Pc(7) Class107 local7 = Static130.method1647(arg0);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local7 == null) {
			local23 = Static192.anInt3532;
			local20 = Static40.anInt597;
		} else {
			local20 = local7.anInt2606;
			local23 = local7.anInt2648;
		}
		Static48.method650(arg0, local23, false, local20);
		Static100.method1175(arg0, local23, local20);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!wm;)Lclient!lq;")
	public static Class151 method4985(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(14) Class151 local14 = new Class151();
		local14.anInt4386 = arg0.method2896();
		local14.aClass1_Sub3_Sub10_1 = Static187.aClass13_2.method198(local14.anInt4386);
		return local14;
	}
}
