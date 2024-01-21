import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vb", name = "Jb", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!vb", name = "Xb", descriptor = "Z")
	public static boolean aBoolean110;

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!vb", name = "Fb", descriptor = "Z")
	public static volatile boolean aBoolean109 = false;

	@OriginalMember(owner = "client!vb", name = "Hb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1364 = Static56.method816("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!vb", name = "Ob", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1366 = Static56.method816("Unable to connect)3");

	@OriginalMember(owner = "client!vb", name = "Nb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1365 = aClass34_1366;

	@OriginalMember(owner = "client!vb", name = "Pb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1367 = aClass34_1366;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!wf;B)Z")
	public static boolean method1960(@OriginalArg(0) Class8_Sub24 arg0) {
		@Pc(6) int local6 = arg0.anInt3143;
		if (local6 == 205) {
			Static31.anInt863 = 250;
			return true;
		}
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (local6 >= 300 && local6 <= 313) {
			local27 = (local6 - 300) / 2;
			local31 = local6 & 0x1;
			Static134.aClass52_2.method1204(local27, local31 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local27 = (local6 - 314) / 2;
			local31 = local6 & 0x1;
			Static134.aClass52_2.method1206(local31 == 1, local27);
		}
		if (local6 == 324) {
			Static134.aClass52_2.method1192(false);
		}
		if (local6 == 325) {
			Static134.aClass52_2.method1192(true);
		}
		if (local6 == 326) {
			Static106.aClass8_Sub20_Sub1_3.method1907(177);
			Static134.aClass52_2.method1195(Static106.aClass8_Sub20_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(B)V")
	public static void method1961() {
		aClass34_1367 = null;
		anIntArray394 = null;
		aClass34_1364 = null;
		aClass34_1365 = null;
		aBigInteger2 = null;
		aClass34_1366 = null;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	public static void method1963() {
		while (true) {
			if (Static10.aClass8_Sub20_Sub1_1.method1906(Static32.anInt872) >= 11) {
				@Pc(19) int local19 = Static10.aClass8_Sub20_Sub1_1.method1899(11);
				if (local19 != 2047) {
					@Pc(24) boolean local24 = false;
					if (Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local19] == null) {
						local24 = true;
						Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local19] = new Class8_Sub1_Sub1_Sub4_Sub1();
						if (Static44.aClass8_Sub20Array1[local19] != null) {
							Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local19].method736(Static44.aClass8_Sub20Array1[local19]);
						}
					}
					Static29.anIntArray109[Static41.anInt986++] = local19;
					@Pc(60) Class8_Sub1_Sub1_Sub4_Sub1 local60 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local19];
					local60.anInt2057 = Static21.anInt655;
					@Pc(68) int local68 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
					if (local68 == 1) {
						Static3.anIntArray4[Static95.anInt2240++] = local19;
					}
					@Pc(84) int local84 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
					@Pc(89) int local89 = Static10.aClass8_Sub20_Sub1_1.method1899(5);
					@Pc(96) int local96 = Static119.anIntArray382[Static10.aClass8_Sub20_Sub1_1.method1899(3)];
					if (local89 > 15) {
						local89 -= 32;
					}
					if (local24) {
						local60.anInt2022 = local60.anInt2038 = local96;
					}
					@Pc(115) int local115 = Static10.aClass8_Sub20_Sub1_1.method1899(5);
					if (local115 > 15) {
						local115 -= 32;
					}
					local60.method1226(local84 == 1, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0] + local115, local89 + Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0]);
					continue;
				}
			}
			Static10.aClass8_Sub20_Sub1_1.method1905();
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)V")
	public static void method1964(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class8_Sub20 local8 = new Class8_Sub20(arg0);
		local8.anInt2853 = arg0.length - 2;
		Static58.anInt1530 = local8.method1839();
		Static13.anIntArray47 = new int[Static58.anInt1530];
		Static115.aByteArrayArray57 = new byte[Static58.anInt1530][];
		Static42.anIntArray135 = new int[Static58.anInt1530];
		Static19.anIntArray65 = new int[Static58.anInt1530];
		Static92.anIntArray307 = new int[Static58.anInt1530];
		local8.anInt2853 = arg0.length - Static58.anInt1530 * 8 - 7;
		Static92.anInt2205 = local8.method1839();
		Static5.anInt70 = local8.method1839();
		@Pc(60) int local60 = (local8.method1872() & 0xFF) + 1;
		for (@Pc(73) int local73 = 0; local73 < Static58.anInt1530; local73++) {
			Static92.anIntArray307[local73] = local8.method1839();
		}
		for (@Pc(90) int local90 = 0; local90 < Static58.anInt1530; local90++) {
			Static13.anIntArray47[local90] = local8.method1839();
		}
		for (@Pc(103) int local103 = 0; local103 < Static58.anInt1530; local103++) {
			Static42.anIntArray135[local103] = local8.method1839();
		}
		for (@Pc(120) int local120 = 0; local120 < Static58.anInt1530; local120++) {
			Static19.anIntArray65[local120] = local8.method1839();
		}
		local8.anInt2853 = arg0.length - Static58.anInt1530 * 8 - (local60 + -1) * 3 - 7;
		Static32.anIntArray110 = new int[local60];
		for (@Pc(154) int local154 = 1; local154 < local60; local154++) {
			Static32.anIntArray110[local154] = local8.method1885();
			if (Static32.anIntArray110[local154] == 0) {
				Static32.anIntArray110[local154] = 1;
			}
		}
		local8.anInt2853 = 0;
		for (@Pc(182) int local182 = 0; local182 < Static58.anInt1530; local182++) {
			@Pc(187) int local187 = Static19.anIntArray65[local182];
			@Pc(191) int local191 = Static42.anIntArray135[local182];
			@Pc(195) int local195 = local187 * local191;
			@Pc(198) byte[] local198 = new byte[local195];
			Static115.aByteArrayArray57[local182] = local198;
			@Pc(206) int local206 = local8.method1872();
			@Pc(218) int local218;
			if (local206 == 0) {
				for (local218 = 0; local218 < local195; local218++) {
					local198[local218] = local8.method1847();
				}
			} else if (local206 == 1) {
				for (local218 = 0; local218 < local191; local218++) {
					for (@Pc(221) int local221 = 0; local221 < local187; local221++) {
						local198[local218 + local221 * local191] = local8.method1847();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
	public static void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static45.aClass8_Sub1_Sub3_Sub2Array3[0].method300(arg3, arg0);
		@Pc(17) int local17 = arg4 * (arg4 - 32) / arg1;
		Static45.aClass8_Sub1_Sub3_Sub2Array3[1].method300(arg3, arg4 + arg0 - 16);
		if (local17 < 8) {
			local17 = 8;
		}
		@Pc(46) int local46 = (arg4 - local17 - 32) * arg2 / (arg1 - arg4);
		Static110.method1729(arg3, arg0 + 16, 16, arg4 - 32, Static53.anInt1367);
		Static110.method1729(arg3, arg0 + local46 + 16, 16, local17, Static125.anInt3002);
		Static110.method1728(arg3, local46 + arg0 + 16, local17, Static133.anInt3066);
		Static110.method1728(arg3 + 1, arg0 - -local46 + 16, local17, Static133.anInt3066);
		Static110.method1737(arg3, arg0 + local46 + 16, 16, Static133.anInt3066);
		Static110.method1737(arg3, arg0 + local46 + 17, 16, Static133.anInt3066);
		Static110.method1728(arg3 + 15, arg0 - -local46 + 16, local17, Static120.anInt2879);
		Static110.method1728(arg3 + 14, arg0 - -local46 + 17, local17 - 1, Static120.anInt2879);
		Static110.method1737(arg3, local17 + arg0 + local46 + 15, 16, Static120.anInt2879);
		Static110.method1737(arg3 + 1, local17 + local46 + arg0 + 14, 15, Static120.anInt2879);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII[Lclient!kd;BI)V")
	public static void method1966(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class42[] arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 64; local4++) {
				for (local7 = 0; local7 < 64; local7++) {
					if (local4 + arg2 > 0 && arg2 + local4 < 103 && arg3 + local7 > 0 && arg3 + local7 < 103) {
						arg4[local1].anIntArrayArray12[local4 + arg2][local7 + arg3] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class8_Sub20 local87 = new Class8_Sub20(arg0);
		for (local7 = 0; local7 < 4; local7++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static125.method1973(local87, local7, arg3 + local95, arg1, arg5, arg2 + local92, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public static void method1967(@OriginalArg(0) int arg0) {
		@Pc(12) Class8_Sub22 local12 = (Class8_Sub22) Static64.aClass7_14.method45((long) arg0);
		if (local12 != null) {
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray397.length; local25++) {
				local12.anIntArray397[local25] = -1;
				local12.anIntArray396[local25] = 0;
			}
		}
	}
}
