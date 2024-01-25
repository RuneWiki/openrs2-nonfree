import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!os", name = "j", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_11 = new Class113(3, 7);

	@OriginalMember(owner = "client!os", name = "k", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_131 = new Class363(83, 4);

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	public static void method4078() {
		Static515.aClass351Array1 = new Class351[50];
		Static245.anInt4559 = 0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!kp;I)V")
	public static void method4079(@OriginalArg(0) Class196 arg0) {
		if (arg0.anInt5090 != Static493.anInt8312) {
			return;
		}
		if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67 == null) {
			arg0.anInt5132 = 0;
			arg0.anInt5102 = 0;
			return;
		}
		arg0.anInt5144 = 150;
		arg0.anInt5133 = (int) (Math.sin((double) Static412.anInt575 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt5132 = Static222.anInt4184;
		arg0.anInt5085 = 5;
		arg0.anInt5102 = Static200.method3285(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67);
		arg0.anInt5147 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7399;
		arg0.anInt5103 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7419;
		arg0.anInt5101 = 0;
		arg0.anInt5087 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7379;
		@Pc(71) Class84 local71 = arg0.anInt5103 == -1 ? null : Static116.aClass140_2.method3287(arg0.anInt5103);
		if (local71 != null) {
			Static58.method951(local71, arg0.anInt5087);
		}
	}
}
