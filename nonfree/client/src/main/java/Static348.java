import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
	public static int anInt4696;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "[I")
	public static final int[] anIntArray391 = new int[13];

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
	public static final int anInt4695 = 328;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "Lclient!di;")
	public static final Class54 aClass54_67 = new Class54(1, 2);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	public static void method3781() {
		Static261.method3930(Static12.aClass79_Sub1_1.anInt4929);
		@Pc(17) int local17 = (Static364.anInt6270 >> 10) + (Static48.anInt962 >> 3);
		Static383.anInt6436 = Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 = 0;
		@Pc(30) int local30 = (Static324.anInt5624 >> 3) + (Static23.anInt567 >> 10);
		Static375.aClass3_Sub2_Sub1_Sub2_7.method4948(8, 8);
		Static129.aByteArrayArray22 = new byte[18][];
		Static98.anIntArray183 = new int[18];
		Static300.anIntArray434 = new int[18];
		Static248.aByteArrayArray36 = new byte[18][];
		Static182.anIntArray313 = new int[18];
		Static86.anIntArray372 = new int[18];
		Static450.aByteArrayArray63 = new byte[18][];
		Static334.anIntArray494 = new int[18];
		Static142.anIntArray270 = new int[18];
		Static182.anIntArrayArray34 = new int[18][4];
		Static423.aByteArrayArray64 = new byte[18][];
		Static428.aByteArrayArray59 = new byte[18][];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(84) int local84 = (local17 - (Static229.anInt4427 >> 4)) / 8; local84 <= (local17 + (Static229.anInt4427 >> 4)) / 8; local84++) {
			for (local95 = (local30 - (Static379.anInt6422 >> 4)) / 8; local95 <= ((Static379.anInt6422 >> 4) + local30) / 8; local95++) {
				@Pc(103) int local103 = (local84 << 8) + local95;
				Static334.anIntArray494[local76] = local103;
				Static86.anIntArray372[local76] = Static368.aClass160_73.method3704("m" + local84 + "_" + local95);
				Static98.anIntArray183[local76] = Static368.aClass160_73.method3704("l" + local84 + "_" + local95);
				Static300.anIntArray434[local76] = Static368.aClass160_73.method3704("n" + local84 + "_" + local95);
				Static142.anIntArray270[local76] = Static368.aClass160_73.method3704("um" + local84 + "_" + local95);
				Static182.anIntArray313[local76] = Static368.aClass160_73.method3704("ul" + local84 + "_" + local95);
				if (Static300.anIntArray434[local76] == -1) {
					Static86.anIntArray372[local76] = -1;
					Static98.anIntArray183[local76] = -1;
					Static142.anIntArray270[local76] = -1;
					Static182.anIntArray313[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static300.anIntArray434.length; local95++) {
			Static300.anIntArray434[local95] = -1;
			Static86.anIntArray372[local95] = -1;
			Static98.anIntArray183[local95] = -1;
			Static142.anIntArray270[local95] = -1;
			Static182.anIntArray313[local95] = -1;
		}
		Static187.method2965(true, local30, local17, false);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public static void method3783() {
		Static139.method2377((long) Static131.anInt2821, Static33.aClass49_1);
		if (Static410.anInt6841 != -1) {
			Static131.method2234(Static410.anInt6841);
		}
		for (@Pc(21) int local21 = 0; local21 < Static104.anInt2441; local21++) {
			if (Static243.aBooleanArray19[local21]) {
				Static367.aBooleanArray23[local21] = true;
			}
			Static345.aBooleanArray21[local21] = Static243.aBooleanArray19[local21];
			Static243.aBooleanArray19[local21] = false;
		}
		Static245.anInt6498 = Static131.anInt2821;
		if (Static33.aClass49_1.method4465()) {
			Static103.aBoolean171 = true;
		}
		if (Static410.anInt6841 != -1) {
			Static104.anInt2441 = 0;
			Static363.method4954();
		}
		Static33.aClass49_1.e();
		Static10.method226(Static368.anInt6315);
		Static377.anInt6400 = 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(CI)Z")
	public static boolean method3785(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static407.aCharArray6;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (arg0 == local37) {
					return true;
				}
			}
		}
		return false;
	}
}
