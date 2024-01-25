import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static229 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "J")
	public static long aLong123;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!tj;")
	public static Class330 aClass330_2;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	public static int anInt3963;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_87 = new Class136(36, 6);

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public static int anInt3965 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Z")
	public static boolean method3587(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!bha;Z)V")
	public static void method3588(@OriginalArg(0) Class14_Sub4 arg0) {
		arg0.aClass14_Sub1_Sub1_Sub3_1 = null;
		if (Static576.anInt9477 < 20) {
			Static219.aClass363_4.method8480(arg0);
			Static576.anInt9477++;
		}
	}
}
