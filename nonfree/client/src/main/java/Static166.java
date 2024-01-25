import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public static int anInt2973;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_109 = new Class221("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "[I")
	public static final int[] anIntArray332 = new int[14];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!pf;IB)Z")
	public static boolean method2718(@OriginalArg(0) Class2_Sub13_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method4257(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(109) int local109;
		if (local8 == 0) {
			if (arg0.method4257(1) != 0) {
				method2718(arg0, arg1);
			}
			local25 = arg0.method4257(6);
			local30 = arg0.method4257(6);
			@Pc(40) boolean local40 = arg0.method4257(1) == 1;
			if (local40) {
				Static367.anIntArray779[Static254.anInt4548++] = arg1;
			}
			if (Static90.aClass12_Sub1_Sub2_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(67) Class12_Sub1_Sub2_Sub2 local67 = Static90.aClass12_Sub1_Sub2_Sub2Array1[arg1] = new Class12_Sub1_Sub2_Sub2();
			local67.anInt5365 = arg1;
			if (Static290.aClass2_Sub13Array1[arg1] != null) {
				local67.method4714(Static290.aClass2_Sub13Array1[arg1]);
			}
			local67.method4703(Static203.anIntArray444[arg1]);
			local67.anInt5345 = Static299.anIntArray650[arg1];
			local95 = Static367.anIntArray780[arg1];
			local99 = local95 >> 28;
			local105 = local95 >> 14 & 0xFF;
			local109 = local95 & 0xFF;
			local67.aByteArray84[0] = Static258.aByteArray65[arg1];
			local67.aByte74 = (byte) local99;
			local67.method4722(local25 + (local105 << 6) - Static376.anInt6607, -Static133.anInt2474 + local30 + (local109 << 6));
			local67.anInt5396 = -1;
			return true;
		} else if (local8 == 1) {
			local25 = arg0.method4257(2);
			local30 = Static367.anIntArray780[arg1];
			Static367.anIntArray780[arg1] = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(194) int local194;
			@Pc(198) int local198;
			if (local8 != 2) {
				local25 = arg0.method4257(18);
				local30 = local25 >> 16;
				local194 = local25 >> 8 & 0xFF;
				local198 = local25 & 0xFF;
				local95 = Static367.anIntArray780[arg1];
				local99 = local30 + (local95 >> 28) & 0x3;
				local105 = local194 + (local95 >> 14) & 0xFF;
				local109 = local95 + local198 & 0xFF;
				Static367.anIntArray780[arg1] = (local105 << 14) + (local99 << 28) + local109;
				return false;
			}
			local25 = arg0.method4257(5);
			local30 = local25 >> 3;
			local194 = local25 & 0x7;
			local198 = Static367.anIntArray780[arg1];
			local95 = local30 + (local198 >> 28) & 0x3;
			local99 = local198 >> 14 & 0xFF;
			local105 = local198 & 0xFF;
			if (local194 == 0) {
				local99--;
				local105--;
			}
			if (local194 == 1) {
				local105--;
			}
			if (local194 == 2) {
				local99++;
				local105--;
			}
			if (local194 == 3) {
				local99--;
			}
			if (local194 == 4) {
				local99++;
			}
			if (local194 == 5) {
				local105++;
				local99--;
			}
			if (local194 == 6) {
				local105++;
			}
			if (local194 == 7) {
				local105++;
				local99++;
			}
			Static367.anIntArray780[arg1] = local105 + (local95 << 28) + (local99 << 14);
			return false;
		}
	}
}
