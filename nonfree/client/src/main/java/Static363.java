import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public static int anInt6512 = 0;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_209 = new Class175("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	public static int anInt6517 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
	public static void method5126(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub3_Sub7 local12 = Static139.method2522(6, arg0);
		local12.method1563();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!hs;Ljava/lang/Object;I)V")
	public static void method5127(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static135.method2458(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method5129(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static348.method5833(arg1, arg0.length - 1, arg0, 0);
	}
}
