import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Z")
	public static boolean aBoolean322;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!qa;IIIIILclient!m;)V")
	public static void method3173(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface8 arg5) {
		if (Static430.anInt7475 < 100) {
			Static26.method368(arg0, arg5);
		}
		arg0.pa(arg4, arg1, arg3 + arg4, arg2 + arg1);
		@Pc(36) int local36;
		@Pc(46) int local46;
		if (Static430.anInt7475 < 100) {
			local36 = arg4 + arg3 / 2;
			local46 = arg2 / 2 + arg1 - 18 - 20;
			arg0.NA(arg4, arg1, arg3, arg2, -16777216, 0);
			arg0.method2247(local36 - 152, local46, 304, 34, Static439.aColorArray4[Static25.anInt556].getRGB(), 0);
			arg0.NA(local36 - 150, local46 + 2, Static430.anInt7475 * 3, 30, Static67.aColorArray1[Static25.anInt556].getRGB(), 0);
			Static193.aClass56_3.method5844(-1, local46 + 20, Static298.aColorArray3[Static25.anInt556].getRGB(), local36, Static125.aClass256_49.method5720(Static272.anInt7537));
			return;
		}
		@Pc(110) int local110 = Static67.anInt1777 - (int) ((float) arg3 / Static169.aFloat99);
		local36 = (int) ((float) arg2 / Static169.aFloat99) + Static393.anInt6878;
		local46 = Static67.anInt1777 + (int) ((float) arg3 / Static169.aFloat99);
		Static419.anInt7321 = Static393.anInt6878 - (int) ((float) arg2 / Static169.aFloat99);
		Static44.anInt1163 = (int) ((float) (arg3 * 2) / Static169.aFloat99);
		Static125.anInt2469 = Static67.anInt1777 - (int) ((float) arg3 / Static169.aFloat99);
		Static228.anInt1861 = (int) ((float) (arg2 * 2) / Static169.aFloat99);
		@Pc(169) int local169 = Static393.anInt6878 - (int) ((float) arg2 / Static169.aFloat99);
		Static169.method2541(local110 + Static169.anInt3161, local36 + Static169.anInt3159, Static169.anInt3161 + local46, local169 + Static169.anInt3159, arg4, arg1, arg4 + arg3, arg1 + arg2 - -1);
		Static169.method2561(arg0);
		@Pc(199) Class265 local199 = Static169.method2544(arg0);
		Static429.method5788(arg0, local199);
		if (Static176.anInt3420 > 0) {
			Static303.anInt5385--;
			if (Static303.anInt5385 == 0) {
				Static176.anInt3420--;
				Static303.anInt5385 = 20;
			}
		}
		if (!Static408.aBoolean598) {
			return;
		}
		@Pc(233) int local233 = arg4 + arg3 - 5;
		@Pc(240) int local240 = arg1 + arg2 - 8;
		Static184.aClass56_2.method5853("Fps:" + Static335.anInt1514, local240, local233, 16776960);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(266) int local266 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(268) int local268 = 16776960;
		if (local266 > 65536) {
			local268 = 16711680;
		}
		Static184.aClass56_2.method5853("Mem:" + local266 + "k", local255, local233, local268);
		local240 = local255 - 15;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method3174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3175(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
