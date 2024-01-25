import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)Z")
	public static boolean method6926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static569.method8134(arg0, arg1) | (arg1 & 0x70000) != 0 || Static312.method5229(arg0, arg1);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JJ)J")
	public static long method6927(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)Z")
	public static boolean method6930(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static162.aClass100_7.method8784();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static162.aClass100_7.method8776();
		} else if (!Static162.aClass100_7.method8811()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static348.aClass6_Sub22_19.method3534(arg0 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub25_1);
			Static289.method5031();
			return true;
		}
	}
}
