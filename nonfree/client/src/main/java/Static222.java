import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public static int anInt4524;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "[Lclient!g;")
	public static Class56[] aClass56Array2;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "I")
	public static int anInt4526;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "I")
	public static int anInt4533;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
	public static int[] anIntArray450 = new int[32];

	@OriginalMember(owner = "client!po", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[200];

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public static int anInt4523 = 0;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	public static int anInt4530 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method3672(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static315.method4761(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static145.method2549(arg1, local45);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method3675() {
		Static28.aClass157_6.method4027();
		Static154.aClass157_28.method4027();
		Static174.aClass157_32.method4027();
		Static204.aClass157_35.method4027();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([IIIIII)V")
	public static void method3676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class143 local13 = local7.aClass143_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4581;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class182 local58 = local7.aClass182_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt5697;
		@Pc(67) int local67 = local58.anInt5695;
		@Pc(70) int local70 = local58.anInt5698;
		@Pc(73) int local73 = local58.anInt5696;
		@Pc(77) int[] local77 = Static278.anIntArrayArray39[local23];
		@Pc(81) int[] local81 = Static107.anIntArrayArray6[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}
}
