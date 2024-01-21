import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "Lclient!ha;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!ta", name = "Bc", descriptor = "Lclient!fd;")
	public static Class24 aClass24_20;

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "Lclient!je;")
	public static Class40 aClass40_883 = Static69.method1231("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ta", name = "gc", descriptor = "Lclient!ob;")
	public static Class55 aClass55_49 = new Class55(100);

	@OriginalMember(owner = "client!ta", name = "yc", descriptor = "Lclient!ac;")
	public static Class3 aClass3_11 = new Class3();

	@OriginalMember(owner = "client!ta", name = "zc", descriptor = "Lclient!je;")
	public static Class40 aClass40_885 = Static69.method1231(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ta", name = "Ac", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[5][5000];

	@OriginalMember(owner = "client!ta", name = "Cc", descriptor = "I")
	public static int anInt1824 = -1;

	@OriginalMember(owner = "client!ta", name = "Dc", descriptor = "Lclient!je;")
	public static Class40 aClass40_886 = Static69.method1231("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLclient!fd;IILclient!je;ILclient!je;)V")
	public static void method1173(@OriginalArg(1) Class24 arg0, @OriginalArg(4) Class40 arg1, @OriginalArg(6) Class40 arg2) {
		@Pc(8) int local8 = arg0.method1915(arg2);
		@Pc(18) int local18 = arg0.method1918(arg1, local8);
		Static32.method493(local18, arg0, 255, local8);
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
	public static void method1178() {
		aClass3_11 = null;
		aClass40_886 = null;
		aClass29_3 = null;
		aClass40_883 = null;
		aClass55_49 = null;
		anIntArrayArray20 = null;
		aClass40_885 = null;
		aClass24_20 = null;
	}
}
