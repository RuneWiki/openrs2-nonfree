import java.awt.Canvas;
import java.awt.Dimension;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
	public static int anInt1585;

	@OriginalMember(owner = "client!cq", name = "P", descriptor = "[Lclient!f;")
	public static Class11_Sub4[] aClass11_Sub4Array1;

	@OriginalMember(owner = "client!cq", name = "ab", descriptor = "I")
	public static int anInt1590;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I")
	public static int method1373(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public static void method1380() throws IOException {
		if (Static439.aClass210_1 == null || Static423.anInt10048 <= 0) {
			return;
		}
		@Pc(8) int local8 = 0;
		while (true) {
			@Pc(13) Class2_Sub50 local13 = (Class2_Sub50) Static377.aClass238_40.method5833();
			if (local13 == null) {
				Static362.anInt6546 = 0;
				Static67.anInt1404 += local8;
				break;
			}
			Static439.aClass210_1.method8027(local13.anInt9982, local13.aClass2_Sub34_Sub2_2.aByteArray77);
			local8 += local13.anInt9982;
			Static423.anInt10048 -= local13.anInt9982;
			local13.method8599();
			local13.aClass2_Sub34_Sub2_2.method6915();
			local13.method8352();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!eq;ILclient!d;II)Lclient!ha;")
	public static Class87 method1381(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg0 != null) {
			@Pc(12) Dimension local12 = arg0.getSize();
			local5 = local12.width;
			local7 = local12.height;
		}
		return Static195.method7941(arg3, local7, arg4, arg0, arg1, local5, arg2);
	}
}
