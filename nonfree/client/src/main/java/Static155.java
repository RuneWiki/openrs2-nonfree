import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ffa", name = "Z", descriptor = "Lclient!nja;")
	public static Class252 aClass252_3;

	@OriginalMember(owner = "client!ffa", name = "gb", descriptor = "[I")
	public static final int[] anIntArray206 = new int[50];

	@OriginalMember(owner = "client!ffa", name = "mb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray13 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(III)V")
	public static void method2704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static340.aClass33_9 == null) {
			return;
		}
		@Pc(10) int local10 = Static217.anInt3516;
		@Pc(12) int local12 = Static257.anInt4179;
		Static81.method1714(arg1, arg0);
		if (Static106.anInt2134 == 0) {
			Static417.anInterface18_1 = null;
			Static417.anInterface18_1 = Static340.aClass33_9.method8119(Static340.aClass33_9.method8084(Static235.anInt5516, Static118.anInt2257), Static340.aClass33_9.method8113(Static235.anInt5516, Static118.anInt2257));
		} else if (Static106.anInt2134 == 1 && (Static151.anInterface18Array1 == null || Static217.anInt3516 != local10 || Static257.anInt4179 != local12)) {
			Static151.anInterface18Array1 = new Interface18[Static217.anInt3516 * Static257.anInt4179];
			for (@Pc(43) int local43 = 0; local43 < Static151.anInterface18Array1.length; local43++) {
				Static151.anInterface18Array1[local43] = Static340.aClass33_9.method8119(Static340.aClass33_9.method8084(Static614.anInt9423, Static567.anInt8756), Static340.aClass33_9.method8113(Static614.anInt9423, Static567.anInt8756));
			}
			Static604.anInt9294 = 1;
			Static131.anIntArray159 = new int[Static257.anInt4179 * Static217.anInt3516];
		}
		Static42.aBoolean73 = true;
	}
}
