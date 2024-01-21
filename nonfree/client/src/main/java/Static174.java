import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_148;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_33;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "Z")
	public static volatile boolean aBoolean157 = true;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
	public static int anInt3885 = 0;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2307 = Static118.method2249("Login limit exceeded)3");

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "[S")
	public static final short[] aShortArray53 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
	public static int anInt3887 = 0;

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2308 = Static118.method2249("Abbrechen");

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2309 = Static118.method2249("Hier wechseln");

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2310 = aClass65_2307;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!wg;IIIII)V")
	public static void method2962(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static100.anInt2522) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static201.anInt3978) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static198.anInt4264 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub7 local62 = Static83.aClass1_Sub7ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static206.anIntArrayArrayArray10[local17][local23][local32] + Static206.anIntArrayArrayArray10[local17][local23 + 1][local32] + Static206.anIntArrayArrayArray10[local17][local23][local32 + 1] + Static206.anIntArrayArrayArray10[local17][local23 + 1][local32 + 1]) / 4 - (Static206.anIntArrayArrayArray10[arg1][arg2][arg3] + Static206.anIntArrayArrayArray10[arg1][arg2 + 1][arg3] + Static206.anIntArrayArrayArray10[arg1][arg2][arg3 + 1] + Static206.anIntArrayArrayArray10[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class10 local151 = local62.aClass10_1;
									if (local151 != null) {
										if (local151.aClass6_2.method2986()) {
											arg0.method2990(local151.aClass6_2, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass6_1 != null && local151.aClass6_1.method2986()) {
											arg0.method2990(local151.aClass6_1, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt1677; local222++) {
										@Pc(228) Class54 local228 = local62.aClass54Array2[local222];
										if (local228 != null && local228.aClass6_5.method2986() && (local23 == local228.anInt2639 || local23 == local3) && (local32 == local228.anInt2632 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt2636 + 1 - local228.anInt2639;
											@Pc(265) int local265 = local228.anInt2640 + 1 - local228.anInt2632;
											arg0.method2990(local228.aClass6_5, (local228.anInt2639 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt2632 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)V")
	public static void method2963(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg0);
		@Pc(14) int local14 = local10.method1753();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) Class1_Sub10 local22 = new Class1_Sub10();
			@Pc(26) Class65 local26 = local10.method1706();
			local22.anInt1865 = local10.method1753();
			local22.anInt1862 = local10.method1753();
			local22.anInt1867 = local10.method1738();
			local22.aClass65_1134 = local26.method2459();
			local22.aClass65Array24 = local26.method2447(47);
			Static182.aClass91_21.method3151(local22);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!sd;Lclient!oc;Lclient!oc;I)Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 method2964(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(13) int local13 = arg0.method2328(arg1);
		@Pc(23) int local23 = arg0.method2333(arg2, local13);
		return Static75.method1331(local23, arg0, local13);
	}
}
