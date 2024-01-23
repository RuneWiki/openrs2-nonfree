import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!vj;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Z")
	public static boolean aBoolean3 = true;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BZ)V")
	public static void method35() {
		@Pc(9) byte[][] local9 = Static254.aByteArrayArray13;
		@Pc(16) int[] local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static98.method2086();
			for (@Pc(23) int local23 = 0; local23 < 13; local23++) {
				for (@Pc(27) int local27 = 0; local27 < 13; local27++) {
					@Pc(31) boolean local31 = false;
					@Pc(39) int local39 = Static127.anIntArrayArrayArray8[local18][local23][local27];
					if (local39 != -1) {
						@Pc(49) int local49 = local39 >> 24 & 0x3;
						@Pc(59) int local59 = local39 >> 1 & 0x3;
						@Pc(65) int local65 = local39 >> 14 & 0x3FF;
						@Pc(71) int local71 = local39 >> 3 & 0x7FF;
						@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
						for (@Pc(83) int local83 = 0; local83 < Static169.anIntArray298.length; local83++) {
							if (Static169.anIntArray298[local83] == local81 && local9[local83] != null) {
								local31 = true;
								@Pc(119) int[] local119 = Static191.method3228(local65, local59, local27 * 8, local18, local23 * 8, Static47.aClass65Array1, local9[local83], local49, local71);
								if (local16 == null && local119 != null) {
									local16 = local119;
								}
								break;
							}
						}
					}
					if (!local31) {
						Static127.method2421(8, local18, local27 * 8, local23 * 8, 8);
					}
				}
			}
		}
		if (local16 == null) {
			Static54.anInt1509 = -1;
			return;
		}
		Static54.anInt1509 = local16[0];
		Static29.anInt910 = local16[1];
		Static66.anInt1837 = local16[3];
		Static33.anInt5179 = local16[4];
		Static117.anInt3032 = local16[2];
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg2 >= arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILclient!se;)V")
	public static void method39(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2) {
		if (arg2.aByte18 == 0) {
			arg2.anInt4711 = arg2.anInt4649;
		} else if (arg2.aByte18 == 1) {
			arg2.anInt4711 = arg2.anInt4649 + (arg0 - arg2.anInt4695) / 2;
		} else if (arg2.aByte18 == 2) {
			arg2.anInt4711 = arg0 - arg2.anInt4695 - arg2.anInt4649;
		} else if (arg2.aByte18 == 3) {
			arg2.anInt4711 = arg2.anInt4649 * arg0 >> 14;
		} else if (arg2.aByte18 == 4) {
			arg2.anInt4711 = (arg0 - arg2.anInt4695) / 2 + (arg0 * arg2.anInt4649 >> 14);
		} else {
			arg2.anInt4711 = arg0 - arg2.anInt4695 - (arg0 * arg2.anInt4649 >> 14);
		}
		if (arg2.aByte17 == 0) {
			arg2.anInt4691 = arg2.anInt4678;
		} else if (arg2.aByte17 == 1) {
			arg2.anInt4691 = arg2.anInt4678 + (arg1 - arg2.anInt4726) / 2;
		} else if (arg2.aByte17 == 2) {
			arg2.anInt4691 = arg1 - arg2.anInt4726 - arg2.anInt4678;
		} else if (arg2.aByte17 == 3) {
			arg2.anInt4691 = arg2.anInt4678 * arg1 >> 14;
		} else if (arg2.aByte17 == 4) {
			arg2.anInt4691 = (arg1 - arg2.anInt4726) / 2 + (arg2.anInt4678 * arg1 >> 14);
		} else {
			arg2.anInt4691 = arg1 - arg2.anInt4726 - (arg2.anInt4678 * arg1 >> 14);
		}
		if (!Static70.aBoolean113 || Static39.method702(arg2).anInt4836 == 0 && arg2.anInt4656 != 0) {
			return;
		}
		if (arg2.anInt4691 < 0) {
			arg2.anInt4691 = 0;
		} else if (arg1 < arg2.anInt4691 + arg2.anInt4726) {
			arg2.anInt4691 = arg1 - arg2.anInt4726;
		}
		if (arg2.anInt4711 < 0) {
			arg2.anInt4711 = 0;
		} else if (arg2.anInt4695 + arg2.anInt4711 > arg0) {
			arg2.anInt4711 = arg0 - arg2.anInt4695;
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static237.anInt5140 == 0 || arg0 == 0 || Static139.anInt5524 >= 50 || arg2 == -1) {
			return;
		}
		Static222.anIntArray427[Static139.anInt5524] = arg2;
		Static11.anIntArray44[Static139.anInt5524] = arg0;
		Static52.anIntArray111[Static139.anInt5524] = arg1;
		Static185.aClass76Array1[Static139.anInt5524] = null;
		Static207.anIntArray350[Static139.anInt5524] = 0;
		Static5.anIntArray6[Static139.anInt5524] = arg3;
		Static139.anInt5524++;
	}
}
