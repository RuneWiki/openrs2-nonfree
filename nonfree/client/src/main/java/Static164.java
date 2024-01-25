import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg5 > arg3 && arg5 < arg3 + arg6) {
			return arg4 < arg1 + arg7 && arg2 + arg4 > arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILclient!at;ZI)V")
	public static void method3542(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19 = arg1.anInt441;
		@Pc(22) int local22 = arg1.anInt488;
		if (arg1.aByte8 == 0) {
			arg1.anInt441 = arg1.anInt515;
		} else if (arg1.aByte8 == 1) {
			arg1.anInt441 = arg0 - arg1.anInt515;
		} else if (arg1.aByte8 == 2) {
			arg1.anInt441 = arg1.anInt515 * arg0 >> 14;
		}
		if (arg1.aByte7 == 0) {
			arg1.anInt488 = arg1.anInt454;
		} else if (arg1.aByte7 == 1) {
			arg1.anInt488 = arg3 - arg1.anInt454;
		} else if (arg1.aByte7 == 2) {
			arg1.anInt488 = arg1.anInt454 * arg3 >> 14;
		}
		if (arg1.aByte8 == 4) {
			arg1.anInt441 = arg1.anInt488 * arg1.anInt442 / arg1.anInt481;
		}
		if (arg1.aByte7 == 4) {
			arg1.anInt488 = arg1.anInt481 * arg1.anInt441 / arg1.anInt442;
		}
		if (Static591.aBoolean480 && (Static76.method2235(arg1).anInt10800 != 0 || arg1.anInt480 == 0)) {
			if (arg1.anInt488 < 5 && arg1.anInt441 < 5) {
				arg1.anInt488 = 5;
				arg1.anInt441 = 5;
			} else {
				if (arg1.anInt488 <= 0) {
					arg1.anInt488 = 5;
				}
				if (arg1.anInt441 <= 0) {
					arg1.anInt441 = 5;
				}
			}
		}
		if (arg1.anInt474 == Static392.anInt7538) {
			Static2.aClass24_8 = arg1;
		}
		if (arg2 && arg1.anObjectArray11 != null && (arg1.anInt441 != local19 || arg1.anInt488 != local22)) {
			@Pc(202) Class2_Sub44 local202 = new Class2_Sub44();
			local202.aClass24_15 = arg1;
			local202.anObjectArray32 = arg1.anObjectArray11;
			Static98.aClass341_28.method8528(local202);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZIZII)V")
	public static void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static329.anInt6648 = arg3;
		Static590.anInt10439 = arg5;
		Static607.anInt10664 = arg0;
		Static489.anInt9048 = arg1;
		Static443.anInt8237 = arg4;
		if (arg2 && Static443.anInt8237 >= 100) {
			Static621.anInt10870 = Static590.anInt10439 * 512 + 256;
			Static135.anInt3347 = Static489.anInt9048 * 512 + 256;
			Static639.anInt11034 = Static590.method8716(Static135.anInt3347, Static12.anInt172, Static621.anInt10870) - Static329.anInt6648;
		}
		Static496.anInt9165 = 2;
		Static442.anInt8212 = -1;
		Static194.anInt4508 = -1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z")
	public static boolean method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static594.method8740(arg1, arg0) | (arg1 & 0x40000) != 0 || Static586.method8661(arg1, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3546(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
