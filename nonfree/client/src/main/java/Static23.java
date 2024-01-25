import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	public static int anInt932;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	public static void method657() {
		if (Static295.anInt5811 == 10) {
			Static232.method4269(28);
		}
		if (Static295.anInt5811 == 30) {
			Static232.method4269(25);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I")
	public static int method658(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method660(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static129.aString27 = arg0;
		Static145.aString29 = arg2;
		Static21.anInt832 = arg1;
		if (Static129.aString27.equals("") || Static145.aString29.equals("")) {
			Static353.anInt6727 = 3;
		} else if (Static292.anInt4638 == -1) {
			Static267.anInt5415 = 0;
			Static102.anInt2432 = 0;
			Static176.anInt3803 = 1;
			Static353.anInt6727 = -3;
			@Pc(40) Class1_Sub8 local40 = new Class1_Sub8(128);
			local40.method4562(10);
			local40.method4529((int) (Math.random() * 9.9999999E7D));
			local40.method4560(Static261.method1470(Static129.aString27));
			local40.method4529((int) (Math.random() * 9.9999999E7D));
			local40.method4531(Static145.aString29);
			local40.method4529((int) (Math.random() * 9.9999999E7D));
			local40.method4563(Static42.aBigInteger1, Static309.aBigInteger2);
			Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
			Static342.aClass1_Sub8_Sub1_7.method4562(24);
			Static342.aClass1_Sub8_Sub1_7.method4562(local40.anInt5182 + 2);
			Static342.aClass1_Sub8_Sub1_7.method4542(568);
			Static342.aClass1_Sub8_Sub1_7.method4513(local40.anInt5182, local40.aByteArray81);
		} else {
			Static287.method4915();
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
	public static void method661() {
		Static6.method247(Static28.aClass12_3);
		Static30.anInt1224++;
		if (Static315.aBoolean594 && Static198.aBoolean118) {
			@Pc(28) int local28 = Static222.aClass84_1.method5408();
			@Pc(32) int local32 = Static222.aClass84_1.method5406();
			local32 -= Static306.anInt6042;
			local28 -= Static136.anInt3010;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (Static30.anInt1224 > Static28.aClass12_3.anInt425) {
				local48 = local28 - Static63.anInt5672;
				local53 = local32 - Static296.anInt5814;
				if (local48 > Static28.aClass12_3.anInt444 || -Static28.aClass12_3.anInt444 > local48 || local53 > Static28.aClass12_3.anInt444 || -Static28.aClass12_3.anInt444 > local53) {
					Static45.aBoolean139 = true;
				}
			}
			if (Static318.anInt6136 > local28) {
				local28 = Static318.anInt6136;
			}
			if (local28 + Static28.aClass12_3.lb > Static318.anInt6136 + Static285.aClass12_12.lb) {
				local28 = Static318.anInt6136 + Static285.aClass12_12.lb - Static28.aClass12_3.lb;
			}
			if (local32 < Static101.anInt2415) {
				local32 = Static101.anInt2415;
			}
			if (local32 + Static28.aClass12_3.anInt446 > Static101.anInt2415 - -Static285.aClass12_12.anInt446) {
				local32 = Static101.anInt2415 + Static285.aClass12_12.anInt446 - Static28.aClass12_3.anInt446;
			}
			local48 = Static285.aClass12_12.anInt400 + local28 - Static318.anInt6136;
			local53 = Static285.aClass12_12.anInt419 + local32 - Static101.anInt2415;
			@Pc(163) Class1_Sub16 local163;
			if (Static28.aClass12_3.anObjectArray3 != null && Static45.aBoolean139) {
				local163 = new Class1_Sub16();
				local163.anObjectArray34 = Static28.aClass12_3.anObjectArray3;
				local163.anInt2536 = local48;
				local163.aClass12_5 = Static28.aClass12_3;
				local163.anInt2538 = local53;
				Static196.method3777(local163);
			}
			if (!Static222.aClass84_1.method5410()) {
				if (Static45.aBoolean139) {
					if (Static28.aClass12_3.anObjectArray20 != null) {
						local163 = new Class1_Sub16();
						local163.anInt2538 = local53;
						local163.anInt2536 = local48;
						local163.anObjectArray34 = Static28.aClass12_3.anObjectArray20;
						local163.aClass12_5 = Static28.aClass12_3;
						local163.aClass12_6 = Static244.aClass12_15;
						Static196.method3777(local163);
					}
					if (Static244.aClass12_15 != null && Static44.method1014(Static28.aClass12_3) != null) {
						Static54.method1412(Static244.aClass12_15, Static28.aClass12_3);
					}
				} else if ((Static270.anInt5519 == 1 || Static44.method1030()) && Static115.anInt2635 > 2) {
					Static307.method5153(2, Static63.anInt5672 + Static136.anInt3010, Static296.anInt5814 + Static306.anInt6042);
				} else if (Static72.method1686()) {
					Static307.method5153(0, Static136.anInt3010 + Static63.anInt5672, Static306.anInt6042 - -Static296.anInt5814);
				}
				Static28.aClass12_3 = null;
			}
		} else if (Static30.anInt1224 > 1) {
			Static28.aClass12_3 = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(III)Z")
	public static boolean method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static154.anIntArrayArrayArray10[arg0][arg1][arg2];
		if (local7 == -Static146.anInt3198) {
			return false;
		} else if (local7 == Static146.anInt3198) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static71.method3162(local22 + 1, Static298.aClass53Array3[arg0].method2785(arg1, arg2), local26 + 1) && Static71.method3162(local22 + 128 - 1, Static298.aClass53Array3[arg0].method2785(arg1 + 1, arg2), local26 + 1) && Static71.method3162(local22 + 128 - 1, Static298.aClass53Array3[arg0].method2785(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static71.method3162(local22 + 1, Static298.aClass53Array3[arg0].method2785(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static154.anIntArrayArrayArray10[arg0][arg1][arg2] = Static146.anInt3198;
				return true;
			} else {
				Static154.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static146.anInt3198;
				return false;
			}
		}
	}
}
