import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Lclient!ub;")
	public static Class163 aClass163_6;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "J")
	public static long aLong83 = 0L;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "Lclient!gd;")
	public static Class61 aClass61_16 = new Class61(4);

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	public static int anInt2226 = -1;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!pk;I)V")
	public static void method1714(@OriginalArg(0) Class132 arg0) {
		Static173.aClass43_Sub2Array2 = Static249.method3694(arg0, Static61.anInt1335);
		Static99.anIntArray147 = new int[256];
		@Pc(19) int local19;
		for (local19 = 0; local19 < 3; local19++) {
			@Pc(31) float local31 = (float) (Static284.anIntArray489[local19] >> 16 & 0xFF);
			@Pc(41) int local41 = Static284.anIntArray489[local19 + 1] >> 16 & 0xFF;
			@Pc(48) float local48 = ((float) local41 - local31) / 64.0F;
			@Pc(57) float local57 = (float) (Static284.anIntArray489[local19] >> 8 & 0xFF);
			@Pc(64) float local64 = (float) (Static284.anIntArray489[local19] & 0xFF);
			@Pc(74) int local74 = Static284.anIntArray489[local19 + 1] >> 8 & 0xFF;
			@Pc(82) float local82 = ((float) local74 - local57) / 64.0F;
			@Pc(90) int local90 = Static284.anIntArray489[local19 + 1] & 0xFF;
			@Pc(97) float local97 = ((float) local90 - local64) / 64.0F;
			for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
				Static99.anIntArray147[local19 * 64 + local99] = (int) local64 | (int) local31 << 16 | (int) local57 << 8;
				local31 += local48;
				local64 += local97;
				local57 += local82;
			}
		}
		for (local19 = 192; local19 < 255; local19++) {
			Static99.anIntArray147[local19] = Static284.anIntArray489[3];
		}
		Static69.anIntArray104 = new int[32768];
		Static35.anIntArray57 = new int[32768];
		Static285.method4247(null);
		Static185.anIntArray274 = new int[32768];
		Static38.anIntArray59 = new int[32768];
		Static167.aClass8_Sub1_Sub7_Sub1_5 = new Class8_Sub1_Sub7_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
	public static void method1716(@OriginalArg(0) int arg0) {
		Static233.method3553(Static233.anInt4710, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static233.method3550(-50.0F, -60.0F, -50.0F);
		Static233.method3546(Static233.anInt4709, 0, false);
		Static233.method3551();
	}
}
