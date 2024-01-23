import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!wf", name = "Yb", descriptor = "I")
	public static int anInt6132;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!wf;II)V")
	public static void method4673(@OriginalArg(1) Class191 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static238.aClass191_11 != null || Static128.aBoolean171 || (arg0 == null || Static74.method1290(arg0) == null)) {
			return;
		}
		Static238.aClass191_11 = arg0;
		Static120.aClass191_18 = Static74.method1290(arg0);
		Static31.anInt773 = 0;
		Static40.anInt989 = arg2;
		Static270.anInt5414 = arg1;
		Static102.aBoolean61 = false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIILclient!wf;III)V")
	public static void method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class191 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static183.aBoolean256) {
			Static80.anInt1857 = 32;
		} else {
			Static80.anInt1857 = 0;
		}
		Static183.aBoolean256 = false;
		@Pc(151) int local151;
		if (Static202.anInt4403 != 0) {
			if (arg3 <= arg5 && arg3 + 16 > arg5 && arg0 >= arg1 && arg0 < arg1 + 16) {
				arg4.anInt6106 -= 4;
				Static40.method817(arg4);
			} else if (arg5 >= arg3 && arg5 < arg3 + 16 && arg1 + arg6 - 16 <= arg0 && arg0 < arg6 + arg1) {
				arg4.anInt6106 += 4;
				Static40.method817(arg4);
			} else if (arg5 >= arg3 - Static80.anInt1857 && Static80.anInt1857 + arg3 + 16 > arg5 && arg0 >= arg1 + 16 && arg0 < arg1 + arg6 - 16) {
				@Pc(127) int local127 = (arg6 - 32) * arg6 / arg2;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(139) int local139 = arg6 - local127 - 32;
				local151 = arg0 - local127 / 2 - arg1 - 16;
				arg4.anInt6106 = local151 * (arg2 - arg6) / local139;
				Static40.method817(arg4);
				Static183.aBoolean256 = true;
			}
		}
		if (Static134.anInt3083 == 0) {
			return;
		}
		local151 = arg4.anInt6088;
		if (arg3 - local151 <= arg5 && arg0 >= arg1 && arg5 < arg3 + 16 && arg6 + arg1 >= arg0) {
			arg4.anInt6106 += Static134.anInt3083 * 45;
			Static40.method817(arg4);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
	public static int method4678() {
		return Static56.anInt1255 == 0 ? 0 : Static246.anInterface4Array1[Static56.anInt1255].method3793();
	}
}
