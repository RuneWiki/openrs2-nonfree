import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "Lclient!gp;")
	public static Class117 aClass117_83;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array8;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
	public static void method2812() {
		if (Static416.aBoolean524) {
			Static24.aClass25_9 = null;
			Static416.aBoolean524 = false;
			Static335.aClass25_18 = null;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZII)I")
	public static int method2813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(35) int local35 = (local16 * local16 * 15731 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)I")
	public static int method2814() {
		if (Static218.aBoolean250) {
			return 6;
		} else if (Static148.aClass5_Sub47_1 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static148.aClass5_Sub47_1.anInt8474;
			if (Static252.method4282(local19)) {
				return 1;
			} else if (Static225.method3574(local19)) {
				return 2;
			} else if (Static311.method5044(local19)) {
				return 3;
			} else if (Static448.method6334(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(FIF[BIIBFFFIILclient!vo;)V")
	public static void method2816(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6, @OriginalArg(12) Class304 arg7) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			Static448.method6331(arg4, arg0, arg7, local12, arg5, arg3, arg2, arg6, arg1);
			arg3 += 16384;
		}
	}
}
