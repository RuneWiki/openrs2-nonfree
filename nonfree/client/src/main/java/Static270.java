import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_172 = new Class239(48, 2);

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public static int anInt8540 = 0;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public static int anInt8543 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!jd;Lclient!jd;B)V")
	public static void method7136(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_283 != null) {
			arg1.method7802();
		}
		arg1.aClass2_284 = arg0;
		arg1.aClass2_283 = arg0.aClass2_283;
		arg1.aClass2_283.aClass2_284 = arg1;
		arg1.aClass2_284.aClass2_283 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
	public static void method7140() {
		if (Static271.anInt8654 == 6) {
			Static346.method6463(false);
		} else {
			Static398.aClass173_1 = Static497.aClass173_2;
			Static497.aClass173_2 = null;
			Static301.method4738(12);
		}
	}
}
