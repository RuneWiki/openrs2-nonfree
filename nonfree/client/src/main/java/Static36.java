import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ea", name = "hb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_287 = Static65.method1172("Click to switch");

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "Lclient!kb;")
	public static Class46 aClass46_282 = aClass46_287;

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lclient!kb;")
	private static Class46 aClass46_285 = Static65.method1172("button near the top of that page)3");

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_283 = aClass46_285;

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_284 = Static65.method1172("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
	public static int anInt1029 = 0;

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "[I")
	public static int[] anIntArray84 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_286 = Static65.method1172("Hidden)2use");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!h;)Z")
	public static boolean method649(@OriginalArg(1) Class33 arg0) {
		@Pc(2) int local2 = arg0.anInt1432;
		if (local2 == 205) {
			Static135.anInt3150 = 250;
			return true;
		}
		@Pc(29) int local29;
		@Pc(23) int local23;
		if (local2 >= 300 && local2 <= 313) {
			local23 = local2 & 0x1;
			local29 = (local2 - 300) / 2;
			Static70.aClass64_2.method2120(local29, local23 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local29 = (local2 - 314) / 2;
			local23 = local2 & 0x1;
			Static70.aClass64_2.method2115(local23 == 1, local29);
		}
		if (local2 == 324) {
			Static70.aClass64_2.method2114(false);
		}
		if (local2 == 325) {
			Static70.aClass64_2.method2114(true);
		}
		if (local2 == 326) {
			Static133.aClass3_Sub4_Sub1_3.method233(68);
			Static70.aClass64_2.method2122(Static133.aClass3_Sub4_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
	public static boolean method650(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
	public static void method651() {
		for (@Pc(10) Class3_Sub24 local10 = (Class3_Sub24) Static1.aClass59_1.method1731(); local10 != null; local10 = (Class3_Sub24) Static1.aClass59_1.method1734()) {
			if (local10.anInt3524 > 0) {
				local10.anInt3524--;
			}
			if (local10.anInt3524 != 0) {
				if (local10.anInt3521 > 0) {
					local10.anInt3521--;
				}
				if (local10.anInt3521 == 0 && local10.anInt3513 >= 1 && local10.anInt3514 >= 1 && local10.anInt3513 <= 102 && local10.anInt3514 <= 102 && (local10.anInt3512 < 0 || Static51.method1000(local10.anInt3512, local10.anInt3519))) {
					Static16.method319(local10.anInt3514, local10.anInt3516, local10.anInt3515, local10.anInt3513, local10.anInt3519, local10.anInt3523, local10.anInt3512);
					local10.anInt3521 = -1;
					if (local10.anInt3512 == local10.anInt3518 && local10.anInt3518 == -1) {
						local10.method2900();
					} else if (local10.anInt3518 == local10.anInt3512 && local10.anInt3510 == local10.anInt3515 && local10.anInt3517 == local10.anInt3519) {
						local10.method2900();
					}
				}
			} else if (local10.anInt3518 < 0 || Static51.method1000(local10.anInt3518, local10.anInt3517)) {
				Static16.method319(local10.anInt3514, local10.anInt3516, local10.anInt3510, local10.anInt3513, local10.anInt3517, local10.anInt3523, local10.anInt3518);
				local10.method2900();
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)V")
	public static void method653() {
		aClass46_286 = null;
		aClass46_282 = null;
		aClass46_285 = null;
		aClass46_284 = null;
		aClass46_287 = null;
		aClass46_283 = null;
		anIntArray84 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[Lclient!h;I)V")
	public static void method654(@OriginalArg(1) Class33[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class33 local18 = arg0[local12];
			if (local18 != null) {
				if (local18.anInt1441 == 0) {
					if (local18.aClass33Array2 != null) {
						method654(local18.aClass33Array2, arg1);
					}
					@Pc(42) Class3_Sub12 local42 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local18.anInt1434);
					if (local42 != null) {
						Static169.method2711(local42.anInt1766, arg1);
					}
				}
				@Pc(61) Class3_Sub14 local61;
				if (arg1 == 0 && local18.anObjectArray15 != null) {
					local61 = new Class3_Sub14();
					local61.anObjectArray28 = local18.anObjectArray15;
					local61.aClass33_10 = local18;
					Static71.method1217(local61);
				}
				if (arg1 == 1 && local18.anObjectArray4 != null) {
					if (local18.anInt1468 >= 0) {
						@Pc(90) Class33 local90 = Static179.method2873(local18.anInt1434);
						if (local90 == null || local90.aClass33Array2 == null || local18.anInt1468 >= local90.aClass33Array2.length || local18 != local90.aClass33Array2[local18.anInt1468]) {
							continue;
						}
					}
					local61 = new Class3_Sub14();
					local61.aClass33_10 = local18;
					local61.anObjectArray28 = local18.anObjectArray4;
					Static71.method1217(local61);
				}
			}
		}
	}
}
