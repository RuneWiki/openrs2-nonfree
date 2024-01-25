import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	public static int anInt5150;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!tga;")
	public static final Class347 aClass347_1 = new Class347();

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!tga;")
	public static final Class347 aClass347_2 = new Class347();

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "[Lclient!tga;")
	public static final Class347[] aClass347Array1 = new Class347[] { aClass347_2, aClass347_1 };

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Z")
	public static boolean method4685() {
		return Static625.anInt11174 != 0;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public static void method4686() {
		if (Static344.aClass173_5.aBoolean358 && Static264.aClass357_2.anInt9936 != -1) {
			Static332.method5147(Static264.aClass357_2.anInt9936, Static264.aClass357_2.aString110);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
	public static int method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
