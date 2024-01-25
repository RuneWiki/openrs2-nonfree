import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "Lclient!nk;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	public static void method1065() {
		Static184.method2659();
		@Pc(12) int local12 = Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3264();
		if (local12 == 2) {
			Static569.method8221(Static295.anInt4558, Static396.aClass145_6, Static151.anInt7983);
		} else if (local12 == 3) {
			Static519.method7350(Static39.anInt536, Static396.aClass145_6, Static151.anInt7983, Static295.anInt4558, Static578.anInt9140);
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3262()) {
			Static108.method1601(Static316.aCanvas1);
		}
		if (Static396.aClass145_6 != null) {
			Static138.method2005();
		}
		Static591.aBoolean812 = Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3264() != 0;
		Static392.aBoolean549 = Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3262();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)I")
	public static int method1066(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static268.anInt4160 - 1; local3++) {
			if (arg0 < Static314.anIntArray345[local3] + Static708.anIntArray750[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static268.anInt4160 - 1;
		}
		return local1;
	}
}
