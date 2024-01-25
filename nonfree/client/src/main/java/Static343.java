import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "Lclient!wv;")
	public static Class269 aClass269_11;

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "[I")
	public static final int[] anIntArray403 = new int[1];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)V")
	public static void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = Static55.aClass210_1.method4758(Static115.aClass256_129.method5720(Static272.anInt7537));
		@Pc(28) int local28;
		for (@Pc(22) Class2_Sub26 local22 = (Class2_Sub26) Static288.aClass265_41.method6005(); local22 != null; local22 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			local28 = Static317.method4542(local22);
			if (local17 < local28) {
				local17 = local28;
			}
		}
		local17 += 8;
		local28 = Static168.anInt3255 * 16 + 21;
		@Pc(54) int local54 = arg1 - local17 / 2;
		if (Static96.anInt2175 < local17 + local54) {
			local54 = Static96.anInt2175 - local17;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(77) int local77 = arg0;
		if (Static216.anInt4171 < arg0 + local28) {
			local77 = Static216.anInt4171 - local28;
		}
		Static346.anInt6104 = local54;
		if (local77 < 0) {
			local77 = 0;
		}
		Static117.anInt2356 = local77;
		Static85.anInt3261 = local17;
		Static237.aBoolean384 = true;
		Static447.anInt4684 = Static168.anInt3255 * 16 + (Static417.aBoolean624 ? 26 : 22);
	}
}
