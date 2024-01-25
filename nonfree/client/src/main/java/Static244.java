import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "J")
	public static long aLong136;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public static int anInt3907 = -50;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_61 = new Class134("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
	public static final int[] anIntArray337 = new int[2];

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
	public static int anInt3914 = 0;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "[I")
	public static final int[] anIntArray338 = new int[5];

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public static void method3095() {
		for (@Pc(10) Class2_Sub8 local10 = (Class2_Sub8) Static225.aClass156_28.method3155(); local10 != null; local10 = (Class2_Sub8) Static225.aClass156_28.method3150()) {
			if (local10.anInt834 == -1) {
				local10.anInt832 = 0;
				if (local10.anInt827 >= 0 && local10.anInt826 >= 0 && Static166.anInt2852 > local10.anInt827 && Static426.anInt6923 > local10.anInt826) {
					Static181.method2508(local10);
				}
			} else {
				local10.method5703();
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)Z")
	public static boolean method3100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static225.method2960(arg1, arg0) | (arg0 & 0x10000) != 0 || Static387.method4962(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static261.method1844(arg0, arg1);
		}
	}
}
