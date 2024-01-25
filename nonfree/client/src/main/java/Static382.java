import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_91 = new Class208(71, 8);

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
	public static int anInt6616 = 0;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public static int anInt6617 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V")
	public static void method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static347.anInt6160 <= arg4 && Static385.anInt6686 >= arg3 && Static118.anInt2005 <= arg0 && Static123.anInt2069 >= arg2) {
			Static255.method3563(arg2, arg0, arg4, arg1, arg3);
		} else {
			Static69.method1090(arg1, arg0, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)Z")
	public static boolean method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static330.method4706(arg0, arg1) || Static296.method4225(arg1, arg0) || Static283.method4019(arg1, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
	public static void method5262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg2) {
			Static215.method3035(arg0, arg2, Static46.anIntArrayArray24[arg3], arg1);
		} else {
			Static215.method3035(arg2, arg0, Static46.anIntArrayArray24[arg3], arg1);
		}
	}
}
