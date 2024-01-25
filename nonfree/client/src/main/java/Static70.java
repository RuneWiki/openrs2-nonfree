import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cm", name = "J", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Lclient!db;")
	public static final Class64 aClass64_71 = new Class64(19, -1);

	@OriginalMember(owner = "client!cm", name = "F", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_18 = new Class61(49, 3);

	@OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
	public static int anInt1454 = -1;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lclient!rq;")
	public static Class72 method1254() {
		try {
			return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method1255(@OriginalArg(1) Class66 arg0) {
		if (Static272.aBoolean390) {
			Static187.method7274(arg0);
		} else {
			Static43.method724(arg0);
		}
	}
}
