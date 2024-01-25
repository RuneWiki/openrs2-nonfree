import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger27 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "Lclient!hb;")
	public static final Class146 aClass146_8 = new Class146();

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "Lclient!ifa;")
	public static final Class175 aClass175_5 = new Class175();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIBI)V")
	public static void method7560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static172.anInt2988; local3++) {
			@Pc(9) Rectangle local9 = Class11_Sub12.aRectangleArray1[local3];
			if (local9.width + local9.x > arg1 && local9.x < arg1 + arg2 && local9.height + local9.y > arg0 && local9.y < arg0 + arg3) {
				Static356.aBooleanArray26[local3] = true;
			}
		}
		Static5.method72(arg0 + arg3, arg0, arg1 + arg2, arg1);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/Object;Lclient!vo;B)V")
	public static void method7564(@OriginalArg(0) Object arg0, @OriginalArg(1) Class389 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static570.method7907(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(59) Exception local59) {
		}
	}
}
