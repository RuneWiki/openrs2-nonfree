import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!co", name = "u", descriptor = "[Lclient!rr;")
	public static Class15_Sub1[] aClass15_Sub1Array2;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "Lclient!dda;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	public static int anInt2331;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_23 = new Class71(35, 6);

	@OriginalMember(owner = "client!co", name = "v", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBIII)V")
	public static void method1967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static259.anInt5574; local15++) {
			@Pc(21) Rectangle local21 = Class8_Sub5_Sub1_Sub2.aRectangleArray2[local15];
			if (local21.width + local21.x > arg2 && arg2 + arg1 > local21.x && local21.height + local21.y > arg3 && arg3 + arg0 > local21.y) {
				Static620.aBooleanArray29[local15] = true;
			}
		}
		Static460.method6945(arg3, arg3 + arg0, arg2, arg2 + arg1);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	public static void method1968() {
		@Pc(7) Class123[] local7 = Class20_Sub2.aClass123Array1;
		synchronized (Class20_Sub2.aClass123Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class20_Sub2.aClass123Array1.length; local11++) {
				Class20_Sub2.aClass123Array1[local11] = new Class123();
				Static237.anIntArray314[local11] = 0;
			}
		}
	}
}
