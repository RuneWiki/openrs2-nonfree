import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_15 = new Class66(16);

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_75 = new Class151(65, -1);

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "[[B")
	public static final byte[][] aByteArrayArray11 = new byte[1000][];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
	public static void method3004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static73.anInt1542 && arg1 <= Static527.anInt8177) {
			@Pc(15) int local15 = Static385.method4989(Static472.anInt7503, arg3, Static257.anInt4172);
			@Pc(21) int local21 = Static385.method4989(Static472.anInt7503, arg2, Static257.anInt4172);
			Static535.method7191(arg0, local15, arg1, local21);
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
	public static void method3005() {
		Static14.aClass221Array1 = null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Z")
	public static boolean method3007(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 19 || arg0 == 3 || arg0 == 2 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 1011;
		}
	}
}
