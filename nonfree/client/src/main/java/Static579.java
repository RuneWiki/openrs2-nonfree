import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	public static int anInt10049 = 0;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!in;")
	public static final Class169 aClass169_243 = new Class169(110, 7);

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_97 = new Class341(68, 3);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method8748() {
		if (Static567.anInt9844 == -1) {
			return;
		}
		@Pc(12) int local12 = Static7.aClass6_1.method7048();
		@Pc(16) int local16 = Static7.aClass6_1.method7049();
		@Pc(21) Class2_Sub35 local21 = (Class2_Sub35) Static489.aClass271_50.method7177();
		if (local21 != null) {
			local12 = local21.method9186();
			local16 = local21.method9185();
		}
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (Static450.aBoolean606) {
			local38 = Static106.method1934();
			local40 = Static207.method3926();
		}
		Static424.method6957(local40, Static567.anInt9844, local16, local40, local40 + local16, local40 + Static19.anInt352, local38, local12 + local38, local12, local38, local38 + Static406.anInt7570);
		if (Static527.aClass357_137 != null) {
			Static551.method8456(local16 + local40, local12 + local38);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method8749(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static474.method7543(local6.height, local6.width);
		if (Static255.anInt4904 == 1) {
			Static435.aClass101_11.method8119(arg0, Static488.anInt8751, Static307.anInt5554);
		} else {
			Static435.aClass101_11.method8119(arg0, Static506.anInt8995, Static588.anInt10265);
		}
	}
}
