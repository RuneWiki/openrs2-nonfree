import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
	public static int anInt10419 = -1;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method8693(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static290.method8315(local6.height, local6.width);
		if (Static634.anInt10113 == 1) {
			Static371.aClass143_7.method6266(arg0, Static275.anInt4317, Static584.anInt9612);
		} else {
			Static371.aClass143_7.method6266(arg0, Static630.anInt10065, Static622.anInt9017);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V")
	public static void method8699() {
		Static227.aClass394ArrayArray2 = new Class394[Static342.aClass50_98.method902()][];
		Static69.aClass394ArrayArray1 = new Class394[Static342.aClass50_98.method902()][];
		Static68.aBooleanArray1 = new boolean[Static342.aClass50_98.method902()];
	}

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)V")
	public static void method8704() {
		if (Static563.aClass143_13.method6269()) {
			Static563.aClass143_13.method6195(Static105.aCanvas2);
			Static113.method1829();
			if (Static305.aBoolean315) {
				Static553.method7611(Static105.aCanvas2);
			} else {
				@Pc(24) Dimension local24 = Static105.aCanvas2.getSize();
				Static563.aClass143_13.method6261(Static105.aCanvas2, local24.width, local24.height);
			}
			Static563.aClass143_13.method6270(Static105.aCanvas2);
		} else {
			Static75.method1101(false, Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836());
		}
		Static212.method3058();
		Static677.aBoolean794 = true;
	}
}
