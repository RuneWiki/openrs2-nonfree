import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static int anInt16;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!wf;")
	public static Class87 aClass87_1 = new Class87(32);

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1 = Static170.method3101("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "Lclient!eh;")
	public static Class28 aClass28_2 = aClass28_1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!sh;BI)V")
	public static void method5(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (Static14.anInt481 < arg0.anInt1794) {
			Static138.method2704(arg0);
		} else if (arg0.anInt1840 < Static14.anInt481) {
			Static91.method3123(arg0);
		} else {
			Static43.method1038(arg0);
		}
		if (arg0.anInt1800 < 128 || arg0.anInt1792 < 128 || arg0.anInt1800 >= 13184 || arg0.anInt1792 >= 13184) {
			arg0.anInt1833 = -1;
			arg0.anInt1792 = arg0.anIntArray314[0] * 128 + arg0.anInt1787 * 64;
			arg0.anInt1840 = 0;
			arg0.anInt1790 = -1;
			arg0.anInt1800 = arg0.anIntArray311[0] * 128 + arg0.anInt1787 * 64;
			arg0.anInt1794 = 0;
			arg0.method1439();
		}
		if (arg0 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1 && (arg0.anInt1800 < 1536 || arg0.anInt1792 < 1536 || arg0.anInt1800 >= 11776 || arg0.anInt1792 >= 11776)) {
			arg0.anInt1833 = -1;
			arg0.anInt1840 = 0;
			arg0.anInt1794 = 0;
			arg0.anInt1800 = arg0.anIntArray311[0] * 128 + arg0.anInt1787 * 64;
			arg0.anInt1790 = -1;
			arg0.anInt1792 = arg0.anInt1787 * 64 + arg0.anIntArray314[0] * 128;
			arg0.method1439();
		}
		Static148.method1435(arg0);
		Static138.method2702(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method7() {
		Static139.anInt3669 = -1;
		Static15.anInt1152 = -1;
		Static135.anInt3444 = 0;
		Static21.anInt574 = 0;
		Static69.aBoolean112 = false;
		Static82.anInt2400 = 0;
		Static51.aClass3_Sub8_Sub1_2.anInt1948 = 0;
		Static65.anInt2024 = -1;
		Static11.anInt410 = 0;
		Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
		Static16.anInt490 = 0;
		Static93.anInt2607 = 0;
		Static159.anInt3903 = -1;
		for (@Pc(41) int local41 = 0; local41 < Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1.length; local41++) {
			if (Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local41] != null) {
				Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local41].anInt1796 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1.length; local62++) {
			if (Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local62] != null) {
				Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local62].anInt1796 = -1;
			}
		}
		Static155.method2949();
		Static173.method3141(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static137.aBooleanArray15[local84] = true;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!c;")
	public static Class3_Sub2_Sub3 method8(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub2_Sub3 local11 = (Class3_Sub2_Sub3) Static164.aClass63_29.method2337((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static110.aClass7_48.method1021(13, arg0);
		local11 = new Class3_Sub2_Sub3();
		local11.anInt509 = arg0;
		if (local25 != null) {
			local11.method550(new Class3_Sub8(local25));
		}
		Static164.aClass63_29.method2338((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method9() {
		aClass28_2 = null;
		aClass87_1 = null;
		anIntArray4 = null;
		aClass28_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method11() {
		Static140.anInt3590 = 0;
		@Pc(17) int local17 = Static111.anInt2843 + (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800 >> 7);
		@Pc(24) int local24 = Static29.anInt907 + (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static140.anInt3590 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static140.anInt3590 = 1;
		}
		if (Static140.anInt3590 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static140.anInt3590 = 0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ah;ILclient!ah;Lclient!ah;)V")
	public static void method12(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2) {
		Static133.aClass7_54 = arg2;
		Static95.aClass7_46 = arg0;
		Static78.aClass7_34 = arg1;
	}
}
