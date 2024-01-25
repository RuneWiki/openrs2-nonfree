import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!ef;")
	public static Class102 aClass102_64;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!ika;")
	public static Class176 aClass176_8;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_63 = new Class102();

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_36 = new Class291(16);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Z")
	public static boolean aBoolean706 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)V")
	public static void method7892(@OriginalArg(1) int arg0) {
		Static52.anInt835 = arg0;
		@Pc(18) Class391 local18 = Static32.aClass391_5;
		synchronized (Static32.aClass391_5) {
			Static32.aClass391_5.method9276(0);
		}
		local18 = Static320.aClass391_27;
		synchronized (Static320.aClass391_27) {
			Static320.aClass391_27.method9276(0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIBI)V")
	public static void method7894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static449.anInt7746; local7++) {
			@Pc(13) Rectangle local13 = Class13_Sub11.aRectangleArray2[local7];
			if (local13.x + local13.width > arg0 && arg3 + arg0 > local13.x && arg2 < local13.height + local13.y && local13.y < arg1 + arg2) {
				Static386.aBooleanArray13[local7] = true;
			}
		}
		Static82.method9318(arg1 + arg2, arg2, arg3 + arg0, arg0);
	}
}
