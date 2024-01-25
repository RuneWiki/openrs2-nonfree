import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lclient!mp;")
	public static Class1_Sub6_Sub10 method1903(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub6_Sub10 local15 = (Class1_Sub6_Sub10) Static374.aClass137_3.method2930((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static410.aClass270_83.method5704(arg0, 0);
		if (local27 == null || local27.length <= 1) {
			return null;
		} else {
			local15 = Static355.method4848(local27);
			Static374.aClass137_3.method2928((long) arg0, local15);
			return local15;
		}
	}
}
