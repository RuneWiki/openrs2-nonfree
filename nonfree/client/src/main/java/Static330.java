import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!kr;")
	public static Class1_Sub23 aClass1_Sub23_2;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_104 = new Class319(26, 8);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V")
	public static void method4975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static288.anInt5333; local7++) {
			@Pc(18) Rectangle local18 = Class220.aRectangleArray1[local7];
			if (arg2 < local18.x + local18.width && local18.x < arg1 + arg2 && local18.height + local18.y > arg0 && arg3 + arg0 > local18.y) {
				Static551.aBooleanArray28[local7] = true;
			}
		}
	}
}
