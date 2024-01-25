import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
	public static int anInt3880;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	public static int anInt3881;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public static int anInt3886;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt3878 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method3524(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static6.anInt179;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class138 local26 = Static141.method2953(arg0[local18]);
			if (local26.anInt4329 != -1) {
				@Pc(39) Class58 local39 = (Class58) Static155.aClass198_114.method5210((long) local26.anInt4329);
				if (local39 == null) {
					@Pc(47) Class110 local47 = Static362.method3098(Static316.aClass193_99, local26.anInt4329, 0);
					if (local47 != null) {
						local39 = Static274.aClass47_9.method2677(local47);
						Static155.aClass198_114.method5201(local39, (long) local26.anInt4329);
					}
				}
				if (local39 != null) {
					Static225.aClass58Array87[local16] = local39;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3526(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static275.method4715("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method3527() {
		if (Static274.aClass47_9 == null) {
			return;
		}
		Static151.aClass32_5.method851();
		Static183.method3522();
		Static294.method4911();
		Static306.method5033();
		Static105.method2335();
		Static331.method5367();
		if (Static122.aClass73_1 != null) {
			Static122.aClass73_1.method2227();
		}
		Static88.method2161();
		Static33.method566();
		Static61.method1272();
		Static354.method5641(false);
		Static302.method4960();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class8_Sub1_Sub2_Sub1 local39 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local33];
			if (local39 != null) {
				local39.anInterface7_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass38Array3.length; local46++) {
					local39.aClass38Array3[local46] = null;
				}
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static169.aClass8_Sub1_Sub2_Sub2Array1.length; local65++) {
			@Pc(71) Class8_Sub1_Sub2_Sub2 local71 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local65];
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < local71.aClass38Array3.length; local75++) {
					local71.aClass38Array3[local75] = null;
				}
			}
		}
		Static274.aClass47_9.method2673();
		Static274.aClass47_9 = null;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!vq;BIIZILclient!ug;)V")
	public static void method3531(@OriginalArg(0) Class47 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class51 arg5) {
		if (arg3) {
			Static22.aClass58_3.method4269((Static24.anInt496 - Static22.aClass58_3.method4282()) / 2, (Static23.anInt465 - Static22.aClass58_3.method4286()) / 2);
			Static220.aClass58_46.method4269((Static24.anInt496 - Static220.aClass58_46.method4282()) / 2, 18);
		}
		arg5.method4233(arg4, Static23.anInt465 / 2 - 26, Static330.anInt6312 == 1 ? Static31.aClass159_52.method4311(Static180.anInt3835) : Static43.aClass159_64.method4311(Static180.anInt3835), -1, Static24.anInt496 / 2);
		@Pc(60) int local60 = Static23.anInt465 / 2 - 18;
		arg0.method2759(Static24.anInt496 / 2 - 152, local60, 304, 34, arg1, 0);
		arg0.method2759(Static24.anInt496 / 2 - 151, local60 + 1, 302, 32, 0, 0);
		arg0.method2682(Static24.anInt496 / 2 - 150, local60 - -2, Static171.anInt3660 * 3, 30, arg2, 0);
		arg0.method2682(Static24.anInt496 / 2 + Static171.anInt3660 * 3 - 150, local60 + 2, 300 - Static171.anInt3660 * 3, 30, 0, 0);
		arg5.method4233(arg4, Static23.anInt465 / 2 + 4, Static117.aString26, -1, Static24.anInt496 / 2);
	}
}
