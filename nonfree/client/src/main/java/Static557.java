import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!taa", name = "x", descriptor = "I")
	public static int anInt9339;

	@OriginalMember(owner = "client!taa", name = "A", descriptor = "I")
	public static int anInt9342;

	@OriginalMember(owner = "client!taa", name = "C", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
	public static int anInt9343;

	@OriginalMember(owner = "client!taa", name = "E", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_320 = new Class179(97, 10);

	@OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
	public static int anInt9345 = -2;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7880(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static679.method1563(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZIZ)V")
	public static void method7881(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static251.anInt4335--;
			if (Static251.anInt4335 == 0) {
				Static70.anIntArray71 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static455.anInt7604--;
		if (Static455.anInt7604 == 0) {
			Static310.anIntArray309 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public static void method7883() {
		Static25.method2636();
		Static232.method3400(Static96.aClass6_Sub22_7.aClass29_Sub24_1.method7431() == 1);
		Static231.aClass64_2 = Static539.method7688(22050, Static569.aClass380_6, 0, Static140.aCanvas1);
		Static92.method1535(Static633.method8702((Class6_Sub8_Sub4) null));
		Static165.aClass64_1 = Static539.method7688(2048, Static569.aClass380_6, 1, Static140.aCanvas1);
		Static165.aClass64_1.method1730(Static106.aClass6_Sub8_Sub3_2);
	}
}
