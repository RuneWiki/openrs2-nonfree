import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_71 = new Class119("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
	public static final int[] anIntArray157 = new int[256];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
	public static int method2012(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
	public static void method2013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		if (Static333.anInt5693 == 2) {
			Static106.anInt2033 = local3;
			Static340.anInt5790 = local11;
			Static73.anInt1361 = 0;
		}
		Static98.aFloat20 = local3;
		Static262.aFloat62 = local11;
		Static415.method5402();
		Static297.aBoolean669 = true;
	}
}
