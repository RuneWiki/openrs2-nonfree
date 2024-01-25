import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "Lclient!bu;")
	public static Class32 aClass32_75;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!ku;")
	public static final Class138 aClass138_5 = new Class138();

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	public static int anInt5834 = 0;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_187 = new Class189("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 128 || arg3 < 128 || arg5 > (Static40.anInt1089 - 2) * 128 || arg3 > (Static44.anInt7276 - 2) * 128) {
			Static196.anIntArray248[0] = Static196.anIntArray248[1] = -1;
			return;
		}
		@Pc(43) int local43 = Static231.method3482(arg1, arg5, arg3) - arg2;
		Static303.aClass107_4.ZA(arg6, 0, 0);
		Static121.aClass172_3.m(Static303.aClass107_4);
		Static121.aClass172_3.ia(arg5, local43, arg3, Static196.anIntArray248);
		Static303.aClass107_4.ZA(-arg6, 0, 0);
		Static121.aClass172_3.m(Static303.aClass107_4);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!mq;IBI)V")
	public static void method4557(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte90 == 0) {
			arg0.anInt4800 = arg0.anInt4869;
		} else if (arg0.aByte90 == 1) {
			arg0.anInt4800 = (arg1 - arg0.anInt4853) / 2 + arg0.anInt4869;
		} else if (arg0.aByte90 == 2) {
			arg0.anInt4800 = arg1 - arg0.anInt4869 - arg0.anInt4853;
		} else if (arg0.aByte90 == 3) {
			arg0.anInt4800 = arg1 * arg0.anInt4869 >> 14;
		} else if (arg0.aByte90 == 4) {
			arg0.anInt4800 = (arg0.anInt4869 * arg1 >> 14) + (arg1 - arg0.anInt4853) / 2;
		} else {
			arg0.anInt4800 = arg1 - arg0.anInt4853 - (arg0.anInt4869 * arg1 >> 14);
		}
		if (arg0.aByte89 == 0) {
			arg0.anInt4806 = arg0.anInt4837;
		} else if (arg0.aByte89 == 1) {
			arg0.anInt4806 = (arg2 - arg0.anInt4823) / 2 + arg0.anInt4837;
		} else if (arg0.aByte89 == 2) {
			arg0.anInt4806 = arg2 - arg0.anInt4837 - arg0.anInt4823;
		} else if (arg0.aByte89 == 3) {
			arg0.anInt4806 = arg2 * arg0.anInt4837 >> 14;
		} else if (arg0.aByte89 == 4) {
			arg0.anInt4806 = (arg2 - arg0.anInt4823) / 2 + (arg2 * arg0.anInt4837 >> 14);
		} else {
			arg0.anInt4806 = arg2 - (arg0.anInt4837 * arg2 >> 14) - arg0.anInt4823;
		}
		if (!Static63.aBoolean138 || Static53.method1118(arg0).anInt7660 == 0 && arg0.anInt4792 != 0) {
			return;
		}
		if (arg0.anInt4806 < 0) {
			arg0.anInt4806 = 0;
		} else if (arg2 < arg0.anInt4806 + arg0.anInt4823) {
			arg0.anInt4806 = arg2 - arg0.anInt4823;
		}
		if (arg0.anInt4800 < 0) {
			arg0.anInt4800 = 0;
		} else if (arg0.anInt4853 + arg0.anInt4800 > arg1) {
			arg0.anInt4800 = arg1 - arg0.anInt4853;
		}
	}
}
