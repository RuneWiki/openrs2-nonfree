import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!nc", name = "mb", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3178(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)J")
	public static long method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass133_1 == null ? 0L : local7.aClass133_1.aLong160;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
	public static void method3181() {
		Static262.aClass155_42.method4354();
	}
}
