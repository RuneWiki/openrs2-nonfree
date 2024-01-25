import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
	public static int anInt3770;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "[I")
	public static final int[] anIntArray166 = new int[13];

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	public static void method3193() throws IOException {
		if (Static226.aClass41_1 == null || Static120.anInt3032 <= 0) {
			return;
		}
		Static300.aClass6_Sub8_7.anInt10061 = 0;
		while (true) {
			@Pc(25) Class6_Sub17 local25 = (Class6_Sub17) Static574.aClass163_57.method4966();
			if (local25 == null || Static300.aClass6_Sub8_7.aByteArray102.length - Static300.aClass6_Sub8_7.anInt10061 < local25.anInt3094) {
				Static226.aClass41_1.method1728(Static300.aClass6_Sub8_7.anInt10061, Static300.aClass6_Sub8_7.aByteArray102);
				Static624.anInt10500 += Static300.aClass6_Sub8_7.anInt10061;
				Static360.anInt6970 = 0;
				return;
			}
			Static300.aClass6_Sub8_7.method8234(local25.aClass6_Sub8_Sub1_2.aByteArray102, local25.anInt3094, 0);
			Static120.anInt3032 -= local25.anInt3094;
			local25.method8792();
			local25.aClass6_Sub8_Sub1_2.method8218();
			local25.method2607();
		}
	}
}
