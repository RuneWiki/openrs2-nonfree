import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static480 {

	@OriginalMember(owner = "client!qja", name = "u", descriptor = "Lclient!nba;")
	public static Class5_Sub2_Sub13 aClass5_Sub2_Sub13_4;

	@OriginalMember(owner = "client!qja", name = "A", descriptor = "I")
	public static int anInt4486;

	@OriginalMember(owner = "client!qja", name = "E", descriptor = "Lclient!rc;")
	public static Class298 aClass298_2;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BI)Lclient!ra;")
	public static Class295 method3952(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static69.aClass295Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIBI)V")
	public static void method3954(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static651.anInt10267 = arg0;
		Static361.anInt6317 = 0;
		Static380.anInt6585 = arg1;
		Static128.anInt2200 = 0;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZII)Z")
	public static boolean method3955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
