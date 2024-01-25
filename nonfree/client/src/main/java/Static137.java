import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	public static int anInt3096 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method2724() {
		Static158.aClass92_6.method4489(Static320.aFloat74, Static277.aFloat71, Static91.aFloat20);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lclient!u;")
	public static Class101 method2725() {
		try {
			return (Class101) Class.forName("Class101_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method2728() {
		Static317.aClass154_98.method4212();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)V")
	public static void method2729(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 != 0 && arg0) {
				Static164.aClass92_7 = Static164.method3151(Static156.anInterface1_3, Static212.aClass120_3, 0, Static101.aCanvas8, 0);
				Static164.aClass92_7.method4529(0);
				@Pc(27) Class106 local27 = Static191.method3463(Static58.aClass11_24, Static202.anInt4261);
				@Pc(36) Class78 local36 = Static164.aClass92_7.method4476(local27, Static367.method5454(Static292.aClass11_130, Static202.anInt4261));
				Static164.method3149(local36, Static38.aString27, true);
				Static164.aClass92_7.method4452();
				Static72.method1360();
			}
			Static164.aClass92_7 = Static164.method3151(Static156.anInterface1_3, Static212.aClass120_3, arg1, Static101.aCanvas8, Static339.anInt6679 * 2);
			if (Static164.aClass92_7.method4504()) {
				@Pc(62) Class4_Sub39 local62 = Static164.aClass92_7.method4498();
				Static164.aClass92_7.method4442(local62);
			}
		} catch (@Pc(67) Throwable local67) {
			if (arg1 != 0) {
				arg1 = 0;
				Static164.aClass92_7 = Static164.method3151(Static156.anInterface1_3, Static212.aClass120_3, 0, Static101.aCanvas8, 0);
			}
		}
		Static6.anInt1971 = arg1;
		Static337.method4916();
		if (!Static164.aClass92_7.method4485()) {
			Static117.anInt2483 = 1;
		}
		Static164.aClass92_7.method4510(Static117.anInt2483);
		Static164.aClass92_7.method4514(0);
		Static269.aClass23_5 = Static164.aClass92_7.method4538();
		Static211.aClass23_1 = Static164.aClass92_7.method4538();
		@Pc(109) int local109 = (int) ((double) Static92.anInt2048 * 34.46D);
		if (Static164.aClass92_7.method4491()) {
			local109 += 128;
		}
		Static164.aClass92_7.method4464(50, local109);
		Static164.aClass92_7.method4523(!Static221.aBoolean389);
		if (Static164.aClass92_7.method4465()) {
			Static311.method5227(Static64.aBoolean107);
		}
		Static195.aBoolean347 = !Static313.method5257();
		Static213.method3696(Static164.aClass92_7, Static92.anInt2048 >> 3, Static290.anInt5893 >> 3);
		Static16.method350();
		Static243.aBoolean429 = false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!em;ZZ)V")
	public static void method2730(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt1670;
		@Pc(12) int local12 = (int) arg1.aLong259;
		arg1.method5667();
		if (arg2) {
			Static7.method235(local8);
		}
		Static55.method1008(local8);
		@Pc(27) Class72 local27 = Static66.method1243(local12);
		if (local27 != null) {
			Static238.method4097(local27);
		}
		Static36.method672();
		if (!arg0 && Static310.anInt6220 != -1) {
			Static39.method733(Static310.anInt6220, 1);
		}
		@Pc(48) Class128 local48 = new Class128(Static38.aClass198_5);
		for (@Pc(53) Class4_Sub8 local53 = (Class4_Sub8) local48.method3461(); local53 != null; local53 = (Class4_Sub8) local48.method3462()) {
			if (!local53.method5670()) {
				local53 = (Class4_Sub8) local48.method3461();
				if (local53 == null) {
					return;
				}
			}
			if (local53.anInt1671 == 3) {
				@Pc(75) int local75 = (int) local53.aLong259;
				if (local8 == local75 >>> 16) {
					method2730(arg0, local53, true);
				}
			}
		}
	}
}
