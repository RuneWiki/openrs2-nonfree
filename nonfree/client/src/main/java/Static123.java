import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_31;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	public static int anInt2781;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1203 = Static51.method932("(U1");

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
	public static int anInt2777 = 0;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "B")
	public static byte aByte7 = 0;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	public static int anInt2778 = 0;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1204 = Static51.method932("");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI[Lclient!cd;I)Lclient!cd;")
	public static Class10 method1979(@OriginalArg(1) int arg0, @OriginalArg(2) Class10[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg2; local14++) {
			if (arg1[arg0 + local14] == null) {
				arg1[local14 + arg0] = Static157.aClass10_1465;
			}
			local12 += arg1[local14 + arg0].anInt513;
		}
		@Pc(44) byte[] local44 = new byte[local12];
		@Pc(46) int local46 = 0;
		@Pc(56) Class10 local56;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			local56 = arg1[local48 + arg0];
			Static182.method1348(local56.aByteArray7, 0, local44, local46, local56.anInt513);
			local46 += local56.anInt513;
		}
		local56 = new Class10();
		local56.aByteArray7 = local44;
		local56.anInt513 = local12;
		return local56;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!gb;III)V")
	public static void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 || Static46.anInt1135 >= 400) {
			return;
		}
		@Pc(59) Class10 local59;
		if (arg1.anInt1333 == 0) {
			local59 = Static3.method36(new Class10[] { arg1.aClass10_598, Static146.method2272(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1348, arg1.anInt1348), Static52.aClass10_568, Static132.aClass10_1272, Static164.method2485(arg1.anInt1348), Static162.aClass10_1518 });
		} else {
			local59 = Static3.method36(new Class10[] { arg1.aClass10_598, Static52.aClass10_568, Static100.aClass10_1014, Static164.method2485(arg1.anInt1333), Static162.aClass10_1518 });
		}
		@Pc(166) int local166;
		if (Static44.anInt1023 == 1) {
			Static144.method2257(arg0, arg2, 21, Static151.aClass10_1426, Static3.method36(new Class10[] { Static163.aClass10_1521, Static137.aClass10_1329, local59 }), arg3);
		} else if (!Static69.aBoolean74) {
			for (local166 = 7; local166 >= 0; local166--) {
				if (Static98.aClass10Array17[local166] != null) {
					@Pc(174) short local174 = 0;
					if (Static98.aClass10Array17[local166].method343(Static119.aClass10_1168)) {
						if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1348 < arg1.anInt1348) {
							local174 = 2000;
						}
						if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1344 != 0 && arg1.anInt1344 != 0) {
							if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1344 == arg1.anInt1344) {
								local174 = 2000;
							} else {
								local174 = 0;
							}
						}
					} else if (Static89.aBooleanArray8[local166]) {
						local174 = 2000;
					}
					@Pc(238) int local238 = local174 + Static50.anIntArray140[local166];
					Static144.method2257(arg0, arg2, local238, Static98.aClass10Array17[local166], Static3.method36(new Class10[] { Static177.aClass10_1609, local59 }), arg3);
				}
			}
		} else if ((Static147.anInt3804 & 0x8) == 8) {
			Static144.method2257(arg0, arg2, 11, Static111.aClass10_1098, Static3.method36(new Class10[] { Static121.aClass10_1190, Static137.aClass10_1329, local59 }), arg3);
		}
		for (local166 = 0; local166 < Static46.anInt1135; local166++) {
			if (Static93.anIntArray229[local166] == 39) {
				Static75.aClass10Array12[local166] = Static3.method36(new Class10[] { Static177.aClass10_1609, local59 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
	public static void method1981() {
		aClass10_1204 = null;
		aClass2_Sub1_Sub4_Sub2_31 = null;
		aClass10_1203 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1982(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static156.aClass84_1);
		arg0.removeFocusListener(Static156.aClass84_1);
		Static63.anInt1566 = -1;
	}
}
