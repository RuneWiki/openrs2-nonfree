import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	public static int anInt2947;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_911 = Static60.method1113("mapdots");

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
	public static int[] anIntArray316 = new int[128];

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "[I")
	public static int[] anIntArray317 = new int[100];

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!ec;")
	public static Class22 aClass22_912 = Static60.method1113("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III[B)I")
	public static int method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class21.anIntArray73[(local7 ^ arg2[local9]) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class4_Sub5 local7 = null;
		for (@Pc(12) Class4_Sub5 local12 = (Class4_Sub5) Static39.aClass82_4.method2025(); local12 != null; local12 = (Class4_Sub5) Static39.aClass82_4.method2023()) {
			if (local12.anInt529 == arg5 && arg2 == local12.anInt531 && arg0 == local12.anInt542 && local12.anInt526 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub5();
			local7.anInt542 = arg0;
			local7.anInt526 = arg3;
			local7.anInt529 = arg5;
			local7.anInt531 = arg2;
			Static5.method43(local7);
			Static39.aClass82_4.method2028(local7);
		}
		local7.anInt539 = arg4;
		local7.anInt540 = arg8;
		local7.anInt537 = arg6;
		local7.anInt538 = arg1;
		local7.anInt530 = arg7;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!qd;)V")
	public static void method1882(@OriginalArg(1) Class4_Sub1_Sub3_Sub2 arg0) {
		arg0.aBoolean221 = false;
		@Pc(23) Class4_Sub1_Sub17 local23;
		if (arg0.anInt2470 != -1) {
			local23 = Static79.method1437(arg0.anInt2470);
			if (local23 == null || local23.anIntArray330 == null) {
				arg0.anInt2470 = -1;
			} else {
				arg0.anInt2510++;
				if (local23.anIntArray330.length > arg0.anInt2486 && arg0.anInt2510 > local23.anIntArray327[arg0.anInt2486]) {
					arg0.anInt2486++;
					arg0.anInt2510 = 1;
					Static58.method1100(arg0.anInt2462, arg0.anInt2500, arg0.anInt2486, local23);
				}
				if (local23.anIntArray330.length <= arg0.anInt2486) {
					arg0.anInt2510 = 0;
					arg0.anInt2486 = 0;
					Static58.method1100(arg0.anInt2462, arg0.anInt2500, arg0.anInt2486, local23);
				}
			}
		}
		if (arg0.anInt2489 != -1 && Static117.anInt2877 >= arg0.anInt2466) {
			if (arg0.anInt2507 < 0) {
				arg0.anInt2507 = 0;
			}
			@Pc(120) int local120 = Static33.method549(arg0.anInt2489).anInt2768;
			if (local120 == -1) {
				arg0.anInt2489 = -1;
			} else {
				@Pc(132) Class4_Sub1_Sub17 local132 = Static79.method1437(local120);
				if (local132 == null || local132.anIntArray330 == null) {
					arg0.anInt2489 = -1;
				} else {
					arg0.anInt2464++;
					if (local132.anIntArray330.length > arg0.anInt2507 && arg0.anInt2464 > local132.anIntArray327[arg0.anInt2507]) {
						arg0.anInt2507++;
						arg0.anInt2464 = 1;
						Static58.method1100(arg0.anInt2462, arg0.anInt2500, arg0.anInt2507, local132);
					}
					if (arg0.anInt2507 >= local132.anIntArray330.length && (arg0.anInt2507 < 0 || local132.anIntArray330.length <= arg0.anInt2507)) {
						arg0.anInt2489 = -1;
					}
				}
			}
		}
		if (arg0.anInt2474 != -1 && arg0.anInt2477 <= 1) {
			local23 = Static79.method1437(arg0.anInt2474);
			if (local23.anInt2996 == 1 && arg0.anInt2501 > 0 && Static117.anInt2877 >= arg0.anInt2488 && Static117.anInt2877 > arg0.anInt2482) {
				arg0.anInt2477 = 1;
				return;
			}
		}
		if (arg0.anInt2474 != -1 && arg0.anInt2477 == 0) {
			local23 = Static79.method1437(arg0.anInt2474);
			if (local23 == null || local23.anIntArray330 == null) {
				arg0.anInt2474 = -1;
			} else {
				arg0.anInt2492++;
				if (local23.anIntArray330.length > arg0.anInt2483 && local23.anIntArray327[arg0.anInt2483] < arg0.anInt2492) {
					arg0.anInt2483++;
					arg0.anInt2492 = 1;
					Static58.method1100(arg0.anInt2462, arg0.anInt2500, arg0.anInt2483, local23);
				}
				if (arg0.anInt2483 >= local23.anIntArray330.length) {
					arg0.anInt2476++;
					arg0.anInt2483 -= local23.anInt2998;
					if (local23.anInt3000 <= arg0.anInt2476) {
						arg0.anInt2474 = -1;
					} else if (arg0.anInt2483 >= 0 && local23.anIntArray330.length > arg0.anInt2483) {
						Static58.method1100(arg0.anInt2462, arg0.anInt2500, arg0.anInt2483, local23);
					} else {
						arg0.anInt2474 = -1;
					}
				}
				arg0.aBoolean221 = local23.aBoolean271;
			}
		}
		if (arg0.anInt2477 > 0) {
			arg0.anInt2477--;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method1883() {
		Static127.aBoolean273 = true;
		Static130.aBoolean279 = true;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] method1884() {
		@Pc(8) Class4_Sub1_Sub2_Sub3[] local8 = new Class4_Sub1_Sub2_Sub3[Static76.anInt2020];
		for (@Pc(10) int local10 = 0; local10 < Static76.anInt2020; local10++) {
			@Pc(20) Class4_Sub1_Sub2_Sub3 local20 = local8[local10] = new Class4_Sub1_Sub2_Sub3();
			local20.anInt1208 = Static129.anInt3064;
			local20.anInt1207 = Static106.anInt2687;
			local20.anInt1209 = Static57.anIntArray171[local10];
			local20.anInt1205 = Static61.anIntArray175[local10];
			local20.anInt1206 = Static105.anIntArray297[local10];
			local20.anInt1210 = Static30.anIntArray77[local10];
			local20.anIntArray132 = Static27.anIntArray75;
			local20.aByteArray11 = Static124.aByteArrayArray9[local10];
		}
		Static57.method1094();
		return local8;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	public static void method1885() {
		anIntArray317 = null;
		anIntArray316 = null;
		aClass22_911 = null;
		aClass22_912 = null;
	}
}
