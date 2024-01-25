import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static506 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_281 = new Class288(46, -1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	public static void method6919() {
		Static575.anInt9354 = 2;
		Static33.anInt738 = 0;
		Static468.anInt7474 = -1;
		Static317.anInt5047 = 1;
		Static527.aClass2_Sub13_Sub3_4 = null;
		Static93.aClass380_31 = null;
		Static74.anInt1268 = -1;
		Static140.aBoolean200 = false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZII)V")
	public static void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static234.aClass2_Sub5_48.aClass6_Sub22_5.method7291() != 0 && arg2 != 0 && Static270.anInt4355 < 50 && arg0 != -1) {
			Static81.aClass105Array1[Static270.anInt4355++] = new Class105((byte) 1, arg0, arg2, arg5, arg1, arg3, arg4, null);
		}
	}
}
