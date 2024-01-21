import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array6;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public static int anInt640;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lclient!ab;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_291 = Static187.method3089("sl_button");

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
	public static int anInt639 = 0;

	@OriginalMember(owner = "client!cj", name = "db", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_294 = Static187.method3089("Please enter your password)3");

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "Lclient!vd;")
	public static Class92 aClass92_292 = aClass92_294;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_293 = Static187.method3089("http:)4)4");

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	public static int anInt642 = -1;

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)I")
	public static int method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return 7 - arg0;
		} else if (local8 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([Lclient!oc;[IIII[I)V")
	public static void method512(@OriginalArg(0) Class70[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(8) int local8 = arg3 - 1;
		@Pc(12) int local12 = arg2 + 1;
		@Pc(18) int local18 = (arg2 + arg3) / 2;
		@Pc(22) Class70 local22 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local22;
		while (local8 < local12) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(56) int local56;
			@Pc(69) int local69;
			do {
				local12--;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg1[local39] == 2) {
						local69 = local22.anInt2798;
						local56 = arg0[local12].anInt2798;
					} else if (arg1[local39] == 1) {
						local56 = arg0[local12].anInt2792;
						if (local56 == -1 && arg4[local39] == 1) {
							local56 = 2001;
						}
						local69 = local22.anInt2792;
						if (local69 == -1 && arg4[local39] == 1) {
							local69 = 2001;
						}
					} else if (arg1[local39] == 3) {
						local69 = local22.aBoolean165 ? 1 : 0;
						local56 = arg0[local12].aBoolean165 ? 1 : 0;
					} else {
						local69 = local22.anInt2796;
						local56 = arg0[local12].anInt2796;
					}
					if (local56 != local69) {
						if ((arg4[local39] != 1 || local56 <= local69) && (arg4[local39] != 0 || local56 >= local69)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local8++;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg1[local39] == 2) {
						local56 = arg0[local8].anInt2798;
						local69 = local22.anInt2798;
					} else if (arg1[local39] == 1) {
						local56 = arg0[local8].anInt2792;
						if (local56 == -1 && arg4[local39] == 1) {
							local56 = 2001;
						}
						local69 = local22.anInt2792;
						if (local69 == -1 && arg4[local39] == 1) {
							local69 = 2001;
						}
					} else if (arg1[local39] == 3) {
						local69 = local22.aBoolean165 ? 1 : 0;
						local56 = arg0[local8].aBoolean165 ? 1 : 0;
					} else {
						local56 = arg0[local8].anInt2796;
						local69 = local22.anInt2796;
					}
					if (local69 != local56) {
						if ((arg4[local39] != 1 || local56 >= local69) && (arg4[local39] != 0 || local56 <= local69)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local12 > local8) {
				@Pc(323) Class70 local323 = arg0[local8];
				arg0[local8] = arg0[local12];
				arg0[local12] = local323;
			}
		}
		method512(arg0, arg1, local12, arg3, arg4);
		method512(arg0, arg1, arg2, local12 + 1, arg4);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V")
	public static void method517(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static94.aDouble10 = 3.0D;
		} else if (arg0 == 50) {
			Static94.aDouble10 = 4.0D;
		} else if (arg0 == 75) {
			Static94.aDouble10 = 6.0D;
		} else {
			Static94.aDouble10 = 8.0D;
		}
		Static193.anInt3062 = -1;
		Static193.anInt3062 = -1;
	}
}
