import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[S")
	public static short[] aShortArray32 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	public static int anInt2193 = 2301979;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!wf;IIIIII)V")
	public static void method1743(@OriginalArg(1) Class189 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static216.aBoolean298) {
			Static277.anInt5284 = 32;
		} else {
			Static277.anInt5284 = 0;
		}
		Static216.aBoolean298 = false;
		@Pc(147) int local147;
		if (Static86.anInt1991 != 0) {
			if (arg2 <= arg3 && arg2 + 16 > arg3 && arg1 >= arg5 && arg1 < arg5 + 16) {
				arg0.anInt5935 -= 4;
				Static205.method3283(arg0);
			} else if (arg2 <= arg3 && arg2 + 16 > arg3 && arg6 + arg5 - 16 <= arg1 && arg5 + arg6 > arg1) {
				arg0.anInt5935 += 4;
				Static205.method3283(arg0);
			} else if (arg2 - Static277.anInt5284 <= arg3 && arg3 < arg2 + Static277.anInt5284 + 16 && arg1 >= arg5 + 16 && arg1 < arg6 + arg5 - 16) {
				@Pc(129) int local129 = (arg6 - 32) * arg6 / arg4;
				if (local129 < 8) {
					local129 = 8;
				}
				local147 = arg1 - arg5 - local129 / 2 - 16;
				@Pc(153) int local153 = arg6 - local129 - 32;
				arg0.anInt5935 = local147 * (arg4 - arg6) / local153;
				Static205.method3283(arg0);
				Static216.aBoolean298 = true;
			}
		}
		if (Static103.anInt2885 == 0) {
			return;
		}
		local147 = arg0.anInt5897;
		if (arg2 - local147 <= arg3 && arg5 <= arg1 && arg3 < arg2 + 16 && arg1 <= arg6 + arg5) {
			arg0.anInt5935 += Static103.anInt2885 * 45;
			Static205.method3283(arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg6) {
			Static6.method100(arg0, arg3, arg5, arg1, arg2, arg4);
		} else if (arg2 - arg0 >= Static48.anInt902 && Static131.anInt2553 >= arg0 + arg2 && arg5 - arg6 >= Static156.anInt3086 && arg6 + arg5 <= Static218.anInt4231) {
			Static27.method388(arg2, arg4, arg3, arg5, arg0, arg1, arg6);
		} else {
			Static258.method4068(arg1, arg3, arg2, arg6, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1747(@OriginalArg(1) String arg0) {
		@Pc(3) long local3 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local3 *= 37L;
			@Pc(32) char local32 = arg0.charAt(local17);
			if (local32 >= 'A' && local32 <= 'Z') {
				local3 += local32 + 1 - 65;
			} else if (local32 >= 'a' && local32 <= 'z') {
				local3 += local32 + 1 - 97;
			} else if (local32 >= '0' && local32 <= '9') {
				local3 += local32 + 27 - 48;
			}
			if (local3 >= 177917621779460413L) {
				break;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}
}
