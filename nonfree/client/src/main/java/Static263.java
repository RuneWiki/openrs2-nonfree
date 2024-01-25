import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	public static int anInt4756;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Lclient!he;")
	public static Class100 aClass100_51;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt4747 = 0;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt4750 = 0;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_253 = new Class123(55, 6);

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4753 = 0;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	public static int[] anIntArray322 = new int[2];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIB)V")
	public static void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg0 << 1;
		@Pc(45) int local45 = local29 + (1 - local37) * local21;
		@Pc(54) int local54 = local25 - local33 * (local37 - 1);
		@Pc(58) int local58 = local21 << 2;
		@Pc(62) int local62 = local25 << 2;
		@Pc(70) int local70 = local29 * 3;
		@Pc(78) int local78 = ((arg0 << 1) - 3) * local33;
		@Pc(84) int local84 = local62;
		@Pc(90) int local90 = (arg0 - 1) * local58;
		Static298.method4405(Static62.anIntArrayArray7[arg3], arg4, arg1 + arg2, -arg2 + arg1);
		while (local17 > 0) {
			if (local45 < 0) {
				while (local45 < 0) {
					local54 += local84;
					local45 += local70;
					local84 += local62;
					local70 += local62;
					local7++;
				}
			}
			if (local54 < 0) {
				local45 += local70;
				local54 += local84;
				local84 += local62;
				local7++;
				local70 += local62;
			}
			local54 += -local78;
			local45 += -local90;
			local17--;
			local90 -= local58;
			local78 -= local58;
			@Pc(177) int local177 = arg3 - local17;
			@Pc(182) int local182 = arg3 + local17;
			@Pc(186) int local186 = local7 + arg1;
			@Pc(191) int local191 = arg1 - local7;
			Static298.method4405(Static62.anIntArrayArray7[local177], arg4, local186, local191);
			Static298.method4405(Static62.anIntArrayArray7[local182], arg4, local186, local191);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public static void method4004(@OriginalArg(0) int arg0) {
		Static300.anInt5297 = arg0;
		Static97.aClass44_7.method1351();
	}
}
