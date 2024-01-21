import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] aClass5_Sub1_Sub10_Sub3Array11;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	public static int anInt2697 = 0;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1303 = Static38.method736("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1304 = Static38.method736("Login");

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1305 = aClass71_1304;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1306 = Static38.method736("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
	public static int anInt2742 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method1781() {
		aClass71_1306 = null;
		aClass5_Sub1_Sub10_Sub3Array11 = null;
		aClass71_1305 = null;
		aClass71_1303 = null;
		aClass71_1304 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Z")
	public static boolean method1783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(20) Class5_Sub1_Sub15 local20 = Static97.method1606(arg1);
		return local20.method1707(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!ve;II)V")
	public static void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub16 arg2, @OriginalArg(4) int arg3) {
		if (Static49.anInt1394 >= 400) {
			return;
		}
		if (arg2.anIntArray284 != null) {
			arg2 = arg2.method1891();
		}
		if (arg2 == null || !arg2.aBoolean123) {
			return;
		}
		@Pc(26) Class71 local26 = arg2.aClass71_1333;
		if (arg2.anInt2827 != 0) {
			local26 = Static74.method677(new Class71[] { local26, Static112.method1749(arg2.anInt2827, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2496), Static24.aClass71_422, Static7.aClass71_196, Static51.method962(arg2.anInt2827), Static38.aClass71_562 });
		}
		if (Static81.anInt1990 == 1) {
			Static60.method1040(31, Static74.method677(new Class71[] { Static94.aClass71_1106, Static110.aClass71_1288, local26 }), arg3, arg0, arg1, Static31.aClass71_480);
		} else if (!Static33.aBoolean40) {
			@Pc(139) Class71[] local139 = arg2.aClass71Array16;
			if (Static110.aBoolean119) {
				local139 = Static68.method1147(local139);
			}
			@Pc(153) int local153;
			if (local139 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local139[local153] != null && !local139[local153].method1785(Static34.aClass71_539)) {
						@Pc(172) byte local172 = 0;
						if (local153 == 0) {
							local172 = 42;
						}
						if (local153 == 1) {
							local172 = 1;
						}
						if (local153 == 2) {
							local172 = 23;
						}
						if (local153 == 3) {
							local172 = 22;
						}
						if (local153 == 4) {
							local172 = 9;
						}
						Static60.method1040(local172, Static74.method677(new Class71[] { Static104.aClass71_1426, local26 }), arg3, arg0, arg1, local139[local153]);
					}
				}
			}
			if (local139 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local139[local153] != null && local139[local153].method1785(Static34.aClass71_539)) {
						@Pc(250) short local250 = 0;
						if (arg2.anInt2827 > Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2496) {
							local250 = 2000;
						}
						@Pc(259) int local259 = 0;
						if (local153 == 0) {
							local259 = local250 + 42;
						}
						if (local153 == 1) {
							local259 = local250 + 1;
						}
						if (local153 == 2) {
							local259 = local250 + 23;
						}
						if (local153 == 3) {
							local259 = local250 + 22;
						}
						if (local153 == 4) {
							local259 = local250 + 9;
						}
						Static60.method1040(local259, Static74.method677(new Class71[] { Static104.aClass71_1426, local26 }), arg3, arg0, arg1, local139[local153]);
					}
				}
			}
			Static60.method1040(1004, Static74.method677(new Class71[] { Static104.aClass71_1426, local26 }), arg3, arg0, arg1, Static73.aClass71_893);
		} else if ((Static24.anInt741 & 0x2) == 2) {
			Static60.method1040(12, Static74.method677(new Class71[] { Static10.aClass71_222, Static110.aClass71_1288, local26 }), arg3, arg0, arg1, Static82.aClass71_991);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBII)V")
	public static void method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub7 local8 = (Class5_Sub7) Static71.aClass57_10.method1575((long) arg1);
		if (local8 == null) {
			local8 = new Class5_Sub7();
			Static71.aClass57_10.method1581((long) arg1, local8);
		}
		if (arg2 >= local8.anIntArray212.length) {
			@Pc(34) int[] local34 = new int[arg2 + 1];
			@Pc(39) int[] local39 = new int[arg2 + 1];
			for (@Pc(41) int local41 = 0; local41 < local8.anIntArray212.length; local41++) {
				local34[local41] = local8.anIntArray212[local41];
				local39[local41] = local8.anIntArray211[local41];
			}
			for (@Pc(67) int local67 = local8.anIntArray212.length; local67 < arg2; local67++) {
				local34[local67] = -1;
				local39[local67] = 0;
			}
			local8.anIntArray211 = local39;
			local8.anIntArray212 = local34;
		}
		local8.anIntArray212[arg2] = arg3;
		local8.anIntArray211[arg2] = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
	public static void method1802() {
		try {
			@Pc(14) Graphics local14 = Static105.aCanvas1.getGraphics();
			Static3.aClass7_2.method697(4, local14, 4);
		} catch (@Pc(22) Exception local22) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method1807(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136) {
			try {
				@Pc(21) Class19 local21 = (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
				local21.method985(arg0);
				return local21;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		return arg0;
	}
}
