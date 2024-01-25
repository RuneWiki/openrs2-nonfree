import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public static int anInt3116 = 0;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public static int anInt3117 = -60;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
	public static int method2622(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method2623(@OriginalArg(0) int arg0) {
		@Pc(17) Class6_Sub39 local17 = (Class6_Sub39) Static475.aClass380_36.method8747((long) arg0);
		if (local17 != null) {
			@Pc(24) Class6_Sub13_Sub4 local24 = local17.aClass62_Sub1_1.method2417();
			if (local24 != null) {
				@Pc(31) double local31 = local17.aClass62_Sub1_1.method2405();
				if ((double) local24.method8562() <= local31 && local31 <= (double) local24.method8560()) {
					return local24.method8554();
				}
			}
		}
		return null;
	}
}
