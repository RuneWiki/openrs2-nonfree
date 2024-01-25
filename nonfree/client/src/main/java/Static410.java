import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Lclient!eq;")
	public static Class97 aClass97_101;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "Lclient!wj;")
	public static Class372 aClass372_1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZZ)V")
	public static void method6301(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static325.anInt5886--;
			if (Static325.anInt5886 == 0) {
				Static349.anIntArray394 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static23.anInt720--;
		if (Static23.anInt720 == 0) {
			Static562.anIntArray652 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public static void method6307() {
		Static391.aClass233_31.method5665();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	public static void method6309() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static142.aClass217ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static142.aClass217ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static347.anInt6411; local6++) {
					for (local9 = 0; local9 < Static191.anInt6006; local9++) {
						if (Static142.aClass217ArrayArrayArray1[local3][local6][local9] != null) {
							Static142.aClass217ArrayArrayArray1[local3][local6][local9].method5396();
						}
						Static142.aClass217ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static142.aClass217ArrayArrayArray1 = null;
		Static178.aClass112Array2 = null;
		if (Static204.aClass217ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static204.aClass217ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static347.anInt6411; local6++) {
					for (local9 = 0; local9 < Static191.anInt6006; local9++) {
						if (Static204.aClass217ArrayArrayArray2[local3][local6][local9] != null) {
							Static204.aClass217ArrayArrayArray2[local3][local6][local9].method5396();
						}
						Static204.aClass217ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static204.aClass217ArrayArrayArray2 = null;
		Static164.aClass112Array1 = null;
		Static440.aClass217ArrayArrayArray3 = null;
		Static331.aClass112Array3 = null;
		Static36.aBooleanArrayArray2 = null;
		Static38.aBooleanArrayArray3 = null;
		Static607.anIntArray692 = null;
		Static295.aBooleanArrayArrayArray6 = null;
		Static425.aBooleanArrayArrayArray5 = null;
		Static140.method2665();
		if (Static310.aClass11_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static226.anInt4632; local3++) {
				Static310.aClass11_Sub1_Sub1Array1[local3] = null;
			}
			Static226.anInt4632 = 0;
		}
		if (Static317.aClass11_Sub1ArrayArray2 != null) {
			for (local3 = 0; local3 < Static336.anIntArray411[0]; local3++) {
				Static317.aClass11_Sub1ArrayArray2[0][local3] = null;
			}
			for (local6 = 0; local6 < Static336.anIntArray411[1]; local6++) {
				Static317.aClass11_Sub1ArrayArray2[1][local6] = null;
			}
			Static336.anIntArray411 = new int[2];
		}
		if (Static146.aClass11_Sub1ArrayArray1 != null) {
			for (local3 = 0; local3 < Static442.anIntArray535[0]; local3++) {
				Static146.aClass11_Sub1ArrayArray1[0][local3] = null;
			}
			for (local6 = 0; local6 < Static442.anIntArray535[1]; local6++) {
				Static146.aClass11_Sub1ArrayArray1[1][local6] = null;
			}
			Static442.anIntArray535 = new int[2];
		}
		if (Static483.aClass11_Sub1ArrayArray3 != null) {
			for (local3 = 0; local3 < Static429.anIntArray527[0]; local3++) {
				Static483.aClass11_Sub1ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static429.anIntArray527[1]; local6++) {
				Static483.aClass11_Sub1ArrayArray3[1][local6] = null;
			}
			Static429.anIntArray527 = new int[2];
		}
		if (Static244.aClass11_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static244.aClass11_Sub1Array2.length; local3++) {
				Static244.aClass11_Sub1Array2[local3] = null;
			}
			Static530.anInt8847 = 0;
		}
		if (Static174.aClass11_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static174.aClass11_Sub1Array1.length; local3++) {
				Static174.aClass11_Sub1Array1[local3] = null;
			}
			Static539.anInt8993 = 0;
		}
		if (Static302.aClass93Array1 != null) {
			for (local3 = 0; local3 < Static140.anInt3097; local3++) {
				Static302.aClass93Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static330.anInt4381; local6++) {
				for (local9 = 0; local9 < Static347.anInt6411; local9++) {
					for (@Pc(294) int local294 = 0; local294 < Static191.anInt6006; local294++) {
						Static192.aLongArrayArrayArray1[local6][local9][local294] = 0L;
					}
				}
			}
			Static140.anInt3097 = 0;
		}
		Static4.method57();
		Static98.aClass329_2 = Static98.aClass329_1;
		Static98.aClass329_2.method7691();
		Static150.aByteArrayArray6 = null;
		Static41.anIntArrayArray9 = null;
		Static588.aShortArrayArray31 = null;
		if (Static408.aClass235Array1 != null) {
			Static563.method7792();
			Static328.aClass87_6.method7938(1);
			Static328.aClass87_6.method7890(0);
		}
		if (Static328.aClass103Array1 != null) {
			Static328.aClass103Array1 = null;
		}
		Static328.aClass87_6 = null;
	}
}
