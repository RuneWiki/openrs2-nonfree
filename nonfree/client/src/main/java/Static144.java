import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt3269;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public static int anInt3263 = 0;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_5 = new Class124(64);

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Z")
	public static boolean aBoolean265 = true;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!ar;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "[I")
	public static final int[] anIntArray280 = new int[5];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method2965(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static244.method4313(arg0, 0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(CI)Z")
	public static boolean method2968(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIII)V")
	public static void method2969(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static166.method3253(arg1)) {
			Static52.method1029(arg3, arg0, -1, arg2, Static271.aClass21ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method2970() {
		while (true) {
			if (Static127.aClass4_Sub11_Sub1_3.method708(Static133.anInt3104) >= 27) {
				@Pc(16) int local16 = Static127.aClass4_Sub11_Sub1_3.method711(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static169.aClass8_Sub1_Sub2_Sub2Array1[local16] == null) {
						Static169.aClass8_Sub1_Sub2_Sub2Array1[local16] = new Class8_Sub1_Sub2_Sub2();
						local21 = true;
						Static169.aClass8_Sub1_Sub2_Sub2Array1[local16].anInt4916 = local16;
					}
					@Pc(42) Class8_Sub1_Sub2_Sub2 local42 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local16];
					Static354.anIntArray510[Static145.anInt3273++] = local16;
					local42.anInt4940 = Static199.anInt4137;
					if (local42.aClass141_1 != null && local42.aClass141_1.method3909()) {
						Static118.method2493(local42);
					}
					@Pc(69) int local69 = Static127.aClass4_Sub11_Sub1_3.method711(1);
					if (local69 == 1) {
						Static311.anIntArray474[Static244.anInt4894++] = local16;
					}
					@Pc(87) int local87 = Static127.aClass4_Sub11_Sub1_3.method711(5);
					if (local87 > 15) {
						local87 -= 32;
					}
					@Pc(96) int local96 = Static127.aClass4_Sub11_Sub1_3.method711(1);
					@Pc(101) int local101 = Static127.aClass4_Sub11_Sub1_3.method711(5);
					if (local101 > 15) {
						local101 -= 32;
					}
					@Pc(118) int local118 = Static127.aClass4_Sub11_Sub1_3.method711(3) + 4 << 11 & 0x3F68;
					local42.method4356(Static36.method744(Static127.aClass4_Sub11_Sub1_3.method711(14)));
					local42.method4350(local42.aClass141_1.anInt4382);
					local42.anInt4963 = local42.aClass141_1.anInt4398 << 3;
					if (local42.anInt4963 == 0) {
						local42.method4346(0);
					} else if (local21) {
						local42.method4346(local118);
					}
					local42.method4340(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] + local87, Static12.anInt267, local96 == 1, local42.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] + local101);
					if (local42.aClass141_1.method3909()) {
						Static312.method5146(local42.anIntArray416[0], local42, Static12.anInt267, null, null, 0, local42.anIntArray415[0]);
					}
					continue;
				}
			}
			Static127.aClass4_Sub11_Sub1_3.method712();
			return;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method2975() {
		Static149.aClass193_69.anInt5952 = 1;
		Static76.aClient1.method866();
		Static96.aBoolean470 = true;
		Static282.aBoolean359 = true;
		Static15.method862();
		Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
		Static229.anInt4619 = -1;
		Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
		Static57.anInt1518 = 0;
		Static168.anInt6692 = -1;
		Static209.anInt4334 = -1;
		Static258.anInt5208 = 0;
		Static128.anInt3034 = 0;
		Static205.anInt4305 = -1;
		for (@Pc(4203) int local4203 = 0; local4203 < Static116.aClass187Array1.length; local4203++) {
			Static116.aClass187Array1[local4203] = null;
		}
		for (@Pc(4221) int local4221 = 0; local4221 < 100; local4221++) {
			Static183.aStringArray47[local4221] = null;
		}
		Static106.aFloat31 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static245.anInt5012 = (int) (Math.random() * 100.0D) - 50;
		Static70.anInt1840 = (int) (Math.random() * 80.0D) - 40;
		Static344.aBoolean219 = false;
		Static255.anInt5169 = (int) (Math.random() * 30.0D) - 20;
		Static243.anInt5994 = (int) (Math.random() * 110.0D) - 55;
		Static187.anInt3921 = 0;
		Static75.anInt1928 = (int) (Math.random() * 120.0D) - 60;
		Static325.anInt6234 = 0;
		Static9.method197();
		Static289.anInt5643 = 0;
		Static145.anInt3273 = 0;
		for (@Pc(4292) int local4292 = 0; local4292 < 2048; local4292++) {
			Static327.aClass8_Sub1_Sub2_Sub1Array1[local4292] = null;
			Static1.aClass4_Sub11Array2[local4292] = null;
		}
		for (@Pc(4310) int local4310 = 0; local4310 < 32768; local4310++) {
			Static169.aClass8_Sub1_Sub2_Sub2Array1[local4310] = null;
		}
		Static158.aClass8_Sub1_Sub2_Sub1_1 = Static327.aClass8_Sub1_Sub2_Sub1Array1[2047] = new Class8_Sub1_Sub2_Sub1();
		Static158.aClass8_Sub1_Sub2_Sub1_1.anInt4916 = 2047;
		Static321.aClass116_41.method3273();
		Static337.aClass116_46.method3273();
		Static283.aClass32_10.method851();
		Static165.aClass43_20.method1282();
		Static82.aClass116_11 = new Class116();
		Static202.anInt4162 = 0;
		Static237.anInt6657 = 0;
		Static206.method3875();
		Static296.method4924();
		Static63.anInt1629 = 0;
		Static74.anInt1924 = 0;
		Static12.anInt271 = 0;
		Static149.anInt3929 = 0;
		Static161.anInt3461 = 0;
		Static237.anInt6655 = 0;
		Static30.anInt779 = 0;
		Static324.anInt6210 = 0;
		Static124.anInt2958 = 0;
		Static23.anInt459 = 0;
		for (@Pc(4381) int local4381 = 0; local4381 < Static118.anIntArray244.length; local4381++) {
			if (!Static169.aBooleanArray18[local4381]) {
				Static118.anIntArray244[local4381] = -1;
			}
		}
		if (Static357.anInt6821 != -1) {
			Static298.method4927(Static357.anInt6821);
		}
		for (@Pc(4410) Class4_Sub25 local4410 = (Class4_Sub25) Static270.aClass43_29.method1283(); local4410 != null; local4410 = (Class4_Sub25) Static270.aClass43_29.method1278()) {
			if (!local4410.method5689()) {
				local4410 = (Class4_Sub25) Static270.aClass43_29.method1283();
				if (local4410 == null) {
					break;
				}
			}
			Static234.method4154(true, local4410, false);
		}
		Static357.anInt6821 = -1;
		Static270.aClass43_29 = new Class43(8);
		Static116.method2425();
		Static16.aClass21_1 = null;
		Static99.aClass33_2.method927(false, -1, new int[5], -1, null);
		for (@Pc(4461) int local4461 = 0; local4461 < 8; local4461++) {
			Static330.aStringArray76[local4461] = null;
			Static119.aBooleanArray15[local4461] = false;
			Static30.anIntArray40[local4461] = -1;
		}
		Static172.method3328();
		Static57.aBoolean108 = true;
		for (@Pc(4485) int local4485 = 0; local4485 < 100; local4485++) {
			Static172.aBooleanArray19[local4485] = true;
		}
		Static351.anInt6666 = 0;
		Static66.aClass56Array1 = null;
		Static42.aString14 = null;
		for (@Pc(4503) int local4503 = 0; local4503 < 6; local4503++) {
			Static3.aClass15Array1[local4503] = new Class15();
		}
		for (@Pc(4519) int local4519 = 0; local4519 < 25; local4519++) {
			Static294.anIntArray456[local4519] = 0;
			Static29.anIntArray29[local4519] = 0;
			Static213.anIntArray381[local4519] = 0;
		}
		Static244.method4316();
		Static306.aShortArray91 = Static342.aShortArray112 = Static11.aShortArray5 = Static293.aShortArray57 = new short[256];
		Static73.aBoolean138 = true;
		Static333.aString63 = Static55.aClass159_80.method4311(Static180.anInt3835);
		Static286.anInt6705 = 0;
		Static203.aBoolean326 = false;
		Static335.method5408();
		Static178.method3408();
		Static149.aClass193_69.anInt5952 = 2;
	}
}
