import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Lclient!me;")
	public static final Class211 aClass211_23 = new Class211(10);

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_49 = new Class276(9, 5);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZII)I")
	public static int method3262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + ((arg2 & 0xFF) >> 2 << 10) + (arg1 >> 5 << 7);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = Static60.aShort15 + (Static51.aShort14 - Static60.aShort15) * local7 / 100;
		@Pc(40) int local40 = local34 * arg4 >> 8;
		@Pc(47) int local47 = 16384 - arg3 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg5 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local40;
		if (local47 != 0) {
			local58 = Class2_Sub3.anIntArray620[local47] * -local40 >> 14;
			local60 = local40 * Class2_Sub3.anIntArray621[local47] >> 14;
		}
		if (local54 != 0) {
			local56 = local60 * Class2_Sub3.anIntArray620[local54] >> 14;
			local60 = Class2_Sub3.anIntArray621[local54] * local60 >> 14;
		}
		Static594.anInt10391 = arg1 - local56;
		Static104.anInt2511 = arg5;
		Static496.anInt9269 = arg6 - local60;
		Static235.anInt4860 = 0;
		Static522.anInt9554 = arg3;
		Static360.anInt1771 = arg0 - local58;
	}
}
