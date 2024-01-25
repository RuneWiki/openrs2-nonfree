import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static407 {

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Lclient!kn;")
	public static Class108 aClass108_7;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "[S")
	private static final short[] aShortArray113 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "[S")
	private static final short[] aShortArray114 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "[S")
	private static final short[] aShortArray115 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "[S")
	public static final short[] aShortArray116 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { aShortArray113, aShortArray114, aShortArray115, aShortArray116 };

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_78 = new Class230(8, -1);

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	public static int anInt8012 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!ej;)I")
	public static int method6620(@OriginalArg(1) Class85 arg0) {
		if (arg0 == Static159.aClass85_1) {
			return 5890;
		} else if (arg0 == Static454.aClass85_2) {
			return 34167;
		} else if (Static457.aClass85_4 == arg0) {
			return 34168;
		} else if (Static531.aClass85_5 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
