import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vd", name = "we", descriptor = "Lclient!ok;")
	public static Class178 aClass178_132;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_138 = new Class55("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!vd", name = "ee", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_104 = new Class2(79, 2);

	@OriginalMember(owner = "client!vd", name = "ne", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_139 = new Class55("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!vd", name = "ue", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[6][];

	@OriginalMember(owner = "client!vd", name = "ve", descriptor = "I")
	public static int anInt6912 = 0;

	@OriginalMember(owner = "client!vd", name = "ze", descriptor = "[I")
	public static final int[] anIntArray591 = new int[64];

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "(I)V")
	public static void method5378() {
		Static77.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "(I)Z")
	public static boolean method5396() {
		return Static351.anInt5638 == 0 ? Static108.aClass7_Sub8_Sub3_1.method4500() : true;
	}

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "(I)V")
	public static void method5401() {
		Static331.aBoolean372 = false;
		Static136.method2147(Static253.anInt4289, Static351.anInt5637, Static171.anInt3077, Static415.anInt6598);
	}

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "(I)V")
	public static void method5410() {
		if (Static411.method5164(Static206.anInt3642) || Static459.method5312(Static206.anInt3642)) {
			Static308.method4070(5000, Static46.anInt737 >> 10, Static181.anInt3254 >> 10);
		} else {
			@Pc(24) int local24 = Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0] >> 3;
			@Pc(31) int local31 = Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0] >> 3;
			if (local24 >= 0 && local24 < Static333.anInt3375 >> 3 && local31 >= 0 && local31 < Static102.anInt2086 >> 3) {
				Static308.method4070(5000, local24, local31);
			} else {
				Static308.method4070(0, Static333.anInt3375 >> 4, Static102.anInt2086 >> 4);
			}
		}
		Static370.method4738();
		Static106.method1848();
		Static43.method586();
		Static276.method3688();
	}
}
