import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "D")
	public static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method47() throws IOException {
		if (Static258.aClass97_2 == null || Static574.anInt9875 <= 0) {
			return;
		}
		Static676.aClass14_Sub29_10.anInt7264 = 0;
		while (true) {
			@Pc(16) Class14_Sub19 local16 = (Class14_Sub19) Static454.aClass262_45.method6318();
			if (local16 == null || local16.anInt2685 > Static676.aClass14_Sub29_10.aByteArray84.length - Static676.aClass14_Sub29_10.anInt7264) {
				Static258.aClass97_2.method2289(Static676.aClass14_Sub29_10.aByteArray84, Static676.aClass14_Sub29_10.anInt7264);
				Static535.anInt9237 += Static676.aClass14_Sub29_10.anInt7264;
				Static287.anInt4907 = 0;
				break;
			}
			Static676.aClass14_Sub29_10.method5838(0, local16.aClass14_Sub29_Sub1_1.aByteArray84, local16.anInt2685);
			Static574.anInt9875 -= local16.anInt2685;
			local16.method9315();
			local16.aClass14_Sub29_Sub1_1.method5872();
			local16.method2220();
		}
	}
}
