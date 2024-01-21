import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public static int anInt1032;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!wc;")
	public static Class4 aClass4_18;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!wc;")
	public static Class4 aClass4_19;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!cb;")
	public static Class11 aClass11_8 = new Class11(128);

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!a;")
	private static Class1 aClass1_1005 = Static94.method1596("Loading sprites )2 ");

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!a;")
	private static Class1 aClass1_1006 = Static94.method1596("as it was used to break our rules)3");

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1007 = aClass1_1005;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_1008 = aClass1_1006;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_1009 = Static94.method1596("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!a;")
	public static Class1 aClass1_1010 = Static94.method1596(":0");

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
	public static int[] anIntArray114 = new int[256];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!vc;IZ)V")
	public static void method725(@OriginalArg(0) Class65 arg0, @OriginalArg(2) boolean arg1) {
		if (Static93.aClass65_4 != null) {
			try {
				Static93.aClass65_4.method1758();
			} catch (@Pc(12) Exception local12) {
			}
			Static93.aClass65_4 = null;
		}
		Static93.aClass65_4 = arg0;
		Static55.method478(arg1);
		Static76.aClass2_Sub3_2.anInt1168 = 0;
		Static86.aClass2_Sub3_4 = null;
		Static84.anInt2244 = 0;
		Static31.aClass2_Sub1_Sub15_1 = null;
		while (true) {
			@Pc(33) Class2_Sub1_Sub15 local33 = (Class2_Sub1_Sub15) Static65.aClass25_5.method989();
			if (local33 == null) {
				while (true) {
					local33 = (Class2_Sub1_Sub15) Static62.aClass25_4.method989();
					if (local33 == null) {
						if (Static12.aByte7 != 0) {
							try {
								@Pc(88) Class2_Sub3 local88 = new Class2_Sub3(4);
								local88.method788(4);
								local88.method788(Static12.aByte7);
								local88.method797(0);
								Static93.aClass65_4.method1759(4, local88.aByteArray7);
							} catch (@Pc(109) IOException local109) {
								try {
									Static93.aClass65_4.method1758();
								} catch (@Pc(114) Exception local114) {
								}
								Static93.aClass65_4 = null;
								Static14.anInt681++;
							}
						}
						Static40.anInt1616 = 0;
						Static76.aLong68 = Static85.method1534();
						return;
					}
					Static32.aClass30_2.method1233(local33);
					Static44.aClass25_2.method990(local33, local33.aLong96);
					Static71.anInt1966--;
					Static43.anInt1447++;
				}
			}
			Static85.aClass25_6.method990(local33, local33.aLong96);
			anInt1038--;
			Static113.anInt2233++;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	public static int method726() {
		return Static82.anInt2146++;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)V")
	public static void method727(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static71.anInt1968 >= 100) {
			Static73.method1372(0, Static84.aClass1_2364, Static111.aClass1_2898);
			return;
		}
		@Pc(29) Class1 local29 = Static99.method1668(arg0).method36();
		for (@Pc(31) int local31 = 0; local31 < Static71.anInt1968; local31++) {
			if (Static88.aLongArray5[local31] == arg0) {
				Static73.method1372(0, Static97.method1655(new Class1[] { local29, Static113.aClass1_2346 }), Static111.aClass1_2898);
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static51.anInt1703; local72++) {
			if (arg0 == Static98.aLongArray6[local72]) {
				Static73.method1372(0, Static97.method1655(new Class1[] { Static73.aClass1_2046, local29, Static107.aClass1_2860 }), Static111.aClass1_2898);
				return;
			}
		}
		if (!local29.method5(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass1_264)) {
			Static88.aLongArray5[Static71.anInt1968++] = arg0;
			Static34.aBoolean60 = true;
			Static59.aClass2_Sub3_Sub1_2.method841(251);
			Static59.aClass2_Sub3_Sub1_2.method804(arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method728() {
		for (@Pc(7) int local7 = -1; local7 < Static99.anInt2521; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static93.anIntArray292[local7];
			}
			@Pc(24) Class2_Sub1_Sub1_Sub1_Sub1 local24 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local14];
			if (local24 != null) {
				Static22.method601(local24, 1);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method729() {
		aClass1_1005 = null;
		aClass4_18 = null;
		aClass11_8 = null;
		aClass1_1010 = null;
		aClass1_1007 = null;
		aClass1_1008 = null;
		aClass4_19 = null;
		aClass1_1009 = null;
		anIntArray113 = null;
		aClass1_1006 = null;
		aFont1 = null;
		anIntArray114 = null;
	}
}
