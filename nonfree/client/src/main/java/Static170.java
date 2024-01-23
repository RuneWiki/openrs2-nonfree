import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	public static int anInt3120;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "Lclient!ak;")
	public static Class7 aClass7_140;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
	public static int anInt3124 = 0;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString107 = "green:";

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString108 = "yellow:";

	@OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
	public static int anInt3132 = -2;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
	public static void method2566() {
		Static190.aClass31_28.method855();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(JI)V")
	public static void method2567(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static147.anInt2712 >= 100 && !Static169.aBoolean235 || Static147.anInt2712 >= 200) {
			Static48.method843(Static230.aString155, 0, "");
			return;
		}
		@Pc(44) String local44 = Static266.method4096(arg0);
		@Pc(46) int local46;
		for (local46 = 0; local46 < Static147.anInt2712; local46++) {
			if (arg0 == Static207.aLongArray9[local46]) {
				Static48.method843(local44 + Static189.aString121, 0, "");
				return;
			}
		}
		for (local46 = 0; local46 < Static150.anInt2784; local46++) {
			if (Static65.aLongArray5[local46] == arg0) {
				Static48.method843(Static268.aString180 + local44 + Static37.aString102, 0, "");
				return;
			}
		}
		if (local44.equals(Static28.aClass6_Sub6_Sub2_1.aString147)) {
			Static48.method843(Static126.aString77, 0, "");
			return;
		}
		Static147.aStringArray12[Static147.anInt2712] = local44;
		Static207.aLongArray9[Static147.anInt2712] = arg0;
		Static22.anIntArray597[Static147.anInt2712] = 0;
		Static275.aStringArray34[Static147.anInt2712] = "";
		Static26.anIntArray59[Static147.anInt2712] = 0;
		Static28.aBooleanArray2[Static147.anInt2712] = false;
		Static147.anInt2712++;
		Static145.anInt2688 = Static56.anInt1175;
		Static270.aClass1_Sub18_Sub1_3.method3130(50);
		Static270.aClass1_Sub18_Sub1_3.method3091(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Lclient!qd;")
	public static Class136 method2568() {
		try {
			return (Class136) Class.forName("Class136_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ak;BLclient!ak;Lclient!ak;)V")
	public static void method2569(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2) {
		Static232.aClass7_197 = arg0;
		Static27.aClass7_30 = arg1;
		Static254.aClass7_239 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
	public static void method2571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static163.method3579(6, arg0);
		local4.method1859();
		local4.anInt2282 = arg1;
	}
}
