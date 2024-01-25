import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public static int anInt6409;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_22 = new Class222(32);

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method5398() {
		Static246.anInt9828 = (int) ((double) Static3.anInt46 * 34.46D);
		Static579.anInt9538 = 200;
		Static246.anInt9828 <<= 0x2;
		if (Static600.aClass87_15.method7915()) {
			Static246.anInt9828 += 512;
		}
		Static271.method4375(false);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Lclient!qn;")
	public static Class11_Sub1_Sub5 method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub1_Sub5 local14 = local7.aClass11_Sub1_Sub5_1;
			local7.aClass11_Sub1_Sub5_1 = null;
			Static395.method2904(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
	public static void method5400(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		Static329.method8196();
		Static425.method4452();
		Static619.method8429();
		Static596.method8206(arg0, arg2, arg1);
		Static613.method1306();
		Static74.method1386(Static600.aClass87_15);
		Static411.method6321(Static600.aClass87_15);
		Static183.method3304(Static594.aClass97_144, Static600.aClass87_15);
		Static153.method2912();
		Static107.method1806(Static539.aClass20Array13);
		Static539.method7534();
		Static53.method1014();
		if (Static538.anInt8985 == 3) {
			Static51.method997(4);
		} else if (Static538.anInt8985 == 7) {
			Static51.method997(8);
		} else if (Static538.anInt8985 == 10) {
			Static51.method997(11);
		} else if (Static538.anInt8985 == 1 || Static538.anInt8985 == 2) {
			Static284.method8369();
		}
	}
}
