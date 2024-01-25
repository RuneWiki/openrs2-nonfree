import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!li", name = "H", descriptor = "Lclient!rc;")
	public static Class285 aClass285_8;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "I")
	public static int anInt6339 = 2;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "(I)I")
	public static int method5159() {
		return Static232.anIntArray311 == null ? 0 : Static232.anIntArray311.length * 2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5162(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static456.method6912(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static530.anInt9157; local29++) {
			@Pc(35) String local35 = Static54.aStringArray6[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static456.method6912(local35);
			if (local35 != null && local35.equals(local20)) {
				Static530.anInt9157--;
				for (@Pc(59) int local59 = local29; local59 < Static530.anInt9157; local59++) {
					Static54.aStringArray6[local59] = Static54.aStringArray6[local59 + 1];
					Static582.aStringArray36[local59] = Static582.aStringArray36[local59 + 1];
					Static620.anIntArray608[local59] = Static620.anIntArray608[local59 + 1];
					Static3.aStringArray2[local59] = Static3.aStringArray2[local59 + 1];
					Static101.anIntArray135[local59] = Static101.anIntArray135[local59 + 1];
					Static102.aBooleanArray5[local59] = Static102.aBooleanArray5[local59 + 1];
				}
				Static198.anInt4606 = Static75.anInt2309;
				@Pc(124) Class8_Sub31 local124 = Static51.method1418(Static503.aClass257_114, Static608.aClass336_1);
				local124.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg0));
				local124.aClass8_Sub8_Sub2_1.method8582(arg0);
				Static262.method4604(local124);
				return;
			}
		}
	}
}
