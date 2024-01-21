import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_629 = Static170.method3101("mapdots");

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Lclient!ea;")
	public static Class23 aClass23_8 = new Class23();

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt2115 = 0;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public static int anInt2118 = 0;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array12 = new Class28[500];

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "[Lclient!dd;")
	public static Class19[] aClass19Array1 = new Class19[16];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
	public static void method1637(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static32.aBooleanArray5[arg0]) {
			return;
		}
		Static92.aClass7_67.method1034(arg0);
		if (Static42.aClass33ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(23) boolean local23 = true;
		for (@Pc(25) int local25 = 0; local25 < Static42.aClass33ArrayArray1[arg0].length; local25++) {
			if (Static42.aClass33ArrayArray1[arg0][local25] != null) {
				if (Static42.aClass33ArrayArray1[arg0][local25].anInt1522 == 2) {
					local23 = false;
				} else {
					Static42.aClass33ArrayArray1[arg0][local25] = null;
				}
			}
		}
		if (local23) {
			Static42.aClass33ArrayArray1[arg0] = null;
		}
		Static32.aBooleanArray5[arg0] = false;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method1638() {
		aClass28_629 = null;
		aClass23_8 = null;
		aClass19Array1 = null;
		aClass28Array12 = null;
	}
}
