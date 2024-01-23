import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "[[[Lclient!mc;")
	public static Class1_Sub17[][][] aClass1_Sub17ArrayArrayArray3;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public static int anInt2459;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt2468;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	public static int anInt2470;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "[Lclient!ig;")
	public static Class83[] aClass83Array1 = new Class83[6];

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt2458 = 0;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public static int anInt2466 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1957() {
		if (Static81.aClass7_2 != null) {
			Static81.aClass7_2.method105();
			Static81.aClass7_2 = null;
		}
		Static38.method686();
		Static260.method3909();
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			Static56.aClass122Array1[local17].method3120();
		}
		Static162.method2753(false);
		System.gc();
		Static59.method1015();
		Static142.anInt2796 = -1;
		Static113.aBoolean168 = false;
		Static57.method982(true);
		Static118.anInt2409 = 0;
		Static244.anInt4868 = 0;
		Static290.anInt5497 = 0;
		Static288.aBoolean393 = false;
		Static305.anInt5793 = 0;
		for (local17 = 0; local17 < Static257.aClass68Array1.length; local17++) {
			Static257.aClass68Array1[local17] = null;
		}
		Static222.anInt4329 = 0;
		Static105.anInt2015 = 0;
		for (local17 = 0; local17 < 2048; local17++) {
			Static195.aClass22_Sub3_Sub2Array1[local17] = null;
			Static280.aClass1_Sub14Array1[local17] = null;
		}
		for (local17 = 0; local17 < 32768; local17++) {
			Static265.aClass22_Sub3_Sub1Array1[local17] = null;
		}
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(119) int local119 = 0; local119 < 104; local119++) {
				for (@Pc(124) int local124 = 0; local124 < 104; local124++) {
					Static68.aClass24ArrayArrayArray1[local17][local119][local124] = null;
				}
			}
		}
		Static119.method4630();
		Static189.anInt3780 = 0;
		Static233.method3680();
		Static146.method2325(true);
		try {
			Static324.method4224("loggedout", Static117.aClass117_3.anApplet1);
		} catch (@Pc(163) Throwable local163) {
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1958() {
		Static228.aClass169_25.method4018();
		Static249.aClass169_133.method4018();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!cl;")
	public static Class1_Sub1_Sub6 method1960(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub1_Sub6 local18 = (Class1_Sub1_Sub6) Static60.aClass58_3.method1233((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static85.aClass138_26.method3346(26, arg0);
		local18 = new Class1_Sub1_Sub6();
		if (local28 != null) {
			local18.method603(new Class1_Sub14(local28));
		}
		Static60.aClass58_3.method1229((long) arg0, local18);
		return local18;
	}
}
