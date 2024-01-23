import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
	public static int[] anIntArray377 = new int[] { -1, 0, -1, 0, 0, 4, 0, 0, 0, 0, -1, 14, 1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 4, -2, 0, 0, 0, -1, 15, 0, 0, 12, 4, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 10, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 7, 2, 0, 1, 0, 6, 6, 3, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 9, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 2, 3, 6, 8, -2, 0, 0, 5, 3, 0, 0, 0, -1, 0, 0, 0, -1, 0, 7, 0, 7, 0, 0, 0, 6, 8, 24, -2, 1, 0, 0, 0, 0, -1, 5, 5, 6, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -2, 0, 6, 0, 0, 0, -2, 0, 0, 4, 0, 5, 0, 10, 2, 0, 0, 10, 0, 0, 0, -2, 0, 0, 6, 1, 0, 0, 0, 7, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 4, 0, 2, 6, 0, 0, 0, -2, 0, -1, -1, 0, 0, 3, 6, 0, 0, 8, 0, 0, 5, 5, -1, 0, 0, 0, 0, -1, 20, -2, 0, 0, 0, 3, 0, 0, -2, 0, 4, 0, -2, 0, 0, 8, 0, 0, -2, 0, 4, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, -1 };

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
	public static int[] anIntArray378 = new int[500];

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1317 = Static231.method3737("Ausw-=hlen");

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method3659() {
		if (Static207.aBoolean391) {
			Static163.aClass1_Sub2_Sub2_71 = null;
			Static207.aBoolean391 = false;
			Static176.aClass64_1 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!di;II)V")
	public static void method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) int arg3) {
		if (Static8.anInt259 >= 400) {
			return;
		}
		if (arg2.anIntArray102 != null) {
			arg2 = arg2.method870();
		}
		if (arg2 == null || !arg2.aBoolean94) {
			return;
		}
		@Pc(30) Class107 local30 = arg2.aClass107_295;
		if (arg2.anInt980 != 0) {
			local30 = Static149.method2437(new Class107[] { local30, Static104.method2403(Static204.aClass5_Sub5_Sub1_2.anInt1286, arg2.anInt980), Static232.aClass107_1156, Static49.aClass107_353, Static115.method2001(arg2.anInt980), Static159.aClass107_930 });
		}
		if (Static167.anInt3590 == 1) {
			Static137.method2291(Static149.method2437(new Class107[] { Static6.aClass107_820, Static202.aClass107_1157, local30 }), arg0, (short) 46, arg3, (long) arg1, Static13.aClass107_124);
		} else if (!Static56.aBoolean124) {
			@Pc(80) Class107[] local80 = arg2.aClass107Array5;
			if (Static153.aBoolean297) {
				local80 = Static231.method3741(local80);
			}
			@Pc(94) int local94;
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && (Static46.anInt1029 != 0 || !local80[local94].method3096(Static95.aClass107_581))) {
						@Pc(120) byte local120 = 0;
						if (local94 == 0) {
							local120 = 25;
						}
						if (local94 == 1) {
							local120 = 26;
						}
						if (local94 == 2) {
							local120 = 18;
						}
						if (local94 == 3) {
							local120 = 1;
						}
						if (local94 == 4) {
							local120 = 29;
						}
						Static137.method2291(Static149.method2437(new Class107[] { Static32.aClass107_207, local30 }), arg0, local120, arg3, (long) arg1, local80[local94]);
					}
				}
			}
			if (Static46.anInt1029 == 0 && local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && local80[local94].method3096(Static95.aClass107_581)) {
						@Pc(196) short local196 = 0;
						if (arg2.anInt980 > Static204.aClass5_Sub5_Sub1_2.anInt1286) {
							local196 = 2000;
						}
						@Pc(209) short local209 = 0;
						if (local94 == 0) {
							local209 = 25;
						}
						if (local94 == 1) {
							local209 = 26;
						}
						if (local94 == 2) {
							local209 = 18;
						}
						if (local94 == 3) {
							local209 = 1;
						}
						if (local94 == 4) {
							local209 = 29;
						}
						if (local209 != 0) {
							local209 += local196;
						}
						Static137.method2291(Static149.method2437(new Class107[] { Static32.aClass107_207, local30 }), arg0, local209, arg3, (long) arg1, local80[local94]);
					}
				}
			}
			Static137.method2291(Static149.method2437(new Class107[] { Static32.aClass107_207, local30 }), arg0, (short) 1002, arg3, (long) arg1, Static188.aClass107_1098);
			return;
		} else if ((Static172.anInt3729 & 0x2) == 2) {
			Static137.method2291(Static149.method2437(new Class107[] { Static219.aClass107_1291, Static202.aClass107_1157, local30 }), arg0, (short) 48, arg3, (long) arg1, Static71.aClass107_470);
			return;
		}
	}
}
