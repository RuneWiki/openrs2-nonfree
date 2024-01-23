import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt2786;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!db;")
	public static Class31 aClass31_24 = new Class31(64);

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public static boolean method2339(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static276.aShortArray92[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1004;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZI)V")
	public static void method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static288.method4405(arg0, arg1 + arg2, arg1 + -arg2, Static151.anIntArrayArray26[arg3]);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		@Pc(30) int local30 = -1;
		@Pc(33) int local33 = -arg2;
		while (local20 < local22) {
			local30 += 2;
			local20++;
			local33 += local30;
			if (local33 >= 0) {
				local22--;
				@Pc(55) int[] local55 = Static151.anIntArrayArray26[arg3 + local22];
				local33 -= local22 << 1;
				@Pc(65) int local65 = arg1 + local20;
				@Pc(72) int[] local72 = Static151.anIntArrayArray26[arg3 - local22];
				@Pc(77) int local77 = arg1 - local20;
				Static288.method4405(arg0, local65, local77, local55);
				Static288.method4405(arg0, local65, local77, local72);
			}
			@Pc(93) int local93 = local22 + arg1;
			@Pc(97) int local97 = arg1 - local22;
			@Pc(104) int[] local104 = Static151.anIntArrayArray26[arg3 - local20];
			@Pc(110) int[] local110 = Static151.anIntArrayArray26[local20 + arg3];
			Static288.method4405(arg0, local93, local97, local110);
			Static288.method4405(arg0, local93, local97, local104);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
	public static void method2342(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static240.aBoolean369 && arg0) {
			local11 = 1;
			local13 = Static19.aByteArrayArray2;
		} else {
			local11 = 4;
			local13 = Static30.aByteArrayArray3;
		}
		for (@Pc(28) int local28 = 0; local28 < local11; local28++) {
			Static39.method716();
			for (@Pc(35) int local35 = 0; local35 < 13; local35++) {
				for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
					@Pc(51) int local51 = Static185.anIntArrayArrayArray14[local28][local35][local40];
					if (local51 != -1) {
						@Pc(62) int local62 = local51 >> 24 & 0x3;
						if (!arg0 || local62 == 0) {
							@Pc(75) int local75 = local51 >> 1 & 0x3;
							@Pc(81) int local81 = local51 >> 14 & 0x3FF;
							@Pc(87) int local87 = local51 >> 3 & 0x7FF;
							@Pc(97) int local97 = local87 / 8 + (local81 / 8 << 8);
							for (@Pc(99) int local99 = 0; local99 < Static177.anIntArray389.length; local99++) {
								if (local97 == Static177.anIntArray389[local99] && local13[local99] != null) {
									Static292.method4477(local13[local99], (local87 & 0x7) * 8, local62, Static27.aClass2Array1, (local81 & 0x7) * 8, local35 * 8, local75, local40 * 8, arg0, local28);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
