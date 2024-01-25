import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "Lclient!kr;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "J")
	public static long aLong228;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "Lclient!io;")
	public static final Class147 aClass147_8 = new Class147();

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "[I")
	public static final int[] anIntArray649 = new int[1000];

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "[I")
	public static final int[] anIntArray650 = new int[14];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)Z")
	public static boolean method7204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static190.method3667(arg1, arg0) || Static203.method3818(arg1, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(IIIII)V")
	public static void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static24.anInt388; local3++) {
			@Pc(9) Rectangle local9 = Class101.aRectangleArray1[local3];
			if (arg1 < local9.x + local9.width && arg3 + arg1 > local9.x && arg0 < local9.height + local9.y && arg0 + arg2 > local9.y) {
				Static154.aBooleanArray31[local3] = true;
			}
		}
	}
}
