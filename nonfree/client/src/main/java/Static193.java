import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!tj;")
	public static Class193 aClass193_74;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public static int anInt4280;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!tj;")
	public static Class193 aClass193_75;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public static int anInt4281 = -1;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	public static void method3855(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub4_Sub18 local12 = Static302.method4961(arg0, 3);
		local12.method4902();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static void method3858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static54.aFloat69 < Static54.aFloat70) {
			Static54.aFloat69 = (float) ((double) Static54.aFloat69 + (double) Static54.aFloat69 / 30.0D);
			if (Static54.aFloat69 > Static54.aFloat70) {
				Static54.aFloat69 = Static54.aFloat70;
			}
			Static95.method2223();
			Static54.anInt4735 = (int) Static54.aFloat69 >> 1;
			Static54.aByteArrayArrayArray11 = Static101.method5688(Static54.anInt4735);
		} else if (Static54.aFloat69 > Static54.aFloat70) {
			Static54.aFloat69 = (float) ((double) Static54.aFloat69 - (double) Static54.aFloat69 / 30.0D);
			if (Static54.aFloat70 > Static54.aFloat69) {
				Static54.aFloat69 = Static54.aFloat70;
			}
			Static95.method2223();
			Static54.anInt4735 = (int) Static54.aFloat69 >> 1;
			Static54.aByteArrayArrayArray11 = Static101.method5688(Static54.anInt4735);
		}
		if (Static116.anInt2756 != -1 && Static285.anInt5603 != -1) {
			@Pc(83) int local83 = Static116.anInt2756 - Static8.anInt200;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(100) int local100 = Static285.anInt5603 - Static60.anInt1574;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static8.anInt200 += local83;
			if (local83 == 0 && local100 == 0) {
				Static285.anInt5603 = -1;
				Static116.anInt2756 = -1;
			}
			Static60.anInt1574 += local100;
			Static95.method2223();
		}
		if (Static33.anInt820 > 0) {
			Static273.anInt5435--;
			if (Static273.anInt5435 == 0) {
				Static33.anInt820--;
				Static273.anInt5435 = 100;
			}
		} else {
			Static138.anInt2999 = -1;
			Static289.anInt5645 = -1;
		}
		if (!Static336.aBoolean469 || Static46.aClass116_4 == null) {
			return;
		}
		for (@Pc(157) Class4_Sub18 local157 = (Class4_Sub18) Static46.aClass116_4.method3270(); local157 != null; local157 = (Class4_Sub18) Static46.aClass116_4.method3272()) {
			@Pc(165) Class136 local165 = Static11.method223(local157.aClass4_Sub3_1.anInt210);
			if (Static93.anInt2506 == 0 && local157.method2379(arg0, arg1)) {
				if (local165.aStringArray49 != null) {
					if (local165.aStringArray49[4] != null) {
						Static138.method2617((long) local157.aClass4_Sub3_1.anInt210, local165.aString45, 1009, -1, local165.aStringArray49[4], local165.anInt4248, 0);
					}
					if (local165.aStringArray49[3] != null) {
						Static138.method2617((long) local157.aClass4_Sub3_1.anInt210, local165.aString45, 1012, -1, local165.aStringArray49[3], local165.anInt4248, 0);
					}
					if (local165.aStringArray49[2] != null) {
						Static138.method2617((long) local157.aClass4_Sub3_1.anInt210, local165.aString45, 1006, -1, local165.aStringArray49[2], local165.anInt4248, 0);
					}
					if (local165.aStringArray49[1] != null) {
						Static138.method2617((long) local157.aClass4_Sub3_1.anInt210, local165.aString45, 1010, -1, local165.aStringArray49[1], local165.anInt4248, 0);
					}
					if (local165.aStringArray49[0] != null) {
						Static138.method2617((long) local157.aClass4_Sub3_1.anInt210, local165.aString45, 1003, -1, local165.aStringArray49[0], local165.anInt4248, 0);
					}
				}
				if (!local157.aClass4_Sub3_1.aBoolean20) {
					local157.aClass4_Sub3_1.aBoolean20 = true;
					Static164.method3187(15, local157.aClass4_Sub3_1.anInt210, local165.anInt4248);
				}
				if (local157.aClass4_Sub3_1.aBoolean20) {
					Static164.method3187(17, local157.aClass4_Sub3_1.anInt210, local165.anInt4248);
				}
			} else if (local157.aClass4_Sub3_1.aBoolean20) {
				local157.aClass4_Sub3_1.aBoolean20 = false;
				Static164.method3187(16, local157.aClass4_Sub3_1.anInt210, local165.anInt4248);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method3859() {
		Static168.aClass198_247.method5209();
		Static334.aClass198_140.method5209();
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public static void method3860() {
		for (@Pc(11) Class4_Sub39 local11 = (Class4_Sub39) Static58.aClass116_7.method3270(); local11 != null; local11 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			if (Static110.method2371(local11.anInt5716)) {
				Static104.method2325(local11);
			}
		}
		if (Static105.anInt2645 == 1) {
			Static272.aBoolean393 = false;
			Static168.method5617(Static184.anInt3880, Static127.anInt3018, Static70.anInt1838, Static302.anInt5773);
			return;
		}
		Static168.method5617(Static184.anInt3880, Static127.anInt3018, Static70.anInt1838, Static302.anInt5773);
		@Pc(51) int local51 = Static348.aClass16_8.method327(Static212.aClass159_150.method4311(Static180.anInt3835));
		for (@Pc(56) Class4_Sub39 local56 = (Class4_Sub39) Static58.aClass116_7.method3270(); local56 != null; local56 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			@Pc(62) int local62 = Static173.method3340(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static184.anInt3880 = (Static140.aBoolean255 ? 26 : 22) + Static105.anInt2645 * 16;
		Static302.anInt5773 = local51 + 8;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!lf;)Lclient!cd;")
	public static Class26_Sub1 method3861(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class26_Sub1(arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3442(), arg0.method3442(), arg0.method3440());
	}
}
