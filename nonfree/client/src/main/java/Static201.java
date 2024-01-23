import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ph", name = "oc", descriptor = "I")
	public static int anInt4151;

	@OriginalMember(owner = "client!ph", name = "yc", descriptor = "[Lclient!en;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ph", name = "pc", descriptor = "Lclient!tk;")
	public static Class159 aClass159_15 = null;

	@OriginalMember(owner = "client!ph", name = "uc", descriptor = "Ljava/lang/String;")
	public static String aString147 = "green:";

	@OriginalMember(owner = "client!ph", name = "vc", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!ph", name = "Ac", descriptor = "F")
	public static float aFloat36 = 128.0F;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
	public static void method3118() {
		Static66.aClass8_Sub2_Sub1_4.method2398(208);
		for (@Pc(23) Class8_Sub32 local23 = (Class8_Sub32) Static213.aClass129_22.method3035(); local23 != null; local23 = (Class8_Sub32) Static213.aClass129_22.method3048()) {
			if (local23.anInt5291 == 0) {
				Static7.method60(true, local23);
			}
		}
		if (Static272.aClass159_19 != null) {
			Static128.method2075(Static272.aClass159_19);
			Static272.aClass159_19 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIBILclient!tk;)V")
	public static void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class159 arg6) {
		@Pc(13) int local13 = arg0 * arg0 + arg1 * arg1;
		if (arg4 < local13) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg6.anInt5123 / 2, arg6.anInt5121 / 2);
		if (local13 <= local31 * local31) {
			Static298.method258(arg0, arg3, arg1, Static213.aClass8_Sub1_Sub7Array91[arg2], arg5, arg6);
			return;
		}
		local31 -= 10;
		@Pc(61) int local61 = (int) Static82.aFloat20 + Static121.anInt2437 & 0x7FF;
		@Pc(65) int local65 = Class68.anIntArray137[local61];
		@Pc(69) int local69 = Class68.anIntArray139[local61];
		@Pc(77) int local77 = local65 * 256 / (Static2.anInt12 + 256);
		@Pc(85) int local85 = local69 * 256 / (Static2.anInt12 + 256);
		@Pc(95) int local95 = arg1 * local85 + arg0 * local77 >> 16;
		@Pc(106) int local106 = local85 * arg0 - local77 * arg1 >> 16;
		@Pc(112) double local112 = Math.atan2((double) local95, (double) local106);
		@Pc(119) int local119 = (int) (Math.sin(local112) * (double) local31);
		@Pc(126) int local126 = (int) ((double) local31 * Math.cos(local112));
		if (Static116.aBoolean188) {
			((Class8_Sub1_Sub7_Sub2) Static73.aClass8_Sub1_Sub7Array36[arg2]).method2818((arg6.anInt5123 / 2 + arg5 + local119) * 16, (arg6.anInt5121 / 2 + arg3 - local126) * 16, (int) (local112 * 10430.378D));
		} else {
			((Class8_Sub1_Sub7_Sub1) Static73.aClass8_Sub1_Sub7Array36[arg2]).method1650(local119 + arg5 + arg6.anInt5123 / 2 - 10, arg3 - (-(arg6.anInt5121 / 2) + local126 - -10), local112);
		}
	}
}
