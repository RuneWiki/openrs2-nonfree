import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	public static int anInt5361;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray56;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!nh;")
	public static Class143 aClass143_5;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public static int anInt5364;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public static void method4657() {
		for (@Pc(8) int local8 = 0; local8 < Static5.anInt200; local8++) {
			@Pc(14) int local14 = Static171.anIntArray333[local8];
			@Pc(18) Class17_Sub1_Sub1_Sub2 local18 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local14];
			if (local18 != null) {
				Static53.method1367(local18.aClass213_1.anInt6509, local18);
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "()V")
	public static void method4659() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static313.aClass194ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static313.aClass194ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static242.anInt6744; local6++) {
					for (local9 = 0; local9 < Static315.anInt6124; local9++) {
						if (Static313.aClass194ArrayArrayArray3[local3][local6][local9] != null) {
							Static313.aClass194ArrayArrayArray3[local3][local6][local9].method4981();
						}
						Static313.aClass194ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static313.aClass194ArrayArrayArray3 = null;
		Static190.aClass53Array1 = null;
		if (Static91.aClass194ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static91.aClass194ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static242.anInt6744; local6++) {
					for (local9 = 0; local9 < Static315.anInt6124; local9++) {
						if (Static91.aClass194ArrayArrayArray2[local3][local6][local9] != null) {
							Static91.aClass194ArrayArrayArray2[local3][local6][local9].method4981();
						}
						Static91.aClass194ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static91.aClass194ArrayArrayArray2 = null;
		Static269.aClass53Array2 = null;
		Static77.aClass194ArrayArrayArray1 = null;
		Static298.aClass53Array3 = null;
		Static28.anInt1030 = 0;
		if (Static121.aClass23Array2 != null) {
			for (local3 = 0; local3 < Static28.anInt1030; local3++) {
				Static121.aClass23Array2[local3] = null;
			}
		}
		if (Static245.aClass17_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static19.anInt573; local3++) {
				Static245.aClass17_Sub1Array2[local3] = null;
			}
			Static19.anInt573 = 0;
		}
		if (Static309.aClass1_Sub30_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static305.anInt6023; local3++) {
				Static309.aClass1_Sub30_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static113.anInt2651; local6++) {
				for (local9 = 0; local9 < Static242.anInt6744; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static315.anInt6124; local160++) {
						Static150.anIntArrayArrayArray9[local6][local9][local160] = 0;
					}
				}
			}
			Static305.anInt6023 = 0;
		}
		Static154.anIntArrayArrayArray10 = null;
		Static127.method2616();
		Static92.aClass217_8.method5688();
		Static231.aClass42_1 = null;
		Static85.anIntArrayArray56 = null;
		Static75.aClass109_13 = null;
		Static20.aClass32_4 = null;
	}
}
