import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method876() {
		for (@Pc(3) int local3 = 0; local3 < Static288.anInt4888; local3++) {
			Static642.aClass379Array4[local3] = null;
		}
		Static288.anInt4888 = 0;
		@Pc(33) int local33;
		@Pc(37) int local37;
		for (@Pc(29) int local29 = 0; local29 < Static633.anInt10310; local29++) {
			for (local33 = 0; local33 < Static209.anInt3602; local33++) {
				for (local37 = 0; local37 < Static245.anInt4308; local37++) {
					@Pc(47) Class351 local47 = Static441.aClass351ArrayArrayArray1[local29][local37][local33];
					if (local47 != null) {
						if (local47.aShort115 > 0) {
							local47.aShort115 = (short) (local47.aShort115 * -1);
						}
						if (local47.aShort116 > 0) {
							local47.aShort116 = (short) (local47.aShort116 * -1);
						}
					}
				}
			}
		}
		for (local33 = 0; local33 < Static633.anInt10310; local33++) {
			for (local37 = 0; local37 < Static209.anInt3602; local37++) {
				for (@Pc(103) int local103 = 0; local103 < Static245.anInt4308; local103++) {
					@Pc(113) Class351 local113 = Static441.aClass351ArrayArrayArray1[local33][local103][local37];
					if (local113 != null) {
						@Pc(136) boolean local136 = Static441.aClass351ArrayArrayArray1[0][local103][local37] != null && Static441.aClass351ArrayArrayArray1[0][local103][local37].aClass351_1 != null;
						@Pc(144) int local144;
						@Pc(146) int local146;
						@Pc(160) Class351 local160;
						@Pc(168) int local168;
						@Pc(326) int local326;
						@Pc(340) int local340;
						@Pc(347) int local347;
						@Pc(363) int local363;
						@Pc(370) int local370;
						@Pc(374) int local374;
						@Pc(378) int local378;
						@Pc(384) int local384;
						@Pc(423) int local423;
						@Pc(427) int local427;
						if (local113.aShort115 < 0) {
							local144 = local37;
							local146 = local37;
							local160 = Static441.aClass351ArrayArrayArray1[local33][local103][local37 - 1];
							local168 = Static64.aClass12Array1[local33].method7846(local103, local37);
							while (local144 > 0 && local160 != null && local160.aShort115 < 0 && local113.aShort115 == local160.aShort115 && local160.aShort117 == local113.aShort117 && local168 == Static64.aClass12Array1[local33].method7846(local103, local144 - 1) && (local144 - 1 <= 0 || local168 == Static64.aClass12Array1[local33].method7846(local103, local144 - 2))) {
								local144--;
								local160 = Static441.aClass351ArrayArrayArray1[local33][local103][local144 - 1];
							}
							for (local160 = Static441.aClass351ArrayArrayArray1[local33][local103][local37 + 1]; local146 < Static245.anInt4308 && local160 != null && local160.aShort115 < 0 && local113.aShort115 == local160.aShort115 && local113.aShort117 == local160.aShort117 && local168 == Static64.aClass12Array1[local33].method7846(local103, local146 + 1) && (local146 + 1 >= Static245.anInt4308 || Static64.aClass12Array1[local33].method7846(local103, local146 + 2) == local168); local160 = Static441.aClass351ArrayArrayArray1[local33][local103][local146 + 1]) {
								local146++;
							}
							local326 = local33 + 1 - local33;
							local340 = Static64.aClass12Array1[local136 ? local33 + 1 : local33].method7846(local103, local144);
							local347 = local326 * local113.aShort115 + local340;
							local363 = Static64.aClass12Array1[local136 ? local33 + 1 : local33].method7846(local103, local146 + 1);
							local370 = local363 + local113.aShort115 * local326;
							local374 = local103 << Static185.anInt3178;
							local378 = local144 << Static185.anInt3178;
							local384 = Static655.anInt10510 + (local146 << Static185.anInt3178);
							Static642.aClass379Array4[Static288.anInt4888++] = new Class379(1, local33, local374 + local113.aShort117, local113.aShort117 + local374, local374 + local113.aShort117, local113.aShort117 + local374, local340, local363, local370, local347, local378, local384, local384, local378);
							for (local423 = local33; local423 <= local33; local423++) {
								for (local427 = local144; local427 <= local146; local427++) {
									Static441.aClass351ArrayArrayArray1[local423][local103][local427].aShort115 = (short) (Static441.aClass351ArrayArrayArray1[local423][local103][local427].aShort115 * -1);
								}
							}
						}
						if (local113.aShort116 < 0) {
							local144 = local103;
							local146 = local103;
							local160 = Static441.aClass351ArrayArrayArray1[local33][local103 - 1][local37];
							local168 = Static64.aClass12Array1[local33].method7846(local103, local37);
							while (local144 > 0 && local160 != null && local160.aShort116 < 0 && local113.aShort116 == local160.aShort116 && local113.aShort114 == local160.aShort114 && Static64.aClass12Array1[local33].method7846(local144 - 1, local37) == local168 && (local144 - 1 <= 0 || Static64.aClass12Array1[local33].method7846(local144 - 2, local37) == local168)) {
								local144--;
								local160 = Static441.aClass351ArrayArrayArray1[local33][local144 - 1][local37];
							}
							for (local160 = Static441.aClass351ArrayArrayArray1[local33][local103 + 1][local37]; Static209.anInt3602 > local146 && local160 != null && local160.aShort116 < 0 && local160.aShort116 == local113.aShort116 && local113.aShort114 == local160.aShort114 && Static64.aClass12Array1[local33].method7846(local146 + 1, local37) == local168 && (Static209.anInt3602 <= local146 + 1 || local168 == Static64.aClass12Array1[local33].method7846(local146 + 2, local37)); local160 = Static441.aClass351ArrayArrayArray1[local33][local146 + 1][local37]) {
								local146++;
							}
							local326 = local33 + 1 - local33;
							local340 = Static64.aClass12Array1[local136 ? local33 + 1 : local33].method7846(local144, local37);
							local347 = local340 + local326 * local113.aShort116;
							local363 = Static64.aClass12Array1[local136 ? local33 + 1 : local33].method7846(local146 + 1, local37);
							local370 = local326 * local113.aShort116 + local363;
							local374 = local144 << Static185.anInt3178;
							local378 = Static655.anInt10510 + (local146 << Static185.anInt3178);
							local384 = local37 << Static185.anInt3178;
							Static642.aClass379Array4[Static288.anInt4888++] = new Class379(2, local33, local374, local378, local378, local374, local340, local363, local370, local347, local113.aShort114 + local384, local113.aShort114 + local384, local384 + local113.aShort114, local384 - -local113.aShort114);
							for (local423 = local33; local423 <= local33; local423++) {
								for (local427 = local144; local427 <= local146; local427++) {
									Static441.aClass351ArrayArrayArray1[local423][local427][local37].aShort116 = (short) (Static441.aClass351ArrayArrayArray1[local423][local427][local37].aShort116 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static383.aBoolean424 = true;
	}
}
