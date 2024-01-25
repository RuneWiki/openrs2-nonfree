import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "Lclient!sq;")
	public static Class319 aClass319_3;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "[I")
	public static int[] anIntArray272 = null;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_81 = new Class200(69, 0);

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "[I")
	public static final int[] anIntArray273 = new int[4096];

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_82 = new Class200(27, 5);

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	public static int anInt4227 = 0;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	public static int anInt4228 = 1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public static void method3716() {
		for (@Pc(7) int local7 = 0; local7 < Static116.anInt2476; local7++) {
			Static566.aClass62Array4[local7] = null;
		}
		Static116.anInt2476 = 0;
		@Pc(30) int local30;
		@Pc(34) int local34;
		for (@Pc(26) int local26 = 0; local26 < Static395.anInt6810; local26++) {
			for (local30 = 0; local30 < Static595.anInt9881; local30++) {
				for (local34 = 0; local34 < Static389.anInt6693; local34++) {
					@Pc(44) Class84 local44 = Static348.aClass84ArrayArrayArray5[local26][local34][local30];
					if (local44 != null) {
						if (local44.aShort45 > 0) {
							local44.aShort45 = (short) (local44.aShort45 * -1);
						}
						if (local44.aShort46 > 0) {
							local44.aShort46 = (short) (local44.aShort46 * -1);
						}
					}
				}
			}
		}
		for (local30 = 0; local30 < Static395.anInt6810; local30++) {
			for (local34 = 0; local34 < Static595.anInt9881; local34++) {
				for (@Pc(99) int local99 = 0; local99 < Static389.anInt6693; local99++) {
					@Pc(109) Class84 local109 = Static348.aClass84ArrayArrayArray5[local30][local99][local34];
					if (local109 != null) {
						@Pc(132) boolean local132 = Static348.aClass84ArrayArrayArray5[0][local99][local34] != null && Static348.aClass84ArrayArrayArray5[0][local99][local34].aClass84_1 != null;
						@Pc(137) int local137;
						@Pc(139) int local139;
						@Pc(153) Class84 local153;
						@Pc(161) int local161;
						@Pc(322) int local322;
						@Pc(336) int local336;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(367) int local367;
						@Pc(371) int local371;
						@Pc(375) int local375;
						@Pc(381) int local381;
						@Pc(420) int local420;
						@Pc(424) int local424;
						if (local109.aShort45 < 0) {
							local137 = local34;
							local139 = local34;
							local153 = Static348.aClass84ArrayArrayArray5[local30][local99][local34 - 1];
							local161 = Static124.aClass91Array1[local30].method7447(local34, local99);
							while (local137 > 0 && local153 != null && local153.aShort45 < 0 && local153.aShort45 == local109.aShort45 && local153.aShort43 == local109.aShort43 && Static124.aClass91Array1[local30].method7447(local137 - 1, local99) == local161 && (local137 - 1 <= 0 || Static124.aClass91Array1[local30].method7447(local137 - 2, local99) == local161)) {
								local137--;
								local153 = Static348.aClass84ArrayArrayArray5[local30][local99][local137 - 1];
							}
							for (local153 = Static348.aClass84ArrayArrayArray5[local30][local99][local34 + 1]; Static389.anInt6693 > local139 && local153 != null && local153.aShort45 < 0 && local153.aShort45 == local109.aShort45 && local109.aShort43 == local153.aShort43 && local161 == Static124.aClass91Array1[local30].method7447(local139 + 1, local99) && (Static389.anInt6693 <= local139 + 1 || Static124.aClass91Array1[local30].method7447(local139 + 2, local99) == local161); local153 = Static348.aClass84ArrayArrayArray5[local30][local99][local139 + 1]) {
								local139++;
							}
							local322 = local30 + 1 - local30;
							local336 = Static124.aClass91Array1[local132 ? local30 + 1 : local30].method7447(local137, local99);
							local343 = local109.aShort45 * local322 + local336;
							local359 = Static124.aClass91Array1[local132 ? local30 + 1 : local30].method7447(local139 + 1, local99);
							local367 = local359 + local322 * local109.aShort45;
							local371 = local99 << Static326.anInt5713;
							local375 = local137 << Static326.anInt5713;
							local381 = Static519.anInt8387 + (local139 << Static326.anInt5713);
							Static566.aClass62Array4[Static116.anInt2476++] = new Class62(1, local30, local109.aShort43 + local371, local109.aShort43 + local371, local109.aShort43 + local371, local371 - -local109.aShort43, local336, local359, local367, local343, local375, local381, local381, local375);
							for (local420 = local30; local420 <= local30; local420++) {
								for (local424 = local137; local424 <= local139; local424++) {
									Static348.aClass84ArrayArrayArray5[local420][local99][local424].aShort45 = (short) (Static348.aClass84ArrayArrayArray5[local420][local99][local424].aShort45 * -1);
								}
							}
						}
						if (local109.aShort46 < 0) {
							local137 = local99;
							local139 = local99;
							local153 = Static348.aClass84ArrayArrayArray5[local30][local99 - 1][local34];
							local161 = Static124.aClass91Array1[local30].method7447(local34, local99);
							while (local137 > 0 && local153 != null && local153.aShort46 < 0 && local153.aShort46 == local109.aShort46 && local109.aShort44 == local153.aShort44 && Static124.aClass91Array1[local30].method7447(local34, local137 - 1) == local161 && (local137 - 1 <= 0 || local161 == Static124.aClass91Array1[local30].method7447(local34, local137 - 2))) {
								local137--;
								local153 = Static348.aClass84ArrayArrayArray5[local30][local137 - 1][local34];
							}
							for (local153 = Static348.aClass84ArrayArrayArray5[local30][local99 + 1][local34]; local139 < Static595.anInt9881 && local153 != null && local153.aShort46 < 0 && local109.aShort46 == local153.aShort46 && local153.aShort44 == local109.aShort44 && Static124.aClass91Array1[local30].method7447(local34, local139 + 1) == local161 && (local139 + 1 >= Static595.anInt9881 || Static124.aClass91Array1[local30].method7447(local34, local139 + 2) == local161); local153 = Static348.aClass84ArrayArrayArray5[local30][local139 + 1][local34]) {
								local139++;
							}
							local322 = local30 + 1 - local30;
							local336 = Static124.aClass91Array1[local132 ? local30 + 1 : local30].method7447(local34, local137);
							local343 = local109.aShort46 * local322 + local336;
							local359 = Static124.aClass91Array1[local132 ? local30 + 1 : local30].method7447(local34, local139 + 1);
							local367 = local109.aShort46 * local322 + local359;
							local371 = local137 << Static326.anInt5713;
							local375 = Static519.anInt8387 + (local139 << Static326.anInt5713);
							local381 = local34 << Static326.anInt5713;
							Static566.aClass62Array4[Static116.anInt2476++] = new Class62(2, local30, local371, local375, local375, local371, local336, local359, local367, local343, local109.aShort44 + local381, local381 - -local109.aShort44, local109.aShort44 + local381, local109.aShort44 + local381);
							for (local420 = local30; local420 <= local30; local420++) {
								for (local424 = local137; local424 <= local139; local424++) {
									Static348.aClass84ArrayArrayArray5[local420][local424][local34].aShort46 = (short) (Static348.aClass84ArrayArrayArray5[local420][local424][local34].aShort46 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static525.aBoolean613 = true;
	}
}
