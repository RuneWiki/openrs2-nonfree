import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Lclient!de;")
	public static final Class50 aClass50_29 = new Class50(13, 0, 1, 0);

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "[I")
	public static int[] anIntArray635 = new int[2];

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public static int anInt7180 = 2;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public static void method5641() {
		Static457.aBoolean532 = true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!dk;Lclient!za;)V")
	public static void method5643(@OriginalArg(1) Class54 arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(10) Class17[] local10 = Static461.method256(arg0, Static355.anInt6510);
		Static222.aClass13Array19 = new Class13[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static222.aClass13Array19[local16] = arg1.method5549(local10[local16]);
		}
		local10 = Static461.method256(arg0, Static409.anInt6680);
		Static295.aClass13Array16 = new Class13[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static295.aClass13Array16[local47] = arg1.method5549(local10[local47]);
		}
		local10 = Static461.method256(arg0, Static348.anInt5916);
		Static323.aClass13Array7 = new Class13[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static323.aClass13Array7[local74] = arg1.method5549(local10[local74]);
		}
		local10 = Static461.method256(arg0, Static120.anInt2214);
		Static303.aClass13Array17 = new Class13[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static303.aClass13Array17[local101] = arg1.method5549(local10[local101]);
		}
		local10 = Static461.method256(arg0, Static108.anInt2054);
		Static32.aClass13Array1 = new Class13[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static32.aClass13Array1[local128] = arg1.method5549(local10[local128]);
		}
		local10 = Static461.method256(arg0, Static296.anInt4823);
		Static84.aClass13Array4 = new Class13[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static84.aClass13Array4[local155] = arg1.method5549(local10[local155]);
		}
		local10 = Static461.method256(arg0, Static383.anInt6325);
		Static385.aClass13Array20 = new Class13[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static385.aClass13Array20[local186] = arg1.method5549(local10[local186]);
		}
		local10 = Static461.method256(arg0, Static390.anInt6831);
		Static65.aClass13Array3 = new Class13[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static65.aClass13Array3[local217] = arg1.method5549(local10[local217]);
		}
		local10 = Static461.method256(arg0, Static306.anInt5284);
		Static231.aClass13Array12 = new Class13[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static231.aClass13Array12[local244] = arg1.method5549(local10[local244]);
		}
		local10 = Static461.method256(arg0, Static99.anInt1891);
		Static415.aClass13Array22 = new Class13[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static415.aClass13Array22[local275] = arg1.method5549(local10[local275]);
		}
		local10 = Static461.method256(arg0, Static440.anInt7084);
		Static61.aClass13Array2 = new Class13[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static61.aClass13Array2[local306] = arg1.method5549(local10[local306]);
		}
		local10 = Static461.method256(arg0, Static68.anInt4930);
		Static108.aClass13Array5 = new Class13[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static108.aClass13Array5[local337] = arg1.method5549(local10[local337]);
		}
		Static176.aClass13_2 = arg1.method5549(Static461.method262(arg0, Static284.anInt4625, 0));
		Static143.aClass13_11 = arg1.method5549(Static461.method262(arg0, Static84.anInt1559, 0));
		local10 = Static461.method256(arg0, Static12.anInt170);
		Static410.aClass13Array21 = new Class13[local10.length];
		for (@Pc(380) int local380 = 0; local380 < local10.length; local380++) {
			Static410.aClass13Array21[local380] = arg1.method5549(local10[local380]);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
	public static boolean method5645() {
		return Static137.anInt6647 > 0;
	}
}
