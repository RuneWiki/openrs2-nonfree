import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public static int anInt4486;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_68 = new Class25(71, 7);

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
	public static final int[] anIntArray399 = new int[200];

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_69 = new Class25(34, 4);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	public static int method4015(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local24 >> 12) + 40960;
		return local33 * local18 >> 12;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z")
	public static boolean method4016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static124.method3217(arg0, arg1) & Static96.method1659(arg0, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B)[B")
	public static byte[] method4018(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static459.method5354(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method4019(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static91.aBoolean142) {
			try {
				@Pc(20) Class65 local20 = (Class65) Class.forName("Class65_Sub1").getDeclaredConstructor().newInstance();
				local20.method1543(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static91.aBoolean142 = true;
			}
		}
		return arg0;
	}
}
