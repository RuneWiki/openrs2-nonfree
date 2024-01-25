import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!em", name = "Y", descriptor = "Lclient!ha;")
	public static Class2 aClass2_13;

	@OriginalMember(owner = "client!em", name = "X", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_11 = new Class313(4);

	@OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
	public static final int anInt2349 = 1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
	public static boolean method1962(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method1963(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static40.anInt856 >= 100) {
			Static324.method5022(Static126.aClass306_30.method7165(Static179.anInt3168));
			return;
		}
		@Pc(24) String local24 = Static142.method2303(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static40.anInt856; local29++) {
			@Pc(37) String local37 = Static142.method2303(Static354.aStringArray32[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static324.method5022(arg1 + Static232.aClass306_56.method7165(Static179.anInt3168));
				return;
			}
			if (Static17.aStringArray1[local29] != null) {
				local67 = Static142.method2303(Static17.aStringArray1[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static324.method5022(arg1 + Static232.aClass306_56.method7165(Static179.anInt3168));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static234.anInt4709; local100++) {
			local67 = Static142.method2303(Static528.aStringArray43[local100]);
			if (local67 != null && local67.equals(local24)) {
				Static324.method5022(Static457.aClass306_115.method7165(Static179.anInt3168) + arg1 + Static473.aClass306_119.method7165(Static179.anInt3168));
				return;
			}
			if (Static373.aStringArray7[local100] != null) {
				@Pc(145) String local145 = Static142.method2303(Static373.aStringArray7[local100]);
				if (local145 != null && local145.equals(local24)) {
					Static324.method5022(Static457.aClass306_115.method7165(Static179.anInt3168) + arg1 + Static473.aClass306_119.method7165(Static179.anInt3168));
					return;
				}
			}
		}
		if (Static142.method2303(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16).equals(local24)) {
			Static324.method5022(Static107.aClass306_28.method7165(Static179.anInt3168));
		} else {
			Static144.method2331(Static457.aClass296_332);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg1) + 1);
			Static455.aClass1_Sub6_Sub2_2.method3917(arg1);
			Static455.aClass1_Sub6_Sub2_2.method3937(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBIIIIILclient!dc;Lclient!dc;I)V")
	public static void method1964(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class49_Sub2_Sub2 arg4, @OriginalArg(8) Class49_Sub2_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method3785();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class2 local21 = (Class2) Static304.aClass313_33.method7406((long) local7);
		if (local21 == null) {
			@Pc(28) Class136[] local28 = Static552.method3538(Static543.aClass171_154, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static513.aClass122_10.method7220(local28[0]);
			Static304.aClass313_33.method7399((long) local7, local21);
		}
		Static404.method6682(arg5.anInt7137, arg5.anInt7141, arg5.aByte98, 0, arg5.method3788() * 256, arg2 >> 1, arg3 >> 1);
		@Pc(76) int local76 = arg6 + Static393.anIntArray684[0] - 18;
		@Pc(86) int local86 = Static393.anIntArray684[1] + arg1 - 16 - 54;
		@Pc(98) int local98 = local76 + arg0 / 4 * 18;
		@Pc(106) int local106 = local86 + arg0 % 4 * 18;
		local21.method7364(local98, local106);
		if (arg5 == arg4) {
			Static513.aClass122_10.method7223(local98 - 1, 18, 18, -256, local106 - 1);
		}
		@Pc(128) Class72_Sub3 local128 = Static474.method6595();
		local128.anInt2942 = local98 + 16;
		local128.anInt2940 = local106 + 16;
		local128.anInt2943 = local106;
		local128.anInt2937 = local98;
		local128.aClass49_Sub2_Sub2_1 = arg4;
		Static272.aClass299_5.method7027(local128);
	}
}
