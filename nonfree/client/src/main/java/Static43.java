import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt1242;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_604 = Static87.method1648("null");

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_605 = Static87.method1648("Aus");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B)V")
	public static void method899(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class3_Sub11 local6 = new Class3_Sub11(arg0);
		local6.anInt2060 = arg0.length - 2;
		Static86.anInt2324 = local6.method1451();
		Static72.aByteArrayArray10 = new byte[Static86.anInt2324][];
		Static36.anIntArray160 = new int[Static86.anInt2324];
		Static72.anIntArray316 = new int[Static86.anInt2324];
		Static54.anIntArray239 = new int[Static86.anInt2324];
		Static54.anIntArray238 = new int[Static86.anInt2324];
		local6.anInt2060 = arg0.length - Static86.anInt2324 * 8 - 7;
		Static66.anInt1710 = local6.method1451();
		Static28.anInt748 = local6.method1451();
		@Pc(67) int local67 = (local6.method1421() & 0xFF) + 1;
		for (@Pc(69) int local69 = 0; local69 < Static86.anInt2324; local69++) {
			Static54.anIntArray238[local69] = local6.method1451();
		}
		for (@Pc(83) int local83 = 0; local83 < Static86.anInt2324; local83++) {
			Static72.anIntArray316[local83] = local6.method1451();
		}
		for (@Pc(97) int local97 = 0; local97 < Static86.anInt2324; local97++) {
			Static36.anIntArray160[local97] = local6.method1451();
		}
		for (@Pc(115) int local115 = 0; local115 < Static86.anInt2324; local115++) {
			Static54.anIntArray239[local115] = local6.method1451();
		}
		local6.anInt2060 = arg0.length + 3 - Static86.anInt2324 * 8 - local67 * 3 - 7;
		Static98.anIntArray378 = new int[local67];
		for (@Pc(155) int local155 = 1; local155 < local67; local155++) {
			Static98.anIntArray378[local155] = local6.method1424();
			if (Static98.anIntArray378[local155] == 0) {
				Static98.anIntArray378[local155] = 1;
			}
		}
		local6.anInt2060 = 0;
		for (@Pc(180) int local180 = 0; local180 < Static86.anInt2324; local180++) {
			@Pc(186) int local186 = Static54.anIntArray239[local180];
			@Pc(190) int local190 = Static36.anIntArray160[local180];
			@Pc(194) int local194 = local186 * local190;
			@Pc(197) byte[] local197 = new byte[local194];
			Static72.aByteArrayArray10[local180] = local197;
			@Pc(205) int local205 = local6.method1421();
			@Pc(217) int local217;
			if (local205 == 0) {
				for (local217 = 0; local217 < local194; local217++) {
					local197[local217] = local6.method1432();
				}
			} else if (local205 == 1) {
				for (local217 = 0; local217 < local190; local217++) {
					for (@Pc(221) int local221 = 0; local221 < local186; local221++) {
						local197[local217 + local221 * local190] = local6.method1432();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method900() {
		Static47.aClass3_Sub11_Sub1_1.method1475();
		@Pc(19) int local19 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static47.aClass3_Sub11_Sub1_1.method1476(2);
		if (local27 == 0) {
			Static82.anIntArray335[Static70.anInt1829++] = 2047;
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (local27 == 1) {
			local48 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
			Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.method1674(false, local48);
			local58 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
			if (local58 == 1) {
				Static82.anIntArray335[Static70.anInt1829++] = 2047;
			}
			return;
		}
		@Pc(100) int local100;
		if (local27 == 2) {
			local48 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
			Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.method1674(true, local48);
			local58 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
			Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.method1674(true, local58);
			local100 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
			if (local100 == 1) {
				Static82.anIntArray335[Static70.anInt1829++] = 2047;
			}
		} else if (local27 == 3) {
			local48 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
			if (local48 == 1) {
				Static82.anIntArray335[Static70.anInt1829++] = 2047;
			}
			Static68.anInt1747 = Static47.aClass3_Sub11_Sub1_1.method1476(2);
			local58 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
			local100 = Static47.aClass3_Sub11_Sub1_1.method1476(7);
			@Pc(155) int local155 = Static47.aClass3_Sub11_Sub1_1.method1476(7);
			Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.method1677(local58 == 1, local155, local100);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!hb;Lclient!hb;BI)V")
	public static void method901(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(3) int arg2) {
		if (Static84.anInt2220 == -1) {
			Static13.aBoolean40 = true;
		}
		if (arg2 == 0 && Static64.anInt1661 != -1) {
			Static109.aClass27_960 = arg0;
			Static106.anInt834 = 0;
		}
		for (@Pc(23) int local23 = 99; local23 > 0; local23--) {
			Static81.anIntArray333[local23] = Static81.anIntArray333[local23 - 1];
			Static55.aClass27Array8[local23] = Static55.aClass27Array8[local23 - 1];
			Static81.aClass27Array13[local23] = Static81.aClass27Array13[local23 - 1];
		}
		Static81.anIntArray333[0] = arg2;
		Static55.aClass27Array8[0] = arg1;
		Static81.aClass27Array13[0] = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public static void method902() {
		aClass27_605 = null;
		aFrame1 = null;
		aClass27_604 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIBZI)V")
	public static void method903(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static88.aClass5_1 == null) {
			return;
		}
		if (Static39.anInt988 >= 0) {
			Static84.anInt2213 = arg3;
			if (Static39.anInt988 == 0) {
				Static15.anInt297 = 1;
			} else {
				@Pc(18) int local18 = Static28.method621(Static39.anInt988);
				@Pc(22) int local22 = local18 - Static78.anInt2155;
				Static15.anInt297 = (local22 + 3600) / arg3;
				if (Static15.anInt297 < 1) {
					Static15.anInt297 = 1;
				}
			}
			Static83.anInt2364 = arg1;
			Static22.aByteArray7 = arg0;
			Static16.aBoolean23 = arg2;
		} else if (Static15.anInt297 == 0) {
			Static94.method1754(arg2, arg1, arg0);
		} else {
			Static83.anInt2364 = arg1;
			Static16.aBoolean23 = arg2;
			Static22.aByteArray7 = arg0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!r;I[BI)V")
	public static void method904(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class3_Sub12 local7 = new Class3_Sub12();
		local7.anInt2521 = 0;
		local7.aLong83 = arg1;
		local7.aByteArray21 = arg2;
		local7.aClass55_4 = arg0;
		@Pc(22) Class28 local22 = Static106.aClass28_7;
		synchronized (Static106.aClass28_7) {
			Static106.aClass28_7.method889(local7);
		}
		Static56.method1074();
	}
}
