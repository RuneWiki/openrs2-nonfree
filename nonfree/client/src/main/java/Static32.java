import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_7 = new Class183(48, 3);

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_17 = new Class62("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "J")
	public static long aLong12 = -1L;

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_8 = new Class183(52, 3);

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
	public static int anInt483 = -1;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "[I")
	public static final int[] anIntArray49 = new int[14];

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public static void method362() {
		Static56.aClass41_60.method825();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
	public static int method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static199.anIntArrayArray19 == null ? 0 : Static199.anIntArrayArray19[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
	public static void method365() {
		Static137.aClass27_4 = null;
		Static350.aClass27_22 = null;
		Static76.aClass27_9 = null;
		Static24.aClass27_1 = null;
		Static152.aClass27_18 = null;
		Static65.aClass27_6 = null;
		Static248.aClass27_20 = null;
		Static51.aClass27_2 = null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
	public static void method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg0 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = local51 * (arg0 - 1);
		@Pc(101) int local101;
		@Pc(110) int local110;
		if (Static317.anInt5793 <= arg2 && arg2 <= Static69.anInt1551) {
			local101 = Static86.method1459(Static121.anInt6758, arg3 + arg4, Static179.anInt3768);
			local110 = Static86.method1459(Static121.anInt6758, arg4 - arg3, Static179.anInt3768);
			Static307.method5019(Static152.anIntArrayArray30[arg2], local101, arg1, local110);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local63 += local55;
					local77 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local7++;
				local77 += local55;
				local63 += local55;
			}
			local47 += -local71;
			local38 += -local83;
			local71 -= local51;
			local83 -= local51;
			local9--;
			local101 = arg2 - local9;
			local110 = arg2 + local9;
			if (Static317.anInt5793 <= local110 && local101 <= Static69.anInt1551) {
				@Pc(215) int local215 = Static86.method1459(Static121.anInt6758, local7 + arg4, Static179.anInt3768);
				@Pc(224) int local224 = Static86.method1459(Static121.anInt6758, arg4 - local7, Static179.anInt3768);
				if (Static317.anInt5793 <= local101) {
					Static307.method5019(Static152.anIntArrayArray30[local101], local215, arg1, local224);
				}
				if (local110 <= Static69.anInt1551) {
					Static307.method5019(Static152.anIntArrayArray30[local110], local215, arg1, local224);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(CB)Z")
	public static boolean method367(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!db;I)Z")
	public static boolean method368(@OriginalArg(0) Class49 arg0) {
		return Static311.aClass49_2 == arg0 || Static191.aClass49_6 == arg0 || arg0 == Static209.aClass49_5;
	}
}
