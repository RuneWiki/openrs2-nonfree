import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!u;")
	public static final Class352 aClass352_5 = new Class352("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!vo;")
	public static Class381 aClass381_9 = null;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public static void method5224() {
		if (Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 0 && Static621.anInt9796 != Static504.anInt8428) {
			Static472.method7116(12, false, Static405.anInt9127, Static253.anInt4790);
		} else {
			Static32.method421(Static202.aClass75_5);
			if (Static504.anInt8428 != Static497.anInt8378) {
				Static183.method3450();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public static void method5225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static409.aClass75_13 == null) {
			return;
		}
		@Pc(16) int local16 = Static585.anInt9330;
		@Pc(18) int local18 = Static37.anInt497;
		Static466.method7050(arg1, arg0);
		if (Static290.anInt10204 == 0) {
			Static391.anInterface24_1 = null;
			Static391.anInterface24_1 = Static409.aClass75_13.method6641(Static409.aClass75_13.method6674(Static367.anInt6186, Static294.anInt5224), Static409.aClass75_13.method6683(Static367.anInt6186, Static294.anInt5224));
		} else if (Static290.anInt10204 == 1 && (Static25.anInterface24Array1 == null || local16 != Static585.anInt9330 || local18 != Static37.anInt497)) {
			Static25.anInterface24Array1 = new Interface24[Static37.anInt497 * Static585.anInt9330];
			for (@Pc(61) int local61 = 0; local61 < Static25.anInterface24Array1.length; local61++) {
				Static25.anInterface24Array1[local61] = Static409.aClass75_13.method6641(Static409.aClass75_13.method6674(Static662.anInt10244, Static682.anInt10442), Static409.aClass75_13.method6683(Static662.anInt10244, Static682.anInt10442));
			}
			Static20.anInt271 = 1;
			Static273.anIntArray276 = new int[Static585.anInt9330 * Static37.anInt497];
		}
		Static429.aBoolean549 = true;
	}
}
