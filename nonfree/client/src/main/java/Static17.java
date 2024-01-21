import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bi", name = "bb", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_133 = Static120.method1824("Use");

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "Lclient!rd;")
	public static Class80 aClass80_131 = aClass80_133;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
	public static int anInt440 = 100;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
	public static int anInt442 = 0;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_132 = Static120.method1824("hint_mapmarkers");

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
	public static final int anInt448 = 2301979;

	@OriginalMember(owner = "client!bi", name = "Z", descriptor = "[I")
	public static final int[] anIntArray63 = new int[50];

	@OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_134 = Static120.method1824("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)I")
	public static int method310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub7 local12 = (Class3_Sub7) Static6.aClass54_2.method1496((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < local12.anIntArray102.length; local34++) {
				if (arg0 == local12.anIntArray103[local34]) {
					local32 += local12.anIntArray102[local34];
				}
			}
			return local32;
		}
	}
}
