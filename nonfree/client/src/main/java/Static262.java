import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!kb;")
	public static Class83 aClass83_186;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!tl;")
	public static Class155 aClass155_42 = new Class155(64);

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[Lclient!ij;")
	public static Class1_Sub2_Sub12[] aClass1_Sub2_Sub12Array4 = new Class1_Sub2_Sub12[14];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZBI)V")
	public static void method4467(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3;
		@Pc(12) Class25_Sub1_Sub2 local12;
		@Pc(77) int local77;
		@Pc(175) int local175;
		@Pc(194) int local194;
		@Pc(211) int local211;
		@Pc(220) int local220;
		@Pc(101) int local101;
		for (local3 = 0; local3 < Static147.anInt3493; local3++) {
			local12 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local3]];
			if (local12 != null && local12.method1244() && local12.aClass143_1.method4064()) {
				@Pc(27) int local27 = local12.method1243();
				if (arg0) {
					if (!local12.aClass143_1.aBoolean283) {
						continue;
					}
				} else if (arg1 != local12.aClass143_1.aBoolean284 || arg2 != 0 && local27 != arg2) {
					continue;
				}
				@Pc(72) int local72;
				if (local27 == 1) {
					if ((local12.anInt1635 & 0x7F) == 64 && (local12.anInt1604 & 0x7F) == 64) {
						local72 = local12.anInt1635 >> 7;
						local77 = local12.anInt1604 >> 7;
						if (local72 >= 0 && local72 < 104 && local77 >= 0 && local77 < 104) {
							local101 = Static150.anIntArrayArray12[local72][local77]++;
						}
					}
				} else if (((local27 & 0x1) != 0 || (local12.anInt1635 & 0x7F) == 0 && (local12.anInt1604 & 0x7F) == 0) && ((local27 & 0x1) != 1 || (local12.anInt1635 & 0x7F) == 64 && (local12.anInt1604 & 0x7F) == 64)) {
					local77 = local12.anInt1604 - local27 * 64 >> 7;
					local72 = local12.anInt1635 - local27 * 64 >> 7;
					local175 = local12.method1243() + local72;
					if (local72 < 0) {
						local72 = 0;
					}
					if (local175 > 104) {
						local175 = 104;
					}
					local194 = local12.method1243() + local77;
					if (local194 > 104) {
						local194 = 104;
					}
					if (local77 < 0) {
						local77 = 0;
					}
					for (local211 = local72; local211 < local175; local211++) {
						for (local220 = local77; local220 < local194; local220++) {
							local101 = Static150.anIntArrayArray12[local211][local220]++;
						}
					}
				}
			}
		}
		label202: for (local3 = 0; local3 < Static147.anInt3493; local3++) {
			local12 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local3]];
			@Pc(274) long local274 = (long) Static65.anIntArray25[local3] << 32 | 0x20000000L;
			if (local12 != null && local12.method1244() && local12.aClass143_1.method4064()) {
				local77 = local12.method1243();
				if (arg0) {
					if (!local12.aClass143_1.aBoolean283) {
						continue;
					}
				} else if (arg1 != local12.aClass143_1.aBoolean284 || arg2 != 0 && local77 != arg2) {
					continue;
				}
				local12.aBoolean89 = true;
				if (local77 == 1) {
					if ((local12.anInt1635 & 0x7F) == 64 && (local12.anInt1604 & 0x7F) == 64) {
						local175 = local12.anInt1635 >> 7;
						local194 = local12.anInt1604 >> 7;
						if (local175 < 0 || local175 >= 104 || local194 < 0 || local194 >= 104) {
							continue;
						}
						if (Static150.anIntArrayArray12[local175][local194] > 1) {
							local101 = Static150.anIntArrayArray12[local175][local194]--;
							continue;
						}
					}
				} else if ((local77 & 0x1) == 0 && (local12.anInt1635 & 0x7F) == 0 && (local12.anInt1604 & 0x7F) == 0 || (local77 & 0x1) == 1 && (local12.anInt1635 & 0x7F) == 64 && (local12.anInt1604 & 0x7F) == 64) {
					local194 = local12.anInt1604 - local77 * 64 >> 7;
					local220 = local194 + local77;
					if (local194 < 0) {
						local194 = 0;
					}
					if (local220 > 104) {
						local220 = 104;
					}
					@Pc(387) boolean local387 = true;
					local175 = local12.anInt1635 - local77 * 64 >> 7;
					local211 = local77 + local175;
					if (local211 > 104) {
						local211 = 104;
					}
					if (local175 < 0) {
						local175 = 0;
					}
					@Pc(415) int local415;
					@Pc(420) int local420;
					for (local415 = local175; local415 < local211; local415++) {
						for (local420 = local194; local420 < local220; local420++) {
							if (Static150.anIntArrayArray12[local415][local420] <= 1) {
								local387 = false;
								break;
							}
						}
					}
					if (local387) {
						local415 = local175;
						while (true) {
							if (local211 <= local415) {
								continue label202;
							}
							for (local420 = local194; local420 < local220; local420++) {
								local101 = Static150.anIntArrayArray12[local415][local420]--;
							}
							local415++;
						}
					}
				}
				if (!local12.aClass143_1.aBoolean282) {
					local274 |= Long.MIN_VALUE;
				}
				local12.aBoolean89 = false;
				local12.anInt1603 = Static220.method3905(local12.anInt1635, local12.anInt1604, Static145.anInt3477);
				Static227.method3944(Static145.anInt3477, local12.anInt1635, local12.anInt1604, local12.anInt1603, local77 * 64 - 4, local12, local12.anInt1681, local274, local12.aBoolean86);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method4468() {
		Static199.aClass155_37.method4354();
	}
}
