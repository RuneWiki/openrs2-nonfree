import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_610 = Static120.method1824("Login server offline)3");

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "Lclient!rd;")
	public static Class80 aClass80_611 = aClass80_610;

	@OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
	public static int anInt1582 = 0;

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_612 = Static120.method1824(" (X");

	@OriginalMember(owner = "client!hh", name = "ib", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array12 = new Class80[1000];

	@OriginalMember(owner = "client!hh", name = "nb", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!hh", name = "pb", descriptor = "I")
	public static final int anInt1594 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!qf;I)I")
	public static int method1062(@OriginalArg(0) Class77 arg0) {
		@Pc(13) Class3_Sub11 local13 = (Class3_Sub11) Static51.aClass54_5.method1496(((long) arg0.anInt3237 << 32) + (long) arg0.anInt3258);
		return local13 == null ? arg0.anInt3219 : local13.anInt1537;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!rd;B)I")
	public static int method1063(@OriginalArg(0) Class80 arg0) {
		return arg0.method2462() + 1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)V")
	public static void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 > Static17.anInt440 || Static34.anInt790 > arg4) {
			return;
		}
		@Pc(37) boolean local37;
		if (arg3 < Static172.anInt3861) {
			arg3 = Static172.anInt3861;
			local37 = false;
		} else if (Static85.anInt1779 < arg3) {
			arg3 = Static85.anInt1779;
			local37 = false;
		} else {
			local37 = true;
		}
		@Pc(59) boolean local59;
		if (arg1 < Static172.anInt3861) {
			arg1 = Static172.anInt3861;
			local59 = false;
		} else if (arg1 <= Static85.anInt1779) {
			local59 = true;
		} else {
			arg1 = Static85.anInt1779;
			local59 = false;
		}
		if (Static34.anInt790 > arg2) {
			arg2 = Static34.anInt790;
		} else {
			Static46.method726(arg3, arg0, Static96.anIntArrayArray27[arg2++], arg1);
		}
		if (Static17.anInt440 >= arg4) {
			Static46.method726(arg3, arg0, Static96.anIntArrayArray27[arg4--], arg1);
		} else {
			arg4 = Static17.anInt440;
		}
		@Pc(113) int local113;
		if (local37 && local59) {
			for (local113 = arg2; local113 <= arg4; local113++) {
				@Pc(119) int[] local119 = Static96.anIntArrayArray27[local113];
				local119[arg3] = local119[arg1] = arg0;
			}
		} else if (local37) {
			for (local113 = arg2; local113 <= arg4; local113++) {
				Static96.anIntArrayArray27[local113][arg3] = arg0;
			}
		} else if (local59) {
			for (local113 = arg2; local113 <= arg4; local113++) {
				Static96.anIntArrayArray27[local113][arg1] = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[B)V")
	public static void method1065(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class3_Sub17 local6 = new Class3_Sub17(arg0);
		local6.anInt2923 = arg0.length - 2;
		Static64.anInt1391 = local6.method2111();
		Static27.anIntArray523 = new int[Static64.anInt1391];
		Static86.anIntArray220 = new int[Static64.anInt1391];
		Static17.anIntArray64 = new int[Static64.anInt1391];
		Static167.aByteArrayArray10 = new byte[Static64.anInt1391][];
		Static49.anIntArray152 = new int[Static64.anInt1391];
		local6.anInt2923 = arg0.length - Static64.anInt1391 * 8 - 7;
		Static147.anInt3287 = local6.method2111();
		Static175.anInt3951 = local6.method2111();
		@Pc(62) int local62 = (local6.method2107() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static64.anInt1391; local64++) {
			Static49.anIntArray152[local64] = local6.method2111();
		}
		for (@Pc(78) int local78 = 0; local78 < Static64.anInt1391; local78++) {
			Static17.anIntArray64[local78] = local6.method2111();
		}
		for (@Pc(96) int local96 = 0; local96 < Static64.anInt1391; local96++) {
			Static86.anIntArray220[local96] = local6.method2111();
		}
		for (@Pc(114) int local114 = 0; local114 < Static64.anInt1391; local114++) {
			Static27.anIntArray523[local114] = local6.method2111();
		}
		local6.anInt2923 = arg0.length - Static64.anInt1391 * 8 - (local62 + -1) * 3 - 7;
		Static101.anIntArray288 = new int[local62];
		for (@Pc(153) int local153 = 1; local153 < local62; local153++) {
			Static101.anIntArray288[local153] = local6.method2136();
			if (Static101.anIntArray288[local153] == 0) {
				Static101.anIntArray288[local153] = 1;
			}
		}
		local6.anInt2923 = 0;
		for (@Pc(190) int local190 = 0; local190 < Static64.anInt1391; local190++) {
			@Pc(196) int local196 = Static86.anIntArray220[local190];
			@Pc(200) int local200 = Static27.anIntArray523[local190];
			@Pc(204) int local204 = local196 * local200;
			@Pc(207) byte[] local207 = new byte[local204];
			Static167.aByteArrayArray10[local190] = local207;
			@Pc(215) int local215 = local6.method2107();
			@Pc(222) int local222;
			if (local215 == 0) {
				for (local222 = 0; local222 < local204; local222++) {
					local207[local222] = local6.method2123();
				}
			} else if (local215 == 1) {
				for (local222 = 0; local222 < local196; local222++) {
					for (@Pc(251) int local251 = 0; local251 < local200; local251++) {
						local207[local251 * local196 + local222] = local6.method2123();
					}
				}
			}
		}
	}
}
