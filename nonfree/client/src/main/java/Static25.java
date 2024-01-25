import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Lclient!gba;")
	public static Class125 aClass125_3;

	@OriginalMember(owner = "client!at", name = "b", descriptor = "[I")
	public static final int[] anIntArray57 = new int[14];

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_2 = new Class184(5, 1);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ha;IZIIII)V")
	public static void method594(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static403.aClass20_30 == null || Static405.aClass20_31 == null || Static202.aClass20_8 == null) && Static594.aClass97_144.method2564(Static570.anInt9389) && Static594.aClass97_144.method2564(Static182.anInt4015) && Static594.aClass97_144.method2564(Static479.anInt9938)) {
			@Pc(25) Class120 local25 = Static647.method3070(Static594.aClass97_144, Static182.anInt4015, 0);
			Static405.aClass20_31 = arg0.method7969(local25, true);
			local25.method3072();
			Static280.aClass20_13 = arg0.method7969(local25, true);
			Static403.aClass20_30 = arg0.method7969(Static647.method3070(Static594.aClass97_144, Static570.anInt9389, 0), true);
			@Pc(50) Class120 local50 = Static647.method3070(Static594.aClass97_144, Static479.anInt9938, 0);
			Static202.aClass20_8 = arg0.method7969(local50, true);
			local50.method3072();
			Static318.aClass20_27 = arg0.method7969(local50, true);
		}
		if (Static403.aClass20_30 == null || Static405.aClass20_31 == null || Static202.aClass20_8 == null) {
			return;
		}
		@Pc(88) int local88 = (arg3 - Static202.aClass20_8.method4579() * 2) / Static403.aClass20_30.method4579();
		for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
			Static403.aClass20_30.method4582(arg4 + Static202.aClass20_8.method4579() + local90 * Static403.aClass20_30.method4579(), -Static403.aClass20_30.method4595() + arg1 + arg2);
		}
		@Pc(126) int local126 = (arg1 - Static202.aClass20_8.method4595() - 20) / Static405.aClass20_31.method4595();
		for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
			Static405.aClass20_31.method4582(arg4, local128 * Static405.aClass20_31.method4595() + arg2 + 20);
			Static280.aClass20_13.method4582(arg3 + arg4 - Static280.aClass20_13.method4579(), Static405.aClass20_31.method4595() * local128 + 20 + arg2);
		}
		Static202.aClass20_8.method4582(arg4, arg2 + arg1 - Static202.aClass20_8.method4595());
		Static318.aClass20_27.method4582(arg4 + arg3 - Static202.aClass20_8.method4579(), arg2 + (arg1 - Static202.aClass20_8.method4595()));
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/awt/Rectangle;BI)V")
	public static void method595(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static244.anInt4841 == 1) {
			Static167.aClass87_3.method7963(arg0, arg1, Static134.anInt3047, Static183.anInt4032);
		} else {
			Static167.aClass87_3.method7963(arg0, arg1, 0, 0);
		}
	}
}
