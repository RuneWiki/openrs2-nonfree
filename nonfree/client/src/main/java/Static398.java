import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
	public static int anInt6250 = -1;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)[Lclient!cf;")
	public static Class56[] method5612() {
		return new Class56[] { Static180.aClass56_6, Static307.aClass56_9, Static68.aClass56_1 };
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIB)Z")
	public static boolean method5613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static237.aBoolean328 || !Static665.aBoolean805) {
			return false;
		} else if (Static293.anInt4968 < 100) {
			return false;
		} else if (Static304.method4669(arg2, arg1, arg3)) {
			@Pc(26) int local26 = arg2 << Static391.anInt10262;
			@Pc(30) int local30 = arg1 << Static391.anInt10262;
			if (Static85.method1626(Static121.aClass21Array2[arg3].method7973(arg2, arg1), arg0, Static207.anInt4003, Static207.anInt4003, local30, local26)) {
				Static627.anInt10013++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
