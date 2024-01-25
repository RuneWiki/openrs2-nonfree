import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray15;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[Lclient!lp;")
	public static final Class125[] aClass125Array11 = new Class125[8];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class3_Sub42 local12 = null;
		for (@Pc(17) Class3_Sub42 local17 = (Class3_Sub42) Static83.aClass127_3.method3402(); local17 != null; local17 = (Class3_Sub42) Static83.aClass127_3.method3400()) {
			if (local17.anInt6538 == arg7 && arg4 == local17.anInt6544 && arg5 == local17.anInt6546 && arg6 == local17.anInt6539) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class3_Sub42();
			local12.anInt6539 = arg6;
			local12.anInt6546 = arg5;
			local12.anInt6544 = arg4;
			local12.anInt6538 = arg7;
			Static164.method5310(local12);
			Static83.aClass127_3.method3387(local12);
		}
		local12.anInt6536 = arg3;
		local12.anInt6549 = arg1;
		local12.anInt6545 = arg2;
		local12.anInt6543 = arg0;
		local12.anInt6541 = arg8;
	}
}
