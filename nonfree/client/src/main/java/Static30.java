import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_418 = Static28.method504("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_419 = Static28.method504(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public static int anInt783 = -1;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public static int anInt785 = 0;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	public static int anInt786 = 0;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[I")
	public static int[] anIntArray87 = new int[50];

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "[I")
	public static int[] anIntArray88 = new int[100];

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "[I")
	public static int[] anIntArray89 = new int[100];

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "Lclient!ja;")
	public static Class39 aClass39_420 = Static28.method504("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
	public static void method521(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static72.anInt799; local3++) {
			@Pc(11) Class4_Sub2_Sub1_Sub1_Sub2 local11 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static33.anIntArray94[local3]];
			@Pc(19) int local19 = (Static33.anIntArray94[local3] << 14) + 536870912;
			if (local11 != null && local11.method1915() && arg0 == local11.aClass4_Sub2_Sub16_1.aBoolean141 && local11.aClass4_Sub2_Sub16_1.method2042()) {
				@Pc(40) int local40 = local11.anInt2643 >> 7;
				@Pc(45) int local45 = local11.anInt2641 >> 7;
				if (local40 >= 0 && local40 < 104 && local45 >= 0 && local45 < 104) {
					if (local11.anInt2653 == 1 && (local11.anInt2643 & 0x7F) == 64 && (local11.anInt2641 & 0x7F) == 64) {
						if (Static88.anIntArrayArray16[local40][local45] == Static98.anInt1019) {
							continue;
						}
						Static88.anIntArrayArray16[local40][local45] = Static98.anInt1019;
					}
					if (!local11.aClass4_Sub2_Sub16_1.aBoolean142) {
						local19 += Integer.MIN_VALUE;
					}
					Static101.aClass43_1.method1105(Static131.anInt3202, local11.anInt2643, local11.anInt2641, Static94.method1708(local11.anInt2643 + local11.anInt2653 * 64 - 64, (local11.anInt2653 - 1) * 64 + local11.anInt2641, Static131.anInt3202), local11.anInt2653 * 64 + 60 - 64, local11, local11.anInt2670, local19, local11.aBoolean134);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
	public static void method522(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static83.anInt2086 >= 100) {
			Static40.method672(0, Static121.aClass39_1610, Static72.aClass39_423);
			return;
		}
		@Pc(29) Class39 local29 = Static94.method1699(arg0).method955();
		for (@Pc(31) int local31 = 0; local31 < Static83.anInt2086; local31++) {
			if (Static42.aLongArray3[local31] == arg0) {
				Static40.method672(0, Static62.method1123(new Class39[] { local29, Static36.aClass39_462 }), Static72.aClass39_423);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static48.anInt1254; local64++) {
			if (Static80.aLongArray4[local64] == arg0) {
				Static40.method672(0, Static62.method1123(new Class39[] { Static32.aClass39_443, local29, Static69.aClass39_914 }), Static72.aClass39_423);
				return;
			}
		}
		if (local29.method968(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass39_1279)) {
			Static40.method672(0, Static10.aClass39_235, Static72.aClass39_423);
		} else {
			Static42.aLongArray3[Static83.anInt2086++] = arg0;
			Static4.anInt88 = Static129.anInt3153;
			Static114.aClass4_Sub16_Sub1_3.method1499(160);
			Static114.aClass4_Sub16_Sub1_3.method1457(arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI)V")
	public static void method523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) long local7 = (long) ((arg1 << 16) + arg0);
		@Pc(17) Class4_Sub2_Sub8 local17 = (Class4_Sub2_Sub8) Static117.aClass42_12.method1055(local7);
		if (local17 != null) {
			Static82.aClass7_2.method185(local17);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public static void method524() {
		anIntArray88 = null;
		aShortArray3 = null;
		aByteArrayArray4 = null;
		aClass39_418 = null;
		aClass39_419 = null;
		anIntArray87 = null;
		anIntArray89 = null;
		aByteArrayArrayArray2 = null;
		aClass39_420 = null;
		anIntArray86 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	public static int method525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[Lclient!ja;)[Lclient!ja;")
	public static Class39[] method526(@OriginalArg(1) Class39[] arg0) {
		@Pc(16) Class39[] local16 = new Class39[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = Static62.method1123(new Class39[] { Static29.method510(local18), Static33.aClass39_447 });
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = Static62.method1123(new Class39[] { local16[local18], arg0[local18] });
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ea;ILclient!u;I)V")
	public static void method527(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(7) Class4_Sub23 local7 = new Class4_Sub23();
		local7.aClass75_4 = arg2;
		local7.anInt3043 = 1;
		local7.aClass20_Sub1_18 = arg0;
		local7.aLong155 = arg1;
		@Pc(29) Class61 local29 = Static33.aClass61_5;
		synchronized (Static33.aClass61_5) {
			Static33.aClass61_5.method1635(local7);
		}
		Static13.method231();
	}
}
