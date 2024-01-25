import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
	public static int anInt3610;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
	public static int anInt3605 = 0;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Z")
	public static boolean method3190(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub44 local12 = (Class3_Sub44) Static187.aClass130_15.method3543(); local12 != null; local12 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			if (Static505.method2637(local12.anInt7685) && (long) arg0 == local12.aLong219) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZ)Z")
	public static boolean method3191(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 57 || arg0 == 1006 || arg0 == 2 || arg0 == 46;
	}
}
