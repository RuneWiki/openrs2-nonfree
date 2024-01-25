import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)I")
	public static int method8064() {
		if (Static43.aBoolean74) {
			return 6;
		} else if (Static150.aClass3_Sub11_Sub14_2 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static150.aClass3_Sub11_Sub14_2.anInt6738;
			if (Static18.method569(local14)) {
				return 1;
			} else if (Static14.method197(local14)) {
				return 2;
			} else if (Static364.method5315(local14)) {
				return 3;
			} else if (Static494.method7103(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
