import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZI)Z")
	public static boolean method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static358.aBoolean477) {
			return false;
		} else if (Static350.anInt7294 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static206.anIntArrayArrayArray23[arg0][arg1][arg2];
			if (local22 == -Static472.anInt8979) {
				return false;
			} else if (local22 == Static472.anInt8979) {
				return true;
			} else if (Static255.aClass115Array2 == Static140.aClass115Array1) {
				return false;
			} else {
				@Pc(51) int local51 = arg1 << Static392.anInt3635;
				@Pc(55) int local55 = arg2 << Static392.anInt3635;
				if (Static526.method7452(Static255.aClass115Array2[arg0].method8055(arg2 + 1, arg1 + 1), Static255.aClass115Array2[arg0].method8055(arg2, arg1), Static168.anInt3487 + local55 - 1, Static168.anInt3487 + (local51 - 1), Static168.anInt3487 + local55 - 1, local55 + 1, local51 + 1, Static255.aClass115Array2[arg0].method8055(arg2 + 1, arg1), local51 + 1) && Static526.method7452(Static255.aClass115Array2[arg0].method8055(arg2, arg1 + 1), Static255.aClass115Array2[arg0].method8055(arg2, arg1), local55 + 1, local51 + Static168.anInt3487 - 1, Static168.anInt3487 + local55 - 1, local55 - -1, local51 + Static168.anInt3487 - 1, Static255.aClass115Array2[arg0].method8055(arg2 + 1, arg1 + 1), local51 + 1)) {
					Static348.anInt6732++;
					Static206.anIntArrayArrayArray23[arg0][arg1][arg2] = Static472.anInt8979;
					return true;
				} else {
					Static206.anIntArrayArrayArray23[arg0][arg1][arg2] = -Static472.anInt8979;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
	public static void method5320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class4_Sub43 local12 = (Class4_Sub43) Static10.aClass22_11.method895(); local12 != null; local12 = (Class4_Sub43) Static10.aClass22_11.method889()) {
			Static463.method6787(arg1, arg2, arg0, arg3, local12);
		}
		@Pc(192) boolean local192;
		for (@Pc(37) Class4_Sub43 local37 = (Class4_Sub43) Static414.aClass22_53.method895(); local37 != null; local37 = (Class4_Sub43) Static414.aClass22_53.method889()) {
			@Pc(41) byte local41 = 1;
			@Pc(46) Class252 local46 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.method3322();
			if (local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == -1 || local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.aBoolean294) {
				local41 = 0;
			} else if (local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == local46.anInt7486 || local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == local46.anInt7504 || local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == local46.anInt7518 || local46.anInt7511 == local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254) {
				local41 = 2;
			} else if (local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == local46.anInt7478 || local46.anInt7484 == local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 || local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == local46.anInt7516 || local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt4254 == local46.anInt7492) {
				local41 = 3;
			}
			if (local41 != local37.anInt8729) {
				@Pc(144) int local144 = Static26.method904(local37.aClass21_Sub1_Sub1_Sub1_Sub1_2);
				@Pc(148) Class51 local148 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.aClass51_1;
				if (local148.anIntArray61 != null) {
					local148 = local148.method1371(Static523.aClass173_1);
				}
				if (local148 == null || local144 == -1) {
					local37.anInt8723 = -1;
					local37.anInt8729 = local41;
					local37.aBoolean613 = false;
				} else if (local37.anInt8723 == local144 && local37.aBoolean613 == local148.aBoolean129) {
					local37.anInt8729 = local41;
					local37.anInt8725 = local148.anInt1604;
				} else {
					local192 = false;
					if (local37.aClass4_Sub21_Sub2_3 == null) {
						local192 = true;
					} else {
						local37.anInt8725 -= 512;
						if (local37.anInt8725 <= 0) {
							Static472.aClass4_Sub21_Sub3_2.method5931(local37.aClass4_Sub21_Sub2_3);
							local192 = true;
							local37.aClass4_Sub21_Sub2_3 = null;
						}
					}
					if (local192) {
						local37.anInt8723 = local144;
						local37.aBoolean613 = local148.aBoolean129;
						local37.aClass4_Sub12_2 = null;
						local37.anInt8729 = local41;
						local37.aClass4_Sub42_Sub1_3 = null;
						local37.anInt8725 = local148.anInt1604;
					}
				}
			}
			local37.anInt8735 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt10551;
			local37.anInt8722 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt10551 + (local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.method3339() << 8);
			local37.anInt8726 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt10550;
			local37.anInt8733 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.anInt10550 + (local37.aClass21_Sub1_Sub1_Sub1_Sub1_2.method3339() << 8);
			Static463.method6787(arg1, arg2, arg0, arg3, local37);
		}
		for (@Pc(307) Class4_Sub43 local307 = (Class4_Sub43) Static458.aClass221_32.method5072(); local307 != null; local307 = (Class4_Sub43) Static458.aClass221_32.method5071()) {
			@Pc(311) byte local311 = 1;
			@Pc(316) Class252 local316 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.method3322();
			if (local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 == -1 || local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.aBoolean294) {
				local311 = 0;
			} else if (local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 == local316.anInt7486 || local316.anInt7504 == local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 || local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 == local316.anInt7518 || local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 == local316.anInt7511) {
				local311 = 2;
			} else if (local316.anInt7478 == local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 || local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 == local316.anInt7484 || local316.anInt7516 == local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254 || local316.anInt7492 == local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4254) {
				local311 = 3;
			}
			if (local307.anInt8729 != local311) {
				@Pc(420) int local420 = Static124.method2269(local307.aClass21_Sub1_Sub1_Sub1_Sub2_3);
				if (local420 == local307.anInt8723 && local307.aBoolean613 == local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.aBoolean301) {
					local307.anInt8729 = local311;
					local307.anInt8725 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4297;
				} else {
					local192 = false;
					if (local307.aClass4_Sub21_Sub2_3 == null) {
						local192 = true;
					} else {
						local307.anInt8725 -= 512;
						if (local307.anInt8725 <= 0) {
							Static472.aClass4_Sub21_Sub3_2.method5931(local307.aClass4_Sub21_Sub2_3);
							local307.aClass4_Sub21_Sub2_3 = null;
							local192 = true;
						}
					}
					if (local192) {
						local307.anInt8729 = local311;
						local307.aClass4_Sub42_Sub1_3 = null;
						local307.aClass4_Sub12_2 = null;
						local307.anInt8725 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4297;
						local307.anInt8723 = local420;
						local307.aBoolean613 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.aBoolean301;
					}
				}
			}
			local307.anInt8735 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt10551;
			local307.anInt8722 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt10551 + (local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.method3339() << 8);
			local307.anInt8726 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt10550;
			local307.anInt8733 = local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt10550 + (local307.aClass21_Sub1_Sub1_Sub1_Sub2_3.method3339() << 8);
			Static463.method6787(arg1, arg2, arg0, arg3, local307);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	public static void method5321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg1, 14);
		local8.method2303();
		local8.anInt2865 = arg0;
	}
}
