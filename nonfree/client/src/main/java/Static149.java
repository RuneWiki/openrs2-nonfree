import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	public static int anInt6259;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Lclient!no;")
	public static Class173 aClass173_5;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
	public static int anInt6254 = 0;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray35 = new boolean[8];

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIII)V")
	public static void method5441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(14) int local14 = arg4 - arg1;
		if (local9 == 0) {
			if (local14 != 0) {
				Static135.method3218(arg3, arg0, arg4, arg1);
			}
		} else if (local14 == 0) {
			Static9.method194(arg2, arg3, arg1, arg0);
		} else {
			@Pc(40) int local40 = (local14 << 12) / local9;
			@Pc(49) int local49 = arg1 - (arg0 * local40 >> 12);
			@Pc(54) int local54;
			@Pc(62) int local62;
			if (Static243.anInt4326 > arg0) {
				local54 = Static243.anInt4326;
				local62 = local49 + (Static243.anInt4326 * local40 >> 12);
			} else if (Static235.anInt4193 >= arg0) {
				local54 = arg0;
				local62 = arg1;
			} else {
				local54 = Static235.anInt4193;
				local62 = local49 + (Static235.anInt4193 * local40 >> 12);
			}
			@Pc(100) int local100;
			@Pc(98) int local98;
			if (arg2 < Static243.anInt4326) {
				local98 = local49 + (local40 * Static243.anInt4326 >> 12);
				local100 = Static243.anInt4326;
			} else if (arg2 <= Static235.anInt4193) {
				local100 = arg2;
				local98 = arg4;
			} else {
				local100 = Static235.anInt4193;
				local98 = (Static235.anInt4193 * local40 >> 12) + local49;
			}
			if (Static138.anInt932 > local62) {
				local62 = Static138.anInt932;
				local54 = (Static138.anInt932 - local49 << 12) / local40;
			} else if (Static40.anInt818 < local62) {
				local62 = Static40.anInt818;
				local54 = (Static40.anInt818 - local49 << 12) / local40;
			}
			if (local98 < Static138.anInt932) {
				local98 = Static138.anInt932;
				local100 = (Static138.anInt932 - local49 << 12) / local40;
			} else if (local98 > Static40.anInt818) {
				local98 = Static40.anInt818;
				local100 = (Static40.anInt818 - local49 << 12) / local40;
			}
			Static109.method2272(local62, local98, arg3, local54, local100);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIIILclient!vc;)V")
	public static void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class63 arg7) {
		@Pc(11) Interface2 local11 = (Interface2) Static368.method4614(arg0, arg2, arg3);
		@Pc(22) Class172 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(47) int local47;
		if (local11 != null) {
			local22 = Static221.aClass118_6.method2858(local11.method5651());
			local28 = local11.method5650() & 0x3;
			local32 = local11.method5654();
			if (local22.anInt4116 == -1) {
				local47 = arg5;
				if (local22.anInt4140 > 0) {
					local47 = arg4;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg7.method1999(4, local47, arg1, arg6);
					} else if (local28 == 1) {
						arg7.method1954(4, arg1, arg6, local47);
					} else if (local28 == 2) {
						arg7.method1999(4, local47, arg1, arg6 + 3);
					} else if (local28 == 3) {
						arg7.method1954(4, arg1 + 3, arg6, local47);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg7.method1951(arg1, 1, 1, local47, arg6);
					} else if (local28 == 1) {
						arg7.method1951(arg1, 1, 1, local47, arg6 + 3);
					} else if (local28 == 2) {
						arg7.method1951(arg1 + 3, 1, 1, local47, arg6 + 3);
					} else if (local28 == 3) {
						arg7.method1951(arg1 + 3, 1, 1, local47, arg6);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg7.method1954(4, arg1, arg6, local47);
					} else if (local28 == 1) {
						arg7.method1999(4, local47, arg1, arg6 + 3);
					} else if (local28 == 2) {
						arg7.method1954(4, arg1 + 3, arg6, local47);
					} else if (local28 == 3) {
						arg7.method1999(4, local47, arg1, arg6);
					}
				}
			} else {
				Static203.method3449(local28, arg1, local22, arg6, arg7);
			}
		}
		local11 = (Interface2) Static292.method4418(arg0, arg2, arg3, dc.class);
		if (local11 != null) {
			local22 = Static221.aClass118_6.method2858(local11.method5651());
			local28 = local11.method5650() & 0x3;
			local32 = local11.method5654();
			if (local22.anInt4116 != -1) {
				Static203.method3449(local28, arg1, local22, arg6, arg7);
			} else if (local32 == 9) {
				local47 = -1118482;
				if (local22.anInt4140 > 0) {
					local47 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg7.method1985(arg1 + 3, arg1, local47, arg6, arg6 + 3);
				} else {
					arg7.method1985(arg1, arg1 + 3, local47, arg6, arg6 + 3);
				}
			}
		}
		local11 = (Interface2) Static102.method2138(arg0, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local22 = Static221.aClass118_6.method2858(local11.method5651());
		local28 = local11.method5650() & 0x3;
		if (local22.anInt4116 != -1) {
			Static203.method3449(local28, arg1, local22, arg6, arg7);
			return;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
	public static void method5444() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static246.aClass251ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static246.aClass251ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static12.anInt312; local6++) {
					for (local9 = 0; local9 < Static341.anInt5833; local9++) {
						if (Static246.aClass251ArrayArrayArray3[local3][local6][local9] != null) {
							Static246.aClass251ArrayArrayArray3[local3][local6][local9].method5661();
						}
						Static246.aClass251ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static246.aClass251ArrayArrayArray3 = null;
		Static90.aClass107Array1 = null;
		if (Static232.aClass251ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static232.aClass251ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static12.anInt312; local6++) {
					for (local9 = 0; local9 < Static341.anInt5833; local9++) {
						if (Static232.aClass251ArrayArrayArray2[local3][local6][local9] != null) {
							Static232.aClass251ArrayArrayArray2[local3][local6][local9].method5661();
						}
						Static232.aClass251ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static232.aClass251ArrayArrayArray2 = null;
		Static94.aClass107Array2 = null;
		Static64.aClass251ArrayArrayArray1 = null;
		Static350.aClass107Array4 = null;
		Static168.anInt3222 = 0;
		if (Static209.aClass227Array1 != null) {
			for (local3 = 0; local3 < Static168.anInt3222; local3++) {
				Static209.aClass227Array1[local3] = null;
			}
		}
		if (Static377.aClass1_Sub5Array5 != null) {
			for (local3 = 0; local3 < Static167.anInt5330; local3++) {
				Static377.aClass1_Sub5Array5[local3] = null;
			}
			Static167.anInt5330 = 0;
		}
		if (Static386.aClass2_Sub17_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static104.anInt2157; local3++) {
				Static386.aClass2_Sub17_Sub1Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static12.anInt311; local6++) {
				for (local9 = 0; local9 < Static12.anInt312; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static341.anInt5833; local160++) {
						Static223.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static104.anInt2157 = 0;
		}
		Static85.anIntArrayArrayArray2 = null;
		Static161.method2879();
		Static200.aClass154_6.method3488();
		Static324.aByteArrayArray17 = null;
		Static68.anIntArrayArray13 = null;
		Static367.aByteArrayArray19 = null;
		Static305.aClass29_1 = null;
		Static347.aClass44_4 = null;
		Static350.aClass63_8 = null;
	}
}
