import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!cp;")
	public static final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!am", name = "h", descriptor = "[Lclient!ed;")
	public static final Class84[] aClass84Array1 = new Class84[4];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method308(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static286.anInt8741; local16++) {
			if (arg0.equalsIgnoreCase(Static383.aStringArray29[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static229.aStringArray21[local16])) {
				return true;
			}
		}
		return false;
	}
}
