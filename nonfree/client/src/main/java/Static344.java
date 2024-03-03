import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "Lclient!je;")
	public static Class113 aClass113_9;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V", line = 142)
	public static void method6218() {
		@Pc(5) Class98 local5 = Class72.aClass98_10;
		synchronized (Class72.aClass98_10) {
			Class72.aClass98_10.method2616();
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IB)V", line = 232)
	public static void method6221(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2_Sub7 local16 = Static293.method5414(12, arg0);
		local16.method2314();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 277)
	public static void method6222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Class109.anInt2803; local3++) {
			@Pc(9) Rectangle local9 = Class55.aRectangleArray1[local3];
			if (local9.x + local9.width > arg1 && local9.x < arg0 + arg1 && arg3 < local9.y + local9.height && local9.y < arg2 + arg3) {
				Class2_Sub3_Sub10_Sub1.aBooleanArray59[local3] = true;
			}
		}
	}
}
