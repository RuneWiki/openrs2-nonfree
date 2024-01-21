import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!ec;")
	private static Class22 aClass22_956 = Static60.method1113("To play on this world move to a free area first");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!ec;")
	private static Class22 aClass22_959 = Static60.method1113("Could not complete login)3");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_957 = aClass22_959;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_958 = aClass22_956;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_960 = Static60.method1113("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_961 = Static60.method1113("Okay");

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method2011() {
		Static133.aClass4_Sub11_Sub1_3.method747();
		@Pc(11) int local11 = Static133.aClass4_Sub11_Sub1_3.method748(1);
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static133.aClass4_Sub11_Sub1_3.method748(2);
		if (local23 == 0) {
			Static51.anIntArray146[Static50.anInt1405++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local23 == 1) {
			local45 = Static133.aClass4_Sub11_Sub1_3.method748(3);
			Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1608(local45, false);
			local55 = Static133.aClass4_Sub11_Sub1_3.method748(1);
			if (local55 == 1) {
				Static51.anIntArray146[Static50.anInt1405++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local23 == 2) {
			local45 = Static133.aClass4_Sub11_Sub1_3.method748(3);
			Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1608(local45, true);
			local55 = Static133.aClass4_Sub11_Sub1_3.method748(3);
			Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1608(local55, true);
			local95 = Static133.aClass4_Sub11_Sub1_3.method748(1);
			if (local95 == 1) {
				Static51.anIntArray146[Static50.anInt1405++] = 2047;
			}
		} else if (local23 == 3) {
			local45 = Static133.aClass4_Sub11_Sub1_3.method748(7);
			local55 = Static133.aClass4_Sub11_Sub1_3.method748(7);
			local95 = Static133.aClass4_Sub11_Sub1_3.method748(1);
			if (local95 == 1) {
				Static51.anIntArray146[Static50.anInt1405++] = 2047;
			}
			Static37.anInt895 = Static133.aClass4_Sub11_Sub1_3.method748(2);
			@Pc(148) int local148 = Static133.aClass4_Sub11_Sub1_3.method748(1);
			Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1610(local45, local148 == 1, local55);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method2012() {
		aClass22_958 = null;
		aClass22_961 = null;
		aClass4_Sub1_Sub2_Sub3_5 = null;
		aByteArrayArray10 = null;
		aClass22_959 = null;
		aClass22_960 = null;
		aClass22_956 = null;
		aClass22_957 = null;
		aClass4_Sub1_Sub2_Sub3Array10 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)Z")
	public static boolean method2014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static134.aClass77_1.method1925(Static37.anInt895, arg1, arg0, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(27) int local27 = local18 & 0x1F;
		@Pc(33) int local33 = local18 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(76) Class4_Sub1_Sub5 local76 = Static5.method45(local7);
			@Pc(87) int local87;
			@Pc(84) int local84;
			if (local33 == 0 || local33 == 2) {
				local84 = local76.anInt1267;
				local87 = local76.anInt1256;
			} else {
				local84 = local76.anInt1256;
				local87 = local76.anInt1267;
			}
			@Pc(98) int local98 = local76.anInt1241;
			if (local33 != 0) {
				local98 = (local98 << local33 & 0xF) + (local98 >> 4 - local33);
			}
			Static78.method1305(true, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, local84, arg1, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], local98, arg0, local87, 2);
		} else {
			Static78.method1305(true, local33, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], local27 + 1, 0, arg1, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, arg0, 0, 2);
		}
		Static23.anInt555 = Static8.anInt2382;
		Static130.anInt3102 = Static55.anInt1118;
		Static130.anInt3100 = 0;
		Static113.anInt2788 = 2;
		return true;
	}
}
