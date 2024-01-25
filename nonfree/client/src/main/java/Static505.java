import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "J")
	public static long aLong250;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!nf;")
	public static Class102 aClass102_35;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[S")
	public static short[] aShortArray168;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public static int anInt8464;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_166 = new Class126(112, -2);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V")
	public static void method7159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static227.aClass3_Sub15_11.aClass17_Sub3_4.method741() != 0 && arg5 != 0 && Static228.anInt2286 < 50 && arg2 != -1) {
			Static631.aClass303Array2[Static228.anInt2286++] = new Class303((byte) 1, arg2, arg5, arg4, arg3, arg1, arg0, (Class23_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
	public static void method7160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static454.anInt7771 = arg3;
		Static581.anInt9233 = arg2;
		Static177.anInt3326 = arg0;
		Static321.anInt5975 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Z")
	public static boolean method7161() {
		if (Static133.aBoolean207) {
			try {
				if ((Boolean) Static685.method3974(Static287.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}
}
