import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
	public static int anInt3390;

	@OriginalMember(owner = "client!hr", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!hr", name = "J", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(JI)V")
	public static void method2934(@OriginalArg(0) long arg0) {
		Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
		Static218.aClass6_Sub14_Sub2_1.method6035(Static184.aClass14_8.anInt222);
		Static218.aClass6_Sub14_Sub2_1.method6007(arg0);
		Static218.aClass6_Sub14_Sub2_1.method6035(Static470.anInt7957);
		Static225.anInt3804 = 0;
		Static102.anInt1886 = -3;
		Static215.anInt3681 = 0;
		Static154.anInt2734 = 1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
	public static void method2935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static284.anIntArrayArray56 != null) {
			Static284.anIntArrayArray56[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static24.aShortArrayArray11 != null) {
			Static24.aShortArrayArray11[arg0][arg1] = (short) arg3;
		}
		if (Static151.aByteArrayArray8 != null) {
			Static151.aByteArrayArray8[arg0][arg1] = (byte) arg4;
		}
	}
}
