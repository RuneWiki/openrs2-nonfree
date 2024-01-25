import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public static final int anInt4286 = 1338;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)V")
	public static void method3494(@OriginalArg(1) int arg0) {
		Static372.anInt1537 = arg0;
		Static336.anInt6190 = -1;
		Static336.anInt6190 = -1;
		Static220.method3501();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
	public static void method3495(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(3, arg0);
		local13.method1563();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)Lclient!um;")
	public static Class238 method3496(@OriginalArg(0) int arg0) {
		@Pc(16) Class238[] local16 = Static413.method3223();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class238 local24 = local16[local18];
			if (arg0 == local24.anInt7060) {
				return local24;
			}
		}
		return null;
	}
}
