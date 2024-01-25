import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
	public static void method8610() {
		if (Static407.aClass3_Sub6_Sub20_1 != null) {
			Static407.aClass3_Sub6_Sub20_1 = null;
			Static471.method8502(Static382.anInt6708, Static226.anInt6457, Static505.anInt8464, Static274.anInt5127);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIB)I")
	public static int method8611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static338.aByteArrayArrayArray13[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static338.aByteArrayArrayArray13[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
