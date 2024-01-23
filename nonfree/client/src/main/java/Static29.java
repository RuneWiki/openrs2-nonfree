import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!c", name = "W", descriptor = "I")
	public static int anInt466;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString38 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!c", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[2][][];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
	public static boolean method456() {
		return Static94.aBoolean138 ? true : Static98.aBoolean144;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method461(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static99.aBoolean145) {
			try {
				@Pc(19) Class76 local19 = (Class76) Class.forName("Class76_Sub1").getDeclaredConstructor().newInstance();
				local19.method2332(arg0);
				return local19;
			} catch (@Pc(26) Throwable local26) {
				Static99.aBoolean145 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class95[] local7 = Static305.aClass95Array1;
		for (@Pc(16) int local16 = 0; local16 < local7.length; local16++) {
			@Pc(24) Class95 local24 = local7[local16];
			if (local24 != null && local24.anInt2561 == 2) {
				Static217.method3519(arg2 >> 1, local24.anInt2567 * 2, arg3, (local24.anInt2558 - Static220.anInt3983 << 7) + local24.anInt2564, local24.anInt2568 + (-Static295.anInt5480 + local24.anInt2565 << 7), arg1, arg4 >> 1);
				if (Static299.anInt5585 > -1 && Static50.anInt954 % 20 < 10) {
					Static241.aClass4_Sub3_Sub14Array11[local24.anInt2559].method4543(arg5 + Static299.anInt5585 - 12, Static168.anInt3290 + arg0 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fh;Lclient!fh;I)I")
	public static int method464(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.method1359(Static48.anInt914)) {
			local1++;
		}
		if (arg1.method1359(Static312.anInt6044)) {
			local1++;
		}
		if (arg1.method1359(Static170.anInt3309)) {
			local1++;
		}
		if (arg0.method1359(Static48.anInt914)) {
			local1++;
		}
		if (arg0.method1359(Static312.anInt6044)) {
			local1++;
		}
		if (arg0.method1359(Static170.anInt3309)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method467(@OriginalArg(0) Class189 arg0) {
		@Pc(4) int local4 = arg0.anInt5908;
		if (local4 == 324) {
			if (Static153.anInt3017 == -1) {
				Static275.anInt5229 = arg0.anInt5930;
				Static153.anInt3017 = arg0.anInt5951;
			}
			if (Static38.aClass147_1.aBoolean307) {
				arg0.anInt5951 = Static153.anInt3017;
			} else {
				arg0.anInt5951 = Static275.anInt5229;
			}
		} else if (local4 == 325) {
			if (Static153.anInt3017 == -1) {
				Static153.anInt3017 = arg0.anInt5951;
				Static275.anInt5229 = arg0.anInt5930;
			}
			if (Static38.aClass147_1.aBoolean307) {
				arg0.anInt5951 = Static275.anInt5229;
			} else {
				arg0.anInt5951 = Static153.anInt3017;
			}
		} else if (local4 == 327) {
			arg0.anInt5948 = 150;
			arg0.anInt5980 = (int) (Math.sin((double) Static50.anInt954 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt5899 = -1;
			arg0.anInt5943 = 5;
		} else if (local4 == 328) {
			if (Static154.aClass53_Sub1_Sub1_2.aString88 == null) {
				arg0.anInt5899 = 0;
			} else {
				arg0.anInt5948 = 150;
				arg0.anInt5980 = (int) (Math.sin((double) Static50.anInt954 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5943 = 5;
				arg0.anInt5899 = ((int) Static108.method1747(Static154.aClass53_Sub1_Sub1_2.aString88) << 11) + 2047;
				arg0.anInt5896 = Static154.aClass53_Sub1_Sub1_2.anInt4046;
				arg0.anInt5895 = Static154.aClass53_Sub1_Sub1_2.anInt4005;
				arg0.anInt5983 = Static154.aClass53_Sub1_Sub1_2.anInt4019;
				arg0.anInt5901 = 0;
			}
		}
	}
}
