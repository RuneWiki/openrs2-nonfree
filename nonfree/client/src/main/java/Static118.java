import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
	public static int anInt2585;

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "[Lclient!hm;")
	public static Class5_Sub2[] aClass5_Sub2Array1;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "[I")
	public static final int[] anIntArray205 = new int[8];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2353(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIZLjava/lang/String;)V")
	public static void method2354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static6.method506(false, arg0, arg3, null, arg2, arg1);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)B")
	public static byte method2355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
