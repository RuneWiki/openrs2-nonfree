import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!sd;")
	public static Class60 aClass60_37;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!se;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2452 = Static118.method2249("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2453 = Static118.method2249("Prepared sound engine");

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt4137 = -1;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2454 = Static118.method2249("<col=ffff00>");

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2455 = Static118.method2249("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public static int anInt4139 = 0;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2456 = null;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2457 = aClass65_2453;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[II[II[Lclient!ad;)V")
	public static void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class3[] arg4) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(18) int local18 = arg0 - 1;
		@Pc(24) int local24 = (arg0 + arg2) / 2;
		@Pc(28) Class3 local28 = arg4[local24];
		@Pc(32) int local32 = arg2 + 1;
		arg4[local24] = arg4[arg0];
		arg4[arg0] = local28;
		while (local32 > local18) {
			@Pc(46) boolean local46 = true;
			@Pc(49) int local49;
			@Pc(63) int local63;
			@Pc(66) int local66;
			do {
				local32--;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg3[local49] == 2) {
						local63 = arg4[local32].anInt92;
						local66 = local28.anInt92;
					} else if (arg3[local49] == 1) {
						local63 = arg4[local32].anInt91;
						local66 = local28.anInt91;
						if (local63 == -1 && arg1[local49] == 1) {
							local63 = 2001;
						}
						if (local66 == -1 && arg1[local49] == 1) {
							local66 = 2001;
						}
					} else if (arg3[local49] == 3) {
						local63 = arg4[local32].aBoolean4 ? 1 : 0;
						local66 = local28.aBoolean4 ? 1 : 0;
					} else {
						local66 = local28.anInt93;
						local63 = arg4[local32].anInt93;
					}
					if (local63 != local66) {
						if ((arg1[local49] != 1 || local63 <= local66) && (arg1[local49] != 0 || local63 >= local66)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			local46 = true;
			do {
				local18++;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg3[local49] == 2) {
						local63 = arg4[local18].anInt92;
						local66 = local28.anInt92;
					} else if (arg3[local49] == 1) {
						local66 = local28.anInt91;
						if (local66 == -1 && arg1[local49] == 1) {
							local66 = 2001;
						}
						local63 = arg4[local18].anInt91;
						if (local63 == -1 && arg1[local49] == 1) {
							local63 = 2001;
						}
					} else if (arg3[local49] == 3) {
						local66 = local28.aBoolean4 ? 1 : 0;
						local63 = arg4[local18].aBoolean4 ? 1 : 0;
					} else {
						local66 = local28.anInt93;
						local63 = arg4[local18].anInt93;
					}
					if (local63 != local66) {
						if ((arg1[local49] != 1 || local66 <= local63) && (arg1[local49] != 0 || local66 >= local63)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			if (local18 < local32) {
				@Pc(335) Class3 local335 = arg4[local18];
				arg4[local18] = arg4[local32];
				arg4[local32] = local335;
			}
		}
		method3127(arg0, arg1, local32, arg3, arg4);
		method3127(local32 + 1, arg1, arg2, arg3, arg4);
	}
}
