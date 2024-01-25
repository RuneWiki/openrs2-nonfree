import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[Lclient!ta;")
	public static Class4_Sub10[] aClass4_Sub10Array1;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Lclient!la;")
	public static Class196 aClass196_84;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public static int anInt7699 = 0;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "[I")
	public static final int[] anIntArray473 = new int[8];

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
	public static int[] anIntArray474 = new int[2];

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public static void method6678() {
		@Pc(15) int local15 = Static262.aClass3_Sub27_12.aClass21_Sub27_1.method8338();
		if (local15 == 0) {
			Static3.aByteArrayArrayArray1 = null;
			Static580.method8223(0);
		} else if (local15 == 1) {
			Static29.method1087((byte) 0);
			Static580.method8223(512);
			if (Static513.aByteArrayArrayArray18 != null) {
				Static139.method2309();
			}
		} else {
			Static29.method1087((byte) (Static45.anInt1320 - 4 & 0xFF));
			Static580.method8223(2);
		}
		Static251.anInt4608 = Static549.anInt9262;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!eg;I)V")
	public static void method6680(@OriginalArg(1) Class3_Sub7_Sub2 arg0) {
		Static105.aClass188_1.method7768(arg0);
		Static1.method8298(Static105.aClass188_1, Static294.aClass196_53, Static106.aClass196_30, arg0, Static342.aClass196_67);
	}
}
