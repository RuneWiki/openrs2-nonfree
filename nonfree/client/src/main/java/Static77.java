import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_49 = new Class151("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_71 = new Class137(81, 7);

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_57 = new Class214(17, 3);

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "[S")
	public static final short[] aShortArray19 = new short[] { 17, 6, 25, 49, 10, 3, 60, 9 };

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
	public static int anInt1449 = 0;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V")
	public static void method1209() {
		if (Static37.aClass166_2 != Static136.aClass166_3) {
			try {
				Static460.method3422("tbrefresh", Static389.aClient4);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)I")
	public static int method1210(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return local21 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public static void method1212() {
		Static430.method5419();
		Static38.aClass128_9 = null;
		Static103.aClass9_1 = null;
		Static252.aClass9_3 = null;
		Static291.aClass9_4 = null;
		Static167.aClass210ArrayArray1 = null;
	}
}
