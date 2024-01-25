import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "Lclient!q;")
	public static Class134 aClass134_5;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!bi;III)Lclient!o;")
	public static Class4_Sub7_Sub13 method3602(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class4_Sub9 local19 = new Class4_Sub9(arg0.method667(arg2, arg1));
		@Pc(50) Class4_Sub7_Sub13 local50 = new Class4_Sub7_Sub13(arg1, local19.method6010(), local19.method6010(), local19.method6026(), local19.method6026(), local19.method6015() == 1, local19.method6015(), local19.method6015());
		@Pc(54) int local54 = local19.method6015();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass124_41.method3275(new Class4_Sub27(local19.method6015(), local19.method5982(), local19.method5982(), local19.method5982(), local19.method5982(), local19.method5982(), local19.method5982(), local19.method5982(), local19.method5982()));
		}
		local50.method5523();
		return local50;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBLclient!oa;IILclient!e;I)V")
	public static void method3603(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5) {
		if (Static355.anInt6196 < 100) {
			Static281.method4445(arg1, arg4);
		}
		arg1.ca(arg2, arg3, arg2 + arg0, arg3 + arg5);
		@Pc(34) int local34;
		@Pc(46) int local46;
		if (Static355.anInt6196 < 100) {
			local34 = arg2 + arg0 / 2;
			local46 = arg3 + arg5 / 2 - 18 - 20;
			arg1.C(arg2, arg3, arg0, arg5, -16777216, 0);
			arg1.method6786(local34 - 152, local46, 304, 34, Static17.aColorArray1[Static509.anInt8774].getRGB(), 0);
			arg1.C(local34 - 150, local46 - -2, Static355.anInt6196 * 3, 30, Static92.aColorArray2[Static509.anInt8774].getRGB(), 0);
			Static65.aClass91_4.method7467(Static275.aClass198_17.method4407(Static56.anInt953), local34, local46 + 20, Static317.aColorArray3[Static509.anInt8774].getRGB(), -1);
			return;
		}
		@Pc(110) int local110 = Static397.anInt6936 - (int) ((float) arg0 / Static392.aFloat188);
		local34 = (int) ((float) arg5 / Static392.aFloat188) + Static470.anInt7923;
		local46 = Static397.anInt6936 + (int) ((float) arg0 / Static392.aFloat188);
		@Pc(136) int local136 = Static470.anInt7923 - (int) ((float) arg5 / Static392.aFloat188);
		Static357.anInt6211 = (int) ((float) (arg5 * 2) / Static392.aFloat188);
		Static190.anInt3972 = Static397.anInt6936 - (int) ((float) arg0 / Static392.aFloat188);
		Static233.anInt4743 = Static470.anInt7923 - (int) ((float) arg5 / Static392.aFloat188);
		Static38.anInt742 = (int) ((float) (arg0 * 2) / Static392.aFloat188);
		Static392.method7230(Static392.anInt8797 + local110, local34 + Static392.anInt8804, Static392.anInt8797 + local46, Static392.anInt8804 + local136, arg2, arg3, arg0 + arg2, arg3 + 1 + arg5);
		Static392.method7232(arg1);
		@Pc(196) Class124 local196 = Static392.method7235(arg1);
		Static513.method7254(local196, arg1);
		if (Static162.anInt3559 > 0) {
			Static391.anInt6853--;
			if (Static391.anInt6853 == 0) {
				Static162.anInt3559--;
				Static391.anInt6853 = 20;
			}
		}
		if (!Static596.aBoolean689) {
			return;
		}
		@Pc(229) int local229 = arg0 + arg2 - 5;
		@Pc(235) int local235 = arg3 + arg5 - 8;
		Static375.aClass91_7.method7456(local229, "Fps:" + Static317.anInt5705, local235, 16776960);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(261) int local261 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(263) int local263 = 16776960;
		if (local261 > 65536) {
			local263 = 16711680;
		}
		Static375.aClass91_7.method7456(local229, "Mem:" + local261 + "k", local250, local263);
		local235 = local250 - 15;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
	public static void method3605(@OriginalArg(1) int arg0) {
		Static528.anInt8991 = arg0;
		Static401.aClass223_47.method4932();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)I")
	public static int method3607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}
}
