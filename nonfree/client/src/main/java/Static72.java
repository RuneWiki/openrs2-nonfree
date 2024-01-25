import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public static int anInt1772;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public static int anInt1773 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIZI)V")
	public static void method1408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static110.anInt2524 == 0 || arg0 == 0 || Static235.anInt4675 >= 50 || arg3 == -1) {
			return;
		}
		Static51.anIntArray205[Static235.anInt4675] = arg3;
		Static23.anIntArray726[Static235.anInt4675] = arg0;
		Static32.anIntArray133[Static235.anInt4675] = arg2;
		Static105.aClass68Array3[Static235.anInt4675] = null;
		Static138.anIntArray397[Static235.anInt4675] = 0;
		Static105.anIntArray754[Static235.anInt4675] = arg1;
		Static235.anInt4675++;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZ)I")
	public static int method1409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & local16 * (local16 * local16 * 15731 + 789221) + 1376312589;
		return local30 >> 19 & 0xFF;
	}
}
