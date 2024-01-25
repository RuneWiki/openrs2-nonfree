import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static560 {

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "Lclient!eda;")
	public static Class85_Sub1 aClass85_Sub1_2;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static int anInt9394;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "Lclient!ce;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	public static int anInt9393 = 0;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "[I")
	public static final int[] anIntArray706 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIZI)V")
	public static void method7718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if ((arg3 ? Static189.aClass4_Sub2_Sub1_1.anInt9282 : Static189.aClass4_Sub2_Sub1_1.anInt9298) != 0 && arg4 != 0 && Static406.anInt7043 < 50 && arg2 != -1) {
			Static479.aClass22Array1[Static406.anInt7043++] = new Class22((byte) (arg3 ? 3 : 2), arg2, arg4, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!no;IIII)Lclient!mn;")
	public static Class114_Sub1_Sub1 method7719(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (arg0.aBoolean477 || Static422.method6062(arg1) && Static422.method6062(arg2)) {
			return new Class114_Sub1_Sub1(arg0, 3553, 6408, arg1, arg2);
		} else if (arg0.aBoolean489) {
			return new Class114_Sub1_Sub1(arg0, 34037, 6408, arg1, arg2);
		} else {
			return new Class114_Sub1_Sub1(arg0, 6408, arg1, arg2, Static514.method7261(arg1), Static514.method7261(arg2));
		}
	}
}
