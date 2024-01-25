import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "F", descriptor = "J")
	public static long aLong4;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "Lclient!pga;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "I")
	public static int anInt43;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_1 = new Class297(0, 1);

	@OriginalMember(owner = "client!a", name = "L", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_1 = new Class308("WTI", 5);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!la;ILclient!vg;IILclient!uq;Lclient!ua;ILjava/lang/String;BII)V")
	public static void method39(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class341 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class334 arg5, @OriginalArg(6) Class204 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static340.anInt5707 == 4) {
			local11 = (int) Static167.aFloat59 & 0x3FFF;
		} else {
			local11 = (int) Static167.aFloat59 + Static548.anInt8574 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg2.anInt9300 / 2, arg2.anInt9248 / 2) + 10;
		@Pc(40) int local40 = arg4 * arg4 + arg9 * arg9;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(54) int local54 = Class1_Sub6_Sub2.anIntArray675[local11];
		@Pc(58) int local58 = Class1_Sub6_Sub2.anIntArray676[local11];
		if (Static340.anInt5707 != 4) {
			local54 = local54 * 256 / (Static348.anInt5786 + 256);
			local58 = local58 * 256 / (Static348.anInt5786 + 256);
		}
		@Pc(89) int local89 = arg4 * local58 + arg9 * local54 >> 14;
		@Pc(100) int local100 = local58 * arg9 - arg4 * local54 >> 14;
		@Pc(107) int local107 = arg5.method7352(arg8, null, 100);
		@Pc(120) int local120 = arg5.method7351(null, arg8, 100, 0);
		@Pc(126) int local126 = local89 - local107 / 2;
		if (-arg2.anInt9300 <= local126 && local126 <= arg2.anInt9300 && local100 >= -arg2.anInt9248 && arg2.anInt9248 >= local100) {
			arg0.method6612(null, 0, arg2.anInt9300 / 2 + local126 + arg1, 50, 0, arg6, arg8, 0, null, arg7, arg1, arg2.anInt9248 / 2 + arg7 - local100 - arg10 - local120, local107, arg3, 1);
		}
	}
}
