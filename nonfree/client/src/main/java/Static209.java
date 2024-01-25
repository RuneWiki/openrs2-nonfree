import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	public static int anInt3495;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
	public static int anInt3496;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
	public static final int[] anIntArray212 = new int[6];

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	public static int anInt3498 = -1;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public static int anInt3500 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZZZ)V")
	public static void method2788(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static404.anInt6788++;
			Static146.method2134();
		}
		if (arg0) {
			Static158.anInt2749++;
			Static180.method2463();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/Object;Lclient!gt;I)V")
	public static void method2789(@OriginalArg(0) Object arg0, @OriginalArg(1) Class93 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static140.method2004(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZIBII)V")
	public static void method2790(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static146.anInt2644 == 0) {
			Static182.method2493(false);
		} else {
			Static5.anInt89 = Static146.anInt2644;
			Static243.method3143(0);
		}
		Static108.aBoolean130 = arg0;
		Static341.anInt5585 = arg3;
		Static252.anInt4102 = arg2;
		Static98.method2667(arg1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V")
	public static void method2792(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(3, arg0);
		local8.method3024();
	}
}
