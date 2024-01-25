import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_101 = new Class154(53, -1);

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Z")
	public static boolean aBoolean619 = false;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	public static int anInt7430 = -1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method5987() {
		Static401.aClass309_4.method6244();
		Static380.aClass211_7.method4405();
		Static25.aClass286_1.method5748();
		Static362.aClass290_2.method5800();
		Static76.aClass361_1.method7580();
		Static466.aClass130_2.method2319();
		Static117.aClass18_1.method297();
		Static62.aClass49_1.method1019();
		Static31.aClass145_1.method2542();
		Static572.aClass55_1.method1096();
		Static380.aClass221_3.method4663();
		Static369.aClass212_6.method4411();
		Static8.aClass360_1.method7570();
		Static232.aClass176_1.method3608();
		Static537.aClass191_2.method3970();
		Static403.aClass123_2.method2204();
		Static496.aClass39_1.method800();
		Static304.aClass304_1.method6148();
		Static23.aClass110_1.method2017();
		Static337.aClass26_1.method397();
		Static108.method1585();
		Static151.method2090();
		Static541.method3830();
		Static439.method5764();
		Static498.method6447();
		Static531.aClass21_83.method314();
		Static211.aClass21_34.method314();
		Static360.aClass21_56.method314();
		Static465.aClass21_71.method314();
		Static566.aClass21_91.method314();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class2_Sub2_Sub11 method5988(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub11 local15 = (Class2_Sub2_Sub11) Static159.aClass236_2.method5075((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static399.aClass229_93.method4980(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local15 = Static4.method52(local25);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static159.aClass236_2.method5071(local15, (long) arg0);
		return local15;
	}
}
