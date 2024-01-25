import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public static int anInt4859;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public static int anInt4864;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!qb;")
	public static Class190 aClass190_7;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[Lclient!wl;")
	public static final Class250[] aClass250Array2 = new Class250[16];

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!us;")
	public static final Class234 aClass234_96 = new Class234(97, -2);

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
	public static final int anInt4868 = 1403;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
	public static int anInt4870 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static void method4385() {
		if (Static218.anInt3887 == 2) {
			Static368.anInt6173 = 96;
			return;
		}
		try {
			@Pc(25) Method local25 = Runtime.class.getMethod("maxMemory");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Long local35 = (Long) local25.invoke(local29, (Object[]) null);
					Static368.anInt6173 = (int) (local35 / 1048576L) + 1;
					return;
				} catch (@Pc(45) Throwable local45) {
					return;
				}
			}
		} catch (@Pc(47) Exception local47) {
			return;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	public static void method4386(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(2, arg0);
		local8.method3217();
	}
}
