import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_66 = new Class338();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I")
	public static int method2296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg1) {
			return arg1;
		} else if (arg0 <= arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
	public static void method2297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690() * arg0 >> 8;
		if (arg2 == -1 && !Static278.aBoolean253) {
			Static165.method8794();
		} else if (arg2 != -1 && (Static214.anInt4080 != arg2 || !Static610.method8669()) && local8 != 0 && !Static278.aBoolean253) {
			Static542.method7787(arg1, Static604.aClass15_150, local8, arg2);
			Static476.method6888();
		}
		if (Static214.anInt4080 != arg2) {
			Static73.aClass3_Sub1_Sub3_1 = null;
		}
		Static214.anInt4080 = arg2;
	}
}
