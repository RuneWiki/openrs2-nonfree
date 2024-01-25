import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public static void method14(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static122.anInt2287 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lclient!mk;")
	public static Class67_Sub2 method15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass67_Sub2_1;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
	public static void method16(@OriginalArg(1) int arg0) {
		@Pc(14) Class11_Sub4_Sub12 local14 = Static35.method512(8, arg0);
		local14.method3864();
	}
}
