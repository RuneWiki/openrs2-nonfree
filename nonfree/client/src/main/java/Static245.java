import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)Lclient!vf;")
	public static Class1_Sub3_Sub17 method5833(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub3_Sub17 local18 = (Class1_Sub3_Sub17) Static43.aClass54_47.method922((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static377.aClass185_99.method4002(arg0, 0);
		if (local28 == null || local28.length <= 1) {
			return null;
		} else {
			local18 = Static452.method5827(local28);
			Static43.aClass54_47.method920(local18, (long) arg0);
			return local18;
		}
	}
}
