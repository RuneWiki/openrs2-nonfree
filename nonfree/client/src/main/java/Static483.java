import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "[I")
	public static final int[] anIntArray646 = new int[8];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method6971() throws IOException {
		if (Static487.aClass30_2 == null || Static54.anInt826 <= 0) {
			return;
		}
		Static159.aClass5_Sub12_1.anInt10154 = 0;
		while (true) {
			@Pc(20) Class5_Sub40 local20 = (Class5_Sub40) Static50.aClass306_8.method7313();
			if (local20 == null || Static159.aClass5_Sub12_1.aByteArray104.length - Static159.aClass5_Sub12_1.anInt10154 < local20.anInt7278) {
				Static487.aClass30_2.method672(Static159.aClass5_Sub12_1.anInt10154, Static159.aClass5_Sub12_1.aByteArray104);
				Static399.anInt6930 += Static159.aClass5_Sub12_1.anInt10154;
				Static294.anInt4739 = 0;
				break;
			}
			Static159.aClass5_Sub12_1.method8651(0, local20.aClass5_Sub12_Sub2_2.aByteArray104, local20.anInt7278);
			Static54.anInt826 -= local20.anInt7278;
			local20.method8911();
			local20.aClass5_Sub12_Sub2_2.method8637();
			local20.method6449();
		}
	}
}
