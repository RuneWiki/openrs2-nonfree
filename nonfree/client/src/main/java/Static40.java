import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!la;")
	public static Class207 aClass207_73;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static final int anInt6145 = 1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z")
	public static boolean method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static493.method7228(arg1, arg0) | Static227.method3519(arg1, arg0) | Static628.method8886(arg0, arg1)) & Static122.method1869(arg0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!gba;I)V")
	public static void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22_Sub1 arg1) {
		Static66.anInt1360 = 0;
		Static340.aBoolean418 = false;
		Static65.method1094(arg1);
		Static458.method6828(arg1);
		if (Static340.aBoolean418) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt6629 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt6629 + " psize:" + arg0);
		}
	}
}
