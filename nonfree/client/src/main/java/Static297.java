import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	public static int anInt5115;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "[I")
	public static int[] anIntArray394 = new int[1];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
	public static void method4156() {
		@Pc(5) Class222 local5 = Static40.aClass222_2;
		synchronized (Static40.aClass222_2) {
			Static40.aClass222_2.method4433(5);
		}
		local5 = Static396.aClass222_42;
		synchronized (Static396.aClass222_42) {
			Static396.aClass222_42.method4433(5);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!vq;ZI)V")
	public static void method4157(@OriginalArg(0) Class8_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(16) int local16 = 0;
		if (arg0.anInt6779 > Static301.anInt5197) {
			Static74.method1239(arg0);
		} else if (arg0.anInt6810 >= Static301.anInt5197) {
			Static147.method2162(arg0);
		} else {
			Static243.method3636(false, arg0);
			local7 = Static580.anInt9539;
			local16 = Static380.anInt6324;
		}
		if (arg0.anInt9365 < 512 || arg0.anInt9370 < 512 || arg0.anInt9365 >= (Static71.anInt1410 - 1) * 512 || Static471.anInt8012 * 512 - 512 <= arg0.anInt9370) {
			arg0.anInt6782 = -1;
			local16 = 0;
			arg0.anInt6822 = -1;
			arg0.anInt6810 = 0;
			arg0.anIntArray532 = null;
			local7 = -1;
			arg0.anInt6830 = -1;
			arg0.anInt6779 = 0;
			arg0.anInt9365 = arg0.anIntArray534[0] * 512 + arg0.method5434() * 256;
			arg0.anInt9370 = arg0.anIntArray533[0] * 512 + arg0.method5434() * 256;
			arg0.method5437();
		}
		if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0 && (arg0.anInt9365 < 6144 || arg0.anInt9370 < 6144 || (Static71.anInt1410 - 12) * 512 <= arg0.anInt9365 || (Static471.anInt8012 - 12) * 512 <= arg0.anInt9370)) {
			local16 = 0;
			arg0.anInt6810 = 0;
			arg0.anInt6830 = -1;
			arg0.anInt6782 = -1;
			arg0.anInt6822 = -1;
			arg0.anIntArray532 = null;
			local7 = -1;
			arg0.anInt6779 = 0;
			arg0.anInt9365 = arg0.anIntArray534[0] * 512 + arg0.method5434() * 256;
			arg0.anInt9370 = arg0.anIntArray533[0] * 512 + arg0.method5434() * 256;
			arg0.method5437();
		}
		@Pc(224) int local224 = Static305.method4284(arg0);
		Static561.method7603(local224, local7, arg0, local16);
		Static427.method5931(arg0, local7);
		Static387.method5337(arg0);
	}
}
