import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_122 = new Class133(68, -2);

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "[I")
	public static final int[] anIntArray625 = new int[256];

	@OriginalMember(owner = "client!pl", name = "X", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_56 = new Class71();

	@OriginalMember(owner = "client!pl", name = "zb", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_117 = new Class67("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public static void method5887(@OriginalArg(0) int arg0) {
		Static531.anInt9235 = -1;
		if (arg0 == 37) {
			Static55.aFloat68 = 3.0F;
		} else if (arg0 == 50) {
			Static55.aFloat68 = 4.0F;
		} else if (arg0 == 75) {
			Static55.aFloat68 = 6.0F;
		} else if (arg0 == 100) {
			Static55.aFloat68 = 8.0F;
		} else if (arg0 == 200) {
			Static55.aFloat68 = 16.0F;
		}
		Static531.anInt9235 = -1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method5892() {
		if (Static401.aClass285_11.aBoolean625 && Static547.aClass319_11.anInt9320 != -1) {
			Static165.method3203(Static547.aClass319_11.aString85, Static547.aClass319_11.anInt9320);
		}
	}
}
