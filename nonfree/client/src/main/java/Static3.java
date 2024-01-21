import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "[I")
	public static int[] anIntArray14 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!mb;")
	public static Class45 aClass45_32 = null;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "Lclient!mb;")
	public static Class45 aClass45_33 = Static63.method1251("Duell akzeptieren");

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Lclient!mb;")
	private static Class45 aClass45_35 = Static63.method1251("skill)2");

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!mb;")
	public static Class45 aClass45_34 = aClass45_35;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "[Lclient!pa;")
	public static Class5_Sub2_Sub4_Sub7[] aClass5_Sub2_Sub4_Sub7Array1 = new Class5_Sub2_Sub4_Sub7[4];

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
	public static int anInt94 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
	public static void method63(@OriginalArg(0) boolean arg0) {
		if (Static1.aClass7_1 == null) {
			return;
		}
		try {
			@Pc(15) Class5_Sub9 local15 = new Class5_Sub9(4);
			local15.method1428(arg0 ? 2 : 3);
			local15.method1421(0);
			Static1.aClass7_1.method80(4, local15.aByteArray28);
		} catch (@Pc(36) IOException local36) {
			try {
				Static1.aClass7_1.method73();
			} catch (@Pc(41) Exception local41) {
			}
			Static45.anInt1314++;
			Static1.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
	public static void method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			if (Static59.aClass45Array16[local7] != null) {
				@Pc(29) int local29 = Static44.anInt1253 + 70 + 4 - local5 * 14;
				@Pc(33) int local33 = Static12.anIntArray486[local7];
				if (local29 < -20) {
					break;
				}
				if (local33 == 0) {
					local5++;
				}
				@Pc(45) Class45 local45 = Static37.aClass45Array11[local7];
				if (local45 != null && local45.method1302(Static60.aClass45_720)) {
					local45 = local45.method1296(5);
				}
				if (local45 != null && local45.method1302(Static19.aClass45_285)) {
					local45 = local45.method1296(5);
				}
				if ((local33 == 1 || local33 == 2) && (local33 == 1 || Static71.anInt2080 == 0 || Static71.anInt2080 == 1 && Static71.method1383(local45))) {
					local5++;
					if (local29 - 14 < arg1 && arg1 <= local29 && !local45.method1319(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass45_629)) {
						if (Static84.anInt2332 >= 1) {
							Static108.method1945(0, 10, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static37.aClass45_500);
						}
						Static108.method1945(0, 46, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static31.aClass45_446);
						Static108.method1945(0, 13, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static16.aClass45_222);
					}
				}
				if ((local33 == 3 || local33 == 7) && Static98.anInt2653 == 0 && (local33 == 7 || Static36.anInt1058 == 0 || Static36.anInt1058 == 1 && Static71.method1383(local45))) {
					local5++;
					if (arg1 > local29 - 14 && arg1 <= local29) {
						if (Static84.anInt2332 >= 1) {
							Static108.method1945(0, 10, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static37.aClass45_500);
						}
						Static108.method1945(0, 46, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static31.aClass45_446);
						Static108.method1945(0, 13, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static16.aClass45_222);
					}
				}
				if (local33 == 4 && (Static70.anInt2023 == 0 || Static70.anInt2023 == 1 && Static71.method1383(local45))) {
					if (arg1 > local29 - 14 && local29 >= arg1) {
						Static108.method1945(0, 38, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static17.aClass45_241);
					}
					local5++;
				}
				if ((local33 == 5 || local33 == 6) && Static98.anInt2653 == 0 && Static36.anInt1058 < 2) {
					local5++;
				}
				if (local33 == 8 && (Static70.anInt2023 == 0 || Static70.anInt2023 == 1 && Static71.method1383(local45))) {
					if (arg1 > local29 - 14 && arg1 <= local29) {
						Static108.method1945(0, 9, Static39.method1443(new Class45[] { Static39.aClass45_886, local45 }), 0, 0, Static74.aClass45_1045);
					}
					local5++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!hb;ILclient!mb;)I")
	public static int method65(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(10) int local10 = arg0.anInt2140;
		arg0.method1439(arg1.anInt1925);
		arg0.anInt2140 += Static49.aClass48_1.method1467(0, arg1.aByteArray27, arg0.aByteArray28, arg1.anInt1925, arg0.anInt2140);
		return arg0.anInt2140 - local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!sd;ZLclient!sd;)I")
	public static int method67(@OriginalArg(0) Class29 arg0, @OriginalArg(2) Class29 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method736(Static40.aClass45_520, Static12.aClass45_1356)) {
			local10++;
		}
		if (arg1.method736(Static40.aClass45_520, Static5.aClass45_42)) {
			local10++;
		}
		if (arg1.method736(Static40.aClass45_520, Static90.aClass45_1056)) {
			local10++;
		}
		if (arg1.method736(Static40.aClass45_520, Static88.aClass45_1042)) {
			local10++;
		}
		if (arg1.method736(Static40.aClass45_520, Static16.aClass45_221)) {
			local10++;
		}
		if (arg1.method736(Static40.aClass45_520, Static101.aClass45_487)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BIZ)I")
	public static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = Class5_Sub7_Sub1.anIntArray157[(local5 ^ arg1[local7]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	public static void method69() {
		aClass45_33 = null;
		aClass45_35 = null;
		aClass5_Sub2_Sub4_Sub7Array1 = null;
		aClass45_34 = null;
		aClass45_32 = null;
		anIntArray14 = null;
	}
}
