import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!mu;")
	public static Class127 aClass127_2;

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
	public static int anInt861 = -1;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	public static int anInt862 = 0;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "[I")
	public static final int[] anIntArray126 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	public static int anInt868 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	public static int method680(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public static void method681() {
		if (Static66.aClass164_2 == null) {
			return;
		}
		Static118.aClass208_6.method4657();
		Static314.method4644();
		Static372.method1264();
		Static289.method4391();
		Static104.method1484();
		Static352.method4943();
		if (Static177.aClass33_3 != null) {
			Static177.aClass33_3.method561();
		}
		Static42.method655();
		Static81.method1214();
		Static130.method1904();
		Static32.method500(false);
		Static70.method1140();
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class25_Sub1_Sub1_Sub1 local43 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local37];
			if (local43 != null) {
				local43.aClass1_Sub44_3 = null;
				for (@Pc(50) int local50 = 0; local50 < local43.aClass22Array3.length; local50++) {
					local43.aClass22Array3[local50] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static171.aClass25_Sub1_Sub1_Sub2Array1.length; local75++) {
			@Pc(81) Class25_Sub1_Sub1_Sub2 local81 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass22Array3.length; local85++) {
					local81.aClass22Array3[local85] = null;
				}
			}
		}
		Static66.aClass164_2.method5320();
		Static66.aClass164_2 = null;
	}
}
