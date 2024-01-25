import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_9 = new Class201("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[6][];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public static int anInt8130 = 0;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt8132 = 0;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!el;")
	public static final Class109 aClass109_171 = new Class109(99, 6);

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public static void method6997(@OriginalArg(0) byte arg0) {
		Static452.anInt7483 = 0;
		@Pc(11) int local11 = Static515.aClass5_Sub23_Sub2_1.method8505();
		@Pc(15) int local15 = Static515.aClass5_Sub23_Sub2_1.method8518();
		@Pc(19) int local19 = Static515.aClass5_Sub23_Sub2_1.method8518();
		@Pc(31) boolean local31 = Static515.aClass5_Sub23_Sub2_1.method8529() == 1;
		Static523.method7573();
		Static518.method7510(local11);
		@Pc(44) int local44 = (Static327.anInt5853 - Static515.aClass5_Sub23_Sub2_1.anInt9869) / 16;
		Static261.anIntArrayArray30 = new int[local44][4];
		@Pc(56) int local56;
		for (@Pc(50) int local50 = 0; local50 < local44; local50++) {
			for (local56 = 0; local56 < 4; local56++) {
				Static261.anIntArrayArray30[local50][local56] = Static515.aClass5_Sub23_Sub2_1.method8527();
			}
		}
		Static411.aByteArrayArray21 = new byte[local44][];
		Static379.anIntArray374 = new int[local44];
		Static672.anIntArray621 = new int[local44];
		if (arg0 >= -44) {
			method6997((byte) -20);
		}
		Static444.aByteArrayArray23 = new byte[local44][];
		Static401.anIntArray398 = new int[local44];
		Static13.anIntArray18 = new int[local44];
		Static293.anIntArray287 = null;
		Static494.aByteArrayArray27 = null;
		Static445.aByteArrayArray24 = new byte[local44][];
		Static617.anIntArray562 = new int[local44];
		Static319.aByteArrayArray13 = new byte[local44][];
		local44 = 0;
		for (local56 = (local19 - (Static544.anInt9261 >> 4)) / 8; local56 <= (local19 + (Static544.anInt9261 >> 4)) / 8; local56++) {
			for (@Pc(147) int local147 = (local15 - (Static282.anInt4887 >> 4)) / 8; local147 <= ((Static282.anInt4887 >> 4) + local15) / 8; local147++) {
				Static672.anIntArray621[local44] = local147 + (local56 << 8);
				Static13.anIntArray18[local44] = Static609.aClass208_137.method4986("m" + local56 + "_" + local147, -128);
				Static617.anIntArray562[local44] = Static609.aClass208_137.method4986("l" + local56 + "_" + local147, 32);
				Static401.anIntArray398[local44] = Static609.aClass208_137.method4986("um" + local56 + "_" + local147, 111);
				Static379.anIntArray374[local44] = Static609.aClass208_137.method4986("ul" + local56 + "_" + local147, -103);
				local44++;
			}
		}
		Static286.method4303(local15, local31, 11, local19);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22;
		if (Static596.method8616(arg5)) {
			local22 = 0;
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static40.aBoolean61) {
				local22 = Static471.anInt7983;
				local47 = Static297.anInt5142;
				local51 = Static395.anInt6759;
				local45 = Static243.anInt4196;
				local49 = Static34.anInt621;
				Static395.anInt6759 = 1;
			}
			if (Static175.aClass73ArrayArray1[arg5] == null) {
				Static243.method3598(Static489.aClass73ArrayArray2[arg5], arg2, arg3, arg7, arg6, -1, ~arg6 > -1, arg0, arg1, arg4);
			} else {
				Static243.method3598(Static175.aClass73ArrayArray1[arg5], arg2, arg3, arg7, arg6, -1, arg6 < 0, arg0, arg1, arg4);
			}
			if (Static40.aBoolean61) {
				if (arg6 >= 0 && Static395.anInt6759 == 2) {
					Static82.method9318(Static34.anInt621, Static243.anInt4196, Static297.anInt5142, Static471.anInt7983);
				}
				Static395.anInt6759 = local51;
				Static297.anInt5142 = local47;
				Static243.anInt4196 = local45;
				Static471.anInt7983 = local22;
				Static34.anInt621 = local49;
			}
		} else if (arg6 == -1) {
			for (local22 = 0; local22 < 100; local22++) {
				Static386.aBooleanArray13[local22] = true;
			}
		} else {
			Static386.aBooleanArray13[arg6] = true;
		}
	}
}
