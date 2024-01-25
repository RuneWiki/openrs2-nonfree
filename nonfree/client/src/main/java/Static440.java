import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
	public static boolean aBoolean586;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "[I")
	public static int[] anIntArray533;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "[[[Lclient!mf;")
	public static Class217[][][] aClass217ArrayArrayArray3;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "Lclient!vk;")
	public static Class359 aClass359_5;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "F")
	public static float aFloat192 = 0.0F;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	public static int anInt7805 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIII)V")
	public static void method6542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static404.aClass2_Sub13_2.aClass33_Sub1_5.method810() != 0 && arg3 != 0 && Static74.anInt1598 < 50 && arg1 != -1) {
			Static492.aClass208Array1[Static74.anInt1598++] = new Class208((byte) 1, arg1, arg3, arg2, arg0, arg5, arg4, null);
		}
	}
}
