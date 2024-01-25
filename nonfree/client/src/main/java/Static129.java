import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_34 = new Class303(56, 3);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZII)V")
	public static void method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static488.anInt7959; local7++) {
			@Pc(13) Rectangle local13 = Class72_Sub6.aRectangleArray1[local7];
			if (arg0 < local13.x + local13.width && local13.x < arg3 + arg0 && local13.height + local13.y > arg1 && local13.y < arg1 + arg2) {
				Static93.aBooleanArray4[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)Z")
	public static boolean method2609() {
		@Pc(10) Class3_Sub21 local10 = (Class3_Sub21) Static307.aClass112_33.method3088();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt3426; local16++) {
			if (local10.aClass39Array2[local16] != null && local10.aClass39Array2[local16].anInt894 == 0) {
				return false;
			}
			if (local10.aClass39Array1[local16] != null && local10.aClass39Array1[local16].anInt894 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)Lclient!kba;")
	public static Class173 method2610() {
		return Static517.method6939();
	}
}
