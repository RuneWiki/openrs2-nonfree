import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!ji;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_67 = new Class181(26, 2);

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)I")
	public static int method6912(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!ha;I[[[BIIIIIIII)V")
	public static void method6913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg10 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg3 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		arg2.Q(arg9, arg6, arg7, arg8, arg11, arg1, arg4[arg3 - 1][arg5], arg10, arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!wd;I)I")
	public static int method6914(@OriginalArg(0) Class5_Sub12_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method8670(2);
		@Pc(22) int local22;
		if (local15 == 0) {
			local22 = 0;
		} else if (local15 == 1) {
			local22 = arg0.method8670(5);
		} else if (local15 == 2) {
			local22 = arg0.method8670(8);
		} else {
			local22 = arg0.method8670(11);
		}
		return local22;
	}
}
