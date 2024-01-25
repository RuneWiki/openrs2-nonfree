import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIBI)V")
	public static void method6738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static259.anInt5574; local3++) {
			@Pc(9) Rectangle local9 = Class8_Sub5_Sub1_Sub2.aRectangleArray2[local3];
			if (local9.width + local9.x > arg3 && local9.x < arg3 + arg0 && local9.height + local9.y > arg1 && arg2 + arg1 > local9.y) {
				Static10.aBooleanArray1[local3] = true;
			}
		}
		Static460.method6945(arg1, arg1 + arg2, arg3, arg0 + arg3);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII)Z")
	public static boolean method6739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	public static void method6740() {
		if (Static152.anApplet1 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static152.anApplet1.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static342.method5463() / 86400000L) - 11745;
			@Pc(34) String local34 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static646.method1436(Static152.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(48) Throwable local48) {
		}
	}
}
