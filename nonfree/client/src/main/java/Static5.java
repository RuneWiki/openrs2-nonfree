import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Z")
	public static boolean aBoolean7;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_41 = Static187.method3089("Texturen geladen)3");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt104 = -1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_42 = Static187.method3089(")1j");

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public static volatile int anInt107 = 0;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_43 = Static187.method3089("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public static boolean method96(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub5 local8 = Static154.method2362(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method969(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method98() {
		if (Static153.aClass11_14 != null || Static161.aClass11_15 != null) {
			return;
		}
		@Pc(18) int local18 = Static196.anInt4284;
		@Pc(27) int local27;
		@Pc(78) int local78;
		if (Static35.aBoolean61) {
			@Pc(25) int local25;
			if (local18 != 1) {
				local25 = Static85.anInt1855;
				local27 = Static126.anInt2633;
				if (local25 < Static192.anInt4179 - 10 || Static170.anInt3552 + Static192.anInt4179 + 10 < local25 || Static196.anInt4260 - 10 > local27 || Static196.anInt4260 + Static31.anInt737 + 10 < local27) {
					Static35.aBoolean61 = false;
					Static70.method1085(Static192.anInt4179, Static31.anInt737, Static170.anInt3552, Static196.anInt4260);
				}
			}
			if (local18 == 1) {
				local25 = Static192.anInt4179;
				local78 = Static170.anInt3552;
				local27 = Static196.anInt4260;
				@Pc(82) int local82 = Static140.anInt2804;
				@Pc(84) int local84 = Static57.anInt1370;
				@Pc(86) int local86 = -1;
				for (@Pc(88) int local88 = 0; local88 < Static152.anInt3135; local88++) {
					@Pc(104) int local104 = local27 + (Static152.anInt3135 - local88 - 1) * 15 + 31;
					if (local25 < local84 && local78 + local25 > local84 && local82 > local104 - 13 && local104 + 3 > local82) {
						local86 = local88;
					}
				}
				if (local86 != -1) {
					Static64.method1030(local86);
				}
				Static35.aBoolean61 = false;
				Static70.method1085(Static192.anInt4179, Static31.anInt737, Static170.anInt3552, Static196.anInt4260);
				return;
			}
			return;
		}
		if (local18 == 1 && Static152.anInt3135 > 0) {
			@Pc(170) short local170 = Static120.aShortArray21[Static152.anInt3135 - 1];
			if (local170 == 22 || local170 == 2 || local170 == 31 || local170 == 3 || local170 == 14 || local170 == 42 || local170 == 13 || local170 == 40 || local170 == 26 || local170 == 15 || local170 == 49 || local170 == 1001) {
				local27 = Static119.anIntArray192[Static152.anInt3135 - 1];
				local78 = Static184.anIntArray327[Static152.anInt3135 - 1];
				@Pc(234) Class11 local234 = Static9.method2342(local78);
				if (Static73.method1117(Static195.method3194(local234)) || Static195.method3195(Static195.method3194(local234))) {
					Static180.aBoolean242 = false;
					Static93.anInt1974 = 0;
					if (Static153.aClass11_14 != null) {
						Static73.method1118(Static153.aClass11_14);
					}
					Static153.aClass11_14 = Static9.method2342(local78);
					Static117.anInt2509 = Static57.anInt1370;
					Static144.anInt2891 = local27;
					Static109.anInt2362 = Static140.anInt2804;
					Static73.method1118(Static153.aClass11_14);
					return;
				}
			}
		}
		if (local18 == 1 && (Static141.anInt2817 == 1 && Static152.anInt3135 > 2 || Static141.method2092(Static152.anInt3135 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static152.anInt3135 > 0) {
			Static64.method1030(Static152.anInt3135 - 1);
		}
		if (local18 != 2 || Static152.anInt3135 <= 0) {
			return;
		}
		Static18.method406();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIILclient!e;IJZ)Z")
	public static boolean method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class8 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static110.method1656(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
