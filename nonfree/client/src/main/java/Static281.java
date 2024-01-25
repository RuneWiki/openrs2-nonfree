import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public static int anInt5472;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!h;")
	public static Class76 aClass76_3;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public static int anInt5476;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
	public static int anInt5477;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Lclient!dq;")
	public static Class38 aClass38_30 = new Class38(8);

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_184 = new Class18(45, 8);

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_190 = new Class106("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	public static int anInt5478 = 0;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBI)V")
	public static void method5011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static131.anInt2843 <= arg2 && arg2 <= Static38.anInt945) {
			@Pc(15) int local15 = Static11.method912(arg3, Static122.anInt1360, Static93.anInt5014);
			@Pc(21) int local21 = Static11.method912(arg0, Static122.anInt1360, Static93.anInt5014);
			Static51.method1234(arg1, arg2, local21, local15);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZ)I")
	public static int method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static271.anIntArray42[arg1 & 0x3] : Static229.anIntArray379[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!ui;)V")
	public static void method5013(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1) {
		Static258.aClass36Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!ct;)V")
	public static void method5015(@OriginalArg(1) Class30 arg0) {
		Static109.anInt2443 = arg0.method1153("titlebg");
		Static287.anInt5569 = arg0.method1153("logo");
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	public static void method5016() {
		Static143.aClass1_Sub22_1 = new Class1_Sub22(Static218.aClass106_148.method2927(Static254.anInt5172), "", Static45.anInt1171, 1011, 0L, 0, 0, true, false);
	}
}
