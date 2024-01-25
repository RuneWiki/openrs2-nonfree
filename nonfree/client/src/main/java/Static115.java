import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public static int anInt2124;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_8 = new Class225(9, 6);

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	public static int anInt2125 = 1;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIFFIIIIII[F)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(9) int local9 = arg6 - arg7;
		@Pc(13) int local13 = arg0 - arg5;
		@Pc(17) int local17 = arg4 - arg8;
		@Pc(38) float local38 = arg9[2] * (float) local9 + arg9[0] * (float) local17 + arg9[1] * (float) local13;
		@Pc(59) float local59 = (float) local17 * arg9[3] + arg9[4] * (float) local13 + arg9[5] * (float) local9;
		@Pc(80) float local80 = arg9[8] * (float) local9 + arg9[6] * (float) local17 + arg9[7] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local91 *= arg2;
		}
		@Pc(120) float local120 = arg3 + local59 + 0.5F;
		@Pc(133) float local133;
		if (arg1 == 1) {
			local133 = local91;
			local91 = -local120;
			local120 = local133;
		} else if (arg1 == 2) {
			local120 = -local120;
			local91 = -local91;
		} else if (arg1 == 3) {
			local133 = local91;
			local91 = local120;
			local120 = -local133;
		}
		Static229.aFloat38 = local91;
		Static156.aFloat28 = local120;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ub;IZI)Lclient!ho;")
	public static Class2_Sub5_Sub5 method1747(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt6547 | arg2 << 8;
		@Pc(19) Class2_Sub5_Sub5 local19 = (Class2_Sub5_Sub5) Static370.aClass85_3.method1935((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static96.aClass54_29.method1110(Static96.aClass54_29.method1129(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 8 | arg0.anInt6547;
			local19 = (Class2_Sub5_Sub5) Static370.aClass85_3.method1935((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static96.aClass54_29.method1110(Static96.aClass54_29.method1129(local10));
			if (local31 == null) {
				local10 = arg0.anInt6547 | 0xFFFF00;
				local19 = (Class2_Sub5_Sub5) Static370.aClass85_3.method1935((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static96.aClass54_29.method1110(Static96.aClass54_29.method1129(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static212.method2824(local31);
					local19.aClass240_3 = arg0;
					Static370.aClass85_3.method1934((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static212.method2824(local31);
				local19.aClass240_3 = arg0;
				Static370.aClass85_3.method1934((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static212.method2824(local31);
			local19.aClass240_3 = arg0;
			Static370.aClass85_3.method1934((long) local10 << 16, local19);
			return local19;
		}
	}
}
