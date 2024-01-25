import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lclient!ck;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IBI)Z")
	public static boolean method5880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static531.method7276(arg0, arg1) | (arg0 & 0x40000) != 0 || Static81.method1881(arg1, arg0);
	}
}
