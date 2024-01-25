import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "[S")
	public static short[] aShortArray49;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	public static int anInt5977 = 0;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_173 = new Class194(23, 10);

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	public static void method5151() {
		if (!Static540.aBoolean673) {
			return;
		}
		while (true) {
			while (Static536.anInt9044 < Static456.aClass354_Sub1Array2.length) {
				@Pc(28) Class354_Sub1 local28 = Static456.aClass354_Sub1Array2[Static536.anInt9044];
				if (local28 != null && local28.anInt9775 == -1) {
					if (Static259.aClass3_Sub42_1 == null) {
						Static259.aClass3_Sub42_1 = Static602.aClass227_1.method5782(local28.aString100);
					}
					@Pc(51) int local51 = Static259.aClass3_Sub42_1.anInt7888;
					if (local51 == -1) {
						return;
					}
					local28.anInt9775 = local51;
					Static536.anInt9044++;
					Static259.aClass3_Sub42_1 = null;
				} else {
					Static536.anInt9044++;
				}
			}
			return;
		}
	}
}
