import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
	public static int anInt5438;

	@OriginalMember(owner = "client!qp", name = "N", descriptor = "J")
	public static long aLong166;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[I")
	public static final int[] anIntArray432 = new int[14];

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "Z")
	public static boolean aBoolean386 = true;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "Lclient!ek;")
	public static final Class67 aClass67_29 = new Class67(8);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
	public static void method4393() {
		Static372.method4899(Static413.aClass49_Sub1_1.aBoolean234);
		Static412.aClass4_Sub14_Sub1_3 = new Class4_Sub14_Sub1();
		Static412.aClass4_Sub14_Sub1_3.method1882();
		Static226.aClass53_1 = Static304.method3977(22050, Static24.aClass196_1, Static391.aCanvas5, 0);
		Static226.aClass53_1.method5621(Static412.aClass4_Sub14_Sub1_3);
		Static285.method3723(Static399.aClass211_87, Static412.aClass4_Sub14_Sub1_3, Static10.aClass211_6, Static277.aClass211_67);
		Static413.aClass53_2 = Static304.method3977(2048, Static24.aClass196_1, Static391.aCanvas5, 1);
		Static406.aClass4_Sub14_Sub2_2 = new Class4_Sub14_Sub2();
		Static413.aClass53_2.method5621(Static406.aClass4_Sub14_Sub2_2);
		Static5.aClass17_1 = new Class17(22050, Static145.anInt2577);
		Static232.anInt3970 = Static231.aClass211_62.method4384("scape main");
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4394(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static265.method3494(Static298.method3885(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIB)V")
	public static void method4402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static231.aClass6_7 == Static15.aClass6_1) {
			if (Static344.method4581(-2, false, arg0, 1, arg1, 0, 1, 0)) {
				return;
			}
			Static344.method4581(-3, false, arg0, 1, arg1, 0, 1, 0);
		} else if (Static344.method4581(-3, false, arg0, 1, arg1, 0, 1, 0)) {
			return;
		} else {
			Static344.method4581(-2, false, arg0, 1, arg1, 0, 1, 0);
		}
	}
}
