import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!rh;")
	public static final Class178 aClass178_9 = new Class178();

	@OriginalMember(owner = "client!s", name = "Db", descriptor = "Ljava/lang/String;")
	public static String aString211 = "Cancel";

	@OriginalMember(owner = "client!s", name = "Fb", descriptor = "Ljava/lang/String;")
	public static String aString212 = "Loading fonts - ";

	@OriginalMember(owner = "client!s", name = "e", descriptor = "()V")
	public static void method4876() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static342.aClass57ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static342.aClass57ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static151.anInt3338; local6++) {
					for (local9 = 0; local9 < Static220.anInt4569; local9++) {
						if (Static342.aClass57ArrayArrayArray3[local3][local6][local9] != null) {
							Static342.aClass57ArrayArrayArray3[local3][local6][local9].method1098();
						}
						Static342.aClass57ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static342.aClass57ArrayArrayArray3 = null;
		Static310.aClass26Array4 = null;
		if (Static237.aClass57ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static237.aClass57ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static151.anInt3338; local6++) {
					for (local9 = 0; local9 < Static220.anInt4569; local9++) {
						if (Static237.aClass57ArrayArrayArray2[local3][local6][local9] != null) {
							Static237.aClass57ArrayArrayArray2[local3][local6][local9].method1098();
						}
						Static237.aClass57ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static237.aClass57ArrayArrayArray2 = null;
		Static5.aClass26Array1 = null;
		Static18.aClass57ArrayArrayArray1 = null;
		Static307.aClass26Array3 = null;
		Static281.anInt5702 = 0;
		if (Static183.aClass86Array2 != null) {
			for (local3 = 0; local3 < Static281.anInt5702; local3++) {
				Static183.aClass86Array2[local3] = null;
			}
		}
		if (Static124.aClass2_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static246.anInt5145; local3++) {
				Static124.aClass2_Sub2Array2[local3] = null;
			}
			Static246.anInt5145 = 0;
		}
		if (Static126.aClass4_Sub12_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static161.anInt3632; local3++) {
				Static126.aClass4_Sub12_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static112.anInt2455; local6++) {
				for (local9 = 0; local9 < Static151.anInt3338; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static220.anInt4569; local160++) {
						Static148.anIntArrayArrayArray13[local6][local9][local160] = 0;
					}
				}
			}
			Static161.anInt3632 = 0;
		}
		Static244.anIntArrayArrayArray14 = null;
		Static237.method4088();
		Static315.aClass204_4.method5362();
		Static54.aClass80_1 = null;
		Static170.anIntArrayArray37 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;BJILjava/lang/String;II)V")
	public static void method4888(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!Static173.aBoolean319 && Static282.anInt5713 < 500) {
			@Pc(21) int local21 = arg3 == -1 ? Static23.anInt410 : arg3;
			@Pc(32) Class4_Sub18 local32 = new Class4_Sub18(arg4, arg1, local21, arg6, arg2, arg0, arg5);
			Static248.aClass130_112.method3510(local32);
			Static282.anInt5713++;
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V")
	public static void method4893() {
		Static51.aClass198_9.method5260();
		Static103.aClass198_20.method5260();
	}
}
