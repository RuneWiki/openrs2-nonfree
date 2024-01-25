import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ko", name = "X", descriptor = "Lclient!dj;")
	public static Class49 aClass49_8;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString287 = "Use";

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
	public static void method5481() {
		Static296.method5397();
		Static212.method3772();
		Static317.method5317();
		Static314.method2478();
		Static179.method3444();
		Static37.method638();
		Static237.method4198();
		Static118.method2408();
		Static162.method3234();
		Static173.method3391();
		Static68.method4018();
		Static129.method2533();
		Static186.method3519();
		Static109.method2199();
		Static6.method121();
		Static137.method2625();
		Static246.method4304();
		Static162.method3240();
		Static147.method2885();
		Static252.method4330();
		Static318.method5321();
		Static14.method248();
		Static16.method283();
		Static132.aClass70_43.method1397(5);
		Static226.aClass70_75.method1397(5);
		Static323.aClass70_102.method1397(5);
		Static133.aClass70_45.method1397(5);
		Static140.aClass70_49.method1397(5);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!dp;)V")
	public static void method5482(@OriginalArg(1) Class53 arg0) {
		Static239.aClass53_160 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
	public static void method5483() {
		Static16.aClass81_1.method2980(((float) Static29.anInt564 * 0.1F + 0.7F) * 1.1523438F);
		Static16.aClass81_1.method2993(Static57.anInt1095, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static16.aClass81_1.method3035(Static158.anInt5619, -1);
		Static16.aClass81_1.method2959(Static316.aClass19_3);
	}

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "(I)Z")
	public static boolean method5485() {
		return Static256.anInt4749 > 0;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(III)V")
	public static void method5486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0];
		@Pc(13) int local13 = Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0];
		if (Static105.anInt1941 == 1) {
			if (!Static343.method5639(false, local8, local13, -2, 1, 0, 1, arg0, 0, arg1)) {
				Static343.method5639(false, local8, local13, -3, 1, 0, 1, arg0, 0, arg1);
			}
		} else if (!Static343.method5639(false, local8, local13, -3, 1, 0, 1, arg0, 0, arg1)) {
			Static343.method5639(false, local8, local13, -2, 1, 0, 1, arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIILclient!mb;Lclient!rn;)V")
	public static void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class132 arg6, @OriginalArg(8) Class74 arg7) {
		@Pc(19) int local19 = arg3 * arg3 + arg5 * arg5;
		if (local19 > arg4) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg6.anInt3507 / 2, arg6.anInt3503 / 2);
		if (local19 <= local33 * local33) {
			Static5.method96(arg6, Static310.aClass40Array39[arg1], arg5, arg0, arg2, arg3, arg7);
			return;
		}
		local33 -= 10;
		@Pc(65) int local65;
		if (Static334.anInt6112 == 4) {
			local65 = (int) Static117.aFloat58 & 0x3FFF;
		} else {
			local65 = (int) Static117.aFloat58 + Static345.anInt6260 & 0x3FFF;
		}
		@Pc(78) int local78 = Class207.anIntArray697[local65];
		@Pc(82) int local82 = Class207.anIntArray698[local65];
		if (Static334.anInt6112 != 4) {
			local82 = local82 * 256 / (Static279.anInt5302 + 256);
			local78 = local78 * 256 / (Static279.anInt5302 + 256);
		}
		@Pc(113) int local113 = arg5 * local82 + local78 * arg3 >> 15;
		@Pc(124) int local124 = local82 * arg3 - local78 * arg5 >> 15;
		@Pc(130) double local130 = Math.atan2((double) local113, (double) local124);
		@Pc(137) int local137 = (int) (Math.sin(local130) * (double) local33);
		@Pc(144) int local144 = (int) ((double) local33 * Math.cos(local130));
		Static168.aClass40Array10[arg1].method5070((float) local137 + (float) arg2 + (float) arg6.anInt3507 / 2.0F, (float) -local144 + (float) arg0 + (float) arg6.anInt3503 / 2.0F, 4096, (int) (-local130 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZZZ)V")
	public static void method5489(@OriginalArg(1) boolean arg0) {
		Static152.anInt2871--;
		if (Static152.anInt2871 == 0) {
			Static158.anIntArray634 = null;
		}
		if (arg0) {
			Static278.anInt5833--;
			if (Static278.anInt5833 == 0) {
				Static305.anIntArray650 = null;
			}
		}
	}
}
