import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!g;")
	public static Class83 aClass83_108;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public static int anInt5604;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Lclient!wb;")
	public static Class243 aClass243_24 = new Class243(64);

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	public static int anInt5601 = 0;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
	public static int anInt5605 = -2;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(JB)V")
	public static void method4919(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)Lclient!wd;")
	public static Class235 method4920() {
		try {
			return (Class235) Class.forName("Class235_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
