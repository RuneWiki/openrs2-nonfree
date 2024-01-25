import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "Z")
	public static boolean aBoolean201;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Z")
	public static boolean method2179(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public static void method2182() {
		if (!Static254.method4039()) {
			return;
		}
		if (Static475.aStringArray64 == null) {
			Static612.method8068();
		}
		Static416.anInt7045 = 0;
		Static55.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!fca;I)Lclient!gha;")
	public static Class74_Sub3 method2183(@OriginalArg(0) Class3_Sub17 arg0) {
		return new Class74_Sub3(arg0.method4869(), arg0.method4869(), arg0.method4869(), arg0.method4869(), arg0.method4862(), arg0.method4862(), arg0.method4888());
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2184(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static452.aStringArray53.length; local12++) {
			if (Static452.aStringArray53[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
