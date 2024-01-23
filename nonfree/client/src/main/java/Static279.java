import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "F")
	public static float aFloat196 = 0.0F;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public static int anInt5967 = 0;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt5968 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method4632() {
		Static81.aClass1_Sub16_Sub1_1.method2676(45);
		Static81.aClass1_Sub16_Sub1_1.method2631(0L);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4633(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static253.anInt5514; local17++) {
			if (arg0.equalsIgnoreCase(Static271.aStringArray35[local17])) {
				return true;
			}
		}
		return false;
	}
}
