import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
	public static int[] anIntArray642;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public static int anInt9814;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "[Lclient!ga;")
	public static Class3_Sub1[] aClass3_Sub1Array129;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	public static int anInt9815 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method8180(@OriginalArg(1) String arg0) {
		@Pc(12) String local12 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local12 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(44) int local44 = arg0.indexOf(" ", "directlogin ".length());
			if (local44 >= 0) {
				@Pc(49) int local49 = arg0.length();
				arg0 = arg0.substring(0, local44) + " ";
				for (@Pc(65) int local65 = local44 + 1; local65 < local49; local65++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local12 == null ? arg0 : local12 + arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public static void method8182() {
		Static407.aClass144_1 = new Class144(8);
		Static477.anInt8928 = 0;
		for (@Pc(22) Class3_Sub9 local22 = (Class3_Sub9) Static403.aClass325_5.method8016(); local22 != null; local22 = (Class3_Sub9) Static403.aClass325_5.method8022()) {
			local22.method8581();
		}
	}
}
