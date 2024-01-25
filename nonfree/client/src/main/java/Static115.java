import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_9 = new Class17(4, 14);

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_57 = new Class41(52, 3);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Lclient!ui;")
	public static Class227 method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static297.aClass227ArrayArrayArray7[0][arg1][arg2] != null && Static297.aClass227ArrayArrayArray7[0][arg1][arg2].aClass227_1 != null;
			if (local28 && arg0 >= Static32.anInt6037 - 1) {
				return null;
			}
			Static390.method5728(arg0, arg1, arg2);
		}
		return Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	public static void method2164() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static242.aClass227ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static242.aClass227ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static166.anInt2967; local6++) {
					for (local9 = 0; local9 < Static244.anInt1024; local9++) {
						if (Static242.aClass227ArrayArrayArray4[local3][local6][local9] != null) {
							Static242.aClass227ArrayArrayArray4[local3][local6][local9].method5357();
						}
						Static242.aClass227ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static242.aClass227ArrayArrayArray4 = null;
		Static39.aClass33Array2 = null;
		if (Static91.aClass227ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static91.aClass227ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static166.anInt2967; local6++) {
					for (local9 = 0; local9 < Static244.anInt1024; local9++) {
						if (Static91.aClass227ArrayArrayArray1[local3][local6][local9] != null) {
							Static91.aClass227ArrayArrayArray1[local3][local6][local9].method5357();
						}
						Static91.aClass227ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static91.aClass227ArrayArrayArray1 = null;
		Static345.aClass33Array3 = null;
		Static297.aClass227ArrayArrayArray7 = null;
		Static17.aClass33Array1 = null;
		Static224.anInt2647 = 0;
		if (Static196.aClass242Array1 != null) {
			for (local3 = 0; local3 < Static224.anInt2647; local3++) {
				Static196.aClass242Array1[local3] = null;
			}
		}
		if (Static258.aClass12_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static278.anInt1555; local3++) {
				Static258.aClass12_Sub1Array3[local3] = null;
			}
			Static278.anInt1555 = 0;
		}
		if (Static305.aClass2_Sub14_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static356.anInt6269; local3++) {
				Static305.aClass2_Sub14_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static32.anInt6037; local6++) {
				for (local9 = 0; local9 < Static166.anInt2967; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static244.anInt1024; local160++) {
						Static259.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static356.anInt6269 = 0;
		}
		Static231.anIntArrayArrayArray9 = null;
		Static37.method814();
		Static371.aClass56_7.method1255();
		Static354.aByteArrayArray20 = null;
		Static298.anIntArrayArray46 = null;
		Static57.aByteArrayArray14 = null;
		Static42.aClass51_1 = null;
		Static382.aClass54_5 = null;
		Static315.aClass82_7 = null;
	}
}
