import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1263 = Static186.method3527("Loaded textures");

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1259 = aClass50_1263;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!mi;")
	public static Class75 aClass75_19 = new Class75();

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1260 = Static186.method3527("Ablegen");

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1261 = null;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public static int anInt3935 = 7759444;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1264 = Static186.method3527("M");

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1265 = Static186.method3527("gr-Un:");

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "[I")
	public static int[] anIntArray444 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!gj;)I")
	public static int method3133(@OriginalArg(1) Class20_Sub3_Sub1 arg0) {
		@Pc(11) int local11 = arg0.anInt1506;
		if (arg0.anInt3051 == arg0.anInt3057) {
			local11 = arg0.anInt1503;
		} else if (arg0.anInt3051 == arg0.anInt3027) {
			local11 = arg0.anInt1514;
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method3135() {
		Static18.aClass84_10.method2585();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I")
	public static int method3136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(36) int local36 = Static78.method1129(arg0 + 45365, 4, arg1 + 91923) + (Static78.method1129(arg0 - -10294, 2, arg1 + 37821) + -128 >> 1) + (Static78.method1129(arg0, 1, arg1) - 128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method3137() {
		if (Static149.anIntArray324 != null && Static106.anIntArray203 != null) {
			return;
		}
		Static149.anIntArray324 = new int[256];
		Static106.anIntArray203 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static149.anIntArray324[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static106.anIntArray203[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
