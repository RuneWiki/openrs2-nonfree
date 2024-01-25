import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Lclient!rb;")
	public static Class314 aClass314_1;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "I")
	public static int anInt938 = -1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I")
	public static int method735(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(41) int local41 = local28 | local28 >>> 16;
		return local41 + 1;
	}
}
