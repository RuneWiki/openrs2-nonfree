import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray135;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
	public static int anInt6978 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg4) {
			Static400.method5423(arg1, arg5, arg3, arg0, arg6, arg2);
		} else if (Static83.anInt7380 <= arg1 - arg6 && arg1 + arg6 <= Static221.anInt4001 && arg0 - arg4 >= Static305.anInt5429 && Static212.anInt452 >= arg0 + arg4) {
			Static255.method3759(arg3, arg2, arg0, arg4, arg1, arg6, arg5);
		} else {
			Static30.method495(arg3, arg2, arg4, arg1, arg0, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)I")
	public static int method5452(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5453(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static460.method4220(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBII)V")
	public static void method5454(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static144.aFloat36 = local7;
		Static274.aFloat78 = local15;
		if (Static310.anInt5540 == 2) {
			Static239.anInt4284 = local7;
			Static94.anInt1775 = local15;
			Static454.anInt7852 = 0;
		}
		Static449.method6007();
		Static255.aBoolean311 = true;
	}
}
