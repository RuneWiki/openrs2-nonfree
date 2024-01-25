import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "Lclient!vea;")
	public static Class349 aClass349_1;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_45 = new Class56(62, -2);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1566(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static542.method7210(local13) : local13;
		} else if (arg1 instanceof Class175) {
			@Pc(27) Class175 local27 = (Class175) arg1;
			return local27.method4134();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII[FFIIIIIF)V")
	public static void method1567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg1 - arg6;
		@Pc(13) int local13 = arg5 - arg8;
		@Pc(22) int local22 = arg0 - arg7;
		@Pc(43) float local43 = (float) local5 * arg2[1] + (float) local13 * arg2[0] + (float) local22 * arg2[2];
		@Pc(64) float local64 = arg2[4] * (float) local5 + (float) local13 * arg2[3] + (float) local22 * arg2[5];
		@Pc(85) float local85 = (float) local5 * arg2[7] + arg2[6] * (float) local13 + arg2[8] * (float) local22;
		@Pc(96) float local96 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local96 *= arg3;
		}
		@Pc(110) float local110 = arg9 + local64 + 0.5F;
		@Pc(121) float local121;
		if (arg4 == 1) {
			local121 = local96;
			local96 = -local110;
			local110 = local121;
		} else if (arg4 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg4 == 3) {
			local121 = local96;
			local96 = local110;
			local110 = -local121;
		}
		Static196.aFloat202 = local110;
		Static237.aFloat99 = local96;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)I")
	public static int method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + (((arg1 & 0xFF) >> 2 << 10) + (arg2 >> 1));
	}
}
