import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!js", name = "n", descriptor = "Lclient!qj;")
	public static Class165 aClass165_55;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Lclient!lf;")
	public static Class90 aClass90_11;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_81 = new Class140(128);

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	public static int anInt3120 = 1;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!js", name = "o", descriptor = "S")
	public static short aShort30 = 256;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2952(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static102.aStringArray18.length; local7++) {
			if (Static102.aStringArray18[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method2953(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg0;
			return arg1 ? Static117.method2114(local17) : local17;
		} else if (arg0 instanceof Class127) {
			@Pc(31) Class127 local31 = (Class127) arg0;
			return local31.method3662();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public static void method2955() {
		Static137.aClass177Array1 = null;
		Static105.method1978(Static320.anInt6140, Static11.anInt5389, -1, Static100.anInt2086, 0, 0, 0, 0);
		if (Static137.aClass177Array1 != null) {
			Static225.method3158(Static66.aClass177_3.anInt5242, 0, Static332.anInt6360, Static222.anInt4388, -1412584499, Static11.anInt5389, Static320.anInt6140, Static137.aClass177Array1, 0);
			Static137.aClass177Array1 = null;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public static void method2956(@OriginalArg(0) int arg0) {
		if (Static157.anIntArray359 == null || Static157.anIntArray359.length < arg0) {
			Static157.anIntArray359 = new int[arg0];
		}
	}
}
