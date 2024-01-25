import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!gv", name = "C", descriptor = "Lclient!hh;")
	public static Class6 aClass6_13;

	@OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
	public static int anInt3685;

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
	public static int anInt3677 = -1;

	@OriginalMember(owner = "client!gv", name = "A", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
	public static int anInt3684 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIILclient!lf;[I[I)Lclient!aca;")
	public static Class1_Sub1 method3144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg4[local12] + arg0 * local12;
			for (@Pc(24) int local24 = 0; local24 < arg3[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class1_Sub1(arg2, arg0, arg1, local10);
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(IIB)Lclient!ofa;")
	public static Class265 method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class265 local12 = Static223.method3278(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass265Array4 == null || arg1 >= local12.aClass265Array4.length) {
			return null;
		} else {
			return local12.aClass265Array4[arg1];
		}
	}
}
