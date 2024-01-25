import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	public static int anInt160;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([[BLclient!vc;Z)V")
	public static void method310(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class200_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt8825; local14++) {
			Static491.method6549();
			for (@Pc(20) int local20 = 0; local20 < Static363.anInt1158 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static511.anInt8889 >> 3; local24++) {
					@Pc(34) int local34 = Static535.anIntArrayArrayArray21[local14][local20][local24];
					if (local34 != -1) {
						@Pc(43) int local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean639 || local43 == 0) {
							@Pc(54) int local54 = local34 >> 1 & 0x3;
							@Pc(60) int local60 = local34 >> 14 & 0x3FF;
							@Pc(66) int local66 = local34 >> 3 & 0x7FF;
							@Pc(76) int local76 = (local60 / 8 << 8) + local66 / 8;
							for (@Pc(78) int local78 = 0; local78 < Static444.anIntArray613.length; local78++) {
								if (Static444.anIntArray613[local78] == local76 && arg0[local78] != null) {
									@Pc(100) Class2_Sub29 local100 = new Class2_Sub29(arg0[local78]);
									arg1.method7400(local24 * 8, local43, Static207.aClass99Array1, local54, local60, local100, local14, local20 * 8, local66);
									arg1.method7412(local14, Static103.aClass39_3, local43, local66, local24 * 8, local54, local12[0] == -1 ? local12 : null, local20 * 8, local100, local60);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static26.aClass191_1 = Static222.aClass299_2.method7461(Static171.aClass131_1, local12[1], local12[0], local12[3], local12[2]);
			Static120.anInt2435 = local12[4];
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lclient!vv;")
	public static Class306 method311(@OriginalArg(0) int arg0) {
		@Pc(8) Class306[] local8 = Static269.method4298();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class306 local24 = local8[local18];
			if (arg0 == local24.anInt9063) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)Z")
	public static boolean method312() {
		if (Static30.aBoolean40) {
			try {
				if ((Boolean) Static559.method6631("showingVideoAd", Static531.aClass283_6.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
