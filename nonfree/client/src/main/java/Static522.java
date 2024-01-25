import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sga", name = "H", descriptor = "I")
	public static int anInt8441;

	@OriginalMember(owner = "client!sga", name = "z", descriptor = "[I")
	public static final int[] anIntArray623 = new int[5];

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BI)Lclient!cv;")
	public static Class63 method7263(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static371.aFloat186 == 3.0D) {
				return Static517.aClass63_4;
			}
			if ((double) Static371.aFloat186 == 4.0D) {
				return Static418.aClass63_3;
			}
			if ((double) Static371.aFloat186 == 6.0D) {
				return Static594.aClass63_7;
			}
			if ((double) Static371.aFloat186 >= 8.0D) {
				return Static15.aClass63_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static371.aFloat186 == 3.0D) {
				return Static594.aClass63_7;
			}
			if ((double) Static371.aFloat186 == 4.0D) {
				return Static15.aClass63_1;
			}
			if ((double) Static371.aFloat186 == 6.0D) {
				return Static630.aClass63_8;
			}
			if ((double) Static371.aFloat186 >= 8.0D) {
				return Static546.aClass63_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static371.aFloat186 == 3.0D) {
				return Static630.aClass63_8;
			}
			if ((double) Static371.aFloat186 == 4.0D) {
				return Static546.aClass63_5;
			}
			if ((double) Static371.aFloat186 == 6.0D) {
				return Static125.aClass63_2;
			}
			if ((double) Static371.aFloat186 >= 8.0D) {
				return Static562.aClass63_6;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7264(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static650.method2274(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
