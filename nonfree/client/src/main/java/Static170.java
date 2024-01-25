import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
	public static int anInt3899;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!iaa;I)Lclient!kda;")
	public static Class101 method3473(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(12) Class148 local12 = Static38.method1094()[arg0.method4966()];
		@Pc(21) Class49 local21 = Static131.method2521()[arg0.method4966()];
		@Pc(30) int local30 = arg0.method4974();
		@Pc(34) int local34 = arg0.method4974();
		@Pc(38) int local38 = arg0.method4999();
		@Pc(42) int local42 = arg0.method4999();
		@Pc(46) int local46 = arg0.method5000();
		return new Class101(local12, local21, local30, local34, local38, local42, local46);
	}
}
