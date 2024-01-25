import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_138 = new Class209("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	public static int anInt5952 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public static void method4780() {
		Static195.aClass49_5.B(((float) Static12.aClass79_Sub1_1.anInt4928 * 0.1F + 0.7F) * 1.1523438F);
		Static195.aClass49_5.T(Static380.anInt6431, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static195.aClass49_5.UA(Static387.anInt6504, -1, 256);
		Static195.aClass49_5.method4470(Static164.aClass155_2);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!gl;IFFIIIFIFF)[B")
	public static byte[] method4781(@OriginalArg(0) Class87 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static180.method2889(arg2, arg5, arg4, arg3, arg0, 0, local10, arg1);
		return local10;
	}
}
