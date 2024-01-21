import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
	public static int anInt2516 = 0;

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
	public static int anInt2517 = 0;

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "J")
	public static volatile long aLong74 = 0L;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	public static void method1862() {
		anIntArrayArray22 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!gg;ILjava/lang/Object;)V")
	public static void method1863(@OriginalArg(0) Class32 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static24.method517(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!rf;I)V")
	public static void method1864(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1) {
		Static131.aClass1_Sub9_Sub1_3.method1283(71);
		Static131.aClass1_Sub9_Sub1_3.method1237(arg0.method2925());
		Static131.aClass1_Sub9_Sub1_3.method1267(arg1);
	}
}
