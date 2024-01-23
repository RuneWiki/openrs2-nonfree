import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!ti;")
	public static Class112 aClass112_3;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array14;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject6 = new Object();

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	public static int anInt2420 = 0;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[Lclient!bb;")
	public static Class12[] aClass12Array2 = new Class12[50];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
	public static void method1849() {
		for (@Pc(1) int local1 = 0; local1 < Static55.anInt1279; local1++) {
			@Pc(6) Class83 local6 = Static34.aClass83Array2[local1];
			Static38.method672(local6);
			Static34.aClass83Array2[local1] = null;
		}
		Static55.anInt1279 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
	public static int method1853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static10.method161(arg1 + 91923, 4, arg0 + 45365) + (Static10.method161(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static10.method161(arg1, 1, arg0) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method1854(@OriginalArg(0) Class70 arg0) {
		Static161.aClass70_34 = arg0;
		Static67.anInt1520 = Static161.aClass70_34.method3532(16);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
	public static void method1855() {
		Static167.aClass1_Sub16_Sub1_2.method3823(85);
		for (@Pc(18) Class1_Sub13 local18 = (Class1_Sub13) Static120.aClass102_14.method3086(); local18 != null; local18 = (Class1_Sub13) Static120.aClass102_14.method3087()) {
			if (local18.anInt1675 == 0) {
				Static97.method1635(true, local18);
			}
		}
		if (Static172.aClass71_30 != null) {
			Static82.method1438(Static172.aClass71_30);
			Static172.aClass71_30 = null;
		}
	}
}
