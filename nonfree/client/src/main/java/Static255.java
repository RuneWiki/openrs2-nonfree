import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!bt;")
	public static Class34 aClass34_56;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Lclient!vr;")
	public static Class380 aClass380_1;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_18 = new Class66(4);

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public static int anInt4152 = 0;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_94 = new Class151(10, -1);

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Lclient!si;")
	public static final Class331 aClass331_2 = new Class331();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public static int method3693(@OriginalArg(0) int arg0) {
		@Pc(25) byte local25;
		if (arg0 > 12000) {
			local25 = 4;
			Static486.method6643();
		} else if (arg0 > 5000) {
			local25 = 3;
			Static331.method4564();
		} else if (arg0 > 2000) {
			Static38.method7844();
			local25 = 2;
		} else {
			local25 = 1;
			Static539.method7210();
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 2) {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 2);
			Static46.method825(2, false);
		}
		Static361.method4808();
		return local25;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	public static void method3695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static92.aClass234_1 == Static333.aClass234_5) {
			if (!Static254.method3686(false, -2, arg0, 0, 1, 0, arg1, 1)) {
				Static254.method3686(false, -3, arg0, 0, 1, 0, arg1, 1);
			}
		} else if (!Static254.method3686(false, -3, arg0, 0, 1, 0, arg1, 1)) {
			Static254.method3686(false, -2, arg0, 0, 1, 0, arg1, 1);
		}
	}
}
