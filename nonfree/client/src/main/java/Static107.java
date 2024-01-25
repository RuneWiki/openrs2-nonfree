import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_109 = new Class85("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[128][128];

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
	public static final int[] anIntArray442 = new int[14];

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public static int anInt4822 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method4265() {
		Static304.aClass201ArrayArray1 = new Class201[Static248.aClass93_95.method2417()][];
		Static98.aBooleanArray8 = new boolean[Static248.aClass93_95.method2417()];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!aj;Lclient!ea;)I")
	public static int method4269(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Class55 arg1) {
		if (arg0.anInt205 != -1) {
			return arg0.anInt205;
		}
		if (arg0.anInt202 != -1) {
			@Pc(36) Class200 local36 = Static182.anInterface3_3.method1511(arg1.method5177() ? arg0.anInt202 : arg0.anInt192);
			if (!local36.aBoolean540) {
				return local36.aShort84;
			}
		}
		return arg0.anInt200;
	}
}
