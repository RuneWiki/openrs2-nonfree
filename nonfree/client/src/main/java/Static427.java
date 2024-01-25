import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_130 = new Class387(74, 4);

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
	public static final int[] anIntArray623 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!da;)V")
	public static void method9311(@OriginalArg(0) Class80 arg0) {
		Static660.aClass80_13 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lclient!mja;")
	public static Class3 method9313() {
		try {
			return (Class3) Class.forName("ab").getDeclaredConstructor().newInstance();
		} catch (@Pc(19) Throwable local19) {
			return new Class3_Sub2();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
	public static void method9314() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static253.aClass174ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static253.aClass174ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static328.anInt5870; local6++) {
					for (local9 = 0; local9 < Static526.anInt8863; local9++) {
						if (Static253.aClass174ArrayArrayArray1[local3][local6][local9] != null) {
							Static253.aClass174ArrayArrayArray1[local3][local6][local9].method3709();
						}
						Static253.aClass174ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static253.aClass174ArrayArrayArray1 = null;
		Static220.aClass22Array2 = null;
		if (Static422.aClass174ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static422.aClass174ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static328.anInt5870; local6++) {
					for (local9 = 0; local9 < Static526.anInt8863; local9++) {
						if (Static422.aClass174ArrayArrayArray3[local3][local6][local9] != null) {
							Static422.aClass174ArrayArrayArray3[local3][local6][local9].method3709();
						}
						Static422.aClass174ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static422.aClass174ArrayArrayArray3 = null;
		Static134.aClass22Array1 = null;
		Static260.aClass174ArrayArrayArray2 = null;
		Static242.aClass22Array3 = null;
		Static300.aBooleanArrayArray6 = null;
		Static543.aBooleanArrayArray8 = null;
		Static101.anIntArray88 = null;
		Static535.aBooleanArrayArrayArray4 = null;
		Static301.aBooleanArrayArrayArray3 = null;
		Static576.method8276();
		if (Static15.aClass8_Sub1_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static158.anInt2473; local3++) {
				Static15.aClass8_Sub1_Sub3Array1[local3] = null;
			}
			Static158.anInt2473 = 0;
		}
		Static494.aClass8_Sub1Array3 = null;
		Static607.aClass8_Sub1Array4 = null;
		Static654.aClass8_Sub1Array5 = null;
		if (Static322.aClass8_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static322.aClass8_Sub1Array2.length; local3++) {
				Static322.aClass8_Sub1Array2[local3] = null;
			}
			Static379.anInt6501 = 0;
		}
		if (Static272.aClass8_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static272.aClass8_Sub1Array1.length; local3++) {
				Static272.aClass8_Sub1Array1[local3] = null;
			}
			Static513.anInt8747 = 0;
		}
		if (Static252.aClass2Array1 != null) {
			for (local3 = 0; local3 < Static581.anInt9734; local3++) {
				Static252.aClass2Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static490.anInt9715; local6++) {
				for (local9 = 0; local9 < Static328.anInt5870; local9++) {
					for (@Pc(217) int local217 = 0; local217 < Static526.anInt8863; local217++) {
						Static63.aLongArrayArrayArray1[local6][local9][local217] = 0L;
					}
				}
			}
			Static581.anInt9734 = 0;
		}
		Static452.method6465();
		Static51.aClass339_1 = Static51.aClass339_2;
		Static51.aClass339_1.method8425();
		Static193.aByteArrayArray26 = null;
		Static127.anIntArrayArray14 = null;
		Static104.aShortArrayArray3 = null;
		if (Static476.aClass334Array1 != null) {
			Static228.method3237();
			Static205.aClass57_5.method7690(1);
			Static205.aClass57_5.method7671(0);
		}
		if (Static333.aClass95Array1 != null) {
			Static333.aClass95Array1 = null;
		}
		Static205.aClass57_5 = null;
	}
}
