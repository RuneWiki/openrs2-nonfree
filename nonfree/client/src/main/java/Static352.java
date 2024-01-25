import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wo", name = "Q", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array16;

	@OriginalMember(owner = "client!wo", name = "cb", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_111 = new Class37(64);

	@OriginalMember(owner = "client!wo", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString274 = "Loading fonts - ";

	@OriginalMember(owner = "client!wo", name = "gb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!wo", name = "hb", descriptor = "Z")
	public static boolean aBoolean555 = false;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BIII)I")
	public static int method5834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static263.aClass12Array2 == null) {
			return 0;
		}
		@Pc(20) int local20 = arg1 >> 7;
		@Pc(24) int local24 = arg0 >> 7;
		if (local20 < 0 || local24 < 0 || Static43.anInt1151 - 1 < local20 || local24 > Static260.anInt5348 - 1) {
			return 0;
		}
		@Pc(46) int local46 = arg2;
		if (arg2 < 3 && (Static291.aByteArrayArrayArray11[1][local20][local24] & 0x2) != 0) {
			local46 = arg2 + 1;
		}
		return Static263.aClass12Array2[local46].method2698(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!wg;)V")
	public static void method5836(@OriginalArg(1) Class216 arg0) {
		Static183.aClass216_1 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public static void method5837() {
		Static48.aClass37_22.method914();
	}
}
