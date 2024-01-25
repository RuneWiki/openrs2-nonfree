import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "[S")
	public static short[] aShortArray73;

	@OriginalMember(owner = "client!mv", name = "u", descriptor = "Lclient!pb;")
	public static Class275 aClass275_6;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
	public static void method5400(@OriginalArg(0) int arg0) {
		if (arg0 == Static297.anInt5046) {
			return;
		}
		Static98.anInt361 = Static438.anInt7120 = Static122.anIntArray130[arg0];
		Static397.method7855();
		Static63.anIntArrayArrayArray7 = new int[4][Static98.anInt361 >> 3][Static438.anInt7120 >> 3];
		Static187.anIntArrayArray23 = new int[Static98.anInt361][Static438.anInt7120];
		Static514.anIntArrayArray48 = new int[Static98.anInt361][Static438.anInt7120];
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			Static609.aClass110Array1[local45] = Static92.method1527(Static438.anInt7120, Static98.anInt361);
		}
		Static366.aByteArrayArrayArray14 = new byte[4][Static98.anInt361][Static438.anInt7120];
		Static414.method5647(Static98.anInt361, Static438.anInt7120);
		Static59.method1096(Static438.anInt7120 >> 3, Static119.aClass95_4, Static98.anInt361 >> 3);
		Static297.anInt5046 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)V")
	public static void method5401() {
		if (Static279.aClass159Array1 == null) {
			Static279.aClass159Array1 = Static245.method3707();
			Static197.aClass159_1 = Static279.aClass159Array1[0];
			Static509.aLong223 = Static15.method380();
		}
		if (Static74.aClass191_1 == null) {
			Static629.method8500();
		}
		@Pc(23) Class159 local23 = Static197.aClass159_1;
		@Pc(31) int local31 = Static336.method4916();
		if (local23 == Static197.aClass159_1) {
			Static505.aString97 = Static197.aClass159_1.aClass84_63.method1729(Static654.anInt10668);
			if (Static197.aClass159_1.aBoolean292) {
				Static613.anInt10201 = Static197.aClass159_1.anInt4341 + (Static197.aClass159_1.anInt4338 - Static197.aClass159_1.anInt4341) * local31 / 100;
			}
			if (Static197.aClass159_1.aBoolean293) {
				Static505.aString97 = Static505.aString97 + Static613.anInt10201 + "%";
			}
		} else if (Static197.aClass159_1 == Static245.aClass159_22) {
			Static74.aClass191_1 = null;
			Static279.method4069(3);
		} else {
			Static505.aString97 = local23.aClass84_64.method1729(Static654.anInt10668);
			Static613.anInt10201 = local23.anInt4338;
			if (Static197.aClass159_1.aBoolean293) {
				Static505.aString97 = Static505.aString97 + local23.anInt4338 + "%";
			}
			if (Static197.aClass159_1.aBoolean292 || local23.aBoolean292) {
				Static509.aLong223 = Static15.method380();
			}
		}
		if (Static74.aClass191_1 == null) {
			return;
		}
		Static74.aClass191_1.method4363(Static613.anInt10201, Static505.aString97, Static509.aLong223, Static197.aClass159_1);
		if (Static40.anInterface13Array1 == null) {
			return;
		}
		for (@Pc(131) int local131 = Static610.anInt10154 + 1; local131 < Static40.anInterface13Array1.length; local131++) {
			if (Static40.anInterface13Array1[local131].method7040() >= 100 && Static610.anInt10154 == local131 - 1 && Static221.anInt3831 >= 1 && Static74.aClass191_1.method4353()) {
				try {
					Static40.anInterface13Array1[local131].method7042();
				} catch (@Pc(163) Exception local163) {
					Static40.anInterface13Array1 = null;
					return;
				}
				Static74.aClass191_1.method4356(Static40.anInterface13Array1[local131]);
				Static610.anInt10154++;
				if (Static610.anInt10154 >= Static40.anInterface13Array1.length - 1 && Static40.anInterface13Array1.length > 1) {
					Static610.anInt10154 = Static388.aClass109_1.method2358() ? 0 : -1;
				}
			}
		}
		return;
	}
}
