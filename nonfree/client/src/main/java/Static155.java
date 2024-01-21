import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!t", name = "u", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int anInt3531 = 0;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "[Lclient!uh;")
	public static Class85[] aClass85Array1 = new Class85[500];

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1265 = Static120.method2057(":duelstake:");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method2685() {
		Static149.aClass59_22.method1967();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIII)V")
	public static void method2686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!rh;B)I")
	public static int method2687(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1) {
		if (arg1.anIntArrayArray25 == null || arg0 >= arg1.anIntArrayArray25.length) {
			return -2;
		}
		try {
			@Pc(21) int local21 = 0;
			@Pc(26) int[] local26 = arg1.anIntArrayArray25[arg0];
			@Pc(33) byte local33 = 0;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(40) int local40 = local26[local35++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local21;
				}
				if (local40 == 1) {
					local42 = Static70.anIntArray149[local26[local35++]];
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 2) {
					local42 = Static16.anIntArray13[local26[local35++]];
				}
				if (local40 == 3) {
					local42 = Static113.anIntArray272[local26[local35++]];
				}
				if (local40 == 17) {
					local44 = 3;
				}
				@Pc(111) int local111;
				@Pc(124) Class77 local124;
				@Pc(129) int local129;
				@Pc(143) int local143;
				if (local40 == 4) {
					local111 = local26[local35++] << 16;
					@Pc(118) int local118 = local111 + local26[local35++];
					local124 = Static41.method800(local118);
					local129 = local26[local35++];
					if (local129 != -1 && (!Static54.method969(local129).aBoolean103 || Static44.aBoolean40)) {
						for (local143 = 0; local143 < local124.anIntArray348.length; local143++) {
							if (local124.anIntArray348[local143] == local129 + 1) {
								local42 += local124.anIntArray342[local143];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static83.anIntArray178[local26[local35++]];
				}
				if (local40 == 6) {
					local42 = Class34.anIntArray239[Static16.anIntArray13[local26[local35++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static83.anIntArray178[local26[local35++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1526;
				}
				if (local40 == 9) {
					for (local111 = 0; local111 < 25; local111++) {
						if (Static51.aBooleanArray4[local111]) {
							local42 += Static16.anIntArray13[local111];
						}
					}
				}
				if (local40 == 10) {
					local111 = local26[local35++] << 16;
					local111 += local26[local35++];
					local124 = Static41.method800(local111);
					local129 = local26[local35++];
					if (local129 != -1 && (!Static54.method969(local129).aBoolean103 || Static44.aBoolean40)) {
						for (local143 = 0; local143 < local124.anIntArray348.length; local143++) {
							if (local124.anIntArray348[local143] == local129 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static168.anInt3907;
				}
				if (local40 == 12) {
					local42 = Static120.anInt2668;
				}
				if (local40 == 13) {
					local111 = Static83.anIntArray178[local26[local35++]];
					@Pc(333) int local333 = local26[local35++];
					local42 = (local111 & 0x1 << local333) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local111 = local26[local35++];
					local42 = Static103.method1704(local111);
				}
				if (local40 == 18) {
					local42 = (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 >> 7) + Static51.anInt1219;
				}
				if (local40 == 19) {
					local42 = (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 >> 7) + Static114.anInt2140;
				}
				if (local40 == 20) {
					local42 = local26[local35++];
				}
				if (local44 == 0) {
					if (local33 == 0) {
						local21 += local42;
					}
					if (local33 == 1) {
						local21 -= local42;
					}
					if (local33 == 2 && local42 != 0) {
						local21 /= local42;
					}
					if (local33 == 3) {
						local21 *= local42;
					}
					local33 = 0;
				} else {
					local33 = local44;
				}
			}
		} catch (@Pc(430) Exception local430) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public static void method2688() {
		aClass85Array1 = null;
		aClass81_1265 = null;
		anIntArray369 = null;
	}
}
