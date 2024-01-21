import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt20 = 0;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_14 = Static28.method504("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!ja;")
	private static Class39 aClass39_17 = Static28.method504("purple:");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_15 = aClass39_17;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!c;")
	public static Class12 aClass12_2 = new Class12(64);

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_16 = aClass39_17;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_18 = Static28.method504("Texturen geladen)3");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method14() {
		aClass12_2 = null;
		aClass39_18 = null;
		aClass39_17 = null;
		aClass39_16 = null;
		aClass39_14 = null;
		aClass39_15 = null;
		aClass4_Sub2_Sub3_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
	public static int method15(@OriginalArg(1) int arg0) {
		@Pc(3) Class4_Sub2_Sub17 local3 = Static101.method1819(arg0);
		@Pc(18) int local18 = local3.anInt3177;
		@Pc(21) int local21 = local3.anInt3182;
		@Pc(24) int local24 = local3.anInt3178;
		@Pc(30) int local30 = Class8.anIntArray29[local24 - local21];
		return Static22.anIntArray64[local18] >> local21 & local30;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public static void method16() {
		Static69.anIntArray194 = new int[33];
		Static111.anIntArray305 = new int[33];
		Static16.anIntArray50 = new int[151];
		Static59.anIntArray160 = new int[151];
		@Pc(25) int local25;
		@Pc(23) int local23;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 0;
			local25 = 999;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static108.aClass4_Sub2_Sub3_Sub4_6.aByteArray25[local27 + Static108.aClass4_Sub2_Sub3_Sub4_6.anInt2267 * local19] == 0) {
					if (local25 == 999) {
						local25 = local27;
					}
				} else if (local25 != 999) {
					local23 = local27;
					break;
				}
			}
			Static111.anIntArray305[local19] = local25;
			Static69.anIntArray194[local19] = local23 - local25;
		}
		for (local25 = 5; local25 < 156; local25++) {
			local23 = 999;
			local27 = 0;
			for (@Pc(94) int local94 = 25; local94 < 172; local94++) {
				if (Static108.aClass4_Sub2_Sub3_Sub4_6.aByteArray25[Static108.aClass4_Sub2_Sub3_Sub4_6.anInt2267 * local25 + local94] == 0 && (local94 > 34 || local25 > 34)) {
					if (local23 == 999) {
						local23 = local94;
					}
				} else if (local23 != 999) {
					local27 = local94;
					break;
				}
			}
			Static16.anIntArray50[local25 - 5] = local23 - 25;
			Static59.anIntArray160[local25 - 5] = local27 - local23;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ja;I)V")
	public static void method17(@OriginalArg(0) Class39 arg0) {
		if (Static84.anInt2105 >= 2) {
			if (arg0.method954(Static117.aClass39_1540)) {
				System.gc();
			}
			if (arg0.method954(Static55.aClass39_803)) {
				Static43.method738();
			}
			if (arg0.method954(Static20.aClass39_335)) {
				Static106.aBoolean129 = true;
			}
			if (arg0.method954(Static62.aClass39_864)) {
				Static106.aBoolean129 = false;
			}
			if (arg0.method954(Static58.aClass39_838)) {
				for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
					for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
						for (@Pc(54) int local54 = 1; local54 < 103; local54++) {
							Static109.aClass81Array1[local46].anIntArrayArray29[local50][local54] = 0;
						}
					}
				}
			}
			if (arg0.method954(Static24.aClass39_294) && Static1.anInt2 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method943(Static77.aClass39_992)) {
				Static2.anInt17 = arg0.method964(12).method957().method932();
				Static40.method672(0, Static62.method1123(new Class39[] { Static125.aClass39_1752, Static29.method510(Static2.anInt17) }), null);
			}
			if (arg0.method954(Static5.aClass39_1413)) {
				Static67.aBoolean96 = true;
			}
		}
		Static114.aClass4_Sub16_Sub1_3.method1499(186);
		Static114.aClass4_Sub16_Sub1_3.method1459(arg0.method953() - 1);
		Static114.aClass4_Sub16_Sub1_3.method1470(arg0.method964(2));
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!pd;)Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 method18(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		return Static113.method1984(arg1, arg0) ? Static25.method2195() : null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	public static void method19(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub2_Sub17 local9 = Static101.method1819(arg1);
		@Pc(12) int local12 = local9.anInt3182;
		@Pc(15) int local15 = local9.anInt3177;
		@Pc(18) int local18 = local9.anInt3178;
		@Pc(25) int local25 = Class8.anIntArray29[local18 - local12];
		if (arg0 < 0 || local25 < arg0) {
			arg0 = 0;
		}
		local25 <<= local12;
		Static22.anIntArray64[local15] = local25 & arg0 << local12 | ~local25 & Static22.anIntArray64[local15];
	}
}
