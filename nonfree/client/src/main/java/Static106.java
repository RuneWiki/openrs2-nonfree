import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[[Lclient!td;")
	public static Class8_Sub29[][] aClass8_Sub29ArrayArray4;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public static int anInt2198 = 0;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	public static int anInt2205 = 127;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public static void method1708() {
		Static144.aClass61_22.method1378();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!vm;III)V")
	public static void method1711(@OriginalArg(1) Class173 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static185.anInt3679 >= 400) {
			return;
		}
		if (arg0.anIntArray491 != null) {
			arg0 = arg0.method4245();
		}
		if (arg0 == null || !arg0.aBoolean472) {
			return;
		}
		@Pc(33) String local33 = arg0.aString195;
		if (arg0.anInt5600 != 0) {
			@Pc(47) String local47 = Static198.anInt3914 == 1 ? Static172.aString120 : Static115.aString87;
			local33 = local33 + Static279.method4118(arg0.anInt5600, Static21.aClass36_Sub3_Sub1_1.anInt4018) + " (" + local47 + arg0.anInt5600 + ")";
		}
		if (Static149.anInt3012 == 1) {
			Static28.method477(arg1, Static255.aString176, arg3, Static141.aString100 + " -> <col=ffff00>" + local33, Static241.anInt4825, (long) arg2, (short) 18);
		} else if (Static215.aBoolean357) {
			@Pc(357) Class8_Sub1_Sub13 local357 = Static167.anInt3364 == -1 ? null : Static168.method4141(Static167.anInt3364);
			if ((Static234.anInt4722 & 0x2) != 0 && (local357 == null || arg0.method4239(local357.anInt4335, Static167.anInt3364) != local357.anInt4335)) {
				Static28.method477(arg1, Static47.aString39, arg3, Static153.aString105 + " -> <col=ffff00>" + local33, Static57.anInt1261, (long) arg2, (short) 11);
			}
		} else {
			@Pc(107) String[] local107 = arg0.aStringArray83;
			if (Static31.aBoolean47) {
				local107 = Static52.method840(local107);
			}
			@Pc(119) int local119;
			if (local107 != null) {
				for (local119 = 4; local119 >= 0; local119--) {
					if (local107[local119] != null && (Static198.anInt3914 != 0 || !local107[local119].equalsIgnoreCase(Static50.aString43))) {
						@Pc(142) byte local142 = 0;
						@Pc(144) int local144 = -1;
						if (local119 == 0) {
							local142 = 46;
						}
						if (local119 == 1) {
							local142 = 6;
						}
						if (local119 == arg0.anInt5614) {
							local144 = arg0.anInt5607;
						}
						if (local119 == 2) {
							local142 = 4;
						}
						if (local119 == 3) {
							local142 = 3;
						}
						if (local119 == arg0.anInt5622) {
							local144 = arg0.anInt5631;
						}
						if (local119 == 4) {
							local142 = 49;
						}
						Static28.method477(arg1, local107[local119], arg3, "<col=ffff00>" + local33, local144, (long) arg2, local142);
					}
				}
			}
			if (Static198.anInt3914 == 0 && local107 != null) {
				for (local119 = 4; local119 >= 0; local119--) {
					if (local107[local119] != null && local107[local119].equalsIgnoreCase(Static50.aString43)) {
						@Pc(250) short local250 = 0;
						if (arg0.anInt5600 > Static21.aClass36_Sub3_Sub1_1.anInt4018) {
							local250 = 2000;
						}
						@Pc(264) short local264 = 0;
						if (local119 == 0) {
							local264 = 46;
						}
						if (local119 == 1) {
							local264 = 6;
						}
						if (local119 == 2) {
							local264 = 4;
						}
						if (local119 == 3) {
							local264 = 3;
						}
						if (local119 == 4) {
							local264 = 49;
						}
						if (local264 != 0) {
							local264 += local250;
						}
						Static28.method477(arg1, local107[local119], arg3, "<col=ffff00>" + local33, arg0.anInt5626, (long) arg2, local264);
					}
				}
			}
			Static28.method477(arg1, Static187.aString131, arg3, "<col=ffff00>" + local33, Static60.anInt1302, (long) arg2, (short) 1003);
		}
	}
}
