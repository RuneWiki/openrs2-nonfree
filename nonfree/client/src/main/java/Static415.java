import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public static int anInt7240 = 0;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
	public static boolean aBoolean464 = false;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method5604(@OriginalArg(1) Class39_Sub5 arg0) {
		arg0.aClass26_Sub2_Sub2_1 = null;
		if (Static224.anInt4034 < 20) {
			Static175.aClass188_5.method4538(arg0);
			Static224.anInt4034++;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ss;I)V")
	public static void method5605(@OriginalArg(0) Class219 arg0) {
		if (arg0.anInt6384 != Static309.anInt2247) {
			return;
		}
		if (Static196.aClass26_Sub2_Sub2_Sub1_1.aString51 == null) {
			arg0.anInt6410 = 0;
			arg0.anInt6353 = 0;
			return;
		}
		arg0.anInt6423 = 150;
		arg0.anInt6395 = (int) (Math.sin((double) Static403.anInt6978 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6353 = Static453.anInt7845;
		arg0.anInt6366 = 5;
		arg0.anInt6410 = Static61.method1098(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51);
		arg0.anInt6417 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7122;
		arg0.anInt6396 = 0;
		arg0.anInt6425 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7082;
		arg0.anInt6420 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7121;
	}
}
