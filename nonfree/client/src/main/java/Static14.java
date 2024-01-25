import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "Lclient!im;")
	public static final Class181 aClass181_5 = new Class181("stellardawn", 1);

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IBI)Z")
	public static boolean method135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)Lclient!maa;")
	public static Class212 method137() {
		try {
			return new Class212_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class212) Class.forName("Class212_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class212_Sub2();
			}
		}
	}
}
