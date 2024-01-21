import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!kc;")
	public static Class22 aClass22_5;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_330 = Static2.method59("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!wd;")
	private static Class80 aClass80_331 = Static2.method59("Login server offline)3");

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_332 = Static2.method59("Benutzername: ");

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array6 = new Class80[100];

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	public static int anInt995 = 0;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public static int anInt1000 = 2;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Lclient!i;")
	public static Class32 aClass32_16 = new Class32(500);

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_333 = aClass80_331;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "Lclient!wd;")
	private static Class80 aClass80_334 = Static2.method59("Could not complete login)3");

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!wd;")
	public static Class80 aClass80_335 = aClass80_334;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!i;")
	public static Class32 aClass32_17 = new Class32(50);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method516() {
		aClass80_332 = null;
		aClass32_16 = null;
		aClass80_334 = null;
		aBooleanArray10 = null;
		aClass80_335 = null;
		aClass80Array6 = null;
		aClass80_331 = null;
		aClass22_5 = null;
		aClass32_17 = null;
		aClass80_330 = null;
		aClass80_333 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method517() {
		Static115.aClass32_52.method878();
		aClass32_16.method878();
		Static57.aClass32_33.method878();
		Static67.aClass32_36.method878();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public static void method518() {
		if (Static98.anInt2611 == 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		if (Static56.anInt1718 != 0) {
			local14 = 1;
		}
		for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
			if (Static36.aClass80Array8[local23] != null) {
				@Pc(33) int local33 = Static110.anIntArray378[local23];
				@Pc(37) Class80 local37 = aClass80Array6[local23];
				if (local37 != null && local37.method2028(Static92.aClass80_886)) {
					local37 = local37.method2021(5);
				}
				if (local37 != null && local37.method2028(Static4.aClass80_49)) {
					local37 = local37.method2021(5);
				}
				if ((local33 == 3 || local33 == 7) && (local33 == 7 || Static6.anInt172 == 0 || Static6.anInt172 == 1 && Static110.method1844(local37))) {
					@Pc(93) int local93 = 329 - local14 * 13;
					local14++;
					if (Static93.anInt2398 > 4 && local93 - 10 < Static95.anInt2430 - 4 && Static95.anInt2430 - 4 <= local93 + 3) {
						@Pc(146) int local146 = Static21.aClass2_Sub1_Sub9_Sub4_12.method1910(Static93.method1444(new Class80[] { Static61.aClass80_646, Static33.aClass80_381, local37, Static36.aClass80Array8[local23] })) + 25;
						if (local146 > 450) {
							local146 = 450;
						}
						if (Static93.anInt2398 < local146 + 4) {
							if (Static57.anInt1738 >= 1) {
								Static59.method1043(0, 2023, Static112.aClass80_1103, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local37 }), 0);
							}
							Static59.method1043(0, 2003, Static94.aClass80_930, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local37 }), 0);
							Static59.method1043(0, 2021, Static17.aClass80_225, 0, Static93.method1444(new Class80[] { Static3.aClass80_38, local37 }), 0);
						}
					}
					if (local14 >= 5) {
						return;
					}
				}
				if ((local33 == 5 || local33 == 6) && Static6.anInt172 < 2) {
					local14++;
					if (local14 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static120.aClass2_Sub1_Sub9_Sub3Array9[0].method1494(arg2, arg3);
		Static120.aClass2_Sub1_Sub9_Sub3Array9[1].method1494(arg2, arg3 + arg0 - 16);
		Static99.method1894(arg2, arg3 + 16, 16, arg0 - 32, Static95.anInt2432);
		@Pc(37) int local37 = (arg0 - 32) * arg0 / arg1;
		if (local37 < 8) {
			local37 = 8;
		}
		@Pc(58) int local58 = arg4 * (arg0 - local37 - 32) / (arg1 - arg0);
		Static99.method1894(arg2, local58 + arg3 + 16, 16, local37, Static79.anInt2016);
		Static99.method1903(arg2, arg3 + local58 + 16, local37, Static20.anInt897);
		Static99.method1903(arg2 + 1, local58 + 16 + arg3, local37, Static20.anInt897);
		Static99.method1889(arg2, arg3 + local58 + 16, 16, Static20.anInt897);
		Static99.method1889(arg2, local58 + arg3 + 17, 16, Static20.anInt897);
		Static99.method1903(arg2 + 15, arg3 - -local58 + 16, local37, Static63.anInt1810);
		Static99.method1903(arg2 + 14, arg3 - (-local58 + -17), local37 - 1, Static63.anInt1810);
		Static99.method1889(arg2, arg3 + local58 + local37 + 15, 16, Static63.anInt1810);
		Static99.method1889(arg2 + 1, local37 + 14 + arg3 - -local58, 15, Static63.anInt1810);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method520(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static5.aClass57_1);
		arg0.removeFocusListener(Static5.aClass57_1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
	public static void method521(@OriginalArg(1) int arg0) {
		if (Static17.anInt650 == 0) {
			Static44.aClass2_Sub2_Sub3_2.method1389(arg0);
		} else {
			Static35.anInt1172 = arg0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)I")
	public static int method522() {
		return Static36.anInt1185++;
	}
}
