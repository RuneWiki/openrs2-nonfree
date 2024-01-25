import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
	public static void method7517(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Class12_Sub2_Sub3_Sub1.lb = arg0;
		Static128.aClass12_Sub4Array1 = new Class12_Sub4[Static158.anIntArray254[Class12_Sub2_Sub3_Sub1.lb] + 1];
		Static606.anInt10225 = 0;
		Static213.anInt4036 = 0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method7520(@OriginalArg(1) String arg0) {
		@Pc(8) long local8 = (long) 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8 *= 37L;
			@Pc(23) char local23 = arg0.charAt(local13);
			if (local23 >= 'A' && local23 <= 'Z') {
				local8 += (long) (local23 + 1 - 65);
			} else if (local23 >= 'a' && local23 <= 'z') {
				local8 += (long) (local23 - 96);
			} else if (local23 >= '0' && local23 <= '9') {
				local8 += (long) (local23 + 27 - '0');
			}
			if (local8 >= 177917621779460413L) {
				break;
			}
		}
		while (local8 % 37L == 0L && local8 != 0L) {
			local8 /= 37L;
		}
		return local8;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIIIIIIIIII)V")
	public static void method7522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static220.method3432(arg4)) {
			return;
		}
		if (Static46.aClass230ArrayArray1[arg4] == null) {
			Static78.method1475(Static559.aClass230ArrayArray2[arg4], -1, arg8, arg3, arg9, arg1, arg5, arg10, arg0, arg6, arg7, arg2);
		} else {
			Static78.method1475(Static46.aClass230ArrayArray1[arg4], -1, arg8, arg3, arg9, arg1, arg5, arg10, arg0, arg6, arg7, arg2);
		}
	}
}
