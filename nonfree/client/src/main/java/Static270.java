import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "Lclient!fc;")
	public static Class79 aClass79_8;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray65 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
	public static int method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static113.anIntArrayArray30 == null ? 0 : Static113.anIntArrayArray30[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lclient!bm;")
	public static Class28 method4147(@OriginalArg(0) int arg0) {
		@Pc(8) Class28[] local8 = Static2.method9();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class28 local16 = local8[local10];
			if (arg0 == local16.anInt642) {
				return local16;
			}
		}
		return null;
	}
}
