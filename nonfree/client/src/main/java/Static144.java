import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)Z")
	public static boolean method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static624.method8687(arg0)) {
			return true;
		} else {
			return !Static624.method8687(arg1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lclient!ho;")
	public static Class6_Sub2_Sub9 method2332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class6_Sub2_Sub9 local23 = (Class6_Sub2_Sub9) Static308.aClass128_19.method3560((long) arg0 << 32 | (long) arg1);
		if (local23 == null) {
			local23 = new Class6_Sub2_Sub9(arg0, arg1);
			Static308.aClass128_19.method3551(local23.aLong278, local23);
		}
		return local23;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lclient!uda;")
	public static Class85 method2334() {
		try {
			return new Class85_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class85) Class.forName("Class85_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class85_Sub1();
			}
		}
	}
}
