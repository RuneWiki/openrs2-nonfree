import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	public static int anInt382;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!qe;")
	private static Class78 aClass78_70 = Static199.method3560("Cancel");

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "Lclient!qe;")
	private static Class78 aClass78_74 = Static199.method3560("Please wait)3)3)3");

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!qe;")
	public static Class78 aClass78_71 = aClass78_74;

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "Lclient!qe;")
	public static Class78 aClass78_72 = aClass78_70;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "Lclient!qe;")
	public static Class78 aClass78_73 = Static199.method3560("mapfunction");

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method285() {
		Static48.aClass103_6 = new Class103(32);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ek;B)V")
	public static void method286(@OriginalArg(0) Applet_Sub1 arg0) {
		Static125.method1282();
		if (Static112.aClass47_1 != null) {
			return;
		}
		if (!Static23.aBoolean13) {
			Static131.method2398();
		} else if (Static122.anInt1735 == 1) {
			@Pc(22) int local22 = Static61.anInt1050 / 5;
			@Pc(28) int local28 = Static49.anInt886 + local22 + 140;
			if (Static205.anInt740 >= local28 && Static205.anInt740 <= local28 + 14 && Static55.anInt981 >= Static35.anInt586 + 4 && Static55.anInt981 <= Static35.anInt586 + 18) {
				Static190.method3497(0, 0);
				return;
			}
			if (Static205.anInt740 >= local28 + 15 && local28 + 80 >= Static205.anInt740 && Static55.anInt981 >= Static35.anInt586 + 4 && Static55.anInt981 <= Static35.anInt586 + 18) {
				Static190.method3497(0, 1);
				return;
			}
			@Pc(95) int local95 = Static49.anInt886 + local22 + 250;
			if (local95 <= Static205.anInt740 && local95 + 14 >= Static205.anInt740 && Static55.anInt981 >= Static35.anInt586 + 4 && Static35.anInt586 + 18 >= Static55.anInt981) {
				Static190.method3497(1, 0);
				return;
			}
			if (Static205.anInt740 >= local95 + 15 && Static205.anInt740 <= local95 + 80 && Static55.anInt981 >= Static35.anInt586 + 4 && Static55.anInt981 <= Static35.anInt586 + 18) {
				Static190.method3497(1, 1);
				return;
			}
			@Pc(169) int local169 = local22 + Static49.anInt886 + 360;
			if (local169 <= Static205.anInt740 && Static205.anInt740 <= local169 + 14 && Static55.anInt981 >= Static35.anInt586 + 4 && Static35.anInt586 + 18 >= Static55.anInt981) {
				Static190.method3497(2, 0);
				return;
			}
			if (local169 + 15 <= Static205.anInt740 && Static205.anInt740 <= local169 + 80 && Static55.anInt981 >= Static35.anInt586 + 4 && Static35.anInt586 + 18 >= Static55.anInt981) {
				Static190.method3497(2, 1);
				return;
			}
			@Pc(235) int local235 = local22 + Static49.anInt886 + 470;
			if (Static205.anInt740 >= local235 && local235 + 14 >= Static205.anInt740 && Static35.anInt586 + 4 <= Static55.anInt981 && Static55.anInt981 <= Static35.anInt586 + 18) {
				Static190.method3497(3, 0);
				return;
			}
			if (local235 + 15 <= Static205.anInt740 && local235 + 80 >= Static205.anInt740 && Static35.anInt586 + 4 <= Static55.anInt981 && Static35.anInt586 + 18 >= Static55.anInt981) {
				Static190.method3497(3, 1);
				return;
			}
			if (Static93.anInt2053 != -1) {
				@Pc(307) Class9 local307 = Static132.aClass9Array1[Static93.anInt2053];
				if (local307.aBoolean9 == Static111.aBoolean104) {
					@Pc(327) byte[] local327 = Static94.method1640(new Class78[] { local307.aClass78_47, Static54.aClass78_185 }).method3013();
					Static113.aString6 = new String(local327, 0, local327.length);
					Static77.anInt1691 = local307.anInt322;
					if (Static144.anInt3283 != 0) {
						Static85.anInt1909 = Static77.anInt1691 + 40000;
						Static227.anInt4919 = Static85.anInt1909;
						Static107.anInt2351 = Static77.anInt1691 + 50000;
					}
					if (Static8.aClass64_3 != null) {
						Static8.aClass64_3.aBoolean137 = true;
						Static70.method2259(Static8.aClass64_3);
					}
					return;
				}
				@Pc(361) Class78 local361 = Static103.aClass78_494;
				if (Static144.anInt3283 != 0) {
					local361 = Static94.method1640(new Class78[] { Static86.aClass78_430, Static19.method268(local307.anInt322 + 7000) });
				}
				@Pc(456) Class78 local456 = Static94.method1640(new Class78[] { Static47.aClass78_161, local307.aClass78_47, Static54.aClass78_185, local361, Static14.aClass78_627, Static19.method268(Static211.anInt4647), Static87.aClass78_432, Static19.method268(Static102.anInt2232), Static112.aClass78_523, Static19.method268(0), Static212.aClass78_826, Static19.method268(Static148.anInt3386), Static93.aClass78_452, Static19.method268(Static92.anInt2043) });
				try {
					arg0.getAppletContext().showDocument(local456.method3003(), "_self");
				} catch (@Pc(465) Exception local465) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
	public static void method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static217.method3759(arg3, arg1, arg3 + arg2, arg0 + arg1);
		Static217.method3761(arg3, arg1, arg2, arg0, 0);
		if (Static208.anInt4610 < 100) {
			return;
		}
		if (Static22.aClass2_Sub3_Sub8_2 == null || Static22.aClass2_Sub3_Sub8_2.anInt2847 != arg2 || Static22.aClass2_Sub3_Sub8_2.anInt2845 != arg0) {
			@Pc(49) Class2_Sub3_Sub8_Sub1 local49 = new Class2_Sub3_Sub8_Sub1(arg2, arg0);
			Static217.method3765(local49.anIntArray470, arg2, arg0);
			Static171.method3141(0, Static30.anInt547, 0, arg2, 0, Static151.anInt3457, 0, arg0);
			Static22.aClass2_Sub3_Sub8_2 = local49;
			Static160.aClass10_1.method2692();
		}
		Static22.aClass2_Sub3_Sub8_2.method2256(arg3, arg1);
		@Pc(81) int local81 = Static123.anInt2812 * arg2 / Static151.anInt3457 + arg3;
		@Pc(89) int local89 = arg1 + Static128.anInt2873 * arg0 / Static30.anInt547;
		@Pc(95) int local95 = arg0 * Static102.anInt2225 / Static30.anInt547;
		@Pc(101) int local101 = Static65.anInt1292 * arg2 / Static151.anInt3457;
		Static217.method3749(local81, local89, local101, local95, 16711680, 128);
		Static217.method3751(local81, local89, local101, local95, 16711680);
		if (Static103.anInt2272 <= 0 || Static103.anInt2272 % 10 >= 5) {
			return;
		}
		for (@Pc(136) Class2_Sub9 local136 = (Class2_Sub9) Static114.aClass44_27.method1359(); local136 != null; local136 = (Class2_Sub9) Static114.aClass44_27.method1356()) {
			if (Static97.anInt2135 == local136.anInt563) {
				@Pc(151) int local151 = arg3 + local136.anInt570 * arg2 / Static151.anInt3457;
				@Pc(160) int local160 = arg1 + local136.anInt572 * arg0 / Static30.anInt547;
				Static217.method3761(local151 - 2, local160 + -2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Z")
	public static boolean method289(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!nh;I)Lclient!bc;")
	public static Class2_Sub2 method290(@OriginalArg(0) Class2_Sub23 arg0) {
		arg0.method2122();
		@Pc(13) int local13 = arg0.method2122();
		@Pc(17) Class2_Sub2 local17 = Static188.method3482(local13);
		local17.anInt4864 = arg0.method2122();
		@Pc(33) int local33 = arg0.method2122();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method2122();
			local17.method3957(arg0, local41);
		}
		local17.method3958();
		return local17;
	}
}
