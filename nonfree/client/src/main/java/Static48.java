import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
	public static boolean aBoolean111;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt1535 = 0;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_536 = Static161.method2971("blaugr-Un:");

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public static int anInt1542 = 0;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "Lclient!dd;")
	private static Class13 aClass13_537 = Static161.method2971("Welcome to RuneScape");

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_538 = aClass13_537;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method1222() {
		anIntArray161 = null;
		aClass13_538 = null;
		aClass13_536 = null;
		aClass13_537 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!fd;)Z")
	public static boolean method1223(@OriginalArg(1) Class20 arg0) {
		@Pc(11) int local11 = arg0.anInt1586;
		if (local11 == 205) {
			Static70.anInt2004 = 250;
			return true;
		}
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (local11 >= 300 && local11 <= 313) {
			local34 = (local11 - 300) / 2;
			local38 = local11 & 0x1;
			Static35.aClass6_1.method638(local34, local38 == 1);
		}
		if (local11 >= 314 && local11 <= 323) {
			local34 = (local11 - 314) / 2;
			local38 = local11 & 0x1;
			Static35.aClass6_1.method643(local34, local38 == 1);
		}
		if (local11 == 324) {
			Static35.aClass6_1.method633(false);
		}
		if (local11 == 325) {
			Static35.aClass6_1.method633(true);
		}
		if (local11 == 326) {
			Static1.aClass1_Sub8_Sub1_1.method1654(30);
			Static35.aClass6_1.method644(Static1.aClass1_Sub8_Sub1_1);
			return true;
		} else {
			return false;
		}
	}
}
