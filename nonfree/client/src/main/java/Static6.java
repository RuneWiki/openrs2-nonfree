import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	public static void method156(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static378.anInt4244 - Static146.anInt2814;
		if (local8 >= 100) {
			Static345.anInt5797 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static201.aFloat56;
		if (Static247.anInt7104 >> 8 > local17) {
			local17 = Static247.anInt7104 >> 8;
		}
		if (Static62.aBooleanArray8[4] && Static458.anIntArray663[4] + 128 > local17) {
			local17 = Static458.anIntArray663[4] + 128;
		}
		@Pc(54) int local54 = Static444.anInt7150 + (int) Static142.aFloat89 & 0x3FFF;
		Static188.method2961(Static301.method4312(Static357.anInt5881, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298) - 50, Static299.anInt698, (local17 >> 3) * 3 + 600 << 0, arg0, Static3.anInt108, local54, local17);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static139.anInt2727 = (int) ((float) (Static139.anInt2727 - Static347.anInt5820) * local99 + (float) Static347.anInt5820);
		Static92.anInt1946 = (int) ((float) Static144.anInt2775 + (float) (Static92.anInt1946 - Static144.anInt2775) * local99);
		Static142.anInt5535 = (int) (local99 * (float) (Static142.anInt5535 - Static129.anInt3957) + (float) Static129.anInt3957);
		Static296.anInt5167 = (int) ((float) Static332.anInt5659 + (float) (Static296.anInt5167 - Static332.anInt5659) * local99);
		@Pc(157) int local157 = Static406.anInt6527 - Static191.anInt3421;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static406.anInt6527 = (int) ((float) Static191.anInt3421 + local99 * (float) local157);
		Static406.anInt6527 &= 0x3FFF;
	}
}
