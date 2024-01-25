import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public static int anInt547;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
	public static int anInt554;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString11 = "Continue";

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt549 = -1;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!ni;")
	public static final Class3_Sub4_Sub2 aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Lclient!sj;")
	public static Class181 method415(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static311.aClass181ArrayArray1[local7] == null || Static311.aClass181ArrayArray1[local7][local11] == null) {
			@Pc(27) boolean local27 = Static149.method2419(local7);
			if (!local27) {
				return null;
			}
		}
		return Static311.aClass181ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method416() {
		Static316.method5250(Static328.aClass181_50);
		Static218.anInt4470++;
		if (Static25.aBoolean31 && Static61.aBoolean62) {
			@Pc(24) int local24 = Static192.anInt4000;
			local24 -= Static45.anInt926;
			@Pc(30) int local30 = Static221.anInt4562;
			local30 -= Static337.anInt6550;
			if (local24 < Static98.anInt2072) {
				local24 = Static98.anInt2072;
			}
			if (Static105.anInt2212 > local30) {
				local30 = Static105.anInt2212;
			}
			if (Static163.aClass181_28.anInt5704 + Static98.anInt2072 < Static328.aClass181_50.anInt5704 + local24) {
				local24 = Static163.aClass181_28.anInt5704 + Static98.anInt2072 - Static328.aClass181_50.anInt5704;
			}
			if (Static328.aClass181_50.anInt5721 + local30 > Static105.anInt2212 + Static163.aClass181_28.anInt5721) {
				local30 = Static163.aClass181_28.anInt5721 + Static105.anInt2212 - Static328.aClass181_50.anInt5721;
			}
			@Pc(96) int local96 = local24 - Static349.anInt6770;
			@Pc(101) int local101 = local30 - Static151.anInt2968;
			@Pc(104) int local104 = Static328.aClass181_50.anInt5768;
			if (Static328.aClass181_50.anInt5749 < Static218.anInt4470 && (local96 > local104 || local96 < -local104 || local104 < local101 || -local104 > local101)) {
				Static3.aBoolean7 = true;
			}
			@Pc(144) int local144 = Static163.aClass181_28.anInt5717 + local24 - Static98.anInt2072;
			@Pc(153) int local153 = local30 + Static163.aClass181_28.anInt5685 - Static105.anInt2212;
			@Pc(162) Class3_Sub41 local162;
			if (Static328.aClass181_50.anObjectArray5 != null && Static3.aBoolean7) {
				local162 = new Class3_Sub41();
				local162.aClass181_54 = Static328.aClass181_50;
				local162.anObjectArray34 = Static328.aClass181_50.anObjectArray5;
				local162.anInt6473 = local144;
				local162.anInt6470 = local153;
				Static139.method2275(local162);
			}
			if (Static1.anInt12 == 0) {
				if (Static3.aBoolean7) {
					if (Static328.aClass181_50.anObjectArray8 != null) {
						local162 = new Class3_Sub41();
						local162.anObjectArray34 = Static328.aClass181_50.anObjectArray8;
						local162.aClass181_54 = Static328.aClass181_50;
						local162.anInt6473 = local144;
						local162.aClass181_53 = Static6.aClass181_48;
						local162.anInt6470 = local153;
						Static139.method2275(local162);
					}
					if (Static6.aClass181_48 != null && Static47.method823(Static328.aClass181_50) != null) {
						Static291.aClass3_Sub4_Sub2_3.method3682(204);
						Static291.aClass3_Sub4_Sub2_3.method3650(Static328.aClass181_50.anInt5761);
						Static291.aClass3_Sub4_Sub2_3.method3660(Static6.aClass181_48.anInt5688);
						Static291.aClass3_Sub4_Sub2_3.method3615(Static6.aClass181_48.anInt5761);
						Static291.aClass3_Sub4_Sub2_3.method3664(Static328.aClass181_50.anInt5688);
					}
				} else if ((Static285.anInt5662 == 1 || Static331.method5461()) && Static170.anInt6279 > 2) {
					Static187.method3385(2);
				} else if (Static340.method5559()) {
					Static187.method3385(1);
				}
				Static328.aClass181_50 = null;
			}
		} else if (Static218.anInt4470 > 1) {
			Static328.aClass181_50 = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method417(@OriginalArg(0) Component arg0) {
		@Pc(10) Method local10 = Static59.aMethod2;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static308.aClass156_1);
		arg0.addFocusListener(Static308.aClass156_1);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!tj;Lclient!km;IIIII)V")
	public static void method418(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static131.anInt2754) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static103.anInt2156) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static116.anInt2499 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class45 local62 = Static256.aClass45ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static69.aClass22Array1[local17].method4672(local23, local32) + Static69.aClass22Array1[local17].method4672(local23 + 1, local32) + Static69.aClass22Array1[local17].method4672(local23, local32 + 1) + Static69.aClass22Array1[local17].method4672(local23 + 1, local32 + 1)) / 4 - (Static69.aClass22Array1[arg2].method4672(arg3, arg4) + Static69.aClass22Array1[arg2].method4672(arg3 + 1, arg4) + Static69.aClass22Array1[arg2].method4672(arg3, arg4 + 1) + Static69.aClass22Array1[arg2].method4672(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class5_Sub5 local143 = local62.aClass5_Sub5_1;
									@Pc(146) Class5_Sub5 local146 = local62.aClass5_Sub5_2;
									if (local143 != null && local143.method5327()) {
										arg1.method5333((local32 - arg4) * 128 + (1 - arg6) * 64, arg0, local140, local1, local143, (local23 - arg3) * 128 + (1 - arg5) * 64);
									}
									if (local146 != null && local146.method5327()) {
										arg1.method5333((local32 - arg4) * 128 + (1 - arg6) * 64, arg0, local140, local1, local146, (local23 - arg3) * 128 + (1 - arg5) * 64);
									}
									for (@Pc(219) Class160 local219 = local62.aClass160_1; local219 != null; local219 = local219.aClass160_3) {
										@Pc(223) Class5_Sub4 local223 = local219.aClass5_Sub4_1;
										if (local223 != null && local223.method5327() && (local23 == local223.aShort86 || local23 == local3) && (local32 == local223.aShort87 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort89 + 1 - local223.aShort86;
											@Pc(260) int local260 = local223.aShort88 + 1 - local223.aShort87;
											arg1.method5333((local223.aShort87 - arg4) * 128 + (local260 - arg6) * 64, arg0, local140, local1, local223, (local223.aShort86 - arg3) * 128 + (local252 - arg5) * 64);
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

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method419() {
		@Pc(5) Class198 local5 = Static327.aClass198_59;
		synchronized (Static327.aClass198_59) {
			Static327.aClass198_59.method5230();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
	public static boolean method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static161.anInt3147; local1++) {
			@Pc(6) Class158 local6 = Static188.aClass158Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4746 == 1) {
				local15 = local6.anInt4730 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4741 + (local6.anInt4743 * local15 >> 8);
					local37 = local6.anInt4738 + (local6.anInt4749 * local15 >> 8);
					local47 = local6.anInt4729 + (local6.anInt4742 * local15 >> 8);
					local57 = local6.anInt4731 + (local6.anInt4744 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4746 == 2) {
				local15 = arg0 - local6.anInt4730;
				if (local15 > 0) {
					local27 = local6.anInt4741 + (local6.anInt4743 * local15 >> 8);
					local37 = local6.anInt4738 + (local6.anInt4749 * local15 >> 8);
					local47 = local6.anInt4729 + (local6.anInt4742 * local15 >> 8);
					local57 = local6.anInt4731 + (local6.anInt4744 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4746 == 3) {
				local15 = local6.anInt4741 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4730 + (local6.anInt4727 * local15 >> 8);
					local37 = local6.anInt4748 + (local6.anInt4750 * local15 >> 8);
					local47 = local6.anInt4729 + (local6.anInt4742 * local15 >> 8);
					local57 = local6.anInt4731 + (local6.anInt4744 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4746 == 4) {
				local15 = arg2 - local6.anInt4741;
				if (local15 > 0) {
					local27 = local6.anInt4730 + (local6.anInt4727 * local15 >> 8);
					local37 = local6.anInt4748 + (local6.anInt4750 * local15 >> 8);
					local47 = local6.anInt4729 + (local6.anInt4742 * local15 >> 8);
					local57 = local6.anInt4731 + (local6.anInt4744 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4746 == 5) {
				local15 = arg1 - local6.anInt4729;
				if (local15 > 0) {
					local27 = local6.anInt4730 + (local6.anInt4727 * local15 >> 8);
					local37 = local6.anInt4748 + (local6.anInt4750 * local15 >> 8);
					local47 = local6.anInt4741 + (local6.anInt4743 * local15 >> 8);
					local57 = local6.anInt4738 + (local6.anInt4749 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
