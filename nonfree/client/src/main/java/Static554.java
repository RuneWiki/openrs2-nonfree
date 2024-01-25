import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "[[Lclient!vc;")
	public static Class344[][] aClass344ArrayArray1;

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "Lclient!tf;")
	public static Class322 aClass322_152;

	@OriginalMember(owner = "client!vfa", name = "t", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_174 = new Class56(70, 0);

	@OriginalMember(owner = "client!vfa", name = "v", descriptor = "I")
	public static int anInt8820 = 0;

	@OriginalMember(owner = "client!vfa", name = "w", descriptor = "[I")
	public static final int[] anIntArray577 = new int[1000];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)Z")
	public static boolean method7332(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 3 || arg0 == 1007 || arg0 == 8 || arg0 == 59;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZII)I")
	public static int method7333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg2 > arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method7335(@OriginalArg(0) String arg0) {
		@Pc(15) long local15 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local15 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local15 += local30 + 1 - 65;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local15 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local15 += local30 - 21;
			}
			if (local15 >= 177917621779460413L) {
				break;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}
}
