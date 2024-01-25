import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!ja;")
	public static Interface2 anInterface2_3;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_62 = new Class117("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!uo;)V")
	public static void method3070(@OriginalArg(1) Class129 arg0) {
		if (Static38.aBoolean40) {
			Static58.method872(arg0);
		} else {
			Static227.method4032(arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	public static void method3072() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static293.aClass106ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static293.aClass106ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static232.anInt4703; local6++) {
					for (local9 = 0; local9 < Static300.anInt5931; local9++) {
						if (Static293.aClass106ArrayArrayArray3[local3][local6][local9] != null) {
							Static293.aClass106ArrayArrayArray3[local3][local6][local9].method2175();
						}
						Static293.aClass106ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static293.aClass106ArrayArrayArray3 = null;
		Static129.aClass77Array3 = null;
		if (Static118.aClass106ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static118.aClass106ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static232.anInt4703; local6++) {
					for (local9 = 0; local9 < Static300.anInt5931; local9++) {
						if (Static118.aClass106ArrayArrayArray1[local3][local6][local9] != null) {
							Static118.aClass106ArrayArrayArray1[local3][local6][local9].method2175();
						}
						Static118.aClass106ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static118.aClass106ArrayArrayArray1 = null;
		Static79.aClass77Array5 = null;
		Static212.aClass106ArrayArrayArray2 = null;
		Static108.aClass77Array2 = null;
		Static339.anInt6547 = 0;
		if (Static135.aClass177Array2 != null) {
			for (local3 = 0; local3 < Static339.anInt6547; local3++) {
				Static135.aClass177Array2[local3] = null;
			}
		}
		if (Static220.aClass67_Sub3Array3 != null) {
			for (local3 = 0; local3 < Static249.anInt4974; local3++) {
				Static220.aClass67_Sub3Array3[local3] = null;
			}
			Static249.anInt4974 = 0;
		}
		if (Static171.aClass11_Sub5_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static219.anInt4457; local3++) {
				Static171.aClass11_Sub5_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static279.anInt5583; local6++) {
				for (local9 = 0; local9 < Static232.anInt4703; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static300.anInt5931; local160++) {
						Static117.anIntArrayArrayArray9[local6][local9][local160] = 0;
					}
				}
			}
			Static219.anInt4457 = 0;
		}
		Static171.anIntArrayArrayArray11 = null;
		Static185.method3204();
		Static33.aClass210_2.method5614();
		Static74.aClass38_1 = null;
		Static303.anIntArrayArray55 = null;
		Static110.aClass61_3 = null;
		Static174.aClass129_5 = null;
	}
}
