import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
	public static int anInt3969 = -1;

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
	public static int anInt3970 = -1;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Lclient!jd;")
	public static Class174 method3463() {
		try {
			return (Class174) Class.forName("Class174_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIB)I")
	public static int method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
