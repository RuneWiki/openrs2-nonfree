import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lclient!p;")
	public static Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
	public static int anInt1212 = 0;

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
	public static int anInt1213 = 0;

	@OriginalMember(owner = "client!ef", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_747 = Static107.method1838("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIB)V")
	public static void method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static179.anInt4042; local7++) {
			if (arg1 < Static27.anIntArray264[local7] + Static90.anIntArray221[local7] && arg1 + arg0 > Static27.anIntArray264[local7] && arg2 < Static91.anIntArray223[local7] + Static101.anIntArray29[local7] && arg3 + arg2 > Static101.anIntArray29[local7]) {
				Static59.aBooleanArray11[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Z")
	public static boolean method875(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[B)V")
	public static void method876(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub2 local10 = new Class2_Sub2(arg0);
		local10.anInt2385 = arg0.length - 2;
		Static90.anInt2315 = local10.method1680();
		Static171.anIntArray359 = new int[Static90.anInt2315];
		Static59.anIntArray135 = new int[Static90.anInt2315];
		Static81.aByteArrayArray5 = new byte[Static90.anInt2315][];
		Static147.anIntArray314 = new int[Static90.anInt2315];
		Static171.anIntArray358 = new int[Static90.anInt2315];
		local10.anInt2385 = arg0.length - Static90.anInt2315 * 8 - 7;
		Static28.anInt862 = local10.method1680();
		Static138.anInt3159 = local10.method1680();
		@Pc(71) int local71 = (local10.method1698() & 0xFF) + 1;
		for (@Pc(73) int local73 = 0; local73 < Static90.anInt2315; local73++) {
			Static147.anIntArray314[local73] = local10.method1680();
		}
		for (@Pc(87) int local87 = 0; local87 < Static90.anInt2315; local87++) {
			Static59.anIntArray135[local87] = local10.method1680();
		}
		for (@Pc(101) int local101 = 0; local101 < Static90.anInt2315; local101++) {
			Static171.anIntArray359[local101] = local10.method1680();
		}
		for (@Pc(115) int local115 = 0; local115 < Static90.anInt2315; local115++) {
			Static171.anIntArray358[local115] = local10.method1680();
		}
		local10.anInt2385 = arg0.length - (local71 - 1) * 3 - Static90.anInt2315 * 8 - 7;
		Static101.anIntArray31 = new int[local71];
		for (@Pc(150) int local150 = 1; local150 < local71; local150++) {
			Static101.anIntArray31[local150] = local10.method1654();
			if (Static101.anIntArray31[local150] == 0) {
				Static101.anIntArray31[local150] = 1;
			}
		}
		local10.anInt2385 = 0;
		for (@Pc(179) int local179 = 0; local179 < Static90.anInt2315; local179++) {
			@Pc(185) int local185 = Static171.anIntArray359[local179];
			@Pc(189) int local189 = Static171.anIntArray358[local179];
			@Pc(193) int local193 = local189 * local185;
			@Pc(196) byte[] local196 = new byte[local193];
			Static81.aByteArrayArray5[local179] = local196;
			@Pc(204) int local204 = local10.method1698();
			@Pc(208) int local208;
			if (local204 == 0) {
				for (local208 = 0; local208 < local193; local208++) {
					local196[local208] = local10.method1707();
				}
			} else if (local204 == 1) {
				for (local208 = 0; local208 < local185; local208++) {
					for (@Pc(231) int local231 = 0; local231 < local189; local231++) {
						local196[local185 * local231 + local208] = local10.method1707();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public static void method877() {
		aClass28_747 = null;
		aClass59_1 = null;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(BI)Lclient!dc;")
	public static Class2_Sub4_Sub5 method878(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub4_Sub5 local18 = (Class2_Sub4_Sub5) Static3.aClass14_124.method603((long) arg0);
		if (local18 != null) {
			return local18;
		}
		local18 = Static50.method938(arg0, Static85.aClass40_23, Static24.aClass40_10);
		if (local18 != null) {
			Static3.aClass14_124.method607((long) arg0, local18);
		}
		return local18;
	}
}
