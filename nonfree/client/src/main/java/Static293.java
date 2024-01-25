import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "Z")
	public static boolean aBoolean410;

	@OriginalMember(owner = "client!lt", name = "B", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_143 = new Class150(91, 0);

	@OriginalMember(owner = "client!lt", name = "F", descriptor = "[Lclient!bj;")
	public static final Class31[] aClass31Array2 = new Class31[14];

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(III)Z")
	public static boolean method4902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static386.method3038(arg1, arg0) & (Static77.method4917(arg1, arg0) | (arg1 & 0x2000) != 0 | Static280.method4570(arg1, arg0));
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)Z")
	public static boolean method4903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)Lclient!pba;")
	public static Class109 method4904() {
		try {
			return (Class109) Class.forName("Class109_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
