import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!eea", name = "fh", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_30 = new Class274(19, 3);

	@OriginalMember(owner = "client!eea", name = "ti", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(CZ)Z")
	public static boolean method2407(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
