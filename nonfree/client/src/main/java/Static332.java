import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!st", name = "w", descriptor = "Lclient!dq;")
	public static Class53 aClass53_5;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "I")
	public static int anInt5811 = -1;

	@OriginalMember(owner = "client!st", name = "l", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_203 = new Class221("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!st", name = "r", descriptor = "I")
	public static int anInt5818 = 0;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "[I")
	public static final int[] anIntArray707 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!st", name = "t", descriptor = "I")
	public static int anInt5819 = 0;

	@OriginalMember(owner = "client!st", name = "x", descriptor = "I")
	public static int anInt5822 = 0;

	@OriginalMember(owner = "client!st", name = "y", descriptor = "I")
	public static int anInt5823 = 0;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V")
	public static void method5085() {
		Static388.anIntArray496 = null;
		Static371.aBoolean486 = false;
		Static120.aClipboard1 = null;
		Static104.aBooleanArray45 = null;
		Static166.anIntArray331 = null;
		Static165.anIntArray330 = null;
		Static303.method4753();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!es;)V")
	public static void method5086(@OriginalArg(1) Class12_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class12_Sub1_Sub2_Sub1) {
			@Pc(29) Class12_Sub1_Sub2_Sub1 local29 = (Class12_Sub1_Sub2_Sub1) arg0;
			if (local29.aClass240_1 != null) {
				Static101.method1815(local29, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 != local29.aByte74);
			}
		} else if (arg0 instanceof Class12_Sub1_Sub2_Sub2) {
			@Pc(13) Class12_Sub1_Sub2_Sub2 local13 = (Class12_Sub1_Sub2_Sub2) arg0;
			Static264.method4094(local13.aByte74 != Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, local13);
		}
	}
}
