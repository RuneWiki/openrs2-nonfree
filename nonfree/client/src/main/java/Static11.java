import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "[I")
	public static final int[] anIntArray110 = new int[14];

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt628 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!oa;IZLclient!lq;ILclient!gh;ILclient!lm;)V")
	public static void method645(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class106 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class179 arg6) {
		@Pc(19) int local19 = arg2.anInt5805 - arg1 / 2 - 5;
		@Pc(23) int local23 = arg3 + 2;
		if (arg6.anInt5738 != 0) {
			arg0.method7459(arg1 + 10, local23, arg6.anInt5738, arg3 + arg4.method3105() * arg5 + 1 - local23, local19);
		}
		if (arg6.anInt5733 != 0) {
			arg0.method7440(arg4.method3105() * arg5 + arg3 + 1 - local23, local23, arg1 + 10, arg6.anInt5733, local19);
		}
		@Pc(83) int local83 = arg6.anInt5719;
		if (arg2.aBoolean374 && arg6.anInt5743 != -1) {
			local83 = arg6.anInt5743;
		}
		for (@Pc(95) int local95 = 0; local95 < arg5; local95++) {
			@Pc(101) String local101 = Static137.aStringArray18[local95];
			if (local95 < arg5 - 1) {
				local101 = local101.substring(0, local101.length() - 4);
			}
			arg4.method3102(arg0, local101, arg2.anInt5805, arg3, local83);
			arg3 += arg4.method3105();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method646(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static459.aBoolean586) {
			try {
				@Pc(23) Class21 local23 = (Class21) Class.forName("Class21_Sub1").getDeclaredConstructor().newInstance();
				local23.method6752(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static459.aBoolean586 = true;
			}
		}
		return arg0;
	}
}
