import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "[I")
	public static final int[] anIntArray218 = new int[4096];

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_62 = new Class88("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_63 = new Class88("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
	public static int anInt2588 = 0;

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "[Lclient!naa;")
	public static final Class211[] aClass211Array1 = new Class211[2048];

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)V")
	public static void method2303(@OriginalArg(0) int arg0) {
		if (Static291.method4732(arg0)) {
			Static452.method6811(-1, Static71.aClass198ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!be;)V")
	public static void method2304(@OriginalArg(1) Class30_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt4141 - Static409.anInt7683;
		@Pc(20) int local20 = arg0.anInt4149 * 128 + arg0.method3591() * 64;
		@Pc(31) int local31 = arg0.anInt4163 * 128 + arg0.method3591() * 64;
		arg0.anInt4202 = 0;
		arg0.anInt9416 += (local31 - arg0.anInt9416) / local9;
		arg0.anInt9418 += (local20 - arg0.anInt9418) / local9;
		if (arg0.anInt4173 == 0) {
			arg0.method3601(8192);
		}
		if (arg0.anInt4173 == 1) {
			arg0.method3601(12288);
		}
		if (arg0.anInt4173 == 2) {
			arg0.method3601(0);
		}
		if (arg0.anInt4173 == 3) {
			arg0.method3601(4096);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIILclient!fa;)V")
	public static void method2306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub3 arg3) {
		@Pc(4) Class37 local4 = Static201.method3812(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass30_Sub3_1 = arg3;
		}
	}
}
