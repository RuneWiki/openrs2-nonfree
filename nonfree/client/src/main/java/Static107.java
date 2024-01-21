import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!nc;")
	public static Class65 aClass65_5;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_16;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public static int anInt2317 = 0;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1030 = Static187.method3089("settings=");

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1031 = Static187.method3089("Take");

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1032 = Static187.method3089("p12_full");

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1033 = aClass92_1031;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!cf;")
	public static Class20 aClass20_13 = new Class20();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!vd;)Lclient!dg;")
	public static Class1_Sub7 method1614(@OriginalArg(1) Class92 arg0) {
		if (arg0.method3233() == 0) {
			return null;
		}
		for (@Pc(27) Class1_Sub7 local27 = (Class1_Sub7) Static117.aClass20_14.method467(); local27 != null; local27 = (Class1_Sub7) Static117.aClass20_14.method468()) {
			if (local27.aClass92_400.method3224(arg0)) {
				return local27;
			}
		}
		return null;
	}
}
