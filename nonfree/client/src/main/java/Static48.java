import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!di", name = "h", descriptor = "[Lclient!lb;")
	public static Class46_Sub1[] aClass46_Sub1Array1;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public static int anInt1149;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!vl;")
	public static Class186 aClass186_5 = new Class186(8);

	@OriginalMember(owner = "client!di", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZIILclient!kc;II)Z")
	public static boolean method956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92 arg3) {
		@Pc(6) Class44 local6 = Static102.method729(arg3.anInt3197);
		if (local6.anInt1339 == -1) {
			return true;
		}
		if (arg3.aBoolean206) {
			@Pc(31) int local31 = arg2 + arg3.anInt3208;
			arg2 = local31 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(42) Class46_Sub1 local42 = local6.method1107(arg2, arg3.aBoolean196);
		if (local42 == null) {
			return false;
		}
		@Pc(50) int local50 = arg3.anInt3182;
		@Pc(53) int local53 = arg3.anInt3227;
		if ((arg2 & 0x1) == 1) {
			local53 = arg3.anInt3182;
			local50 = arg3.anInt3227;
		}
		@Pc(72) int local72 = local42.anInt4747;
		@Pc(75) int local75 = local42.anInt4745;
		if (local6.aBoolean93) {
			local72 = local50 * 4;
			local75 = local53 * 4;
		}
		if (local6.anInt1341 == 0) {
			local42.method2477(arg1 * 4 + 48, (104 - (arg0 + local50)) * 4 + 48, local75, local72);
		} else {
			local42.method2474(arg1 * 4 + 48, (-local50 + 104 - arg0) * 4 + 48, local75, local72, local6.anInt1341);
		}
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B[I[J)V")
	public static void method957(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static80.method1350(arg0, 0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static170.anInt3814 <= arg5 && arg5 <= Static310.anInt6206 && arg6 >= Static170.anInt3814 && arg6 <= Static310.anInt6206 && Static170.anInt3814 <= arg4 && Static310.anInt6206 >= arg4 && arg3 >= Static170.anInt3814 && Static310.anInt6206 >= arg3 && arg1 >= Static206.anInt4449 && arg1 <= Static90.anInt2088 && Static206.anInt4449 <= arg8 && Static90.anInt2088 >= arg8 && Static206.anInt4449 <= arg0 && Static90.anInt2088 >= arg0 && arg2 >= Static206.anInt4449 && arg2 <= Static90.anInt2088) {
			Static288.method4419(arg6, arg3, arg2, arg0, arg5, arg8, arg7, arg4, arg1);
		} else {
			Static10.method303(arg0, arg5, arg6, arg3, arg4, arg2, arg8, arg1, arg7);
		}
	}
}
