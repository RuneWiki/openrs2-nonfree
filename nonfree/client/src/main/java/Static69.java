import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)[B")
	public static byte[] method1053(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local6];
		Static464.method1964(arg0, 0, local17, 0, local6);
		return local17;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
	public static void method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class159 local13 = Static411.aClass159ArrayArray1[arg2][arg0];
		Static166.method2338(arg1, local13 == null ? Static61.aClass159_1 : local13);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!dk;B)Lclient!kt;")
	public static Class141 method1057(@OriginalArg(0) int arg0, @OriginalArg(2) Class54 arg1) {
		@Pc(9) byte[] local9 = arg1.method1126(arg0, 0);
		return local9 == null ? null : new Class141(local9);
	}
}
