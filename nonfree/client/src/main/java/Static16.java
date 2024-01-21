import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!hc;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt408;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!je;")
	public static Class40 aClass40_251 = Static69.method1231("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!je;")
	public static Class40 aClass40_252 = Static69.method1231("T");

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!je;")
	private static Class40 aClass40_254 = Static69.method1231("Login");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!je;")
	public static Class40 aClass40_253 = aClass40_254;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	public static int anInt409 = 0;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	public static int anInt416 = 0;

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method296() {
		aClass40_252 = null;
		aClass40_251 = null;
		aClass40_254 = null;
		aClass31_1 = null;
		aClass40_253 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([IIB[II[Lclient!sb;)V")
	public static void method297(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class68[] arg4) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(12) int local12 = arg1 + 1;
		@Pc(18) int local18 = (arg1 + arg3) / 2;
		@Pc(22) int local22 = arg3 - 1;
		@Pc(26) Class68 local26 = arg4[local18];
		arg4[local18] = arg4[arg3];
		arg4[arg3] = local26;
		while (local12 > local22) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(64) int local64;
			@Pc(67) int local67;
			do {
				local12--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg2[local43] == 2) {
						local64 = arg4[local12].anInt2518;
						local67 = local26.anInt2518;
					} else if (arg2[local43] == 1) {
						local64 = arg4[local12].anInt2514;
						local67 = local26.anInt2514;
						if (local67 == -1 && arg0[local43] == 1) {
							local67 = 2001;
						}
						if (local64 == -1 && arg0[local43] == 1) {
							local64 = 2001;
						}
					} else if (arg2[local43] == 3) {
						local64 = arg4[local12].aBoolean202 ? 1 : 0;
						local67 = local26.aBoolean202 ? 1 : 0;
					} else {
						local67 = local26.anInt2515;
						local64 = arg4[local12].anInt2515;
					}
					if (local67 != local64) {
						if ((arg0[local43] != 1 || local67 >= local64) && (arg0[local43] != 0 || local64 >= local67)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local22++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg2[local43] == 2) {
						local67 = local26.anInt2518;
						local64 = arg4[local22].anInt2518;
					} else if (arg2[local43] == 1) {
						local64 = arg4[local22].anInt2514;
						if (local64 == -1 && arg0[local43] == 1) {
							local64 = 2001;
						}
						local67 = local26.anInt2514;
						if (local67 == -1 && arg0[local43] == 1) {
							local67 = 2001;
						}
					} else if (arg2[local43] == 3) {
						local67 = local26.aBoolean202 ? 1 : 0;
						local64 = arg4[local22].aBoolean202 ? 1 : 0;
					} else {
						local64 = arg4[local22].anInt2515;
						local67 = local26.anInt2515;
					}
					if (local64 != local67) {
						if ((arg0[local43] != 1 || local67 <= local64) && (arg0[local43] != 0 || local64 <= local67)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local22 < local12) {
				@Pc(335) Class68 local335 = arg4[local22];
				arg4[local22] = arg4[local12];
				arg4[local12] = local335;
			}
		}
		method297(arg0, local12, arg2, arg3, arg4);
		method297(arg0, arg1, arg2, local12 + 1, arg4);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[Lclient!je;)[Lclient!je;")
	public static Class40[] method300(@OriginalArg(1) Class40[] arg0) {
		@Pc(13) Class40[] local13 = new Class40[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static40.method722(new Class40[] { Static49.method886(local15), Static96.aClass40_1271 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static40.method722(new Class40[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}
}
