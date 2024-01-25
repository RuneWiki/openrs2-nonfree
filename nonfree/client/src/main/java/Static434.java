import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static434 {

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	public static int anInt7554 = 0;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	public static int anInt7559 = -1;

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZZIIIII)V")
	public static void method5820(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static398.anInt7110 = arg5;
		Static322.anInt4035 = arg1;
		Static68.anInt1239 = arg4;
		Static224.anInt3893 = arg2;
		Static229.anInt3930 = arg3;
		if (arg0 && Static398.anInt7110 >= 100) {
			Static4.anInt149 = Static322.anInt4035 * 128 + 64;
			Static302.anInt5030 = Static229.anInt3930 * 128 + 64;
			Static264.anInt4481 = Static405.method5510(Static4.anInt149, Static302.anInt5030, Static1.anInt41) - Static224.anInt3893;
		}
		Static57.anInt883 = 2;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method5821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static362.method5162(arg1, arg0) | Static411.method5583(arg1, arg0) | Static18.method240(arg1, arg0)) & Static407.method5534(arg1, arg0);
	}
}
