import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!e", name = "D", descriptor = "[Lclient!ak;")
	public static Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "[Lclient!kk;")
	public static Class81_Sub2[] aClass81_Sub2Array1;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
	public static int anInt1142;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	public static int anInt1138 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method965(@OriginalArg(0) String arg0) {
		if (Static279.aClass187Array1 != null) {
			Static215.aClass3_Sub26_Sub1_2.method3958(171);
			Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0));
			Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public static void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static83.anInt1554 == 1) {
			Static209.aClass3_Sub4_Sub12Array12[Static57.anInt1081 / 100].method4697(Static313.anInt6126 - 8, Static54.anInt1012 + -8);
		}
		if (Static83.anInt1554 == 2) {
			Static209.aClass3_Sub4_Sub12Array12[Static57.anInt1081 / 100 + 4].method4697(Static313.anInt6126 - 8, Static54.anInt1012 - 8);
		}
		Static309.method4968();
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
	public static int method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
