import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
	public static int anInt7272;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
	public static int anInt7278;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
	public static int anInt7280;

	@OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
	public static int anInt7281;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray169 = new String[100];

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "[B")
	public static final byte[] aByteArray83 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_267 = new Class184(59, -2);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5654(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(23) String local23 = Static274.method4071(arg0);
		if (local23 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < Static363.anInt6512; local28++) {
			@Pc(33) String local33 = Static169.aStringArray76[local28];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static274.method4071(local33);
			if (local33 != null && local33.equals(local23)) {
				Static363.anInt6512--;
				for (@Pc(59) int local59 = local28; local59 < Static363.anInt6512; local59++) {
					Static169.aStringArray76[local59] = Static169.aStringArray76[local59 + 1];
					aStringArray169[local59] = aStringArray169[local59 + 1];
					Static352.aStringArray127[local59] = Static352.aStringArray127[local59 + 1];
					Static411.aStringArray164[local59] = Static411.aStringArray164[local59 + 1];
					Static400.aBooleanArray22[local59] = Static400.aBooleanArray22[local59 + 1];
				}
				Static255.anInt4768 = Static296.anInt5417;
				Static414.method5552(Static110.aClass92_79);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg0));
				Static302.aClass3_Sub2_Sub2_2.method6033(arg0);
				return;
			}
		}
	}
}
