import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "Lclient!al;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "S")
	public static short aShort80 = 256;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	public static final int anInt5991 = 1405;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "[I")
	public static final int[] anIntArray462 = new int[6];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static146.method2839(arg1)) {
			Static46.method886(Static264.aClass68ArrayArray1[arg1], -1, arg7, arg6, arg3, arg4, arg0, arg8, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)Lclient!no;")
	public static Class141 method5064(@OriginalArg(1) int arg0) {
		@Pc(10) Class107 local10 = Static135.aClass107_12;
		@Pc(19) Class141 local19;
		synchronized (Static135.aClass107_12) {
			local19 = (Class141) Static135.aClass107_12.method3021((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static48.aClass104_105.method2756(Static127.method2505(arg0), Static351.method5659(arg0));
		local19 = new Class141();
		if (local39 != null) {
			local19.method4159(new Class2_Sub12(local39));
		}
		@Pc(54) Class107 local54 = Static135.aClass107_12;
		synchronized (Static135.aClass107_12) {
			Static135.aClass107_12.method3018((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(BI)V")
	public static void method5065() {
		@Pc(5) Class107 local5 = Static338.aClass107_55;
		synchronized (Static338.aClass107_55) {
			Static338.aClass107_55.method3011(5);
		}
	}
}
