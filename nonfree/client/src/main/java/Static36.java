import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!da", name = "l", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!sc;")
	private static Class107 aClass107_256 = Static231.method3737("Connection lost)3");

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_253 = aClass107_256;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_254 = Static231.method3737(":clan:");

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	public static int anInt763 = 0;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
	public static int[] anIntArray80 = new int[32];

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_255 = Static231.method3737("Null");

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!jd;")
	public static Class61 aClass61_15 = new Class61(32);

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_257 = Static231.method3737("");

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt765 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)V")
	public static void method702(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static174.anInt3793 >= 100) {
			Static136.method2282(Static218.aClass107_1281, 0, Static63.aClass107_427);
			return;
		}
		@Pc(27) Class107 local27 = Static19.method382(arg0).method3092();
		for (@Pc(29) int local29 = 0; local29 < Static174.anInt3793; local29++) {
			if (arg0 == Static201.aLongArray7[local29]) {
				Static136.method2282(Static149.method2437(new Class107[] { local27, Static109.aClass107_648 }), 0, Static63.aClass107_427);
				return;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static231.anInt4994; local62++) {
			if (Static18.aLongArray1[local62] == arg0) {
				Static136.method2282(Static149.method2437(new Class107[] { Static16.aClass107_130, local27, Static6.aClass107_817 }), 0, Static63.aClass107_427);
				return;
			}
		}
		if (local27.method3071(Static204.aClass5_Sub5_Sub1_2.aClass107_351)) {
			Static136.method2282(Static137.aClass107_814, 0, Static63.aClass107_427);
			return;
		}
		Static201.aLongArray7[Static174.anInt3793] = arg0;
		Static16.aClass107Array1[Static174.anInt3793++] = Static19.method382(arg0);
		Static82.anInt1779 = Static218.anInt4760;
		Static193.aClass1_Sub26_Sub1_2.method3000(1);
		Static193.aClass1_Sub26_Sub1_2.method2940(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Lclient!sc;")
	public static Class107 method703(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static149.method2437(new Class107[] { Static198.aClass107_1132, Static115.method2001(arg0), Static38.aClass107_263 });
		} else if (arg0 < 10000000) {
			return Static149.method2437(new Class107[] { Static157.aClass107_912, Static115.method2001(arg0 / 1000), Static35.aClass107_247, Static38.aClass107_263 });
		} else {
			return Static149.method2437(new Class107[] { Static174.aClass107_1029, Static115.method2001(arg0 / 1000000), Static163.aClass107_953, Static38.aClass107_263 });
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZ)V")
	public static void method705() {
		@Pc(14) byte[][] local14 = Static172.aByteArrayArray9;
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static30.method587();
			for (@Pc(22) int local22 = 0; local22 < 13; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
					@Pc(36) int local36 = Static60.anIntArrayArrayArray6[local16][local22][local26];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						@Pc(55) int local55 = local36 >> 1 & 0x3;
						@Pc(61) int local61 = local36 >> 14 & 0x3FF;
						@Pc(67) int local67 = local36 >> 3 & 0x7FF;
						@Pc(78) int local78 = (local61 / 8 << 8) + (local67 / 8);
						for (@Pc(80) int local80 = 0; local80 < Static182.anIntArray343.length; local80++) {
							if (local78 == Static182.anIntArray343[local80] && local14[local80] != null) {
								Static216.method3527(local22 * 8, (local61 & 0x7) * 8, local45, local16, (local67 & 0x7) * 8, Static107.aClass60Array1, local55, local26 * 8, local14[local80]);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZII)V")
	public static void method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static224.method3669(arg1)) {
			Static49.method1021(Static6.aClass86ArrayArray11[arg1], arg2, -1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	public static void method707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static99.anInt915 && Static38.anInt784 >= arg0 && Static223.anInt4869 <= arg2 && arg3 <= Static47.anInt1057) {
			Static150.method2472(arg4, arg3, arg0, arg2, arg1);
		} else {
			Static230.method3729(arg1, arg3, arg4, arg2, arg0);
		}
	}
}
