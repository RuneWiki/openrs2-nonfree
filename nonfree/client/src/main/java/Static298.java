import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_34 = new Class8();

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt6415 = 0;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public static int anInt6417 = 0;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method5520() {
		if (Static91.aBoolean90) {
			return;
		}
		Static473.method7148(Static360.aClass97ArrayArrayArray4);
		if (Static179.aClass97ArrayArrayArray1 != null) {
			Static473.method7148(Static179.aClass97ArrayArrayArray1);
		}
		Static91.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 < 512 || arg0 < 512 || Static442.anInt7975 * 512 - 1024 < arg3 || (Static284.anInt7916 - 2) * 512 < arg0) {
			Static258.anIntArray298[0] = Static258.anIntArray298[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static138.method2248(arg3, arg5, arg0) - arg6;
		if (Static389.aBoolean497) {
			Static353.method5676(true);
		} else {
			Static187.aClass154_3.method6570(arg1, 0, 0);
			Static162.aClass100_7.method8850(Static187.aClass154_3);
		}
		if (Static591.aBoolean675) {
			Static162.aClass100_7.HA(arg3, local51, arg0, Static419.anInt7660, Static258.anIntArray298);
		} else {
			Static162.aClass100_7.da(arg3, local51, arg0, Static258.anIntArray298);
		}
		if (Static389.aBoolean497) {
			Static633.method8933();
		} else {
			Static187.aClass154_3.method6570(-arg1, 0, 0);
			Static162.aClass100_7.method8850(Static187.aClass154_3);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)[Lclient!bh;")
	public static Class35[] method5524() {
		return new Class35[] { Static418.aClass35_3, Static430.aClass35_4, Static436.aClass35_5, Static41.aClass35_1, Static636.aClass35_7, Static519.aClass35_6 };
	}
}
