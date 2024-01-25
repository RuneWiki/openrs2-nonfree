import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pt", name = "R", descriptor = "Lclient!f;")
	public static Class22 aClass22_16;

	@OriginalMember(owner = "client!pt", name = "T", descriptor = "Lclient!f;")
	public static Class22 aClass22_17;

	@OriginalMember(owner = "client!pt", name = "V", descriptor = "I")
	public static int anInt5738;

	@OriginalMember(owner = "client!pt", name = "Q", descriptor = "[I")
	public static final int[] anIntArray426 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!pt", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray135 = new String[100];

	@OriginalMember(owner = "client!pt", name = "W", descriptor = "I")
	public static int anInt5739 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4603(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static274.method4071(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static317.anInt5757; local23++) {
			@Pc(28) String local28 = Static170.aStringArray78[local23];
			if (local28.startsWith("*")) {
				local28 = local28.substring(1);
			}
			local28 = Static274.method4071(local28);
			if (local28 != null && local28.equals(local18)) {
				Static317.anInt5757--;
				for (@Pc(52) int local52 = local23; local52 < Static317.anInt5757; local52++) {
					Static170.aStringArray78[local52] = Static170.aStringArray78[local52 + 1];
					Static436.aStringArray172[local52] = Static436.aStringArray172[local52 + 1];
					Static195.anIntArray296[local52] = Static195.anIntArray296[local52 + 1];
					Static279.aStringArray173[local52] = Static279.aStringArray173[local52 + 1];
					Static445.anIntArray576[local52] = Static445.anIntArray576[local52 + 1];
					Static430.aBooleanArray25[local52] = Static430.aBooleanArray25[local52 + 1];
				}
				Static255.anInt4768 = Static296.anInt5417;
				Static414.method5552(Static180.aClass92_113);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg0));
				Static302.aClass3_Sub2_Sub2_2.method6033(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "(I)[Lclient!gp;")
	public static Class87[] method4604() {
		return new Class87[] { Static406.aClass87_20, Static87.aClass87_15, Static331.aClass87_19, Static183.aClass87_16, Static447.aClass87_22, Static120.aClass87_10, Static146.aClass87_12, Static43.aClass87_3, Static442.aClass87_21, Static283.aClass87_17, Static299.aClass87_18, Static166.aClass87_13, Static82.aClass87_9, Static146.aClass87_11, Static169.aClass87_14 };
	}
}
