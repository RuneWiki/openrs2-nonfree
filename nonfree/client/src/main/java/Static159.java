import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fha", name = "I", descriptor = "[I")
	public static int[] anIntArray614;

	@OriginalMember(owner = "client!fha", name = "C", descriptor = "Lclient!tda;")
	public static final Class334 aClass334_8 = new Class334();

	@OriginalMember(owner = "client!fha", name = "H", descriptor = "I")
	public static int anInt8121 = -1;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 3);
		local9.method2817();
		local9.aString44 = arg1;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIB)I")
	public static int method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static312.method4987(4, arg1 + 45365, arg0 + 91923) + (Static312.method4987(2, arg1 + 10294, arg0 - -37821) - 128 >> 1) + (Static312.method4987(1, arg1, arg0) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}
}
