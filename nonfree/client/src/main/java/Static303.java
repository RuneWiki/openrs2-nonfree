import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public static int anInt6098;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	public static int anInt6100;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_49 = new Class344(57, 5);

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	public static void method4804() {
		@Pc(5) int local5 = 0;
		if (Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614)) {
			local5 = 55;
		}
		if (!Static455.aClass4_Sub35_Sub1_1.aBoolean675) {
			local5 |= 0x40;
		}
		Static208.method3406(local5);
		Static103.aClass298_1.method6823(local5);
		Static338.aClass29_1.method984(local5);
		Class21_Sub1_Sub2_Sub1.lb.method4990(local5);
		Static342.aClass132_2.method2955(local5);
		Static460.method6764(local5);
		Static384.method5949(local5);
		Static384.method5952(local5);
		Static29.method963(local5);
		Static472.method6892();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	public static void method4805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 * Static455.aClass4_Sub35_Sub1_1.anInt9926 >> 8;
		if (arg2 == -1 && !Static421.aBoolean581) {
			Static404.method6138();
		} else if (arg2 != -1 && (Static269.anInt5657 != arg2 || !Static578.method8124()) && local15 != 0 && !Static421.aBoolean581) {
			Static588.method8212(arg0, local15, arg2, Static326.aClass348_69);
			Static159.method2601();
		}
		if (arg2 != Static269.anInt5657) {
			Static565.aClass4_Sub21_Sub4_5 = null;
		}
		Static269.anInt5657 = arg2;
	}
}
