import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject19 = null;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method2443(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static61.method967(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z")
	public static boolean method2444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)V")
	public static void method2446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class6_Sub1_Sub5 local13 = local7.aClass6_Sub1_Sub5_1;
		@Pc(16) Class6_Sub1_Sub5 local16 = local7.aClass6_Sub1_Sub5_2;
		if (local13 != null) {
			local13.aShort58 = (short) (local13.aShort58 * arg3 / (0x10 << Static134.anInt2822 - 7));
			local13.aShort57 = (short) (local13.aShort57 * arg3 / (0x10 << Static134.anInt2822 - 7));
		}
		if (local16 != null) {
			local16.aShort58 = (short) (local16.aShort58 * arg3 / (0x10 << Static134.anInt2822 - 7));
			local16.aShort57 = (short) (local16.aShort57 * arg3 / (0x10 << Static134.anInt2822 - 7));
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;ZI)Z")
	public static boolean method2447(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(68) int local68;
			if (local41 >= '0' && local41 <= '9') {
				local68 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local68 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local68 = local41 - 'W';
			} else {
				return false;
			}
			if (local68 >= 10) {
				return false;
			}
			if (local26) {
				local68 = -local68;
			}
			@Pc(113) int local113 = local30 * 10 + local68;
			if (local30 != local113 / 10) {
				return false;
			}
			local28 = true;
			local30 = local113;
		}
		return local28;
	}
}
