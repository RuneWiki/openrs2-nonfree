import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public static int anInt8838;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public static int anInt8839;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_84 = new Class305(85, -1);

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "[F")
	public static final float[] aFloatArray88 = new float[4];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZBII)I")
	public static int method7505(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class5_Sub43 local17 = Static10.method153(arg1, arg0);
		if (local17 == null) {
			return -1;
		} else if (arg2 >= 0 && local17.anIntArray406.length > arg2) {
			return local17.anIntArray406[arg2];
		} else {
			return -1;
		}
	}
}
