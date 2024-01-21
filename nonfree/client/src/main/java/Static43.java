import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_16;

	@OriginalMember(owner = "client!he", name = "Uc", descriptor = "Lclient!sf;")
	public static Class5 aClass5_38;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_724 = Static106.method1849("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Lclient!sc;")
	public static Class66 aClass66_725 = Static106.method1849("gr-Un:");

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	public static int anInt1336 = 2;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "[J")
	public static long[] aLongArray5 = new long[200];

	@OriginalMember(owner = "client!he", name = "Db", descriptor = "Lclient!sc;")
	public static Class66 aClass66_729 = Static106.method1849("Konfig geladen)3");

	@OriginalMember(owner = "client!he", name = "wc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_733 = Static106.method1849("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!he", name = "Dc", descriptor = "I")
	public static int anInt1378 = 1;

	@OriginalMember(owner = "client!he", name = "Ic", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!he", name = "bd", descriptor = "Lclient!sc;")
	private static Class66 aClass66_734 = Static106.method1849("No reply from loginserver)3");

	@OriginalMember(owner = "client!he", name = "cd", descriptor = "Lclient!sc;")
	public static Class66 aClass66_735 = aClass66_734;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method950() {
		for (@Pc(10) Class1_Sub1_Sub1_Sub2 local10 = (Class1_Sub1_Sub1_Sub2) Static112.aClass61_16.method1748(); local10 != null; local10 = (Class1_Sub1_Sub1_Sub2) Static112.aClass61_16.method1760()) {
			if (local10.anInt239 != Static22.anInt635 || local10.aBoolean12) {
				local10.method2050();
			} else if (local10.anInt234 <= Static22.anInt636) {
				local10.method165(Static130.anInt2924);
				if (local10.aBoolean12) {
					local10.method2050();
				} else {
					Static129.aClass9_1.method315(local10.anInt239, local10.anInt235, local10.anInt241, local10.anInt242, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
	public static void method955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static23.anInt683 == arg0 && Static20.anInt612 == arg4 && (arg3 == Static59.anInt1827 || !Static87.aBoolean96)) {
			return;
		}
		Static59.anInt1827 = arg3;
		Static23.anInt683 = arg0;
		if (!Static87.aBoolean96) {
			Static59.anInt1827 = 0;
		}
		Static20.anInt612 = arg4;
		Static18.method468(25);
		Static49.method1060(true, Static20.aClass66_371);
		@Pc(44) int local44 = Static48.anInt1496;
		Static48.anInt1496 = (arg0 - 6) * 8;
		@Pc(52) int local52 = Static52.anInt1603;
		@Pc(57) int local57 = Static48.anInt1496 - local44;
		Static52.anInt1603 = (arg4 - 6) * 8;
		@Pc(70) int local70 = Static52.anInt1603 - local52;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class1_Sub1_Sub1_Sub5_Sub1 local85 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray189[local89] -= local57;
					local85.anIntArray191[local89] -= local70;
				}
				local85.anInt1271 -= local70 * 128;
				local85.anInt1261 -= local57 * 128;
			}
		}
		for (@Pc(133) int local133 = 0; local133 < 2048; local133++) {
			@Pc(139) Class1_Sub1_Sub1_Sub5_Sub2 local139 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local133];
			if (local139 != null) {
				for (@Pc(143) int local143 = 0; local143 < 10; local143++) {
					local139.anIntArray189[local143] -= local57;
					local139.anIntArray191[local143] -= local70;
				}
				local139.anInt1271 -= local70 * 128;
				local139.anInt1261 -= local57 * 128;
			}
		}
		Static22.anInt635 = arg3;
		Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.method929(arg2, false, arg1);
		@Pc(197) byte local197 = 104;
		@Pc(199) byte local199 = 1;
		@Pc(201) byte local201 = 0;
		if (local57 < 0) {
			local201 = 103;
			local199 = -1;
			local197 = -1;
		}
		@Pc(214) byte local214 = 0;
		@Pc(216) byte local216 = 104;
		@Pc(218) byte local218 = 1;
		if (local70 < 0) {
			local216 = -1;
			local214 = 103;
			local218 = -1;
		}
		for (@Pc(231) int local231 = local201; local231 != local197; local231 += local199) {
			for (@Pc(235) int local235 = local214; local235 != local216; local235 += local218) {
				@Pc(241) int local241 = local235 + local70;
				@Pc(245) int local245 = local57 + local231;
				for (@Pc(247) int local247 = 0; local247 < 4; local247++) {
					if (local245 >= 0 && local241 >= 0 && local245 < 104 && local241 < 104) {
						Static101.aClass61ArrayArrayArray1[local247][local231][local235] = Static101.aClass61ArrayArrayArray1[local247][local245][local241];
					} else {
						Static101.aClass61ArrayArrayArray1[local247][local231][local235] = null;
					}
				}
			}
		}
		for (@Pc(316) Class1_Sub4 local316 = (Class1_Sub4) Static71.aClass61_12.method1748(); local316 != null; local316 = (Class1_Sub4) Static71.aClass61_12.method1760()) {
			local316.anInt437 -= local57;
			local316.anInt429 -= local70;
			if (local316.anInt437 < 0 || local316.anInt429 < 0 || local316.anInt437 >= 104 || local316.anInt429 >= 104) {
				local316.method2050();
			}
		}
		if (Static52.anInt1607 != 0) {
			Static13.anInt451 -= local70;
			Static52.anInt1607 -= local57;
		}
		Static44.anInt1408 = 0;
		Static49.anInt1516 = -1;
		Static109.aBoolean111 = false;
		Static112.aClass61_16.method1761();
		Static35.aClass61_8.method1761();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
	public static void method957() {
		aClass66_724 = null;
		aClass66_735 = null;
		aLongArray5 = null;
		aClass5_38 = null;
		aClass5_Sub1_16 = null;
		anIntArray198 = null;
		aClass66_734 = null;
		aClass66_733 = null;
		aClass66_729 = null;
		aClass66_725 = null;
	}
}
