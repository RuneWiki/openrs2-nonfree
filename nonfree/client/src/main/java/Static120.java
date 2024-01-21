import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1146 = Static193.method3027("mapflag");

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1152 = Static193.method3027("glow3:");

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1147 = aClass70_1152;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1148 = Static193.method3027("");

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public static int anInt2431 = 0;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1149 = aClass70_1152;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1150 = Static193.method3027("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "[I")
	public static final int[] anIntArray145 = new int[4000];

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1151 = Static193.method3027("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIILclient!m;JZ)V")
	public static void method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class64 local6 = new Class64();
		local6.aClass26_6 = arg4;
		local6.anInt2571 = arg1 * 128 + 64;
		local6.anInt2577 = arg2 * 128 + 64;
		local6.anInt2578 = arg3;
		local6.aLong78 = arg5;
		if (Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub6(arg0, arg1, arg2);
		}
		Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local6;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ui;IBI)V")
	public static void method1724(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub24 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static35.anInt770 >= 400) {
			return;
		}
		if (arg1.anIntArray344 != null) {
			arg1 = arg1.method3065();
		}
		if (arg1 == null || !arg1.aBoolean177) {
			return;
		}
		@Pc(35) Class70 local35 = arg1.aClass70_1928;
		if (arg1.anInt3959 != 0) {
			local35 = Static207.method3296(new Class70[] { local35, Static59.method1602(arg1.anInt3959, Static144.aClass26_Sub2_Sub1_1.anInt1947), Static186.aClass70_1840, Static183.aClass70_1369, Static107.method2404(arg1.anInt3959), Static47.aClass70_477 });
		}
		if (Static210.anInt4244 == 1) {
			Static50.method784((short) 1, arg0, Static41.aClass70_428, Static207.method3296(new Class70[] { Static2.aClass70_2, Static6.aClass70_82, local35 }), (long) arg3, arg2);
		} else if (!Static5.aBoolean7) {
			@Pc(118) Class70[] local118 = arg1.aClass70Array72;
			if (Static179.aBoolean80) {
				local118 = Static22.method372(local118);
			}
			@Pc(128) int local128;
			if (local118 != null) {
				for (local128 = 4; local128 >= 0; local128--) {
					if (local118[local128] != null && (Static55.anInt1196 != 0 || !local118[local128].method2059(Static178.aClass70_1749))) {
						@Pc(152) byte local152 = 0;
						if (local128 == 0) {
							local152 = 35;
						}
						if (local128 == 1) {
							local152 = 46;
						}
						if (local128 == 2) {
							local152 = 32;
						}
						if (local128 == 3) {
							local152 = 24;
						}
						if (local128 == 4) {
							local152 = 41;
						}
						Static50.method784(local152, arg0, local118[local128], Static207.method3296(new Class70[] { Static150.aClass70_1454, local35 }), (long) arg3, arg2);
					}
				}
			}
			if (Static55.anInt1196 == 0 && local118 != null) {
				for (local128 = 4; local128 >= 0; local128--) {
					if (local118[local128] != null && local118[local128].method2059(Static178.aClass70_1749)) {
						@Pc(233) short local233 = 0;
						if (arg1.anInt3959 > Static144.aClass26_Sub2_Sub1_1.anInt1947) {
							local233 = 2000;
						}
						@Pc(242) short local242 = 0;
						if (local128 == 0) {
							local242 = 35;
						}
						if (local128 == 1) {
							local242 = 46;
						}
						if (local128 == 2) {
							local242 = 32;
						}
						if (local128 == 3) {
							local242 = 24;
						}
						if (local128 == 4) {
							local242 = 41;
						}
						if (local242 != 0) {
							local242 += local233;
						}
						Static50.method784(local242, arg0, local118[local128], Static207.method3296(new Class70[] { Static150.aClass70_1454, local35 }), (long) arg3, arg2);
					}
				}
			}
			Static50.method784((short) 1004, arg0, Static210.aClass70_2094, Static207.method3296(new Class70[] { Static150.aClass70_1454, local35 }), (long) arg3, arg2);
		} else if ((Static117.anInt2370 & 0x2) == 2) {
			Static50.method784((short) 51, arg0, Static136.aClass70_1289, Static207.method3296(new Class70[] { Static110.aClass70_1097, Static6.aClass70_82, local35 }), (long) arg3, arg2);
		}
	}
}
