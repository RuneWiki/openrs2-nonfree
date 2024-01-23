import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "[Lclient!vn;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public static int anInt332;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "[S")
	public static short[] aShortArray2 = new short[256];

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public static int anInt334 = 1;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public static int anInt336 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V")
	public static void method292() {
		Static108.aClass46_16.method1068(5);
		Static279.aClass46_40.method1068(5);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I")
	public static int method294(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local25 * arg0 >> 12) + 40960;
		return local19 * local33 >> 12;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lclient!eh;")
	public static Class50 method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class50 local14 = local7.aClass50_1;
			local7.aClass50_1 = null;
			return local14;
		}
	}
}
