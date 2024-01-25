import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vga", name = "H", descriptor = "I")
	public static int anInt10217;

	@OriginalMember(owner = "client!vga", name = "v", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_144 = new Class71(71, 4);

	@OriginalMember(owner = "client!vga", name = "K", descriptor = "Z")
	public static boolean aBoolean732 = false;

	@OriginalMember(owner = "client!vga", name = "O", descriptor = "Z")
	public static boolean aBoolean733 = false;

	@OriginalMember(owner = "client!vga", name = "P", descriptor = "I")
	public static int anInt10218 = -1;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)I")
	public static int method8249(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)V")
	public static void method8250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static580.aClass16_10 == null) {
			return;
		}
		@Pc(10) int local10 = Static362.anInt6930;
		@Pc(12) int local12 = Static121.anInt3161;
		Static221.method4151(arg1, arg0);
		if (Static105.anInt2774 == 0) {
			Static271.anInterface11_1 = null;
			Static271.anInterface11_1 = Static580.aClass16_10.method6125(Static580.aClass16_10.method6127(Static100.anInt2662, Static494.anInt8752), Static580.aClass16_10.method6064(Static100.anInt2662, Static494.anInt8752));
		} else if (Static105.anInt2774 == 1 && (Static596.anInterface11Array1 == null || local10 != Static362.anInt6930 || Static121.anInt3161 != local12)) {
			Static596.anInterface11Array1 = new Interface11[Static362.anInt6930 * Static121.anInt3161];
			for (@Pc(45) int local45 = 0; local45 < Static596.anInterface11Array1.length; local45++) {
				Static596.anInterface11Array1[local45] = Static580.aClass16_10.method6125(Static580.aClass16_10.method6127(Static266.anInt5676, Static332.anInt6574), Static580.aClass16_10.method6064(Static266.anInt5676, Static332.anInt6574));
			}
			Static86.anIntArray105 = new int[Static121.anInt3161 * Static362.anInt6930];
			Static480.anInt8593 = 1;
		}
		Static147.aBoolean271 = true;
	}
}
