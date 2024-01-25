import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	public static int anInt525 = -1;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public static void method619() {
		Static294.method4658();
		Static491.method6549();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!vc;[[BB)V")
	public static void method620(@OriginalArg(0) Class200_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(23) int local23 = arg1.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) byte[] local31 = arg1[local25];
			if (local31 != null) {
				@Pc(38) Class2_Sub29 local38 = new Class2_Sub29(local31);
				local44 = Static444.anIntArray613[local25] >> 8;
				@Pc(50) int local50 = Static444.anIntArray613[local25] & 0xFF;
				@Pc(57) int local57 = local44 * 64 - Static238.anInt4280;
				@Pc(64) int local64 = local50 * 64 - Static371.anInt6936;
				Static491.method6549();
				arg0.method7398(local38, local57, Static371.anInt6936, local64, Static207.aClass99Array1, Static238.anInt4280);
				arg0.method7416(Static103.aClass39_3, local38, local57, local64, local12);
				if (!arg0.aBoolean639 && local44 == Static367.anInt6894 / 8 && Static46.anInt834 / 8 == local50 && local12[0] != -1) {
					Static26.aClass191_1 = Static222.aClass299_2.method7461(Static171.aClass131_1, local12[1], local12[0], local12[3], local12[2]);
					Static120.anInt2435 = local12[4];
				}
			}
		}
		for (@Pc(141) int local141 = 0; local141 < local23; local141++) {
			@Pc(153) int local153 = (Static444.anIntArray613[local141] >> 8) * 64 - Static238.anInt4280;
			local44 = (Static444.anIntArray613[local141] & 0xFF) * 64 - Static371.anInt6936;
			@Pc(167) byte[] local167 = arg1[local141];
			if (local167 == null && Static46.anInt834 < 800) {
				Static491.method6549();
				arg0.method7404(local44, local153);
			}
		}
	}
}
