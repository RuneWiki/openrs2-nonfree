import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!cv;")
	public static Class63 aClass63_3;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Z")
	public static boolean method6107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Z")
	public static boolean method6112(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)Lclient!bh;")
	public static Class2_Sub7_Sub2 method6114() {
		@Pc(17) Class2_Sub7_Sub2 local17 = (Class2_Sub7_Sub2) Static103.aClass290_3.method6680();
		if (local17 != null) {
			local17.method8920();
			local17.method8504();
			return local17;
		}
		do {
			local17 = (Class2_Sub7_Sub2) Static67.aClass290_1.method6680();
			if (local17 == null) {
				return null;
			}
			if (local17.method927() > Static48.method1203()) {
				return null;
			}
			local17.method8920();
			local17.method8504();
		} while ((Long.MIN_VALUE & local17.aLong260) == 0L);
		return local17;
	}
}
