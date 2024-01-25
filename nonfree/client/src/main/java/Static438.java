import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!pc;")
	public static Class188 aClass188_126;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	public static int anInt7647;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_162 = new Class256(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_15 = new Class208(6, 0, 4, 2);

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public static void method5925() {
		if (Static105.aClass141_2 != null) {
			Static105.aClass141_2.method5200();
		}
		if (Static51.aClass141_1 != null) {
			Static51.aClass141_1.method5200();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z")
	public static boolean method5926() {
		try {
			if (Static415.anInt7247 == 2) {
				if (Static123.aClass2_Sub9_1 == null) {
					Static123.aClass2_Sub9_1 = Static455.method888(Static391.aClass188_113, Static434.anInt7559, Static358.anInt6316);
					if (Static123.aClass2_Sub9_1 == null) {
						return false;
					}
				}
				if (Static14.aClass229_1 == null) {
					Static14.aClass229_1 = new Class229(Static218.aClass188_18, Static180.aClass188_52);
				}
				if (Static151.aClass2_Sub18_Sub2_1.method2909(Static14.aClass229_1, Static332.aClass188_92, Static123.aClass2_Sub9_1)) {
					Static151.aClass2_Sub18_Sub2_1.method2893();
					Static151.aClass2_Sub18_Sub2_1.method2884(Static229.anInt4373);
					Static151.aClass2_Sub18_Sub2_1.method2891(Static123.aClass2_Sub9_1, Static206.aBoolean322);
					Static123.aClass2_Sub9_1 = null;
					Static14.aClass229_1 = null;
					Static415.anInt7247 = 0;
					Static391.aClass188_113 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static151.aClass2_Sub18_Sub2_1.method2903();
			Static391.aClass188_113 = null;
			Static123.aClass2_Sub9_1 = null;
			Static415.anInt7247 = 0;
			Static14.aClass229_1 = null;
		}
		return false;
	}
}
