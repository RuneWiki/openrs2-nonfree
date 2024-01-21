import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_10;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!wd;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!cd;")
	private static Class10 aClass10_181 = Static51.method932("slide:");

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!cd;")
	public static Class10 aClass10_178 = aClass10_181;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_179 = Static51.method932("Abbrechen");

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!cd;")
	private static Class10 aClass10_180 = Static51.method932("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_182 = aClass10_180;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_183 = aClass10_181;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public static int anInt385 = -1;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt386 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lclient!fa;")
	public static Class23 method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class23 local7 = Static102.method2541(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass23Array1 == null || local7.aClass23Array1.length <= arg1) {
			return null;
		} else {
			return local7.aClass23Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public static void method223() {
		aClass10_179 = null;
		aClass29_Sub1_10 = null;
		anIntArray26 = null;
		aClass10_182 = null;
		aClass10_181 = null;
		aClass87_1 = null;
		aClass10_178 = null;
		aClass10_180 = null;
		aClass10_183 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BII)I")
	public static int method224(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = local12 >>> 8 ^ Class62.anIntArray283[(arg1[local14] ^ local12) & 0xFF];
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method225() {
		Static75.aClass2_Sub11_Sub1_1.method1498();
		@Pc(13) int local13 = Static75.aClass2_Sub11_Sub1_1.method1490(8);
		@Pc(22) int local22;
		if (Static64.anInt1578 > local13) {
			for (local22 = local13; local22 < Static64.anInt1578; local22++) {
				Static53.anIntArray144[Static94.anInt2248++] = Static8.anIntArray15[local22];
			}
		}
		if (Static64.anInt1578 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static64.anInt1578 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static8.anIntArray15[local22];
			@Pc(68) Class2_Sub1_Sub3_Sub2_Sub2 local68 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local64];
			@Pc(73) int local73 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
			if (local73 == 0) {
				Static8.anIntArray15[Static64.anInt1578++] = local64;
				local68.anInt3491 = anInt386;
			} else {
				@Pc(93) int local93 = Static75.aClass2_Sub11_Sub1_1.method1490(2);
				if (local93 == 0) {
					Static8.anIntArray15[Static64.anInt1578++] = local64;
					local68.anInt3491 = anInt386;
					Static142.anIntArray334[Static97.anInt2273++] = local64;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static8.anIntArray15[Static64.anInt1578++] = local64;
						local68.anInt3491 = anInt386;
						local135 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
						local68.method2461(false, local135);
						local145 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
						if (local145 == 1) {
							Static142.anIntArray334[Static97.anInt2273++] = local64;
						}
					} else if (local93 == 2) {
						Static8.anIntArray15[Static64.anInt1578++] = local64;
						local68.anInt3491 = anInt386;
						local135 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
						local68.method2461(true, local135);
						local145 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
						local68.method2461(true, local145);
						@Pc(199) int local199 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
						if (local199 == 1) {
							Static142.anIntArray334[Static97.anInt2273++] = local64;
						}
					} else if (local93 == 3) {
						Static53.anIntArray144[Static94.anInt2248++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	public static void method226() {
		Static115.aClass38_1.method1878();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static33.aLongArray3[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static81.aLongArray4[local29] = 0L;
		}
		Static45.anInt1120 = 0;
	}
}
