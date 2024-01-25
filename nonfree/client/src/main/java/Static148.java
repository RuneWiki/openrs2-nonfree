import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_29 = new Class387(48, 4);

	@OriginalMember(owner = "client!er", name = "x", descriptor = "I")
	public static int anInt2385 = 0;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	public static int anInt2388 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static109.method1569(0, arg0, arg2, arg3, arg4, arg5, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FIFIFFIFILclient!jf;I)[B")
	public static byte[] method2089(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) Class186 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static521.method7547(arg1, arg4, arg2, local10, arg3, arg5, 0, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!la;IZIZII)V")
	public static void method2090(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= 0) {
			Static335.method5111(arg1, arg0, arg3);
			return;
		}
		Static389.aBoolean509 = false;
		Static622.aClass5_Sub16_Sub4_8 = null;
		Static496.anInt8290 = 1;
		Static144.anInt2320 = 0;
		Static609.anInt10105 = arg1;
		Static659.aClass208_145 = arg0;
		Static508.anInt8709 = arg3;
		Static212.anInt3461 = Static28.aClass5_Sub16_Sub4_6.method6409() / arg2;
		if (Static212.anInt3461 < 1) {
			Static212.anInt3461 = 1;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)Z")
	public static boolean method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static114.method1638(arg0, arg1) | (arg0 & 0x70000) != 0 || Static38.method660(arg1, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([JI[I)V")
	public static void method2092(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static613.method8707(arg0, arg0.length - 1, arg1, 0);
	}
}
