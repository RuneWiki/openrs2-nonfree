import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
	public static int anInt1733;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public static int anInt1736;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
	public static int anInt1730 = 0;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_36 = new Class158("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
	public static int anInt1738 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)V")
	public static void method1236(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static248.method3707(arg0, 12);
		local12.method2954();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1237(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static223.anInt4457; local14++) {
			if (arg0.equalsIgnoreCase(Static325.aStringArray38[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static210.aStringArray28[local14])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public static void method1238() {
		@Pc(9) int local9 = Static5.aClass1_Sub3_Sub1_1.method1171();
		@Pc(13) int local13 = Static5.aClass1_Sub3_Sub1_1.method1225();
		@Pc(22) boolean local22 = Static5.aClass1_Sub3_Sub1_1.method1171() == 1;
		Static367.anInt6719 = Static5.aClass1_Sub3_Sub1_1.method1218();
		@Pc(30) int local30 = Static5.aClass1_Sub3_Sub1_1.method1207();
		Static23.method493();
		Static76.method1407(local9);
		Static5.aClass1_Sub3_Sub1_1.method320();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static209.anInt4283 >> 3; local44++) {
				for (local48 = 0; local48 < Static211.anInt4295 >> 3; local48++) {
					local55 = Static5.aClass1_Sub3_Sub1_1.method321(1);
					if (local55 == 1) {
						Static334.anIntArrayArrayArray14[local40][local44][local48] = Static5.aClass1_Sub3_Sub1_1.method321(26);
					} else {
						Static334.anIntArrayArrayArray14[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static5.aClass1_Sub3_Sub1_1.method315();
		local44 = (Static350.anInt6510 - Static5.aClass1_Sub3_Sub1_1.anInt1710) / 16;
		Static337.anIntArrayArray48 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static337.anIntArrayArray48[local48][local55] = Static5.aClass1_Sub3_Sub1_1.method1188();
			}
		}
		Static135.anIntArray311 = new int[local44];
		Static299.aByteArrayArray5 = new byte[local44][];
		Static155.anIntArray345 = new int[local44];
		Static237.aByteArrayArray15 = new byte[local44][];
		Static257.anIntArray473 = new int[local44];
		Static243.anIntArray443 = new int[local44];
		Static168.anIntArray147 = new int[local44];
		Static311.aByteArrayArray18 = new byte[local44][];
		Static225.anIntArray431 = null;
		Static106.aByteArrayArray8 = new byte[local44][];
		Static339.aByteArrayArray20 = null;
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(180) int local180 = 0; local180 < Static209.anInt4283 >> 3; local180++) {
				for (@Pc(184) int local184 = 0; local184 < Static211.anInt4295 >> 3; local184++) {
					@Pc(194) int local194 = Static334.anIntArrayArrayArray14[local55][local180][local184];
					if (local194 != -1) {
						@Pc(203) int local203 = local194 >> 14 & 0x3FF;
						@Pc(209) int local209 = local194 >> 3 & 0x7FF;
						@Pc(219) int local219 = local209 / 8 + (local203 / 8 << 8);
						for (@Pc(221) int local221 = 0; local221 < local44; local221++) {
							if (local219 == Static168.anIntArray147[local221]) {
								local219 = -1;
								break;
							}
						}
						if (local219 != -1) {
							Static168.anIntArray147[local44] = local219;
							@Pc(253) int local253 = local219 >> 8 & 0xFF;
							@Pc(257) int local257 = local219 & 0xFF;
							Static155.anIntArray345[local44] = Static136.aClass211_36.method4759("m" + local253 + "_" + local257);
							Static257.anIntArray473[local44] = Static136.aClass211_36.method4759("l" + local253 + "_" + local257);
							Static243.anIntArray443[local44] = Static136.aClass211_36.method4759("um" + local253 + "_" + local257);
							Static135.anIntArray311[local44] = Static136.aClass211_36.method4759("ul" + local253 + "_" + local257);
							local44++;
						}
					}
				}
			}
		}
		Static149.method2372(10, local22, local13, local30);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)I")
	public static int method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static383.aByteArrayArray22 == null ? 0 : Static383.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1242(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)V")
	public static void method1244(@OriginalArg(1) byte arg0) {
		if (Static237.aByteArrayArrayArray15 == null) {
			Static237.aByteArrayArrayArray15 = new byte[4][Static209.anInt4283][Static211.anInt4295];
		}
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static209.anInt4283; local15++) {
				for (@Pc(18) int local18 = 0; local18 < Static211.anInt4295; local18++) {
					Static237.aByteArrayArrayArray15[local12][local15][local18] = arg0;
				}
			}
		}
	}
}
