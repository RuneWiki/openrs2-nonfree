import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public static int anInt8411;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[Lclient!vc;")
	public static final Interface21[] anInterface21Array2 = new Interface21[128];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method6593() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static345.anInt6228; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static535.anInt9341; local18++) {
				if (Static541.method7418(Static189.aClass333ArrayArrayArray1, local7, true, local14, local18)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lclient!du;")
	public static Class75 method6594(@OriginalArg(1) int arg0) {
		@Pc(10) Class75 local10 = (Class75) Static61.aClass342_27.method7684((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static360.aClass284_170.method6331(0, arg0);
		local10 = new Class75();
		if (local20 != null) {
			local10.method2183(new Class3_Sub26(local20), arg0);
		}
		Static61.aClass342_27.method7683(local10, (long) arg0);
		return local10;
	}
}
