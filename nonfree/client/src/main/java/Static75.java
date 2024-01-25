import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "S")
	public static short aShort29 = 32767;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	public static final int anInt1565 = -14475237;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)V")
	public static void method1298(@OriginalArg(0) boolean arg0) {
		Static310.method5336();
		if (Static261.anInt5376 != 30 && Static261.anInt5376 != 25) {
			return;
		}
		Static32.anInt567++;
		if (Static32.anInt567 < 50 && !arg0) {
			return;
		}
		Static32.anInt567 = 0;
		if (!Static355.aBoolean556 && Static81.aClass202_3 != null) {
			Static305.aClass1_Sub21_Sub2_3.method5757(133);
			try {
				Static81.aClass202_3.method5480(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
			} catch (@Pc(58) IOException local58) {
				Static355.aBoolean556 = true;
			}
		}
		Static310.method5336();
	}
}
