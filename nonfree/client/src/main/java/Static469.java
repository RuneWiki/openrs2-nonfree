import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
	public static int anInt8080;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "Lclient!ni;")
	public static Class235 aClass235_2;

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_49 = new Class207(64);

	@OriginalMember(owner = "client!sba", name = "k", descriptor = "Lclient!fh;")
	public static final Class100 aClass100_1 = new Class100();

	@OriginalMember(owner = "client!sba", name = "n", descriptor = "[I")
	public static final int[] anIntArray512 = new int[8];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)S")
	public static short method6496(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(42) int local42 = local19 + local37;
		@Pc(53) int local53;
		if (local42 == 0) {
			local53 = local37 << 1;
		} else {
			local53 = (local37 << 8) / local42;
		}
		return (short) (local53 >> 4 << 7 | local9 << 10 | local42);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II[FIFIIIBIFFI)V")
	public static void method6498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg0 - arg6;
		@Pc(9) int local9 = arg5 - arg1;
		@Pc(21) int local21 = arg11 - arg3;
		@Pc(42) float local42 = arg2[1] * (float) local9 + arg2[0] * (float) local21 + arg2[2] * (float) local5;
		@Pc(63) float local63 = (float) local21 * arg2[3] + (float) local9 * arg2[4] + arg2[5] * (float) local5;
		@Pc(84) float local84 = arg2[8] * (float) local5 + arg2[6] * (float) local21 + arg2[7] * (float) local9;
		@Pc(101) float local101;
		@Pc(108) float local108;
		if (arg8 == 0) {
			local108 = arg4 + 0.5F - local84;
			local101 = arg10 + local42 + 0.5F;
		} else if (arg8 == 1) {
			local108 = arg4 + local84 + 0.5F;
			local101 = local42 + arg10 + 0.5F;
		} else if (arg8 == 2) {
			local101 = arg10 + 0.5F - local42;
			local108 = arg9 + 0.5F - local63;
		} else if (arg8 == 3) {
			local108 = arg9 + 0.5F - local63;
			local101 = arg10 + local42 + 0.5F;
		} else if (arg8 == 4) {
			local101 = arg4 + local84 + 0.5F;
			local108 = arg9 + 0.5F - local63;
		} else {
			local108 = arg9 + 0.5F - local63;
			local101 = arg4 + 0.5F - local84;
		}
		@Pc(208) float local208;
		if (arg7 == 1) {
			local208 = local101;
			local101 = -local108;
			local108 = local208;
		} else if (arg7 == 2) {
			local108 = -local108;
			local101 = -local101;
		} else if (arg7 == 3) {
			local208 = local101;
			local101 = local108;
			local108 = -local208;
		}
		Static410.aFloat186 = local108;
		Static294.aFloat134 = local101;
	}
}
