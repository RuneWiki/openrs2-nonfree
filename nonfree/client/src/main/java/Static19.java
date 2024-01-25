import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_1 = new Class200(1, 6);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qk;B)V")
	public static void method899(@OriginalArg(0) Class279 arg0) {
		if (arg0.anInt8137 != Static368.anInt6961) {
			return;
		}
		if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63 == null) {
			arg0.anInt8214 = 0;
			arg0.anInt8142 = 0;
			return;
		}
		arg0.anInt8218 = 150;
		arg0.anInt8188 = (int) (Math.sin((double) Static101.anInt2262 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt8214 = Static97.anInt2234;
		arg0.anInt8152 = 5;
		arg0.anInt8142 = Static142.method7673(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63);
		arg0.anInt8175 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5743;
		arg0.anInt8145 = 0;
		arg0.anInt8135 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.lb;
		arg0.anInt8179 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5709;
		@Pc(77) Class361 local77 = arg0.anInt8175 == -1 ? null : Static115.aClass227_1.method5968(arg0.anInt8175);
		if (local77 != null) {
			Static146.method2678(local77, arg0.anInt8135);
		}
	}
}
