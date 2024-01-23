import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "I")
	public static int anInt4430 = 0;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[C")
	public static char[] aCharArray5 = new char[128];

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!vl;")
	public static Class186 aClass186_19 = new Class186(512);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!wf;BIIIILclient!ml;)V")
	public static void method3254(@OriginalArg(0) Class191 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub3_Sub13 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static106.anInt2378 == 4) {
			local17 = (int) Static62.aFloat16 & 0x7FF;
		} else {
			local17 = Static220.anInt4691 + (int) Static62.aFloat16 & 0x7FF;
		}
		@Pc(35) int local35 = arg2 * arg2 + arg3 * arg3;
		@Pc(47) int local47 = Math.max(arg0.anInt6088 / 2, arg0.anInt6128 / 2) + 10;
		if (local35 > local47 * local47) {
			return;
		}
		@Pc(61) int local61 = Class146.anIntArray461[local17];
		@Pc(65) int local65 = Class146.anIntArray463[local17];
		if (Static106.anInt2378 != 4) {
			local65 = local65 * 256 / (Static253.anInt5117 + 256);
			local61 = local61 * 256 / (Static253.anInt5117 + 256);
		}
		@Pc(94) int local94 = local61 * arg3 + local65 * arg2 >> 16;
		@Pc(104) int local104 = arg3 * local65 - arg2 * local61 >> 16;
		if (Static294.aBoolean367) {
			((Class1_Sub3_Sub13_Sub1) arg5).method2670(arg0.anInt6088 / 2 + arg4 + local94 - arg5.anInt5572 / 2, -local104 + (arg1 + arg0.anInt6128 / 2 - arg5.anInt5575 / 2), (Class1_Sub3_Sub13_Sub1) arg0.method4674(false));
		} else {
			((Class1_Sub3_Sub13_Sub2) arg5).method4228(arg4 + arg0.anInt6088 / 2 + local94 - arg5.anInt5572 / 2, -(arg5.anInt5575 / 2) + arg0.anInt6128 / 2 + arg1 + -local104, arg0.anIntArray557, arg0.anIntArray554);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)I")
	public static int method3255(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)I")
	public static int method3256(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IBLclient!th;I)Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2 method3258(@OriginalArg(2) Class168 arg0, @OriginalArg(3) int arg1) {
		return Static131.method2257(0, arg0, arg1) ? Static185.method3007() : null;
	}
}
