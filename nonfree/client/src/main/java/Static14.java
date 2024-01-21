import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "I")
	public static int anInt388;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
	public static int anInt393;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_261 = Static118.method2249("Use");

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_253 = aClass65_261;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_256 = Static118.method2249("No response from server)3");

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_254 = aClass65_256;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_259 = Static118.method2249("yellow:");

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_255 = aClass65_259;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Lclient!oc;")
	public static Class65 aClass65_257 = aClass65_259;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_258 = Static118.method2249("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_260 = Static118.method2249("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(BI)Lclient!oc;")
	public static Class65 method269(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static109.method2004(new Class65[] { Static98.aClass65_1475, Static118.method2250(arg0), Static138.aClass65_1895 });
		} else if (arg0 < 10000000) {
			return Static109.method2004(new Class65[] { Static2.aClass65_46, Static118.method2250(arg0 / 1000), Static25.aClass65_534, Static138.aClass65_1895 });
		} else {
			return Static109.method2004(new Class65[] { Static153.aClass65_2026, Static118.method2250(arg0 / 1000000), Static50.aClass65_877, Static138.aClass65_1895 });
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BBI)I")
	public static int method270(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static72.method1239(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)I")
	public static int method272() {
		@Pc(9) int local9 = Static171.method2896(Static78.anInt1919, Static207.anInt4425, Static160.anInt2779);
		return local9 - Static97.anInt2437 >= 800 || (Static106.aByteArrayArrayArray67[Static207.anInt4425][Static78.anInt1919 >> 7][Static160.anInt2779 >> 7] & 0x4) == 0 ? 3 : Static207.anInt4425;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	public static void method273(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub15 local10 = (Class1_Sub15) Static145.aClass99_11.method3292((long) arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray269.length; local15++) {
				local10.anIntArray269[local15] = -1;
				local10.anIntArray270[local15] = 0;
			}
		}
	}
}
