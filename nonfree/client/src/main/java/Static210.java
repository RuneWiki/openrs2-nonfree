import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ni", name = "Kb", descriptor = "I")
	public static int anInt4316;

	@OriginalMember(owner = "client!ni", name = "Mb", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!ni", name = "Lb", descriptor = "[I")
	public static final int[] anIntArray348 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!ir;Lclient!ir;)I")
	public static int method3678(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(13) int local13 = 0;
		if (arg0.method2289(Static205.anInt65)) {
			local13++;
		}
		if (arg0.method2289(Static79.anInt5522)) {
			local13++;
		}
		if (arg0.method2289(Static344.anInt6697)) {
			local13++;
		}
		if (arg1.method2289(Static205.anInt65)) {
			local13++;
		}
		if (arg1.method2289(Static79.anInt5522)) {
			local13++;
		}
		if (arg1.method2289(Static344.anInt6697)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)I")
	public static int method3679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub43 local10 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray559.length > arg0) {
			return local10.anIntArray559[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!sj;I)I")
	public static int method3683(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1) {
		if (!Static47.method819(arg1).method1145(arg0) && arg1.anObjectArray12 == null) {
			return -1;
		} else if (arg1.anIntArray458 == null || arg0 >= arg1.anIntArray458.length) {
			return -1;
		} else {
			return arg1.anIntArray458[arg0];
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z[I[J)V")
	public static void method3684(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static90.method1435(arg1, arg0, 0, arg1.length - 1);
	}
}
