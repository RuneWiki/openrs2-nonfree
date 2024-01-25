import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!nf;")
	public static Class102 aClass102_39;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	public static void method8401() {
		@Pc(15) Class3_Sub49 local15;
		for (local15 = (Class3_Sub49) Static462.aClass193_48.method4457(); local15 != null; local15 = (Class3_Sub49) Static462.aClass193_48.method4459()) {
			Static297.method4591(false, local15);
		}
		for (local15 = (Class3_Sub49) Static647.aClass193_70.method4457(); local15 != null; local15 = (Class3_Sub49) Static647.aClass193_70.method4459()) {
			Static297.method4591(true, local15);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	public static int method8402(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
