import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Lclient!lb;")
	public static Class221 aClass221_133;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_88 = new Class286(67, 15);

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_150 = new Class186(107, 6);

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_89 = new Class286(37, 2);

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public static int anInt8809 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!oba;IIBI)V")
	public static void method7375(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray430[0];
		@Pc(15) int local15 = arg0.lb[0];
		if (local10 < 0 || Static362.anInt8653 <= local10 || local15 < 0 || Static206.anInt11291 <= local15 || (arg1 < 0 || Static362.anInt8653 <= arg1 || arg2 < 0 || arg2 >= Static206.anInt11291)) {
			return;
		}
		@Pc(79) int local79 = Static135.method2225(0, arg0.method6592(), Static298.anIntArray221, arg1, Static678.aClass360Array5[arg0.aByte146], local15, 0, true, -4, Static104.anIntArray97, 0, arg2, 0, local10);
		if (local79 >= 1 && local79 <= 3) {
			for (@Pc(95) int local95 = 0; local95 < local79 - 1; local95++) {
				arg0.method6611(Static298.anIntArray221[local95], Static104.anIntArray97[local95], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7376(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < Static299.anInt6884; local23++) {
			if (arg0.equalsIgnoreCase(Static59.aStringArray3[local23])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static715.aStringArray30[local23])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method7378() {
		if (Static578.anInt9474 != -1) {
			Static261.method4068(Static578.anInt9474, -1, false, -1);
			Static578.anInt9474 = -1;
		}
	}
}
