import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	public static int anInt1374;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	public static int anInt1377;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_377 = Static81.method1507(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_378 = Static81.method1507("mem=");

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_379 = Static81.method1507("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!je;")
	public static final Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
	public static int anInt1378 = -1;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "[I")
	public static final int[] anIntArray119 = new int[200];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg3) {
			Static170.method2924(arg4, arg2, arg1, arg0, arg5, arg6);
		} else if (Static63.anInt1608 <= arg0 - arg6 && Static63.anInt1595 >= arg6 + arg0 && arg4 - arg3 >= Static13.anInt308 && arg3 + arg4 <= Static52.anInt1338) {
			Static200.method3380(arg0, arg5, arg2, arg4, arg3, arg1, arg6);
		} else {
			Static173.method2984(arg1, arg4, arg0, arg2, arg5, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Lclient!ei;")
	public static Class1_Sub2_Sub7 method1065() {
		if (Static105.aClass1_Sub2_Sub7_1 == null) {
			Static105.aClass1_Sub2_Sub7_1 = new Class1_Sub2_Sub7();
		}
		return Static105.aClass1_Sub2_Sub7_1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!dj;IZI)V")
	public static void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class98 local8 = Static87.method1589(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray18 != null) {
			@Pc(18) Class1_Sub16 local18 = new Class1_Sub16();
			local18.aClass98_13 = local8;
			local18.anInt2761 = arg0;
			local18.aClass24_834 = arg1;
			local18.anObjectArray1 = local8.anObjectArray18;
			Static131.method2258(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt4351 > 0) {
			local36 = Static2.method91(local8);
		}
		if (!local36 || !Static2.method84(arg0 - 1, Static105.method1831(local8))) {
			return;
		}
		if (arg0 == 1) {
			Static176.aClass1_Sub7_Sub1_34.method2808(74);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 2) {
			Static176.aClass1_Sub7_Sub1_34.method2808(30);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 3) {
			Static176.aClass1_Sub7_Sub1_34.method2808(130);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 4) {
			Static176.aClass1_Sub7_Sub1_34.method2808(201);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 5) {
			Static176.aClass1_Sub7_Sub1_34.method2808(220);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 6) {
			Static176.aClass1_Sub7_Sub1_34.method2808(137);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 7) {
			Static176.aClass1_Sub7_Sub1_34.method2808(191);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 8) {
			Static176.aClass1_Sub7_Sub1_34.method2808(254);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 9) {
			Static176.aClass1_Sub7_Sub1_34.method2808(40);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
		if (arg0 == 10) {
			Static176.aClass1_Sub7_Sub1_34.method2808(97);
			Static176.aClass1_Sub7_Sub1_34.method2754(arg2);
			Static176.aClass1_Sub7_Sub1_34.method2775(arg3);
		}
	}
}
