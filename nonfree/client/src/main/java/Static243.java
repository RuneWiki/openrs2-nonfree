import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public static int anInt4420 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	public static void method3330(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static175.anInt3261 - Static195.anInt2839;
		if (local8 >= 100) {
			Static134.anInt2621 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static416.aFloat208;
		if (local17 < Static448.anInt7459 >> 8) {
			local17 = Static448.anInt7459 >> 8;
		}
		if (Static293.aBooleanArray21[4] && local17 < Static418.anIntArray625[4] + 128) {
			local17 = Static418.anIntArray625[4] + 128;
		}
		@Pc(59) int local59 = (int) Static146.aFloat82 + Static102.anInt2155 & 0x3FFF;
		Static108.method1688(local17, Static322.anInt5750, local59, arg0, (local17 >> 3) * 3 + 600 << 0, Static156.anInt2980, Static222.method3109(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062, Static221.anInt4855, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061) - 50);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static292.anInt5287 = (int) ((float) Static151.anInt2870 + (float) (Static292.anInt5287 - Static151.anInt2870) * local105);
		Static254.anInt4614 = (int) ((float) Static227.anInt4162 + (float) (Static254.anInt4614 - Static227.anInt4162) * local105);
		Static183.anInt3503 = (int) ((float) (Static183.anInt3503 - Static277.anInt4877) * local105 + (float) Static277.anInt4877);
		Static30.anInt696 = (int) ((float) Static60.anInt1574 + local105 * (float) (Static30.anInt696 - Static60.anInt1574));
		@Pc(156) int local156 = Static142.anInt2687 - Static370.anInt6532;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static142.anInt2687 = (int) ((float) Static370.anInt6532 + local105 * (float) local156);
		Static142.anInt2687 &= 0x3FFF;
	}
}
