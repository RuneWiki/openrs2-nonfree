import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ci", name = "rb", descriptor = "[Lclient!i;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!ci", name = "ub", descriptor = "I")
	public static int anInt1579;

	@OriginalMember(owner = "client!ci", name = "wb", descriptor = "Lclient!fh;")
	public static Class98 aClass98_3;

	@OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_41 = new Class56(87, 4);

	@OriginalMember(owner = "client!ci", name = "sb", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_15 = new Class112();

	@OriginalMember(owner = "client!ci", name = "vb", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ci", name = "xb", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_20 = new Class303(53, -1);

	@OriginalMember(owner = "client!ci", name = "yb", descriptor = "[I")
	public static final int[] anIntArray69 = new int[1];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!r;)V")
	public static void method1485(@OriginalArg(1) Class45 arg0) {
		if (Static488.aClass112_58.method3083() == 0) {
			return;
		}
		@Pc(55) Class3_Sub44 local55;
		if (Static60.anInt1312 == 0) {
			for (local55 = (Class3_Sub44) Static488.aClass112_58.method3088(); local55 != null; local55 = (Class3_Sub44) Static488.aClass112_58.method3084()) {
				Static6.aClass92_1.method2676(local55.anInt7905, arg0, local55.anInt7906, false, Static544.aClass54_15, local55.anInt7903, local55.aBoolean618 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 : null, false, arg0, local55.anInt7901, local55.anInt7904);
				local55.method7825();
			}
			Static238.method3668();
			return;
		}
		if (Static260.aClass45_8 == null) {
			@Pc(25) Canvas local25 = new Canvas();
			local25.setSize(36, 32);
			Static260.aClass45_8 = Static448.method7375(0, 0, Static173.anInterface3_6, local25, Static128.aClass322_51);
			Static90.aClass54_6 = Static260.aClass45_8.method7394(Static403.method5839(Static154.aClass322_61, Static132.anInt9450), Static604.method6156(Static552.aClass322_150, Static132.anInt9450));
		}
		for (local55 = (Class3_Sub44) Static488.aClass112_58.method3088(); local55 != null; local55 = (Class3_Sub44) Static488.aClass112_58.method3084()) {
			Static6.aClass92_1.method2676(local55.anInt7905, Static260.aClass45_8, local55.anInt7906, false, Static90.aClass54_6, local55.anInt7903, local55.aBoolean618 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 : null, false, arg0, local55.anInt7901, local55.anInt7904);
			local55.method7825();
		}
	}
}
