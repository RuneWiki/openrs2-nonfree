import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "B")
	public static byte aByte16;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Lclient!qk;")
	public static Class3_Sub4_Sub2_Sub2 aClass3_Sub4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
	public static int anInt3271;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "Lclient!l;")
	public static Class98 aClass98_26 = new Class98(64);

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public static int anInt3267 = 0;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "[I")
	public static int[] anIntArray399 = new int[50];

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
	public static int anInt3270 = 7759444;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "[F")
	public static float[] aFloatArray15 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "Lclient!l;")
	public static Class98 aClass98_27 = new Class98(16);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Lclient!f;")
	public static Class49 method2874(@OriginalArg(1) int arg0) {
		@Pc(10) Class49 local10 = (Class49) Static308.aClass98_47.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static230.aClass155_95.method4121(Static2.method25(arg0), Static40.method4963(arg0));
		local10 = new Class49();
		local10.anInt1376 = arg0;
		if (local26 != null) {
			local10.method1114(new Class3_Sub26(local26));
		}
		local10.method1119();
		if (!Static107.aBoolean157 && local10.aBoolean115) {
			local10.aStringArray12 = null;
		}
		if (local10.aBoolean120) {
			local10.anInt1372 = 0;
			local10.aBoolean119 = false;
		}
		Static308.aClass98_47.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZZIILclient!rn;)V")
	public static void method2876(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class155 arg2) {
		Static305.aBoolean426 = false;
		Static110.anInt2029 = arg0;
		Static93.anInt1696 = 0;
		Static44.anInt828 = 10000;
		Static306.anInt6012 = arg1;
		Static94.anInt1711 = 1;
		Static310.aClass155_122 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)[F")
	public static float[] method2878(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static226.method3659() + Static226.method3651();
		@Pc(14) int local14 = Static226.method3657();
		@Pc(23) float local23 = (float) (local14 >> 16 & 0xFF) / 255.0F;
		Static3.aFloatArray2[3] = 1.0F;
		@Pc(36) float local36 = (float) (local14 >> 8 & 0xFF) / 255.0F;
		@Pc(38) float local38 = 0.58823526F;
		Static3.aFloatArray2[0] = local7 * local38 * (float) (arg0 >> 16 & 0xFF) / 255.0F * local23;
		Static3.aFloatArray2[1] = local38 * (float) (arg0 >> 8 & 0xFF) / 255.0F * local36 * local7;
		@Pc(79) float local79 = (float) (local14 & 0xFF) / 255.0F;
		Static3.aFloatArray2[2] = local7 * (float) (arg0 & 0xFF) / 255.0F * local79 * local38;
		return Static3.aFloatArray2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZIIZLclient!qg;Lclient!qg;)I")
	public static int method2881(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class87_Sub1 arg4, @OriginalArg(6) Class87_Sub1 arg5) {
		@Pc(12) int local12 = Static223.method3637(arg3, arg5, arg0, arg4);
		if (local12 != 0) {
			return arg3 ? -local12 : local12;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = Static223.method3637(arg1, arg5, arg2, arg4);
			return arg1 ? -local35 : local35;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
	public static void method2883() {
		Static59.anInterface1Array1 = null;
		Static8.method136();
	}
}
