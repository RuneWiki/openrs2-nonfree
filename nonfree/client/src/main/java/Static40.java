import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_68 = new Class55("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_64 = new Class253(23, -2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!gk;I)Lclient!ol;")
	public static Class179 method2437(@OriginalArg(0) Class7_Sub14 arg0) {
		@Pc(12) Class179 local12 = new Class179();
		local12.anInt4841 = arg0.method3943();
		local12.aClass7_Sub4_Sub13_1 = Static209.aClass204_1.method4288(local12.anInt4841);
		return local12;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
	public static boolean method2438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method2439() {
		Static413.method5189(Static191.aClass95_9);
		Static66.anInt1242++;
		if (Static51.aBoolean46 && Static129.aBoolean141) {
			@Pc(30) int local30 = Static154.aClass50_1.method1860();
			@Pc(34) int local34 = Static154.aClass50_1.method1870();
			local30 -= Static44.anInt727;
			local34 -= Static98.anInt1995;
			if (local30 < Static413.anInt6556) {
				local30 = Static413.anInt6556;
			}
			if (local30 + Static191.aClass95_9.anInt2595 > Static36.aClass95_1.anInt2595 + Static413.anInt6556) {
				local30 = Static413.anInt6556 + Static36.aClass95_1.anInt2595 - Static191.aClass95_9.anInt2595;
			}
			if (local34 < Static100.anInt2032) {
				local34 = Static100.anInt2032;
			}
			if (Static100.anInt2032 + Static36.aClass95_1.anInt2638 < Static191.aClass95_9.anInt2638 + local34) {
				local34 = Static36.aClass95_1.anInt2638 + Static100.anInt2032 - Static191.aClass95_9.anInt2638;
			}
			@Pc(112) int local112 = Static36.aClass95_1.anInt2627 + local30 - Static413.anInt6556;
			@Pc(119) int local119 = Static36.aClass95_1.anInt2585 + local34 - Static100.anInt2032;
			@Pc(174) Class7_Sub18 local174;
			if (Static154.aClass50_1.method1868()) {
				if (Static191.aClass95_9.anInt2603 < Static66.anInt1242) {
					@Pc(132) int local132 = local30 - Static119.anInt2393;
					@Pc(137) int local137 = local34 - Static447.anInt7374;
					if (Static191.aClass95_9.anInt2590 < local132 || local132 < -Static191.aClass95_9.anInt2590 || Static191.aClass95_9.anInt2590 < local137 || -Static191.aClass95_9.anInt2590 > local137) {
						Static268.aBoolean286 = true;
					}
				}
				if (Static191.aClass95_9.anObjectArray22 != null && Static268.aBoolean286) {
					local174 = new Class7_Sub18();
					local174.anInt2469 = local112;
					local174.anObjectArray1 = Static191.aClass95_9.anObjectArray22;
					local174.anInt2474 = local119;
					local174.aClass95_5 = Static191.aClass95_9;
					Static159.method2352(local174);
					return;
				}
			} else {
				if (Static268.aBoolean286) {
					Static23.method249();
					if (Static191.aClass95_9.anObjectArray23 != null) {
						local174 = new Class7_Sub18();
						local174.anObjectArray1 = Static191.aClass95_9.anObjectArray23;
						local174.anInt2474 = local119;
						local174.aClass95_5 = Static191.aClass95_9;
						local174.anInt2469 = local112;
						local174.aClass95_4 = Static342.aClass95_14;
						Static159.method2352(local174);
					}
					if (Static342.aClass95_14 != null && Static52.method738(Static191.aClass95_9) != null) {
						Static24.method252(Static342.aClass95_14, Static191.aClass95_9);
					}
				} else if ((Static72.anInt1386 == 1 || Static221.method3101()) && Static102.anInt2085 > 2) {
					Static108.method1877(Static447.anInt7374 + Static98.anInt1995, Static44.anInt727 + Static119.anInt2393);
				} else if (Static190.method2758()) {
					Static108.method1877(Static98.anInt1995 + Static447.anInt7374, Static44.anInt727 + Static119.anInt2393);
				}
				Static191.aClass95_9 = null;
			}
		} else if (Static66.anInt1242 > 1) {
			Static191.aClass95_9 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)V")
	public static void method2440(@OriginalArg(1) boolean arg0) {
		Static42.anInt690 = 0;
		Static457.anInt7524 = 0;
		Static110.method1911();
		Static277.method3697(arg0);
		Static315.method4096();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < Static457.anInt7524; local18++) {
			local24 = Static46.anIntArray68[local18];
			if (Static331.aBoolean372 && Static109.method1888(local24)) {
				Static422.method5401();
			}
			if (Static171.aClass26_Sub2_Sub4_Sub1Array1[local24].anInt7098 != Static274.anInt4617) {
				if (Static171.aClass26_Sub2_Sub4_Sub1Array1[local24].aClass249_1.method5178()) {
					Static322.method4276(Static171.aClass26_Sub2_Sub4_Sub1Array1[local24]);
				}
				Static171.aClass26_Sub2_Sub4_Sub1Array1[local24].method4827(null);
				Static171.aClass26_Sub2_Sub4_Sub1Array1[local24] = null;
			}
		}
		if (Static205.anInt3627 != Static210.aClass7_Sub14_Sub1_4.anInt4989) {
			throw new RuntimeException("gnp1 pos:" + Static210.aClass7_Sub14_Sub1_4.anInt4989 + " psize:" + Static205.anInt3627);
		}
		for (local24 = 0; local24 < Static56.anInt943; local24++) {
			if (Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static56.anInt943);
			}
		}
	}
}
