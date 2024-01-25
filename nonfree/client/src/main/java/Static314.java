import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "Lclient!lga;")
	public static Class223 aClass223_70;

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
	public static int anInt5449;

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
	public static int anInt5451;

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
	public static int anInt5452;

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "J")
	public static final long aLong180 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)I")
	public static int method4970(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
