import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "Lclient!ml;")
	public static Class160 aClass160_4;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_138 = new Class211(106, 3);

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "[J")
	public static final long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)Z")
	public static boolean method4962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static225.method2960(arg0, arg1) | (arg1 & 0x2000) != 0 | Static289.method3847(arg0, arg1)) & Static49.method693(arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIILclient!iq;)V")
	public static void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1 arg4) {
		@Pc(4) Class270 local4 = Static62.method926(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt52 = (arg1 << Static460.anInt7074) + Static179.anInt3078;
		arg4.anInt53 = arg3;
		arg4.anInt48 = (arg2 << Static460.anInt7074) + Static179.anInt3078;
		for (@Pc(28) Class241 local28 = local4.aClass241_2; local28 != null; local28 = local28.aClass241_1) {
			if (local28.aClass3_Sub4_2.aBoolean490) {
				@Pc(38) int local38 = local28.aClass3_Sub4_2.method5286();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt53 += local8;
			arg4.aBoolean8 = true;
		} else if (local4.aClass3_Sub5_2 != null) {
			arg4.anInt53 -= local4.aClass3_Sub5_2.aShort82;
		}
		local4.aClass3_Sub1_1 = arg4;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
	public static int method4965(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)Z")
	public static boolean method4966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static376.anInt6257; local1++) {
			@Pc(6) Class22 local6 = Static29.aClass22Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt563 == 1) {
				local15 = local6.anInt567 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt572 + (local6.anInt554 * local15 >> 8);
					local37 = local6.anInt560 + (local6.anInt571 * local15 >> 8);
					local47 = local6.anInt565 + (local6.anInt568 * local15 >> 8);
					local57 = local6.anInt553 + (local6.anInt557 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt563 == 2) {
				local15 = arg0 - local6.anInt567;
				if (local15 > 0) {
					local27 = local6.anInt572 + (local6.anInt554 * local15 >> 8);
					local37 = local6.anInt560 + (local6.anInt571 * local15 >> 8);
					local47 = local6.anInt565 + (local6.anInt568 * local15 >> 8);
					local57 = local6.anInt553 + (local6.anInt557 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt563 == 3) {
				local15 = local6.anInt572 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt567 + (local6.anInt566 * local15 >> 8);
					local37 = local6.anInt570 + (local6.anInt564 * local15 >> 8);
					local47 = local6.anInt565 + (local6.anInt568 * local15 >> 8);
					local57 = local6.anInt553 + (local6.anInt557 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt563 == 4) {
				local15 = arg2 - local6.anInt572;
				if (local15 > 0) {
					local27 = local6.anInt567 + (local6.anInt566 * local15 >> 8);
					local37 = local6.anInt570 + (local6.anInt564 * local15 >> 8);
					local47 = local6.anInt565 + (local6.anInt568 * local15 >> 8);
					local57 = local6.anInt553 + (local6.anInt557 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt563 == 5) {
				local15 = arg1 - local6.anInt565;
				if (local15 > 0) {
					local27 = local6.anInt567 + (local6.anInt566 * local15 >> 8);
					local37 = local6.anInt570 + (local6.anInt564 * local15 >> 8);
					local47 = local6.anInt572 + (local6.anInt554 * local15 >> 8);
					local57 = local6.anInt560 + (local6.anInt571 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
