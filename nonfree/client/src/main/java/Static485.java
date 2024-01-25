import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "Lclient!bba;")
	public static final Class30 aClass30_4 = new Class30(64);

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_163 = new Class126(124, 1);

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_18 = new Class387(4, 1, 1, 1);

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "[I")
	public static final int[] anIntArray528 = new int[256];

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)V")
	public static void method6944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static278.anInt5212 = arg0;
		Static224.anInt4089 = arg1;
		if (Static418.anInt7055 == 0) {
			Static137.anInt2535 = Static575.anInt9134 * 2 + Static224.anInt4089;
			Static554.anInt8569 = Static278.anInt5212 + Static489.anInt8294 * 2;
		} else if (Static418.anInt7055 == 1) {
			Static67.anInt9115 = Static224.anInt4089 / Static552.anInt8938 + Static138.anInt2604 + 2;
			Static653.anInt10053 = Static450.anInt7726 + Static278.anInt5212 / Static502.anInt8445 + 2;
			Static137.anInt2535 = Static67.anInt9115 * Static552.anInt8938;
			Static554.anInt8569 = Static653.anInt10053 * Static502.anInt8445;
			Static575.anInt9134 = Static137.anInt2535 - Static224.anInt4089 >> 1;
			Static489.anInt8294 = Static554.anInt8569 - Static278.anInt5212 >> 1;
		} else if (Static418.anInt7055 == 2) {
			Static137.anInt2535 = Static224.anInt4089;
			Static554.anInt8569 = Static278.anInt5212;
			return;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Lclient!qj;")
	public static Class3_Sub44 method6945() {
		return Static648.anInt9981 == 0 ? new Class3_Sub44() : Static285.aClass3_Sub44Array1[--Static648.anInt9981];
	}
}
