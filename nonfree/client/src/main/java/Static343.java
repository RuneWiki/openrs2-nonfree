import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "Lclient!wu;")
	public static Class380 aClass380_80;

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)I")
	public static int method4362(@OriginalArg(1) boolean arg0) {
		if (Static200.anIntArray222 == null) {
			return 0;
		} else if (arg0 || Static554.aClass91Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static200.anIntArray222.length; local27++) {
				@Pc(33) int local33 = Static200.anIntArray222[local27];
				if (Static144.aClass380_40.method8638(local33)) {
					local20++;
				}
				if (aClass380_80.method8638(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static200.anIntArray222.length * 2;
		}
	}
}
