import java.applet.Applet;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
	public static long aLong81 = -1L;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!vl;")
	public static final Class371 aClass371_1 = new Class371();

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "[S")
	public static short[] aShortArray30 = new short[256];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!d;BIILclient!ha;II)V")
	public static void method2348(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static677.anInt10890 < 100) {
			Static147.method2739(arg0, arg3);
		}
		arg3.KA(arg1, arg5, arg1 + arg4, arg5 - -arg2);
		@Pc(37) int local37;
		@Pc(49) int local49;
		if (Static677.anInt10890 < 100) {
			local37 = arg4 / 2 + arg1;
			local49 = arg5 + arg2 / 2 - 38;
			arg3.aa(arg1, arg5, arg4, arg2, -16777216, 0);
			arg3.method8511(local37 - 152, local49, 304, 34, Static634.aColorArray3[Static567.anInt5912].getRGB(), 0);
			arg3.aa(local37 - 150, local49 + 2, Static677.anInt10890 * 3, 30, Static13.aColorArray1[Static567.anInt5912].getRGB(), 0);
			Static303.aClass69_6.method8858(local37, -1, Static535.aColorArray2[Static567.anInt5912].getRGB(), Static601.aClass346_20.method8440(Static609.anInt9834), local49 + 20);
			return;
		}
		@Pc(113) int local113 = Static361.anInt5827 - (int) ((float) arg4 / Static317.aFloat114);
		local37 = Static90.anInt10121 + (int) ((float) arg2 / Static317.aFloat114);
		local49 = (int) ((float) arg4 / Static317.aFloat114) + Static361.anInt5827;
		Static64.anInt1275 = (int) ((float) (arg4 * 2) / Static317.aFloat114);
		@Pc(146) int local146 = Static90.anInt10121 - (int) ((float) arg2 / Static317.aFloat114);
		Static329.anInt5476 = Static361.anInt5827 - (int) ((float) arg4 / Static317.aFloat114);
		Static186.anInt3784 = Static90.anInt10121 - (int) ((float) arg2 / Static317.aFloat114);
		Static412.anInt6583 = (int) ((float) (arg2 * 2) / Static317.aFloat114);
		Static317.method4958(local113 + Static317.anInt5409, local37 - -Static317.anInt5403, local49 + Static317.anInt5409, local146 - -Static317.anInt5403, arg1, arg5, arg4 + arg1, arg2 + arg5 + 1);
		Static317.method4940(arg3);
		@Pc(209) Class338 local209 = Static317.method4952(arg3);
		Static156.method2843(local209, arg3);
		if (Static122.anInt2525 > 0) {
			Static43.anInt1024--;
			if (Static43.anInt1024 == 0) {
				Static43.anInt1024 = 20;
				Static122.anInt2525--;
			}
		}
		if (!Static261.aBoolean343) {
			return;
		}
		@Pc(244) int local244 = arg1 + arg4 - 5;
		@Pc(251) int local251 = arg5 + arg2 - 8;
		Static504.aClass69_11.method8847(16776960, "Fps:" + Static403.anInt6411, -1, local244, local251);
		@Pc(266) int local266 = local251 - 15;
		@Pc(268) Runtime local268 = Runtime.getRuntime();
		@Pc(278) int local278 = (int) ((local268.totalMemory() - local268.freeMemory()) / 1024L);
		@Pc(280) int local280 = 16776960;
		if (local278 > 65536) {
			local280 = 16711680;
		}
		Static504.aClass69_11.method8847(local280, "Mem:" + local278 + "k", -1, local244, local266);
		local251 = local266 - 15;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method2350(@OriginalArg(1) int arg0) {
		if (Static24.aClass3_Sub22_4.aClass6_Sub20_1.method6799() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static203.anInt3983) {
			return;
		}
		if (arg0 != -1) {
			@Pc(33) Class290 local33 = Static634.aClass253_2.method6180(arg0);
			@Pc(37) Class97 local37 = local33.method7122();
			if (local37 == null) {
				arg0 = -1;
			} else {
				Static247.aClass291_1.method7142(local37.method2742(), local37.method2748(), local37.method2740(), Static126.aCanvas6, new Point(local33.anInt8153, local33.anInt8147));
				Static203.anInt3983 = arg0;
			}
		}
		if (arg0 == -1 && Static203.anInt3983 != -1) {
			Static247.aClass291_1.method7142(-1, (int[]) null, -1, Static126.aCanvas6, new Point());
			Static203.anInt3983 = -1;
		}
	}
}
