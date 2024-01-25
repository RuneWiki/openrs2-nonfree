import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "Lclient!in;")
	public static Class157 aClass157_255;

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "Lclient!cb;")
	public static Class49 aClass49_3;

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "Lclient!qs;")
	public static Class284 aClass284_1;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Z)Lclient!tb;")
	public static Class50 method7855() {
		try {
			return new Class50_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class50) Class.forName("Class50_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class50_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZII)Z")
	public static boolean method7857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
