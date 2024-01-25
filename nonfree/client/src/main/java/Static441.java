import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_70 = new Class241(25, 6);

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject15 = null;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZII)Z")
	public static boolean method4892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!tka;)I")
	public static int method4894(@OriginalArg(1) Class344 arg0) {
		if (Static571.aClass344_5 == arg0) {
			return 7681;
		} else if (Static257.aClass344_2 == arg0) {
			return 8448;
		} else if (Static399.aClass344_3 == arg0) {
			return 34165;
		} else if (arg0 == Static421.aClass344_4) {
			return 260;
		} else if (arg0 == Static256.aClass344_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
