import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public static int anInt6116;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public static int anInt6122;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Lclient!oi;")
	public static final Class240 aClass240_7 = new Class240("", 16);

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	public static int anInt6118 = 1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZZ)V")
	public static void method5325() {
		@Pc(14) Class6_Sub9 local14 = Static560.method8089(Static391.aClass126_1, Static609.aClass208_94);
		Static263.method4681(local14);
		for (@Pc(26) Class6_Sub29 local26 = (Class6_Sub29) Static507.aClass128_42.method3556(); local26 != null; local26 = (Class6_Sub29) Static507.aClass128_42.method3555()) {
			if (!local26.method9042()) {
				local26 = (Class6_Sub29) Static507.aClass128_42.method3556();
				if (local26 == null) {
					break;
				}
			}
			if (local26.anInt6363 == 0) {
				Static221.method3774(true, local26, true);
			}
		}
		if (Static523.aClass302_53 != null) {
			Static603.method8464(Static523.aClass302_53);
			Static523.aClass302_53 = null;
		}
	}
}
