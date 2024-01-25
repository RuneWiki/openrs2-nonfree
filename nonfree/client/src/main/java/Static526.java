import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public static int anInt9146;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!om;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public static int anInt9147 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ha;Lclient!fo;IILclient!tl;I)Z")
	public static boolean method7816(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(4) Class6_Sub45 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray205 != null) {
			local7 = (arg2.anInt9419 + arg1.anInt3396 - Static487.anInt7455) * (Static487.anInt7452 - Static487.anInt7458) / (Static487.anInt7460 - Static487.anInt7455) + Static487.anInt7458;
			local9 = (arg2.anInt9419 + arg1.anInt3388 - Static487.anInt7455) * (Static487.anInt7452 - Static487.anInt7458) / (Static487.anInt7460 - Static487.anInt7455) + Static487.anInt7458;
			local11 = Static487.anInt7454 - (Static487.anInt7454 - Static487.anInt7456) * (-Static487.anInt7461 + arg2.anInt9422 + arg1.anInt3414) / (Static487.anInt7463 - Static487.anInt7461);
			local13 = Static487.anInt7454 - (arg1.anInt3395 + arg2.anInt9422 - Static487.anInt7461) * (-Static487.anInt7456 + Static487.anInt7454) / (Static487.anInt7463 - Static487.anInt7461);
		}
		@Pc(102) Class32 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg1.anInt3413 != -1) {
			if (arg2.aBoolean642 && arg1.anInt3415 != -1) {
				local102 = arg1.method3034(arg0, true);
			} else {
				local102 = arg1.method3034(arg0, false);
			}
			if (local102 != null) {
				local104 = arg2.anInt9418 - (local102.method5080() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local106 = arg2.anInt9418 + (local102.method5080() + 1 >> 1);
				if (local9 < local106) {
					local9 = local106;
				}
				local108 = arg2.anInt9416 - (local102.method5079() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				local110 = arg2.anInt9416 + (local102.method5079() + 1 >> 1);
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(214) Class276 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(311) int local311;
		if (arg1.aString35 != null) {
			local214 = Static559.method8059(arg1.anInt3418);
			if (local214 != null) {
				local216 = Static545.aClass133_42.method3640(Static174.aStringArray30, (int[]) null, arg1.aString35, (Class32[]) null);
				local220 = arg2.anInt9416 - arg1.anInt3411 * (Static487.anInt7454 - Static487.anInt7456) / (Static487.anInt7463 - Static487.anInt7461);
				local218 = arg1.anInt3398 * (Static487.anInt7452 - Static487.anInt7458) / (Static487.anInt7460 - Static487.anInt7455) + arg2.anInt9418;
				if (local102 == null) {
					local220 -= local216 * local214.method7129() / 2;
				} else {
					local220 -= (local102.method5079() >> 1) + local216 * local214.method7128();
				}
				for (local311 = 0; local311 < local216; local311++) {
					@Pc(317) String local317 = Static174.aStringArray30[local311];
					if (local216 - 1 > local311) {
						local317 = local317.substring(0, local317.length() - 4);
					}
					@Pc(334) int local334 = local214.method7127(local317);
					if (local222 < local334) {
						local222 = local334;
					}
				}
				local224 = local218 - local222 / 2;
				local226 = local222 / 2 + local218;
				if (local224 < local7) {
					local7 = local224;
				}
				if (local226 > local9) {
					local9 = local226;
				}
				local233 = local220;
				if (local233 < local11) {
					local11 = local233;
				}
				local235 = local220 + local216 * local214.method7128();
				if (local235 > local13) {
					local13 = local235;
				}
			}
		}
		if (Static487.anInt7458 > local9 || local7 > Static487.anInt7452 || local13 < Static487.anInt7456 || local11 > Static487.anInt7454) {
			return true;
		}
		Static487.method6441(arg0, arg2, arg1);
		if (local102 != null) {
			if (Static344.anInt6482 > 0 && (Static16.anInt284 != -1 && arg2.anInt9417 == Static16.anInt284 || Static316.anInt6069 != -1 && Static316.anInt6069 == arg1.anInt3392)) {
				if (Static243.anInt4836 > 50) {
					local311 = 200 - Static243.anInt4836 * 2;
				} else {
					local311 = Static243.anInt4836 * 2;
				}
				@Pc(486) int local486 = local311 << 24 | 0xFFFF00;
				arg0.method8822(local102.method5072() / 2 + 7, arg2.anInt9418, local486, arg2.anInt9416);
				arg0.method8822(local102.method5072() / 2 + 5, arg2.anInt9418, local486, arg2.anInt9416);
				arg0.method8822(local102.method5072() / 2 + 3, arg2.anInt9418, local486, arg2.anInt9416);
				arg0.method8822(local102.method5072() / 2 + 1, arg2.anInt9418, local486, arg2.anInt9416);
				arg0.method8822(local102.method5072() / 2, arg2.anInt9418, local486, arg2.anInt9416);
			}
			local102.method5071(arg2.anInt9418 - (local102.method5080() >> 1), arg2.anInt9416 + -(local102.method5079() >> 1));
		}
		if (arg1.aString35 != null && local214 != null) {
			Static477.method7170(arg0, local216, local214, local220, arg2, arg1, local218, local222);
		}
		if (arg1.anInt3413 != -1 || arg1.aString35 != null) {
			@Pc(602) Class6_Sub31 local602 = new Class6_Sub31(arg2);
			local602.anInt6720 = local108;
			local602.anInt6721 = local233;
			local602.anInt6727 = local104;
			local602.anInt6719 = local110;
			local602.anInt6725 = local235;
			local602.anInt6729 = local224;
			local602.anInt6728 = local226;
			local602.anInt6722 = local106;
			Static485.aClass8_56.method157(local602);
		}
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Z")
	public static boolean method7819() {
		Static500.anInt8420++;
		Static433.aBoolean525 = true;
		return true;
	}
}
