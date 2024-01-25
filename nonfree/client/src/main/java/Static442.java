import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZIIILclient!pe;I)V")
	public static void method6913(@OriginalArg(0) int arg0, @OriginalArg(5) Class254 arg1, @OriginalArg(6) int arg2) {
		Static340.anInt6985 = arg0;
		Static273.anInt5808 = 0;
		Static274.anInt5814 = arg2;
		Static207.anInt4266 = 2;
		Static178.anInt3592 = 1;
		Static568.aClass254_136 = arg1;
		Static93.aBoolean180 = false;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public static void method6914() {
		for (@Pc(8) Class3_Sub40 local8 = (Class3_Sub40) Static342.aClass183_44.method4795(); local8 != null; local8 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			if (Static8.method307(local8.anInt7324)) {
				Static595.method8408(local8);
			}
		}
		if (Static309.anInt6170 == 1) {
			Static564.method8126();
			return;
		}
		Static30.method982(Static386.anInt7409, Static489.anInt9112, Static277.anInt5863, Static344.anInt6998);
		@Pc(44) int local44 = Static9.aClass297_1.method7314(Static139.aClass101_23.method2841(Static126.anInt2904));
		for (@Pc(49) Class3_Sub40 local49 = (Class3_Sub40) Static342.aClass183_44.method4795(); local49 != null; local49 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			@Pc(54) int local54 = Static130.method2555(local49);
			if (local44 < local54) {
				local44 = local54;
			}
		}
		Static277.anInt5863 = local44 + 8;
		Static344.anInt6998 = Static309.anInt6170 * 16 + (Static254.aBoolean661 ? 26 : 22);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "()V")
	public static void method6915() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static422.aClass125ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static422.aClass125ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static223.anInt4520; local6++) {
					for (local9 = 0; local9 < Static416.anInt10065; local9++) {
						if (Static422.aClass125ArrayArrayArray2[local3][local6][local9] != null) {
							Static422.aClass125ArrayArrayArray2[local3][local6][local9].method3099();
						}
						Static422.aClass125ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static422.aClass125ArrayArrayArray2 = null;
		Static381.aClass4Array2 = null;
		if (Static191.aClass125ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static191.aClass125ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static223.anInt4520; local6++) {
					for (local9 = 0; local9 < Static416.anInt10065; local9++) {
						if (Static191.aClass125ArrayArrayArray1[local3][local6][local9] != null) {
							Static191.aClass125ArrayArrayArray1[local3][local6][local9].method3099();
						}
						Static191.aClass125ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static191.aClass125ArrayArrayArray1 = null;
		Static495.aClass4Array4 = null;
		Static580.aClass125ArrayArrayArray3 = null;
		Static224.aClass4Array3 = null;
		Static141.anInt3256 = 0;
		if (Static189.aClass38Array2 != null) {
			for (local3 = 0; local3 < Static141.anInt3256; local3++) {
				Static189.aClass38Array2[local3] = null;
			}
		}
		if (Static377.aClass2_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static7.anInt303; local3++) {
				Static377.aClass2_Sub2Array2[local3] = null;
			}
			Static7.anInt303 = 0;
		}
		if (Static464.aClass212Array1 != null) {
			for (local3 = 0; local3 < Static464.anInt8684; local3++) {
				Static464.aClass212Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static264.anInt8587; local6++) {
				for (local9 = 0; local9 < Static223.anInt4520; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static416.anInt10065; local160++) {
						Static272.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static464.anInt8684 = 0;
		}
		Static39.anIntArrayArrayArray1 = null;
		Static513.method356();
		Static166.aClass134_4.method3232();
		Static67.aByteArrayArray32 = null;
		Static343.anIntArrayArray58 = null;
		Static171.aShortArrayArray6 = null;
		Static415.aClass89_1 = null;
		Static67.aClass255_10 = null;
		Static338.aClass15_11 = null;
	}
}
