import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "[[[Lclient!kb;")
	public static Class1_Sub19[][][] aClass1_Sub19ArrayArrayArray1;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public static int anInt2506 = 0;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "[Lclient!jj;")
	public static Class1_Sub18[] aClass1_Sub18Array1 = new Class1_Sub18[2048];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method2049() {
		if (Static176.anInt3258 == 0) {
			return;
		}
		try {
			if (++Static280.anInt5602 > 2000) {
				if (Static155.aClass73_3 != null) {
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
				}
				if (Static205.anInt4083 >= 1) {
					Static176.anInt3258 = 0;
					Static109.anInt2050 = -5;
					return;
				}
				Static280.anInt5602 = 0;
				if (Static52.anInt1108 == Static89.anInt1687) {
					Static52.anInt1108 = Static254.anInt5889;
				} else {
					Static52.anInt1108 = Static89.anInt1687;
				}
				Static176.anInt3258 = 1;
				Static205.anInt4083++;
			}
			if (Static176.anInt3258 == 1) {
				Static4.aClass118_2 = Static13.aClass84_3.method1964(Static286.aString169, Static52.anInt1108);
				Static176.anInt3258 = 2;
			}
			@Pc(121) int local121;
			if (Static176.anInt3258 == 2) {
				if (Static4.aClass118_2.anInt3187 == 2) {
					throw new IOException();
				}
				if (Static4.aClass118_2.anInt3187 != 1) {
					return;
				}
				Static155.aClass73_3 = new Class73((Socket) Static4.aClass118_2.anObject3, Static13.aClass84_3);
				Static4.aClass118_2 = null;
				Static155.aClass73_3.method1685(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				local121 = Static155.aClass73_3.method1686();
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				if (local121 != 21) {
					Static176.anInt3258 = 0;
					Static109.anInt2050 = local121;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				}
				Static176.anInt3258 = 3;
			}
			if (Static176.anInt3258 == 3) {
				if (Static155.aClass73_3.method1687() < 1) {
					return;
				}
				Static131.aStringArray9 = new String[Static155.aClass73_3.method1686()];
				Static176.anInt3258 = 4;
			}
			if (Static176.anInt3258 == 4) {
				if (Static155.aClass73_3.method1687() < Static131.aStringArray9.length * 8) {
					return;
				}
				Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
				Static155.aClass73_3.method1689(Static131.aStringArray9.length * 8, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
				for (local121 = 0; local121 < Static131.aStringArray9.length; local121++) {
					Static131.aStringArray9[local121] = Static45.method819(Static63.aClass1_Sub18_Sub1_1.method3112());
				}
				Static176.anInt3258 = 0;
				Static109.anInt2050 = 21;
				Static155.aClass73_3.method1691();
				Static155.aClass73_3 = null;
				return;
			}
		} catch (@Pc(235) IOException local235) {
			if (Static155.aClass73_3 != null) {
				Static155.aClass73_3.method1691();
				Static155.aClass73_3 = null;
			}
			if (Static205.anInt4083 >= 1) {
				Static109.anInt2050 = -4;
				Static176.anInt3258 = 0;
			} else {
				Static205.anInt4083++;
				Static280.anInt5602 = 0;
				Static176.anInt3258 = 1;
				if (Static89.anInt1687 == Static52.anInt1108) {
					Static52.anInt1108 = Static254.anInt5889;
				} else {
					Static52.anInt1108 = Static89.anInt1687;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBLclient!og;IIII)V")
	public static void method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static206.aBoolean308) {
			Static229.anInt4796 = 32;
		} else {
			Static229.anInt4796 = 0;
		}
		Static206.aBoolean308 = false;
		@Pc(127) int local127;
		if (Static211.anInt959 != 0) {
			if (arg4 <= arg1 && arg1 < arg4 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
				arg2.anInt3628 -= 4;
				Static155.method2392(arg2);
			} else if (arg1 >= arg4 && arg4 + 16 > arg1 && arg3 + arg6 - 16 <= arg0 && arg0 < arg3 + arg6) {
				arg2.anInt3628 += 4;
				Static155.method2392(arg2);
			} else if (arg1 >= arg4 - Static229.anInt4796 && arg4 + Static229.anInt4796 + 16 > arg1 && arg3 + 16 <= arg0 && arg0 < arg3 + arg6 - 16) {
				local127 = arg6 * (arg6 - 32) / arg5;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(143) int local143 = arg0 - arg3 - local127 / 2 - 16;
				@Pc(149) int local149 = arg6 - local127 - 32;
				arg2.anInt3628 = local143 * (arg5 - arg6) / local149;
				Static155.method2392(arg2);
				Static206.aBoolean308 = true;
			}
		}
		if (Static286.anInt5073 == 0) {
			return;
		}
		local127 = arg2.anInt3567;
		if (arg4 - local127 <= arg1 && arg3 <= arg0 && arg1 < arg4 + 16 && arg6 + arg3 >= arg0) {
			arg2.anInt3628 += Static286.anInt5073 * 45;
			Static155.method2392(arg2);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
	public static void method2052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		if (arg0 != Static131.anInt2513) {
			Static105.anIntArray261 = new int[arg0];
			for (local18 = 0; local18 < arg0; local18++) {
				Static105.anIntArray261[local18] = (local18 << 12) / arg0;
			}
			Static297.anInt5893 = arg0 * 32;
			Static11.anInt321 = arg0 - 1;
			Static131.anInt2513 = arg0;
		}
		if (Static219.anInt4483 == arg1) {
			return;
		}
		if (arg1 == Static131.anInt2513) {
			Static219.anIntArray515 = Static105.anIntArray261;
		} else {
			Static219.anIntArray515 = new int[arg1];
			for (local18 = 0; local18 < arg1; local18++) {
				Static219.anIntArray515[local18] = (local18 << 12) / arg1;
			}
		}
		Static219.anInt4483 = arg1;
		Static9.anInt244 = arg1 - 1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!jj;B)Lclient!je;")
	public static Class82 method2053(@OriginalArg(0) Class1_Sub18 arg0) {
		@Pc(13) Class82 local13 = new Class82();
		local13.anInt2376 = arg0.method3107();
		local13.aClass1_Sub2_Sub18_1 = Static263.method4060(local13.anInt2376);
		return local13;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public static void method2054() {
		Static77.aClass31_13.method856(5);
	}
}
