import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
	public static int anInt827;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "Lclient!gt;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_30 = new Class217(88, 10);

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
	public static int anInt829 = -1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ct;B)V")
	public static void method847(@OriginalArg(0) Class30 arg0) {
		Static346.aClass30_102 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Lclient!cs;")
	public static Class29 method856() {
		try {
			return (Class29) Class.forName("Class29_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
