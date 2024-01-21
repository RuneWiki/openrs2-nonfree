import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!cc", name = "Db", descriptor = "Lclient!sd;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!cc", name = "Fb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_285 = Static161.method2971("level)2");

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_281 = aClass13_285;

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_282 = Static161.method2971("Your account is already logged in)3");

	@OriginalMember(owner = "client!cc", name = "sb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_283 = aClass13_282;

	@OriginalMember(owner = "client!cc", name = "ub", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!cc", name = "wb", descriptor = "[I")
	public static int[] anIntArray107 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "xb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_284 = Static161.method2971("nav");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
	public static void method680() {
		aClass53_1 = null;
		aClass13_284 = null;
		aClass13_283 = null;
		aLongArray2 = null;
		aClass13_285 = null;
		anIntArray107 = null;
		aClass13_282 = null;
		aClass13_281 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)Lclient!nf;")
	public static Class59 method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1544; local13++) {
			@Pc(19) Class59 local19 = local7.aClass59Array4[local13];
			if ((local19.aLong106 >> 29 & 0x3L) == 2L && local19.anInt3133 == arg1 && local19.anInt3130 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
	public static void method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class41[] local11 = Static144.aClass41Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(19) Class41 local19 = local11[local13];
			if (local19 != null && local19.anInt2172 == 2) {
				Static167.method2857(local19.anInt2173 * 2, (local19.anInt2170 - Static153.anInt3629 << 7) + local19.anInt2169, local19.anInt2171 + (local19.anInt2167 - Static60.anInt1864 << 7));
				if (Static66.anInt1948 > -1 && Static78.anInt2168 % 20 < 10) {
					Static182.aClass1_Sub2_Sub1_Sub3Array3[local19.anInt2163].method422(arg0 + Static66.anInt1948 - 12, Static30.anInt1069 + -28 + arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V")
	public static void method685() {
		@Pc(7) int local7 = Static101.anInt2829;
		@Pc(9) int local9 = Static85.anInt2436;
		@Pc(11) int local11 = Static51.anInt1676;
		@Pc(13) int local13 = Static164.anInt3861;
		Static128.method565(local9, local7, local11, local13, 6116423);
		Static128.method565(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static128.method554(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method254(Static55.aClass13_598, local9 + 3, local7 + 14, 6116423, -1);
		@Pc(65) int local65 = Static14.anInt481;
		@Pc(67) int local67 = Static86.anInt2447;
		for (@Pc(69) int local69 = 0; local69 < Static53.anInt1722; local69++) {
			@Pc(83) int local83 = local7 + (Static53.anInt1722 - (local69 + 1)) * 15 + 31;
			@Pc(85) int local85 = 16777215;
			if (local9 < local65 && local65 < local11 + local9 && local83 - 13 < local67 && local67 < local83 + 3) {
				local85 = 16776960;
			}
			Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method254(Static98.method2705(local69), local9 + 3, local83, local85, 0);
		}
		Static63.method1431(Static164.anInt3861, Static85.anInt2436, Static51.anInt1676, Static101.anInt2829);
	}
}
