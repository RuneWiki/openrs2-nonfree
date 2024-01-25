import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	public static int anInt5794 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!uu;)Z")
	public static boolean method4579(@OriginalArg(1) Class247 arg0) {
		if (arg0.anInt6842 == Static262.anInt4940) {
			Static95.anInt1910 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)Lclient!kk;")
	public static Class36 method4580() {
		try {
			return new Class36_Sub3();
		} catch (@Pc(15) Throwable local15) {
			try {
				return (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(21) Throwable local21) {
				return new Class36_Sub2();
			}
		}
	}
}
