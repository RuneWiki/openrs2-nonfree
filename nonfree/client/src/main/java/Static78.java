import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public static int anInt1716;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!qe;")
	private static Class78 aClass78_377 = Static199.method3560("white:");

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_375 = aClass78_377;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt1709 = 0;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "Lclient!qe;")
	public static Class78 aClass78_376 = aClass78_377;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "Lclient!qe;")
	public static Class78 aClass78_378 = Static199.method3560("<img=1>");

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lclient!fk;")
	public static Class2_Sub3_Sub10 method1324(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub3_Sub10 local12 = (Class2_Sub3_Sub10) Static227.aClass110_26.method3891((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static140.aClass72_194.method3197(arg0, 11);
		local12 = new Class2_Sub3_Sub10();
		if (local22 != null) {
			local12.method1084(new Class2_Sub23(local22));
		}
		Static227.aClass110_26.method3894(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pc;Lclient!oe;ILclient!oe;Lclient!oe;)Z")
	public static boolean method1326(@OriginalArg(0) Class2_Sub21_Sub2 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) Class72 arg2, @OriginalArg(4) Class72 arg3) {
		Static29.aClass72_34 = arg2;
		Static39.aClass2_Sub21_Sub2_1 = arg0;
		Static121.aClass72_288 = arg3;
		Static121.aClass72_287 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(ILclient!oe;B)[Lclient!qg;")
	public static Class79_Sub1[] method1327(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1) {
		return Static71.method1150(arg0, arg1) ? Static109.method1894() : null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZLclient!hh;I)V")
	public static void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static31.aClass5_Sub2_Sub2_1 || Static138.anInt3182 >= 400) {
			return;
		}
		@Pc(57) Class78 local57;
		if (arg2.anInt1894 == 0) {
			local57 = Static94.method1640(new Class78[] { arg2.aClass78_423, Static158.method2848(arg2.anInt1898, Static31.aClass5_Sub2_Sub2_1.anInt1898), Static174.aClass78_699, Static226.aClass78_873, Static19.method268(arg2.anInt1898), Static216.aClass78_846 });
		} else {
			local57 = Static94.method1640(new Class78[] { arg2.aClass78_423, Static174.aClass78_699, Static32.aClass78_704, Static19.method268(arg2.anInt1894), Static216.aClass78_846 });
		}
		@Pc(94) int local94;
		if (Static121.anInt4906 == 1) {
			Static188.method3487(arg0, (long) arg1, (short) 5, arg3, Static94.method1640(new Class78[] { Static203.aClass78_808, Static127.aClass78_861, local57 }), Static173.aClass78_690);
		} else if (!Static125.aBoolean60) {
			for (local94 = 7; local94 >= 0; local94--) {
				if (Static80.aClass78Array16[local94] != null) {
					@Pc(105) short local105 = 0;
					if (Static193.anInt4451 == 0 && Static80.aClass78Array16[local94].method3038(Static51.aClass78_179)) {
						if (arg2.anInt1898 > Static31.aClass5_Sub2_Sub2_1.anInt1898) {
							local105 = 2000;
						}
						if (Static31.aClass5_Sub2_Sub2_1.anInt1884 != 0 && arg2.anInt1884 != 0) {
							if (arg2.anInt1884 == Static31.aClass5_Sub2_Sub2_1.anInt1884) {
								local105 = 2000;
							} else {
								local105 = 0;
							}
						}
					} else if (Static15.aBooleanArray11[local94]) {
						local105 = 2000;
					}
					@Pc(161) short local161 = Static146.aShortArray107[local94];
					@Pc(166) short local166 = (short) (local161 + local105);
					Static188.method3487(arg0, (long) arg1, local166, arg3, Static94.method1640(new Class78[] { Static27.aClass78_93, local57 }), Static80.aClass78Array16[local94]);
				}
			}
		} else if ((Static29.anInt530 & 0x8) == 8) {
			Static188.method3487(arg0, (long) arg1, (short) 32, arg3, Static94.method1640(new Class78[] { Static19.aClass78_60, Static127.aClass78_861, local57 }), Static69.aClass78_317);
		}
		for (local94 = 0; local94 < Static138.anInt3182; local94++) {
			if (Static79.aShortArray53[local94] == 51) {
				Static57.aClass78Array6[local94] = Static94.method1640(new Class78[] { Static27.aClass78_93, local57 });
				return;
			}
		}
	}
}
