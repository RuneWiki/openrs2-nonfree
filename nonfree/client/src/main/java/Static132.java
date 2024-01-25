import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	public static int anInt2502;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Z")
	public static boolean method2090() {
		try {
			return Static380.method5627();
		} catch (@Pc(15) IOException local15) {
			Static244.method3987();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(80) String local80 = "T2 - " + (Static296.aClass234_104 == null ? -1 : Static296.aClass234_104.method5350()) + "," + (Static222.aClass234_79 == null ? -1 : Static222.aClass234_79.method5350()) + "," + (Static12.aClass234_6 == null ? -1 : Static12.aClass234_6.method5350()) + " - " + Static203.anInt3616 + "," + (Static21.anInt265 + Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0]) + "," + (Static103.anInt2044 + Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0]) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static203.anInt3616 && local82 < 50; local82++) {
				local80 = local80 + Static26.aClass3_Sub5_Sub1_2.aByteArray42[local82] + ",";
			}
			Static355.method5328(local80, local20);
			Static53.method988();
			return true;
		}
	}
}
