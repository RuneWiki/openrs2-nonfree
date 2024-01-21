import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Lclient!od;")
	public static Class2_Sub2_Sub5 aClass2_Sub2_Sub5_3;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_990 = Static181.method2795("scroll:");

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_991 = aClass83_990;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_992 = Static181.method2795("headicons_prayer");

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "Ljava/lang/Object;")
	public static final Object anObject4 = new Object();

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "Lclient!qe;")
	public static Class83 aClass83_993 = aClass83_990;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
	public static int anInt3454 = 0;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "Z")
	public static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
	public static int anInt3455 = 0;

	@OriginalMember(owner = "client!rg", name = "R", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_995 = Static181.method2795(" is already on your ignore list)3");

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "Lclient!qe;")
	public static Class83 aClass83_994 = aClass83_995;

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_996 = Static181.method2795(")3)3)3");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZIILclient!eh;)V")
	public static void method2588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) Class28 arg2) {
		Static92.anInt1969 = 1;
		Static207.aBoolean188 = false;
		Static138.aClass28_139 = arg2;
		Static211.anInt4194 = arg1;
		Static156.anInt4252 = arg0;
		Static19.anInt540 = 0;
		Static137.anInt2903 = 2;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public static void method2589() {
		@Pc(9) int local9 = Static62.aClass2_Sub2_Sub5_1.method1089(Static118.aClass83_801);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static98.anInt2124; local11++) {
			local19 = Static62.aClass2_Sub2_Sub5_1.method1089(Static189.method2861(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static98.anInt2124 * 15 + 21;
		@Pc(42) int local42 = Static59.anInt1446 - local9 / 2;
		Static162.anInt3931 = local9;
		Static160.anInt3230 = Static98.anInt2124 * 15 + 22;
		if (Static89.anInt4290 < local9 + local42) {
			local42 = Static89.anInt4290 - local9;
		}
		@Pc(71) int local71 = Static153.anInt3298;
		if (Static190.anInt3767 < local19 + local71) {
			local71 = Static190.anInt3767 - local19;
		}
		Static159.aBoolean152 = true;
		if (local71 < 0) {
			local71 = 0;
		}
		Static43.anInt1134 = local71;
		if (local42 < 0) {
			local42 = 0;
		}
		Static177.anInt3624 = local42;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
	public static void method2590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg3);
		@Pc(17) int local17 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg5);
		@Pc(23) int local23 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg2);
		@Pc(29) int local29 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg4);
		@Pc(45) int local45 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg1 + arg3);
		@Pc(54) int local54 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg5 - arg1);
		for (@Pc(56) int local56 = local11; local56 < local45; local56++) {
			Static22.method438(local29, arg0, local23, Static14.anIntArrayArray18[local56]);
		}
		for (@Pc(76) int local76 = local17; local76 > local54; local76--) {
			Static22.method438(local29, arg0, local23, Static14.anIntArrayArray18[local76]);
		}
		@Pc(102) int local102 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg1 + arg2);
		@Pc(110) int local110 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg4 - arg1);
		for (@Pc(112) int local112 = local45; local112 <= local54; local112++) {
			@Pc(118) int[] local118 = Static14.anIntArrayArray18[local112];
			Static22.method438(local102, arg0, local23, local118);
			Static22.method438(local29, arg0, local110, local118);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method2593(@OriginalArg(0) Class5 arg0) {
		@Pc(6) int local6 = arg0.anInt180;
		if (local6 == 324) {
			if (Static189.anInt3762 == -1) {
				Static28.anInt727 = arg0.anInt123;
				Static189.anInt3762 = arg0.anInt173;
			}
			if (Static4.aClass49_1.aBoolean100) {
				arg0.anInt173 = Static189.anInt3762;
			} else {
				arg0.anInt173 = Static28.anInt727;
			}
		} else if (local6 == 325) {
			if (Static189.anInt3762 == -1) {
				Static28.anInt727 = arg0.anInt123;
				Static189.anInt3762 = arg0.anInt173;
			}
			if (Static4.aClass49_1.aBoolean100) {
				arg0.anInt173 = Static28.anInt727;
			} else {
				arg0.anInt173 = Static189.anInt3762;
			}
		} else if (local6 == 327) {
			arg0.anInt152 = 150;
			arg0.anInt171 = (int) (Math.sin((double) Static13.anInt386 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt178 = 5;
			arg0.anInt144 = -1;
		} else if (local6 == 328) {
			if (Static54.aClass24_Sub4_Sub1_1.aClass83_664 == null) {
				arg0.anInt144 = 0;
			} else {
				arg0.anInt152 = 150;
				arg0.anInt171 = (int) (Math.sin((double) Static13.anInt386 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt178 = 5;
				arg0.anInt144 = ((int) Static54.aClass24_Sub4_Sub1_1.aClass83_664.method2397() << 11) + 2047;
				arg0.anInt164 = Static54.aClass24_Sub4_Sub1_1.anInt3310;
				arg0.anInt169 = Static54.aClass24_Sub4_Sub1_1.anInt3322;
			}
		}
	}
}
