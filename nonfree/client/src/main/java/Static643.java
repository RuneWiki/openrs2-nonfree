import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static643 {

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
	public static int anInt9935;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "J")
	public static long aLong315;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_97 = new Class144(41, 3);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)Lclient!jj;")
	public static Class193 method8459(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static327.aFloat32 == 3.0D) {
				return Static322.aClass193_5;
			}
			if ((double) Static327.aFloat32 == 4.0D) {
				return Static577.aClass193_7;
			}
			if ((double) Static327.aFloat32 == 6.0D) {
				return Static720.aClass193_10;
			}
			if ((double) Static327.aFloat32 >= 8.0D) {
				return Static700.aClass193_9;
			}
		} else if (arg0 == 1) {
			if ((double) Static327.aFloat32 == 3.0D) {
				return Static720.aClass193_10;
			}
			if ((double) Static327.aFloat32 == 4.0D) {
				return Static700.aClass193_9;
			}
			if ((double) Static327.aFloat32 == 6.0D) {
				return Static675.aClass193_8;
			}
			if ((double) Static327.aFloat32 >= 8.0D) {
				return Static146.aClass193_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static327.aFloat32 == 3.0D) {
				return Static675.aClass193_8;
			}
			if ((double) Static327.aFloat32 == 4.0D) {
				return Static146.aClass193_6;
			}
			if ((double) Static327.aFloat32 == 6.0D) {
				return Static235.aClass193_3;
			}
			if ((double) Static327.aFloat32 >= 8.0D) {
				return Static205.aClass193_2;
			}
		}
		return null;
	}
}
