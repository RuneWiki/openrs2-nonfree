import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_59 = new Class27(35, 11);

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "Lclient!s;")
	public static final Class217 aClass217_69 = new Class217(1, 10);

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "[Lclient!te;")
	public static final Class233[] aClass233Array1 = new Class233[6];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)Lclient!ub;")
	public static Class10_Sub1_Sub17 method2630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class10_Sub1_Sub17 local15 = (Class10_Sub1_Sub17) Static3.aClass167_20.method3709((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class10_Sub1_Sub17(arg0, arg1);
			Static3.aClass167_20.method3705(local15, local15.aLong264);
		}
		return local15;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIIII)V")
	public static void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static167.anInt3304; local7++) {
			@Pc(13) Rectangle local13 = Class10_Sub1_Sub7.aRectangleArray4[local7];
			if (local13.width + local13.x > arg2 && arg2 + arg0 > local13.x && local13.y + local13.height > arg1 && local13.y < arg1 + arg3) {
				Static373.aBooleanArray19[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZZ)V")
	public static void method2633(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static327.anInt4704++;
			Static273.method3840();
		}
		if (arg0) {
			Static136.anInt2818++;
			Static35.method478();
		}
	}
}
