import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lclient!et;")
	public static final Class104 aClass104_12 = new Class104(1);

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_163 = new Class200(116, 2);

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_127 = new Class145(63, -1);

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "[I")
	public static final int[] anIntArray483 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_11 = new Class55(10, 2);

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "Lclient!an;")
	public static final Class19 aClass19_8 = new Class19();

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IB)I")
	public static int method6266(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLclient!qg;)[Lclient!pv;")
	public static Class279[] method6267(@OriginalArg(1) Class286 arg0) {
		if (!arg0.method6588()) {
			return new Class279[0];
		}
		@Pc(14) Class319 local14 = arg0.method6574();
		while (local14.anInt8562 == 0) {
			Static440.method6322(10L);
		}
		if (local14.anInt8562 == 2) {
			return new Class279[0];
		}
		@Pc(38) int[] local38 = (int[]) local14.anObject19;
		@Pc(44) Class279[] local44 = new Class279[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(51) Class279 local51 = new Class279();
			local44[local46] = local51;
			local51.anInt7364 = local38[local46 << 2];
			local51.anInt7368 = local38[(local46 << 2) + 1];
			local51.anInt7361 = local38[(local46 << 2) + 2];
			local51.anInt7366 = local38[(local46 << 2) + 3];
		}
		return local44;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
	public static void method6269() {
		if (Static403.aClass299ArrayArray1 == null) {
			return;
		}
		for (@Pc(3) int local3 = 0; local3 < Static403.aClass299ArrayArray1.length; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static403.aClass299ArrayArray1[local3].length; local6++) {
				Static403.aClass299ArrayArray1[local3][local6] = Static67.aClass299_2;
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "([SBI)[S")
	public static short[] method6270(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static650.method2271(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method6271(@OriginalArg(1) Class13 arg0) {
		if (Static266.aBoolean372) {
			Static321.method4914(arg0);
		} else {
			Static199.method8149(arg0);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!rba;[Lclient!laa;)V")
	public static void method6272(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class2_Sub12[] arg1) {
		@Pc(6) int local6;
		if (Static463.aBoolean532) {
			local6 = arg0.method6977(arg1);
			Static380.aClass13_86.method8102(local6, arg1);
		}
		if (Static332.aClass91Array2 == Static511.aClass91Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class16_Sub1_Sub1) {
				local6 = ((Class16_Sub1_Sub1) arg0).aShort103;
				local28 = ((Class16_Sub1_Sub1) arg0).aShort106;
			} else {
				local6 = arg0.anInt8037 >> Static326.anInt5713;
				local28 = arg0.anInt8034 >> Static326.anInt5713;
			}
			Static380.aClass13_86.EA(Static124.aClass91Array1[0].method7446(arg0.anInt8037, arg0.anInt8034), Static16.method414(local6, local28), Static646.method8864(local6, local28), Static403.method6009(local6, local28));
		}
		@Pc(64) Class16_Sub5 local64 = arg0.method6991(Static380.aClass13_86);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean582) {
			@Pc(72) Class16_Sub10[] local72 = local64.aClass16_Sub10Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class16_Sub10 local79 = local72[local74];
				if (local79.aBoolean758) {
					Static103.method1953(local79.anInt10438 - local79.anInt10442, local79.anInt10440 + local79.anInt10442, local79.anInt10441 - local79.anInt10442, local79.anInt10439 + local79.anInt10442);
				}
			}
		}
		if (local64.aBoolean374) {
			local64.aClass16_Sub1_16 = arg0;
			if (Static573.aBoolean668) {
				@Pc(119) Class25 local119 = Static141.aClass25_2;
				synchronized (Static141.aClass25_2) {
					Static141.aClass25_2.method634(local64);
					return;
				}
			}
			Static141.aClass25_2.method634(local64);
			return;
		}
		Static274.method4473(local64);
	}
}
