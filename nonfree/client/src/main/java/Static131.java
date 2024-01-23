import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!km;III)V")
	public static void method2285(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub16 local12;
		if (arg2 < Static220.anInt4129) {
			local12 = Static254.aClass1_Sub16ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass124_1 != null && local12.aClass124_1.aClass11_10.method4301()) {
				arg0.method4296(local12.aClass124_1.aClass11_10, 128, 0, 0, true);
			}
		}
		if (arg3 < Static220.anInt4129) {
			local12 = Static254.aClass1_Sub16ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass124_1 != null && local12.aClass124_1.aClass11_10.method4301()) {
				arg0.method4296(local12.aClass124_1.aClass11_10, 0, 0, 128, true);
			}
		}
		if (arg2 < Static220.anInt4129 && arg3 < Static298.anInt5372) {
			local12 = Static254.aClass1_Sub16ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass124_1 != null && local12.aClass124_1.aClass11_10.method4301()) {
				arg0.method4296(local12.aClass124_1.aClass11_10, 128, 0, 128, true);
			}
		}
		if (arg2 < Static220.anInt4129 && arg3 > 0) {
			local12 = Static254.aClass1_Sub16ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass124_1 != null && local12.aClass124_1.aClass11_10.method4301()) {
				arg0.method4296(local12.aClass124_1.aClass11_10, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
	public static void method2286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static193.anIntArray402[arg1] = arg0;
		@Pc(14) Class1_Sub19 local14 = (Class1_Sub19) Static284.aClass86_35.method2136((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub19(4611686018427387905L);
			Static284.aClass86_35.method2144(local14, (long) arg1);
		} else if (local14.aLong120 != 4611686018427387905L) {
			local14.aLong120 = Static244.method3859() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZIZIIB)V")
	public static void method2287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!arg4 && Static130.anInt2581 == arg1 && arg5 == Static133.anInt2638 && (arg0 == Static247.anInt1590 || Static115.method2108())) {
			return;
		}
		Static133.anInt2638 = arg5;
		Static247.anInt1590 = arg0;
		Static130.anInt2581 = arg1;
		if (Static115.method2108()) {
			Static247.anInt1590 = 0;
		}
		if (arg2) {
			Static197.method3406(28);
		} else {
			Static197.method3406(25);
		}
		Static288.method4341(true, Static270.aString192);
		@Pc(58) int local58 = Static38.anInt714;
		Static38.anInt714 = (arg1 - 6) * 8;
		@Pc(66) int local66 = Static135.anInt2659;
		Static135.anInt2659 = arg5 * 8 - 48;
		Static189.aClass1_Sub5_Sub14_1 = Static249.method4634(Static130.anInt2581 * 8, Static133.anInt2638 * 8);
		@Pc(85) int local85 = Static135.anInt2659 - local66;
		Static69.aClass78_1 = null;
		@Pc(94) int local94 = Static38.anInt714 - local58;
		@Pc(100) int local100;
		@Pc(107) Class11_Sub4_Sub2 local107;
		@Pc(112) int local112;
		if (arg2) {
			Static1.anInt48 = 0;
			for (local100 = 0; local100 < 32768; local100++) {
				local107 = Static138.aClass11_Sub4_Sub2Array2[local100];
				if (local107 != null) {
					local107.anInt3865 -= local94 * 128;
					local107.anInt3856 -= local85 * 128;
					if (local107.anInt3865 >= 0 && local107.anInt3865 <= 13184 && local107.anInt3856 >= 0 && local107.anInt3856 <= 13184) {
						for (local112 = 0; local112 < 10; local112++) {
							local107.anIntArray407[local112] -= local94;
							local107.anIntArray406[local112] -= local85;
						}
						Static288.anIntArray572[Static1.anInt48++] = local100;
					} else {
						Static138.aClass11_Sub4_Sub2Array2[local100].method3365(null);
						Static138.aClass11_Sub4_Sub2Array2[local100] = null;
					}
				}
			}
		} else {
			for (local100 = 0; local100 < 32768; local100++) {
				local107 = Static138.aClass11_Sub4_Sub2Array2[local100];
				if (local107 != null) {
					for (local112 = 0; local112 < 10; local112++) {
						local107.anIntArray407[local112] -= local94;
						local107.anIntArray406[local112] -= local85;
					}
					local107.anInt3865 -= local94 * 128;
					local107.anInt3856 -= local85 * 128;
				}
			}
		}
		for (local100 = 0; local100 < 2048; local100++) {
			@Pc(263) Class11_Sub4_Sub1 local263 = Static14.aClass11_Sub4_Sub1Array1[local100];
			if (local263 != null) {
				for (local112 = 0; local112 < 10; local112++) {
					local263.anIntArray407[local112] -= local94;
					local263.anIntArray406[local112] -= local85;
				}
				local263.anInt3856 -= local85 * 128;
				local263.anInt3865 -= local94 * 128;
			}
		}
		@Pc(314) byte local314 = 0;
		Static132.anInt2608 = arg0;
		@Pc(318) byte local318 = 104;
		Static138.aClass11_Sub4_Sub1_3.method2584(false, arg6, arg3);
		@Pc(326) byte local326 = 104;
		@Pc(328) byte local328 = 1;
		@Pc(330) byte local330 = 0;
		@Pc(332) byte local332 = 1;
		if (local85 < 0) {
			local330 = 103;
			local326 = -1;
			local332 = -1;
		}
		if (local94 < 0) {
			local314 = 103;
			local318 = -1;
			local328 = -1;
		}
		for (@Pc(350) int local350 = local314; local350 != local318; local350 += local328) {
			for (@Pc(355) int local355 = local330; local355 != local326; local355 += local332) {
				@Pc(362) int local362 = local350 + local94;
				@Pc(367) int local367 = local355 + local85;
				for (@Pc(369) int local369 = 0; local369 < 4; local369++) {
					if (local362 >= 0 && local367 >= 0 && local362 < 104 && local367 < 104) {
						Static203.aClass96ArrayArrayArray5[local369][local350][local355] = Static203.aClass96ArrayArrayArray5[local369][local362][local367];
					} else {
						Static203.aClass96ArrayArrayArray5[local369][local350][local355] = null;
					}
				}
			}
		}
		for (@Pc(436) Class1_Sub4 local436 = (Class1_Sub4) Static273.aClass96_27.method2340(); local436 != null; local436 = (Class1_Sub4) Static273.aClass96_27.method2342()) {
			local436.anInt325 -= local94;
			local436.anInt333 -= local85;
			if (local436.anInt325 < 0 || local436.anInt333 < 0 || local436.anInt325 >= 104 || local436.anInt333 >= 104) {
				local436.method4573();
			}
		}
		if (Static24.anInt490 != 0) {
			Static261.anInt4835 -= local85;
			Static24.anInt490 -= local94;
		}
		if (arg2) {
			Static13.anInt277 -= local94;
			Static273.anInt5035 -= local94 * 128;
			Static99.anInt2122 -= local94;
			Static87.anInt1875 -= local85 * 128;
			Static108.anInt2261 -= local85;
			Static148.anInt3027 -= local85;
		} else {
			Static228.anInt4270 = 1;
		}
		Static173.anInt3382 = 0;
		if (Static71.aBoolean165 && arg2 && (Math.abs(local94) > 104 || Math.abs(local85) > 104)) {
			Static47.method893();
		}
		Static25.method4021();
		Static311.aClass96_28.method2341();
		Static18.aClass96_1.method2341();
		Static52.method957();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!vn;IIII)V")
	public static void method2288(@OriginalArg(0) Class183 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static241.anInt4470 >= 400) {
			return;
		}
		if (arg0.anIntArray596 != null) {
			arg0 = arg0.method4526();
		}
		if (arg0 == null || !arg0.aBoolean511) {
			return;
		}
		@Pc(40) String local40 = arg0.aString215;
		if (arg0.anInt5423 != 0) {
			@Pc(52) String local52 = Static272.anInt5005 == 1 ? Static230.aString151 : Static35.aString29;
			local40 = local40 + Static297.method4443(Static138.aClass11_Sub4_Sub1_3.anInt3015, arg0.anInt5423) + " (" + local52 + arg0.anInt5423 + ")";
		}
		if (Static101.anInt2152 == 1) {
			Static69.method1328(Static199.aString133 + " -> <col=ffff00>" + local40, arg2, (short) 12, Static150.anInt3066, Static253.aString167, arg3, (long) arg1);
		} else if (Static187.aBoolean318) {
			@Pc(354) Class1_Sub5_Sub2 local354 = Static273.anInt5036 == -1 ? null : Static283.method4279(Static273.anInt5036);
			if ((Static96.anInt2071 & 0x2) != 0 && (local354 == null || arg0.method4518(local354.anInt484, Static273.anInt5036) != local354.anInt484)) {
				Static69.method1328(Static176.aString113 + " -> <col=ffff00>" + local40, arg2, (short) 30, Static144.anInt2797, Static132.aString88, arg3, (long) arg1);
			}
		} else {
			@Pc(112) String[] local112 = arg0.aStringArray35;
			if (Static13.aBoolean26) {
				local112 = Static181.method3085(local112);
			}
			@Pc(124) int local124;
			if (local112 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local112[local124] != null && (Static272.anInt5005 != 0 || !local112[local124].equalsIgnoreCase(Static287.aString202))) {
						@Pc(148) byte local148 = 0;
						if (local124 == 0) {
							local148 = 25;
						}
						if (local124 == 1) {
							local148 = 4;
						}
						@Pc(162) int local162 = -1;
						if (arg0.anInt5416 == local124) {
							local162 = arg0.anInt5456;
						}
						if (local124 == arg0.anInt5458) {
							local162 = arg0.anInt5453;
						}
						if (local124 == 2) {
							local148 = 21;
						}
						if (local124 == 3) {
							local148 = 9;
						}
						if (local124 == 4) {
							local148 = 60;
						}
						Static69.method1328("<col=ffff00>" + local40, arg2, local148, local162, local112[local124], arg3, (long) arg1);
					}
				}
			}
			if (Static272.anInt5005 == 0 && local112 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local112[local124] != null && local112[local124].equalsIgnoreCase(Static287.aString202)) {
						@Pc(251) short local251 = 0;
						@Pc(253) short local253 = 0;
						if (arg0.anInt5423 > Static138.aClass11_Sub4_Sub1_3.anInt3015) {
							local251 = 2000;
						}
						if (local124 == 0) {
							local253 = 25;
						}
						if (local124 == 1) {
							local253 = 4;
						}
						if (local124 == 2) {
							local253 = 21;
						}
						if (local124 == 3) {
							local253 = 9;
						}
						if (local124 == 4) {
							local253 = 60;
						}
						if (local253 != 0) {
							local253 += local251;
						}
						Static69.method1328("<col=ffff00>" + local40, arg2, local253, arg0.anInt5419, local112[local124], arg3, (long) arg1);
					}
				}
			}
			Static69.method1328("<col=ffff00>" + local40, arg2, (short) 1003, Static314.anInt5630, Static34.aString26, arg3, (long) arg1);
		}
	}
}
