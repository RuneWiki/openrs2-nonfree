import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
	public static int anInt4798 = 0;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_4 = new Class91("", 13);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
	public static void method4024() {
		Static148.aClass95_1.method6523();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static37.aLongArray2[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static477.aLongArray27[local22] = 0L;
		}
		Static104.anInt2323 = 0;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method4025(@OriginalArg(1) Class5 arg0) {
		if (Static131.aClass71_22.method2077() == 0) {
			return;
		}
		@Pc(21) Class3_Sub36 local21;
		if (Static382.anInt7091 == 0) {
			for (local21 = (Class3_Sub36) Static131.aClass71_22.method2089(); local21 != null; local21 = (Class3_Sub36) Static131.aClass71_22.method2086()) {
				Static99.aClass96_7.method2502(arg0, local21.aBoolean425 ? Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 : null, arg0, false, local21.anInt6681, local21.anInt6674, local21.anInt6683, false, local21.anInt6682, local21.anInt6680, Static364.aClass59_3);
				local21.method7820();
			}
			Static403.method6133();
			return;
		}
		if (Static393.aClass5_11 == null) {
			@Pc(68) Canvas local68 = new Canvas();
			local68.setSize(36, 32);
			Static393.aClass5_11 = Static341.method7477(0, 0, Static202.anInterface4_10, local68, Static243.aClass161_54);
			Static506.aClass59_4 = Static393.aClass5_11.method7414(Static377.method5901(Static62.aClass161_105, Static368.anInt6881), Static551.method526(Static19.aClass161_7, Static368.anInt6881));
		}
		for (local21 = (Class3_Sub36) Static131.aClass71_22.method2089(); local21 != null; local21 = (Class3_Sub36) Static131.aClass71_22.method2086()) {
			Static99.aClass96_7.method2502(Static393.aClass5_11, local21.aBoolean425 ? Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 : null, arg0, false, local21.anInt6681, local21.anInt6674, local21.anInt6683, false, local21.anInt6682, local21.anInt6680, Static506.aClass59_4);
			local21.method7820();
		}
	}
}
