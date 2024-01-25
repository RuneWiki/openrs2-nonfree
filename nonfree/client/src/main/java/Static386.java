import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public static int anInt7205;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!sr;")
	public static Class230 aClass230_7;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!lp;")
	public static Class2_Sub8_Sub2 aClass2_Sub8_Sub2_6;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
	public static final int[] anIntArray584 = new int[5];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lclient!gr;")
	public static Class99 method5782() {
		try {
			return new Class99_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class99) Class.forName("Class99_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class99_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(FFIF)F")
	public static float method5783(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return (arg2 - arg1) * arg0 + arg1;
	}
}
