import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	public static int[] anIntArray408;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public static int anInt7570;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public static int anInt7572;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!raa;")
	public static Class295 aClass295_14 = null;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ofa;Z)Lclient!or;")
	public static Class119_Sub1 method6695(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(7) Class119 local7 = Static605.method8635(arg0);
		@Pc(11) int local11 = arg0.method5968();
		@Pc(20) int local20 = arg0.method5968();
		@Pc(24) int local24 = arg0.method5968();
		@Pc(28) int local28 = arg0.method5968();
		@Pc(32) int local32 = arg0.method5968();
		@Pc(36) int local36 = arg0.method5968();
		return new Class119_Sub1(local7.aClass245_14, local7.aClass183_12, local7.anInt10375, local7.anInt10374, local7.anInt10371, local7.anInt10373, local7.anInt10367, local7.anInt10370, local7.anInt10369, local11, local20, local24, local28, local32, local36);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBI)V")
	public static void method6696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static97.aClass5_Sub25_8.aClass6_Sub18_5.method5120() != 0 && arg4 != 0 && Static44.anInt945 < 50 && arg2 != -1) {
			Static13.aClass166Array1[Static44.anInt945++] = new Class166((byte) 1, arg2, arg4, arg1, arg0, 0, arg3, null);
		}
	}
}
