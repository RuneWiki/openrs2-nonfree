import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array22;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_17 = new Class119(15, 0, 1, 0);

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "S")
	public static short aShort198 = 205;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIII)V")
	public static void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static54.anInt1292; local1++) {
			@Pc(6) Rectangle local6 = Class7_Sub1.aRectangleArray4[local1];
			if (local6.width + local6.x > arg2 && local6.x < arg2 + arg3 && arg1 < local6.y + local6.height && local6.y < arg1 + arg0) {
				Static308.aBooleanArray18[local1] = true;
			}
		}
	}
}
