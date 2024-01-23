import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public static int anInt4610 = 0;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!qe;")
	public static Class78 aClass78_815 = Static199.method3560(")4");

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_816 = Static199.method3560("Cabbage");

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!qe;")
	public static Class78 aClass78_817 = Static199.method3560(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_818 = Static199.method3560("settings=");

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method3658(@OriginalArg(1) Class72 arg0) {
		if (Static149.aBoolean70) {
			return;
		}
		Static217.method3770();
		Static148.aClass2_Sub3_Sub8_7 = Static39.method529(Static186.anInt4341, arg0);
		Static148.aClass2_Sub3_Sub8_7.method2256(-95, 0);
		Static165.aClass79_1 = Static32.method3204(Static89.anInt2000, arg0);
		Static165.aClass79_1.method3071(382 - Static165.aClass79_1.anInt3900 / 2, 18);
		Static149.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!oe;B)V")
	public static void method3660(@OriginalArg(0) Class72 arg0) {
		Static72.aClass72_272 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public static int method3663(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I")
	public static int method3667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(30) int local30 = arg1;
		@Pc(34) int local34 = arg0 & 0x7F;
		@Pc(38) int local38 = arg2 & 0x7F;
		if (arg1 < 3 && (Static133.aByteArrayArrayArray10[1][local11][local7] & 0x2) == 2) {
			local30 = arg1 + 1;
		}
		@Pc(85) int local85 = Static144.anIntArrayArrayArray7[local30][local11 + 1][local7 + 1] * local34 + (128 - local34) * Static144.anIntArrayArrayArray7[local30][local11][local7 + 1] >> 7;
		@Pc(111) int local111 = local34 * Static144.anIntArrayArrayArray7[local30][local11 + 1][local7] + Static144.anIntArrayArrayArray7[local30][local11][local7] * (128 - local34) >> 7;
		return local85 * local38 + local111 * (128 - local38) >> 7;
	}
}
