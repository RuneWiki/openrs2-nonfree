import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!hw;I)Lclient!ha;")
	public static Class105_Sub1 method2623(@OriginalArg(0) Class2_Sub17 arg0) {
		return new Class105_Sub1(arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6145(), arg0.method6145(), arg0.method6138());
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BFFF)I")
	public static int method2625(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local21 && local21 > local35) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local21 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method2626() {
		Static447.method6049();
	}
}
