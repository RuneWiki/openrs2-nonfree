import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!r;")
	public static Class45 aClass45_8;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_28 = new Class6(64);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public static void method3990() {
		if (!Static336.method4786()) {
			return;
		}
		if (Static421.aStringArray28 == null) {
			Static75.method1576();
		}
		Static561.aBoolean225 = true;
		Static202.anInt3741 = 0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I[BBI)I")
	public static int method3992(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = -1;
		for (@Pc(17) int local17 = arg2; local17 < arg0; local17++) {
			local15 = Class2_Sub2.anIntArray468[(arg1[local17] ^ local15) & 0xFF] ^ local15 >>> 8;
		}
		return ~local15;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILclient!hfa;Lclient!hfa;)V")
	public static void method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41_Sub2_Sub3 arg3, @OriginalArg(4) Class41_Sub2_Sub3 arg4) {
		@Pc(4) Class299 local4 = Static12.method6301(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass41_Sub2_Sub3_1 = arg3;
		local4.aClass41_Sub2_Sub3_2 = arg4;
		@Pc(19) int local19 = Static68.aClass34Array1 == Static426.aClass34Array5 ? 1 : 0;
		if (!arg3.method7847()) {
			Static533.aClass41_Sub2ArrayArray2[local19][Static505.anIntArray524[local19]++] = arg3;
		} else if (arg3.method7851()) {
			Static548.aClass41_Sub2ArrayArray3[local19][Static462.anIntArray496[local19]++] = arg3;
		} else {
			Static417.aClass41_Sub2ArrayArray1[local19][Static279.anIntArray622[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7847()) {
			if (arg4.method7851()) {
				Static548.aClass41_Sub2ArrayArray3[local19][Static462.anIntArray496[local19]++] = arg4;
				return;
			}
			Static417.aClass41_Sub2ArrayArray1[local19][Static279.anIntArray622[local19]++] = arg4;
			return;
		}
		Static533.aClass41_Sub2ArrayArray2[local19][Static505.anIntArray524[local19]++] = arg4;
	}
}
