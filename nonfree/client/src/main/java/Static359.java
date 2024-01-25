import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!bda;")
	public static Class28 aClass28_2;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	public static int anInt3111;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
	public static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_45 = new Class154(68, 16);

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public static int anInt3109 = 0;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Z")
	public static boolean aBoolean229 = true;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_17 = new Class70();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static292.anInt4935; local3++) {
			@Pc(9) Rectangle local9 = Class198.aRectangleArray2[local3];
			if (arg1 < local9.width + local9.x && local9.x < arg2 + arg1 && arg3 < local9.height + local9.y && arg0 + arg3 > local9.y) {
				Static255.aBooleanArray17[local3] = true;
			}
		}
	}
}
