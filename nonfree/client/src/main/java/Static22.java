import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!fa;")
	public static Class38 aClass38_2;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[Lclient!ea;")
	public static Class1_Sub7[][][] aClass1_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!sc;")
	public static Class102 aClass102_2 = new Class102(16);

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!ie;")
	public static Class53 aClass53_4 = new Class53(64);

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method467() {
		@Pc(12) int local12 = Static200.anInt4245;
		@Pc(14) int local14 = Static53.anInt1242;
		@Pc(16) int local16 = Static72.anInt1644;
		@Pc(18) int local18 = Static184.anInt3998;
		Static96.method1623(local14, local16, local12, local18, 6116423);
		Static96.method1623(local14 + 1, local16 + 1, local12 - 2, 16, 0);
		Static96.method1633(local14 + 1, local16 + 18, local12 - 2, local18 + -19, 0);
		Static80.aClass1_Sub2_Sub11_2.method2038(Static28.aClass51_211, local14 + 3, local16 - -14, 6116423, -1);
		@Pc(65) int local65 = Static15.anInt373;
		@Pc(67) int local67 = Static205.anInt4361;
		for (@Pc(69) int local69 = 0; local69 < Static202.anInt4289; local69++) {
			@Pc(73) int local73 = 16777215;
			@Pc(87) int local87 = local16 + (-local69 + Static202.anInt4289 + -1) * 15 + 31;
			if (local67 > local14 && local67 < local12 + local14 && local87 - 13 < local65 && local65 < local87 + 3) {
				local73 = 16776960;
			}
			Static80.aClass1_Sub2_Sub11_2.method2038(Static150.method2587(local69), local14 + 3, local87, local73, 0);
		}
		Static178.method3025(Static200.anInt4245, Static72.anInt1644, Static53.anInt1242, Static184.anInt3998);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Lclient!ve;")
	public static Class119 method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass119_1 == null ? null : local7.aClass119_1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method470() {
		Static24.aClass53_5.method1498();
		Static37.aClass53_8.method1498();
		Static58.aClass53_11.method1498();
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method471() {
		if (Static81.aClass11_15 != null) {
			Static81.aClass11_15.method271();
		}
	}
}
