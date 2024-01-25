import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "Lclient!in;")
	public static Class157 aClass157_177;

	@OriginalMember(owner = "client!mha", name = "k", descriptor = "Lclient!sd;")
	public static final Class309 aClass309_8 = new Class309();

	@OriginalMember(owner = "client!mha", name = "q", descriptor = "[I")
	public static final int[] anIntArray435 = new int[1];

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(II)Z")
	public static boolean method5942(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZILclient!d;ILjava/awt/Canvas;Lclient!in;)Lclient!ha;")
	public static Class20 method5945(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class157 arg4) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		if (arg3 != null) {
			@Pc(17) Dimension local17 = arg3.getSize();
			local12 = local17.height;
			local10 = local17.width;
		}
		return Static199.method7295(arg2, local12, local10, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V")
	public static void method5947() {
		Static341.aClass2_Sub8_Sub3_4.method5819();
		Static603.aClass2_Sub8_Sub3_5 = null;
		Static614.anInt10750 = 1;
		Static42.aClass157_33 = null;
	}
}
