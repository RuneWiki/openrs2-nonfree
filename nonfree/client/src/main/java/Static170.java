import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "[Lclient!haa;")
	public static Class4_Sub3[] aClass4_Sub3Array3;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public static int anInt2634 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(CLjava/lang/String;Z)I")
	public static int method2462(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!kja;I)V")
	public static void method2464(@OriginalArg(0) Class204 arg0) {
		Static581.aClass204_2 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZIIZ)V")
	public static void method2465(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static362.method4762(arg3, arg2, arg1, arg0, 0, Static545.aClass169_Sub1Array2.length - 1);
		Static418.aClass14_Sub47_2 = null;
		Static501.anInt8735 = 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method2466(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static471.method7069(local6.width, local6.height);
		if (Static18.anInt243 == 1) {
			Static22.aClass144_1.method6888(arg0, Static187.anInt3099, Static347.anInt5886);
		} else {
			Static22.aClass144_1.method6888(arg0, Static453.anInt7570, Static649.anInt10660);
		}
	}
}
