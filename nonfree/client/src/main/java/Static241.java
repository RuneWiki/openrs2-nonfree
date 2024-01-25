import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public static int anInt4516;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!lb;")
	public static Class221 aClass221_74;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt4521;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_79 = new Class186(77, 1);

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public static final int anInt4520 = 1337;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!av;B)V")
	public static void method3698(@OriginalArg(0) Class20 arg0) {
		if (arg0.anInt552 != Static17.anInt292) {
			return;
		}
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109 == null) {
			arg0.anInt570 = 0;
			arg0.anInt520 = 0;
			return;
		}
		arg0.anInt511 = 150;
		arg0.anInt573 = (int) (Math.sin((double) Static269.anInt4883 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt520 = Static584.anInt9539;
		arg0.anInt568 = 5;
		arg0.anInt570 = Static456.method6763(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109);
		@Pc(50) Class100 local50 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass100_8;
		if (local50 == null) {
			arg0.aClass100_1 = null;
			return;
		}
		if (arg0.aClass100_1 == null) {
			arg0.aClass100_1 = new Class100_Sub2();
		}
		arg0.anInt538 = local50.method8976();
		arg0.aClass100_1.method8966(local50);
	}
}
