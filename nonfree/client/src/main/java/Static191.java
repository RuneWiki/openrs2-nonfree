import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_100 = new Class12(68, 6);

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!d;")
	public static final Class48 aClass48_4 = new Class48("runescape", 0);

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static int anInt3304 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method2740(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
