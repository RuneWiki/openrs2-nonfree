import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "Lclient!bg;")
	public static Class34_Sub1 aClass34_Sub1_2;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "I")
	public static int anInt10280;

	@OriginalMember(owner = "client!wda", name = "G", descriptor = "Lclient!dia;")
	public static Class79 aClass79_3;

	@OriginalMember(owner = "client!wda", name = "J", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "Z")
	public static boolean aBoolean748 = false;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "(I)V")
	public static void method8576() throws IOException {
		if (Static537.aClass240_34 == null || Static252.anInt4009 <= 0) {
			return;
		}
		Static203.aClass5_Sub15_4.anInt4144 = 0;
		while (true) {
			@Pc(15) Class5_Sub16 local15 = (Class5_Sub16) Static130.aClass124_20.method2572();
			if (local15 == null || local15.anInt1726 > Static203.aClass5_Sub15_4.aByteArray45.length - Static203.aClass5_Sub15_4.anInt4144) {
				Static537.aClass240_34.method5660(Static203.aClass5_Sub15_4.anInt4144, Static203.aClass5_Sub15_4.aByteArray45);
				Static126.anInt2181 += Static203.aClass5_Sub15_4.anInt4144;
				Static53.anInt4077 = 0;
				break;
			}
			Static203.aClass5_Sub15_4.method3685(local15.aClass5_Sub15_Sub2_1.aByteArray45, local15.anInt1726, 0);
			Static252.anInt4009 -= local15.anInt1726;
			local15.method8829();
			local15.aClass5_Sub15_Sub2_1.method3678();
			local15.method1619();
		}
	}
}
