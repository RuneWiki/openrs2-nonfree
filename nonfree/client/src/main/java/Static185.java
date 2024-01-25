import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!ne;")
	public static Class234 aClass234_1;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "[[[Lclient!ms;")
	public static Class228[][][] aClass228ArrayArrayArray4;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public static void method2361() {
		@Pc(5) int local5;
		if (Static261.aClass91Array2 != null) {
			for (local5 = 0; local5 < Static211.anInt3064; local5++) {
				Static261.aClass91Array2[local5] = null;
			}
			Static261.aClass91Array2 = null;
		}
		if (Static82.aClass91Array1 != null) {
			for (local5 = 0; local5 < Static540.anInt8911; local5++) {
				Static82.aClass91Array1[local5] = null;
			}
			Static82.aClass91Array1 = null;
		}
		if (Static302.aClass91Array3 != null) {
			for (local5 = 0; local5 < Static397.anInt6548; local5++) {
				Static302.aClass91Array3[local5] = null;
			}
			Static302.aClass91Array3 = null;
		}
		Static364.anIntArrayArrayArray7 = null;
		Static390.anIntArray412 = null;
		Static370.aClass91Array4 = null;
		Static197.anInt2876 = -1;
		Static457.anInt7352 = -1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!mv;ZLclient!ew;)V")
	public static void method2362(@OriginalArg(0) Class229 arg0, @OriginalArg(2) Class99 arg1) {
		Static470.aClass229_110 = arg0;
		Static216.aString145 = "";
		Static299.aClass99_5 = arg1;
		if (Class196.aString58.startsWith("win")) {
			Static216.aString145 = Static216.aString145 + "windows/";
		} else if (Class196.aString58.startsWith("linux")) {
			Static216.aString145 = Static216.aString145 + "linux/";
		} else if (Class196.aString58.startsWith("mac")) {
			Static216.aString145 = Static216.aString145 + "macos/";
		}
		if (Static299.aClass99_5.aBoolean149) {
			Static216.aString145 = Static216.aString145 + "msjava/";
		} else if (Class196.aString59.startsWith("amd64") || Class196.aString59.startsWith("x86_64")) {
			Static216.aString145 = Static216.aString145 + "x86_64/";
		} else if (Class196.aString59.startsWith("i386") || Class196.aString59.startsWith("i486") || Class196.aString59.startsWith("i586") || Class196.aString59.startsWith("x86")) {
			Static216.aString145 = Static216.aString145 + "x86/";
		} else if (Class196.aString59.startsWith("ppc")) {
			Static216.aString145 = Static216.aString145 + "ppc/";
		} else {
			Static216.aString145 = Static216.aString145 + "universal/";
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public static void method2363() {
		Static148.aClass70_6 = new Class70();
	}
}
