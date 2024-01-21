import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
	public static int anInt1913;

	@OriginalMember(owner = "client!ma", name = "wb", descriptor = "Lclient!ff;")
	public static Class26 aClass26_16;

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "Lclient!r;")
	private static Class61 aClass61_583 = Static129.method2060("red:");

	@OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lclient!r;")
	private static Class61 aClass61_584 = Static129.method2060("To create a new account you need to");

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_585 = aClass61_583;

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_586 = aClass61_584;

	@OriginalMember(owner = "client!ma", name = "kb", descriptor = "[I")
	public static int[] anIntArray272 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lclient!r;")
	public static Class61 aClass61_587 = Static129.method2060("Stufe)2");

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lclient!r;")
	public static Class61 aClass61_588 = Static129.method2060("sl_back");

	@OriginalMember(owner = "client!ma", name = "sb", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!ma", name = "ub", descriptor = "[[[Lclient!qb;")
	public static Class58[][][] aClass58ArrayArrayArray1 = new Class58[4][104][104];

	@OriginalMember(owner = "client!ma", name = "vb", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array13 = new Class61[8];

	@OriginalMember(owner = "client!ma", name = "xb", descriptor = "Lclient!r;")
	public static Class61 aClass61_589 = aClass61_583;

	@OriginalMember(owner = "client!ma", name = "yb", descriptor = "Lclient!r;")
	public static Class61 aClass61_590 = Static129.method2060(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Lclient!f;")
	public static Class5_Sub2_Sub5 method1248(@OriginalArg(1) int arg0) {
		@Pc(6) Class5_Sub2_Sub5 local6 = (Class5_Sub2_Sub5) Static38.aClass29_16.method766((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static80.aClass26_18.method1038(1, arg0);
		local6 = new Class5_Sub2_Sub5();
		if (local22 != null) {
			local6.method672(arg0, new Class5_Sub14(local22));
		}
		local6.method669();
		Static38.aClass29_16.method762(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(JZ)V")
	public static void method1249(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!be;I)V")
	public static void method1250(@OriginalArg(0) Class5_Sub4 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt268 == 0) {
			local11 = Static61.aClass81_1.method2093(arg0.anInt261, arg0.anInt263, arg0.anInt260);
		}
		if (arg0.anInt268 == 1) {
			local11 = Static61.aClass81_1.method2110(arg0.anInt261, arg0.anInt263, arg0.anInt260);
		}
		if (arg0.anInt268 == 2) {
			local11 = Static61.aClass81_1.method2118(arg0.anInt261, arg0.anInt263, arg0.anInt260);
		}
		if (arg0.anInt268 == 3) {
			local11 = Static61.aClass81_1.method2080(arg0.anInt261, arg0.anInt263, arg0.anInt260);
		}
		if (local11 != 0) {
			local7 = local11 >> 14 & 0x7FFF;
			@Pc(92) int local92 = Static61.aClass81_1.method2071(arg0.anInt261, arg0.anInt263, arg0.anInt260, local11);
			local9 = local92 >> 6 & 0x3;
			local5 = local92 & 0x1F;
		}
		arg0.anInt259 = local5;
		arg0.anInt265 = local9;
		arg0.anInt267 = local7;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)Z")
	public static boolean method1251(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public static void method1252() {
		anObject4 = null;
		aClass61_583 = null;
		aClass58ArrayArrayArray1 = null;
		aClass61Array13 = null;
		aClass61_589 = null;
		aClass61_588 = null;
		aClass61_586 = null;
		aClass61_590 = null;
		aClass26_16 = null;
		anIntArray272 = null;
		aClass61_585 = null;
		aClass61_587 = null;
		aClass61_584 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)Z")
	public static boolean method1253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class5_Sub14 local12 = new Class5_Sub14(arg2);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(18) int local18 = local12.method1455();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) boolean local29 = false;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(73) int local73;
				@Pc(95) Class5_Sub2_Sub16 local95;
				do {
					@Pc(63) int local63;
					@Pc(67) int local67;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local29) {
										local37 = local12.method1455();
										if (local37 == 0) {
											continue label70;
										}
										local12.method1471();
									}
									local37 = local12.method1455();
									if (local37 == 0) {
										continue label70;
									}
									local31 += local37 - 1;
									@Pc(52) int local52 = local31 & 0x3F;
									@Pc(58) int local58 = local31 >> 6 & 0x3F;
									local63 = local58 + arg0;
									local67 = arg1 + local52;
									local73 = local12.method1471() >> 2;
								} while (local63 <= 0);
							} while (local67 <= 0);
						} while (local63 >= 103);
					} while (local67 >= 103);
					local95 = Static43.method767(local14);
				} while (local73 == 22 && Static61.aBoolean57 && local95.anInt3137 == 0 && local95.anInt3133 != 1 && !local95.aBoolean110);
				if (!local95.method1969()) {
					Static98.anInt2577++;
					local7 = false;
				}
				local29 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	public static void method1254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class5_Sub11 local4 = Static98.method1667(arg1, arg0);
		if (local4 != null && local4.anObjectArray26 != null) {
			@Pc(22) Class5_Sub22 local22 = new Class5_Sub22();
			local22.anObjectArray28 = local4.anObjectArray26;
			local22.aClass5_Sub11_12 = local4;
			Static76.method1228(local22);
		}
		Static16.anInt491 = arg0;
		Static73.anInt1738 = arg2;
		Static32.aBoolean27 = true;
		Static59.anInt1436 = arg1;
		Static24.method505(local4);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
	public static void method1255() {
		for (@Pc(11) int local11 = -1; local11 < Static92.anInt2219; local11++) {
			@Pc(20) int local20;
			if (local11 == -1) {
				local20 = 2047;
			} else {
				local20 = Static66.anIntArray236[local11];
			}
			@Pc(28) Class5_Sub2_Sub2_Sub3_Sub2 local28 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local20];
			if (local28 != null) {
				Static32.method654(local28, 1);
			}
		}
	}
}
