import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt1255;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
	public static int[] anIntArray176 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!kd;")
	private static Class39 aClass39_604 = Static108.method1915("Login server offline)3");

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_605 = aClass39_604;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[J")
	public static long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_606 = Static108.method1915("backright2");

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public static int anInt1256 = 0;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public static int anInt1257 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method791() {
		aLongArray3 = null;
		anIntArray176 = null;
		aClass39_604 = null;
		aClass39_605 = null;
		aClass39_606 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static92.anIntArrayArray23[local7][local11] = 0;
				Static85.anIntArrayArray21[local7][local11] = 99999999;
			}
		}
		Static92.anIntArrayArray23[arg0][arg4] = 99;
		local11 = arg0;
		@Pc(45) byte local45 = 0;
		Static85.anIntArrayArray21[arg0][arg4] = 0;
		@Pc(53) int local53 = arg4;
		Static102.anIntArray396[0] = arg0;
		@Pc(60) int local60 = local45 + 1;
		Static51.anIntArray194[0] = arg4;
		@Pc(64) int local64 = 0;
		@Pc(71) boolean local71 = false;
		@Pc(74) int local74 = Static102.anIntArray396.length;
		@Pc(79) int[][] local79 = Static62.aClass23Array2[Static9.anInt2983].anIntArrayArray9;
		@Pc(186) int local186;
		while (local60 != local64) {
			local11 = Static102.anIntArray396[local64];
			local53 = Static51.anIntArray194[local64];
			local64 = (local64 + 1) % local74;
			if (arg6 == local11 && local53 == arg7) {
				local71 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static62.aClass23Array2[Static9.anInt2983].method780(arg1, local53, arg6, local11, arg2 - 1, arg7)) {
					local71 = true;
					break;
				}
				if (arg2 < 10 && Static62.aClass23Array2[Static9.anInt2983].method765(arg6, arg7, arg1, arg2 - 1, local11, local53)) {
					local71 = true;
					break;
				}
			}
			if (arg3 != 0 && arg9 != 0 && Static62.aClass23Array2[Static9.anInt2983].method773(local11, arg7, local53, arg8, arg3, arg9, arg6)) {
				local71 = true;
				break;
			}
			local186 = Static85.anIntArrayArray21[local11][local53] + 1;
			if (local11 > 0 && Static92.anIntArrayArray23[local11 - 1][local53] == 0 && (local79[local11 - 1][local53] & 0x12C0108) == 0) {
				Static102.anIntArray396[local60] = local11 - 1;
				Static51.anIntArray194[local60] = local53;
				Static92.anIntArrayArray23[local11 - 1][local53] = 2;
				Static85.anIntArrayArray21[local11 - 1][local53] = local186;
				local60 = (local60 + 1) % local74;
			}
			if (local11 < 103 && Static92.anIntArrayArray23[local11 + 1][local53] == 0 && (local79[local11 + 1][local53] & 0x12C0180) == 0) {
				Static102.anIntArray396[local60] = local11 + 1;
				Static51.anIntArray194[local60] = local53;
				local60 = (local60 + 1) % local74;
				Static92.anIntArrayArray23[local11 + 1][local53] = 8;
				Static85.anIntArrayArray21[local11 + 1][local53] = local186;
			}
			if (local53 > 0 && Static92.anIntArrayArray23[local11][local53 - 1] == 0 && (local79[local11][local53 - 1] & 0x12C0102) == 0) {
				Static102.anIntArray396[local60] = local11;
				Static51.anIntArray194[local60] = local53 - 1;
				Static92.anIntArrayArray23[local11][local53 - 1] = 1;
				Static85.anIntArrayArray21[local11][local53 - 1] = local186;
				local60 = (local60 + 1) % local74;
			}
			if (local53 < 103 && Static92.anIntArrayArray23[local11][local53 + 1] == 0 && (local79[local11][local53 + 1] & 0x12C0120) == 0) {
				Static102.anIntArray396[local60] = local11;
				Static51.anIntArray194[local60] = local53 + 1;
				local60 = (local60 + 1) % local74;
				Static92.anIntArrayArray23[local11][local53 + 1] = 4;
				Static85.anIntArrayArray21[local11][local53 + 1] = local186;
			}
			if (local11 > 0 && local53 > 0 && Static92.anIntArrayArray23[local11 - 1][local53 - 1] == 0 && (local79[local11 - 1][local53 - 1] & 0x12C010E) == 0 && (local79[local11 - 1][local53] & 0x12C0108) == 0 && (local79[local11][local53 - 1] & 0x12C0102) == 0) {
				Static102.anIntArray396[local60] = local11 - 1;
				Static51.anIntArray194[local60] = local53 - 1;
				Static92.anIntArrayArray23[local11 - 1][local53 - 1] = 3;
				local60 = (local60 + 1) % local74;
				Static85.anIntArrayArray21[local11 - 1][local53 - 1] = local186;
			}
			if (local11 < 103 && local53 > 0 && Static92.anIntArrayArray23[local11 + 1][local53 - 1] == 0 && (local79[local11 + 1][local53 - 1] & 0x12C0183) == 0 && (local79[local11 + 1][local53] & 0x12C0180) == 0 && (local79[local11][local53 - 1] & 0x12C0102) == 0) {
				Static102.anIntArray396[local60] = local11 + 1;
				Static51.anIntArray194[local60] = local53 - 1;
				Static92.anIntArrayArray23[local11 + 1][local53 - 1] = 9;
				Static85.anIntArrayArray21[local11 + 1][local53 - 1] = local186;
				local60 = (local60 + 1) % local74;
			}
			if (local11 > 0 && local53 < 103 && Static92.anIntArrayArray23[local11 - 1][local53 + 1] == 0 && (local79[local11 - 1][local53 + 1] & 0x12C0138) == 0 && (local79[local11 - 1][local53] & 0x12C0108) == 0 && (local79[local11][local53 + 1] & 0x12C0120) == 0) {
				Static102.anIntArray396[local60] = local11 - 1;
				Static51.anIntArray194[local60] = local53 + 1;
				Static92.anIntArrayArray23[local11 - 1][local53 + 1] = 6;
				local60 = (local60 + 1) % local74;
				Static85.anIntArrayArray21[local11 - 1][local53 + 1] = local186;
			}
			if (local11 < 103 && local53 < 103 && Static92.anIntArrayArray23[local11 + 1][local53 + 1] == 0 && (local79[local11 + 1][local53 + 1] & 0x12C01E0) == 0 && (local79[local11 + 1][local53] & 0x12C0180) == 0 && (local79[local11][local53 + 1] & 0x12C0120) == 0) {
				Static102.anIntArray396[local60] = local11 + 1;
				Static51.anIntArray194[local60] = local53 + 1;
				Static92.anIntArrayArray23[local11 + 1][local53 + 1] = 12;
				Static85.anIntArrayArray21[local11 + 1][local53 + 1] = local186;
				local60 = (local60 + 1) % local74;
			}
		}
		Static127.anInt3137 = 0;
		@Pc(800) int local800;
		@Pc(805) int local805;
		@Pc(811) int local811;
		if (!local71) {
			if (!arg10) {
				return false;
			}
			local186 = 1000;
			local800 = 100;
			for (local805 = arg6 - 10; local805 <= arg6 + 10; local805++) {
				for (local811 = arg7 - 10; local811 <= arg7 + 10; local811++) {
					if (local805 >= 0 && local811 >= 0 && local805 < 104 && local811 < 104 && Static85.anIntArrayArray21[local805][local811] < 100) {
						@Pc(844) int local844 = 0;
						if (arg6 > local805) {
							local844 = arg6 - local805;
						} else if (arg6 + arg3 - 1 < local805) {
							local844 = local805 + 1 - arg6 - arg3;
						}
						@Pc(877) int local877 = 0;
						if (arg7 > local811) {
							local877 = arg7 - local811;
						} else if (local811 > arg9 + arg7 - 1) {
							local877 = local811 + 1 - arg9 - arg7;
						}
						@Pc(919) int local919 = local877 * local877 + local844 * local844;
						if (local186 > local919 || local919 == local186 && local800 > Static85.anIntArrayArray21[local805][local811]) {
							local53 = local811;
							local186 = local919;
							local800 = Static85.anIntArrayArray21[local805][local811];
							local11 = local805;
						}
					}
				}
			}
			if (local186 == 1000) {
				return false;
			}
			if (arg0 == local11 && arg4 == local53) {
				return false;
			}
			Static127.anInt3137 = 1;
		}
		@Pc(991) byte local991 = 0;
		Static102.anIntArray396[0] = local11;
		local64 = local991 + 1;
		Static51.anIntArray194[0] = local53;
		local186 = local800 = Static92.anIntArrayArray23[local11][local53];
		while (local11 != arg0 || local53 != arg4) {
			if (local800 != local186) {
				Static102.anIntArray396[local64] = local11;
				local800 = local186;
				Static51.anIntArray194[local64++] = local53;
			}
			if ((local186 & 0x1) != 0) {
				local53++;
			} else if ((local186 & 0x4) != 0) {
				local53--;
			}
			if ((local186 & 0x2) != 0) {
				local11++;
			} else if ((local186 & 0x8) != 0) {
				local11--;
			}
			local186 = Static92.anIntArrayArray23[local11][local53];
		}
		if (local64 > 0) {
			local74 = local64--;
			if (local74 > 25) {
				local74 = 25;
			}
			@Pc(1086) int local1086 = Static102.anIntArray396[local64];
			local805 = Static51.anIntArray194[local64];
			if (arg5 == 0) {
				Static103.aClass1_Sub18_Sub1_5.method2203(73);
				Static103.aClass1_Sub18_Sub1_5.method2168(local74 + local74 + 3);
			}
			if (arg5 == 1) {
				Static103.aClass1_Sub18_Sub1_5.method2203(192);
				Static103.aClass1_Sub18_Sub1_5.method2168(local74 + local74 + 14 + 3);
			}
			if (arg5 == 2) {
				Static103.aClass1_Sub18_Sub1_5.method2203(30);
				Static103.aClass1_Sub18_Sub1_5.method2168(local74 + local74 + 3);
			}
			Static103.aClass1_Sub18_Sub1_5.method2161(Static65.aBooleanArray8[82] ? 1 : 0);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static71.anInt1795 + local1086);
			Static35.anInt1069 = Static102.anIntArray396[0];
			Static32.anInt684 = Static51.anIntArray194[0];
			for (local811 = 1; local811 < local74; local811++) {
				local64--;
				Static103.aClass1_Sub18_Sub1_5.method2183(Static102.anIntArray396[local64] - local1086);
				Static103.aClass1_Sub18_Sub1_5.method2161(Static51.anIntArray194[local64] - local805);
			}
			Static103.aClass1_Sub18_Sub1_5.method2159(local805 + Static103.anInt2610);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!q;I)Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2) {
		return Static119.method2054(arg0, arg1, arg2) ? Static104.method1860() : null;
	}
}
