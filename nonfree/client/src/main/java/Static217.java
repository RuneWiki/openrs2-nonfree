import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	public static int anInt4660;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "Z")
	public static boolean aBoolean262;

	@OriginalMember(owner = "client!we", name = "S", descriptor = "I")
	public static int anInt4668 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
	public static void method3439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static214.anInt4572 && arg1 <= Static130.anInt2847 && arg0 >= Static141.anInt3163 && arg4 <= Static200.anInt4273) {
			Static155.method2625(arg2, arg4, arg1, arg3, arg0);
		} else {
			Static43.method707(arg4, arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILclient!f;)V")
	public static void method3440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub4_Sub1 arg3) {
		if (Static84.aClass9_Sub4_Sub1_2 == arg3 || Static91.anInt2134 >= 400) {
			return;
		}
		@Pc(58) Class60 local58;
		if (arg3.anInt1417 == 0) {
			local58 = Static34.method611(new Class60[] { arg3.aClass60_414, Static80.method1428(arg3.anInt1412, Static84.aClass9_Sub4_Sub1_2.anInt1412), Static37.aClass60_287, Static214.aClass60_1569, Static40.method681(arg3.anInt1412), Static102.aClass60_762 });
		} else {
			local58 = Static34.method611(new Class60[] { arg3.aClass60_414, Static37.aClass60_287, Static52.aClass60_418, Static40.method681(arg3.anInt1417), Static102.aClass60_762 });
		}
		@Pc(98) int local98;
		if (Static79.anInt1905 == 1) {
			Static56.method1061((long) arg0, Static9.aClass60_1510, arg1, (short) 8, arg2, Static34.method611(new Class60[] { Static108.aClass60_809, Static97.aClass60_735, local58 }));
		} else if (!Static75.aBoolean98) {
			for (local98 = 7; local98 >= 0; local98--) {
				if (Static82.aClass60Array13[local98] != null) {
					@Pc(110) short local110 = 0;
					if (Static156.anInt3468 == 0 && Static82.aClass60Array13[local98].method1805(Static3.aClass60_31)) {
						if (arg3.anInt1412 > Static84.aClass9_Sub4_Sub1_2.anInt1412) {
							local110 = 2000;
						}
						if (Static84.aClass9_Sub4_Sub1_2.anInt1398 != 0 && arg3.anInt1398 != 0) {
							if (Static84.aClass9_Sub4_Sub1_2.anInt1398 == arg3.anInt1398) {
								local110 = 2000;
							} else {
								local110 = 0;
							}
						}
					} else if (Static99.aBooleanArray16[local98]) {
						local110 = 2000;
					}
					@Pc(166) short local166 = Static74.aShortArray24[local98];
					@Pc(171) short local171 = (short) (local166 + local110);
					Static56.method1061((long) arg0, Static82.aClass60Array13[local98], arg1, local171, arg2, Static34.method611(new Class60[] { Static187.aClass60_1347, local58 }));
				}
			}
		} else if ((Static210.anInt3912 & 0x8) == 8) {
			Static56.method1061((long) arg0, Static36.aClass60_1324, arg1, (short) 9, arg2, Static34.method611(new Class60[] { Static73.aClass60_561, Static97.aClass60_735, local58 }));
		}
		for (local98 = 0; local98 < Static91.anInt2134; local98++) {
			if (Static171.aShortArray50[local98] == 11) {
				Static52.aClass60Array8[local98] = Static34.method611(new Class60[] { Static187.aClass60_1347, local58 });
				return;
			}
		}
	}
}
