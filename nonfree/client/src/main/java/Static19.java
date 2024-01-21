import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!db", name = "Ob", descriptor = "Lclient!bf;")
	public static Class11 aClass11_13;

	@OriginalMember(owner = "client!db", name = "Qb", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "Lclient!bd;")
	public static Class9 aClass9_8 = new Class9(100);

	@OriginalMember(owner = "client!db", name = "Pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_301 = Static56.method972("");

	@OriginalMember(owner = "client!db", name = "Tb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_303 = Static56.method972("Add ignore");

	@OriginalMember(owner = "client!db", name = "Rb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_302 = aClass5_303;

	@OriginalMember(owner = "client!db", name = "Sb", descriptor = "I")
	public static int anInt694 = 0;

	@OriginalMember(owner = "client!db", name = "Vb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_304 = Static56.method972("leuchten1:");

	@OriginalMember(owner = "client!db", name = "Wb", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[1000][];

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public static void method427() {
		if (!Static63.aBoolean156) {
			return;
		}
		Static113.aClass3_Sub1_Sub2_Sub4_18 = null;
		Static90.aClass3_Sub1_Sub2_Sub4_10 = null;
		Static113.aClass3_Sub1_Sub2_Sub4_19 = null;
		Static22.aClass2_4 = null;
		Static103.aClass3_Sub1_Sub2_Sub4_15 = null;
		Static92.aClass3_Sub1_Sub2_Sub4_11 = null;
		Static5.aClass3_Sub1_Sub2_Sub4_2 = null;
		Static50.anIntArray161 = null;
		Static79.aClass3_Sub1_Sub2_Sub4_8 = null;
		Static88.aClass3_Sub1_Sub2_Sub4_9 = null;
		Static109.aClass3_Sub1_Sub2_Sub4_17 = null;
		Static52.aClass3_Sub1_Sub2_Sub4_6 = null;
		Static38.aClass2_8 = null;
		Static102.anIntArray310 = null;
		Static12.aClass2_1 = null;
		Static93.aClass3_Sub1_Sub2_Sub4Array5 = null;
		Static102.aClass2_21 = null;
		Static92.aClass2_17 = null;
		Static53.aClass2_12 = null;
		Static91.anIntArray268 = null;
		Static93.aClass2_18 = null;
		Static46.aClass3_Sub1_Sub2_Sub4_4 = null;
		Static53.anIntArray165 = null;
		Static51.aClass3_Sub1_Sub2_Sub4_13 = null;
		Static74.aClass3_Sub1_Sub2_Sub4_7 = null;
		Static115.aClass2_27 = null;
		Static22.aClass3_Sub1_Sub2_Sub4_3 = null;
		Static22.anIntArray91 = null;
		Static105.aClass2_23 = null;
		Static95.aClass2_20 = null;
		Static2.aClass3_Sub1_Sub2_Sub4_1 = null;
		Static32.aClass2_5 = null;
		Static102.anIntArray303 = null;
		Static112.aClass2_25 = null;
		Static38.aClass2_7 = null;
		Static70.aClass2_14 = null;
		Static87.aClass2_16 = null;
		Static63.aBoolean156 = false;
		Static48.anIntArray153 = null;
		Static101.aClass3_Sub1_Sub2_Sub4_14 = null;
		Static83.aClass2_15 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	public static void method428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static3.aClass5Array2[local9] != null) {
				@Pc(26) int local26 = Static60.anInt2986 + 4 + 70 - local7 * 14;
				@Pc(30) int local30 = Static16.anIntArray64[local9];
				if (local26 < -20) {
					break;
				}
				if (local30 == 0) {
					local7++;
				}
				@Pc(42) Class5 local42 = Static89.aClass5Array15[local9];
				if (local42 != null && local42.method139(Static58.aClass5_775)) {
					local42 = local42.method159(5);
				}
				if (local42 != null && local42.method139(Static91.aClass5_1071)) {
					local42 = local42.method159(5);
				}
				if ((local30 == 1 || local30 == 2) && (local30 == 1 || Static99.anInt2488 == 0 || Static99.anInt2488 == 1 && Static4.method134(local42))) {
					local7++;
					if (local26 - 14 < arg0 && local26 >= arg0 && !local42.method163(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass5_765)) {
						if (Static7.anInt363 >= 1) {
							Static4.method129(0, Static51.aClass5_1095, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 9);
						}
						Static4.method129(0, aClass5_302, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 21);
						Static4.method129(0, Static73.aClass5_867, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 31);
					}
				}
				if ((local30 == 3 || local30 == 7) && Static3.anInt292 == 0 && (local30 == 7 || Static12.anInt479 == 0 || Static12.anInt479 == 1 && Static4.method134(local42))) {
					if (local26 - 14 < arg0 && local26 >= arg0) {
						if (Static7.anInt363 >= 1) {
							Static4.method129(0, Static51.aClass5_1095, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 9);
						}
						Static4.method129(0, aClass5_302, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 21);
						Static4.method129(0, Static73.aClass5_867, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 31);
					}
					local7++;
				}
				if (local30 == 4 && (Static9.anInt428 == 0 || Static9.anInt428 == 1 && Static4.method134(local42))) {
					if (local26 - 14 < arg0 && local26 >= arg0) {
						Static4.method129(0, Static2.aClass5_89, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 15);
					}
					local7++;
				}
				if ((local30 == 5 || local30 == 6) && Static3.anInt292 == 0 && Static12.anInt479 < 2) {
					local7++;
				}
				if (local30 == 8 && (Static9.anInt428 == 0 || Static9.anInt428 == 1 && Static4.method134(local42))) {
					local7++;
					if (local26 - 14 < arg0 && local26 >= arg0) {
						Static4.method129(0, Static102.aClass5_1181, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local42 }), 0, 37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method429() {
		anIntArray74 = null;
		aClass5_304 = null;
		aClass11_13 = null;
		aClass5_302 = null;
		aByteArrayArray4 = null;
		aClass5_301 = null;
		aClass9_8 = null;
		aClass5_303 = null;
		aByteArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)Z")
	public static boolean method430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && arg1 == Static85.anInt2099) {
			return true;
		} else if (arg0 == 1 && arg1 == Static13.anInt486) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static102.anInt2639 == arg1;
		}
	}
}
