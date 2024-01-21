import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!ff;")
	public static Class11 aClass11_29;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_665 = Static2.method59(": ");

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "Lclient!wd;")
	private static Class80 aClass80_668 = Static2.method59("Walk here");

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_666 = aClass80_668;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!of;")
	public static Class58 aClass58_8 = new Class58();

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public static final int anInt1810 = 3353893;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Lclient!wd;")
	private static Class80 aClass80_667 = Static2.method59("Public chat");

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "Lclient!wd;")
	public static Class80 aClass80_669 = aClass80_667;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!wd;")
	public static Class80 aClass80_670 = Static2.method59(")3");

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "Lclient!wd;")
	public static Class80 aClass80_671 = Static2.method59("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!wd;")
	private static Class80 aClass80_672 = Static2.method59("wave2:");

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_673 = aClass80_672;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_674 = aClass80_672;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_675 = Static2.method59("logo");

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	public static void method1071() {
		Static36.aClass32_21.method878();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII[Lclient!va;)V")
	public static void method1072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub1_Sub17[] arg9) {
		for (@Pc(3) int local3 = 0; local3 < arg9.length; local3++) {
			@Pc(9) Class2_Sub1_Sub17 local9 = arg9[local3];
			if (local9 != null && (local9.anInt3038 == 0 || local9.aBoolean234) && local9 != null && arg3 == local9.anInt3008 && !Static68.method1116(local9)) {
				@Pc(40) int local40 = arg6 + local9.anInt3037 - arg5;
				@Pc(45) int local45 = local40 + local9.anInt3024;
				@Pc(56) int local56 = local40 > arg6 ? local40 : arg6;
				@Pc(67) int local67 = arg2 <= local45 ? arg2 : local45;
				@Pc(75) int local75 = local9.anInt3012 + arg0 - arg7;
				@Pc(82) int local82 = local75 <= arg0 ? arg0 : local75;
				@Pc(87) int local87 = local9.anInt3020 + local75;
				@Pc(94) int local94 = arg8 > local87 ? local87 : arg8;
				if (local9.anInt3038 == 0) {
					method1072(local82, arg1, local67, local9.anInt3022, arg4, local56 + local9.anInt3015 - local40, local56, local9.anInt3055 + local82 - local75, local94, arg9);
					if (local9.aClass2_Sub1_Sub17Array2 != null) {
						method1072(local82, arg1, local67, local9.anInt3022, arg4, local56 + local9.anInt3015 - local40, local56, local9.anInt3055 + local82 - local75, local94, local9.aClass2_Sub1_Sub17Array2);
					}
				}
				if (local9.aBoolean234) {
					@Pc(178) boolean local178;
					if (local82 <= Static93.anInt2398 && Static95.anInt2430 >= local56 && Static93.anInt2398 < local94 && local67 > Static95.anInt2430) {
						local178 = true;
					} else {
						local178 = false;
					}
					@Pc(184) boolean local184 = false;
					if (Static120.anInt3078 == 1 && local178) {
						local184 = true;
					}
					@Pc(193) boolean local193 = false;
					if (Static20.anInt906 == 1 && local82 <= Static13.anInt365 && Static108.anInt2880 >= local56 && Static13.anInt365 < local94 && local67 > Static108.anInt2880) {
						local193 = true;
					}
					if (local193 && Static68.aClass2_Sub1_Sub17_5 == null && (arg1 & 0x200) != 0 && !Static122.aBoolean241 && Static123.method1975(local9) != null) {
						Static96.aBoolean181 = false;
						Static49.anInt1515 = Static108.anInt2880 - local56;
						Static114.anInt2939 = arg4;
						Static80.anInt2030 = Static13.anInt365 - local82;
						Static68.aClass2_Sub1_Sub17_5 = local9;
						Static48.anInt1506 = 0;
					}
					if (Static68.aClass2_Sub1_Sub17_5 != null || Static122.aBoolean241) {
						local178 = false;
						local193 = false;
						local184 = false;
					}
					if (!local9.aBoolean227 && local193 && (arg1 & 0x1) != 0) {
						local9.aBoolean227 = true;
						if (local9.anObjectArray6 != null) {
							Static40.method667(local9.anObjectArray6, null, 0, Static108.anInt2880 - local40, -local75 + Static13.anInt365, local9);
						}
					}
					if (local9.aBoolean227 && local184 && (arg1 & 0x4) != 0 && local9.anObjectArray11 != null) {
						Static40.method667(local9.anObjectArray11, null, 0, Static95.anInt2430 - local40, Static93.anInt2398 + -local75, local9);
					}
					if (local9.aBoolean227 && !local184 && (arg1 & 0x2) != 0) {
						local9.aBoolean227 = false;
						if (local9.anObjectArray7 != null) {
							Static40.method667(local9.anObjectArray7, null, 0, Static95.anInt2430 - local40, Static93.anInt2398 + -local75, local9);
						}
					}
					if (local184 && (arg1 & 0x8) != 0 && local9.anObjectArray15 != null) {
						Static40.method667(local9.anObjectArray15, null, 0, Static95.anInt2430 - local40, Static93.anInt2398 - local75, local9);
					}
					if (!local9.aBoolean231 && local178 && (arg1 & 0x10) != 0) {
						local9.aBoolean231 = true;
						if (local9.anObjectArray12 != null) {
							Static40.method667(local9.anObjectArray12, null, 0, Static95.anInt2430 - local40, -local75 + Static93.anInt2398, local9);
						}
					}
					if (local9.aBoolean231 && local178 && (arg1 & 0x40) != 0 && local9.anObjectArray20 != null) {
						Static40.method667(local9.anObjectArray20, null, 0, Static95.anInt2430 - local40, -local75 + Static93.anInt2398, local9);
					}
					if (local9.aBoolean231 && !local178 && (arg1 & 0x20) != 0) {
						local9.aBoolean231 = false;
						if (local9.anObjectArray17 != null) {
							Static40.method667(local9.anObjectArray17, null, 0, Static95.anInt2430 - local40, -local75 + Static93.anInt2398, local9);
						}
					}
					if (local9.anObjectArray8 != null && (arg1 & 0x80) != 0) {
						Static40.method667(local9.anObjectArray8, null, 0, 0, 0, local9);
					}
					if (local178 && Static91.anInt2248 != 0 && local9.anObjectArray21 != null && (arg1 & 0x400) != 0) {
						Static40.method667(local9.anObjectArray21, null, 0, Static91.anInt2248, 0, local9);
					}
					if ((arg1 & 0x100) != 0) {
						if (Static106.anInt2836 > local9.anInt3070 && local9.anObjectArray4 != null) {
							Static40.method667(local9.anObjectArray4, null, 0, 0, 0, local9);
						}
						if (Static36.anInt1184 > local9.anInt3070 && local9.anObjectArray10 != null) {
							Static40.method667(local9.anObjectArray10, null, 0, 0, 0, local9);
						}
						if (Static97.anInt2557 > local9.anInt3070 && local9.anObjectArray19 != null) {
							Static40.method667(local9.anObjectArray19, null, 0, 0, 0, local9);
						}
						local9.anInt3070 = Static10.anInt300;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pd;Lclient!ff;Lclient!ff;Lclient!ff;I)Z")
	public static boolean method1073(@OriginalArg(0) Class2_Sub2_Sub3 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class11 arg3) {
		Static17.aClass11_13 = arg2;
		Static44.aClass2_Sub2_Sub3_2 = arg0;
		Static37.aClass11_21 = arg3;
		Static119.aClass11_25 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!wb;Lclient!ue;I)V")
	public static void method1075(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1, @OriginalArg(2) Class74 arg2) {
		@Pc(5) Class2_Sub8 local5 = new Class2_Sub8();
		local5.anInt1845 = arg1.method1780();
		local5.anInt1847 = arg1.method1747();
		local5.anIntArray229 = new int[local5.anInt1845];
		local5.aByteArrayArrayArray4 = new byte[local5.anInt1845][][];
		local5.aClass56Array1 = new Class56[local5.anInt1845];
		local5.anIntArray231 = new int[local5.anInt1845];
		local5.anIntArray228 = new int[local5.anInt1845];
		local5.aClass56Array2 = new Class56[local5.anInt1845];
		for (@Pc(51) int local51 = 0; local51 < local5.anInt1845; local51++) {
			try {
				@Pc(57) int local57 = arg1.method1780();
				@Pc(81) String local81;
				@Pc(90) String local90;
				@Pc(92) int local92;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local81 = new String(arg1.method1797().method1995());
					local90 = new String(arg1.method1797().method1995());
					local92 = 0;
					if (local57 == 1) {
						local92 = arg1.method1747();
					}
					local5.anIntArray229[local51] = local57;
					local5.anIntArray228[local51] = local92;
					local5.aClass56Array1[local51] = arg2.method1871(local90, Static114.method1859(local81));
				} else if (local57 == 3 || local57 == 4) {
					local81 = new String(arg1.method1797().method1995());
					local90 = new String(arg1.method1797().method1995());
					local92 = arg1.method1780();
					@Pc(159) String[] local159 = new String[local92];
					for (@Pc(161) int local161 = 0; local161 < local92; local161++) {
						local159[local161] = new String(arg1.method1797().method1995());
					}
					@Pc(181) byte[][] local181 = new byte[local92][];
					@Pc(194) int local194;
					if (local57 == 3) {
						for (@Pc(188) int local188 = 0; local188 < local92; local188++) {
							local194 = arg1.method1747();
							local181[local188] = new byte[local194];
							arg1.method1746(local194, local181[local188]);
						}
					}
					local5.anIntArray229[local51] = local57;
					@Pc(223) Class[] local223 = new Class[local92];
					for (local194 = 0; local194 < local92; local194++) {
						local223[local194] = Static114.method1859(local159[local194]);
					}
					local5.aClass56Array2[local51] = arg2.method1870(Static114.method1859(local81), local223, local90);
					local5.aByteArrayArrayArray4[local51] = local181;
				}
			} catch (@Pc(262) ClassNotFoundException local262) {
				local5.anIntArray231[local51] = -1;
			} catch (@Pc(269) SecurityException local269) {
				local5.anIntArray231[local51] = -2;
			} catch (@Pc(276) NullPointerException local276) {
				local5.anIntArray231[local51] = -3;
			} catch (@Pc(283) Exception local283) {
				local5.anIntArray231[local51] = -4;
			} catch (@Pc(290) Throwable local290) {
				local5.anIntArray231[local51] = -5;
			}
		}
		Static55.aClass58_7.method1294(local5);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1076() {
		aClass80_675 = null;
		aClass80_665 = null;
		anIntArrayArray21 = null;
		aClass80_666 = null;
		aClass11_29 = null;
		aClass80_671 = null;
		aClass80_674 = null;
		aClass58_8 = null;
		aClass80_669 = null;
		aClass80_668 = null;
		aClass80_673 = null;
		aClass80_667 = null;
		aClass80_672 = null;
		aClass80_670 = null;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method1077() {
		Static61.anInt1795 = 0;
		Static93.anInt2410 = 0;
		Static17.method328();
		Static68.method1115();
		Static53.method966();
		Static77.method1199();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static61.anInt1795; local19++) {
			local25 = Static44.anIntArray173[local19];
			if (Static10.anInt300 != Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25].anInt2342) {
				Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25] = null;
			}
		}
		if (Static65.anInt1843 != Static100.aClass2_Sub17_Sub1_1.anInt2799) {
			throw new RuntimeException("gpp1 pos:" + Static100.aClass2_Sub17_Sub1_1.anInt2799 + " psize:" + Static65.anInt1843);
		}
		for (local25 = 0; local25 < Static92.anInt2273; local25++) {
			if (Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static92.anInt2273);
			}
		}
	}
}
