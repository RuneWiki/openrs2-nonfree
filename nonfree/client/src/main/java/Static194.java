import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!hq", name = "F", descriptor = "Lclient!fl;")
	public static Class45 aClass45_2;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "Lclient!dk;")
	public static final Class68 aClass68_2 = new Class68();

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_79 = new Class40(20, -1);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2914(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)V")
	public static void method2915() {
		if (Static147.aFrame1 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static183.aFrame2 != null) {
			local14 = Static183.aFrame2;
		} else if (Static189.anApplet4 == null) {
			local14 = Static2.anApplet_Sub1_1;
		} else {
			local14 = Static189.anApplet4;
		}
		Static544.anInt9196 = local14.getSize().width;
		Static371.anInt6408 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (Static183.aFrame2 == local14) {
			local36 = Static183.aFrame2.getInsets();
			Static371.anInt6408 -= local36.top + local36.bottom;
			Static544.anInt9196 -= local36.left + local36.right;
		}
		if (Static354.method5293() == 1) {
			Static141.anInt2538 = 0;
			Static476.anInt8045 = Static381.anInt6587;
			Static502.anInt8364 = Static282.anInt4679;
			Static411.anInt7204 = (Static544.anInt9196 - Static282.anInt4679) / 2;
		} else {
			Static201.method5199();
		}
		if (Static376.aClass287_6 != Static192.aClass287_3) {
			@Pc(89) boolean local89;
			if (Static502.anInt8364 < 1024 && Static476.anInt8045 < 768) {
				local89 = true;
			} else {
				local89 = false;
			}
		}
		Static34.aCanvas15.setSize(Static502.anInt8364, Static476.anInt8045);
		if (Static176.aClass121_5 != null) {
			Static176.aClass121_5.method7156(Static34.aCanvas15);
		}
		if (Static183.aFrame2 == local14) {
			local36 = Static183.aFrame2.getInsets();
			Static34.aCanvas15.setLocation(local36.left + Static411.anInt7204, Static141.anInt2538 + local36.top);
		} else {
			Static34.aCanvas15.setLocation(Static411.anInt7204, Static141.anInt2538);
		}
		if (Static487.anInt8139 != -1) {
			Static59.method46(true);
		}
		Static149.method2202();
	}
}
