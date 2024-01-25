import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "Lclient!pj;")
	public static Class248 aClass248_42;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString39 = "";

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "[I")
	public static final int[] anIntArray401 = new int[8];

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
	public static int anInt4913 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIB)I")
	public static int method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = (local12 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return local30 + (((arg1 & 0xFF00FF) * local35 & 0xFF00FF00 | (arg1 & 0xFF00) * local35 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIB)Z")
	public static boolean method4167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!jr;B)V")
	public static void method4168(@OriginalArg(0) Class6_Sub12 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static213.anInt4004; local3++) {
			@Pc(9) int local9 = arg0.method6034();
			@Pc(13) int local13 = arg0.method6044();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static393.aClass139_Sub1Array1[local9] != null) {
				Static393.aClass139_Sub1Array1[local9].anInt7121 = local13;
			}
		}
	}
}
