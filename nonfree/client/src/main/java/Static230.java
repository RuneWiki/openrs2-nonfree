import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
	public static int anInt4394;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Lclient!mj;")
	public static Class62_Sub4 method4018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass62_Sub4_2;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB[IJ)Ljava/lang/String;")
	public static String method4019(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static235.anInterface2_1 != null) {
			@Pc(12) String local12 = Static235.anInterface2_1.method697(arg1, arg0, arg2);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg2);
	}
}
