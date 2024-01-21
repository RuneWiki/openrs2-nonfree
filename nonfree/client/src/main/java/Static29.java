import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 aClass2_Sub4_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!wc;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_30;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Lclient!qd;")
	public static Class65 aClass65_2 = new Class65();

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!gg;")
	public static Class28 aClass28_540 = Static107.method1838("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public static int anInt879 = 2;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
	public static int[] anIntArray70 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "Lclient!be;")
	public static Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	public static int anInt884 = 0;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_541 = Static107.method1838("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "Lclient!gg;")
	public static Class28 aClass28_542 = Static107.method1838("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)Z")
	public static boolean method597(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)I")
	public static int method599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 5 << 7) + (arg2 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public static void method602() {
		aClass65_2 = null;
		anInterface2_2 = null;
		aClass2_Sub4_Sub3_Sub2_Sub1_2 = null;
		aClass28_540 = null;
		aClass28_542 = null;
		aClass6_1 = null;
		anIntArray70 = null;
		aClass28_541 = null;
		aClass40_Sub1_30 = null;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I")
	public static int method604() {
		return Static99.anInt2498++;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method605() {
		@Pc(10) int local10 = Static151.aClass2_Sub2_Sub1_3.method1713(8);
		@Pc(15) int local15;
		if (local10 < Static35.anInt973) {
			for (local15 = local10; local15 < Static35.anInt973; local15++) {
				Static115.anIntArray262[Static84.anInt2126++] = Static160.anIntArray327[local15];
			}
		}
		if (local10 > Static35.anInt973) {
			throw new RuntimeException("gppov1");
		}
		Static35.anInt973 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(53) int local53 = Static160.anIntArray327[local15];
			@Pc(57) Class2_Sub4_Sub1_Sub1_Sub2 local57 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local53];
			@Pc(62) int local62 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
			if (local62 == 0) {
				Static160.anIntArray327[Static35.anInt973++] = local53;
				local57.anInt1650 = Static156.anInt3491;
			} else {
				@Pc(85) int local85 = Static151.aClass2_Sub2_Sub1_3.method1713(2);
				if (local85 == 0) {
					Static160.anIntArray327[Static35.anInt973++] = local53;
					local57.anInt1650 = Static156.anInt3491;
					Static3.anIntArray228[Static83.anInt2114++] = local53;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local85 == 1) {
						Static160.anIntArray327[Static35.anInt973++] = local53;
						local57.anInt1650 = Static156.anInt3491;
						local132 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
						local57.method1094(false, local132);
						local142 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
						if (local142 == 1) {
							Static3.anIntArray228[Static83.anInt2114++] = local53;
						}
					} else if (local85 == 2) {
						Static160.anIntArray327[Static35.anInt973++] = local53;
						local57.anInt1650 = Static156.anInt3491;
						local132 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
						local57.method1094(true, local132);
						local142 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
						local57.method1094(true, local142);
						@Pc(196) int local196 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
						if (local196 == 1) {
							Static3.anIntArray228[Static83.anInt2114++] = local53;
						}
					} else if (local85 == 3) {
						Static115.anIntArray262[Static84.anInt2126++] = local53;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	public static void method606() {
		if (!Static160.aBoolean154) {
			return;
		}
		Static113.aClass2_Sub4_Sub3_Sub4_6 = null;
		Static167.aClass2_Sub4_Sub3_Sub3Array10 = null;
		Static149.aClass2_Sub4_Sub3_Sub3Array6 = null;
		Static124.aClass2_Sub4_Sub3_Sub3Array5 = null;
		Static85.aClass2_Sub4_Sub3_Sub4_3 = null;
		Static48.anIntArray106 = null;
		Static119.aClass2_Sub4_Sub3_Sub3_4 = null;
		Static141.anIntArray284 = null;
		Static71.aClass2_Sub4_Sub3_Sub4_2 = null;
		Static176.aClass2_Sub4_Sub3_Sub4Array13 = null;
		Static162.aClass2_Sub4_Sub3_Sub3Array9 = null;
		Static35.anIntArray73 = null;
		Static150.aClass2_Sub4_Sub3_Sub3Array7 = null;
		Static26.anIntArray63 = null;
		Static142.anIntArray285 = null;
		Static82.aClass2_Sub4_Sub3_Sub3_3 = null;
		Static79.aClass2_Sub4_Sub3_Sub3_2 = null;
		Static19.anIntArray71 = null;
		Static105.aClass2_Sub4_Sub3_Sub4_5 = null;
		Static42.aClass2_Sub4_Sub3_Sub3_1 = null;
		Static116.anIntArray263 = null;
		Static164.anIntArray338 = null;
		Static85.method1512();
		Static117.method1961(true);
		Static160.aBoolean154 = false;
	}
}
