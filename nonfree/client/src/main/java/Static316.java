import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
	public static int anInt6316;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
	public static int anInt6313 = 0;

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray81 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "J")
	public static volatile long aLong248 = 0L;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "Z")
	public static boolean aBoolean419 = true;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IS)Z")
	public static boolean method4772(@OriginalArg(1) short arg0) {
		if (arg0 == 38 || arg0 == 42 || arg0 == 25 || arg0 == 60 || arg0 == 57 || arg0 == 33 || arg0 == 11 || arg0 == 20) {
			return true;
		} else if (arg0 == 43 || arg0 == 16 || arg0 == 1001 || arg0 == 1010) {
			return true;
		} else if (arg0 == 21 || arg0 == 17 || arg0 == 22 || arg0 == 41 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 24 || arg0 == 9 || arg0 == 14 || arg0 == 47 || arg0 == 31;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BC)Z")
	public static boolean method4773(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!na;ILjava/lang/Object;)V")
	public static void method4774(@OriginalArg(0) Class112 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg0.anEventQueue1.peekEvent() != null; local12++) {
			Static312.method4734(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!th;ZII)Lclient!ml;")
	public static Class1_Sub3_Sub13 method4775(@OriginalArg(0) Class168 arg0, @OriginalArg(2) int arg1) {
		return Static131.method2257(0, arg0, arg1) ? Static210.method3368() : null;
	}
}
