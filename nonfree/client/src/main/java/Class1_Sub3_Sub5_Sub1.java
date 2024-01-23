import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub3_Sub5_Sub1 extends Class1_Sub3_Sub5 {

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray16 = new byte[256][];

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub5_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub3_Sub5_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray16 = arg5;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static231.anInt4851;
		@Pc(9) int local9 = Static231.anInt4851 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static231.anInt4852) {
			local20 = Static231.anInt4852 - arg2;
			arg4 -= local20;
			arg2 = Static231.anInt4852;
			local13 = local20 * arg3;
			local5 += local20 * Static231.anInt4851;
		}
		if (arg2 + arg4 > Static231.anInt4853) {
			arg4 -= arg2 + arg4 - Static231.anInt4853;
		}
		if (arg1 < Static231.anInt4849) {
			local20 = Static231.anInt4849 - arg1;
			arg3 -= local20;
			arg1 = Static231.anInt4849;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static231.anInt4848) {
			local20 = arg1 + arg3 - Static231.anInt4848;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static322.method3346(Static231.anIntArray448, this.aByteArrayArray16[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method3509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static231.anInt4851;
		@Pc(9) int local9 = Static231.anInt4851 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static231.anInt4852) {
			local20 = Static231.anInt4852 - arg2;
			arg4 -= local20;
			arg2 = Static231.anInt4852;
			local13 = local20 * arg3;
			local5 += local20 * Static231.anInt4851;
		}
		if (arg2 + arg4 > Static231.anInt4853) {
			arg4 -= arg2 + arg4 - Static231.anInt4853;
		}
		if (arg1 < Static231.anInt4849) {
			local20 = Static231.anInt4849 - arg1;
			arg3 -= local20;
			arg1 = Static231.anInt4849;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static231.anInt4848) {
			local20 = arg1 + arg3 - Static231.anInt4848;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static231.anIntArray449 == null) {
			Static322.method3347(Static231.anIntArray448, this.aByteArrayArray16[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static322.method3348(Static231.anIntArray448, this.aByteArrayArray16[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static231.anIntArray449, Static231.anIntArray447);
		}
	}
}
