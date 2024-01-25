import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	public static void method7463() throws IOException {
		if (Static57.aClass116_1 == null || Static445.anInt7786 <= 0) {
			return;
		}
		@Pc(7) int local7 = 0;
		while (true) {
			@Pc(12) Class2_Sub42 local12 = (Class2_Sub42) Static262.aClass8_27.method210();
			if (local12 == null) {
				Static354.anInt4541 = 0;
				Static265.anInt4876 += local7;
				break;
			}
			Static57.aClass116_1.method2478(local12.aClass2_Sub15_Sub2_2.aByteArray62, local12.anInt8409);
			Static445.anInt7786 -= local12.anInt8409;
			local7 += local12.anInt8409;
			local12.method7966();
			local12.aClass2_Sub15_Sub2_2.method4312();
			local12.method6996();
		}
	}
}
