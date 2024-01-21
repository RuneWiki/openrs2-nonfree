import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!b", name = "g", descriptor = "[S")
	public static short[] aShortArray3;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	public static final int anInt204 = 50;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
	public static int[] anIntArray18 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public static int anInt195 = 0;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!he;")
	public static Class26 aClass26_112 = Static6.method100("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_113 = Static6.method100("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!b", name = "j", descriptor = "[I")
	public static int[] anIntArray19 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
	public static int[] anIntArray20 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
	public static int[] anIntArray21 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "o", descriptor = "[I")
	public static int[] anIntArray22 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "q", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array2 = new Class26[anInt204];

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	public static int anInt200 = 0;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
	public static int[] anIntArray23 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!he;")
	public static Class26 aClass26_114 = null;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public static final int anInt205 = 50;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
	public static int[] anIntArray24 = new int[anInt204];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(JB)V")
	public static void method114(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static133.anInt568; local18++) {
			if (arg0 == Static105.aLongArray8[local18]) {
				Static133.anInt568--;
				for (@Pc(36) int local36 = local18; local36 < Static133.anInt568; local36++) {
					Static33.aClass26Array9[local36] = Static33.aClass26Array9[local36 + 1];
					Static80.anIntArray221[local36] = Static80.anIntArray221[local36 + 1];
					Static105.aLongArray8[local36] = Static105.aLongArray8[local36 + 1];
					Static55.anIntArray163[local36] = Static55.anIntArray163[local36 + 1];
				}
				Static3.anInt81 = Static71.anInt2023;
				Static107.aClass3_Sub11_Sub1_3.method1029(133);
				Static107.aClass3_Sub11_Sub1_3.method1020(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!he;Z)V")
	public static void method115(@OriginalArg(0) Class26 arg0) {
		if (Static25.anInt3164 >= 2) {
			if (arg0.method832(Static108.aClass26_1569)) {
				System.gc();
			}
			if (arg0.method832(Static47.aClass26_740)) {
				Static17.method274();
			}
			if (arg0.method832(Static33.aClass26_545)) {
				Static63.aBoolean99 = true;
			}
			if (arg0.method832(Static51.aClass26_807)) {
				Static63.aBoolean99 = false;
			}
			if (arg0.method832(Static11.aClass26_164)) {
				for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
							Static93.aClass4Array1[local44].anIntArrayArray1[local48][local52] = 0;
						}
					}
				}
			}
			if (arg0.method832(Static110.aClass26_1600) && Static18.anInt437 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method822(Static122.aClass26_1729)) {
				Static87.anInt2437 = arg0.method819(12).method829().method818();
				Static67.method1915(Static119.method2136(new Class26[] { Static28.aClass26_476, Static122.method2170(Static87.anInt2437) }), null, 0);
			}
			if (arg0.method832(Static38.aClass26_632)) {
				Static27.aBoolean56 = true;
			}
		}
		Static107.aClass3_Sub11_Sub1_3.method1029(165);
		Static107.aClass3_Sub11_Sub1_3.method992(arg0.method839() - 1);
		Static107.aClass3_Sub11_Sub1_3.method1024(arg0.method819(2));
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method116() {
		aShortArray3 = null;
		anIntArray22 = null;
		aClass26_114 = null;
		aClass26_112 = null;
		anIntArray20 = null;
		anIntArray21 = null;
		anIntArray24 = null;
		anIntArray18 = null;
		anIntArray23 = null;
		aClass26_113 = null;
		aClass26Array2 = null;
		anIntArray19 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)Z")
	public static boolean method117(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ef;Lclient!ef;)V")
	public static void method118(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		Static106.aClass16_130 = arg1;
		Static1.aClass16_2 = arg0;
	}
}
