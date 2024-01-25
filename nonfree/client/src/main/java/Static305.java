import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public static int anInt5076 = 0;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[I")
	public static final int[] anIntArray380 = new int[32];

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public static int anInt5083 = 0;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	public static void method4061() {
		if (Static329.aClass117_5 != null) {
			Static329.aClass117_5.method5701();
			Static329.aClass117_5 = null;
			Static250.aClass137_6 = null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!hm;III)V")
	public static void method4063(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray10 != null) {
			@Pc(18) Class1_Sub11 local18 = new Class1_Sub11();
			local18.aClass107_2 = arg0;
			local18.anObjectArray2 = arg0.anObjectArray10;
			Static198.method2834(local18);
		}
		Static276.anInt4734 = arg0.anInt2660;
		Static228.anInt5703 = arg1;
		Static211.anInt5191 = arg0.anInt2637;
		Static2.anInt29 = arg0.anInt2631;
		Static226.anInt4102 = arg2;
		Static313.anInt5165 = arg0.anInt2589;
		Static403.anInt6355 = arg0.anInt2643;
		Static290.aBoolean449 = true;
		Static260.method3633(arg0);
	}
}
