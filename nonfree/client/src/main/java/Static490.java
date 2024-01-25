import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!pl;")
	public static Class259 aClass259_153;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	public static final int anInt8277 = 1403;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!kp;III)V")
	public static void method6855(@OriginalArg(0) Class196 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static25.aBoolean32) {
			@Pc(14) Class352 local14 = Static371.anInt6556 == -1 ? null : Static241.aClass82_1.method1498(Static371.anInt6556);
			if (Static67.method1102(arg0).method5419() && (Static242.anInt4524 & 0x20) != 0 && (local14 == null || arg0.method4249(local14.anInt9310, Static371.anInt6556) != local14.anInt9310)) {
				Static304.method4554(arg0.anInt5154, false, arg0.anInt5112, arg0.anInt5152, true, Static540.anInt8826, 0L, Static12.aString4 + " -> " + arg0.aString41, 45, Static271.aString38);
			}
		}
		@Pc(81) String local81;
		for (@Pc(74) int local74 = 9; local74 >= 5; local74--) {
			local81 = Static424.method6100(local74, arg0);
			if (local81 != null) {
				Static304.method4554(arg0.anInt5154, false, arg0.anInt5112, arg0.anInt5152, true, Static112.method1676(arg0, local74), (long) (local74 + 1), arg0.aString41, 1011, local81);
			}
		}
		local81 = Static509.method7072(arg0);
		if (local81 != null) {
			Static304.method4554(arg0.anInt5154, false, arg0.anInt5112, arg0.anInt5152, true, arg0.anInt5077, 0L, arg0.aString41, 57, local81);
		}
		for (@Pc(150) int local150 = 4; local150 >= 0; local150--) {
			@Pc(157) String local157 = Static424.method6100(local150, arg0);
			if (local157 != null) {
				Static304.method4554(arg0.anInt5154, false, arg0.anInt5112, arg0.anInt5152, true, Static112.method1676(arg0, local150), (long) (local150 + 1), arg0.aString41, 60, local157);
			}
		}
		if (!Static67.method1102(arg0).method5424()) {
			return;
		}
		if (arg0.aString43 == null) {
			Static304.method4554(arg0.anInt5154, false, arg0.anInt5112, arg0.anInt5152, true, -1, 0L, "", 50, Static290.aClass198_11.method4365(Static52.anInt1264));
		} else {
			Static304.method4554(arg0.anInt5154, false, arg0.anInt5112, arg0.anInt5152, true, -1, 0L, "", 50, arg0.aString43);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z")
	public static boolean method6858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!pk;)Z")
	public static boolean method6859(@OriginalArg(1) Class258 arg0) {
		return arg0 == Static212.aClass258_4 || arg0 == Static99.aClass258_1 || arg0 == Static158.aClass258_2 || arg0 == Static282.aClass258_5;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method6860(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static356.aClass100_8 = arg0;
		Static427.anInt7297 = arg1;
		Static293.aBoolean419 = Static427.anInt7297 > 1 && Static356.aClass100_8.method6196();
		Static134.anInt2822 = 9;
		Static33.anInt857 = 0x1 << Static134.anInt2822;
		Static81.anInt1767 = Static33.anInt857 >> 1;
		Math.sqrt((double) (Static81.anInt1767 * Static81.anInt1767 + Static81.anInt1767 * Static81.anInt1767));
		Static89.anInt8689 = 4;
		Static496.anInt8369 = arg2;
		Static357.anInt6390 = arg3;
		Static74.anInt1648 = arg4;
		Static580.aClass241_1 = Static99.method1497();
		Static192.method3654();
		Static593.aClass346ArrayArrayArray3 = new Class346[4][Static496.anInt8369][Static357.anInt6390];
		Static569.aClass67Array8 = new Class67[4];
		if (arg5) {
			Static381.anIntArrayArray44 = new int[Static496.anInt8369][Static357.anInt6390];
			Static435.aByteArrayArray2 = new byte[Static496.anInt8369][Static357.anInt6390];
			Static544.aShortArrayArray33 = new short[Static496.anInt8369][Static357.anInt6390];
			Static142.aClass346ArrayArrayArray1 = new Class346[1][Static496.anInt8369][Static357.anInt6390];
			Static592.aClass67Array4 = new Class67[1];
		} else {
			Static381.anIntArrayArray44 = null;
			Static435.aByteArrayArray2 = null;
			Static544.aShortArrayArray33 = null;
			Static142.aClass346ArrayArrayArray1 = null;
			Static592.aClass67Array4 = null;
		}
		if (arg6) {
			Static501.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static237.aClass265Array2 = new Class265[65535];
			Static237.aBooleanArray34 = new boolean[65535];
			Static441.anInt7764 = 0;
		} else {
			Static501.aLongArrayArrayArray1 = null;
			Static237.aClass265Array2 = null;
			Static237.aBooleanArray34 = null;
			Static441.anInt7764 = 0;
		}
		Static225.method3525(false);
		Static3.aClass6_Sub1ArrayArray1 = new Class6_Sub1[2][];
		Static3.aClass6_Sub1ArrayArray1[0] = new Class6_Sub1[Static381.anIntArray483[0]];
		Static3.aClass6_Sub1ArrayArray1[1] = new Class6_Sub1[Static381.anIntArray483[1]];
		Static26.anIntArray39 = new int[2];
		Static312.aClass6_Sub1ArrayArray3 = new Class6_Sub1[2][];
		Static312.aClass6_Sub1ArrayArray3[0] = new Class6_Sub1[Static367.anIntArray449[0]];
		Static312.aClass6_Sub1ArrayArray3[1] = new Class6_Sub1[Static367.anIntArray449[1]];
		Static142.anIntArray179 = new int[2];
		Static54.aClass6_Sub1ArrayArray2 = new Class6_Sub1[2][];
		Static54.aClass6_Sub1ArrayArray2[0] = new Class6_Sub1[Static83.anIntArray94[0]];
		Static54.aClass6_Sub1ArrayArray2[1] = new Class6_Sub1[Static83.anIntArray94[1]];
		Static53.anIntArray64 = new int[2];
		Static208.aClass6_Sub1Array1 = new Class6_Sub1[10000];
		Static223.anInt4187 = 0;
		Static546.aClass6_Sub1Array2 = new Class6_Sub1[5000];
		Static524.anInt8650 = 0;
		Static497.aClass6_Sub1_Sub1Array1 = new Class6_Sub1_Sub1[5000];
		Static2.anInt11 = 0;
		Static557.aBooleanArrayArray9 = new boolean[Static74.anInt1648 + Static74.anInt1648 + 1][Static74.anInt1648 + Static74.anInt1648 + 1];
		Static282.aBooleanArrayArray4 = new boolean[Static74.anInt1648 + Static74.anInt1648 + 2][Static74.anInt1648 + Static74.anInt1648 + 2];
		if (Static293.aBoolean419) {
			Static430.aBooleanArrayArrayArray2 = new boolean[4][Static74.anInt1648 + Static74.anInt1648 + 1][Static74.anInt1648 + Static74.anInt1648 + 1];
			Static277.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static563.aClass356Array1 != null) {
				Static380.method5627();
			}
			Static563.aClass356Array1 = new Class356[Static427.anInt7297];
			Static356.aClass100_8.method6249(Static563.aClass356Array1.length + 1);
			Static356.aClass100_8.method6244(0);
			for (@Pc(247) int local247 = 0; local247 < Static563.aClass356Array1.length; local247++) {
				Static563.aClass356Array1[local247] = new Class356(local247 + 1, Static356.aClass100_8);
				(new Thread(Static563.aClass356Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static427.anInt7297 == 2) {
				local282 = 4;
				Static285.anInt6371 = 2;
			} else if (Static427.anInt7297 == 3) {
				local282 = 6;
				Static285.anInt6371 = 3;
			} else {
				local282 = 8;
				Static285.anInt6371 = 4;
			}
			Static140.aClass72Array1 = new Class72[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static140.aClass72Array1[local302] = new Class72(Static314.aStringArrayArray20[Static427.anInt7297 - 2][local302]);
			}
		} else {
			Static285.anInt6371 = 1;
		}
		Static509.anIntArray604 = new int[Static285.anInt6371 - 1];
		Static148.anIntArray183 = new int[Static285.anInt6371 - 1];
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!r;IBIILclient!fa;)V")
	public static void method6861(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface5 arg5) {
		if (Static499.anInt8380 < 100) {
			Static183.method3149(arg5, arg1);
		}
		arg1.da(arg2, arg0, arg2 + arg4, arg3 + arg0);
		@Pc(37) int local37;
		@Pc(48) int local48;
		if (Static499.anInt8380 < 100) {
			local37 = arg2 + arg4 / 2;
			local48 = arg3 / 2 + arg0 - 20 - 18;
			arg1.J(arg2, arg0, arg4, arg3, -16777216, 0);
			arg1.method6212(local37 - 152, local48, 304, 34, Static144.aColorArray1[Static259.anInt4808].getRGB(), 0);
			arg1.J(local37 - 150, local48 - -2, Static499.anInt8380 * 3, 30, Static394.aColorArray3[Static259.anInt4808].getRGB(), 0);
			Static419.aClass29_13.method7118(Static530.aColorArray4[Static259.anInt4808].getRGB(), local37, -1, local48 + 20, Static290.aClass198_20.method4365(Static52.anInt1264));
			return;
		}
		@Pc(112) int local112 = Static549.anInt8926 - (int) ((float) arg4 / Static270.aFloat47);
		local37 = (int) ((float) arg3 / Static270.aFloat47) + Static75.anInt1651;
		local48 = (int) ((float) arg4 / Static270.aFloat47) + Static549.anInt8926;
		Static87.anInt1840 = (int) ((float) (arg3 * 2) / Static270.aFloat47);
		Static532.anInt8741 = (int) ((float) (arg4 * 2) / Static270.aFloat47);
		Static81.anInt1760 = Static75.anInt1651 - (int) ((float) arg3 / Static270.aFloat47);
		Static196.anInt3902 = Static549.anInt8926 - (int) ((float) arg4 / Static270.aFloat47);
		@Pc(170) int local170 = Static75.anInt1651 - (int) ((float) arg3 / Static270.aFloat47);
		Static270.method1323(Static270.anInt1801 + local112, Static270.anInt1800 + local37, Static270.anInt1801 + local48, Static270.anInt1800 + local170, arg2, arg0, arg4 + arg2, arg0 + arg3 - -1);
		Static270.method1309(arg1);
		@Pc(198) Class8 local198 = Static270.method1320(arg1);
		Static494.method6895(arg1, local198);
		if (Static356.anInt6365 > 0) {
			Static485.anInt8224--;
			if (Static485.anInt8224 == 0) {
				Static356.anInt6365--;
				Static485.anInt8224 = 20;
			}
		}
		if (!Static489.aBoolean647) {
			return;
		}
		@Pc(226) int local226 = arg4 + arg2 - 5;
		@Pc(233) int local233 = arg0 + arg3 - 8;
		Static412.aClass29_2.method7117(local226, local233, "Fps:" + Static156.anInt8495, 16776960, -1);
		@Pc(248) int local248 = local233 - 15;
		@Pc(250) Runtime local250 = Runtime.getRuntime();
		@Pc(259) int local259 = (int) ((local250.totalMemory() - local250.freeMemory()) / 1024L);
		@Pc(261) int local261 = 16776960;
		if (local259 > 65536) {
			local261 = 16711680;
		}
		Static412.aClass29_2.method7117(local226, local248, "Mem:" + local259 + "k", local261, -1);
		local233 = local248 - 15;
	}
}
