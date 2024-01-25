import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_273 = new Class12(97, 15);

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_274 = new Class12(15, 2);

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_107 = new Class254(21, 3);

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_88 = new Class96("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "[I")
	public static final int[] anIntArray398 = new int[1000];

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_275 = new Class12(72, 9);

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIZIBI)V")
	public static void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg1 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(46) int local46 = Static66.aShort17 + local23 * (Static382.aShort93 - Static66.aShort17) / 100;
		if (local46 < Static142.aShort51) {
			local46 = Static142.aShort51;
		} else if (local46 > Static158.aShort56) {
			local46 = Static158.aShort56;
		}
		@Pc(77) int local77 = local46 * arg1 * 512 / (arg3 * 334);
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(93) short local93;
		if (local77 < Static132.aShort48) {
			local93 = Static132.aShort48;
			local46 = arg3 * 334 * local93 / (arg1 * 512);
			if (local46 > Static158.aShort56) {
				local46 = Static158.aShort56;
				local122 = arg1 * 512 * local46 / (local93 * 334);
				local128 = (arg3 - local122) / 2;
				if (arg2) {
					Static447.aClass121_11.va();
					Static447.aClass121_11.method4600(local128, arg4, -16777216, arg1, arg0);
					Static447.aClass121_11.method4600(local128, arg4 + arg3 - local128, -16777216, arg1, arg0);
				}
				arg4 += local128;
				arg3 -= local128 * 2;
			}
		} else if (Static7.aShort1 < local77) {
			local93 = Static7.aShort1;
			local46 = arg3 * local93 * 334 / (arg1 * 512);
			if (local46 < Static142.aShort51) {
				local46 = Static142.aShort51;
				local122 = local93 * arg3 * 334 / (local46 * 512);
				local128 = (arg1 - local122) / 2;
				if (arg2) {
					Static447.aClass121_11.va();
					Static447.aClass121_11.method4600(arg3, arg4, -16777216, local128, arg0);
					Static447.aClass121_11.method4600(arg3, arg4, -16777216, local128, arg0 + arg1 - local128);
				}
				arg0 += local128;
				arg1 -= local128 * 2;
			}
		}
		Static275.anInt4641 = arg1 * local46 / 334;
		Static82.anInt1487 = (short) arg3;
		Static114.anInt2192 = arg0;
		Static90.anInt1738 = (short) arg1;
		Static250.anInt4327 = arg4;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIBI)V")
	public static void method4257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(22) int local22 = -1;
		@Pc(31) int local31 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 + arg1);
		@Pc(39) int local39 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 - arg1);
		Static23.method323(Static283.anIntArrayArray30[arg0], local39, arg3, local31);
		while (local9 > local7) {
			local22 += 2;
			local12 += local22;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local71 = arg0 - local9;
				local75 = local9 + arg0;
				if (Static357.anInt6537 <= local75 && local71 <= Static85.anInt1517) {
					local94 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 + local7);
					local103 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 - local7);
					if (Static85.anInt1517 >= local75) {
						Static23.method323(Static283.anIntArrayArray30[local75], local103, arg3, local94);
					}
					if (Static357.anInt6537 <= local71) {
						Static23.method323(Static283.anIntArrayArray30[local71], local103, arg3, local94);
					}
				}
			}
			local7++;
			local71 = arg0 - local7;
			local75 = arg0 + local7;
			if (local75 >= Static357.anInt6537 && local71 <= Static85.anInt1517) {
				local94 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 + local9);
				local103 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg2 - local9);
				if (local75 <= Static85.anInt1517) {
					Static23.method323(Static283.anIntArrayArray30[local75], local103, arg3, local94);
				}
				if (Static357.anInt6537 <= local71) {
					Static23.method323(Static283.anIntArrayArray30[local71], local103, arg3, local94);
				}
			}
		}
	}
}
