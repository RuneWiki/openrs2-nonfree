import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[Lclient!qn;")
	public static Class249[] aClass249Array1;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public static int anInt7360;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!kr;")
	public static Class171 aClass171_131;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public static int anInt7363;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public static void method6151() {
		if (Static268.anInt5100 == 2) {
			Static85.method1463(3);
		} else if (Static268.anInt5100 == 6) {
			Static85.method1463(7);
		} else if (Static268.anInt5100 == 9) {
			Static85.method1463(10);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZI)Lclient!fd;")
	public static Class91 method6152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class91 local7 = new Class91();
		local7.anInt2571 = -1;
		local7.anInt2589 = arg0 + 6;
		local7.anInt2574 = arg1 + 6;
		local7.anInt2587 = -1;
		local7.anIntArrayArray30 = new int[local7.anInt2574][local7.anInt2589];
		local7.method2180();
		return local7;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method6153(@OriginalArg(1) Class122 arg0) {
		if (Static16.anInt415 < 2 && !Static431.aBoolean542 || Static86.aClass156_4 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static431.aBoolean542 && Static16.anInt415 < 2) {
			local38 = Static238.aString58 + Static229.aClass306_55.method7165(Static179.anInt3168) + Static170.aString32 + " ->";
		} else if (Static546.aBoolean183 && Static149.aClass66_1.method1582(81) && Static16.anInt415 > 2) {
			local38 = Static224.method3889((Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283.aClass1_283);
		} else {
			@Pc(65) Class1_Sub24 local65 = (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283;
			local38 = Static224.method3889(local65);
			@Pc(71) int[] local71 = null;
			if (Static268.method4415(local65.anInt3161)) {
				local71 = Static342.aClass250_2.method5980((int) local65.aLong150).anIntArray335;
			} else if (local65.anInt3166 != -1) {
				local71 = Static342.aClass250_2.method5980(local65.anInt3166).anIntArray335;
			} else if (Static295.method4713(local65.anInt3161)) {
				@Pc(108) Class1_Sub17 local108 = (Class1_Sub17) Static380.aClass17_29.method738((long) local65.aLong150);
				if (local108 != null) {
					@Pc(113) Class49_Sub2_Sub2_Sub2 local113 = local108.aClass49_Sub2_Sub2_Sub2_2;
					@Pc(116) Class196 local116 = local113.aClass196_1;
					if (local116.anIntArray570 != null) {
						local116 = local116.method4855(Static251.aClass119_1);
					}
					if (local116 != null) {
						local71 = local116.anIntArray571;
					}
				}
			} else if (Static174.method2615(local65.anInt3161)) {
				@Pc(148) Class36 local148;
				if (local65.anInt3161 == 1012) {
					local148 = Static308.aClass96_4.method2274((int) local65.aLong150);
				} else {
					local148 = Static308.aClass96_4.method2274((int) (local65.aLong150 >>> 32 & 0x7FFFFFFFL));
				}
				if (local148.anIntArray127 != null) {
					local148 = local148.method954(Static251.aClass119_1);
				}
				if (local148 != null) {
					local71 = local148.anIntArray126;
				}
			}
			if (local71 != null) {
				local38 = local38 + Static228.method3983(local71);
			}
		}
		if (Static16.anInt415 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static16.anInt415 - 2) + Static371.aClass306_88.method7165(Static179.anInt3168);
		}
		if (Static430.aClass156_15 != null) {
			@Pc(268) Class67 local268 = Static430.aClass156_15.method4054(arg0);
			if (local268 == null) {
				local268 = Static296.aClass67_9;
			}
			local268.method7487(Static216.aRandom1, Static383.anIntArray577, Static430.aClass156_15.anInt4730, Static430.aClass156_15.anInt4651, Static3.anInt79, Static421.anInt7340, Static72.aClass2Array2, Static193.anInt7224, Static430.aClass156_15.anInt4673, local38, Static430.aClass156_15.anInt4662, Static430.aClass156_15.anInt4661, Static204.anIntArray341, Static430.aClass156_15.anInt4732);
			Static518.method7137(Static383.anIntArray577[3], Static383.anIntArray577[2], Static383.anIntArray577[0], Static383.anIntArray577[1]);
		} else if (Static263.aClass156_10 != null && Static442.aClass101_3 == Static304.aClass101_1) {
			@Pc(247) int local247 = Static296.aClass67_9.method7480(Static414.anInt7301 + 16, Static537.anInt9065 + 4, Static193.anInt7224, Static204.anIntArray341, Static72.aClass2Array2, Static216.aRandom1, local38);
			Static518.method7137(16, Static381.aClass232_6.method5432(local38) + local247, Static537.anInt9065 + 4, Static414.anInt7301);
			return;
		}
	}
}
