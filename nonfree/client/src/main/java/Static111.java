import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public static int anInt2293;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!bi;")
	public static Class8_Sub1_Sub2 aClass8_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!bn;")
	public static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_7;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString85 = " from your ignore list first.";

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
	public static int[] anIntArray185 = new int[4];

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public static void method1828() {
		if (Static19.anIntArray36 != null && Static15.anIntArray18 != null) {
			return;
		}
		Static15.anIntArray18 = new int[256];
		Static19.anIntArray36 = new int[256];
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(26) double local26 = (double) local14 / 255.0D * 6.283185307179586D;
			Static19.anIntArray36[local14] = (int) (Math.sin(local26) * 4096.0D);
			Static15.anIntArray18[local14] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
