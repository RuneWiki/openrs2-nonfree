import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
	public static int anInt7960;

	@OriginalMember(owner = "client!oda", name = "U", descriptor = "Lclient!dda;")
	public static final Class66 aClass66_7 = new Class66();

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)I")
	public static int method6697(@OriginalArg(0) boolean arg0) {
		if (Static480.anIntArray459 == null) {
			return 0;
		} else if (arg0 || Static33.aClass288Array1 == null) {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < Static480.anIntArray459.length; local26++) {
				@Pc(43) int local43 = Static480.anIntArray459[local26];
				if (Static264.aClass221_72.method5068(local43)) {
					local24++;
				}
				if (Static152.aClass221_39.method5068(local43)) {
					local24++;
				}
			}
			return local24;
		} else {
			return Static480.anIntArray459.length * 2;
		}
	}
}
