import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method4666(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static306.aBoolean414) {
			try {
				@Pc(18) Class126 local18 = (Class126) Class.forName("Class126_Sub1").getDeclaredConstructor().newInstance();
				local18.method3097(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static306.aBoolean414 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Z")
	public static boolean method4667(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
