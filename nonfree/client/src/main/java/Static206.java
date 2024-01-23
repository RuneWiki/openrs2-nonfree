import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt4044;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_125;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "Lclient!od;")
	public static Class4_Sub2_Sub15 aClass4_Sub2_Sub15_5;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public static int anInt4048 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!tk;IIIII)Ljava/awt/Frame;")
	public static Frame method3287(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method3940()) {
			return null;
		}
		@Pc(26) Class76[] local26 = Static14.method1605(arg0);
		if (local26 == null) {
			return null;
		}
		@Pc(32) boolean local32 = false;
		for (@Pc(34) int local34 = 0; local34 < local26.length; local34++) {
			if (arg3 == local26[local34].anInt2653 && arg2 == local26[local34].anInt2645 && (!local32 || local26[local34].anInt2647 > arg1)) {
				arg1 = local26[local34].anInt2647;
				local32 = true;
			}
		}
		if (!local32) {
			return null;
		}
		@Pc(103) Class123 local103 = arg0.method3945(arg3, arg2, arg1);
		while (local103.anInt3791 == 0) {
			Static122.method2061(10L);
		}
		@Pc(118) Frame local118 = (Frame) local103.anObject4;
		if (local118 == null) {
			return null;
		} else if (local103.anInt3791 == 2) {
			Static168.method2659(arg0, local118);
			return null;
		} else {
			return local118;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!lc;)Z")
	public static boolean method3288(@OriginalArg(1) Class98 arg0) {
		return arg0.method2391(Static183.anInt3584);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method3289() {
		aClass4_Sub2_Sub15_5 = null;
		aClass98_125 = null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)V")
	public static void method3290(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub2_Sub21 local16 = Static39.method4121(arg0, 7);
		local16.method4361();
	}
}
