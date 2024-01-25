import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
	public static int anInt10138;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_9 = new Class275(8, 1);

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
	public static int anInt10135 = -1;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(B)V")
	public static void method8324() {
		if (Static581.anInt9720 == 3) {
			Static182.method3694(4);
		} else if (Static581.anInt9720 == 7) {
			Static182.method3694(8);
		} else if (Static581.anInt9720 == 10) {
			Static182.method3694(11);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIBII)V")
	public static void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(99) Class106 local99 = Static170.aClass106ArrayArrayArray1[arg3][arg0][arg2];
			if (local99 != null) {
				if (arg1 == 1) {
					local99.aShort34 = 0;
				} else if (arg1 == 2) {
					local99.aShort37 = 0;
				}
			}
			Static106.method2586();
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static92.anInt2488; local18++) {
			@Pc(24) Class92 local24 = Static270.aClass92Array6[local18];
			if (arg1 == local24.aByte38 && local24.aShort27 == arg0 && local24.aShort30 == arg2 || arg0 == local24.aShort28 && local24.aShort30 == arg2) {
				if (local18 != Static92.anInt2488) {
					Static655.method6407(Static270.aClass92Array6, local18 + 1, Static270.aClass92Array6, local18, Static270.aClass92Array6.length - local18 - 1);
				}
				Static92.anInt2488--;
				return;
			}
		}
	}
}
