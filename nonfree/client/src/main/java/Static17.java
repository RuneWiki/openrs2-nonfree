import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!fm;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_17 = new Class107(106, 3);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
	public static void method465() {
		Static308.aClass134_41.method3272();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIII)V")
	public static void method466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static121.anInt2467; local1++) {
			@Pc(6) Rectangle local6 = Class102.aRectangleArray1[local1];
			if (local6.x + local6.width > arg2 && local6.x < arg2 + arg1 && arg0 < local6.y + local6.height && arg0 + arg3 > local6.y) {
				Static71.aBooleanArray25[local1] = true;
			}
		}
	}
}
