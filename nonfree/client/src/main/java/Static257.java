import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	public static int anInt4526;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!lw;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I")
	public static int method3602(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!vl;")
	public static Class263 method3604(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static430.aFloat55 == 3.0D) {
				return Static326.aClass263_27;
			}
			if ((double) Static430.aFloat55 == 4.0D) {
				return Static157.aClass263_18;
			}
			if ((double) Static430.aFloat55 == 6.0D) {
				return Static132.aClass263_32;
			}
			if ((double) Static430.aFloat55 >= 8.0D) {
				return Static86.aClass263_34;
			}
		} else if (arg0 == 1) {
			if ((double) Static430.aFloat55 == 3.0D) {
				return Static132.aClass263_32;
			}
			if ((double) Static430.aFloat55 == 4.0D) {
				return Static86.aClass263_34;
			}
			if ((double) Static430.aFloat55 == 6.0D) {
				return Static209.aClass263_24;
			}
			if ((double) Static430.aFloat55 >= 8.0D) {
				return Static40.aClass263_9;
			}
		} else if (arg0 == 2) {
			if ((double) Static430.aFloat55 == 3.0D) {
				return Static209.aClass263_24;
			}
			if ((double) Static430.aFloat55 == 4.0D) {
				return Static40.aClass263_9;
			}
			if ((double) Static430.aFloat55 == 6.0D) {
				return Static437.aClass263_33;
			}
			if ((double) Static430.aFloat55 >= 8.0D) {
				return Static159.aClass263_19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method3606(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static78.aBoolean451) {
			try {
				@Pc(23) Class16 local23 = (Class16) Class.forName("Class16_Sub1").getDeclaredConstructor().newInstance();
				local23.method235(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static78.aBoolean451 = true;
			}
		}
		return arg0;
	}
}
