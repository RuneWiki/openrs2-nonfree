import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class2_Sub8_Sub5_Sub1 extends Class2_Sub8_Sub5 {

	@OriginalMember(owner = "client!dj", name = "R", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub8_Sub5_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray5 = arg5;
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B)V")
	public Class2_Sub8_Sub5_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static77.anInt1897;
		@Pc(9) int local9 = Static77.anInt1897 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static77.anInt1898) {
			local20 = Static77.anInt1898 - arg2;
			arg4 -= local20;
			arg2 = Static77.anInt1898;
			local13 = local20 * arg3;
			local5 += local20 * Static77.anInt1897;
		}
		if (arg2 + arg4 > Static77.anInt1893) {
			arg4 -= arg2 + arg4 - Static77.anInt1893;
		}
		if (arg1 < Static77.anInt1894) {
			local20 = Static77.anInt1894 - arg1;
			arg3 -= local20;
			arg1 = Static77.anInt1894;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static77.anInt1896) {
			local20 = arg1 + arg3 - Static77.anInt1896;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static77.anIntArray162 == null) {
			Static317.method1067(Static77.anIntArray163, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static317.method1066(Static77.anIntArray163, this.aByteArrayArray5[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static77.anIntArray162, Static77.anIntArray161);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static77.anInt1897;
		@Pc(9) int local9 = Static77.anInt1897 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static77.anInt1898) {
			local20 = Static77.anInt1898 - arg2;
			arg4 -= local20;
			arg2 = Static77.anInt1898;
			local13 = local20 * arg3;
			local5 += local20 * Static77.anInt1897;
		}
		if (arg2 + arg4 > Static77.anInt1893) {
			arg4 -= arg2 + arg4 - Static77.anInt1893;
		}
		if (arg1 < Static77.anInt1894) {
			local20 = Static77.anInt1894 - arg1;
			arg3 -= local20;
			arg1 = Static77.anInt1894;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static77.anInt1896) {
			local20 = arg1 + arg3 - Static77.anInt1896;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static317.method1068(Static77.anIntArray163, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
