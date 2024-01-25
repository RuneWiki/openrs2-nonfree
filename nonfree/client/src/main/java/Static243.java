import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
	public static int anInt4537;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public static int anInt4531 = 0;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
	public static void method3669(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static108.anInt2264 != -1) {
				Static299.method4339(Static108.anInt2264);
			}
			for (@Pc(21) Class2_Sub25 local21 = (Class2_Sub25) Static398.aClass240_27.method5438(); local21 != null; local21 = (Class2_Sub25) Static398.aClass240_27.method5436()) {
				if (!local21.method6074()) {
					local21 = (Class2_Sub25) Static398.aClass240_27.method5438();
					if (local21 == null) {
						break;
					}
				}
				Static419.method5701(local21, false, true);
			}
			Static108.anInt2264 = -1;
			Static398.aClass240_27 = new Class240(8);
			Static126.method1845();
			Static108.anInt2264 = Static342.anInt6033;
			Static264.method3971(false);
			Static8.method183();
			Static290.method4231(Static108.anInt2264);
		}
		Static327.method4690();
		Static217.anInt490 = -1;
		Static278.method4105(Static231.anInt4398);
		Static231.aClass4_Sub2_Sub2_Sub1_2 = new Class4_Sub2_Sub2_Sub1();
		Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 = Static81.anInt1950 * 128 / 2;
		Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0] = Static81.anInt1950 / 2;
		Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 = Static171.anInt3288 * 128 / 2;
		Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0] = Static171.anInt3288 / 2;
		Static293.anInt5621 = 0;
		Static225.anInt4310 = 0;
		if (Static65.anInt7824 == 2) {
			Static225.anInt4310 = Static451.anInt1568 << 7;
			Static293.anInt5621 = Static361.anInt6359 << 7;
		} else {
			Static180.method2819();
		}
		Static272.method5841();
		if (Static225.anInt4310 == 0 || Static293.anInt5621 == 0) {
			Static446.method6043(10);
		} else {
			Static128.method1857();
			Static446.method6043(28);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!em;)V")
	public static void method3670(@OriginalArg(1) int arg0, @OriginalArg(2) Class68 arg1) {
		if (Static428.aBoolean636) {
			Static428.aBoolean636 = false;
			arg0 = 0;
		}
		if (Static240.aClass68_2 != null && Static240.aClass68_2.method1605(arg1)) {
			return;
		}
		Static240.aClass68_2 = arg1;
		Static339.aLong166 = Static208.method3182();
		Static1.anInt20 = arg0;
		Static122.anInt2415 = arg0;
		if (Static122.anInt2415 == 0) {
			Static417.method5648();
			return;
		}
		Static258.aFloat141 = Static107.aFloat79;
		Static265.anInt7239 = Static85.anInt3260;
		Static268.aFloat159 = Static406.aFloat208;
		Static319.aFloat173 = Static279.aFloat161;
		Static128.aFloat82 = Static27.aFloat200;
		Static401.anInt6979 = Static335.anInt1518;
		Static20.aFloat10 = Static40.aFloat40;
		Static429.aClass21_4 = Static61.aClass21_1;
		Static327.anInt5866 = Static399.anInt6964;
		Static274.aFloat160 = Static314.aFloat170;
	}
}
