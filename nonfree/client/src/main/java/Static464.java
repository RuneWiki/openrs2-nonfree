import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "Lclient!q;")
	public static Class281 aClass281_1 = new Class281(8);

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
	public static int anInt7792 = -1;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BZ)I")
	public static int method6866(@OriginalArg(1) boolean arg0) {
		if (Static438.anIntArray599 == null) {
			return 0;
		} else if (arg0 || Static156.aClass214Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static438.anIntArray599.length; local27++) {
				@Pc(33) int local33 = Static438.anIntArray599[local27];
				if (Static33.aClass207_8.method4678(local33)) {
					local20++;
				}
				if (Static227.aClass207_47.method4678(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static438.anIntArray599.length * 2;
		}
	}
}
