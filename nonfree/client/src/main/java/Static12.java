import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!g;")
	public static Class26 aClass26_69;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	public static int anInt3050;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array102;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1633 = Static69.method1231("null");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!je;")
	private static Class40 aClass40_1634 = Static69.method1231("Please try again)3");

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!je;")
	private static Class40 aClass40_1638 = Static69.method1231("Close");

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_1635 = aClass40_1638;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_1636 = aClass40_1634;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public static int anInt3049 = 0;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!je;")
	private static Class40 aClass40_1637 = Static69.method1231("green:");

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_1639 = aClass40_1637;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_1640 = Static69.method1231("<)4col> x");

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_1641 = aClass40_1637;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!je;")
	private static Class40 aClass40_1643 = Static69.method1231("You have only just left another world)3");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!je;")
	public static Class40 aClass40_1642 = aClass40_1643;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Z")
	public static final boolean aBoolean249 = false;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
	public static int method2204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method2205() {
		@Pc(5) int local5 = Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1553(Static97.aClass40_1288);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static57.anInt1500; local11++) {
			local19 = Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1553(Static30.method465(local11));
			if (local19 > local5) {
				local5 = local19;
			}
		}
		Static47.anInt1277 = Static57.anInt1500 * 15 + 22;
		local19 = Static57.anInt1500 * 15 + 21;
		Static8.aBoolean21 = true;
		local5 += 8;
		@Pc(58) int local58 = Static41.anInt1096 - local5 / 2;
		if (local5 + local58 > 765) {
			local58 = 765 - local5;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		Static102.anInt2481 = local58;
		@Pc(81) int local81 = Static103.anInt2511;
		Static2.anInt89 = local5;
		if (local81 + local19 > 503) {
			local81 = 503 - local19;
		}
		if (local81 < 0) {
			local81 = 0;
		}
		Static47.anInt1288 = local81;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!m;Z)V")
	public static void method2206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1_Sub3_Sub2 arg2) {
		if (arg2.anInt1817 == arg1 && arg1 != -1) {
			@Pc(71) int local71 = Static40.method724(arg1).anInt1972;
			if (local71 == 1) {
				arg2.anInt1814 = arg0;
				arg2.anInt1769 = 0;
				arg2.anInt1804 = 0;
				arg2.anInt1776 = 0;
			}
			if (local71 == 2) {
				arg2.anInt1776 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt1817 == -1 || Static40.method724(arg1).anInt1970 >= Static40.method724(arg2.anInt1817).anInt1970) {
			arg2.anInt1817 = arg1;
			arg2.anInt1769 = 0;
			arg2.anInt1776 = 0;
			arg2.anInt1804 = 0;
			arg2.anInt1782 = arg2.anInt1779;
			arg2.anInt1814 = arg0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!je;)V")
	public static void method2208(@OriginalArg(1) Class40 arg0) {
		if (Static112.anInt2609 >= 2) {
			if (arg0.method984(Static49.aClass40_652)) {
				System.gc();
			}
			if (arg0.method984(Static85.aClass40_1166)) {
				Static49.method887();
			}
			if (arg0.method984(Static86.aClass40_1628)) {
				Static38.aBoolean68 = true;
			}
			if (arg0.method984(Static38.aClass40_531)) {
				Static38.aBoolean68 = false;
			}
			if (arg0.method984(Static127.aClass40_1596)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static70.aClass20Array1[local42].anIntArrayArray8[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method984(Static103.aClass40_1336) && Static34.anInt804 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method959(Static3.aClass40_80)) {
				Static63.anInt395 = arg0.method968(12).method964().method974();
				Static72.method1228(Static40.method722(new Class40[] { Static114.aClass40_1427, Static49.method886(Static63.anInt395) }), null, 0);
			}
			if (arg0.method984(Static26.aClass40_392)) {
				Static65.aBoolean130 = true;
			}
		}
		Static57.aClass2_Sub9_Sub1_2.method673(82);
		Static57.aClass2_Sub9_Sub1_2.method644(arg0.method950() - 1);
		Static57.aClass2_Sub9_Sub1_2.method664(arg0.method968(2));
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public static void method2210() {
		aClass40_1639 = null;
		aClass40_1635 = null;
		aClass2_Sub1_Sub2_Sub1Array102 = null;
		aClass40_1638 = null;
		aClass40_1633 = null;
		aClass40_1640 = null;
		aClass40_1637 = null;
		aClass40_1636 = null;
		aClass40_1641 = null;
		aClass40_1642 = null;
		aClass40_1634 = null;
		aClass40_1643 = null;
		aClass26_69 = null;
	}
}
