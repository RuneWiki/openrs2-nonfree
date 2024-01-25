import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt6619 = 0;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
	public static final int[] anIntArray1355 = new int[4096];

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!go;")
	public static final Class87 aClass87_15 = new Class87();

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray38 = new boolean[200];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method5664() {
		try {
			if (Static391.anInt6626 == 1) {
				@Pc(17) int local17 = Static249.aClass2_Sub2_Sub4_42.method5285();
				if (local17 > 0 && Static249.aClass2_Sub2_Sub4_42.method5300()) {
					local17 -= Static304.anInt6543;
					if (local17 < 0) {
						local17 = 0;
					}
					Static249.aClass2_Sub2_Sub4_42.method5301(local17);
				} else {
					Static249.aClass2_Sub2_Sub4_42.method5303();
					Static249.aClass2_Sub2_Sub4_42.method5294();
					if (Static198.aClass171_50 == null) {
						Static391.anInt6626 = 0;
					} else {
						Static391.anInt6626 = 2;
					}
					Static27.aClass220_1 = null;
					Static16.aClass2_Sub3_1 = null;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static249.aClass2_Sub2_Sub4_42.method5303();
			Static16.aClass2_Sub3_1 = null;
			Static27.aClass220_1 = null;
			Static391.anInt6626 = 0;
			Static198.aClass171_50 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5666(@OriginalArg(0) String arg0) {
		return Static94.method1870(arg0, 10);
	}
}
