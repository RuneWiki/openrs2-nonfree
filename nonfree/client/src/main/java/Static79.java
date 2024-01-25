import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt10464 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!pca;I)I")
	public static int method8447(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		@Pc(6) Class169 local6 = arg0.aClass169_1;
		if (local6.anIntArray306 != null) {
			local6 = local6.method4177(Static588.aClass322_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local6.anInt4992;
		@Pc(25) Class171 local25 = arg0.method6316();
		if (arg0.aBoolean645) {
			local21 = local6.anInt4993;
		} else if (local25.anInt5079 == arg0.anInt7655 || arg0.anInt7655 == local25.anInt5082 || local25.anInt5094 == arg0.anInt7655 || local25.anInt5113 == arg0.anInt7655) {
			local21 = local6.anInt4969;
		} else if (arg0.anInt7655 == local25.anInt5115 || local25.anInt5080 == arg0.anInt7655 || arg0.anInt7655 == local25.anInt5117 || local25.anInt5104 == arg0.anInt7655) {
			local21 = local6.anInt4990;
		}
		return local21;
	}
}
