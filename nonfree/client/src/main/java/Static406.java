import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ir;BZ)V")
	public static void method5263(@OriginalArg(0) Class25_Sub5_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static118.anInt2201 >= 400) {
			return;
		}
		@Pc(21) Class54 local21 = arg0.aClass54_1;
		if (local21.anIntArray67 != null) {
			local21 = local21.method1148(Static320.aClass249_2);
			if (local21 == null) {
				return;
			}
		}
		if (!local21.aBoolean150) {
			return;
		}
		@Pc(41) String local41 = local21.aString15;
		if (local21.anInt1338 != 0) {
			@Pc(60) String local60 = Static183.aClass48_3 == Static82.aClass48_7 ? Static58.aClass119_32.method2673(Static394.anInt6582) : Static91.aClass119_45.method2673(Static394.anInt6582);
			local41 = local41 + Static225.method3258(local21.anInt1338, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324) + " (" + local60 + local21.anInt1338 + ")";
		}
		if (!Static433.aBoolean798) {
			if (!arg1) {
				@Pc(90) String[] local90 = local21.aStringArray9;
				if (Static286.aBoolean569) {
					local90 = Static242.method3486(local90);
				}
				@Pc(100) int local100;
				if (local90 != null) {
					for (local100 = 4; local100 >= 0; local100--) {
						if (local90[local100] != null && (local21.aByte8 == 0 || !local90[local100].equalsIgnoreCase(Static376.aClass119_155.method2673(Static394.anInt6582)))) {
							@Pc(123) byte local123 = 0;
							@Pc(125) int local125 = Static423.anInt6430;
							if (local100 == 0) {
								local123 = 21;
							}
							if (local100 == 1) {
								local123 = 60;
							}
							if (local100 == 2) {
								local123 = 51;
							}
							if (local100 == 3) {
								local123 = 2;
							}
							if (local100 == 4) {
								local123 = 22;
							}
							if (local100 == local21.anInt1334) {
								local125 = local21.anInt1313;
							}
							if (local100 == local21.anInt1336) {
								local125 = local21.anInt1321;
							}
							Static382.method5588(-1, 0, local123, local90[local100], "<col=ffff00>" + local41, 0, local125, (long) arg0.anInt4284, true, false);
						}
					}
				}
				if (local21.aByte8 == 1 && local90 != null) {
					for (local100 = 4; local100 >= 0; local100--) {
						if (local90[local100] != null && local90[local100].equalsIgnoreCase(Static376.aClass119_155.method2673(Static394.anInt6582))) {
							@Pc(230) short local230 = 0;
							if (local21.anInt1338 > Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324) {
								local230 = 2000;
							}
							@Pc(239) short local239 = 0;
							if (local100 == 0) {
								local239 = 21;
							}
							if (local100 == 1) {
								local239 = 60;
							}
							if (local100 == 2) {
								local239 = 51;
							}
							if (local100 == 3) {
								local239 = 2;
							}
							if (local100 == 4) {
								local239 = 22;
							}
							if (local239 != 0) {
								local239 += local230;
							}
							Static382.method5588(-1, 0, local239, local90[local100], "<col=ffff00>" + local41, 0, local21.anInt1345, (long) arg0.anInt4284, true, false);
						}
					}
				}
			}
			Static382.method5588(-1, 0, 1006, Static129.aClass119_72.method2673(Static394.anInt6582), "<col=ffff00>" + local41, 0, Static137.anInt2436, (long) arg0.anInt4284, true, arg1);
		} else if (!arg1) {
			@Pc(349) Class106 local349 = Static326.anInt5571 == -1 ? null : Static65.aClass86_1.method1919(Static326.anInt5571);
			if ((Static122.anInt2253 & 0x2) != 0) {
				if (local349 == null || local21.method1152(local349.anInt2688, Static326.anInt5571) != local349.anInt2688) {
					Static382.method5588(-1, 0, 11, Static337.aString67, Static15.aString1 + " -> <col=ffff00>" + local41, 0, Static10.anInt181, (long) arg0.anInt4284, true, false);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5265(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static446.anInt7396; local11++) {
			if (arg0.equalsIgnoreCase(Static131.aStringArray13[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static357.aStringArray42[local11])) {
				return true;
			}
		}
		return false;
	}
}
