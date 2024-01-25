import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!ua;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_70 = new Class151("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!rk;")
	public static Class1_Sub11_Sub2 aClass1_Sub11_Sub2_2 = new Class1_Sub11_Sub2(8192);

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_71 = new Class151("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method1695() {
		for (@Pc(3) int local3 = 0; local3 < Static158.anInt2643; local3++) {
			@Pc(9) int local9 = Static386.anIntArray396[local3];
			@Pc(13) Class20_Sub3_Sub3_Sub2 local13 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local9];
			@Pc(17) int local17 = Static154.aClass1_Sub11_Sub1_3.method4463();
			if ((local17 & 0x40) != 0) {
				local17 += Static154.aClass1_Sub11_Sub1_3.method4463() << 8;
			}
			if ((local17 & 0x1) != 0) {
				if (local13.aClass246_1.method5258()) {
					Static176.method2361(local13);
				}
				local13.method4695(Static304.aClass27_1.method588(Static154.aClass1_Sub11_Sub1_3.method4485()));
				local13.method4691(local13.aClass246_1.anInt6830);
				local13.anInt6082 = local13.aClass246_1.anInt6851 << 3;
				if (local13.aClass246_1.method5258()) {
					Static62.method970(null, null, 0, local13.anIntArray369[0], local13, local13.anIntArray370[0], local13.aByte89);
				}
			}
			if ((local17 & 0x100) != 0) {
				local13.anInt6080 = Static154.aClass1_Sub11_Sub1_3.method4477();
				local13.anInt6034 = Static154.aClass1_Sub11_Sub1_3.method4452();
				local13.lb = Static154.aClass1_Sub11_Sub1_3.method4452();
				local13.anInt6009 = Static154.aClass1_Sub11_Sub1_3.method4473();
				local13.anInt6062 = Static154.aClass1_Sub11_Sub1_3.method4497() + Static368.anInt6250;
				local13.anInt6078 = Static154.aClass1_Sub11_Sub1_3.method4497() + Static368.anInt6250;
				local13.anInt6084 = Static154.aClass1_Sub11_Sub1_3.method4465();
				local13.anInt6087 = 0;
				local13.anInt6034 += local13.anIntArray369[0];
				local13.lb += local13.anIntArray370[0];
				local13.anInt6080 += local13.anIntArray370[0];
				local13.anInt6088 = 1;
				local13.anInt6009 += local13.anIntArray369[0];
			}
			@Pc(186) int local186;
			@Pc(197) int local197;
			@Pc(201) int local201;
			if ((local17 & 0x4) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4485();
				if (local186 == 65535) {
					local186 = -1;
				}
				local197 = Static154.aClass1_Sub11_Sub1_3.method4467();
				local201 = Static154.aClass1_Sub11_Sub1_3.method4459();
				local13.method4688(false, local197, local186, local201);
			}
			if ((local17 & 0x8) != 0) {
				local13.anInt6012 = Static154.aClass1_Sub11_Sub1_3.method4485();
				if (local13.anInt6012 == 65535) {
					local13.anInt6012 = -1;
				}
			}
			if ((local17 & 0x10) != 0) {
				local13.aString53 = Static154.aClass1_Sub11_Sub1_3.method4484();
				local13.anInt6021 = 100;
			}
			if ((local17 & 0x800) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4500();
				if (local186 == 65535) {
					local186 = -1;
				}
				local197 = Static154.aClass1_Sub11_Sub1_3.method4467();
				local201 = Static154.aClass1_Sub11_Sub1_3.method4504();
				local13.method4688(true, local197, local186, local201);
			}
			if ((local17 & 0x2000) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4463();
				@Pc(284) int[] local284 = new int[local186];
				@Pc(287) int[] local287 = new int[local186];
				@Pc(290) int[] local290 = new int[local186];
				for (@Pc(292) int local292 = 0; local292 < local186; local292++) {
					@Pc(298) int local298 = Static154.aClass1_Sub11_Sub1_3.method4497();
					if (local298 == 65535) {
						local298 = -1;
					}
					local284[local292] = local298;
					local287[local292] = Static154.aClass1_Sub11_Sub1_3.method4465();
					local290[local292] = Static154.aClass1_Sub11_Sub1_3.method4485();
				}
				Static23.method433(local13, local287, local284, local290);
			}
			if ((local17 & 0x400) != 0) {
				local13.anInt6098 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local13.anInt6097 = Static154.aClass1_Sub11_Sub1_3.method4486();
			}
			if ((local17 & 0x2) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4469();
				local197 = Static154.aClass1_Sub11_Sub1_3.method4459();
				local13.method4679(local197, Static368.anInt6250, local186);
			}
			if ((local17 & 0x20) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4485();
				if (local186 == 65535) {
					local186 = -1;
				}
				local197 = Static154.aClass1_Sub11_Sub1_3.method4465();
				Static149.method5575(local197, local13, local186);
			}
			if ((local17 & 0x80) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4469();
				local197 = Static154.aClass1_Sub11_Sub1_3.method4459();
				local13.method4679(local197, Static368.anInt6250, local186);
				local13.anInt6058 = Static368.anInt6250 + 300;
				local13.anInt6036 = Static154.aClass1_Sub11_Sub1_3.method4504();
			}
			if ((local17 & 0x200) != 0) {
				local186 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local13.anInt6052 = Static154.aClass1_Sub11_Sub1_3.method4504();
				local13.anInt6027 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local13.aBoolean500 = (local186 & 0x8000) != 0;
				local13.anInt6026 = local186 & 0x7FFF;
				local13.anInt6054 = local13.anInt6026 + Static368.anInt6250 + local13.anInt6052;
			}
			if ((local17 & 0x1000) != 0) {
				local13.aByte80 = Static154.aClass1_Sub11_Sub1_3.method4475();
				local13.aByte77 = Static154.aClass1_Sub11_Sub1_3.method4452();
				local13.aByte79 = Static154.aClass1_Sub11_Sub1_3.method4475();
				local13.aByte78 = (byte) Static154.aClass1_Sub11_Sub1_3.method4463();
				local13.anInt6024 = Static368.anInt6250 + Static154.aClass1_Sub11_Sub1_3.method4486();
				local13.anInt6055 = Static368.anInt6250 + Static154.aClass1_Sub11_Sub1_3.method4500();
			}
		}
	}
}
