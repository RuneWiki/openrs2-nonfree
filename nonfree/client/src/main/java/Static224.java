import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static int anInt4886;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "Z")
	public static boolean aBoolean434 = true;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1318 = Static231.method3737("p11_full");

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1319 = Static231.method3737("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1320 = Static231.method3737("event_opbase");

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1321 = Static231.method3737("_");

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)V")
	public static void method3664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static157.anInt3449 != 0 && arg1 != -1) {
			Static172.method2739(arg1, Static157.anInt3449, Static195.aClass28_Sub1_111);
			Static179.aBoolean356 = true;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIILclient!af;IZJ)Z")
	public static boolean method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static166.anIntArrayArrayArray11 == Static36.anIntArrayArrayArray3;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (@Pc(13) int local13 = arg2; local13 < arg2 + arg4; local13++) {
				if (local10 < 0 || local13 < 0 || local10 >= Static159.anInt3497 || local13 >= Static213.anInt4593) {
					return false;
				}
				@Pc(34) Class1_Sub9 local34 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][local10][local13];
				if (local34 != null && local34.anInt1416 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class99 local58 = new Class99();
		local58.aLong140 = arg11;
		local58.anInt3806 = arg0;
		local58.anInt3803 = arg5;
		local58.anInt3815 = arg6;
		local58.anInt3802 = arg7;
		local58.aClass5_10 = arg8;
		local58.anInt3809 = arg9;
		local58.anInt3819 = arg1;
		local58.anInt3808 = arg2;
		local58.anInt3807 = arg1 + arg3 - 1;
		local58.anInt3811 = arg2 + arg4 - 1;
		@Pc(104) int local104;
		@Pc(107) int local107;
		for (@Pc(101) int local101 = arg1; local101 < arg1 + arg3; local101++) {
			for (local104 = arg2; local104 < arg2 + arg4; local104++) {
				local107 = 0;
				if (local101 > arg1) {
					local107++;
				}
				if (local101 < arg1 + arg3 - 1) {
					local107 += 4;
				}
				if (local104 > arg2) {
					local107 += 8;
				}
				if (local104 < arg2 + arg4 - 1) {
					local107 += 2;
				}
				for (@Pc(133) int local133 = arg0; local133 >= 0; local133--) {
					if (Static174.aClass1_Sub9ArrayArrayArray2[local133][local101][local104] == null) {
						Static174.aClass1_Sub9ArrayArrayArray2[local133][local101][local104] = new Class1_Sub9(local133, local101, local104);
					}
				}
				@Pc(166) Class1_Sub9 local166 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][local101][local104];
				local166.aClass99Array2[local166.anInt1416] = local58;
				local166.anIntArray125[local166.anInt1416] = local107;
				local166.anInt1414 |= local107;
				local166.anInt1416++;
				if (local6 && Static60.anIntArrayArray19[local101][local104] != 0) {
					local8 = Static60.anIntArrayArray19[local101][local104];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local104 = arg1; local104 < arg1 + arg3; local104++) {
				for (local107 = arg2; local107 < arg2 + arg4; local107++) {
					if (Static60.anIntArrayArray19[local104][local107] == 0) {
						Static60.anIntArrayArray19[local104][local107] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static30.aClass99Array1[Static176.anInt3801++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
	public static void method3667() {
		if (Static122.anInt2676 == 0) {
			return;
		}
		try {
			if (++Static100.anInt2168 > 2000) {
				if (Static167.aClass82_3 != null) {
					Static167.aClass82_3.method2395();
					Static167.aClass82_3 = null;
				}
				if (Static59.anInt1428 >= 1) {
					Static122.anInt2676 = 0;
					Static143.anInt3140 = -5;
					return;
				}
				if (Static90.anInt1964 == Static211.anInt4553) {
					Static211.anInt4553 = Static155.anInt434;
				} else {
					Static211.anInt4553 = Static90.anInt1964;
				}
				Static59.anInt1428++;
				Static122.anInt2676 = 1;
				Static100.anInt2168 = 0;
			}
			if (Static122.anInt2676 == 1) {
				Static110.aClass84_5 = Static117.aClass34_2.method1065(Static211.anInt4553, Static91.aString10);
				Static122.anInt2676 = 2;
			}
			@Pc(124) int local124;
			if (Static122.anInt2676 == 2) {
				if (Static110.aClass84_5.anInt3171 == 2) {
					throw new IOException();
				}
				if (Static110.aClass84_5.anInt3171 != 1) {
					return;
				}
				Static167.aClass82_3 = new Class82((Socket) Static110.aClass84_5.anObject4, Static117.aClass34_2);
				Static110.aClass84_5 = null;
				Static167.aClass82_3.method2399(Static193.aClass1_Sub26_Sub1_2.anInt4021, Static193.aClass1_Sub26_Sub1_2.aByteArray52);
				if (Static186.aClass62_2 != null) {
					Static186.aClass62_2.method2412();
				}
				if (Static100.aClass62_1 != null) {
					Static100.aClass62_1.method2412();
				}
				local124 = Static167.aClass82_3.method2394();
				if (Static186.aClass62_2 != null) {
					Static186.aClass62_2.method2412();
				}
				if (Static100.aClass62_1 != null) {
					Static100.aClass62_1.method2412();
				}
				if (local124 != 21) {
					Static122.anInt2676 = 0;
					Static143.anInt3140 = local124;
					Static167.aClass82_3.method2395();
					Static167.aClass82_3 = null;
					return;
				}
				Static122.anInt2676 = 3;
			}
			if (Static122.anInt2676 == 3) {
				if (Static167.aClass82_3.method2397() < 1) {
					return;
				}
				Static32.aClass107Array3 = new Class107[Static167.aClass82_3.method2394()];
				Static122.anInt2676 = 4;
			}
			if (Static122.anInt2676 == 4 && Static167.aClass82_3.method2397() >= Static32.aClass107Array3.length * 8) {
				Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
				Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, Static32.aClass107Array3.length * 8);
				for (local124 = 0; local124 < Static32.aClass107Array3.length; local124++) {
					Static32.aClass107Array3[local124] = Static19.method382(Static194.aClass1_Sub26_Sub1_3.method2943());
				}
				Static143.anInt3140 = 21;
				Static122.anInt2676 = 0;
				Static167.aClass82_3.method2395();
				Static167.aClass82_3 = null;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static167.aClass82_3 != null) {
				Static167.aClass82_3.method2395();
				Static167.aClass82_3 = null;
			}
			if (Static59.anInt1428 >= 1) {
				Static122.anInt2676 = 0;
				Static143.anInt3140 = -4;
			} else {
				Static122.anInt2676 = 1;
				if (Static90.anInt1964 == Static211.anInt4553) {
					Static211.anInt4553 = Static155.anInt434;
				} else {
					Static211.anInt4553 = Static90.anInt1964;
				}
				Static59.anInt1428++;
				Static100.anInt2168 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIIILclient!jb;I)V")
	public static void method3668(@OriginalArg(0) int arg0, @OriginalArg(5) Class28 arg1, @OriginalArg(6) int arg2) {
		Static114.anInt2517 = 0;
		Static125.anInt2704 = arg0;
		Static105.anInt2303 = arg2;
		Static37.anInt766 = 2;
		Static97.aBoolean190 = false;
		Static116.anInt2569 = 1;
		Static16.aClass28_7 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z")
	public static boolean method3669(@OriginalArg(1) int arg0) {
		if (Static43.aBooleanArray7[arg0]) {
			return true;
		} else if (Static57.aClass28_83.method834(arg0)) {
			@Pc(23) int local23 = Static57.aClass28_83.method832(arg0);
			if (local23 == 0) {
				Static43.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static6.aClass86ArrayArray11[arg0] == null) {
				Static6.aClass86ArrayArray11[arg0] = new Class86[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static6.aClass86ArrayArray11[arg0][local42] == null) {
					@Pc(59) byte[] local59 = Static57.aClass28_83.method819(local42, arg0);
					if (local59 != null) {
						Static6.aClass86ArrayArray11[arg0][local42] = new Class86();
						Static6.aClass86ArrayArray11[arg0][local42].anInt3239 = (arg0 << 16) + local42;
						if (local59[0] == -1) {
							Static6.aClass86ArrayArray11[arg0][local42].method2435(new Class1_Sub26(local59));
						} else {
							Static6.aClass86ArrayArray11[arg0][local42].method2441(new Class1_Sub26(local59));
						}
					}
				}
			}
			Static43.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
