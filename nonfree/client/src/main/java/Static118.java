import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray32 = new int[5][5000];

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Lclient!kb;")
	private static Class46 aClass46_963 = Static65.method1172("flash3:");

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "Lclient!kb;")
	public static Class46 aClass46_964 = aClass46_963;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
	public static final int anInt2811 = 5063219;

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "Lclient!kb;")
	public static Class46 aClass46_965 = Static65.method1172("(U2");

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "Lclient!kb;")
	public static Class46 aClass46_966 = aClass46_963;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "[I")
	public static int[] anIntArray325 = new int[1000];

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_967 = Static65.method1172("lila:");

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method2026() {
		Static49.aClass3_Sub4_Sub1_2.method227();
		@Pc(11) int local11 = Static49.aClass3_Sub4_Sub1_2.method228(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static49.aClass3_Sub4_Sub1_2.method228(2);
		if (local19 == 0) {
			Static14.anIntArray25[Static108.anInt2585++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(55) int local55;
		if (local19 == 1) {
			local43 = Static49.aClass3_Sub4_Sub1_2.method228(3);
			Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.method1163(false, local43);
			local55 = Static49.aClass3_Sub4_Sub1_2.method228(1);
			if (local55 == 1) {
				Static14.anIntArray25[Static108.anInt2585++] = 2047;
			}
			return;
		}
		@Pc(97) int local97;
		if (local19 == 2) {
			local43 = Static49.aClass3_Sub4_Sub1_2.method228(3);
			Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.method1163(true, local43);
			local55 = Static49.aClass3_Sub4_Sub1_2.method228(3);
			Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.method1163(true, local55);
			local97 = Static49.aClass3_Sub4_Sub1_2.method228(1);
			if (local97 == 1) {
				Static14.anIntArray25[Static108.anInt2585++] = 2047;
			}
		} else if (local19 == 3) {
			local43 = Static49.aClass3_Sub4_Sub1_2.method228(7);
			local55 = Static49.aClass3_Sub4_Sub1_2.method228(1);
			Static99.anInt2422 = Static49.aClass3_Sub4_Sub1_2.method228(2);
			local97 = Static49.aClass3_Sub4_Sub1_2.method228(1);
			if (local97 == 1) {
				Static14.anIntArray25[Static108.anInt2585++] = 2047;
			}
			@Pc(152) int local152 = Static49.aClass3_Sub4_Sub1_2.method228(7);
			Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.method1168(local55 == 1, local152, local43);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2027(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static131.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static178.aClass85_1);
		arg0.addFocusListener(Static178.aClass85_1);
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method2028() {
		aClass46_966 = null;
		aClass46_965 = null;
		anIntArrayArray32 = null;
		anIntArray325 = null;
		aClass46_964 = null;
		aClass46_967 = null;
		aClass46_963 = null;
	}
}
