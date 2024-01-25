import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	public static final int anInt1677 = 1401;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method1618() throws IOException {
		if (Static673.aClass160_3 == null || Static337.anInt6127 <= 0) {
			return;
		}
		Static497.aClass3_Sub17_7.lb = 0;
		while (true) {
			@Pc(20) Class3_Sub44 local20 = (Class3_Sub44) Static584.aClass193_62.method4457();
			if (local20 == null || Static497.aClass3_Sub17_7.aByteArray59.length - Static497.aClass3_Sub17_7.lb < local20.anInt8295) {
				Static673.aClass160_3.method3508(Static497.aClass3_Sub17_7.aByteArray59, Static497.aClass3_Sub17_7.lb);
				Static78.anInt1752 += Static497.aClass3_Sub17_7.lb;
				Static607.anInt9516 = 0;
				break;
			}
			Static497.aClass3_Sub17_7.method4838(0, local20.anInt8295, local20.aClass3_Sub17_Sub2_3.aByteArray59);
			Static337.anInt6127 -= local20.anInt8295;
			local20.method8770();
			local20.aClass3_Sub17_Sub2_3.method4845();
			local20.method7015();
		}
	}
}
