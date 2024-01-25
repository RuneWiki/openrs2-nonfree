import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!tv", name = "B", descriptor = "F")
	public static float aFloat263;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_83 = new Class187(16);

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "[I")
	public static final int[] anIntArray795 = new int[2];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)Lclient!uh;")
	public static Class352 method8906(@OriginalArg(1) int arg0) {
		@Pc(16) Class352[] local16 = Static10.method56();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			if (local16[local18].anInt10184 == arg0) {
				return local16[local18];
			}
		}
		return null;
	}
}
