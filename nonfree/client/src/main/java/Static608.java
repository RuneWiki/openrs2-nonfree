import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!uda;")
	public static Class370 aClass370_1;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_165 = new Class397(96, 0);

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "S")
	public static short aShort99 = 32767;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
	public static final int[] anIntArray666 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method7801(@OriginalArg(1) int arg0) {
		@Pc(31) byte local31;
		if (arg0 > 12000) {
			local31 = 4;
			Static542.method7186();
		} else if (arg0 > 5000) {
			local31 = 3;
			Static71.method1572();
		} else if (arg0 <= 2000) {
			Static274.method3861();
			local31 = 1;
		} else {
			local31 = 2;
			Static719.method6597();
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 2) {
			Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
			Static36.method1127(false, 2);
		}
		Static124.method2284();
		return local31;
	}
}
