import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	public static int anInt9005;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!ov;")
	public static Class226 aClass226_9;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public static int anInt9007;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "[I")
	public static final int[] anIntArray834 = new int[14];

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "[Lclient!nv;")
	public static final Class210[] aClass210Array1 = new Class210[2048];

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	public static int anInt9008 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method7394(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static551.method3488(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)Lclient!raa;")
	public static Class1_Sub39 method7408() {
		if (Static118.aClass37_11 == null || Static466.aClass106_1 == null) {
			return null;
		}
		Static466.aClass106_1.method2483(Static118.aClass37_11);
		@Pc(18) Class1_Sub39 local18 = (Class1_Sub39) Static466.aClass106_1.method2484();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class30 local28 = Static118.aClass272_2.method6380(local18.anInt7253);
			return local28 != null && local28.aBoolean49 && local28.method907(Static118.anInterface16_2) ? local18 : Static242.method4179();
		}
	}
}
