import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public static int anInt10234;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array16;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static int anInt10233 = 0;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[S")
	public static short[] aShortArray155 = new short[256];

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_109 = new Class230(61, 6);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZI)I")
	public static int method8287(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub29 local8 = Static535.method7881(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray329.length; local27++) {
				if (local8.anIntArray328[local27] == arg0) {
					local25 += local8.anIntArray329[local27];
				}
			}
			return local25;
		}
	}
}
