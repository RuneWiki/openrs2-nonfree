import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Lclient!wt;")
	public static Class2_Sub1_Sub17 aClass2_Sub1_Sub17_3;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
	public static int anInt2474;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_69 = new Class41(15, 3);

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_94 = new Class221("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "[I")
	public static final int[] anIntArray281 = new int[50];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method2329() {
		if (Static124.aClass45_3 != null) {
			Static124.aClass45_3.method3368();
		}
		if (Static267.aClass45_2 != null) {
			Static267.aClass45_2.method3368();
		}
		Static225.method3766(Static265.aBoolean343);
		Static124.aClass45_3 = Static126.method2267(Static170.aCanvas4, 22050, 0, Static92.aClass53_2);
		Static124.aClass45_3.method3363(Static228.aClass2_Sub2_Sub3_2);
		Static267.aClass45_2 = Static126.method2267(Static170.aCanvas4, 2048, 1, Static92.aClass53_2);
		Static267.aClass45_2.method3363(Static339.aClass2_Sub2_Sub1_2);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!bn;Z)V")
	public static void method2330(@OriginalArg(0) Class2_Sub7 arg0) {
		if (!Static48.aBoolean87) {
			arg0.method5745();
			Static379.anInt1192--;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public static void method2331() {
		if (Static73.aBoolean116) {
			return;
		}
		Static92.aBoolean149 = true;
		if (Static223.aBoolean308) {
			Static18.aFloat8 = (int) Static18.aFloat8 - 65 & 0xFFFFFF80;
		} else {
			Static375.aFloat45 += (-24.0F - Static375.aFloat45) / 2.0F;
		}
		Static73.aBoolean116 = true;
	}
}
