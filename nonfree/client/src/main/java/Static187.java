import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
	public static int anInt4103 = 0;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)Z")
	public static boolean method3612(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class6_Sub42 local10 = (Class6_Sub42) Static207.aClass211_29.method5183(); local10 != null; local10 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			if (Static390.method6168(local10.anInt8285) && local10.aLong200 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
