import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "I")
	public static int anInt184;

	@OriginalMember(owner = "client!afa", name = "t", descriptor = "Lclient!gga;")
	public static Class124 aClass124_6;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_3 = new Class341(82, -1);

	@OriginalMember(owner = "client!afa", name = "m", descriptor = "Lclient!in;")
	public static final Class169 aClass169_8 = new Class169(16, 6);

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "[I")
	public static final int[] anIntArray4 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_4 = new Class341(36, 8);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z")
	public static boolean method169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static140.method7796(arg1, arg0) || Static612.method9197(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static318.method5257(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public static void method170(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static255.anInt4904 == 1) {
			Static435.aClass101_11.method8143(arg1, arg0, Static5.anInt88, Static590.anInt10296);
		} else {
			Static435.aClass101_11.method8143(arg1, arg0, 0, 0);
		}
	}
}
