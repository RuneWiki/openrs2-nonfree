import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public static int anInt2846;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_112 = new Class67(23, 2);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZB)V")
	public static void method2270(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static292.anInt4883++;
			Static283.method5887();
		}
		if (arg0) {
			Static23.anInt347++;
			Static371.method4829();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBII)V")
	public static void method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static88.anInt1187; local7++) {
			@Pc(13) Rectangle local13 = Class1_Sub29.aRectangleArray4[local7];
			if (local13.width + local13.x > arg1 && arg3 + arg1 > local13.x && local13.y + local13.height > arg0 && arg0 + arg2 > local13.y) {
				Static179.aBooleanArray69[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2275(@OriginalArg(1) Class1_Sub19 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static44.anInt634; local8++) {
			@Pc(14) int local14 = arg0.method2883();
			@Pc(18) int local18 = arg0.method2896();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static105.aClass239_Sub1Array2[local14] != null) {
				Static105.aClass239_Sub1Array2[local14].anInt6349 = local18;
			}
		}
	}
}
