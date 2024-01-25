import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
	public static int[] anIntArray641;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!tr;")
	public static final Class332 aClass332_6 = new Class332();

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V")
	public static void method8179() throws IOException {
		if (Static272.aClass116_1 == null || Static36.anInt788 <= 0) {
			return;
		}
		@Pc(10) int local10 = 0;
		while (true) {
			@Pc(17) Class2_Sub52 local17 = (Class2_Sub52) Static399.aClass341_45.method8524();
			if (local17 == null) {
				Static201.anInt4634 = 0;
				Static312.anInt6434 += local10;
				break;
			}
			Static272.aClass116_1.method3746(local17.anInt11005, local17.aClass2_Sub11_Sub2_7.aByteArray128);
			local10 += local17.anInt11005;
			Static36.anInt788 -= local17.anInt11005;
			local17.method9253();
			local17.aClass2_Sub11_Sub2_7.method8356();
			local17.method9196();
		}
	}
}
