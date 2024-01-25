import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!js", name = "H", descriptor = "I")
	public static int anInt3088;

	@OriginalMember(owner = "client!js", name = "P", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "[I")
	public static final int[] anIntArray357 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!qn;")
	public static Class123 method2719(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class123_Sub1");
			@Pc(18) Class123 local18 = (Class123) local6.getDeclaredConstructor().newInstance();
			local18.method5332(arg0);
			return local18;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class123_Sub2 local29 = new Class123_Sub2();
			local29.method5332(arg0);
			return local29;
		}
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(III)V")
	public static void method2721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class102 local9 = Static280.aClass102ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static22.anInt293 = local9.anInt2512;
			Static176.anInt3533 = local9.anInt2509;
			Static380.anInt6377 = local9.anInt2511;
		}
		Static358.method5349();
	}
}
