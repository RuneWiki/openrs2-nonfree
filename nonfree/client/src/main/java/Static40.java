import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ib", name = "nc", descriptor = "I")
	public static int anInt2024;

	@OriginalMember(owner = "client!ib", name = "qc", descriptor = "I")
	public static int anInt2026;

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_706 = Static56.method1206("Your account is already logged in)3");

	@OriginalMember(owner = "client!ib", name = "wb", descriptor = "[I")
	public static int[] anIntArray280 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ib", name = "Hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_707 = Static56.method1206("Prepared sound engine");

	@OriginalMember(owner = "client!ib", name = "Nb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_709 = Static56.method1206("Importing music )2 ");

	@OriginalMember(owner = "client!ib", name = "bc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_710 = Static56.method1206("cross");

	@OriginalMember(owner = "client!ib", name = "pc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_711 = null;

	@OriginalMember(owner = "client!ib", name = "wc", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!ib", name = "yc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_712 = Static56.method1206("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ib", name = "zc", descriptor = "I")
	public static volatile int anInt2034 = -1;

	@OriginalMember(owner = "client!ib", name = "Ac", descriptor = "I")
	public static int anInt2035 = 0;

	@OriginalMember(owner = "client!ib", name = "Gc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_713 = Static56.method1206("backright2");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
	public static void method1272() {
		Static42.anImage4 = null;
		Static105.aGraphics2 = null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	public static int method1273() {
		@Pc(15) int local15 = 3;
		if (Static72.anInt1289 < 310) {
			@Pc(22) int local22 = Static44.anInt1595 >> 7;
			@Pc(27) int local27 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 >> 7;
			@Pc(31) int local31 = Static91.anInt2484 >> 7;
			if ((Static34.aByteArrayArrayArray17[Static58.anInt1945][local22][local31] & 0x4) != 0) {
				local15 = Static58.anInt1945;
			}
			@Pc(48) int local48 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 >> 7;
			@Pc(60) int local60;
			if (local22 >= local27) {
				local60 = local22 - local27;
			} else {
				local60 = local27 - local22;
			}
			@Pc(74) int local74;
			if (local48 <= local31) {
				local74 = local31 - local48;
			} else {
				local74 = local48 - local31;
			}
			@Pc(95) int local95;
			@Pc(89) int local89;
			if (local60 <= local74) {
				local89 = 32768;
				local95 = local60 * 65536 / local74;
				while (local31 != local48) {
					local89 += local95;
					if (local48 > local31) {
						local31++;
					} else if (local48 < local31) {
						local31--;
					}
					if ((Static34.aByteArrayArrayArray17[Static58.anInt1945][local22][local31] & 0x4) != 0) {
						local15 = Static58.anInt1945;
					}
					if (local89 >= 65536) {
						local89 -= 65536;
						if (local22 < local27) {
							local22++;
						} else if (local22 > local27) {
							local22--;
						}
						if ((Static34.aByteArrayArrayArray17[Static58.anInt1945][local22][local31] & 0x4) != 0) {
							local15 = Static58.anInt1945;
						}
					}
				}
			} else {
				local89 = 32768;
				local95 = local74 * 65536 / local60;
				while (local27 != local22) {
					local89 += local95;
					if (local22 < local27) {
						local22++;
					} else if (local27 < local22) {
						local22--;
					}
					if ((Static34.aByteArrayArrayArray17[Static58.anInt1945][local22][local31] & 0x4) != 0) {
						local15 = Static58.anInt1945;
					}
					if (local89 >= 65536) {
						if (local31 < local48) {
							local31++;
						} else if (local31 > local48) {
							local31--;
						}
						if ((Static34.aByteArrayArrayArray17[Static58.anInt1945][local22][local31] & 0x4) != 0) {
							local15 = Static58.anInt1945;
						}
						local89 -= 65536;
					}
				}
			}
		}
		if ((Static34.aByteArrayArrayArray17[Static58.anInt1945][Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 >> 7][Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 >> 7] & 0x4) != 0) {
			local15 = Static58.anInt1945;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class2_Sub1_Sub5 method1274(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub5 local6 = (Class2_Sub1_Sub5) Static30.aClass17_50.method786((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static28.aClass11_7.method338(4, arg0);
		local6 = new Class2_Sub1_Sub5();
		if (local20 != null) {
			local6.method839(new Class2_Sub6(local20), arg0);
		}
		local6.method842();
		Static30.aClass17_50.method783(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
	public static void method1275() {
		aClass31_709 = null;
		aClass31_706 = null;
		aClass31_711 = null;
		aClass31_710 = null;
		aClass31_707 = null;
		aClass31_713 = null;
		anIntArray280 = null;
		aClass31_712 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!bb;)Z")
	public static boolean method1276(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		if (arg0.anIntArray45 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray45.length; local20++) {
			@Pc(27) int local27 = Static16.method515(local20, arg0);
			@Pc(32) int local32 = arg0.anIntArray42[local20];
			if (arg0.anIntArray45[local20] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray45[local20] == 3) {
				if (local32 >= local27) {
					return false;
				}
			} else if (arg0.anIntArray45[local20] == 4) {
				if (local27 == local32) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Z")
	public static boolean method1277(@OriginalArg(1) int arg0) {
		if (Static57.aBooleanArray56[arg0]) {
			return true;
		} else if (Static58.aClass11_10.method335(arg0)) {
			@Pc(23) int local23 = Static58.aClass11_10.method325(arg0);
			if (local23 == 0) {
				Static57.aBooleanArray56[arg0] = true;
				return true;
			}
			if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] == null) {
				Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] = new Class2_Sub1_Sub2[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static58.aClass11_10.method338(arg0, local45);
					if (local59 != null) {
						Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local45] = new Class2_Sub1_Sub2();
						Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local45].method183(new Class2_Sub6(local59));
					}
				}
			}
			Static57.aBooleanArray56[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
