import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public static int anInt4130;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_20 = new Class130();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method3669(@OriginalArg(1) Class203 arg0) {
		if (Static295.anInt5344 != arg0.anInt5510) {
			return;
		}
		if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94 == null) {
			arg0.anInt5523 = 0;
			arg0.anInt5491 = 0;
			return;
		}
		arg0.anInt5521 = 150;
		arg0.anInt5465 = (int) (Math.sin((double) Static305.anInt5560 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt5523 = Static502.anInt8011;
		arg0.anInt5448 = 5;
		arg0.anInt5491 = Static128.method2550(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94);
		arg0.anInt5458 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6437;
		arg0.anInt5511 = 0;
		arg0.anInt5481 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6393;
		arg0.anInt5505 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6461;
		@Pc(75) Class17 local75 = arg0.anInt5505 == -1 ? null : Static330.aClass279_2.method6216(arg0.anInt5505);
		if (local75 != null) {
			Static435.method6109(arg0.anInt5458, local75);
		}
	}
}
