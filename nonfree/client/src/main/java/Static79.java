import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "Lclient!or;")
	public static Class183 aClass183_2;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_41 = new Class211(94, 6);

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
	public static int anInt1500 = -1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIZIZ)Lclient!dk;")
	public static Class54 method1165(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class217 local5 = null;
		if (Static14.aClass110_1 != null) {
			local5 = new Class217(arg0, Static14.aClass110_1, Static417.aClass110Array1[arg0], 1000000);
		}
		Static87.aClass14_Sub1Array5[arg0] = Static325.aClass168_1.method3636(local5, arg0, Static283.aClass217_4);
		if (arg1) {
			Static87.aClass14_Sub1Array5[arg0].method2733();
		}
		return new Class54(Static87.aClass14_Sub1Array5[arg0], arg2, 1);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZIIII)V")
	public static void method1167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static398.anInt6535; local12++) {
			@Pc(18) Rectangle local18 = Class2_Sub15.aRectangleArray1[local12];
			if (arg1 < local18.width + local18.x && arg1 + arg0 > local18.x && arg3 < local18.y + local18.height && local18.y < arg2 + arg3) {
				Static442.aBooleanArray27[local12] = true;
			}
		}
	}
}
