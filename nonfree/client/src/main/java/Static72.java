import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt1289;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
	public static int[] anIntArray168 = new int[5];

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!pd;")
	public static Class2_Sub6 aClass2_Sub6_3 = new Class2_Sub6(new byte[5000]);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_442 = Static56.method1206("Loading config )2 ");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kc;Lclient!kc;ILclient!kc;)V")
	public static void method859(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static98.aClass11_8 = arg1;
		Static3.aClass11_3 = arg2;
		Static58.aClass11_10 = arg0;
		Static89.aClass2_Sub1_Sub2ArrayArray1 = new Class2_Sub1_Sub2[Static58.aClass11_10.method350()][];
		Static57.aBooleanArray56 = new boolean[Static58.aClass11_10.method350()];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method860() {
		for (@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) Static62.aClass36_5.method1365(); local15 != null; local15 = (Class2_Sub3) Static62.aClass36_5.method1361()) {
			if (local15.anInt360 > 0) {
				local15.anInt360--;
			}
			if (local15.anInt360 != 0) {
				if (local15.anInt371 > 0) {
					local15.anInt371--;
				}
				if (local15.anInt371 == 0 && local15.anInt355 >= 1 && local15.anInt363 >= 1 && local15.anInt355 <= 102 && local15.anInt363 <= 102 && (local15.anInt358 < 0 || Static23.method700(local15.anInt358, local15.anInt354))) {
					Static80.method676(local15.anInt359, local15.anInt354, local15.anInt355, local15.anInt363, local15.anInt356, local15.anInt368, local15.anInt358);
					local15.anInt371 = -1;
					if (local15.anInt364 == local15.anInt358 && local15.anInt364 == -1) {
						local15.method1695();
					} else if (local15.anInt364 == local15.anInt358 && local15.anInt359 == local15.anInt367 && local15.anInt354 == local15.anInt361) {
						local15.method1695();
					}
				}
			} else if (local15.anInt364 < 0 || Static23.method700(local15.anInt364, local15.anInt361)) {
				Static80.method676(local15.anInt367, local15.anInt361, local15.anInt355, local15.anInt363, local15.anInt356, local15.anInt368, local15.anInt364);
				local15.method1695();
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static void method862() {
		aClass31_442 = null;
		anIntArray168 = null;
		aClass2_Sub6_3 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!sb;")
	public static Class2_Sub1_Sub12 method864(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub12 local10 = (Class2_Sub1_Sub12) Static38.aClass17_58.method786((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static89.aClass11_19.method338(3, arg0);
		local10 = new Class2_Sub1_Sub12();
		if (local20 != null) {
			local10.method1520(new Class2_Sub6(local20));
		}
		Static38.aClass17_58.method783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	public static boolean method865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static80.anIntArrayArray26[local3][local7] = 0;
				Static61.anIntArrayArray58[local3][local7] = 99999999;
			}
		}
		Static80.anIntArrayArray26[arg7][arg6] = 99;
		Static61.anIntArrayArray58[arg7][arg6] = 0;
		local7 = arg7;
		@Pc(51) byte local51 = 0;
		@Pc(53) int local53 = arg6;
		Static60.anIntArray288[0] = arg7;
		@Pc(60) int local60 = local51 + 1;
		Static96.anIntArray370[0] = arg6;
		@Pc(64) boolean local64 = false;
		@Pc(67) int local67 = Static60.anIntArray288.length;
		@Pc(69) int local69 = 0;
		@Pc(74) int[][] local74 = Static77.aClass60Array1[Static58.anInt1945].anIntArrayArray69;
		@Pc(184) int local184;
		while (local60 != local69) {
			local53 = Static96.anIntArray370[local69];
			local7 = Static60.anIntArray288[local69];
			local69 = (local69 + 1) % local67;
			if (arg10 == local7 && arg8 == local53) {
				local64 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static77.aClass60Array1[Static58.anInt1945].method1732(arg0 - 1, arg10, arg8, arg1, local53, local7)) {
					local64 = true;
					break;
				}
				if (arg0 < 10 && Static77.aClass60Array1[Static58.anInt1945].method1723(arg1, arg10, local53, local7, arg8, arg0 - 1)) {
					local64 = true;
					break;
				}
			}
			if (arg5 != 0 && arg4 != 0 && Static77.aClass60Array1[Static58.anInt1945].method1724(arg10, arg8, arg3, local7, arg5, arg4, local53)) {
				local64 = true;
				break;
			}
			local184 = Static61.anIntArrayArray58[local7][local53] + 1;
			if (local7 > 0 && Static80.anIntArrayArray26[local7 - 1][local53] == 0 && (local74[local7 - 1][local53] & 0x1280108) == 0) {
				Static60.anIntArray288[local60] = local7 - 1;
				Static96.anIntArray370[local60] = local53;
				Static80.anIntArrayArray26[local7 - 1][local53] = 2;
				local60 = (local60 + 1) % local67;
				Static61.anIntArrayArray58[local7 - 1][local53] = local184;
			}
			if (local7 < 103 && Static80.anIntArrayArray26[local7 + 1][local53] == 0 && (local74[local7 + 1][local53] & 0x1280180) == 0) {
				Static60.anIntArray288[local60] = local7 + 1;
				Static96.anIntArray370[local60] = local53;
				local60 = (local60 + 1) % local67;
				Static80.anIntArrayArray26[local7 + 1][local53] = 8;
				Static61.anIntArrayArray58[local7 + 1][local53] = local184;
			}
			if (local53 > 0 && Static80.anIntArrayArray26[local7][local53 - 1] == 0 && (local74[local7][local53 - 1] & 0x1280102) == 0) {
				Static60.anIntArray288[local60] = local7;
				Static96.anIntArray370[local60] = local53 - 1;
				local60 = (local60 + 1) % local67;
				Static80.anIntArrayArray26[local7][local53 - 1] = 1;
				Static61.anIntArrayArray58[local7][local53 - 1] = local184;
			}
			if (local53 < 103 && Static80.anIntArrayArray26[local7][local53 + 1] == 0 && (local74[local7][local53 + 1] & 0x1280120) == 0) {
				Static60.anIntArray288[local60] = local7;
				Static96.anIntArray370[local60] = local53 + 1;
				local60 = (local60 + 1) % local67;
				Static80.anIntArrayArray26[local7][local53 + 1] = 4;
				Static61.anIntArrayArray58[local7][local53 + 1] = local184;
			}
			if (local7 > 0 && local53 > 0 && Static80.anIntArrayArray26[local7 - 1][local53 - 1] == 0 && (local74[local7 - 1][local53 - 1] & 0x128010E) == 0 && (local74[local7 - 1][local53] & 0x1280108) == 0 && (local74[local7][local53 - 1] & 0x1280102) == 0) {
				Static60.anIntArray288[local60] = local7 - 1;
				Static96.anIntArray370[local60] = local53 - 1;
				local60 = (local60 + 1) % local67;
				Static80.anIntArrayArray26[local7 - 1][local53 - 1] = 3;
				Static61.anIntArrayArray58[local7 - 1][local53 - 1] = local184;
			}
			if (local7 < 103 && local53 > 0 && Static80.anIntArrayArray26[local7 + 1][local53 - 1] == 0 && (local74[local7 + 1][local53 - 1] & 0x1280183) == 0 && (local74[local7 + 1][local53] & 0x1280180) == 0 && (local74[local7][local53 - 1] & 0x1280102) == 0) {
				Static60.anIntArray288[local60] = local7 + 1;
				Static96.anIntArray370[local60] = local53 - 1;
				local60 = (local60 + 1) % local67;
				Static80.anIntArrayArray26[local7 + 1][local53 - 1] = 9;
				Static61.anIntArrayArray58[local7 + 1][local53 - 1] = local184;
			}
			if (local7 > 0 && local53 < 103 && Static80.anIntArrayArray26[local7 - 1][local53 + 1] == 0 && (local74[local7 - 1][local53 + 1] & 0x1280138) == 0 && (local74[local7 - 1][local53] & 0x1280108) == 0 && (local74[local7][local53 + 1] & 0x1280120) == 0) {
				Static60.anIntArray288[local60] = local7 - 1;
				Static96.anIntArray370[local60] = local53 + 1;
				local60 = (local60 + 1) % local67;
				Static80.anIntArrayArray26[local7 - 1][local53 + 1] = 6;
				Static61.anIntArrayArray58[local7 - 1][local53 + 1] = local184;
			}
			if (local7 < 103 && local53 < 103 && Static80.anIntArrayArray26[local7 + 1][local53 + 1] == 0 && (local74[local7 + 1][local53 + 1] & 0x12801E0) == 0 && (local74[local7 + 1][local53] & 0x1280180) == 0 && (local74[local7][local53 + 1] & 0x1280120) == 0) {
				Static60.anIntArray288[local60] = local7 + 1;
				Static96.anIntArray370[local60] = local53 + 1;
				Static80.anIntArrayArray26[local7 + 1][local53 + 1] = 12;
				local60 = (local60 + 1) % local67;
				Static61.anIntArrayArray58[local7 + 1][local53 + 1] = local184;
			}
		}
		Static34.anInt1316 = 0;
		@Pc(804) int local804;
		@Pc(811) int local811;
		@Pc(818) int local818;
		if (!local64) {
			if (!arg2) {
				return false;
			}
			local184 = 1000;
			local804 = 100;
			for (local811 = arg10 - 10; local811 <= arg10 + 10; local811++) {
				for (local818 = arg8 - 10; local818 <= arg8 + 10; local818++) {
					if (local811 >= 0 && local818 >= 0 && local811 < 104 && local818 < 104 && Static61.anIntArrayArray58[local811][local818] < 100) {
						@Pc(847) int local847 = 0;
						@Pc(849) int local849 = 0;
						if (arg8 > local818) {
							local849 = arg8 - local818;
						} else if (arg8 + arg4 - 1 < local818) {
							local849 = local818 + 1 - arg4 - arg8;
						}
						if (arg10 > local811) {
							local847 = arg10 - local811;
						} else if (arg10 + arg5 - 1 < local811) {
							local847 = local811 + 1 - arg5 - arg10;
						}
						@Pc(915) int local915 = local847 * local847 + local849 * local849;
						if (local184 > local915 || local915 == local184 && local804 > Static61.anIntArrayArray58[local811][local818]) {
							local804 = Static61.anIntArrayArray58[local811][local818];
							local184 = local915;
							local7 = local811;
							local53 = local818;
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (arg7 == local7 && local53 == arg6) {
				return false;
			}
			Static34.anInt1316 = 1;
		}
		@Pc(991) byte local991 = 0;
		Static60.anIntArray288[0] = local7;
		local69 = local991 + 1;
		Static96.anIntArray370[0] = local53;
		local184 = local804 = Static80.anIntArrayArray26[local7][local53];
		while (arg7 != local7 || arg6 != local53) {
			if (local184 != local804) {
				Static60.anIntArray288[local69] = local7;
				Static96.anIntArray370[local69++] = local53;
				local804 = local184;
			}
			if ((local184 & 0x1) != 0) {
				local53++;
			} else if ((local184 & 0x4) != 0) {
				local53--;
			}
			if ((local184 & 0x2) != 0) {
				local7++;
			} else if ((local184 & 0x8) != 0) {
				local7--;
			}
			local184 = Static80.anIntArrayArray26[local7][local53];
		}
		if (local69 > 0) {
			local67 = local69--;
			if (local67 > 25) {
				local67 = 25;
			}
			local811 = Static96.anIntArray370[local69];
			@Pc(1097) int local1097 = Static60.anIntArray288[local69];
			if (arg9 == 0) {
				Static20.aClass2_Sub6_Sub1_11.method684(130);
				Static20.aClass2_Sub6_Sub1_11.method637(local67 + local67 + 3);
			}
			if (arg9 == 1) {
				Static20.aClass2_Sub6_Sub1_11.method684(136);
				Static20.aClass2_Sub6_Sub1_11.method637(local67 + local67 + 14 + 3);
			}
			if (arg9 == 2) {
				Static20.aClass2_Sub6_Sub1_11.method684(89);
				Static20.aClass2_Sub6_Sub1_11.method637(local67 + local67 + 3);
			}
			Static20.aClass2_Sub6_Sub1_11.method643(Static103.aBooleanArray57[82] ? 1 : 0);
			Static20.aClass2_Sub6_Sub1_11.method658(Static25.anInt1103 + local1097);
			Static20.aClass2_Sub6_Sub1_11.method638(Static47.anInt1730 + local811);
			Static85.anInt2509 = Static60.anIntArray288[0];
			Static8.anInt302 = Static96.anIntArray370[0];
			for (local818 = 1; local818 < local67; local818++) {
				local69--;
				Static20.aClass2_Sub6_Sub1_11.method643(Static60.anIntArray288[local69] - local1097);
				Static20.aClass2_Sub6_Sub1_11.method631(Static96.anIntArray370[local69] - local811);
			}
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
