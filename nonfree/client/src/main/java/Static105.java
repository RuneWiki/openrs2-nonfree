import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!s", name = "B", descriptor = "Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 aClass4_Sub2_Sub3_Sub4_5;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "Lclient!pd;")
	public static Class20 aClass20_42;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "I")
	public static int anInt2014 = 1;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1062 = Static28.method504("VOLL");

	@OriginalMember(owner = "client!s", name = "T", descriptor = "I")
	public static int anInt2033 = 0;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1063 = Static28.method504("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
	public static int anInt2043 = 0;

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
	public static int anInt2051 = 0;

	@OriginalMember(owner = "client!s", name = "Cb", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method1437() {
		aClass39_1062 = null;
		aClass4_Sub2_Sub3_Sub4_5 = null;
		aClass20_42 = null;
		aClass39_1063 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)I")
	public static int method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class4_Sub13 local15 = (Class4_Sub13) Static49.aClass42_7.method1055((long) arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray205.length) {
			return local15.anIntArray205[arg1];
		} else {
			return 0;
		}
	}
}
