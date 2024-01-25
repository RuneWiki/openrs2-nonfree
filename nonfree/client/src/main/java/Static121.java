import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "Lclient!wb;")
	public static Class382 aClass382_1;

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean154 = false;

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V")
	public static void method2176() {
		for (@Pc(12) int local12 = 0; local12 < Static658.anInt10393; local12++) {
			Static220.aClass292Array62[local12] = null;
		}
		Static658.anInt10393 = 0;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (@Pc(30) int local30 = 0; local30 < Static539.anInt8345; local30++) {
			for (local34 = 0; local34 < Static51.anInt1108; local34++) {
				for (local38 = 0; local38 < Static245.anInt7888; local38++) {
					@Pc(48) Class73 local48 = Static267.aClass73ArrayArrayArray2[local30][local38][local34];
					if (local48 != null) {
						if (local48.aShort35 > 0) {
							local48.aShort35 = (short) (local48.aShort35 * -1);
						}
						if (local48.aShort32 > 0) {
							local48.aShort32 = (short) (local48.aShort32 * -1);
						}
					}
				}
			}
		}
		for (local34 = 0; local34 < Static539.anInt8345; local34++) {
			for (local38 = 0; local38 < Static51.anInt1108; local38++) {
				for (@Pc(96) int local96 = 0; local96 < Static245.anInt7888; local96++) {
					@Pc(106) Class73 local106 = Static267.aClass73ArrayArrayArray2[local34][local96][local38];
					if (local106 != null) {
						@Pc(129) boolean local129 = Static267.aClass73ArrayArrayArray2[0][local96][local38] != null && Static267.aClass73ArrayArrayArray2[0][local96][local38].aClass73_1 != null;
						@Pc(137) int local137;
						@Pc(139) int local139;
						@Pc(153) Class73 local153;
						@Pc(161) int local161;
						@Pc(322) int local322;
						@Pc(336) int local336;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(370) int local370;
						@Pc(374) int local374;
						@Pc(380) int local380;
						@Pc(420) int local420;
						@Pc(424) int local424;
						if (local106.aShort32 < 0) {
							local137 = local38;
							local139 = local38;
							local153 = Static267.aClass73ArrayArrayArray2[local34][local96][local38 - 1];
							local161 = Static655.aClass42Array5[local34].method7450(local38, local96);
							while (local137 > 0 && local153 != null && local153.aShort32 < 0 && local106.aShort32 == local153.aShort32 && local153.aShort33 == local106.aShort33 && local161 == Static655.aClass42Array5[local34].method7450(local137 - 1, local96) && (local137 - 1 <= 0 || Static655.aClass42Array5[local34].method7450(local137 - 2, local96) == local161)) {
								local137--;
								local153 = Static267.aClass73ArrayArrayArray2[local34][local96][local137 - 1];
							}
							for (local153 = Static267.aClass73ArrayArrayArray2[local34][local96][local38 + 1]; Static245.anInt7888 > local139 && local153 != null && local153.aShort32 < 0 && local153.aShort32 == local106.aShort32 && local153.aShort33 == local106.aShort33 && local161 == Static655.aClass42Array5[local34].method7450(local139 + 1, local96) && (Static245.anInt7888 <= local139 + 1 || local161 == Static655.aClass42Array5[local34].method7450(local139 + 2, local96)); local153 = Static267.aClass73ArrayArrayArray2[local34][local96][local139 + 1]) {
								local139++;
							}
							local322 = local34 + 1 - local34;
							local336 = Static655.aClass42Array5[local129 ? local34 + 1 : local34].method7450(local137, local96);
							local343 = local336 + local322 * local106.aShort32;
							local359 = Static655.aClass42Array5[local129 ? local34 + 1 : local34].method7450(local139 + 1, local96);
							local366 = local106.aShort32 * local322 + local359;
							local370 = local96 << Static273.anInt4424;
							local374 = local137 << Static273.anInt4424;
							local380 = (local139 << Static273.anInt4424) + Static63.anInt1356;
							Static220.aClass292Array62[Static658.anInt10393++] = new Class292(1, local34, local370 + local106.aShort33, local370 - -local106.aShort33, local370 + local106.aShort33, local370 + local106.aShort33, local336, local359, local366, local343, local374, local380, local380, local374);
							for (local420 = local34; local420 <= local34; local420++) {
								for (local424 = local137; local424 <= local139; local424++) {
									Static267.aClass73ArrayArrayArray2[local420][local96][local424].aShort32 = (short) (Static267.aClass73ArrayArrayArray2[local420][local96][local424].aShort32 * -1);
								}
							}
						}
						if (local106.aShort35 < 0) {
							local137 = local96;
							local139 = local96;
							local153 = Static267.aClass73ArrayArrayArray2[local34][local96 - 1][local38];
							local161 = Static655.aClass42Array5[local34].method7450(local38, local96);
							while (local137 > 0 && local153 != null && local153.aShort35 < 0 && local106.aShort35 == local153.aShort35 && local106.aShort34 == local153.aShort34 && local161 == Static655.aClass42Array5[local34].method7450(local38, local137 - 1) && (local137 - 1 <= 0 || local161 == Static655.aClass42Array5[local34].method7450(local38, local137 - 2))) {
								local137--;
								local153 = Static267.aClass73ArrayArrayArray2[local34][local137 - 1][local38];
							}
							for (local153 = Static267.aClass73ArrayArrayArray2[local34][local96 + 1][local38]; Static51.anInt1108 > local139 && local153 != null && local153.aShort35 < 0 && local153.aShort35 == local106.aShort35 && local106.aShort34 == local153.aShort34 && local161 == Static655.aClass42Array5[local34].method7450(local38, local139 + 1) && (Static51.anInt1108 <= local139 + 1 || Static655.aClass42Array5[local34].method7450(local38, local139 + 2) == local161); local153 = Static267.aClass73ArrayArrayArray2[local34][local139 + 1][local38]) {
								local139++;
							}
							local322 = local34 + 1 - local34;
							local336 = Static655.aClass42Array5[local129 ? local34 + 1 : local34].method7450(local38, local137);
							local343 = local322 * local106.aShort35 + local336;
							local359 = Static655.aClass42Array5[local129 ? local34 + 1 : local34].method7450(local38, local139 + 1);
							local366 = local359 + local322 * local106.aShort35;
							local370 = local137 << Static273.anInt4424;
							local374 = Static63.anInt1356 + (local139 << Static273.anInt4424);
							local380 = local38 << Static273.anInt4424;
							Static220.aClass292Array62[Static658.anInt10393++] = new Class292(2, local34, local370, local374, local374, local370, local336, local359, local366, local343, local380 + local106.aShort34, local380 + local106.aShort34, local380 + local106.aShort34, local106.aShort34 + local380);
							for (local420 = local34; local420 <= local34; local420++) {
								for (local424 = local137; local424 <= local139; local424++) {
									Static267.aClass73ArrayArrayArray2[local420][local424][local38].aShort35 = (short) (Static267.aClass73ArrayArrayArray2[local420][local424][local38].aShort35 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static558.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)Z")
	public static boolean method2179() {
		return Static91.anInt1809 != 0;
	}
}
