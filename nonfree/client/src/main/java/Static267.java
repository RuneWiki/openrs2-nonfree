import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!ne;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_85 = new Class57("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_81 = new Class244(8, 2);

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "[I")
	public static int[] anIntArray620 = new int[2];

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
	public static final int[] anIntArray621 = new int[3];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIIII)V")
	public static void method5159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static221.anInt3917 && Static365.anInt6140 >= arg1 && arg0 >= Static26.anInt345 && Static272.anInt4750 >= arg2) {
			if (arg3 == 1) {
				Static311.method4792(arg4, arg2, arg5, arg1, arg0);
			} else {
				Static299.method4621(arg2, arg0, arg3, arg5, arg1, arg4);
			}
		} else if (arg3 == 1) {
			Static158.method2439(arg2, arg5, arg0, arg4, arg1);
		} else {
			Static261.method4207(arg1, arg4, arg0, arg5, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
	public static void method5161(@OriginalArg(0) byte arg0) {
		if (Static330.aByteArrayArrayArray18 == null) {
			Static330.aByteArrayArrayArray18 = new byte[4][Static12.anInt161][Static44.anInt787];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static12.anInt161; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static44.anInt787; local22++) {
					Static330.aByteArrayArrayArray18[local14][local18][local22] = arg0;
				}
			}
		}
	}
}
