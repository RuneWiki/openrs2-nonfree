import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public static int anInt6859 = 0;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
	public static final int[] anIntArray608 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_234 = new Class186(7, 2);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!jb;)V")
	public static void method5321(@OriginalArg(1) Class126 arg0) {
		if (Static411.anInt7007 != arg0.anInt3434) {
			return;
		}
		if (Static375.aClass6_Sub2_Sub1_Sub1_3.aString11 == null) {
			arg0.anInt3428 = 0;
			arg0.anInt3401 = 0;
			return;
		}
		arg0.anInt3393 = 150;
		arg0.anInt3408 = (int) (Math.sin((double) Static175.anInt3261 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt3439 = 5;
		arg0.anInt3428 = Static373.anInt6574;
		arg0.anInt3401 = Static189.method2799(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11);
		arg0.anInt3455 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6072;
		arg0.anInt3414 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6088;
		arg0.anInt3468 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6077;
		arg0.anInt3384 = 0;
	}
}
