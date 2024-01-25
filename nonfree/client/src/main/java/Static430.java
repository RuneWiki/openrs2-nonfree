import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "[I")
	public static final int[] anIntArray542 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
	public static int anInt7679 = 1;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_96 = new Class316(39, 3);

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "[Lclient!ct;")
	public static final Class63[] aClass63Array2 = new Class63[14];

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)Lclient!laa;")
	public static Class179 method6117(@OriginalArg(1) int arg0) {
		@Pc(8) Class179[] local8 = Static522.method7149();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt5217) {
				return local8[local10];
			}
		}
		return null;
	}
}
