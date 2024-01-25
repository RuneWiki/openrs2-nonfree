import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "Lclient!rb;")
	public static Class314 aClass314_8;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
	public static int anInt8651;

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "J")
	public static long aLong291;

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
	public static int anInt8653 = 104;

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "Z")
	public static boolean aBoolean643 = false;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "()V")
	public static void method7254() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static274.aClass262ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static274.aClass262ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static509.anInt8656; local6++) {
					for (local9 = 0; local9 < Static164.anInt3059; local9++) {
						if (Static274.aClass262ArrayArrayArray1[local3][local6][local9] != null) {
							Static274.aClass262ArrayArrayArray1[local3][local6][local9].method6396();
						}
						Static274.aClass262ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static274.aClass262ArrayArrayArray1 = null;
		Static167.aClass313Array1 = null;
		if (Static712.aClass262ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static712.aClass262ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static509.anInt8656; local6++) {
					for (local9 = 0; local9 < Static164.anInt3059; local9++) {
						if (Static712.aClass262ArrayArrayArray3[local3][local6][local9] != null) {
							Static712.aClass262ArrayArrayArray3[local3][local6][local9].method6396();
						}
						Static712.aClass262ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static712.aClass262ArrayArrayArray3 = null;
		Static711.aClass313Array3 = null;
		Static584.aClass262ArrayArrayArray2 = null;
		Static639.aClass313Array2 = null;
		Static624.aBooleanArrayArray7 = null;
		Static39.aBooleanArrayArray1 = null;
		Static698.anIntArray610 = null;
		Static71.aBooleanArrayArrayArray1 = null;
		Static153.aBooleanArrayArrayArray2 = null;
		Static588.method8087();
		if (Static339.aClass19_Sub1_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static612.anInt9915; local3++) {
				Static339.aClass19_Sub1_Sub3Array1[local3] = null;
			}
			Static612.anInt9915 = 0;
		}
		Static660.aClass19_Sub1Array5 = null;
		Static358.aClass19_Sub1Array2 = null;
		Static634.aClass19_Sub1Array4 = null;
		if (Static325.aClass19_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static325.aClass19_Sub1Array1.length; local3++) {
				Static325.aClass19_Sub1Array1[local3] = null;
			}
			Static407.anInt7263 = 0;
		}
		if (Static626.aClass19_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static626.aClass19_Sub1Array3.length; local3++) {
				Static626.aClass19_Sub1Array3[local3] = null;
			}
			Static81.anInt1265 = 0;
		}
		if (Static458.aClass246Array1 != null) {
			for (local3 = 0; local3 < Static254.anInt4739; local3++) {
				Static458.aClass246Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static241.anInt4521; local6++) {
				for (local9 = 0; local9 < Static509.anInt8656; local9++) {
					for (@Pc(217) int local217 = 0; local217 < Static164.anInt3059; local217++) {
						Static353.aLongArrayArrayArray1[local6][local9][local217] = 0L;
					}
				}
			}
			Static254.anInt4739 = 0;
		}
		Static583.method8028(-28905);
		Static424.aClass88_1 = Static424.aClass88_2;
		Static424.aClass88_1.method2241();
		Static242.aByteArrayArray6 = null;
		Static283.anIntArrayArray26 = null;
		Static235.aShortArrayArray2 = null;
		if (Static150.aClass240Array1 != null) {
			Static530.method7490();
			Static626.aClass67_16.method7657(1);
			Static626.aClass67_16.method7695(0);
		}
		if (Static307.aClass198Array1 != null) {
			Static307.aClass198Array1 = null;
		}
		Static626.aClass67_16 = null;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!bla;[Lclient!vj;)V")
	public static void method7255(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		@Pc(6) int local6;
		if (Static668.aBoolean281) {
			local6 = arg0.method9376(arg1);
			Static626.aClass67_16.method7694(local6, arg1);
		}
		if (Static711.aClass313Array3 == Static639.aClass313Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class19_Sub1_Sub3) {
				local6 = ((Class19_Sub1_Sub3) arg0).aShort121;
				local28 = ((Class19_Sub1_Sub3) arg0).aShort124;
			} else {
				local6 = arg0.anInt11204 >> Static394.anInt7067;
				local28 = arg0.anInt11211 >> Static394.anInt7067;
			}
			Static626.aClass67_16.EA(Static167.aClass313Array1[0].method9096(arg0.anInt11204, arg0.anInt11211), Static405.method6058(local6, local28), Static479.method7001(local6, local28), Static671.method8889(local6, local28));
		}
		@Pc(64) Class19_Sub8 local64 = arg0.method9377(Static626.aClass67_16);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean809) {
			@Pc(74) Class19_Sub6[] local74 = local64.aClass19_Sub6Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class19_Sub6 local81 = local74[local76];
				if (local81.aBoolean477) {
					Static30.method402(local81.anInt5948 - local81.anInt5949, local81.anInt5950 + local81.anInt5949, local81.anInt5947 - local81.anInt5949, local81.anInt5946 + local81.anInt5949);
				}
			}
		}
		if (local64.aBoolean559) {
			local64.aClass19_Sub1_16 = arg0;
			if (Static67.aBoolean81) {
				@Pc(127) Class88 local127 = Static424.aClass88_1;
				synchronized (Static424.aClass88_1) {
					Static424.aClass88_1.method2242(local64);
					return;
				}
			}
			Static424.aClass88_1.method2242(local64);
			return;
		}
		Static235.method3665(local64);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IBIII)Z")
	public static boolean method7257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static177.aBoolean501 || !Static183.aBoolean267) {
			return false;
		} else if (Static195.anInt7170 < 100) {
			return false;
		} else if (Static601.method8270(arg3, arg1, arg0)) {
			@Pc(31) int local31 = arg1 << Static394.anInt7067;
			@Pc(35) int local35 = arg3 << Static394.anInt7067;
			if (Static506.method7239(local31, Static639.aClass313Array2[arg0].method9095(arg3, arg1), arg2, local35, Static495.anInt8508, Static495.anInt8508)) {
				Static149.anInt2804++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
