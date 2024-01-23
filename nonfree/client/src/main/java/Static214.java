import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!wc;")
	public static Class110 aClass110_24 = new Class110(64);

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
	public static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_827 = Static199.method3560("(R");

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	public static int anInt4672 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22 = 2048 - arg6 & 0x7FF;
		@Pc(29) int local29 = 2048 - arg4 & 0x7FF;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = arg3;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (local22 != 0) {
			local39 = Class77.anIntArray631[local22];
			local43 = Class77.anIntArray632[local22];
			local31 = local39 * -arg3 >> 16;
			local33 = arg3 * local43 >> 16;
		}
		@Pc(58) int local58 = 0;
		if (local29 != 0) {
			local39 = Class77.anIntArray631[local29];
			local58 = local33 * local39 >> 16;
			local43 = Class77.anIntArray632[local29];
			local33 = local43 * local33 >> 16;
		}
		Static138.anInt3181 = arg4;
		Static71.anInt1394 = arg0 - local33;
		Static107.anInt2348 = arg1 - local31;
		Static39.anInt727 = arg5 - local58;
		Static15.anInt335 = arg6;
	}
}
