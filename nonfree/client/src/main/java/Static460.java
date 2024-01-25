import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!lga;")
	public static Class223 aClass223_93;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_52 = new Class74(16);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	public static void method7012() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static526.aClass243ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static526.aClass243ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static230.anInt4470; local6++) {
					for (local9 = 0; local9 < Static63.anInt777; local9++) {
						if (Static526.aClass243ArrayArrayArray3[local3][local6][local9] != null) {
							Static526.aClass243ArrayArrayArray3[local3][local6][local9].method5956();
						}
						Static526.aClass243ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static526.aClass243ArrayArrayArray3 = null;
		Static524.aClass96Array2 = null;
		if (Static104.aClass243ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static104.aClass243ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static230.anInt4470; local6++) {
					for (local9 = 0; local9 < Static63.anInt777; local9++) {
						if (Static104.aClass243ArrayArrayArray1[local3][local6][local9] != null) {
							Static104.aClass243ArrayArrayArray1[local3][local6][local9].method5956();
						}
						Static104.aClass243ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static104.aClass243ArrayArrayArray1 = null;
		Static216.aClass96Array1 = null;
		Static334.aClass243ArrayArrayArray2 = null;
		Static555.aClass96Array3 = null;
		Static488.aBooleanArrayArray4 = null;
		Static544.aBooleanArrayArray6 = null;
		Static427.anIntArray471 = null;
		Static195.aBooleanArrayArrayArray1 = null;
		Static225.aBooleanArrayArrayArray2 = null;
		Static288.method4730();
		if (Static469.aClass60_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static243.anInt4671; local3++) {
				Static469.aClass60_Sub1_Sub1Array1[local3] = null;
			}
			Static243.anInt4671 = 0;
		}
		Static403.aClass60_Sub1Array5 = null;
		Static265.aClass60_Sub1Array4 = null;
		Static535.aClass60_Sub1Array3 = null;
		if (Static434.aClass60_Sub1Array6 != null) {
			for (local3 = 0; local3 < Static434.aClass60_Sub1Array6.length; local3++) {
				Static434.aClass60_Sub1Array6[local3] = null;
			}
			Static261.anInt5002 = 0;
		}
		if (Static580.aClass60_Sub1Array7 != null) {
			for (local3 = 0; local3 < Static580.aClass60_Sub1Array7.length; local3++) {
				Static580.aClass60_Sub1Array7[local3] = null;
			}
			Static676.anInt10367 = 0;
		}
		if (Static483.aClass256Array1 != null) {
			for (local3 = 0; local3 < Static259.anInt4979; local3++) {
				Static483.aClass256Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static66.anInt802; local6++) {
				for (local9 = 0; local9 < Static230.anInt4470; local9++) {
					for (@Pc(217) int local217 = 0; local217 < Static63.anInt777; local217++) {
						Static191.aLongArrayArrayArray1[local6][local9][local217] = 0L;
					}
				}
			}
			Static259.anInt4979 = 0;
		}
		Static418.method6410();
		Static667.aClass284_3 = Static667.aClass284_2;
		Static667.aClass284_3.method7015();
		Static273.aByteArrayArray84 = null;
		Static130.anIntArrayArray10 = null;
		Static473.aShortArrayArray11 = null;
		if (Static630.aClass106Array2 != null) {
			Static578.method8058();
			Static277.aClass75_7.method6694(1);
			Static277.aClass75_7.method6696(0);
		}
		if (Static489.aClass15Array1 != null) {
			Static489.aClass15Array1 = null;
		}
		Static277.aClass75_7 = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!jc;)Lclient!vaa;")
	public static Class372 method7016(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(14) int local14 = arg0.method3015();
		return new Class372(local14);
	}
}
